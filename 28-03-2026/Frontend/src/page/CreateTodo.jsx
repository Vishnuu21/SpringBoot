import { useState } from "react";
import { useNavigate } from "react-router-dom";
import { createTodo } from "../services/todoService";

export default function CreateTodo() {
  const [title, setTitle] = useState("");
  const [description, setDescription] = useState("");

  const navigate = useNavigate();

  const handleSubmit = async (e) => {
    e.preventDefault();

  //   if (!title.trim() || !description.trim()) {
  //   alert("Title and Description are required!");
  //   return;
  // }

    try {
      await createTodo({ title, description });
      navigate("/");
    } catch (error) {
      console.log(error);
    }
  };

  return (
    <div>
      <h2>Create Todo Page</h2>

      <form onSubmit={handleSubmit}>
        <div>
          <label>Title:</label>
          <br />
          <input
            type="text"
            value={title}
            required
            onChange={(e) => setTitle(e.target.value)}
          />
        </div>

        <br />

        <div>
          <label>Description:</label>
          <br />
          <input
            type="text"
            value={description}
            required
            onChange={(e) => setDescription(e.target.value)}
          />
        </div>

        <br />

        <button className="btn" type="submit">Create</button>
      </form>
    </div>
  );
}
