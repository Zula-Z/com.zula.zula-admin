# Local monitoring and infra stack for zula-admin

Use this single Docker Compose file to bring up the supporting infrastructure while running `zula-admin` with the `dev` profile. It creates Postgres, RabbitMQ, Grafana, Prometheus, and a lightweight HTTP echo service that proxies the `/api/services/register` endpoint.

## Run the stack

```bash
cd zula-admin-app/monitoring-infra
docker compose up -d
```

The Prometheus job in `prometheus.yml` scrapes `http://host.docker.internal:8082/actuator/prometheus`, so start the admin service on port `8082` before validating metrics. Grafana is on `http://localhost:3000`, Prometheus on `http://localhost:9090`, Postgres on `localhost:5432`, RabbitMQ on ports `5672` and `15672`, and the fake Datahog receiver listens on `http://localhost:8080/api/services/register`.

```bash
docker compose down
```
