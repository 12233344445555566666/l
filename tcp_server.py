import socket

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
server_socket.bind(('127.0.0.1', 5678))
server_socket.listen(1)
conn, sender_address = server_socket.accept() 
#print("Connection from: " + str(sender_address))
filename = conn.recv(1024).decode()
f = open(filename, "r")
data_to_send = f.read()
conn.send(data_to_send.encode())
conn.close() 