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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportPrometheusReadOnlyDynamicAPIRequest extends AbstractModel {

    /**
    * <p>Prometheus 实例 ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>HTTP 方法名 GET/POST/PUT/DELETE 等</p>
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * <p>HTTP 路径（包括 query string）</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>HTTP 请求体，任何数据</p>
    */
    @SerializedName("RequestBody")
    @Expose
    private String RequestBody;

    /**
    * <p>HTTP 请求头</p>
    */
    @SerializedName("Headers")
    @Expose
    private PrometheusStringKeyValuePair [] Headers;

    /**
    * <p>是否请求自监控数据。自监控仅支持 /api/v1/query 与 /api/v1/query_range 接口。</p>
    */
    @SerializedName("SelfMonitor")
    @Expose
    private Boolean SelfMonitor;

    /**
     * Get <p>Prometheus 实例 ID</p> 
     * @return InstanceId <p>Prometheus 实例 ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>Prometheus 实例 ID</p>
     * @param InstanceId <p>Prometheus 实例 ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>HTTP 方法名 GET/POST/PUT/DELETE 等</p> 
     * @return Method <p>HTTP 方法名 GET/POST/PUT/DELETE 等</p>
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set <p>HTTP 方法名 GET/POST/PUT/DELETE 等</p>
     * @param Method <p>HTTP 方法名 GET/POST/PUT/DELETE 等</p>
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get <p>HTTP 路径（包括 query string）</p> 
     * @return Path <p>HTTP 路径（包括 query string）</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>HTTP 路径（包括 query string）</p>
     * @param Path <p>HTTP 路径（包括 query string）</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>HTTP 请求体，任何数据</p> 
     * @return RequestBody <p>HTTP 请求体，任何数据</p>
     */
    public String getRequestBody() {
        return this.RequestBody;
    }

    /**
     * Set <p>HTTP 请求体，任何数据</p>
     * @param RequestBody <p>HTTP 请求体，任何数据</p>
     */
    public void setRequestBody(String RequestBody) {
        this.RequestBody = RequestBody;
    }

    /**
     * Get <p>HTTP 请求头</p> 
     * @return Headers <p>HTTP 请求头</p>
     */
    public PrometheusStringKeyValuePair [] getHeaders() {
        return this.Headers;
    }

    /**
     * Set <p>HTTP 请求头</p>
     * @param Headers <p>HTTP 请求头</p>
     */
    public void setHeaders(PrometheusStringKeyValuePair [] Headers) {
        this.Headers = Headers;
    }

    /**
     * Get <p>是否请求自监控数据。自监控仅支持 /api/v1/query 与 /api/v1/query_range 接口。</p> 
     * @return SelfMonitor <p>是否请求自监控数据。自监控仅支持 /api/v1/query 与 /api/v1/query_range 接口。</p>
     */
    public Boolean getSelfMonitor() {
        return this.SelfMonitor;
    }

    /**
     * Set <p>是否请求自监控数据。自监控仅支持 /api/v1/query 与 /api/v1/query_range 接口。</p>
     * @param SelfMonitor <p>是否请求自监控数据。自监控仅支持 /api/v1/query 与 /api/v1/query_range 接口。</p>
     */
    public void setSelfMonitor(Boolean SelfMonitor) {
        this.SelfMonitor = SelfMonitor;
    }

    public ExportPrometheusReadOnlyDynamicAPIRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportPrometheusReadOnlyDynamicAPIRequest(ExportPrometheusReadOnlyDynamicAPIRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RequestBody != null) {
            this.RequestBody = new String(source.RequestBody);
        }
        if (source.Headers != null) {
            this.Headers = new PrometheusStringKeyValuePair[source.Headers.length];
            for (int i = 0; i < source.Headers.length; i++) {
                this.Headers[i] = new PrometheusStringKeyValuePair(source.Headers[i]);
            }
        }
        if (source.SelfMonitor != null) {
            this.SelfMonitor = new Boolean(source.SelfMonitor);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RequestBody", this.RequestBody);
        this.setParamArrayObj(map, prefix + "Headers.", this.Headers);
        this.setParamSimple(map, prefix + "SelfMonitor", this.SelfMonitor);

    }
}

