// function SearchBox() {
//   return (
//     <div className="flex justify-center mt-10">
//       <div className="flex rounded-xl">
//         <div className="pr-1">
//           <input
//             type="text"
//             placeholder="From"
//             className="px-4 py-3 rounded-md  bg-gray-300"
//           />
//         </div>

//         <div className="pr-1">
//           <input
//             type="text"
//             placeholder="To"
//             className="px-4 py-3 rounded-md  bg-gray-300 "
//           />
//         </div>

//         <button className="bg-black text-white px-6 rounded-md hover:bg-gray-300 hover:text-black">Search</button>
//       </div>
//     </div>
//   );
// }


function SearchBox() {
  return (
    <div className="w-full max-w-3xl mt-10 pb-50">

      <div className="flex flex-col md:flex-row gap-3 p-4 
                      bg-white/10 backdrop-blur-lg rounded-2xl 
                      border border-white/20 shadow-xl">

        <input
          type="text"
          placeholder="From"
          className="flex-1 px-4 py-3 rounded-lg bg-white/20 text-white 
                     placeholder-gray-300 outline-none"
        />

        <input
          type="text"
          placeholder="To"
          className="flex-1 px-4 py-3 rounded-lg bg-white/20 text-white 
                     placeholder-gray-300 outline-none"
        />

        <button className="bg-white text-black px-6 py-3 rounded-lg 
                           hover:bg-gray-200 transition font-semibold">
          Search
        </button>

      </div>
    </div>
  );
}

export default SearchBox;
/*<div className="pt-5 pr-3">
        <input type="text" placeholder="To" className="border rounded-md"/>
      </div> */
