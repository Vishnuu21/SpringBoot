import { useState } from "react";
import "./App.css";
import axios from "axios";

function App() {
  const [num1, setNum1] = useState();
  const [num2, setNum2] = useState();
  const [result, setResult] = useState();

  const handleAdd = (e) => {
    e.preventDefault();

    axios
      .post("http://localhost:8080/add/result", {
        firstNumber: parseFloat(num1),
        secondnumber: parseFloat(num2),
      })
      .then((res) => {
        console.log(res.data);
        setResult(res.data.data.additionResult);
      })
      .catch((err) => console.log(err));
  };

  return (
    <div className="app-container">
      <h2>Addition App</h2>

      <input
        type="number"
        placeholder="Enter first number"
        value={num1}
        onChange={(e) => setNum1(e.target.value)}
      />

      <br />

      <input
        type="number"
        placeholder="Enter second number"
        value={num2}
        onChange={(e) => setNum2(e.target.value)}
      />

      <br />
      <br />
      <div className="action-container">
        <button onClick={handleAdd}>Add</button>

        {result !== undefined && (
          <div className="result-box">
            <h2>Result: {result}</h2>
          </div>
        )}
      </div>
    </div>
  );
}

export default App;
