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

public class ModifyRuleTemplateRequest extends AbstractModel{

    /**
    * 模版ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 模版类型  1.系统模版   2.自定义模版
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 模版名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 质量检测维度 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性
    */
    @SerializedName("QualityDim")
    @Expose
    private Long QualityDim;

    /**
    * 源端数据对象类型 1.常量  2.离线表级   2.离线字段级
    */
    @SerializedName("SourceObjectType")
    @Expose
    private Long SourceObjectType;

    /**
    * 描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 源端对应的引擎类型
    */
    @SerializedName("SourceEngineTypes")
    @Expose
    private Long [] SourceEngineTypes;

    /**
    * 是否关联其它库表
    */
    @SerializedName("MultiSourceFlag")
    @Expose
    private Boolean MultiSourceFlag;

    /**
    * SQL 表达式
    */
    @SerializedName("SqlExpression")
    @Expose
    private String SqlExpression;

    /**
    * 项目Id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否添加where参数
    */
    @SerializedName("WhereFlag")
    @Expose
    private Boolean WhereFlag;

    /**
     * Get 模版ID 
     * @return TemplateId 模版ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 模版ID
     * @param TemplateId 模版ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 模版类型  1.系统模版   2.自定义模版 
     * @return Type 模版类型  1.系统模版   2.自定义模版
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 模版类型  1.系统模版   2.自定义模版
     * @param Type 模版类型  1.系统模版   2.自定义模版
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 模版名称 
     * @return Name 模版名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 模版名称
     * @param Name 模版名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 质量检测维度 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性 
     * @return QualityDim 质量检测维度 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性
     */
    public Long getQualityDim() {
        return this.QualityDim;
    }

    /**
     * Set 质量检测维度 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性
     * @param QualityDim 质量检测维度 1.准确性 2.唯一性 3.完整性 4.一致性 5.及时性 6.有效性
     */
    public void setQualityDim(Long QualityDim) {
        this.QualityDim = QualityDim;
    }

    /**
     * Get 源端数据对象类型 1.常量  2.离线表级   2.离线字段级 
     * @return SourceObjectType 源端数据对象类型 1.常量  2.离线表级   2.离线字段级
     */
    public Long getSourceObjectType() {
        return this.SourceObjectType;
    }

    /**
     * Set 源端数据对象类型 1.常量  2.离线表级   2.离线字段级
     * @param SourceObjectType 源端数据对象类型 1.常量  2.离线表级   2.离线字段级
     */
    public void setSourceObjectType(Long SourceObjectType) {
        this.SourceObjectType = SourceObjectType;
    }

    /**
     * Get 描述 
     * @return Description 描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
     * @param Description 描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 源端对应的引擎类型 
     * @return SourceEngineTypes 源端对应的引擎类型
     */
    public Long [] getSourceEngineTypes() {
        return this.SourceEngineTypes;
    }

    /**
     * Set 源端对应的引擎类型
     * @param SourceEngineTypes 源端对应的引擎类型
     */
    public void setSourceEngineTypes(Long [] SourceEngineTypes) {
        this.SourceEngineTypes = SourceEngineTypes;
    }

    /**
     * Get 是否关联其它库表 
     * @return MultiSourceFlag 是否关联其它库表
     */
    public Boolean getMultiSourceFlag() {
        return this.MultiSourceFlag;
    }

    /**
     * Set 是否关联其它库表
     * @param MultiSourceFlag 是否关联其它库表
     */
    public void setMultiSourceFlag(Boolean MultiSourceFlag) {
        this.MultiSourceFlag = MultiSourceFlag;
    }

    /**
     * Get SQL 表达式 
     * @return SqlExpression SQL 表达式
     */
    public String getSqlExpression() {
        return this.SqlExpression;
    }

    /**
     * Set SQL 表达式
     * @param SqlExpression SQL 表达式
     */
    public void setSqlExpression(String SqlExpression) {
        this.SqlExpression = SqlExpression;
    }

    /**
     * Get 项目Id 
     * @return ProjectId 项目Id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目Id
     * @param ProjectId 项目Id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否添加where参数 
     * @return WhereFlag 是否添加where参数
     */
    public Boolean getWhereFlag() {
        return this.WhereFlag;
    }

    /**
     * Set 是否添加where参数
     * @param WhereFlag 是否添加where参数
     */
    public void setWhereFlag(Boolean WhereFlag) {
        this.WhereFlag = WhereFlag;
    }

    public ModifyRuleTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyRuleTemplateRequest(ModifyRuleTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.QualityDim != null) {
            this.QualityDim = new Long(source.QualityDim);
        }
        if (source.SourceObjectType != null) {
            this.SourceObjectType = new Long(source.SourceObjectType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.SourceEngineTypes != null) {
            this.SourceEngineTypes = new Long[source.SourceEngineTypes.length];
            for (int i = 0; i < source.SourceEngineTypes.length; i++) {
                this.SourceEngineTypes[i] = new Long(source.SourceEngineTypes[i]);
            }
        }
        if (source.MultiSourceFlag != null) {
            this.MultiSourceFlag = new Boolean(source.MultiSourceFlag);
        }
        if (source.SqlExpression != null) {
            this.SqlExpression = new String(source.SqlExpression);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.WhereFlag != null) {
            this.WhereFlag = new Boolean(source.WhereFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "QualityDim", this.QualityDim);
        this.setParamSimple(map, prefix + "SourceObjectType", this.SourceObjectType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamArraySimple(map, prefix + "SourceEngineTypes.", this.SourceEngineTypes);
        this.setParamSimple(map, prefix + "MultiSourceFlag", this.MultiSourceFlag);
        this.setParamSimple(map, prefix + "SqlExpression", this.SqlExpression);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "WhereFlag", this.WhereFlag);

    }
}

