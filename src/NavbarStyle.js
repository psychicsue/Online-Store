import {Navbar, Nav, NavItem} from 'react-bootstrap';
import React, { Component } from 'react';
import './App.css';

class NavbarStyle extends Component {
  render() {
    return (
        <div className="nav">
        <Nav bsStyle="tabs">
            <Navbar.Header>
                <Navbar.Brand>
                    <a href="/">Online Store</a>
                </Navbar.Brand>
            </Navbar.Header>

                <NavItem eventKey={1} href="/products">
                    Products
                </NavItem>

                <NavItem eventKey={2} href="/categories">
                    Categories
                </NavItem>
        </Nav>
        </div>
    );
  }
}

export default NavbarStyle;
