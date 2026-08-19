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

public class UpdateIpTraceStatusRequest extends AbstractModel {

    /**
    * <p>集群ID。该字段为必填字段。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>IP溯源配置开关。该字段为必填字段。</p>
    */
    @SerializedName("OpenIpTrace")
    @Expose
    private Boolean OpenIpTrace;

    /**
    * <p>IP溯源开启持续时间，单位：秒。该字段为必填字段。</p>
    */
    @SerializedName("DurationTime")
    @Expose
    private Long DurationTime;

    /**
    * <p>IP溯源配置。该字段为必填字段。</p>
    */
    @SerializedName("IpTraceConfig")
    @Expose
    private IpTraceConfig IpTraceConfig;

    /**
    * <p>是否过滤kibana节点IP。</p>
    */
    @SerializedName("FilterKibanaIp")
    @Expose
    private Boolean FilterKibanaIp;

    /**
     * Get <p>集群ID。该字段为必填字段。</p> 
     * @return InstanceId <p>集群ID。该字段为必填字段。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群ID。该字段为必填字段。</p>
     * @param InstanceId <p>集群ID。该字段为必填字段。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>IP溯源配置开关。该字段为必填字段。</p> 
     * @return OpenIpTrace <p>IP溯源配置开关。该字段为必填字段。</p>
     */
    public Boolean getOpenIpTrace() {
        return this.OpenIpTrace;
    }

    /**
     * Set <p>IP溯源配置开关。该字段为必填字段。</p>
     * @param OpenIpTrace <p>IP溯源配置开关。该字段为必填字段。</p>
     */
    public void setOpenIpTrace(Boolean OpenIpTrace) {
        this.OpenIpTrace = OpenIpTrace;
    }

    /**
     * Get <p>IP溯源开启持续时间，单位：秒。该字段为必填字段。</p> 
     * @return DurationTime <p>IP溯源开启持续时间，单位：秒。该字段为必填字段。</p>
     */
    public Long getDurationTime() {
        return this.DurationTime;
    }

    /**
     * Set <p>IP溯源开启持续时间，单位：秒。该字段为必填字段。</p>
     * @param DurationTime <p>IP溯源开启持续时间，单位：秒。该字段为必填字段。</p>
     */
    public void setDurationTime(Long DurationTime) {
        this.DurationTime = DurationTime;
    }

    /**
     * Get <p>IP溯源配置。该字段为必填字段。</p> 
     * @return IpTraceConfig <p>IP溯源配置。该字段为必填字段。</p>
     */
    public IpTraceConfig getIpTraceConfig() {
        return this.IpTraceConfig;
    }

    /**
     * Set <p>IP溯源配置。该字段为必填字段。</p>
     * @param IpTraceConfig <p>IP溯源配置。该字段为必填字段。</p>
     */
    public void setIpTraceConfig(IpTraceConfig IpTraceConfig) {
        this.IpTraceConfig = IpTraceConfig;
    }

    /**
     * Get <p>是否过滤kibana节点IP。</p> 
     * @return FilterKibanaIp <p>是否过滤kibana节点IP。</p>
     */
    public Boolean getFilterKibanaIp() {
        return this.FilterKibanaIp;
    }

    /**
     * Set <p>是否过滤kibana节点IP。</p>
     * @param FilterKibanaIp <p>是否过滤kibana节点IP。</p>
     */
    public void setFilterKibanaIp(Boolean FilterKibanaIp) {
        this.FilterKibanaIp = FilterKibanaIp;
    }

    public UpdateIpTraceStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateIpTraceStatusRequest(UpdateIpTraceStatusRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.OpenIpTrace != null) {
            this.OpenIpTrace = new Boolean(source.OpenIpTrace);
        }
        if (source.DurationTime != null) {
            this.DurationTime = new Long(source.DurationTime);
        }
        if (source.IpTraceConfig != null) {
            this.IpTraceConfig = new IpTraceConfig(source.IpTraceConfig);
        }
        if (source.FilterKibanaIp != null) {
            this.FilterKibanaIp = new Boolean(source.FilterKibanaIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OpenIpTrace", this.OpenIpTrace);
        this.setParamSimple(map, prefix + "DurationTime", this.DurationTime);
        this.setParamObj(map, prefix + "IpTraceConfig.", this.IpTraceConfig);
        this.setParamSimple(map, prefix + "FilterKibanaIp", this.FilterKibanaIp);

    }
}

