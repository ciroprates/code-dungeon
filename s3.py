import boto3
import os
import datetime

def upload(path):
    s3 = boto3.resource('s3')
    bucket = s3.Bucket('casamento-original')
    count = 0

    for root, dirs, files in os.walk(path):
        for file in files:
            count += 1
            if count < 188:
                continue
            full_path = os.path.join(root, file)
            with open(full_path, 'rb') as data:
                bucket.put_object(Key='album/'+full_path[len(path)+1:], Body=data)
                print(str(datetime.datetime.now()) + " - " + file + " uploaded!")

if __name__ == '__main__':
    upload('/media/NASHDD1/Photos/casamento-original')



 
