package com.nayan.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "postClient", url = "${client.post.baseUrl}")
public interface PostClient {

	@GetMapping("/see")
	public String getEncrptedString();

}
