import axios from "axios";
import { useEffect, useState } from "react";

function App() {
  const [data, setData] = useState();

  useEffect(() => {
    axios
      .get("http://localhost:8080/hello")
      .then((res) => {
        console.log(res.data);
        setData(res.data);
      })
      .catch((err) => console.log(err));
  }, []);

  return (
    <div>
      <h1>{data?.message}</h1>
      <p>{data?.description}</p>
    </div>
  );
}

export default App;
