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

public class BaselineAggregatedPolicy extends AbstractModel {

    /**
    * <p>系统策略所属父分类 ID（仅 PolicyType=SYSTEM 时聚合使用，自定义策略为 0）。</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>本次聚合涉及的基线策略 ID 列表。</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long [] PolicyID;

    /**
    * <p>策略名称（自定义策略为用户输入，系统策略为内置分类名）。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>策略描述。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>策略已配置的检测项数量。</p>
    */
    @SerializedName("ConfItemCount")
    @Expose
    private Long ConfItemCount;

    /**
    * <p>本策略下结果为 PASS 的检测项数量。</p>
    */
    @SerializedName("PassItemCount")
    @Expose
    private Long PassItemCount;

    /**
    * <p>本策略下结果为 NOT_PASS 的检测项数量。</p>
    */
    @SerializedName("NotPassItemCount")
    @Expose
    private Long NotPassItemCount;

    /**
    * <p>未通过检测项按风险等级（LOW/MEDIUM/HIGH/CRITICAL）的分布统计。</p>
    */
    @SerializedName("NotPassItemRiskLevelStatistic")
    @Expose
    private BaselineRiskLevelStatistic [] NotPassItemRiskLevelStatistic;

    /**
    * <p>本策略最近一次扫描的通过率，单位为百分比（0~100），保留两位小数。</p>
    */
    @SerializedName("PassRate")
    @Expose
    private Float PassRate;

    /**
    * <p>该策略下各子分类的扫描结果统计明细。</p>
    */
    @SerializedName("CategoryStatistic")
    @Expose
    private BaselineAggregatedCategory [] CategoryStatistic;

    /**
    * <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
    */
    @SerializedName("CheckAssetType")
    @Expose
    private String CheckAssetType;

    /**
    * <p>该基线类别是否被扫描过</p>
    */
    @SerializedName("Scanned")
    @Expose
    private Boolean Scanned;

