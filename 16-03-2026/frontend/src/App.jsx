// import { useState } from 'react'
// import reactLogo from './assets/react.svg'
// import viteLogo from './assets/vite.svg'
// import heroImg from './assets/hero.png'
// import './App.css'

import Addition from "./components/arithmeticOperationsAndOtherStuff/Add";
import UserInputAddition from "./components/arithmeticOperationsAndOtherStuff/AdditionByGivinginputinBrowser";
import CalculationInOneField from "./components/arithmeticOperationsAndOtherStuff/CalculationInOneInput";
import Calculator from "./components/arithmeticOperationsAndOtherStuff/Calculator";
import AdditionOnParameter from "./components/arithmeticOperationsAndOtherStuff/ParameterAddition";
import Hello from "./components/Hello";
import Home from "./components/Home";

function App() {
  return (
    <div>
      <div>
        <Hello name={"Vishnu"} age={20} />
      </div>

    <div className=" h-full bg-amber-300 w-full flex justify-center items-center">hello</div>

      <div>
        <Addition />
      </div>

      <div>
        <AdditionOnParameter a={10} b={10} />
      </div>

      {/* <UserInputAddition /> */}

      {/*<Calculator /> */}
      <CalculationInOneField />
    </div>
  );
}

export default App;
