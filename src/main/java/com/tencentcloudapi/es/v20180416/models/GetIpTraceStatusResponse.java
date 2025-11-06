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

public class GetIpTraceStatusResponse extends AbstractModel {

    /**
    * 是否开启IP溯源
    */
    @SerializedName("OpenIpTrace")
    @Expose
    private Boolean OpenIpTrace;

    /**
    * IP溯源开启持续时间，单位：秒
    */
    @SerializedName("DurationTime")
    @Expose
    private Long DurationTime;

    /**
    * IP溯源配置
    */
    @SerializedName("IpTraceConfig")
    @Expose
    private IpTraceConfig IpTraceConfig;

    /**
    * 上次执行时间
    */
    @SerializedName("LastStartTime")
    @Expose
    private String LastStartTime;

    /**
    * 上次关闭时间
    */
    @SerializedName("LastEndTime")
    @Expose
    private String LastEndTime;

    /**
    * 是否过滤Kibana节点IP
    */
    @SerializedName("FilterKibanaIp")
    @Expose
    private Boolean FilterKibanaIp;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 是否开启IP溯源 
     * @return OpenIpTrace 是否开启IP溯源
     */
    public Boolean getOpenIpTrace() {
        return this.OpenIpTrace;
    }

    /**
     * Set 是否开启IP溯源
     * @param OpenIpTrace 是否开启IP溯源
     */
    public void setOpenIpTrace(Boolean OpenIpTrace) {
        this.OpenIpTrace = OpenIpTrace;
    }

    /**
     * Get IP溯源开启持续时间，单位：秒 
     * @return DurationTime IP溯源开启持续时间，单位：秒
     */
    public Long getDurationTime() {
        return this.DurationTime;
    }

    /**
     * Set IP溯源开启持续时间，单位：秒
     * @param DurationTime IP溯源开启持续时间，单位：秒
     */
    public void setDurationTime(Long DurationTime) {
        this.DurationTime = DurationTime;
    }

    /**
     * Get IP溯源配置 
     * @return IpTraceConfig IP溯源配置
     */
    public IpTraceConfig getIpTraceConfig() {
        return this.IpTraceConfig;
    }

    /**
     * Set IP溯源配置
     * @param IpTraceConfig IP溯源配置
     */
    public void setIpTraceConfig(IpTraceConfig IpTraceConfig) {
        this.IpTraceConfig = IpTraceConfig;
    }

    /**
     * Get 上次执行时间 
     * @return LastStartTime 上次执行时间
     */
    public String getLastStartTime() {
        return this.LastStartTime;
    }

    /**
     * Set 上次执行时间
     * @param LastStartTime 上次执行时间
     */
    public void setLastStartTime(String LastStartTime) {
        this.LastStartTime = LastStartTime;
    }

    /**
     * Get 上次关闭时间 
     * @return LastEndTime 上次关闭时间
     */
    public String getLastEndTime() {
        return this.LastEndTime;
    }

    /**
     * Set 上次关闭时间
     * @param LastEndTime 上次关闭时间
     */
    public void setLastEndTime(String LastEndTime) {
        this.LastEndTime = LastEndTime;
    }

    /**
     * Get 是否过滤Kibana节点IP 
     * @return FilterKibanaIp 是否过滤Kibana节点IP
     */
    public Boolean getFilterKibanaIp() {
        return this.FilterKibanaIp;
    }

    /**
     * Set 是否过滤Kibana节点IP
     * @param FilterKibanaIp 是否过滤Kibana节点IP
     */
    public void setFilterKibanaIp(Boolean FilterKibanaIp) {
        this.FilterKibanaIp = FilterKibanaIp;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetIpTraceStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetIpTraceStatusResponse(GetIpTraceStatusResponse source) {
        if (source.OpenIpTrace != null) {
            this.OpenIpTrace = new Boolean(source.OpenIpTrace);
        }
        if (source.DurationTime != null) {
            this.DurationTime = new Long(source.DurationTime);
        }
        if (source.IpTraceConfig != null) {
            this.IpTraceConfig = new IpTraceConfig(source.IpTraceConfig);
        }
        if (source.LastStartTime != null) {
            this.LastStartTime = new String(source.LastStartTime);
        }
        if (source.LastEndTime != null) {
            this.LastEndTime = new String(source.LastEndTime);
        }
        if (source.FilterKibanaIp != null) {
            this.FilterKibanaIp = new Boolean(source.FilterKibanaIp);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OpenIpTrace", this.OpenIpTrace);
        this.setParamSimple(map, prefix + "DurationTime", this.DurationTime);
        this.setParamObj(map, prefix + "IpTraceConfig.", this.IpTraceConfig);
        this.setParamSimple(map, prefix + "LastStartTime", this.LastStartTime);
        this.setParamSimple(map, prefix + "LastEndTime", this.LastEndTime);
        this.setParamSimple(map, prefix + "FilterKibanaIp", this.FilterKibanaIp);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

