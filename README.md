# Autoscale pods using KEDA

Refer to this article to learn more about this: [LINK](https://substackcdn.com/image/fetch/f_auto,q_auto:good,fl_progressive:steep/https%3A%2F%2Fsubstack-post-media.s3.amazonaws.com%2Fpublic%2Fimages%2F58eb6bbe-ae28-4022-81d1-0a2984199540_4725x1716.png)

1. Apply all the deployment files listed in deployments folder:
   
   `Kubectl apply -f <deployment_file>`
   
2. exec into kafka-deployment pod (or your kafka service)
   
   `kubectl exec -it <kafka-service-pod>  -- /bin/bash`
   
3. Send messages (or you can write your own producer code)
   
   `kafka-console-producer --broker-list localhost:9092 --topic <topic-name>`
