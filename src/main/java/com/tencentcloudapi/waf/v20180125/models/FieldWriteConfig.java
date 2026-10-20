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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FieldWriteConfig extends AbstractModel {

    /**
    * <p>1:开启 0:不开启</p>
    */
    @SerializedName("EnableHeaders")
    @Expose
    private Long EnableHeaders;

    /**
    * <p>1:开启 0:不开启</p>
    */
    @SerializedName("EnableBody")
    @Expose
    private Long EnableBody;

    /**
    * <p>1:开启 0:不开启</p>
    */
    @SerializedName("EnableBot")
    @Expose
    private Long EnableBot;

    /**
    * <p>响应方向body<br>1:开启 0:不开启</p>
    */
    @SerializedName("EnableResponse")
    @Expose
    private Long EnableResponse;

    /**
    * <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p>
    */
    @SerializedName("EnableResponseHeaders")
    @Expose
    private Long EnableResponseHeaders;

    /**
    * <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p>
    */
    @SerializedName("EnableResponseLength")
    @Expose
    private Long EnableResponseLength;

    /**
    * <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p>
    */
    @SerializedName("EnableResponseStatusLine")
    @Expose
    private Long EnableResponseStatusLine;

    /**
     * Get <p>1:开启 0:不开启</p> 
     * @return EnableHeaders <p>1:开启 0:不开启</p>
     */
    public Long getEnableHeaders() {
        return this.EnableHeaders;
    }

    /**
     * Set <p>1:开启 0:不开启</p>
     * @param EnableHeaders <p>1:开启 0:不开启</p>
     */
    public void setEnableHeaders(Long EnableHeaders) {
        this.EnableHeaders = EnableHeaders;
    }

    /**
     * Get <p>1:开启 0:不开启</p> 
     * @return EnableBody <p>1:开启 0:不开启</p>
     */
    public Long getEnableBody() {
        return this.EnableBody;
    }

    /**
     * Set <p>1:开启 0:不开启</p>
     * @param EnableBody <p>1:开启 0:不开启</p>
     */
    public void setEnableBody(Long EnableBody) {
        this.EnableBody = EnableBody;
    }

    /**
     * Get <p>1:开启 0:不开启</p> 
     * @return EnableBot <p>1:开启 0:不开启</p>
     */
    public Long getEnableBot() {
        return this.EnableBot;
    }

    /**
     * Set <p>1:开启 0:不开启</p>
     * @param EnableBot <p>1:开启 0:不开启</p>
     */
    public void setEnableBot(Long EnableBot) {
        this.EnableBot = EnableBot;
    }

    /**
     * Get <p>响应方向body<br>1:开启 0:不开启</p> 
     * @return EnableResponse <p>响应方向body<br>1:开启 0:不开启</p>
     */
    public Long getEnableResponse() {
        return this.EnableResponse;
    }

    /**
     * Set <p>响应方向body<br>1:开启 0:不开启</p>
     * @param EnableResponse <p>响应方向body<br>1:开启 0:不开启</p>
     */
    public void setEnableResponse(Long EnableResponse) {
        this.EnableResponse = EnableResponse;
    }

    /**
     * Get <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p> 
     * @return EnableResponseHeaders <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p>
     */
    public Long getEnableResponseHeaders() {
        return this.EnableResponseHeaders;
    }

    /**
     * Set <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p>
     * @param EnableResponseHeaders <p>是否投递 response_headers（响应头，完整键值对，原样投递不做过滤/脱敏，超过2KB截断）。1:开启 0/不填:不开启。与 EnableResponse（响应体）完全独立，互不影响。</p>
     */
    public void setEnableResponseHeaders(Long EnableResponseHeaders) {
        this.EnableResponseHeaders = EnableResponseHeaders;
    }

    /**
     * Get <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p> 
     * @return EnableResponseLength <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p>
     */
    public Long getEnableResponseLength() {
        return this.EnableResponseLength;
    }

    /**
     * Set <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p>
     * @param EnableResponseLength <p>是否投递 response_length（响应包长度，单位字节）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。</p>
     */
    public void setEnableResponseLength(Long EnableResponseLength) {
        this.EnableResponseLength = EnableResponseLength;
    }

    /**
     * Get <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p> 
     * @return EnableResponseStatusLine <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p>
     */
    public Long getEnableResponseStatusLine() {
        return this.EnableResponseStatusLine;
    }

    /**
     * Set <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p>
     * @param EnableResponseStatusLine <p>是否投递 response_status_line（客户端可见 HTTP 状态行，如 HTTP/1.1 200 OK，超过1KB截断）。1:开启 0/不填:不开启。与 EnableResponse 完全独立，互不影响。拦截/未回源时也会有值，记录的是 WAF 返回给客户端的状态行。</p>
     */
    public void setEnableResponseStatusLine(Long EnableResponseStatusLine) {
        this.EnableResponseStatusLine = EnableResponseStatusLine;
    }

    public FieldWriteConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FieldWriteConfig(FieldWriteConfig source) {
        if (source.EnableHeaders != null) {
            this.EnableHeaders = new Long(source.EnableHeaders);
        }
        if (source.EnableBody != null) {
            this.EnableBody = new Long(source.EnableBody);
        }
        if (source.EnableBot != null) {
            this.EnableBot = new Long(source.EnableBot);
        }
        if (source.EnableResponse != null) {
            this.EnableResponse = new Long(source.EnableResponse);
        }
        if (source.EnableResponseHeaders != null) {
            this.EnableResponseHeaders = new Long(source.EnableResponseHeaders);
        }
        if (source.EnableResponseLength != null) {
            this.EnableResponseLength = new Long(source.EnableResponseLength);
        }
        if (source.EnableResponseStatusLine != null) {
            this.EnableResponseStatusLine = new Long(source.EnableResponseStatusLine);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableHeaders", this.EnableHeaders);
        this.setParamSimple(map, prefix + "EnableBody", this.EnableBody);
        this.setParamSimple(map, prefix + "EnableBot", this.EnableBot);
        this.setParamSimple(map, prefix + "EnableResponse", this.EnableResponse);
        this.setParamSimple(map, prefix + "EnableResponseHeaders", this.EnableResponseHeaders);
        this.setParamSimple(map, prefix + "EnableResponseLength", this.EnableResponseLength);
        this.setParamSimple(map, prefix + "EnableResponseStatusLine", this.EnableResponseStatusLine);

    }
}

