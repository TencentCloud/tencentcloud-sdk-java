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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuleTemplate extends AbstractModel{

    /**
    * 规则模版ID
    */
    @SerializedName("RuleTemplateId")
    @Expose
    private Long RuleTemplateId;

    /**
    * 规则模版名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 规则模版描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 模版类型（1：系统模版，2：自定义）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * 规则适用的源数据对象类型（1：数值，2：字符串）
    */
    @SerializedName("SourceObjectDataType")
    @Expose
    private Long SourceObjectDataType;

    /**
    * 规则模版源侧内容，区分引擎，JSON 结构
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceContent")
    @Expose
    private String SourceContent;

    /**
    * 源数据适用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
    * 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * 规则支持的比较方式类型（1：固定值比较，大于、小于，大于等于等 2：波动值比较，绝对值、上升、下降）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareType")
    @Expose
    private Long CompareType;

    /**
    * 引用次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CitationCount")
    @Expose
    private Long CitationCount;

    /**
    * 创建人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserId")
    @Expose
    private Long UserId;

    /**
    * 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 更新时间yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否添加where参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WhereFlag")
    @Expose
    private Boolean WhereFlag;

    /**
    * 是否关联多个库表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MultiSourceFlag")
    @Expose
    private Boolean MultiSourceFlag;

    /**
    * 自定义模板SQL表达式
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SqlExpression")
    @Expose
    private String SqlExpression;

    /**
    * 模版子维度，0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubQualityDim")
    @Expose
    private Long SubQualityDim;

    /**
     * Get 规则模版ID 
     * @return RuleTemplateId 规则模版ID
     */
    public Long getRuleTemplateId() {
        return this.RuleTemplateId;
    }

    /**
     * Set 规则模版ID
     * @param RuleTemplateId 规则模版ID
     */
    public void setRuleTemplateId(Long RuleTemplateId) {
        this.RuleTemplateId = RuleTemplateId;
    }

    /**
     * Get 规则模版名称 
     * @return Name 规则模版名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 规则模版名称
     * @param Name 规则模版名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 规则模版描述 
     * @return Description 规则模版描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 规则模版描述
     * @param Description 规则模版描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 模版类型（1：系统模版，2：自定义） 
     * @return Type 模版类型（1：系统模版，2：自定义）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 模版类型（1：系统模版，2：自定义）
     * @param Type 模版类型（1：系统模版，2：自定义）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别） 
     * @return SourceObjectType 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
     * @param SourceObjectType 规则适用的源数据对象类型（1：常量，2：离线表级，3：离线字段级别）
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get 规则适用的源数据对象类型（1：数值，2：字符串） 
     * @return SourceObjectDataType 规则适用的源数据对象类型（1：数值，2：字符串）
     */
    public Long getSourceObjectDataType() {
        return this.SourceObjectDataType;
    }

    /**
     * Set 规则适用的源数据对象类型（1：数值，2：字符串）
     * @param SourceObjectDataType 规则适用的源数据对象类型（1：数值，2：字符串）
     */
    public void setSourceObjectDataType(Long SourceObjectDataType) {
        this.SourceObjectDataType = SourceObjectDataType;
    }

    /**
     * Get 规则模版源侧内容，区分引擎，JSON 结构
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceContent 规则模版源侧内容，区分引擎，JSON 结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceContent() {
        return this.SourceContent;
    }

    /**
     * Set 规则模版源侧内容，区分引擎，JSON 结构
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceContent 规则模版源侧内容，区分引擎，JSON 结构
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceContent(String SourceContent) {
        this.SourceContent = SourceContent;
    }

    /**
     * Get 源数据适用类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceEngineTypes 源数据适用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set 源数据适用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceEngineTypes 源数据适用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    /**
     * Get 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualityDim 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualityDim 规则所属质量维度（1：准确性，2：唯一性，3：完整性，4：一致性，5：及时性，6：有效性）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get 规则支持的比较方式类型（1：固定值比较，大于、小于，大于等于等 2：波动值比较，绝对值、上升、下降）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareType 规则支持的比较方式类型（1：固定值比较，大于、小于，大于等于等 2：波动值比较，绝对值、上升、下降）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCompareType() {
        return this.CompareType;
    }

    /**
     * Set 规则支持的比较方式类型（1：固定值比较，大于、小于，大于等于等 2：波动值比较，绝对值、上升、下降）
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareType 规则支持的比较方式类型（1：固定值比较，大于、小于，大于等于等 2：波动值比较，绝对值、上升、下降）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareType(Long CompareType) {
        this.CompareType = CompareType;
    }

    /**
     * Get 引用次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CitationCount 引用次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCitationCount() {
        return this.CitationCount;
    }

    /**
     * Set 引用次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CitationCount 引用次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCitationCount(Long CitationCount) {
        this.CitationCount = CitationCount;
    }

    /**
     * Get 创建人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserId 创建人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUserId() {
        return this.UserId;
    }

    /**
     * Set 创建人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserId 创建人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UserName 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * Set 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserName 创建人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * Get 更新时间yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间yyyy-MM-dd HH:mm:ss
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否添加where参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WhereFlag 是否添加where参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getWhereFlag() {
        return this.WhereFlag;
    }

    /**
     * Set 是否添加where参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param WhereFlag 是否添加where参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWhereFlag(Boolean WhereFlag) {
        this.WhereFlag = WhereFlag;
    }

    /**
     * Get 是否关联多个库表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MultiSourceFlag 是否关联多个库表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getMultiSourceFlag() {
        return this.MultiSourceFlag;
    }

    /**
     * Set 是否关联多个库表
注意：此字段可能返回 null，表示取不到有效值。
     * @param MultiSourceFlag 是否关联多个库表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMultiSourceFlag(Boolean MultiSourceFlag) {
        this.MultiSourceFlag = MultiSourceFlag;
    }

    /**
     * Get 自定义模板SQL表达式
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SqlExpression 自定义模板SQL表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSqlExpression() {
        return this.SqlExpression;
    }

    /**
     * Set 自定义模板SQL表达式
注意：此字段可能返回 null，表示取不到有效值。
     * @param SqlExpression 自定义模板SQL表达式
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSqlExpression(String SqlExpression) {
        this.SqlExpression = SqlExpression;
    }

    /**
     * Get 模版子维度，0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubQualityDim 模版子维度，0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubQualityDim() {
        return this.SubQualityDim;
    }

    /**
     * Set 模版子维度，0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubQualityDim 模版子维度，0.父维度类型,1.一致性: 枚举范围一致性,2.一致性：数值范围一致性,3.一致性：字段数据相关性
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubQualityDim(Long SubQualityDim) {
        this.SubQualityDim = SubQualityDim;
    }

    public RuleTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleTemplate(RuleTemplate source) {
        if (source.RuleTemplateId != null) {
            this.RuleTemplateId = new Long(source.RuleTemplateId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.SourceObjectType != null) {
            this.SourceObjectType = new Long(source.SourceObjectType);
        }
        if (source.SourceObjectDataType != null) {
            this.SourceObjectDataType = new Long(source.SourceObjectDataType);
        }
        if (source.SourceContent != null) {
            this.SourceContent = new String(source.SourceContent);
        }
        if (source.SourceEngineTypes != null) {
            this.SourceEngineTypes = new Long[source.SourceEngineTypes.length];
            for (int i = 0; i < source.SourceEngineTypes.length; i++) {
                this.SourceEngineTypes[i] = new Long(source.SourceEngineTypes[i]);
            }
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.CompareType != null) {
            this.CompareType = new Long(source.CompareType);
        }
        if (source.CitationCount != null) {
            this.CitationCount = new Long(source.CitationCount);
        }
        if (source.UserId != null) {
            this.UserId = new Long(source.UserId);
        }
        if (source.UserName != null) {
            this.UserName = new String(source.UserName);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.WhereFlag != null) {
            this.WhereFlag = new Boolean(source.WhereFlag);
        }
        if (source.MultiSourceFlag != null) {
            this.MultiSourceFlag = new Boolean(source.MultiSourceFlag);
        }
        if (source.SqlExpression != null) {
            this.SqlExpression = new String(source.SqlExpression);
        }
        if (source.SubQualityDim != null) {
            this.SubQualityDim = new Long(source.SubQualityDim);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleTemplateId", this.RuleTemplateId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "SourceObjectType", this.SourceObjectType);
        this.setParamSimple(map, prefix + "SourceObjectDataType", this.SourceObjectDataType);
        this.setParamSimple(map, prefix + "SourceContent", this.SourceContent);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "CompareType", this.CompareType);
        this.setParamSimple(map, prefix + "CitationCount", this.CitationCount);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "WhereFlag", this.WhereFlag);
        this.setParamSimple(map, prefix + "MultiSourceFlag", this.MultiSourceFlag);
        this.setParamSimple(map, prefix + "SqlExpression", this.SqlExpression);
        this.setParamSimple(map, prefix + "SubQualityDim", this.SubQualityDim);

    }
}

