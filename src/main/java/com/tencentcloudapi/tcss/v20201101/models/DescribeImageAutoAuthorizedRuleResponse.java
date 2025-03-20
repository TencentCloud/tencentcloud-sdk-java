/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageAutoAuthorizedRuleResponse extends AbstractModel {

    /**
    * 规则是否生效，0:不生效，1:已生效
    */
    @SerializedName("IsEnabled")
    @Expose
    private Long IsEnabled;

    /**
    * 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像
    */
    @SerializedName("RangeType")
    @Expose
    private String RangeType;

    /**
    * 授权范围是自选主机时的主机数量
    */
    @SerializedName("HostCount")
    @Expose
    private Long HostCount;

    /**
    * 每天最大的镜像授权数限制, 0表示无限制
    */
    @SerializedName("MaxDailyCount")
    @Expose
    private Long MaxDailyCount;

    /**
    * 规则id，用未设置时为0
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 自动扫描开关，0：关闭，1：开启
    */
    @SerializedName("AutoScanEnabled")
    @Expose
    private Long AutoScanEnabled;

    /**
    * 自动扫描范围
    */
    @SerializedName("ScanType")
    @Expose
    private String [] ScanType;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 规则是否生效，0:不生效，1:已生效 
     * @return IsEnabled 规则是否生效，0:不生效，1:已生效
     */
    public Long getIsEnabled() {
        return this.IsEnabled;
    }

    /**
     * Set 规则是否生效，0:不生效，1:已生效
     * @param IsEnabled 规则是否生效，0:不生效，1:已生效
     */
    public void setIsEnabled(Long IsEnabled) {
        this.IsEnabled = IsEnabled;
    }

    /**
     * Get 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像 
     * @return RangeType 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像
     */
    public String getRangeType() {
        return this.RangeType;
    }

    /**
     * Set 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像
     * @param RangeType 授权范围类别，MANUAL:自选主机节点，ALL:全部镜像
     */
    public void setRangeType(String RangeType) {
        this.RangeType = RangeType;
    }

    /**
     * Get 授权范围是自选主机时的主机数量 
     * @return HostCount 授权范围是自选主机时的主机数量
     */
    public Long getHostCount() {
        return this.HostCount;
    }

    /**
     * Set 授权范围是自选主机时的主机数量
     * @param HostCount 授权范围是自选主机时的主机数量
     */
    public void setHostCount(Long HostCount) {
        this.HostCount = HostCount;
    }

    /**
     * Get 每天最大的镜像授权数限制, 0表示无限制 
     * @return MaxDailyCount 每天最大的镜像授权数限制, 0表示无限制
     */
    public Long getMaxDailyCount() {
        return this.MaxDailyCount;
    }

    /**
     * Set 每天最大的镜像授权数限制, 0表示无限制
     * @param MaxDailyCount 每天最大的镜像授权数限制, 0表示无限制
     */
    public void setMaxDailyCount(Long MaxDailyCount) {
        this.MaxDailyCount = MaxDailyCount;
    }

    /**
     * Get 规则id，用未设置时为0 
     * @return RuleId 规则id，用未设置时为0
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id，用未设置时为0
     * @param RuleId 规则id，用未设置时为0
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 自动扫描开关，0：关闭，1：开启 
     * @return AutoScanEnabled 自动扫描开关，0：关闭，1：开启
     */
    public Long getAutoScanEnabled() {
        return this.AutoScanEnabled;
    }

    /**
     * Set 自动扫描开关，0：关闭，1：开启
     * @param AutoScanEnabled 自动扫描开关，0：关闭，1：开启
     */
    public void setAutoScanEnabled(Long AutoScanEnabled) {
        this.AutoScanEnabled = AutoScanEnabled;
    }

    /**
     * Get 自动扫描范围 
     * @return ScanType 自动扫描范围
     */
    public String [] getScanType() {
        return this.ScanType;
    }

    /**
     * Set 自动扫描范围
     * @param ScanType 自动扫描范围
     */
    public void setScanType(String [] ScanType) {
        this.ScanType = ScanType;
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

    public DescribeImageAutoAuthorizedRuleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageAutoAuthorizedRuleResponse(DescribeImageAutoAuthorizedRuleResponse source) {
        if (source.IsEnabled != null) {
            this.IsEnabled = new Long(source.IsEnabled);
        }
        if (source.RangeType != null) {
            this.RangeType = new String(source.RangeType);
        }
        if (source.HostCount != null) {
            this.HostCount = new Long(source.HostCount);
        }
        if (source.MaxDailyCount != null) {
            this.MaxDailyCount = new Long(source.MaxDailyCount);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.AutoScanEnabled != null) {
            this.AutoScanEnabled = new Long(source.AutoScanEnabled);
        }
        if (source.ScanType != null) {
            this.ScanType = new String[source.ScanType.length];
            for (int i = 0; i < source.ScanType.length; i++) {
                this.ScanType[i] = new String(source.ScanType[i]);
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
        this.setParamSimple(map, prefix + "IsEnabled", this.IsEnabled);
        this.setParamSimple(map, prefix + "RangeType", this.RangeType);
        this.setParamSimple(map, prefix + "HostCount", this.HostCount);
        this.setParamSimple(map, prefix + "MaxDailyCount", this.MaxDailyCount);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AutoScanEnabled", this.AutoScanEnabled);
        this.setParamArraySimple(map, prefix + "ScanType.", this.ScanType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

