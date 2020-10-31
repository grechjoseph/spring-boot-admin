<h1>Spring Boot Admin</h1>
<h2>Server</h2>
<ol>
    <li>Add dependency for <b>spring-boot-admin-starter-server</b>.</li>
</ol>
<h2>Client</h2>
<ol>
    <li>Add dependency for <b>spring-boot-admin-starter-client</b>.</li>
    <li>Add property <b>spring.boot.admin.client.url</b> to add the url of the spring boot admin Server.</li>
    <li>Add property <b>spring.boot.admin.client.instance.name</b> to set the name by which the client will register with Spring Boot Admin.</li>
    <li>Add property <b>management.endpoints.web.exposure.include=*</b> to expose all actuator endpoints.</li>
    <li>Add property <b>management.endpoint.health.show-details=always</b> to show all available Health details on the health endpoint.</li>
    <li>The <b>AdditionalInfoConfig</b> configuraiton class is there to add additional/custom info to the actuator info endpoint.</li>
</ol>