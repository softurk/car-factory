# Car Factory Project

### Used Technologies

<ul style="list-style-type:disc">
  <li> <b> Java 1.8 </b> </li>
  <li> <b> Gradle </b> </li>
  <li> <b> Spring Boot </b> </li>
  <ul>
    <li> Spring Boot 2.5.0 </li>
    <li> Spring Boot Web </li>
    <li> Spring Boot Validation </li>
    <li> Lombok </li>
  </ul>
</ul>


### 📖 Information

<ul style="list-style-type:disc">
  <li><b>Car Factory</b> is a facility where production is made according to the requested vehicle type. For example Cabrio, Sedan, Hatchback etc.</li>
  </li>
</ul>

### 🔨 Run the App

<b>1 )</b> Open Terminal under <b> car-factory </b> folder to run <b>Application</b>
```
    gradle bootRun
```

<b>2 )</b> To <b>produce</b> car, use a <b>GET</b> request url with the request body
```
    http://localhost:8080/car/getType?carType=sedan
```


### Screenshots

<details>
<summary>Click here to show the screenshots of project</summary>
    <p> Request </p>
    <img src ="screenshots\factory1.png">
    <p> Response </p>
    <img src ="screenshots\factory2.png">
</details>
