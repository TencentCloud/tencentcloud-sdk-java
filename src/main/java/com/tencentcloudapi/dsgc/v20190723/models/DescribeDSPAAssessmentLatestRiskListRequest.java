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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDSPAAssessmentLatestRiskListRequest extends AbstractModel{

    /**
    * dspa实例Id
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 评估模版id
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 限制条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 资产名称，数据源id
    */
    @SerializedName("DataSourceId")
    @Expose
    private String DataSourceId;

    /**
    * 风险类型
    */
    @SerializedName("RiskType")
    @Expose
    private String RiskType;

    /**
    * 风险项
    */
    @SerializedName("ControlItemId")
    @Expose
    private String ControlItemId;

    /**
    * 风险状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 扫描开始时间
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 扫描结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 风险等级筛选
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 风险面筛选
    */
    @SerializedName("RiskSide")
    @Expose
    private String [] RiskSide;

    /**
     * Get dspa实例Id 
     * @return DspaId dspa实例Id
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set dspa实例Id
     * @param DspaId dspa实例Id
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 评估模版id 
     * @return TemplateId 评估模版id
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 评估模版id
     * @param TemplateId 评估模版id
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 限制条数 
     * @return Limit 限制条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制条数
     * @param Limit 限制条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量 
     * @return Offset 分页偏移量
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量
     * @param Offset 分页偏移量
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 资产名称，数据源id 
     * @return DataSourceId 资产名称，数据源id
     */
    public String getDataSourceId() {
        return this.DataSourceId;
    }

    /**
     * Set 资产名称，数据源id
     * @param DataSourceId 资产名称，数据源id
     */
    public void setDataSourceId(String DataSourceId) {
        this.DataSourceId = DataSourceId;
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
     * Get 风险项 
     * @return ControlItemId 风险项
     */
    public String getControlItemId() {
        return this.ControlItemId;
    }

    /**
     * Set 风险项
     * @param ControlItemId 风险项
     */
    public void setControlItemId(String ControlItemId) {
        this.ControlItemId = ControlItemId;
    }

    /**
     * Get 风险状态 
     * @return Status 风险状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 风险状态
     * @param Status 风险状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 扫描开始时间 
     * @return BeginTime 扫描开始时间
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 扫描开始时间
     * @param BeginTime 扫描开始时间
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 扫描结束时间 
     * @return EndTime 扫描结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 扫描结束时间
     * @param EndTime 扫描结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 风险等级筛选 
     * @return RiskLevel 风险等级筛选
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 风险等级筛选
     * @param RiskLevel 风险等级筛选
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 风险面筛选 
     * @return RiskSide 风险面筛选
     */
    public String [] getRiskSide() {
        return this.RiskSide;
    }

    /**
     * Set 风险面筛选
     * @param RiskSide 风险面筛选
     */
    public void setRiskSide(String [] RiskSide) {
        this.RiskSide = RiskSide;
    }

    public DescribeDSPAAssessmentLatestRiskListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentLatestRiskListRequest(DescribeDSPAAssessmentLatestRiskListRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new String(source.Offset);
        }
        if (source.DataSourceId != null) {
            this.DataSourceId = new String(source.DataSourceId);
        }
        if (source.RiskType != null) {
            this.RiskType = new String(source.RiskType);
        }
        if (source.ControlItemId != null) {
            this.ControlItemId = new String(source.ControlItemId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.RiskSide != null) {
            this.RiskSide = new String[source.RiskSide.length];
            for (int i = 0; i < source.RiskSide.length; i++) {
                this.RiskSide[i] = new String(source.RiskSide[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "DataSourceId", this.DataSourceId);
        this.setParamSimple(map, prefix + "RiskType", this.RiskType);
        this.setParamSimple(map, prefix + "ControlItemId", this.ControlItemId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamArraySimple(map, prefix + "RiskSide.", this.RiskSide);

    }
}

