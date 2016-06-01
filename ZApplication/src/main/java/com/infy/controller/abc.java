package com.infy.controller;

public class abc {

	
	
	public final <T extends BaseResponse> T getexampleEntity(String url, Class<T> responseType, Map<String, ?> urlVariables, String handlerId) throws exampleException {
		T returnValue = null;
		example exampleException = null;
		HttpEntity<?> requestEntity = getRequestEntity(null, handlerId);
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		try {
		ResponseEntity<T> responseEntity = null;
		if (null != urlVariables) {
		responseEntity = restTemplate.exchange(exampleServiceUrl + url, HttpMethod.GET, requestEntity, responseType, urlVariables);
		} else {
		responseEntity = restTemplate.exchange(exampleServiceUrl + url, HttpMethod.GET, requestEntity, responseType);
		}
		if (null != responseEntity) {
		returnValue = responseEntity.getBody();
		}
		} catch (RestClientException restClientException) {
		if (restClientException instanceof HttpClientErrorException) {
		exampleException = recoverKeyAndMessage(restClientException);
		}
		if (null == exampleException) {
		LOGGER.error("Error occured in example service GET call " + restClientException);
		exampleException = new exampleException(ErrorConstants.REST_CALL_EXCEPTION_CODE, ErrorConstants.REST_CALL_EXCEPTION_MSG, restClientException);
		}
		throw exampleException;
		} finally {
		stopWatch.stop();
		LOGGER.info(templateLoggingUtil.logRequest(this.getClass().getSimpleName(), exampleServiceUrl + url, HttpMethod.GET.toString(), requestEntity, urlVariables, exampleException, stopWatch.getTime(), Constants.example_SERVICE_PROVIDER, null));
		}
		return returnValue;
		}

	
}
