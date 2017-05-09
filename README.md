# customgw yocto project layer

## description

small custom layer for yocto project (https://yoctoproject.org/)

## instructions

1. clone poky repo and cd to repo directory
```sh
git clone git://git.yoctoproject.org/poky -b morty
cd poky
```
2. clone clustomgw
```sh
git clone https://github.com/beeva-mariorodriguez/meta-customgw
```
3. initialize dev environment
```sh
source oe-init-build-env
```
4. add customgw layer to conf/bblayers.conf
```sh
echo 'BBLAYERS_append = " /workdir/poky/meta-customgw"' >> conf/bblayers.conf                                  
```
5. [optional] clone and append raspberrypi bsp layer
```sh
git clone git://git.yoctoproject.org/meta-raspberrypi -b morty
echo 'BBLAYERS_append = " /workdir/poky/meta-raspberrypi"' >> conf/bblayers.conf                                  
echo 'MACHINE = "raspberrypi3"' >> conf/layers.conf
```

### tips

* layers and build dir should be under poky/ repository
* use default build directory: 'build/'

