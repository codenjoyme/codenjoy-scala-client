call 0-settings.bat

echo off
call lib :color Building java client...
echo on

call lib :print_color %MVNW% -v
call %MVNW% clean compile assembly:single -Pjar-with-dependencies -DskipTests=%SKIP_TESTS%
echo F|xcopy /y %ROOT%\target\client-scala-exec.jar %ROOT%\app.jar

call lib :ask
