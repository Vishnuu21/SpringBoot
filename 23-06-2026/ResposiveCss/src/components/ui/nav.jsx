// function NavBar() {
//   return (
//     <div className="flex justify-between items-center px-6 py-4">

//       <div className="text-lg font-semibold text-gray-300">SkyExplorer</div>

//       <div className="flex gap-8 text-gray-300">
//         <div>Features</div>
//         <div>Method</div>
//         <div>Pricing</div>
//         <div>Changelog</div>
//       </div>

//       <button className="bg-black text-white px-6 rounded-md hover:bg-gray-300 hover:text-black">
//         Log in
//       </button>

//     </div>
//   );
// }


function NavBar() {
  return (
    <div className="flex justify-between items-center px-6 py-4 
                    bg-white/10 backdrop-blur-md border-b border-white/20">

      <div className="text-xl font-semibold text-white">
        SkyExplorer ✈︎
      </div>

      <div className="hidden md:flex gap-8 text-gray-200">
        <div className="hover:text-white cursor-pointer">Features</div>
        <div className="hover:text-white cursor-pointer">Method</div>
        <div className="hover:text-white cursor-pointer">Pricing</div>
        <div className="hover:text-white cursor-pointer">Changelog</div>
      </div>

      <button className="bg-white/20 backdrop-blur-md text-white px-5 py-2 rounded-lg 
                         hover:bg-white hover:text-black transition">
        Log in
      </button>
    </div>
  );
}

export default NavBar;