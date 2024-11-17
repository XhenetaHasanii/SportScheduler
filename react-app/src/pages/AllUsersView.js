import React, { useState } from 'react';
import axios from 'axios';

const UserList = () => {
    const [users, setUsers] = useState([]);

    const fetchUsers = async () => {
        try {
            
            const token = localStorage.getItem('AuthToken');
            console.log("Token:", token);

           
            const response = await axios.get('http://localhost:8080/api/auth/getAllUsers', {
                headers: {
                    'Authorization': `Bearer ${token}` ,// Include the token
                    'Content-Type':'application/json',
                },withCredentials: true,
            });

            setUsers(response.data); 
        } catch (error) {
            console.error('Error fetching users:', error);
            alert('You are not authorized or an error occurred.');
        }
    };

    return (
        <div>
            <h1>User List</h1>
            <button onClick={fetchUsers}>Fetch Users</button>
            {users.length > 0 ? (
                <ul>
                    {users.map((user, index) => (
                        <li key={index}>{user.username}</li>
                    ))}
                </ul>
            ) : (
                <p>No users to display or request not made.</p>
            )}
        </div>
    );
};

export default UserList;


