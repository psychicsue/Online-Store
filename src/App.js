import React, { Component } from 'react';

import {
    BrowserRouter as Router,
    Route,
    Link
} from 'react-router-dom';
import './App.css';
import Products from './Products'
import ProductForm from './ProductForm'
import NavbarStyle from "./NavbarStyle";

class App extends Component {
  render() {
    return <Router>

        <div id="menu">
            <NavbarStyle/>
            <ul>
                <li>
                    <Link to="./products">Products</Link>
                </li>
                <li>
                    <Link to="/">Add Product</Link>
                </li>
            </ul>
            <Route path="/products" component={Products}/>
            <Route path="/" component={ProductForm}/>
        </div>

    </Router>
  }
}

export default App;
