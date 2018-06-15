import React, {Component} from 'react';
import {Button, Row, Grid, InputGroup, Col} from 'react-bootstrap';

class Products extends Component {

    constructor() {
        super();
        this.handleSubmit = this.handleSubmit.bind(this);
    }

    handleSubmit(event) {
        event.preventDefault();
        const data = new FormData(event.target);

        var url = 'http://localhost:9090/';

        fetch(url, {
            method: 'POST',
            body: data,
        });
    }

    render() {
        return (
            <div className="product-form">
            <Grid>
                <InputGroup>
                    <Col xs={6} md={4}></Col>
                    <Col xs={6} md={4}>
                        <form onSubmit={this.handleSubmit}>

                                <h4 align="center">Add new product</h4>
                            <Row>
                                <Col xs={2} md={4}>
                                        <label htmlFor="name">Product: </label>
                                </Col>
                                    <Col xs={2} md={4}>
                                        <input id="name" name="name" type="text" />
                                    </Col>
                            </Row><br/>

                            <Row>
                                <Col xs={2} md={4}>
                                    <label htmlFor="description">Description: </label>
                                </Col>
                                <Col xs={2} md={4}>
                                    <input id="description" name="description" type="text" />
                                </Col>
                            </Row><br/>

                            <Row>
                                <Col xs={2} md={4}>
                                    <label htmlFor="category">Category: </label>
                                </Col>
                                <Col xs={2} md={4}>
                                    <input id="category" name="category" type="int"/>
                                </Col>
                            </Row><br/>

                            <Button bsStyle="success">Add product</Button>
                        </form>
                    </Col>
                    <Col xs={6} md={4}></Col>
                </InputGroup>
            </Grid>
        </div>
        );
    }

}


export default Products;