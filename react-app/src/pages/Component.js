import React from 'react';
import { useNavigate } from 'react-router-dom';

const MyComponent = () => {
    const navigate = useNavigate(); 

    const handleNavigation = () => {
        navigate('/'); 
    };

    return (
        <div>
            <button onClick={handleNavigation}>Go to Home</button>
        </div>
    );
};

export default MyComponent;