import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import LoginForm from './pages/Login';
import Home from './pages/Home';
import Register from './pages/Registration';
import UserList from './pages/Test';


const App = () => {
    return (
        <BrowserRouter>
            <Routes>
                <Route path="/" element={<LoginForm />} /> 
                <Route path="/home" element={<Home />} /> 
                <Route path="/register" element={<Register/>}/>
                <Route path="/getAllUsers" element={<UserList/>}/>
            </Routes>
        </BrowserRouter>
    );
};

export default App;
