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
package com.tencentcloudapi.ssa.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataCompliance extends AbstractModel{

    /**
    * 等保唯一标识符
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 检查项唯一标识符
    */
    @SerializedName("CheckItemId")
    @Expose
    private String CheckItemId;

    /**
    * 检查项名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 检查项资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 检查项类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 检查项类别
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 检查项标准项
    */
    @SerializedName("StandardItem")
    @Expose
    private String StandardItem;

    /**
    * 检查项章节号
    */
    @SerializedName("Chapter")
    @Expose
    private String Chapter;

    /**
    * 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsChecked")
    @Expose
    private Long IsChecked;

    /**
    * 检查项风险项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskItem")
    @Expose
    private String RiskItem;

    /**
    * 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIgnored")
    @Expose
    private Long IsIgnored;

    /**
    * 等保检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 资产总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetTotal")
    @Expose
    private Long AssetTotal;

    /**
    * 忽略内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remarks")
    @Expose
    private String Remarks;

    /**
     * Get 等保唯一标识符 
     * @return Id 等保唯一标识符
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 等保唯一标识符
     * @param Id 等保唯一标识符
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 检查项唯一标识符 
     * @return CheckItemId 检查项唯一标识符
     */
    public String getCheckItemId() {
        return this.CheckItemId;
    }

    /**
     * Set 检查项唯一标识符
     * @param CheckItemId 检查项唯一标识符
     */
    public void setCheckItemId(String CheckItemId) {
        this.CheckItemId = CheckItemId;
    }

    /**
     * Get 检查项名称 
     * @return Name 检查项名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 检查项名称
     * @param Name 检查项名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 检查项资产类型 
     * @return AssetType 检查项资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 检查项资产类型
     * @param AssetType 检查项资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 检查项类型 
     * @return Type 检查项类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 检查项类型
     * @param Type 检查项类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 检查项类别 
     * @return Category 检查项类别
     */
    public String getCategory() {
        return this.Category;
    }

    /**
     * Set 检查项类别
     * @param Category 检查项类别
     */
    public void setCategory(String Category) {
        this.Category = Category;
    }

    /**
     * Get 检查项标准项 
     * @return StandardItem 检查项标准项
     */
    public String getStandardItem() {
        return this.StandardItem;
    }

    /**
     * Set 检查项标准项
     * @param StandardItem 检查项标准项
     */
    public void setStandardItem(String StandardItem) {
        this.StandardItem = StandardItem;
    }

    /**
     * Get 检查项章节号 
     * @return Chapter 检查项章节号
     */
    public String getChapter() {
        return this.Chapter;
    }

    /**
     * Set 检查项章节号
     * @param Chapter 检查项章节号
     */
    public void setChapter(String Chapter) {
        this.Chapter = Chapter;
    }

    /**
     * Get 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastCheckTime 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastCheckTime 最近一次检查时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 初始未检测状态0, 已通过为1，未通过为2
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskCount 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskCount 有风险的资源总数，未通过数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsChecked 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsChecked() {
        return this.IsChecked;
    }

    /**
     * Set 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsChecked 0-检测中,1-结束检测
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsChecked(Long IsChecked) {
        this.IsChecked = IsChecked;
    }

    /**
     * Get 检查项风险项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskItem 检查项风险项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskItem() {
        return this.RiskItem;
    }

    /**
     * Set 检查项风险项
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskItem 检查项风险项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskItem(String RiskItem) {
        this.RiskItem = RiskItem;
    }

    /**
     * Get 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIgnored 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsIgnored() {
        return this.IsIgnored;
    }

    /**
     * Set 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIgnored 0-未忽略,1-已忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIgnored(Long IsIgnored) {
        this.IsIgnored = IsIgnored;
    }

    /**
     * Get 等保检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 等保检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 等保检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 等保检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 资产总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetTotal 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAssetTotal() {
        return this.AssetTotal;
    }

    /**
     * Set 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetTotal 资产总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetTotal(Long AssetTotal) {
        this.AssetTotal = AssetTotal;
    }

    /**
     * Get 忽略内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remarks 忽略内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemarks() {
        return this.Remarks;
    }

    /**
     * Set 忽略内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remarks 忽略内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemarks(String Remarks) {
        this.Remarks = Remarks;
    }

    public DataCompliance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataCompliance(DataCompliance source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.CheckItemId != null) {
            this.CheckItemId = new String(source.CheckItemId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.StandardItem != null) {
            this.StandardItem = new String(source.StandardItem);
        }
        if (source.Chapter != null) {
            this.Chapter = new String(source.Chapter);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.IsChecked != null) {
            this.IsChecked = new Long(source.IsChecked);
        }
        if (source.RiskItem != null) {
            this.RiskItem = new String(source.RiskItem);
        }
        if (source.IsIgnored != null) {
            this.IsIgnored = new Long(source.IsIgnored);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.AssetTotal != null) {
            this.AssetTotal = new Long(source.AssetTotal);
        }
        if (source.Remarks != null) {
            this.Remarks = new String(source.Remarks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CheckItemId", this.CheckItemId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "StandardItem", this.StandardItem);
        this.setParamSimple(map, prefix + "Chapter", this.Chapter);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "IsChecked", this.IsChecked);
        this.setParamSimple(map, prefix + "RiskItem", this.RiskItem);
        this.setParamSimple(map, prefix + "IsIgnored", this.IsIgnored);
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamSimple(map, prefix + "AssetTotal", this.AssetTotal);
        this.setParamSimple(map, prefix + "Remarks", this.Remarks);

    }
}

