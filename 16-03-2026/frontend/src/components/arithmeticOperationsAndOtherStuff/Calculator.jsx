import { useState } from "react";

function Calculator() {
  const [num1, setNum1] = useState();
  const [num2, setNum2] = useState();
  const [result, setResult] = useState(0);

  function Addition() {
    setResult(Number(num1) + Number(num2));
  }

  function Subtraction() {
    setResult(Number(num1) - Number(num2));
  }

  function Multiplication() {
    setResult(Number(num1) * Number(num2));
  }

  function Division() {
    setResult(Number(num1) / Number(num2));
  }

  function Modulus() {
    setResult(Number(num1) % Number(num2));
  }

  return (
    <>
      <br />
      <input
        type="number"
        value={num1}
        onChange={(e) => setNum1(e.target.value)}
        placeholder="Enter 1st number"
      />

      <input
        type="number"
        value={num2}
        onChange={(e) => setNum2(e.target.value)}
        placeholder="Enter 2nd number"
      />
      <br />
      <button onClick={Addition}>+</button>
      <br />
      <button onClick={Subtraction}>-</button>
      <br />
      <button onClick={Multiplication}>*</button>
      <br />
      <button onClick={Division}>/</button>
      <br />
      <button onClick={Modulus}>%</button>
      <br />
      <h3>{"Result:" + result}</h3>
    </>
  );
}
export default Calculator;
