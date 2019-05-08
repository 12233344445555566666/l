import socket

sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM) 
query = raw_input("Host Name -> ")
sock.sendto(query, ('127.0.0.1', 1357))
data, addr = sock.recvfrom(1024)
print "IP resolved ->", str(data)