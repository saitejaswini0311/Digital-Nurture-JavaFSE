
import React from "react";

function App() {

  const officeImage = "/office.jpg";

  const officeList = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai"
    },
    {
      Name: "TCS",
      Rent: 65000,
      Address: "Hyderabad"
    },
    {
      Name: "Infosys",
      Rent: 45000,
      Address: "Bangalore"
    }
  ];

  return (
    <div style={{ marginLeft: "100px" }}>

      <h1>Office Space, at Affordable Range</h1>

      <img
        src={officeImage}
        alt="Office Space"
        width="300"
        height="200"
      />

      {officeList.map((office, index) => (
        <div key={index}>

          <h2>Name: {office.Name}</h2>

          <h3
            style={{
              color: office.Rent <= 60000 ? "red" : "green"
            }}
          >
            Rent: Rs. {office.Rent}
          </h3>

          <h3>Address: {office.Address}</h3>

          <hr />

        </div>
      ))}

    </div>
  );
}

export default App;