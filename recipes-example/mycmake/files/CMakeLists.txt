cmake_minimum_required(VERSION 2.8.3)
project(cmake_recipe)
add_executable(userprog userprog.c)
install(TARGETS userprog DESTINATION bin)
