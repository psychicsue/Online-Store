import {Navbar, Nav, NavItem} from 'react-bootstrap';
import React, { Component } from 'react';

class NavbarStyle extends Component {
  render() {
    return (
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

    );
  }
}

export default NavbarStyle;
