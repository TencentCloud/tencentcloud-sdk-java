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
    * <p>是否开启IP溯源</p>
    */
    @SerializedName("OpenIpTrace")
    @Expose
    private Boolean OpenIpTrace;

    /**
    * <p>IP溯源开启持续时间，单位：秒</p>
    */
    @SerializedName("DurationTime")
    @Expose
    private Long DurationTime;

    /**
    * <p>IP溯源配置</p>
    */
    @SerializedName("IpTraceConfig")
    @Expose
    private IpTraceConfig IpTraceConfig;

    /**
    * <p>上次执行时间</p>
    */
    @SerializedName("LastStartTime")
    @Expose
    private String LastStartTime;

    /**
    * <p>上次关闭时间</p>
    */
    @SerializedName("LastEndTime")
    @Expose
    private String LastEndTime;

    /**
    * <p>是否过滤Kibana节点IP</p>
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
     * Get <p>是否开启IP溯源</p> 
     * @return OpenIpTrace <p>是否开启IP溯源</p>
     */
    public Boolean getOpenIpTrace() {
        return this.OpenIpTrace;
    }

    /**
     * Set <p>是否开启IP溯源</p>
     * @param OpenIpTrace <p>是否开启IP溯源</p>
     */
    public void setOpenIpTrace(Boolean OpenIpTrace) {
        this.OpenIpTrace = OpenIpTrace;
    }

    /**
     * Get <p>IP溯源开启持续时间，单位：秒</p> 
     * @return DurationTime <p>IP溯源开启持续时间，单位：秒</p>
     */
    public Long getDurationTime() {
        return this.DurationTime;
    }

    /**
     * Set <p>IP溯源开启持续时间，单位：秒</p>
     * @param DurationTime <p>IP溯源开启持续时间，单位：秒</p>
     */
    public void setDurationTime(Long DurationTime) {
        this.DurationTime = DurationTime;
    }

    /**
     * Get <p>IP溯源配置</p> 
     * @return IpTraceConfig <p>IP溯源配置</p>
     */
    public IpTraceConfig getIpTraceConfig() {
        return this.IpTraceConfig;
    }

    /**
     * Set <p>IP溯源配置</p>
     * @param IpTraceConfig <p>IP溯源配置</p>
     */
    public void setIpTraceConfig(IpTraceConfig IpTraceConfig) {
        this.IpTraceConfig = IpTraceConfig;
    }

    /**
     * Get <p>上次执行时间</p> 
     * @return LastStartTime <p>上次执行时间</p>
     */
    public String getLastStartTime() {
        return this.LastStartTime;
    }

    /**
     * Set <p>上次执行时间</p>
     * @param LastStartTime <p>上次执行时间</p>
     */
    public void setLastStartTime(String LastStartTime) {
        this.LastStartTime = LastStartTime;
    }

    /**
     * Get <p>上次关闭时间</p> 
     * @return LastEndTime <p>上次关闭时间</p>
     */
    public String getLastEndTime() {
        return this.LastEndTime;
    }

    /**
     * Set <p>上次关闭时间</p>
     * @param LastEndTime <p>上次关闭时间</p>
     */
    public void setLastEndTime(String LastEndTime) {
        this.LastEndTime = LastEndTime;
    }

    /**
     * Get <p>是否过滤Kibana节点IP</p> 
     * @return FilterKibanaIp <p>是否过滤Kibana节点IP</p>
     */
    public Boolean getFilterKibanaIp() {
        return this.FilterKibanaIp;
    }

    /**
     * Set <p>是否过滤Kibana节点IP</p>
     * @param FilterKibanaIp <p>是否过滤Kibana节点IP</p>
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

