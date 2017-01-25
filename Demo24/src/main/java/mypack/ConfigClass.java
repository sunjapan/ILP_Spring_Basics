package mypack;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

//This will enable the  AspectJ annotation support
@EnableAspectJAutoProxy
// This will enable Spring Auto Scanning support
@ComponentScan("mypack")
public class ConfigClass {

}