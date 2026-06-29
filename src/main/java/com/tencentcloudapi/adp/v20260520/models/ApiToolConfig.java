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
    * <p>请求体参数</p>
    */
    @SerializedName("Body")
    @Expose
    private RequestParam [] Body;

    /**
    * <p>示例</p>
    */
    @SerializedName("Example")
    @Expose
    private ToolExample Example;

    /**
    * <p>API插件外部调用地址</p>
    */
    @SerializedName("ExternalApiUrl")
    @Expose
    private String ExternalApiUrl;

    /**
    * <p>Header</p>
    */
    @SerializedName("Header")
    @Expose
    private RequestParam [] Header;

    /**
    * <p>请求方式</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>输出</p>
    */
    @SerializedName("Outputs")
    @Expose
    private ResponseParam [] Outputs;

    /**
    * <p>查询参数</p>
    */
    @SerializedName("Query")
    @Expose
    private RequestParam [] Query;

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>STREAM_MODE_UNARY</td><td>0</td><td>非流式</td></tr><tr><td>STREAM_MODE_STREAMING</td><td>1</td><td>流式</td></tr></tbody></table>
    */
    @SerializedName("StreamMode")
    @Expose
    private Long StreamMode;

    /**
    * <p>地址</p>
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
     * Get <p>请求体参数</p> 
     * @return Body <p>请求体参数</p>
     */
    public RequestParam [] getBody() {
        return this.Body;
    }

    /**
     * Set <p>请求体参数</p>
     * @param Body <p>请求体参数</p>
     */
    public void setBody(RequestParam [] Body) {
        this.Body = Body;
    }

    /**
     * Get <p>示例</p> 
     * @return Example <p>示例</p>
     */
    public ToolExample getExample() {
        return this.Example;
    }

    /**
     * Set <p>示例</p>
     * @param Example <p>示例</p>
     */
    public void setExample(ToolExample Example) {
        this.Example = Example;
    }

    /**
     * Get <p>API插件外部调用地址</p> 
     * @return ExternalApiUrl <p>API插件外部调用地址</p>
     */
    public String getExternalApiUrl() {
        return this.ExternalApiUrl;
    }

    /**
     * Set <p>API插件外部调用地址</p>
     * @param ExternalApiUrl <p>API插件外部调用地址</p>
     */
    public void setExternalApiUrl(String ExternalApiUrl) {
        this.ExternalApiUrl = ExternalApiUrl;
    }

    /**
     * Get <p>Header</p> 
     * @return Header <p>Header</p>
     */
    public RequestParam [] getHeader() {
        return this.Header;
    }

    /**
     * Set <p>Header</p>
     * @param Header <p>Header</p>
     */
    public void setHeader(RequestParam [] Header) {
        this.Header = Header;
    }

    /**
     * Get <p>请求方式</p> 
     * @return Method <p>请求方式</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>请求方式</p>
     * @param Method <p>请求方式</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>输出</p> 
     * @return Outputs <p>输出</p>
     */
    public ResponseParam [] getOutputs() {
        return this.Outputs;
    }

    /**
     * Set <p>输出</p>
     * @param Outputs <p>输出</p>
     */
    public void setOutputs(ResponseParam [] Outputs) {
        this.Outputs = Outputs;
    }

    /**
     * Get <p>查询参数</p> 
     * @return Query <p>查询参数</p>
     */
    public RequestParam [] getQuery() {
        return this.Query;
    }

    /**
     * Set <p>查询参数</p>
     * @param Query <p>查询参数</p>
     */
    public void setQuery(RequestParam [] Query) {
        this.Query = Query;
    }

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>STREAM_MODE_UNARY</td><td>0</td><td>非流式</td></tr><tr><td>STREAM_MODE_STREAMING</td><td>1</td><td>流式</td></tr></tbody></table> 
     * @return StreamMode <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>STREAM_MODE_UNARY</td><td>0</td><td>非流式</td></tr><tr><td>STREAM_MODE_STREAMING</td><td>1</td><td>流式</td></tr></tbody></table>
     */
    public Long getStreamMode() {
        return this.StreamMode;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>STREAM_MODE_UNARY</td><td>0</td><td>非流式</td></tr><tr><td>STREAM_MODE_STREAMING</td><td>1</td><td>流式</td></tr></tbody></table>
     * @param StreamMode <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>STREAM_MODE_UNARY</td><td>0</td><td>非流式</td></tr><tr><td>STREAM_MODE_STREAMING</td><td>1</td><td>流式</td></tr></tbody></table>
     */
    public void setStreamMode(Long StreamMode) {
        this.StreamMode = StreamMode;
    }

    /**
     * Get <p>地址</p> 
     * @return Url <p>地址</p>
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set <p>地址</p>
     * @param Url <p>地址</p>
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    public ApiToolConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApiToolConfig(ApiToolConfig source) {
        if (source.Body != null) {
            this.Body = new RequestParam[source.Body.length];
            for (int i = 0; i < source.Body.length; i++) {
                this.Body[i] = new RequestParam(source.Body[i]);
            }
        }
        if (source.Example != null) {
            this.Example = new ToolExample(source.Example);
        }
        if (source.ExternalApiUrl != null) {
            this.ExternalApiUrl = new String(source.ExternalApiUrl);
        }
        if (source.Header != null) {
            this.Header = new RequestParam[source.Header.length];
            for (int i = 0; i < source.Header.length; i++) {
                this.Header[i] = new RequestParam(source.Header[i]);
            }
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
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
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Body.", this.Body);
        this.setParamObj(map, prefix + "Example.", this.Example);
        this.setParamSimple(map, prefix + "ExternalApiUrl", this.ExternalApiUrl);
        this.setParamArrayObj(map, prefix + "Header.", this.Header);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamArrayObj(map, prefix + "Outputs.", this.Outputs);
        this.setParamArrayObj(map, prefix + "Query.", this.Query);
        this.setParamSimple(map, prefix + "StreamMode", this.StreamMode);
        this.setParamSimple(map, prefix + "Url", this.Url);

    }
}

