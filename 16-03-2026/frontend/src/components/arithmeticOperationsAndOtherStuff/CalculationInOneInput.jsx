import { evaluate } from "mathjs";
import { useState } from "react";


function CalculationInOneField() {
  const [expression, setExpression] = useState("");
  const [result, setResult] = useState("");

  const calculate = () => {
    try {
      setResult(evaluate(expression));
    } catch {
      setResult("Invalid Expression");
    }
  };
  return (
    <>
    <br />
      <input
        type="text"
        value={expression}
        onChange={(e) => setExpression(e.target.value)}
      />

      <button onClick={calculate}>Submit</button>

      <h3>{result}</h3>
    </>
  );
}

export default CalculationInOneField;
