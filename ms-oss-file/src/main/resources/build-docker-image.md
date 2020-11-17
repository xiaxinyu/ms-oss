# 启动MinIO容器
docker run -p 9000:9000 --name minio -d --restart=always -e "MINIO_ACCESS_KEY=admin" -e "MINIO_SECRET_KEY=admin123456" -v d:\minio:/data -v d:\minio\config:/root/.minio minio/minio server /data

# 访问MinIO服务
http://localhost:9000/
 
  
