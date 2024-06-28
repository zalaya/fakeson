#!/bin/bash

function execute_maven_command() {
  mvn -T 1C "$1"
}

function cd_project_root() {
  directory=$(pwd)

  until [[ $(basename "$directory") == "fakeson" || "$directory" == "/" ]]; do
      directory=$(dirname "$directory")
  done

  cd "$directory"
}

cd_project_root

execute_maven_command "install"
execute_maven_command "clean"
