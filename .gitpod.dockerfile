FROM gitpod/workspace-full-vnc

USER gitpod

#
# Installs hub CLI for managing github activity
#
RUN sudo apt-get update
RUN sudo apt-get install hub -y

#
#   Installs sdkman, and Java 12
#
RUN bash -c ". /home/gitpod/.sdkman/bin/sdkman-init.sh \
    && sdk install java 12.0.2.j9-adpt \
    && sdk default java 12.0.2.j9-adpt"

