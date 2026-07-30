FROM node:20-bullseye

WORKDIR /app

RUN npm install -g expo-cli @expo/ngrok

COPY package.json package-lock.json ./

RUN npm install

COPY . .

EXPOSE 8081 19000 19001 19002

ENV REACT_NATIVE_PACKAGER_HOSTNAME=0.0.0.0

CMD ["npx", "expo", "start", "--host", "lan"]