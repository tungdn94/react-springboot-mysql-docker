import axios from 'axios';
import React from 'react';
import { useState, useEffect } from 'react';

export const Book = () => {
  const [isLoading, setIsLoading] = useState(true);
  const [data, setData] = useState([]);

  useEffect(() => {
    async function fetchData() {
      const response = await axios.get('http://localhost:8000/api/book/all');
      setData(response.data.bookResponses);
      setIsLoading(false);
    }
    fetchData();
  }, []);

  if (isLoading) {
    return <h2>Loading</h2>
  }

  return (
    <>
      <h2>Book List</h2>
      <ol>
        {data.map(bookData => <li key={bookData.title}>
          <strong>Book Name: </strong> {`${bookData.title}`} - <strong>Author: </strong> {`${bookData.author}`}
        </li>)}
      </ol>
    </>
  )
}
