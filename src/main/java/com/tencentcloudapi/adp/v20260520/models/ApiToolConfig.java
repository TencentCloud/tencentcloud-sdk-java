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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApiToolConfig extends AbstractModel {

    /**
    * API插件支持对外调用的工具URL
    */
    @SerializedName("ExternalApiUrl")
    @Expose
    private String ExternalApiUrl;

    /**
    * 请求method
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 请求的url
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * body参数
    */
    @SerializedName("Body")
    @Expose
    private RequestParam [] Body;

    /**
    * 示例
    */
    @SerializedName("Example")
    @Expose
    private ToolExample Example;

    /**
    * Header信息
    */
    @SerializedName("Header")
    @Expose
    private RequestParam [] Header;

    /**
    * 输出参数
    */
    @SerializedName("Outputs")
    @Expose
    private ResponseParam [] Outputs;

    /**
    * query参数
    */
    @SerializedName("Query")
    @Expose
    private RequestParam [] Query;

    /**
    * 流式模式
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 非流式 |
| 1 | 流式 |
    */
    @SerializedName("StreamMode")
    @Expose
    private Long StreamMode;

    /**
     * Get API插件支持对外调用的工具URL 
     * @return ExternalApiUrl API插件支持对外调用的工具URL
     */
    public String getExternalApiUrl() {
        return this.ExternalApiUrl;
    }

    /**
     * Set API插件支持对外调用的工具URL
     * @param ExternalApiUrl API插件支持对外调用的工具URL
     */
    public void setExternalApiUrl(String ExternalApiUrl) {
        this.ExternalApiUrl = ExternalApiUrl;
    }

    /**
     * Get 请求method 
     * @return Method 请求method
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 请求method
     * @param Method 请求method
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 请求的url 
     * @return Url 请求的url
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 请求的url
     * @param Url 请求的url
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get body参数 
     * @return Body body参数
     */
    public RequestParam [] getBody() {
        return this.Body;
    }

    /**
     * Set body参数
     * @param Body body参数
     */
    public void setBody(RequestParam [] Body) {
        this.Body = Body;
    }

    /**
     * Get 示例 
     * @return Example 示例
     */
    public ToolExample getExample() {
        return this.Example;
    }

    /**
     * Set 示例
     * @param Example 示例
     */
    public void setExample(ToolExample Example) {
        this.Example = Example;
    }

    /**
     * Get Header信息 
     * @return Header Header信息
     */
    public RequestParam [] getHeader() {
        return this.Header;
    }

    /**
     * Set Header信息
     * @param Header Header信息
     */
    public void setHeader(RequestParam [] Header) {
        this.Header = Header;
    }

    /**
     * Get 输出参数 
     * @return Outputs 输出参数
     */
    public ResponseParam [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set 输出参数
     * @param Outputs 输出参数
     */
    public void setOutputs(ResponseParam [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get query参数 
     * @return Query query参数
     */
    public RequestParam [] getQuery() {
        return this.Query;
    }

    /**
     * Set query参数
     * @param Query query参数
     */
    public void setQuery(RequestParam [] Query) {
        this.Query = Query;
    }

    /**
     * Get 流式模式
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 非流式 |
| 1 | 流式 | 
     * @return StreamMode 流式模式
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 非流式 |
| 1 | 流式 |
     */
    public Long getStreamMode() {
        return this.StreamMode;
    }

    /**
     * Set 流式模式
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 非流式 |
| 1 | 流式 |
     * @param StreamMode 流式模式
枚举值:
| uint | 描述 |
| --- | --- |
| 0 | 非流式 |
| 1 | 流式 |
     */
    public void setStreamMode(Long StreamMode) {
        this.StreamMode = StreamMode;
    }

    public ApiToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiToolConfig(ApiToolConfig source) {
        if (source.ExternalApiUrl != null) {
            this.ExternalApiUrl = new String(source.ExternalApiUrl);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.Body != null) {
            this.Body = new RequestParam[source.Body.length];
            for (int i = 0; i < source.Body.length; i++) {
                this.Body[i] = new RequestParam(source.Body[i]);
            }
        }
        if (source.Example != null) {
            this.Example = new ToolExample(source.Example);
        }
        if (source.Header != null) {
            this.Header = new RequestParam[source.Header.length];
            for (int i = 0; i < source.Header.length; i++) {
                this.Header[i] = new RequestParam(source.Header[i]);
            }
        }
        if (source.Outputs != null) {
            this.Outputs = new ResponseParam[source.Outputs.length];
            for (int i = 0; i < source.Outputs.length; i++) {
                this.Outputs[i] = new ResponseParam(source.Outputs[i]);
            }
        }
        if (source.Query != null) {
            this.Query = new RequestParam[source.Query.length];
            for (int i = 0; i < source.Query.length; i++) {
                this.Query[i] = new RequestParam(source.Query[i]);
            }
        }
        if (source.StreamMode != null) {
            this.StreamMode = new Long(source.StreamMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExternalApiUrl", this.ExternalApiUrl);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "Body.", this.Body);
        this.setParamObj(map, prefix + "Example.", this.Example);
        this.setParamArrayObj(map, prefix + "Header.", this.Header);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamArrayObj(map, prefix + "Query.", this.Query);
        this.setParamSimple(map, prefix + "StreamMode", this.StreamMode);

    }
}

