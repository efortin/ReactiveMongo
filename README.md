ReactiveMongo fork
=========================== 

This is a fork of the standard client https://github.com/typesafehub/config. Configuration parameters
has been added to make easier thread pool size configurations.

`mongo-async-driver {

      pools {

        boss-nr-of-thread = 1
        worker-nr-of-thread = 16

      }
}`