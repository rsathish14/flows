CREATE SCHEMA workflow;
GRANT CONNECT ON DATABASE workflow TO postgres;
GRANT USAGE ON SCHEMA workflow TO postgres;
GRANT ALL PRIVILEGES ON ALL TABLES IN SCHEMA workflow TO postgres;
GRANT ALL PRIVILEGES ON ALL SEQUENCES IN SCHEMA workflow TO postgres;
GRANT ALL PRIVILEGES ON DATABASE workflow TO postgres;


#DROP SCHEMA workflow CASCADE;#