import NavBar from "./components/ui/nav";
import Hero from "./components/ui/hero";
import SearchBox from "./components/ui/searchBox";

function App() {
  return (
    <div className="min-h-screen flex flex-col">
      <NavBar />
      <div className="flex flex-col items-center justify-center grow px-4">
        <Hero />
        <SearchBox />
      </div>
    </div>
  );
}

export default App;

// function App() {
//   return (
//     <div>
//       <NavBar />
//       <Hero />
//       <SearchBox />
//       {/* */}
//     </div>
//   );
// }
// export default App;
