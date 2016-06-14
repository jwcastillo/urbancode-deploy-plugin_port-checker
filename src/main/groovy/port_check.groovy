import com.urbancode.air.AirPluginTool
import com.urbancode.air.XTrustProvider
import java.net.Socket

final def airTool = new AirPluginTool(args[0], args[1])
final def props = airTool.getStepProperties()
XTrustProvider.install()

// Setup properties for plugin
// Return 0 for port is active, 1 for port that is not listening
def exitStatus = 0

// Pull in properties from plugin
//println "Getting properties"
//props.each { println it }

def host = props['host'].trim()
def port = props['port'].trim()?.isInteger()?props['port'].trim().toFloat():null

try
{
  s = new Socket(host, port);
  exitStatus = 0
}
catch( Exception e)
{
  println "Port is not Listening"
  exitStatus = 1
}


System.exit(exitStatus)
