> ⚠️ API IS STILL UNDER DEVELOPMENT

# ByteCompanions API

<p align="center">
  <a href="https://www.java.com/">
    <img src="https://img.shields.io/badge/Java-21+-blue" alt="Java"/>
  </a>
  <a href="https://papermc.io/">
    <img src="https://img.shields.io/badge/PaperMC-1.21.1%2B-green" alt="PaperMC"/>
  </a>
  <a href="license">
    <img src="https://img.shields.io/badge/License-MIT-yellow.svg" alt="License"/>
  </a>
  <a href="https://discord.com/invite/3K9yrZQRmS">
    <img src="https://img.shields.io/discord/1350369915521204276?label=Discord&color=7289DA&logo=discord&logoColor=white" alt="Discord"/>
  </a>
</p>

The **ByteCompanions API** is the official external module that enables developers to interact with the companion system in a clean, stable, and implementation-independent way.  
It provides a unified access point to the platform’s core services, allowing you to integrate companion features without depending on the internal structure of the main plugin.

By obtaining the central entry point via `ByteCompanionsAPI#getInstance`, your plugin immediately gains access to the services responsible for user handling, companion types, and companion management.  
This ensures a consistent and forward-compatible integration experience, suitable for projects that require reliability, modularity, and long-term stability.

---

## Licensing Notice

This repository contains **only the public API layer** of the ByteCompanions ecosystem.  
The main ByteCompanions plugin — including its internal implementation and execution logic — is **private, closed-source, and not distributed under the MIT license**.

The **MIT license included in this repository applies exclusively to the API code present here**, not to the full ByteCompanions product.

If you clone, fork, or depend on this repository, you are using *only* the public API module.

---

<p align="center">
  <a href="https://discord.com/invite/3K9yrZQRmS">
    <img src="https://imgur.com/DvyC4jL.png" width="600" alt="ByteCompanions preview">
  </a>
  <br/>
  <i>Need support? Join the Discord community.</i>
</p>
