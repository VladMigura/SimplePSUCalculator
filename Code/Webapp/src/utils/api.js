import axios from 'axios';

const  API=axios.create({
  baseURL: process.env.API_URL || 'https://psucalculator-api.herokuapp.com',
  headers: {
    'Content-Type': 'application/json',
    'Access-Control-Allow-Origin': '*',
  }
})


export default API;
