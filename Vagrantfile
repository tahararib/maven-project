# -*- mode: ruby -*-
# vi: set ft=ruby :

Vagrant.configure("2") do |config|
  config.vm.define "jenkins" do |jenkins|
    jenkins.vm.box = "bento/ubuntu-22.04"
    jenkins.vm.hostname = "jenkins"
    jenkins.vm.network "private_network", ip:"192.168.33.10"
    jenkins.vm.provision "shell", path:"jenkins.sh"
        jenkins.vm.provider "Virtualbox" do |v|
        v.name = "jenkins"
        v.memory = 4096
        v.cpus = 2
        end
    end
end
