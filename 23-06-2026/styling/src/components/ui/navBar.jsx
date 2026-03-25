function NavBar() {
  return (
    <>
      <div className=" flex justify-between px-4 py-3 bg-pink-400">
        <div className="flex gap-3 pt-1">
          Logo <div>JCBM College</div>
        </div>
        <div className="flex gap-3 pt-1">
          Home
          <div>
            <a
              href="#about"
              className="hover:text-white transition duration-300"
            >
              About Us
            </a>
          </div>
          <div>Services</div>
          <div>Products</div>
          <div>Contact Us</div>
        </div>
        <div className="flex gap-3">
          <button
            className=" bg-pink-500 border rounded-md px-3 py-1 text-black font-semibold
           hover:bg-blue-400 hover:text-white transition duration-300 hover:scale-115"
          >
            SignUp
          </button>
          <div>
            <button
              className=" bg-pink-500 border rounded-md px-3 py-1 text-black font-semibold
           hover:bg-blue-400 hover:text-white transition duration-300 hover:scale-115 "
            >
              Login
            </button>
          </div>
        </div>
      </div>
    </>
  );
}

export default NavBar;
