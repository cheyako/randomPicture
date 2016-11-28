## Motivation

Force developers to take a look on pipeline status often  

## Installation

`mvn clean package`

`java -jar ./target/random-picture-1.0-SNAPSHOT.jar`

open in browser `http://localhost:8111/page/gify?search=popcorn`

## API Reference

Next endpoinds are supported:

`/page/pug` - return page with pugs 
Source for pugs is  http://pugme.herokuapp.com/random
Supported params: 
* freq - frequency uf image updates


`/page/meow` - return page with kitties
Source for pugs is http://meowme.herokuapp.com/random
Supported params: 
* freq - frequency uf image updates 
 
`/page/gify` - return page with search result
Source - http://api.giphy.com/v1/gifs/random?api_key=dc6zaTOxFJmzC&rating=G
Supported params: 
* freq - frequency uf image updates 
* search - search keyword