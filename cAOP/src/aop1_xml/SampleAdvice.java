package aop1_xml;

import org.aspectj.lang.ProceedingJoinPoint;

public class SampleAdvice {

	public Object around(ProceedingJoinPoint point) throws Throwable {
		String methodName = point.getSignature().getName();
		System.out.println("<<<<< 사전 작업 >>>>> " + methodName);
		Object obj = point.proceed();
		System.out.println("<<<<< 사후 작업 >>>>> " + methodName);
		return obj;
	}
	
}
