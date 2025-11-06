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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpTraceConfig extends AbstractModel {

    /**
    * 请求溯源开关
    */
    @SerializedName("EnableRequest")
    @Expose
    private Boolean EnableRequest;

    /**
    * 返回溯源开关
    */
    @SerializedName("EnableResponse")
    @Expose
    private Boolean EnableResponse;

    /**
    * 请求消息体溯源开关
    */
    @SerializedName("EnableRequestBody")
    @Expose
    private Boolean EnableRequestBody;

    /**
    * 返回消息体溯源开关
    */
    @SerializedName("EnableResponseBody")
    @Expose
    private Boolean EnableResponseBody;

    /**
    * 排除IP
    */
    @SerializedName("RemoteIpInclude")
    @Expose
    private String [] RemoteIpInclude;

    /**
    * 包含IP
    */
    @SerializedName("RemoteIpExclude")
    @Expose
    private String [] RemoteIpExclude;

    /**
    * 排除uri
    */
    @SerializedName("UriInclude")
    @Expose
    private String [] UriInclude;

    /**
    * 包含uri
    */
    @SerializedName("UriExclude")
    @Expose
    private String [] UriExclude;

    /**
     * Get 请求溯源开关 
     * @return EnableRequest 请求溯源开关
     */
    public Boolean getEnableRequest() {
        return this.EnableRequest;
    }

    /**
     * Set 请求溯源开关
     * @param EnableRequest 请求溯源开关
     */
    public void setEnableRequest(Boolean EnableRequest) {
        this.EnableRequest = EnableRequest;
    }

    /**
     * Get 返回溯源开关 
     * @return EnableResponse 返回溯源开关
     */
    public Boolean getEnableResponse() {
        return this.EnableResponse;
    }

    /**
     * Set 返回溯源开关
     * @param EnableResponse 返回溯源开关
     */
    public void setEnableResponse(Boolean EnableResponse) {
        this.EnableResponse = EnableResponse;
    }

    /**
     * Get 请求消息体溯源开关 
     * @return EnableRequestBody 请求消息体溯源开关
     */
    public Boolean getEnableRequestBody() {
        return this.EnableRequestBody;
    }

    /**
     * Set 请求消息体溯源开关
     * @param EnableRequestBody 请求消息体溯源开关
     */
    public void setEnableRequestBody(Boolean EnableRequestBody) {
        this.EnableRequestBody = EnableRequestBody;
    }

    /**
     * Get 返回消息体溯源开关 
     * @return EnableResponseBody 返回消息体溯源开关
     */
    public Boolean getEnableResponseBody() {
        return this.EnableResponseBody;
    }

    /**
     * Set 返回消息体溯源开关
     * @param EnableResponseBody 返回消息体溯源开关
     */
    public void setEnableResponseBody(Boolean EnableResponseBody) {
        this.EnableResponseBody = EnableResponseBody;
    }

    /**
     * Get 排除IP 
     * @return RemoteIpInclude 排除IP
     */
    public String [] getRemoteIpInclude() {
        return this.RemoteIpInclude;
    }

    /**
     * Set 排除IP
     * @param RemoteIpInclude 排除IP
     */
    public void setRemoteIpInclude(String [] RemoteIpInclude) {
        this.RemoteIpInclude = RemoteIpInclude;
    }

    /**
     * Get 包含IP 
     * @return RemoteIpExclude 包含IP
     */
    public String [] getRemoteIpExclude() {
        return this.RemoteIpExclude;
    }

    /**
     * Set 包含IP
     * @param RemoteIpExclude 包含IP
     */
    public void setRemoteIpExclude(String [] RemoteIpExclude) {
        this.RemoteIpExclude = RemoteIpExclude;
    }

    /**
     * Get 排除uri 
     * @return UriInclude 排除uri
     */
    public String [] getUriInclude() {
        return this.UriInclude;
    }

    /**
     * Set 排除uri
     * @param UriInclude 排除uri
     */
    public void setUriInclude(String [] UriInclude) {
        this.UriInclude = UriInclude;
    }

    /**
     * Get 包含uri 
     * @return UriExclude 包含uri
     */
    public String [] getUriExclude() {
        return this.UriExclude;
    }

    /**
     * Set 包含uri
     * @param UriExclude 包含uri
     */
    public void setUriExclude(String [] UriExclude) {
        this.UriExclude = UriExclude;
    }

    public IpTraceConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpTraceConfig(IpTraceConfig source) {
        if (source.EnableRequest != null) {
            this.EnableRequest = new Boolean(source.EnableRequest);
        }
        if (source.EnableResponse != null) {
            this.EnableResponse = new Boolean(source.EnableResponse);
        }
        if (source.EnableRequestBody != null) {
            this.EnableRequestBody = new Boolean(source.EnableRequestBody);
        }
        if (source.EnableResponseBody != null) {
            this.EnableResponseBody = new Boolean(source.EnableResponseBody);
        }
        if (source.RemoteIpInclude != null) {
            this.RemoteIpInclude = new String[source.RemoteIpInclude.length];
            for (int i = 0; i < source.RemoteIpInclude.length; i++) {
                this.RemoteIpInclude[i] = new String(source.RemoteIpInclude[i]);
            }
        }
        if (source.RemoteIpExclude != null) {
            this.RemoteIpExclude = new String[source.RemoteIpExclude.length];
            for (int i = 0; i < source.RemoteIpExclude.length; i++) {
                this.RemoteIpExclude[i] = new String(source.RemoteIpExclude[i]);
            }
        }
        if (source.UriInclude != null) {
            this.UriInclude = new String[source.UriInclude.length];
            for (int i = 0; i < source.UriInclude.length; i++) {
                this.UriInclude[i] = new String(source.UriInclude[i]);
            }
        }
        if (source.UriExclude != null) {
            this.UriExclude = new String[source.UriExclude.length];
            for (int i = 0; i < source.UriExclude.length; i++) {
                this.UriExclude[i] = new String(source.UriExclude[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableRequest", this.EnableRequest);
        this.setParamSimple(map, prefix + "EnableResponse", this.EnableResponse);
        this.setParamSimple(map, prefix + "EnableRequestBody", this.EnableRequestBody);
        this.setParamSimple(map, prefix + "EnableResponseBody", this.EnableResponseBody);
        this.setParamArraySimple(map, prefix + "RemoteIpInclude.", this.RemoteIpInclude);
        this.setParamArraySimple(map, prefix + "RemoteIpExclude.", this.RemoteIpExclude);
        this.setParamArraySimple(map, prefix + "UriInclude.", this.UriInclude);
        this.setParamArraySimple(map, prefix + "UriExclude.", this.UriExclude);

    }
}