    /**
     * Get <p>系统策略所属父分类 ID（仅 PolicyType=SYSTEM 时聚合使用，自定义策略为 0）。</p> 
     * @return ParentCategoryID <p>系统策略所属父分类 ID（仅 PolicyType=SYSTEM 时聚合使用，自定义策略为 0）。</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>系统策略所属父分类 ID（仅 PolicyType=SYSTEM 时聚合使用，自定义策略为 0）。</p>
     * @param ParentCategoryID <p>系统策略所属父分类 ID（仅 PolicyType=SYSTEM 时聚合使用，自定义策略为 0）。</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>本次聚合涉及的基线策略 ID 列表。</p> 
     * @return PolicyID <p>本次聚合涉及的基线策略 ID 列表。</p>
     */
    public Long [] getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>本次聚合涉及的基线策略 ID 列表。</p>
     * @param PolicyID <p>本次聚合涉及的基线策略 ID 列表。</p>
     */
    public void setPolicyID(Long [] PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>策略名称（自定义策略为用户输入，系统策略为内置分类名）。</p> 
     * @return Name <p>策略名称（自定义策略为用户输入，系统策略为内置分类名）。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>策略名称（自定义策略为用户输入，系统策略为内置分类名）。</p>
     * @param Name <p>策略名称（自定义策略为用户输入，系统策略为内置分类名）。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>策略描述。</p> 
     * @return Description <p>策略描述。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>策略描述。</p>
     * @param Description <p>策略描述。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>策略已配置的检测项数量。</p> 
     * @return ConfItemCount <p>策略已配置的检测项数量。</p>
     */
    public Long getConfItemCount() {
        return this.ConfItemCount;
    }

    /**
     * Set <p>策略已配置的检测项数量。</p>
     * @param ConfItemCount <p>策略已配置的检测项数量。</p>
     */
    public void setConfItemCount(Long ConfItemCount) {
        this.ConfItemCount = ConfItemCount;
    }

    /**
     * Get <p>本策略下结果为 PASS 的检测项数量。</p> 
     * @return PassItemCount <p>本策略下结果为 PASS 的检测项数量。</p>
     */
    public Long getPassItemCount() {
        return this.PassItemCount;
    }

    /**
     * Set <p>本策略下结果为 PASS 的检测项数量。</p>
     * @param PassItemCount <p>本策略下结果为 PASS 的检测项数量。</p>
     */
    public void setPassItemCount(Long PassItemCount) {
        this.PassItemCount = PassItemCount;
    }

    /**
     * Get <p>本策略下结果为 NOT_PASS 的检测项数量。</p> 
     * @return NotPassItemCount <p>本策略下结果为 NOT_PASS 的检测项数量。</p>
     */
    public Long getNotPassItemCount() {
        return this.NotPassItemCount;
    }

    /**
     * Set <p>本策略下结果为 NOT_PASS 的检测项数量。</p>
     * @param NotPassItemCount <p>本策略下结果为 NOT_PASS 的检测项数量。</p>
     */
    public void setNotPassItemCount(Long NotPassItemCount) {
        this.NotPassItemCount = NotPassItemCount;
    }

    /**
     * Get <p>未通过检测项按风险等级（LOW/MEDIUM/HIGH/CRITICAL）的分布统计。</p> 
     * @return NotPassItemRiskLevelStatistic <p>未通过检测项按风险等级（LOW/MEDIUM/HIGH/CRITICAL）的分布统计。</p>
     */
    public BaselineRiskLevelStatistic [] getNotPassItemRiskLevelStatistic() {
        return this.NotPassItemRiskLevelStatistic;
    }

    /**
     * Set <p>未通过检测项按风险等级（LOW/MEDIUM/HIGH/CRITICAL）的分布统计。</p>
     * @param NotPassItemRiskLevelStatistic <p>未通过检测项按风险等级（LOW/MEDIUM/HIGH/CRITICAL）的分布统计。</p>
     */
    public void setNotPassItemRiskLevelStatistic(BaselineRiskLevelStatistic [] NotPassItemRiskLevelStatistic) {
        this.NotPassItemRiskLevelStatistic = NotPassItemRiskLevelStatistic;
    }

    /**
     * Get <p>本策略最近一次扫描的通过率，单位为百分比（0~100），保留两位小数。</p> 
     * @return PassRate <p>本策略最近一次扫描的通过率，单位为百分比（0~100），保留两位小数。</p>
     */
    public Float getPassRate() {
        return this.PassRate;
    }

    /**
     * Set <p>本策略最近一次扫描的通过率，单位为百分比（0~100），保留两位小数。</p>
     * @param PassRate <p>本策略最近一次扫描的通过率，单位为百分比（0~100），保留两位小数。</p>
     */
    public void setPassRate(Float PassRate) {
        this.PassRate = PassRate;
    }

    /**
     * Get <p>该策略下各子分类的扫描结果统计明细。</p> 
     * @return CategoryStatistic <p>该策略下各子分类的扫描结果统计明细。</p>
     */
    public BaselineAggregatedCategory [] getCategoryStatistic() {
        return this.CategoryStatistic;
    }

    /**
     * Set <p>该策略下各子分类的扫描结果统计明细。</p>
     * @param CategoryStatistic <p>该策略下各子分类的扫描结果统计明细。</p>
     */
    public void setCategoryStatistic(BaselineAggregatedCategory [] CategoryStatistic) {
        this.CategoryStatistic = CategoryStatistic;
    }

    /**
     * Get <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul> 
     * @return PolicyType <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     * @param PolicyType <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul> 
     * @return CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public String getCheckAssetType() {
        return this.CheckAssetType;
    }

    /**
     * Set <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     * @param CheckAssetType <p>检测资产大类，区分主机基线与容器集群基线。取值：</p><ul><li>HOST：主机</li><li>CLUSTER：容器集群</li></ul>
     */
    public void setCheckAssetType(String CheckAssetType) {
        this.CheckAssetType = CheckAssetType;
    }

    /**
     * Get <p>该基线类别是否被扫描过</p> 
     * @return Scanned <p>该基线类别是否被扫描过</p>
     */
    public Boolean getScanned() {
        return this.Scanned;
    }

    /**
     * Set <p>该基线类别是否被扫描过</p>
     * @param Scanned <p>该基线类别是否被扫描过</p>
     */
    public void setScanned(Boolean Scanned) {
        this.Scanned = Scanned;
    }

    public BaselineAggregatedPolicy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BaselineAggregatedPolicy(BaselineAggregatedPolicy source) {
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.PolicyID != null) {
            this.PolicyID = new Long[source.PolicyID.length];
            for (int i = 0; i < source.PolicyID.length; i++) {
                this.PolicyID[i] = new Long(source.PolicyID[i]);
            }
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ConfItemCount != null) {
            this.ConfItemCount = new Long(source.ConfItemCount);
        }
        if (source.PassItemCount != null) {
            this.PassItemCount = new Long(source.PassItemCount);
        }
        if (source.NotPassItemCount != null) {
            this.NotPassItemCount = new Long(source.NotPassItemCount);
        }
        if (source.NotPassItemRiskLevelStatistic != null) {
            this.NotPassItemRiskLevelStatistic = new BaselineRiskLevelStatistic[source.NotPassItemRiskLevelStatistic.length];
            for (int i = 0; i < source.NotPassItemRiskLevelStatistic.length; i++) {
                this.NotPassItemRiskLevelStatistic[i] = new BaselineRiskLevelStatistic(source.NotPassItemRiskLevelStatistic[i]);
            }
        }
        if (source.PassRate != null) {
            this.PassRate = new Float(source.PassRate);
        }
        if (source.CategoryStatistic != null) {
            this.CategoryStatistic = new BaselineAggregatedCategory[source.CategoryStatistic.length];
            for (int i = 0; i < source.CategoryStatistic.length; i++) {
                this.CategoryStatistic[i] = new BaselineAggregatedCategory(source.CategoryStatistic[i]);
            }
        }
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.CheckAssetType != null) {
            this.CheckAssetType = new String(source.CheckAssetType);
        }
        if (source.Scanned != null) {
            this.Scanned = new Boolean(source.Scanned);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamArraySimple(map, prefix + "PolicyID.", this.PolicyID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ConfItemCount", this.ConfItemCount);
        this.setParamSimple(map, prefix + "PassItemCount", this.PassItemCount);
        this.setParamSimple(map, prefix + "NotPassItemCount", this.NotPassItemCount);
        this.setParamArrayObj(map, prefix + "NotPassItemRiskLevelStatistic.", this.NotPassItemRiskLevelStatistic);
        this.setParamSimple(map, prefix + "PassRate", this.PassRate);
        this.setParamArrayObj(map, prefix + "CategoryStatistic.", this.CategoryStatistic);
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "CheckAssetType", this.CheckAssetType);
        this.setParamSimple(map, prefix + "Scanned", this.Scanned);

    }
}

