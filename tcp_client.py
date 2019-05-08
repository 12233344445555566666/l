import socket

client_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
client_socket.connect(('127.0.0.1', 5678))
message = input("Enter Filename : ")
client_socket.send(message.encode())
recieved_data = client_socket.recv(1024).decode()
print("Recieved data :", recieved_data)
client_socket.close()