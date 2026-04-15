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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNDRAssetIdentificationListResponse extends AbstractModel {

    /**
    * 符合查询条件的总条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 查询结果列表
    */
    @SerializedName("Data")
    @Expose
    private NDRAssetServiceInfo [] Data;

    /**
    * 服务类型统计结果
    */
    @SerializedName("AssetCategoryStats")
    @Expose
    private NDRAssetCategoryStats [] AssetCategoryStats;

    /**
    * 地域可选项
    */
    @SerializedName("RegionOptions")
    @Expose
    private FieldOption [] RegionOptions;

    /**
    * IP版本可选项
    */
    @SerializedName("IpVersionOptions")
    @Expose
    private FieldOption [] IpVersionOptions;

    /**
    * IP类型可选项
    */
    @SerializedName("IpTypeOptions")
    @Expose
    private FieldOption [] IpTypeOptions;

    /**
    * 服务类型可选项
    */
    @SerializedName("AssetCategoryOptions")
    @Expose
    private FieldOption [] AssetCategoryOptions;

    /**
    * 识别来源可选项
    */
    @SerializedName("IdentificationSourceOptions")
    @Expose
    private FieldOption [] IdentificationSourceOptions;

    /**
    * 协议可选项
    */
    @SerializedName("ProtocolOptions")
    @Expose
    private FieldOption [] ProtocolOptions;

    /**
    * 实例类型可选项
    */
    @SerializedName("InstanceTypeOptions")
    @Expose
    private FieldOption [] InstanceTypeOptions;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 符合查询条件的总条数 
     * @return Total 符合查询条件的总条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 符合查询条件的总条数
     * @param Total 符合查询条件的总条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 查询结果列表 
     * @return Data 查询结果列表
     */
    public NDRAssetServiceInfo [] getData() {
        return this.Data;
    }

    /**
     * Set 查询结果列表
     * @param Data 查询结果列表
     */
    public void setData(NDRAssetServiceInfo [] Data) {
        this.Data = Data;
    }

    /**
     * Get 服务类型统计结果 
     * @return AssetCategoryStats 服务类型统计结果
     */
    public NDRAssetCategoryStats [] getAssetCategoryStats() {
        return this.AssetCategoryStats;
    }

    /**
     * Set 服务类型统计结果
     * @param AssetCategoryStats 服务类型统计结果
     */
    public void setAssetCategoryStats(NDRAssetCategoryStats [] AssetCategoryStats) {
        this.AssetCategoryStats = AssetCategoryStats;
    }

    /**
     * Get 地域可选项 
     * @return RegionOptions 地域可选项
     */
    public FieldOption [] getRegionOptions() {
        return this.RegionOptions;
    }

    /**
     * Set 地域可选项
     * @param RegionOptions 地域可选项
     */
    public void setRegionOptions(FieldOption [] RegionOptions) {
        this.RegionOptions = RegionOptions;
    }

    /**
     * Get IP版本可选项 
     * @return IpVersionOptions IP版本可选项
     */
    public FieldOption [] getIpVersionOptions() {
        return this.IpVersionOptions;
    }

    /**
     * Set IP版本可选项
     * @param IpVersionOptions IP版本可选项
     */
    public void setIpVersionOptions(FieldOption [] IpVersionOptions) {
        this.IpVersionOptions = IpVersionOptions;
    }

    /**
     * Get IP类型可选项 
     * @return IpTypeOptions IP类型可选项
     */
    public FieldOption [] getIpTypeOptions() {
        return this.IpTypeOptions;
    }

    /**
     * Set IP类型可选项
     * @param IpTypeOptions IP类型可选项
     */
    public void setIpTypeOptions(FieldOption [] IpTypeOptions) {
        this.IpTypeOptions = IpTypeOptions;
    }

    /**
     * Get 服务类型可选项 
     * @return AssetCategoryOptions 服务类型可选项
     */
    public FieldOption [] getAssetCategoryOptions() {
        return this.AssetCategoryOptions;
    }

    /**
     * Set 服务类型可选项
     * @param AssetCategoryOptions 服务类型可选项
     */
    public void setAssetCategoryOptions(FieldOption [] AssetCategoryOptions) {
        this.AssetCategoryOptions = AssetCategoryOptions;
    }

    /**
     * Get 识别来源可选项 
     * @return IdentificationSourceOptions 识别来源可选项
     */
    public FieldOption [] getIdentificationSourceOptions() {
        return this.IdentificationSourceOptions;
    }

    /**
     * Set 识别来源可选项
     * @param IdentificationSourceOptions 识别来源可选项
     */
    public void setIdentificationSourceOptions(FieldOption [] IdentificationSourceOptions) {
        this.IdentificationSourceOptions = IdentificationSourceOptions;
    }

    /**
     * Get 协议可选项 
     * @return ProtocolOptions 协议可选项
     */
    public FieldOption [] getProtocolOptions() {
        return this.ProtocolOptions;
    }

    /**
     * Set 协议可选项
     * @param ProtocolOptions 协议可选项
     */
    public void setProtocolOptions(FieldOption [] ProtocolOptions) {
        this.ProtocolOptions = ProtocolOptions;
    }

    /**
     * Get 实例类型可选项 
     * @return InstanceTypeOptions 实例类型可选项
     */
    public FieldOption [] getInstanceTypeOptions() {
        return this.InstanceTypeOptions;
    }

    /**
     * Set 实例类型可选项
     * @param InstanceTypeOptions 实例类型可选项
     */
    public void setInstanceTypeOptions(FieldOption [] InstanceTypeOptions) {
        this.InstanceTypeOptions = InstanceTypeOptions;
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

    public DescribeNDRAssetIdentificationListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeNDRAssetIdentificationListResponse(DescribeNDRAssetIdentificationListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Data != null) {
            this.Data = new NDRAssetServiceInfo[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new NDRAssetServiceInfo(source.Data[i]);
            }
        }
        if (source.AssetCategoryStats != null) {
            this.AssetCategoryStats = new NDRAssetCategoryStats[source.AssetCategoryStats.length];
            for (int i = 0; i < source.AssetCategoryStats.length; i++) {
                this.AssetCategoryStats[i] = new NDRAssetCategoryStats(source.AssetCategoryStats[i]);
            }
        }
        if (source.RegionOptions != null) {
            this.RegionOptions = new FieldOption[source.RegionOptions.length];
            for (int i = 0; i < source.RegionOptions.length; i++) {
                this.RegionOptions[i] = new FieldOption(source.RegionOptions[i]);
            }
        }
        if (source.IpVersionOptions != null) {
            this.IpVersionOptions = new FieldOption[source.IpVersionOptions.length];
            for (int i = 0; i < source.IpVersionOptions.length; i++) {
                this.IpVersionOptions[i] = new FieldOption(source.IpVersionOptions[i]);
            }
        }
        if (source.IpTypeOptions != null) {
            this.IpTypeOptions = new FieldOption[source.IpTypeOptions.length];
            for (int i = 0; i < source.IpTypeOptions.length; i++) {
                this.IpTypeOptions[i] = new FieldOption(source.IpTypeOptions[i]);
            }
        }
        if (source.AssetCategoryOptions != null) {
            this.AssetCategoryOptions = new FieldOption[source.AssetCategoryOptions.length];
            for (int i = 0; i < source.AssetCategoryOptions.length; i++) {
                this.AssetCategoryOptions[i] = new FieldOption(source.AssetCategoryOptions[i]);
            }
        }
        if (source.IdentificationSourceOptions != null) {
            this.IdentificationSourceOptions = new FieldOption[source.IdentificationSourceOptions.length];
            for (int i = 0; i < source.IdentificationSourceOptions.length; i++) {
                this.IdentificationSourceOptions[i] = new FieldOption(source.IdentificationSourceOptions[i]);
            }
        }
        if (source.ProtocolOptions != null) {
            this.ProtocolOptions = new FieldOption[source.ProtocolOptions.length];
            for (int i = 0; i < source.ProtocolOptions.length; i++) {
                this.ProtocolOptions[i] = new FieldOption(source.ProtocolOptions[i]);
            }
        }
        if (source.InstanceTypeOptions != null) {
            this.InstanceTypeOptions = new FieldOption[source.InstanceTypeOptions.length];
            for (int i = 0; i < source.InstanceTypeOptions.length; i++) {
                this.InstanceTypeOptions[i] = new FieldOption(source.InstanceTypeOptions[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "AssetCategoryStats.", this.AssetCategoryStats);
        this.setParamArrayObj(map, prefix + "RegionOptions.", this.RegionOptions);
        this.setParamArrayObj(map, prefix + "IpVersionOptions.", this.IpVersionOptions);
        this.setParamArrayObj(map, prefix + "IpTypeOptions.", this.IpTypeOptions);
        this.setParamArrayObj(map, prefix + "AssetCategoryOptions.", this.AssetCategoryOptions);
        this.setParamArrayObj(map, prefix + "IdentificationSourceOptions.", this.IdentificationSourceOptions);
        this.setParamArrayObj(map, prefix + "ProtocolOptions.", this.ProtocolOptions);
        this.setParamArrayObj(map, prefix + "InstanceTypeOptions.", this.InstanceTypeOptions);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

