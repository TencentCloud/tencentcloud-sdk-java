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

public class CreateBaselineAggregatedItemExportJobRequest extends AbstractModel {

    /**
    * <p>基线策略 ID 列表（可同时传多条做联合统计）。</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long [] PolicyID;

    /**
    * <p>基线系统父分类 ID。</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>基线子分类 ID。</p>
    */
    @SerializedName("CategoryID")
    @Expose
    private Long CategoryID;

    /**
    * <p>导出任务名称。不传时自动生成。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>导出类型，默认 RISK。<br>枚举值：<br>STATISTIC：导出统计结果<br>RISK：导出风险明细</p>
    */
    @SerializedName("ExportType")
    @Expose
    private String ExportType;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>通用过滤条件。支持的 Name：ResultStatus（通过状态 PASS/NOT_PASS）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>废弃</p>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
     * Get <p>基线策略 ID 列表（可同时传多条做联合统计）。</p> 
     * @return PolicyID <p>基线策略 ID 列表（可同时传多条做联合统计）。</p>
     */
    public Long [] getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>基线策略 ID 列表（可同时传多条做联合统计）。</p>
     * @param PolicyID <p>基线策略 ID 列表（可同时传多条做联合统计）。</p>
     */
    public void setPolicyID(Long [] PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>基线系统父分类 ID。</p> 
     * @return ParentCategoryID <p>基线系统父分类 ID。</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>基线系统父分类 ID。</p>
     * @param ParentCategoryID <p>基线系统父分类 ID。</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>基线子分类 ID。</p> 
     * @return CategoryID <p>基线子分类 ID。</p>
     */
    public Long getCategoryID() {
        return this.CategoryID;
    }

    /**
     * Set <p>基线子分类 ID。</p>
     * @param CategoryID <p>基线子分类 ID。</p>
     */
    public void setCategoryID(Long CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * Get <p>导出任务名称。不传时自动生成。</p> 
     * @return Name <p>导出任务名称。不传时自动生成。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>导出任务名称。不传时自动生成。</p>
     * @param Name <p>导出任务名称。不传时自动生成。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>导出类型，默认 RISK。<br>枚举值：<br>STATISTIC：导出统计结果<br>RISK：导出风险明细</p> 
     * @return ExportType <p>导出类型，默认 RISK。<br>枚举值：<br>STATISTIC：导出统计结果<br>RISK：导出风险明细</p>
     */
    public String getExportType() {
        return this.ExportType;
    }

    /**
     * Set <p>导出类型，默认 RISK。<br>枚举值：<br>STATISTIC：导出统计结果<br>RISK：导出风险明细</p>
     * @param ExportType <p>导出类型，默认 RISK。<br>枚举值：<br>STATISTIC：导出统计结果<br>RISK：导出风险明细</p>
     */
    public void setExportType(String ExportType) {
        this.ExportType = ExportType;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>通用过滤条件。支持的 Name：ResultStatus（通过状态 PASS/NOT_PASS）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p> 
     * @return Filters <p>通用过滤条件。支持的 Name：ResultStatus（通过状态 PASS/NOT_PASS）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <p>通用过滤条件。支持的 Name：ResultStatus（通过状态 PASS/NOT_PASS）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p>
     * @param Filters <p>通用过滤条件。支持的 Name：ResultStatus（通过状态 PASS/NOT_PASS）、Name（检测项名称，模糊搜索）、RiskLevel（风险等级 CRITICAL/HIGH/MEDIUM/LOW）、PolicyName（所属基线/策略名称，模糊搜索）。</p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>废弃</p> 
     * @return CheckAssetType <p>废弃</p>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>废弃</p>
     * @param CheckAssetType <p>废弃</p>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    public CreateBaselineAggregatedItemExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBaselineAggregatedItemExportJobRequest(CreateBaselineAggregatedItemExportJobRequest source) {
        if (source.PolicyID != null) {
            this.PolicyID = new Long[source.PolicyID.length];
            for (int i = 0; i < source.PolicyID.length; i++) {
                this.PolicyID[i] = new Long(source.PolicyID[i]);
            }
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.CategoryID != null) {
            this.CategoryID = new Long(source.CategoryID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ExportType != null) {
            this.ExportType = new String(source.ExportType);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "PolicyID.", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ExportType", this.ExportType);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);

    }
}

