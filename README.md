
# Happn-Ed

Happn Educational is my attempt to learn the backend of Happn. After digging into the working of Tinder, I got interested in getting a date for me even more when Saraswati Puja is approaching. But small talks away, I started digging into the backend by observing the API requests using the all time trustworthy tool, BurpSuite.
## Demo

The deployed API can be found [here](https://happned.onrender.com/)
## Tech Stack

   - Java Spring Boot
   - Happn API
## API Reference

#### Get your own account details with the latest person that liked you

```http
  POST /
```

| Body | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `accesstoken`      | `string` |  your unique access token |

#### Get your recommendations

```http
  POST /recs
```

| Body | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `accesstoken`      | `string` |  your unique access token |

#### Like someone

```http
  POST /like/{id}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `string` |  id of the account to be liked |

| Body | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `accesstoken`      | `string` |  your unique access token |

## Features

- See who liked you without paying for any premium, one account at a time
- Like back or reject someone without paying for any premium
- Instant match reflects in the application
- No need for endless swiping, get all 20 recommendations in one page
## FAQ

#### How to use the API?

The API have defined endpoints that accepts requests as documented above. Every POST request need the OAuth token to be supplied in the request body and it returns the response.

#### How can I get my OAuth token?

Login to Happn from your browser and open dev tools. In the storage sections, see the local storage and find a key named accesstoken. The value of that key is important for the API to work.

#### The token that worked previously is not working now. What to do?

Happn refreshes tokens at regular intervals or after you re-login. Just use the new token and the API will be functional again.

#### Why did you I make this crazy thing in the first place?

To demonstrate my backend skills, make matching easier in Happn and have a working proof of my findings and skills to include in CV. Have to bag a job in 2024 :)

#### Are you still single even after enumerating and playing with dating applications?

Yes, I am still single and I see no hope of getting anyone any sooner.
## Contributing

Contributions are always welcome!

Anyone can contribute to this repository by creating a UI or some interesting improvements in the API.

I cannot assure to accept all the contributions but I'll try to manage as many as possible.
## Feedback

If you have any feedback, please reach out to me at ayush786113@gmail.com

## Authors
[Ayush](https://www.github.com/ayush786113)