import socket

resolver = {'www.nie.ac.in': '200.168.19.20', 'www.abc.com': '100.101.102.103'}

serverSock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
serverSock.bind(('127.0.0.1', 1357))
recieved_data, sender_address = serverSock.recvfrom(1024)
print "Query ", recieved_data, "Sender Adress", repr(sender_address)
serverSock.sendto(resolver[recieved_data], sender_address)