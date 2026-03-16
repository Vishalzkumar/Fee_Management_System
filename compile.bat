@echo off
echo Compiling Java project...
javac -d target/classes src/main/java/com/college/feemanagement/*.java
if %errorlevel% equ 0 (
    echo Compilation successful!
) else (
    echo Compilation failed!
)
pause