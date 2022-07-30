/*
 * package com.demoIntelligence.ppmtool.aop;
 * 
 * import org.aopalliance.intercept.Joinpoint; import
 * org.aspectj.lang.annotation.Aspect; import
 * org.aspectj.lang.annotation.Before; import org.slf4j.Logger; import
 * org.slf4j.LoggerFactory; import
 * org.springframework.context.annotation.Configuration;
 * 
 * @Aspect
 * 
 * @Configuration public class AspectConfig {
 * 
 * private Logger log = LoggerFactory.getLogger(AspectConfig.class);
 * 
 * @Before(value = "within( com.demoIntelligence.ppmtool.resource.*)") public
 * void logStatementBefore(Joinpoint joinPoint) { log.info("Execution start {}",
 * joinPoint);
 * 
 * }
 * 
 * 
 * @Around public void around()
 * 
 * 
 * @After(value = "excution(*com.demoIntelligence.ppmtool.resource.*.*(..))")
 * public void logStatementAfter(Joinpoint joinPoint) {
 * log.info("Execution end {}", joinPoint);
 * 
 * }
 * 
 * 
 * }
 */