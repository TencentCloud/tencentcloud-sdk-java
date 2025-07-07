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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HighRiskAssetsDetail extends AbstractModel {

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据源类型
    */
    @SerializedName("DataSourceType")
    @Expose
    private String DataSourceType;

    /**
    * 数据源名称
    */
    @SerializedName("DataSourceName")
    @Expose
    private String DataSourceName;

    /**
    * 资产对象名称
    */
    @SerializedName("AssetsName")
    @Expose
    private String AssetsName;

    /**
    * 高风险个数
    */
    @SerializedName("HighRiskCount")
    @Expose
    private Long HighRiskCount;

    /**
    * 风险类型
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 总的风险个数
    */
    @SerializedName("TotalRiskCount")
    @Expose
    private Long TotalRiskCount;

    /**
    * 风险面
    */
    @SerializedName("RiskSide")
    @Expose
    private String RiskSide;

    /**
    * 地域
    */
    @SerializedName("ResourceRegion")
    @Expose
    private String ResourceRegion;

    /**
     * Get 实例id 
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据源类型 
     * @return DataSourceType 数据源类型
     */
    public String getDataSourceType() {
        return this.DataSourceType;
    }

    /**
     * Set 数据源类型
     * @param DataSourceType 数据源类型
     */
    public void setDataSourceType(String DataSourceType) {
        this.DataSourceType = DataSourceType;
    }

    /**
     * Get 数据源名称 
     * @return DataSourceName 数据源名称
     */
    public String getDataSourceName() {
        return this.DataSourceName;
    }

    /**
     * Set 数据源名称
     * @param DataSourceName 数据源名称
     */
    public void setDataSourceName(String DataSourceName) {
        this.DataSourceName = DataSourceName;
    }

    /**
     * Get 资产对象名称 
     * @return AssetsName 资产对象名称
     */
    public String getAssetsName() {
        return this.AssetsName;
    }

    /**
     * Set 资产对象名称
     * @param AssetsName 资产对象名称
     */
    public void setAssetsName(String AssetsName) {
        this.AssetsName = AssetsName;
    }

    /**
     * Get 高风险个数 
     * @return HighRiskCount 高风险个数
     */
    public Long getHighRiskCount() {
        return this.HighRiskCount;
    }

    /**
     * Set 高风险个数
     * @param HighRiskCount 高风险个数
     */
    public void setHighRiskCount(Long HighRiskCount) {
        this.HighRiskCount = HighRiskCount;
    }

    /**
     * Get 风险类型 
     * @return RiskType 风险类型
     */
    public String getRiskType() {
        return this.RiskType;
    }

    /**
     * Set 风险类型
     * @param RiskType 风险类型
     */
    public void setRiskType(String RiskType) {
        this.RiskType = RiskType;
    }

    /**
     * Get 总的风险个数 
     * @return TotalRiskCount 总的风险个数
     */
    public Long getTotalRiskCount() {
        return this.TotalRiskCount;
    }

    /**
     * Set 总的风险个数
     * @param TotalRiskCount 总的风险个数
     */
    public void setTotalRiskCount(Long TotalRiskCount) {
        this.TotalRiskCount = TotalRiskCount;
    }

    /**
     * Get 风险面 
     * @return RiskSide 风险面
     */
    public String getRiskSide() {
        return this.RiskSide;
    }

    /**
     * Set 风险面
     * @param RiskSide 风险面
     */
    public void setRiskSide(String RiskSide) {
        this.RiskSide = RiskSide;
    }

    /**
     * Get 地域 
     * @return ResourceRegion 地域
     */
    public String getResourceRegion() {
        return this.ResourceRegion;
    }

    /**
     * Set 地域
     * @param ResourceRegion 地域
     */
    public void setResourceRegion(String ResourceRegion) {
        this.ResourceRegion = ResourceRegion;
    }

    public HighRiskAssetsDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HighRiskAssetsDetail(HighRiskAssetsDetail source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DataSourceType != null) {
            this.DataSourceType = new String(source.DataSourceType);
        }
        if (source.DataSourceName != null) {
            this.DataSourceName = new String(source.DataSourceName);
        }
        if (source.AssetsName != null) {
            this.AssetsName = new String(source.AssetsName);
        }
        if (source.HighRiskCount != null) {
            this.HighRiskCount = new Long(source.HighRiskCount);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.TotalRiskCount != null) {
            this.TotalRiskCount = new Long(source.TotalRiskCount);
        }
        if (source.RiskSide != null) {
            this.RiskSide = new String(source.RiskSide);
        }
        if (source.ResourceRegion != null) {
            this.ResourceRegion = new String(source.ResourceRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DataSourceType", this.DataSourceType);
        this.setParamSimple(map, prefix + "DataSourceName", this.DataSourceName);
        this.setParamSimple(map, prefix + "AssetsName", this.AssetsName);
        this.setParamSimple(map, prefix + "HighRiskCount", this.HighRiskCount);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "TotalRiskCount", this.TotalRiskCount);
        this.setParamSimple(map, prefix + "RiskSide", this.RiskSide);
        this.setParamSimple(map, prefix + "ResourceRegion", this.ResourceRegion);

    }
}

