# Crystal Arena

Made this for one of my servers, CrystalCore.
discord.gg/crystalcore

## About

This plugin simply allows players to damage players with crystals but blocks do not break. For flat arenas.

## How To Build

- Download Git Bash, Java 21 and Maven
- Open Git Bash and run "git clone https://github.com/VoltrexDoesNotCode/CrystalPvPArena.git"
- After that run "cd CrystalPvPArena"
- Then "mvn clean package"
- The file should be located in "C:\Users\username\CrystalPvPArena\target"

## Dependency 

This plugin does NOT disable block breaking, you need to do that yourself with WorldGuard and WorldEdit.
With //wand, create your arena then run /region define flatarena. Then /region flag flatarena block-break deny.
