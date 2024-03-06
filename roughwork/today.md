---
title:
date: 2024-02-23
author: dst
tags: spring-boot, docker
---

Notes
---

Docker
---

Docker solves some problems that are

- Dependancy management
- Compatibility issues
- Environment inconsistancy

Benefits of Docker Container

- Size
- Start time
- Resource Utilization
- Isolation
- Porability
- Scalability

Docker architechture

Host OS <-> Docker Engine [Docker CLI <-> Docker API <-> Docker Daemon]
Docker Daemon -> Building docker images
                 Manage docker container

Machine -> OS -> Docker-Engine -> Container[libs/bins/apps]

Virtual Machine
---

- Consider seperate computer inside your computer.
- Each Virtual Machine behave like a sperate computer.
- Virtual machines are created and managed by Virtualization software

Machine -> OS -> Hypervisor -> Guest-OS[libs/bins/apps]
