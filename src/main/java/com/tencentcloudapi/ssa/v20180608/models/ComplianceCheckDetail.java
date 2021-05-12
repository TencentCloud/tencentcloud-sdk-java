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

public class ComplianceCheckDetail extends AbstractModel{

    /**
    * 检查项ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 检查项类别
    */
    @SerializedName("Category")
    @Expose
    private String Category;

    /**
    * 检查项类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 不通过总数
    */
    @SerializedName("ErrorCount")
    @Expose
    private Long ErrorCount;

    /**
    * 检查项英文名
    */
    @SerializedName("NameEn")
    @Expose
    private String NameEn;

    /**
    * 检查项名称
    */
    @SerializedName("CheckName")
    @Expose
    private String CheckName;

    /**
    * 检查项处置方式
    */
    @SerializedName("Method")
    @Expose
    private String Method;

    /**
    * 帮助文档
    */
    @SerializedName("Doc")
    @Expose
    private String Doc;

    /**
    * 通过总数
    */
    @SerializedName("SafeCount")
    @Expose
    private Long SafeCount;

    /**
    * 检查项检查内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 是否通过检测
    */
    @SerializedName("IsPass")
    @Expose
    private Long IsPass;

    /**
    * 忽略总数
    */
    @SerializedName("IgnoreCount")
    @Expose
    private Long IgnoreCount;

    /**
    * 风险总数
    */
    @SerializedName("RiskCount")
    @Expose
    private Long RiskCount;

    /**
    * 最近一次检测时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastCheckTime")
    @Expose
    private String LastCheckTime;

    /**
    * 资产组类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * res_count
    */
    @SerializedName("ResCount")
    @Expose
    private Long ResCount;

    /**
    * 检查项UUID
    */
    @SerializedName("UUID")
    @Expose
    private String UUID;

