import React from 'react';
import { Link, Routes, Route } from 'react-router-dom';
import LoginComp from './components/LoginComp';
import AdminHome from './components/AdminHome';

function Home() {
  return <h2 className="bg-primary text-white">Welcome to Home</h2>;
}

function NotFound() {
  return <h2>404 - Page Not Found</h2>;
}

export default function App() {
  return (
    <div className="App">
      <nav className="navbar navbar-expand-sm bg-light mb-3">
        <div className="container-fluid">
          <ul className="navbar-nav">
            <li className="nav-item">
              <Link to="/" className="nav-link px-3">Home</Link>
            </li>
            <li className="nav-item">
              <Link to="/login" className="nav-link px-3">Login</Link>
            </li>
          </ul>
        </div>
      </nav>

      <Routes>
        <Route path="/" element={<Home />} />
        <Route path="/login" element={<LoginComp />} />
        <Route path="admin_home" element={<AdminHome />} />
      </Routes>
    </div>
  );
}
