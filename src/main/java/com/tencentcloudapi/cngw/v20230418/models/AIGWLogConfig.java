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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWLogConfig extends AbstractModel {

    /**
    * <p>是否开启请求 payload 记录日志</p>
    */
    @SerializedName("EnableRequestLogPayloads")
    @Expose
    private Boolean EnableRequestLogPayloads;

    /**
    * <p>是否开启响应 payload 记录日志</p>
    */
    @SerializedName("EnableResponseLogPayloads")
    @Expose
    private Boolean EnableResponseLogPayloads;

    /**
    * <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p>
    */
    @SerializedName("RequestLogPayloadMaxSize")
    @Expose
    private Long RequestLogPayloadMaxSize;

    /**
    * <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p>
    */
    @SerializedName("ResponseLogPayloadMaxSize")
    @Expose
    private Long ResponseLogPayloadMaxSize;

    /**
     * Get <p>是否开启请求 payload 记录日志</p> 
     * @return EnableRequestLogPayloads <p>是否开启请求 payload 记录日志</p>
     */
    public Boolean getEnableRequestLogPayloads() {
        return this.EnableRequestLogPayloads;
    }

    /**
     * Set <p>是否开启请求 payload 记录日志</p>
     * @param EnableRequestLogPayloads <p>是否开启请求 payload 记录日志</p>
     */
    public void setEnableRequestLogPayloads(Boolean EnableRequestLogPayloads) {
        this.EnableRequestLogPayloads = EnableRequestLogPayloads;
    }

    /**
     * Get <p>是否开启响应 payload 记录日志</p> 
     * @return EnableResponseLogPayloads <p>是否开启响应 payload 记录日志</p>
     */
    public Boolean getEnableResponseLogPayloads() {
        return this.EnableResponseLogPayloads;
    }

    /**
     * Set <p>是否开启响应 payload 记录日志</p>
     * @param EnableResponseLogPayloads <p>是否开启响应 payload 记录日志</p>
     */
    public void setEnableResponseLogPayloads(Boolean EnableResponseLogPayloads) {
        this.EnableResponseLogPayloads = EnableResponseLogPayloads;
    }

    /**
     * Get <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p> 
     * @return RequestLogPayloadMaxSize <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p>
     */
    public Long getRequestLogPayloadMaxSize() {
        return this.RequestLogPayloadMaxSize;
    }

    /**
     * Set <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p>
     * @param RequestLogPayloadMaxSize <p>日志记录的请求body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableRequestLogPayloads 为true时必填</p>
     */
    public void setRequestLogPayloadMaxSize(Long RequestLogPayloadMaxSize) {
        this.RequestLogPayloadMaxSize = RequestLogPayloadMaxSize;
    }

    /**
     * Get <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p> 
     * @return ResponseLogPayloadMaxSize <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p>
     */
    public Long getResponseLogPayloadMaxSize() {
        return this.ResponseLogPayloadMaxSize;
    }

    /**
     * Set <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p>
     * @param ResponseLogPayloadMaxSize <p>日志记录的响应body的最大字节数</p><p>取值范围：[512, 1048576]</p><p>EnableResponseLogPayloads 为true时必填</p>
     */
    public void setResponseLogPayloadMaxSize(Long ResponseLogPayloadMaxSize) {
        this.ResponseLogPayloadMaxSize = ResponseLogPayloadMaxSize;
    }

    public AIGWLogConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWLogConfig(AIGWLogConfig source) {
        if (source.EnableRequestLogPayloads != null) {
            this.EnableRequestLogPayloads = new Boolean(source.EnableRequestLogPayloads);
        }
        if (source.EnableResponseLogPayloads != null) {
            this.EnableResponseLogPayloads = new Boolean(source.EnableResponseLogPayloads);
        }
        if (source.RequestLogPayloadMaxSize != null) {
            this.RequestLogPayloadMaxSize = new Long(source.RequestLogPayloadMaxSize);
        }
        if (source.ResponseLogPayloadMaxSize != null) {
            this.ResponseLogPayloadMaxSize = new Long(source.ResponseLogPayloadMaxSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnableRequestLogPayloads", this.EnableRequestLogPayloads);
        this.setParamSimple(map, prefix + "EnableResponseLogPayloads", this.EnableResponseLogPayloads);
        this.setParamSimple(map, prefix + "RequestLogPayloadMaxSize", this.RequestLogPayloadMaxSize);
        this.setParamSimple(map, prefix + "ResponseLogPayloadMaxSize", this.ResponseLogPayloadMaxSize);

    }
}

