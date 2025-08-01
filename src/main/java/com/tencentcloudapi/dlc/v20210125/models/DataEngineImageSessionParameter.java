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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineImageSessionParameter extends AbstractModel {

    /**
    * 配置id
    */
    @SerializedName("ParameterId")
    @Expose
    private String ParameterId;

    /**
    * 小版本镜像ID
    */
    @SerializedName("ChildImageVersionId")
    @Expose
    private String ChildImageVersionId;

    /**
    * 集群类型：SparkSQL/PrestoSQL/SparkBatch
    */
    @SerializedName("EngineType")
    @Expose
    private String EngineType;

    /**
    * 参数key
    */
    @SerializedName("KeyName")
    @Expose
    private String KeyName;

    /**
    * Key描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KeyDescription")
    @Expose
    private String KeyDescription;

    /**
    * value类型
    */
    @SerializedName("ValueType")
    @Expose
    private String ValueType;

    /**
    * value长度限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueLengthLimit")
    @Expose
    private String ValueLengthLimit;

    /**
    * value正则限制
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueRegexpLimit")
    @Expose
    private String ValueRegexpLimit;

    /**
    * value默认值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ValueDefault")
    @Expose
    private String ValueDefault;

    /**
    * 是否为公共版本：1：公共；2：私有
    */
    @SerializedName("IsPublic")
    @Expose
    private Long IsPublic;

    /**
    * 配置类型：1：session配置（默认）；2：common配置；3：cluster配置
    */
    @SerializedName("ParameterType")
    @Expose
    private Long ParameterType;

    /**
    * 提交方式：User(用户)、BackGround（后台）
    */
    @SerializedName("SubmitMethod")
    @Expose
    private String SubmitMethod;

    /**
    * 操作者
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 插入时间
    */
    @SerializedName("InsertTime")
    @Expose
    private String InsertTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 配置id 
     * @return ParameterId 配置id
     */
    public String getParameterId() {
        return this.ParameterId;
    }

    /**
     * Set 配置id
     * @param ParameterId 配置id
     */
    public void setParameterId(String ParameterId) {
        this.ParameterId = ParameterId;
    }

    /**
     * Get 小版本镜像ID 
     * @return ChildImageVersionId 小版本镜像ID
     */
    public String getChildImageVersionId() {
        return this.ChildImageVersionId;
    }

    /**
     * Set 小版本镜像ID
     * @param ChildImageVersionId 小版本镜像ID
     */
    public void setChildImageVersionId(String ChildImageVersionId) {
        this.ChildImageVersionId = ChildImageVersionId;
    }

    /**
     * Get 集群类型：SparkSQL/PrestoSQL/SparkBatch 
     * @return EngineType 集群类型：SparkSQL/PrestoSQL/SparkBatch
     */
    public String getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 集群类型：SparkSQL/PrestoSQL/SparkBatch
     * @param EngineType 集群类型：SparkSQL/PrestoSQL/SparkBatch
     */
    public void setEngineType(String EngineType) {
        this.EngineType = EngineType;
    }

    /**
     * Get 参数key 
     * @return KeyName 参数key
     */
    public String getKeyName() {
        return this.KeyName;
    }

    /**
     * Set 参数key
     * @param KeyName 参数key
     */
    public void setKeyName(String KeyName) {
        this.KeyName = KeyName;
    }

    /**
     * Get Key描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KeyDescription Key描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKeyDescription() {
        return this.KeyDescription;
    }

    /**
     * Set Key描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KeyDescription Key描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKeyDescription(String KeyDescription) {
        this.KeyDescription = KeyDescription;
    }

    /**
     * Get value类型 
     * @return ValueType value类型
     */
    public String getValueType() {
        return this.ValueType;
    }

    /**
     * Set value类型
     * @param ValueType value类型
     */
    public void setValueType(String ValueType) {
        this.ValueType = ValueType;
    }

    /**
     * Get value长度限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueLengthLimit value长度限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueLengthLimit() {
        return this.ValueLengthLimit;
    }

    /**
     * Set value长度限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueLengthLimit value长度限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueLengthLimit(String ValueLengthLimit) {
        this.ValueLengthLimit = ValueLengthLimit;
    }

    /**
     * Get value正则限制
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueRegexpLimit value正则限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueRegexpLimit() {
        return this.ValueRegexpLimit;
    }

    /**
     * Set value正则限制
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueRegexpLimit value正则限制
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueRegexpLimit(String ValueRegexpLimit) {
        this.ValueRegexpLimit = ValueRegexpLimit;
    }

    /**
     * Get value默认值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ValueDefault value默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getValueDefault() {
        return this.ValueDefault;
    }

    /**
     * Set value默认值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ValueDefault value默认值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValueDefault(String ValueDefault) {
        this.ValueDefault = ValueDefault;
    }

    /**
     * Get 是否为公共版本：1：公共；2：私有 
     * @return IsPublic 是否为公共版本：1：公共；2：私有
     */
    public Long getIsPublic() {
        return this.IsPublic;
    }

    /**
     * Set 是否为公共版本：1：公共；2：私有
     * @param IsPublic 是否为公共版本：1：公共；2：私有
     */
    public void setIsPublic(Long IsPublic) {
        this.IsPublic = IsPublic;
    }

    /**
     * Get 配置类型：1：session配置（默认）；2：common配置；3：cluster配置 
     * @return ParameterType 配置类型：1：session配置（默认）；2：common配置；3：cluster配置
     */
    public Long getParameterType() {
        return this.ParameterType;
    }

    /**
     * Set 配置类型：1：session配置（默认）；2：common配置；3：cluster配置
     * @param ParameterType 配置类型：1：session配置（默认）；2：common配置；3：cluster配置
     */
    public void setParameterType(Long ParameterType) {
        this.ParameterType = ParameterType;
    }

    /**
     * Get 提交方式：User(用户)、BackGround（后台） 
     * @return SubmitMethod 提交方式：User(用户)、BackGround（后台）
     */
    public String getSubmitMethod() {
        return this.SubmitMethod;
    }

    /**
     * Set 提交方式：User(用户)、BackGround（后台）
     * @param SubmitMethod 提交方式：User(用户)、BackGround（后台）
     */
    public void setSubmitMethod(String SubmitMethod) {
        this.SubmitMethod = SubmitMethod;
    }

    /**
     * Get 操作者
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作者
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作者
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 插入时间 
     * @return InsertTime 插入时间
     */
    public String getInsertTime() {
        return this.InsertTime;
    }

    /**
     * Set 插入时间
     * @param InsertTime 插入时间
     */
    public void setInsertTime(String InsertTime) {
        this.InsertTime = InsertTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public DataEngineImageSessionParameter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineImageSessionParameter(DataEngineImageSessionParameter source) {
        if (source.ParameterId != null) {
            this.ParameterId = new String(source.ParameterId);
        }
        if (source.ChildImageVersionId != null) {
            this.ChildImageVersionId = new String(source.ChildImageVersionId);
        }
        if (source.EngineType != null) {
            this.EngineType = new String(source.EngineType);
        }
        if (source.KeyName != null) {
            this.KeyName = new String(source.KeyName);
        }
        if (source.KeyDescription != null) {
            this.KeyDescription = new String(source.KeyDescription);
        }
        if (source.ValueType != null) {
            this.ValueType = new String(source.ValueType);
        }
        if (source.ValueLengthLimit != null) {
            this.ValueLengthLimit = new String(source.ValueLengthLimit);
        }
        if (source.ValueRegexpLimit != null) {
            this.ValueRegexpLimit = new String(source.ValueRegexpLimit);
        }
        if (source.ValueDefault != null) {
            this.ValueDefault = new String(source.ValueDefault);
        }
        if (source.IsPublic != null) {
            this.IsPublic = new Long(source.IsPublic);
        }
        if (source.ParameterType != null) {
            this.ParameterType = new Long(source.ParameterType);
        }
        if (source.SubmitMethod != null) {
            this.SubmitMethod = new String(source.SubmitMethod);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.InsertTime != null) {
            this.InsertTime = new String(source.InsertTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParameterId", this.ParameterId);
        this.setParamSimple(map, prefix + "ChildImageVersionId", this.ChildImageVersionId);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);
        this.setParamSimple(map, prefix + "KeyName", this.KeyName);
        this.setParamSimple(map, prefix + "KeyDescription", this.KeyDescription);
        this.setParamSimple(map, prefix + "ValueType", this.ValueType);
        this.setParamSimple(map, prefix + "ValueLengthLimit", this.ValueLengthLimit);
        this.setParamSimple(map, prefix + "ValueRegexpLimit", this.ValueRegexpLimit);
        this.setParamSimple(map, prefix + "ValueDefault", this.ValueDefault);
        this.setParamSimple(map, prefix + "IsPublic", this.IsPublic);
        this.setParamSimple(map, prefix + "ParameterType", this.ParameterType);
        this.setParamSimple(map, prefix + "SubmitMethod", this.SubmitMethod);
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamSimple(map, prefix + "InsertTime", this.InsertTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