    /**
    * 标准项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StandardItem")
    @Expose
    private String StandardItem;

    /**
    * 章节
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Chapter")
    @Expose
    private String Chapter;

    /**
    * 资产类型描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetTypeDesc")
    @Expose
    private String AssetTypeDesc;

    /**
    * 是否忽略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsIgnore")
    @Expose
    private Long IsIgnore;

    /**
    * 风险项
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskItem")
    @Expose
    private String RiskItem;

    /**
    * 合规检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
     * Get 检查项ID 
     * @return Id 检查项ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 检查项ID
     * @param Id 检查项ID
     */
    public void setId(String Id) {
        this.Id = Id;
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
     * Get 不通过总数 
     * @return ErrorCount 不通过总数
     */
    public Long getErrorCount() {
        return this.ErrorCount;
    }

    /**
     * Set 不通过总数
     * @param ErrorCount 不通过总数
     */
    public void setErrorCount(Long ErrorCount) {
        this.ErrorCount = ErrorCount;
    }

    /**
     * Get 检查项英文名 
     * @return NameEn 检查项英文名
     */
    public String getNameEn() {
        return this.NameEn;
    }

    /**
     * Set 检查项英文名
     * @param NameEn 检查项英文名
     */
    public void setNameEn(String NameEn) {
        this.NameEn = NameEn;
    }

    /**
     * Get 检查项名称 
     * @return CheckName 检查项名称
     */
    public String getCheckName() {
        return this.CheckName;
    }

    /**
     * Set 检查项名称
     * @param CheckName 检查项名称
     */
    public void setCheckName(String CheckName) {
        this.CheckName = CheckName;
    }

    /**
     * Get 检查项处置方式 
     * @return Method 检查项处置方式
     */
    public String getMethod() {
        return this.Method;
    }

    /**
     * Set 检查项处置方式
     * @param Method 检查项处置方式
     */
    public void setMethod(String Method) {
        this.Method = Method;
    }

    /**
     * Get 帮助文档 
     * @return Doc 帮助文档
     */
    public String getDoc() {
        return this.Doc;
    }

    /**
     * Set 帮助文档
     * @param Doc 帮助文档
     */
    public void setDoc(String Doc) {
        this.Doc = Doc;
    }

    /**
     * Get 通过总数 
     * @return SafeCount 通过总数
     */
    public Long getSafeCount() {
        return this.SafeCount;
    }

    /**
     * Set 通过总数
     * @param SafeCount 通过总数
     */
    public void setSafeCount(Long SafeCount) {
        this.SafeCount = SafeCount;
    }

    /**
     * Get 检查项检查内容 
     * @return Content 检查项检查内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 检查项检查内容
     * @param Content 检查项检查内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 是否通过检测 
     * @return IsPass 是否通过检测
     */
    public Long getIsPass() {
        return this.IsPass;
    }

    /**
     * Set 是否通过检测
     * @param IsPass 是否通过检测
     */
    public void setIsPass(Long IsPass) {
        this.IsPass = IsPass;
    }

    /**
     * Get 忽略总数 
     * @return IgnoreCount 忽略总数
     */
    public Long getIgnoreCount() {
        return this.IgnoreCount;
    }

    /**
     * Set 忽略总数
     * @param IgnoreCount 忽略总数
     */
    public void setIgnoreCount(Long IgnoreCount) {
        this.IgnoreCount = IgnoreCount;
    }

    /**
     * Get 风险总数 
     * @return RiskCount 风险总数
     */
    public Long getRiskCount() {
        return this.RiskCount;
    }

    /**
     * Set 风险总数
     * @param RiskCount 风险总数
     */
    public void setRiskCount(Long RiskCount) {
        this.RiskCount = RiskCount;
    }

    /**
     * Get 最近一次检测时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastCheckTime 最近一次检测时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastCheckTime() {
        return this.LastCheckTime;
    }

    /**
     * Set 最近一次检测时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastCheckTime 最近一次检测时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastCheckTime(String LastCheckTime) {
        this.LastCheckTime = LastCheckTime;
    }

    /**
     * Get 资产组类型 
     * @return AssetType 资产组类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产组类型
     * @param AssetType 资产组类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get res_count 
     * @return ResCount res_count
     */
    public Long getResCount() {
        return this.ResCount;
    }

    /**
     * Set res_count
     * @param ResCount res_count
     */
    public void setResCount(Long ResCount) {
        this.ResCount = ResCount;
    }

    /**
     * Get 检查项UUID 
     * @return UUID 检查项UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * Set 检查项UUID
     * @param UUID 检查项UUID
     */
    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    /**
     * Get 标准项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StandardItem 标准项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStandardItem() {
        return this.StandardItem;
    }

    /**
     * Set 标准项
注意：此字段可能返回 null，表示取不到有效值。
     * @param StandardItem 标准项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStandardItem(String StandardItem) {
        this.StandardItem = StandardItem;
    }

    /**
     * Get 章节
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Chapter 章节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChapter() {
        return this.Chapter;
    }

    /**
     * Set 章节
注意：此字段可能返回 null，表示取不到有效值。
     * @param Chapter 章节
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChapter(String Chapter) {
        this.Chapter = Chapter;
    }

    /**
     * Get 资产类型描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetTypeDesc 资产类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetTypeDesc() {
        return this.AssetTypeDesc;
    }

    /**
     * Set 资产类型描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetTypeDesc 资产类型描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetTypeDesc(String AssetTypeDesc) {
        this.AssetTypeDesc = AssetTypeDesc;
    }

    /**
     * Get 是否忽略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsIgnore 是否忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsIgnore() {
        return this.IsIgnore;
    }

    /**
     * Set 是否忽略
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsIgnore 是否忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsIgnore(Long IsIgnore) {
        this.IsIgnore = IsIgnore;
    }

    /**
     * Get 风险项
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskItem 风险项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskItem() {
        return this.RiskItem;
    }

    /**
     * Set 风险项
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskItem 风险项
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskItem(String RiskItem) {
        this.RiskItem = RiskItem;
    }

    /**
     * Get 合规检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Title 合规检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 合规检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Title 合规检查项完整名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    public ComplianceCheckDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComplianceCheckDetail(ComplianceCheckDetail source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Category != null) {
            this.Category = new String(source.Category);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ErrorCount != null) {
            this.ErrorCount = new Long(source.ErrorCount);
        }
        if (source.NameEn != null) {
            this.NameEn = new String(source.NameEn);
        }
        if (source.CheckName != null) {
            this.CheckName = new String(source.CheckName);
        }
        if (source.Method != null) {
            this.Method = new String(source.Method);
        }
        if (source.Doc != null) {
            this.Doc = new String(source.Doc);
        }
        if (source.SafeCount != null) {
            this.SafeCount = new Long(source.SafeCount);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.IsPass != null) {
            this.IsPass = new Long(source.IsPass);
        }
        if (source.IgnoreCount != null) {
            this.IgnoreCount = new Long(source.IgnoreCount);
        }
        if (source.RiskCount != null) {
            this.RiskCount = new Long(source.RiskCount);
        }
        if (source.LastCheckTime != null) {
            this.LastCheckTime = new String(source.LastCheckTime);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.ResCount != null) {
            this.ResCount = new Long(source.ResCount);
        }
        if (source.UUID != null) {
            this.UUID = new String(source.UUID);
        }
        if (source.StandardItem != null) {
            this.StandardItem = new String(source.StandardItem);
        }
        if (source.Chapter != null) {
            this.Chapter = new String(source.Chapter);
        }
        if (source.AssetTypeDesc != null) {
            this.AssetTypeDesc = new String(source.AssetTypeDesc);
        }
        if (source.IsIgnore != null) {
            this.IsIgnore = new Long(source.IsIgnore);
        }
        if (source.RiskItem != null) {
            this.RiskItem = new String(source.RiskItem);
        }
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Category", this.Category);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ErrorCount", this.ErrorCount);
        this.setParamSimple(map, prefix + "NameEn", this.NameEn);
        this.setParamSimple(map, prefix + "CheckName", this.CheckName);
        this.setParamSimple(map, prefix + "Method", this.Method);
        this.setParamSimple(map, prefix + "Doc", this.Doc);
        this.setParamSimple(map, prefix + "SafeCount", this.SafeCount);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "IsPass", this.IsPass);
        this.setParamSimple(map, prefix + "IgnoreCount", this.IgnoreCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "LastCheckTime", this.LastCheckTime);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "ResCount", this.ResCount);
        this.setParamSimple(map, prefix + "UUID", this.UUID);
        this.setParamSimple(map, prefix + "StandardItem", this.StandardItem);
        this.setParamSimple(map, prefix + "Chapter", this.Chapter);
        this.setParamSimple(map, prefix + "AssetTypeDesc", this.AssetTypeDesc);
        this.setParamSimple(map, prefix + "IsIgnore", this.IsIgnore);
        this.setParamSimple(map, prefix + "RiskItem", this.RiskItem);
        this.setParamSimple(map, prefix + "Title", this.Title);

    }
}

