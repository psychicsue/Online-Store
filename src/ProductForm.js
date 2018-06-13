import React, {Component} from 'react';
import {Button, Row, Grid, InputGroup} from 'react-bootstrap';

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
            <Grid>
                <InputGroup>
                    <form onSubmit={this.handleSubmit}>
                        <Row>
                            <label htmlFor="name">Product name: </label>
                            <input id="name" name="name" type="text" />
                        </Row><br/>

                        <Row>
                            <label htmlFor="description">Description: </label>
                            <input id="description" name="description" type="text" />
                        </Row><br/>

                        <Row>
                            <label htmlFor="category">Category: </label>
                            <input id="category" name="category" type="int" />
                        </Row><br/>

                        <Button bsStyle="success">Add product</Button>
                    </form>
                </InputGroup>
            </Grid>
        );
    }

}


export default Products;