SET SERVEROUTPUT ON;

DECLARE
    v_age NUMBER;
BEGIN
    FOR rec IN (
        SELECT c.CustomerID,
               c.DOB,
               l.LoanID
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB)/12);

        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE LoanID = rec.LoanID;

            DBMS_OUTPUT.PUT_LINE('Discount applied for Customer '
                                  || rec.CustomerID);
        END IF;
    END LOOP;

    COMMIT;
END;
/

ALTER TABLE Customers
ADD IsVIP CHAR(1);

SET SERVEROUTPUT ON;

BEGIN

    FOR rec IN (SELECT CustomerID, Balance FROM Customers)

    LOOP

        IF rec.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP='Y'
            WHERE CustomerID=rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE('Customer '
                                  ||rec.CustomerID||
                                  ' is VIP');

        END IF;

    END LOOP;

    COMMIT;

END;
/
SET SERVEROUTPUT ON;

BEGIN

    FOR rec IN

    (

        SELECT c.Name,
               l.EndDate

        FROM Customers c
        JOIN Loans l

        ON c.CustomerID=l.CustomerID

        WHERE EndDate BETWEEN SYSDATE AND SYSDATE+30

    )

    LOOP

        DBMS_OUTPUT.PUT_LINE(

        'Reminder to '

        ||rec.Name||

        ' Loan Due on '

        ||TO_CHAR(rec.EndDate,'DD-MON-YYYY')

        );

    END LOOP;

END;
/


