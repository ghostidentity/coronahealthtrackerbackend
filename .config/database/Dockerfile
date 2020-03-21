FROM library/postgres:latest
LABEL maintainer="proxyshadow@gmail.com"
COPY init.sql /docker-entrypoint-initdb.d/
RUN echo "database scripts been copied"
EXPOSE 5432
