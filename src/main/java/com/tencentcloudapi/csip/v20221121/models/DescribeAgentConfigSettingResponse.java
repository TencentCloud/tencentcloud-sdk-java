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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentConfigSettingResponse extends AbstractModel {

    /**
    * <p>增强日志模式开关，0-关闭 1-开启（未配置时为空）</p>
    */
    @SerializedName("EnhanceLogMode")
    @Expose
    private Long EnhanceLogMode;

    /**
    * <p>恶意软件 POC 模式开关，0-关闭 1-开启（未配置时为空）</p>
    */
    @SerializedName("MalwarePocMode")
    @Expose
    private Long MalwarePocMode;

    /**
    * <p>上报源端口开关（兼容旧版本），0-关闭 1-开启</p>
    */
    @SerializedName("ReportSourcePort")
    @Expose
    private Long ReportSourcePort;

    /**
    * <p>已开启的日志采集类型列表，如 tcp_ingress、tcp_src_port、http_egress、http_ingress、app_access</p>
    */
    @SerializedName("LogCollectSettings")
    @Expose
    private String [] LogCollectSettings;

    /**
    * <p>资产选择方式：all/tag/direct</p>
    */
    @SerializedName("AssetSelectionType")
    @Expose
    private String AssetSelectionType;

    /**
    * <p>按标签选择时的标签ID数组</p>
    */
    @SerializedName("TagIds")
    @Expose
    private String [] TagIds;

    /**
    * <p>直接选择的主机instance_id列表</p>
    */
    @SerializedName("InstanceIDs")
    @Expose
    private String [] InstanceIDs;

    /**
    * <p>排除的主机instance_id列表</p>
    */
    @SerializedName("ExcludeInstanceIDs")
    @Expose
    private String [] ExcludeInstanceIDs;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>增强日志模式开关，0-关闭 1-开启（未配置时为空）</p> 
     * @return EnhanceLogMode <p>增强日志模式开关，0-关闭 1-开启（未配置时为空）</p>
     */
    public Long getEnhanceLogMode() {
        return this.EnhanceLogMode;
    }

    /**
     * Set <p>增强日志模式开关，0-关闭 1-开启（未配置时为空）</p>
     * @param EnhanceLogMode <p>增强日志模式开关，0-关闭 1-开启（未配置时为空）</p>
     */
    public void setEnhanceLogMode(Long EnhanceLogMode) {
        this.EnhanceLogMode = EnhanceLogMode;
    }

    /**
     * Get <p>恶意软件 POC 模式开关，0-关闭 1-开启（未配置时为空）</p> 
     * @return MalwarePocMode <p>恶意软件 POC 模式开关，0-关闭 1-开启（未配置时为空）</p>
     */
    public Long getMalwarePocMode() {
        return this.MalwarePocMode;
    }

    /**
     * Set <p>恶意软件 POC 模式开关，0-关闭 1-开启（未配置时为空）</p>
     * @param MalwarePocMode <p>恶意软件 POC 模式开关，0-关闭 1-开启（未配置时为空）</p>
     */
    public void setMalwarePocMode(Long MalwarePocMode) {
        this.MalwarePocMode = MalwarePocMode;
    }

    /**
     * Get <p>上报源端口开关（兼容旧版本），0-关闭 1-开启</p> 
     * @return ReportSourcePort <p>上报源端口开关（兼容旧版本），0-关闭 1-开启</p>
     */
    public Long getReportSourcePort() {
        return this.ReportSourcePort;
    }

    /**
     * Set <p>上报源端口开关（兼容旧版本），0-关闭 1-开启</p>
     * @param ReportSourcePort <p>上报源端口开关（兼容旧版本），0-关闭 1-开启</p>
     */
    public void setReportSourcePort(Long ReportSourcePort) {
        this.ReportSourcePort = ReportSourcePort;
    }

    /**
     * Get <p>已开启的日志采集类型列表，如 tcp_ingress、tcp_src_port、http_egress、http_ingress、app_access</p> 
     * @return LogCollectSettings <p>已开启的日志采集类型列表，如 tcp_ingress、tcp_src_port、http_egress、http_ingress、app_access</p>
     */
    public String [] getLogCollectSettings() {
        return this.LogCollectSettings;
    }

    /**
     * Set <p>已开启的日志采集类型列表，如 tcp_ingress、tcp_src_port、http_egress、http_ingress、app_access</p>
     * @param LogCollectSettings <p>已开启的日志采集类型列表，如 tcp_ingress、tcp_src_port、http_egress、http_ingress、app_access</p>
     */
    public void setLogCollectSettings(String [] LogCollectSettings) {
        this.LogCollectSettings = LogCollectSettings;
    }

    /**
     * Get <p>资产选择方式：all/tag/direct</p> 
     * @return AssetSelectionType <p>资产选择方式：all/tag/direct</p>
     */
    public String getAssetSelectionType() {
        return this.AssetSelectionType;
    }

    /**
     * Set <p>资产选择方式：all/tag/direct</p>
     * @param AssetSelectionType <p>资产选择方式：all/tag/direct</p>
     */
    public void setAssetSelectionType(String AssetSelectionType) {
        this.AssetSelectionType = AssetSelectionType;
    }

    /**
     * Get <p>按标签选择时的标签ID数组</p> 
     * @return TagIds <p>按标签选择时的标签ID数组</p>
     */
    public String [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>按标签选择时的标签ID数组</p>
     * @param TagIds <p>按标签选择时的标签ID数组</p>
     */
    public void setTagIds(String [] TagIds) {
        this.TagIds = TagIds;
    }

    /**
     * Get <p>直接选择的主机instance_id列表</p> 
     * @return InstanceIDs <p>直接选择的主机instance_id列表</p>
     */
    public String [] getInstanceIDs() {
        return this.InstanceIDs;
    }

    /**
     * Set <p>直接选择的主机instance_id列表</p>
     * @param InstanceIDs <p>直接选择的主机instance_id列表</p>
     */
    public void setInstanceIDs(String [] InstanceIDs) {
        this.InstanceIDs = InstanceIDs;
    }

    /**
     * Get <p>排除的主机instance_id列表</p> 
     * @return ExcludeInstanceIDs <p>排除的主机instance_id列表</p>
     */
    public String [] getExcludeInstanceIDs() {
        return this.ExcludeInstanceIDs;
    }

    /**
     * Set <p>排除的主机instance_id列表</p>
     * @param ExcludeInstanceIDs <p>排除的主机instance_id列表</p>
     */
    public void setExcludeInstanceIDs(String [] ExcludeInstanceIDs) {
        this.ExcludeInstanceIDs = ExcludeInstanceIDs;
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

    public DescribeAgentConfigSettingResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentConfigSettingResponse(DescribeAgentConfigSettingResponse source) {
        if (source.EnhanceLogMode != null) {
            this.EnhanceLogMode = new Long(source.EnhanceLogMode);
        }
        if (source.MalwarePocMode != null) {
            this.MalwarePocMode = new Long(source.MalwarePocMode);
        }
        if (source.ReportSourcePort != null) {
            this.ReportSourcePort = new Long(source.ReportSourcePort);
        }
        if (source.LogCollectSettings != null) {
            this.LogCollectSettings = new String[source.LogCollectSettings.length];
            for (int i = 0; i < source.LogCollectSettings.length; i++) {
                this.LogCollectSettings[i] = new String(source.LogCollectSettings[i]);
            }
        }
        if (source.AssetSelectionType != null) {
            this.AssetSelectionType = new String(source.AssetSelectionType);
        }
        if (source.TagIds != null) {
            this.TagIds = new String[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new String(source.TagIds[i]);
            }
        }
        if (source.InstanceIDs != null) {
            this.InstanceIDs = new String[source.InstanceIDs.length];
            for (int i = 0; i < source.InstanceIDs.length; i++) {
                this.InstanceIDs[i] = new String(source.InstanceIDs[i]);
            }
        }
        if (source.ExcludeInstanceIDs != null) {
            this.ExcludeInstanceIDs = new String[source.ExcludeInstanceIDs.length];
            for (int i = 0; i < source.ExcludeInstanceIDs.length; i++) {
                this.ExcludeInstanceIDs[i] = new String(source.ExcludeInstanceIDs[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnhanceLogMode", this.EnhanceLogMode);
        this.setParamSimple(map, prefix + "MalwarePocMode", this.MalwarePocMode);
        this.setParamSimple(map, prefix + "ReportSourcePort", this.ReportSourcePort);
        this.setParamArraySimple(map, prefix + "LogCollectSettings.", this.LogCollectSettings);
        this.setParamSimple(map, prefix + "AssetSelectionType", this.AssetSelectionType);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);
        this.setParamArraySimple(map, prefix + "InstanceIDs.", this.InstanceIDs);
        this.setParamArraySimple(map, prefix + "ExcludeInstanceIDs.", this.ExcludeInstanceIDs);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

