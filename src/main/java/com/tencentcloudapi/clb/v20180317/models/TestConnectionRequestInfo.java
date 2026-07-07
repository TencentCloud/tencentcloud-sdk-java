/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TestConnectionRequestInfo extends AbstractModel {

    /**
    * <p>请求URL</p>
    */
    @SerializedName("RequestUrl")
    @Expose
    private String RequestUrl;

    /**
    * <p>请求体</p>
    */
    @SerializedName("RequestBody")
    @Expose
    private String RequestBody;

    /**
    * <p>请求头</p>
    */
    @SerializedName("RequestHeaders")
    @Expose
    private String RequestHeaders;

    /**
     * Get <p>请求URL</p> 
     * @return RequestUrl <p>请求URL</p>
     */
    public String getRequestUrl() {
        return this.RequestUrl;
    }

    /**
     * Set <p>请求URL</p>
     * @param RequestUrl <p>请求URL</p>
     */
    public void setRequestUrl(String RequestUrl) {
        this.RequestUrl = RequestUrl;
    }

    /**
     * Get <p>请求体</p> 
     * @return RequestBody <p>请求体</p>
     */
    public String getRequestBody() {
        return this.RequestBody;
    }

    /**
     * Set <p>请求体</p>
     * @param RequestBody <p>请求体</p>
     */
    public void setRequestBody(String RequestBody) {
        this.RequestBody = RequestBody;
    }

    /**
     * Get <p>请求头</p> 
     * @return RequestHeaders <p>请求头</p>
     */
    public String getRequestHeaders() {
        return this.RequestHeaders;
    }

    /**
     * Set <p>请求头</p>
     * @param RequestHeaders <p>请求头</p>
     */
    public void setRequestHeaders(String RequestHeaders) {
        this.RequestHeaders = RequestHeaders;
    }

    public TestConnectionRequestInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TestConnectionRequestInfo(TestConnectionRequestInfo source) {
        if (source.RequestUrl != null) {
            this.RequestUrl = new String(source.RequestUrl);
        }
        if (source.RequestBody != null) {
            this.RequestBody = new String(source.RequestBody);
        }
        if (source.RequestHeaders != null) {
            this.RequestHeaders = new String(source.RequestHeaders);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestUrl", this.RequestUrl);
        this.setParamSimple(map, prefix + "RequestBody", this.RequestBody);
        this.setParamSimple(map, prefix + "RequestHeaders", this.RequestHeaders);

    }
}

