import { useState } from "react";

function UserInputAddition() {
  const [num1, setNum1] = useState();
  const [num2, setnum2] = useState();
  const [result, setResult] = useState();

    function Addition() {
      setResult(Number(num1) + Number(num2));
    }

  // another way of writing the Addition() function

  // const Addition = () => {
  //   setResult(Number(num1) + Number(num2));
  // };

  return (
    <>
      <br />
      <input
        type="number"
        value={num1}
        onChange={(e) => setNum1(e.target.value)}
        placeholder="Enter 1st number"
      />
      +
      <input
        type="number"
        value={num2}
        onChange={(e) => setnum2(e.target.value)}
        placeholder="Enter 2nd number"
      />
      <button onClick={Addition}>Addition</button>
      <h3>{"Result:" + result}</h3>
    </>
  );
}

export default UserInputAddition;
