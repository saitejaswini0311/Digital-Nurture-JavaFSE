import React, { useState } from "react";

function App() {

  const [count, setCount] = useState(5);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("Euro");

  const increment = () => {
    setCount(count + 1);
    alert("Hello! Member");
  };

  const decrement = () => {
    setCount(count - 1);
  };

  const sayWelcome = (msg) => {
    alert(msg);
  };

  const onPress = () => {
    alert("I was clicked");
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    const euro = amount * 80;

    alert("Converting to Euro Amount is " + euro);
  };

  return (
    <div style={{ margin: "20px" }}>

      <h3>{count}</h3>

      <button onClick={increment}>Increment</button>
      <br /><br />

      <button onClick={decrement}>Decrement</button>
      <br /><br />

      <button onClick={() => sayWelcome("welcome")}>
        Say welcome
      </button>

      <br /><br />

      <button onClick={onPress}>
        Click on me
      </button>

      <br /><br />

      <h1 style={{ color: "green" }}>
        Currency Convertor!!!
      </h1>

      <form onSubmit={handleSubmit}>

        Amount:
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />

        <br /><br />

        Currency:

        <select
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        >
          <option>Euro</option>
        </select>

        <br /><br />

        <button type="submit">
          Submit
        </button>

      </form>

    </div>
  );
}

export default App;