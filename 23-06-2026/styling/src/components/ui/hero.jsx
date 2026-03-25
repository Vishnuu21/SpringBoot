function Hero() {
  return (
    <>
      <section className=" flex w-full justify-center items-center h-72 text-amber-50 font-light ">
        <div className=" text-center">
          <div className=" text-4xl pb-1">Prosperity of Knowledge</div>
          <div className=" text-2xl pb-2">JCBM College</div>
          <button
            className=" bg-pink-500 border rounded-md px-10 py-1 text-black font-semibold
           hover:bg-blue-400 hover:text-white transition duration-300 hover:scale-115 active:scale-100"
          >
            Explore
          </button>
        </div>
      </section>
    </>
  );
}

export default Hero;
