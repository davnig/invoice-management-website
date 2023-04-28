### STAGE 1: Build ###
FROM node:18.16.0-slim AS BUILD_STAGE
WORKDIR /usr/app
COPY package.json /.
RUN npm install
COPY . .
RUN npm run build --prod

### STAGE 2: Run ###
FROM nginx
COPY --from=BUILD_STAGE /usr/app/dist/invoice-management-website /usr/share/nginx/html