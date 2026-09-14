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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AICallAPICallRequestDetail extends AbstractModel {

    /**
    * <p>HTTP 请求方法，如 GET、POST。</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>请求地址。</p>
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * <p>请求参数（节点配置的入参与 URL query），json 序列化后的字符串，键升序排列。敏感值已脱敏，无参数时为空字符串。</p>
    */
    @SerializedName("Params")
    @Expose
    private String Params;

    /**
    * <p>请求头，json 序列化后的字符串，键升序排列。敏感值已脱敏，无请求头时为空字符串。</p>
    */
    @SerializedName("Headers")
    @Expose
    private String Headers;

    /**
    * <p>请求体，超长时被截断，是否截断见 Truncated。</p>
    */
    @SerializedName("Body")
    @Expose
    private String Body;

    /**
    * <p>请求体 Body 是否被截断。</p>
    */
    @SerializedName("Truncated")
    @Expose
    private Boolean Truncated;

    /**
     * Get <p>HTTP 请求方法，如 GET、POST。</p> 
     * @return Method <p>HTTP 请求方法，如 GET、POST。</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>HTTP 请求方法，如 GET、POST。</p>
     * @param Method <p>HTTP 请求方法，如 GET、POST。</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>请求地址。</p> 
     * @return URL <p>请求地址。</p>
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set <p>请求地址。</p>
     * @param URL <p>请求地址。</p>
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get <p>请求参数（节点配置的入参与 URL query），json 序列化后的字符串，键升序排列。敏感值已脱敏，无参数时为空字符串。</p> 
     * @return Params <p>请求参数（节点配置的入参与 URL query），json 序列化后的字符串，键升序排列。敏感值已脱敏，无参数时为空字符串。</p>
     */
    public String getParams() {
        return this.Params;
    }

    /**
     * Set <p>请求参数（节点配置的入参与 URL query），json 序列化后的字符串，键升序排列。敏感值已脱敏，无参数时为空字符串。</p>
     * @param Params <p>请求参数（节点配置的入参与 URL query），json 序列化后的字符串，键升序排列。敏感值已脱敏，无参数时为空字符串。</p>
     */
    public void setParams(String Params) {
        this.Params = Params;
    }

    /**
     * Get <p>请求头，json 序列化后的字符串，键升序排列。敏感值已脱敏，无请求头时为空字符串。</p> 
     * @return Headers <p>请求头，json 序列化后的字符串，键升序排列。敏感值已脱敏，无请求头时为空字符串。</p>
     */
    public String getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>请求头，json 序列化后的字符串，键升序排列。敏感值已脱敏，无请求头时为空字符串。</p>
     * @param Headers <p>请求头，json 序列化后的字符串，键升序排列。敏感值已脱敏，无请求头时为空字符串。</p>
     */
    public void setHeaders(String Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>请求体，超长时被截断，是否截断见 Truncated。</p> 
     * @return Body <p>请求体，超长时被截断，是否截断见 Truncated。</p>
     */
    public String getBody() {
        return this.Body;
    }

    /**
     * Set <p>请求体，超长时被截断，是否截断见 Truncated。</p>
     * @param Body <p>请求体，超长时被截断，是否截断见 Truncated。</p>
     */
    public void setBody(String Body) {
        this.Body = Body;
    }

    /**
     * Get <p>请求体 Body 是否被截断。</p> 
     * @return Truncated <p>请求体 Body 是否被截断。</p>
     */
    public Boolean getTruncated() {
        return this.Truncated;
    }

    /**
     * Set <p>请求体 Body 是否被截断。</p>
     * @param Truncated <p>请求体 Body 是否被截断。</p>
     */
    public void setTruncated(Boolean Truncated) {
        this.Truncated = Truncated;
    }

    public AICallAPICallRequestDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AICallAPICallRequestDetail(AICallAPICallRequestDetail source) {
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Params != null) {
            this.Params = new String(source.Params);
        }
        if (source.Headers != null) {
            this.Headers = new String(source.Headers);
        }
        if (source.Body != null) {
            this.Body = new String(source.Body);
        }
        if (source.Truncated != null) {
            this.Truncated = new Boolean(source.Truncated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Params", this.Params);
        this.setParamSimple(map, prefix + "Headers", this.Headers);
        this.setParamSimple(map, prefix + "Body", this.Body);
        this.setParamSimple(map, prefix + "Truncated", this.Truncated);

    }
}

