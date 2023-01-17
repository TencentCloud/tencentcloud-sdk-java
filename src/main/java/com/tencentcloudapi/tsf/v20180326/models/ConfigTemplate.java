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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigTemplate extends AbstractModel{

    /**
    * 配置模板Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigTemplateId")
    @Expose
    private String ConfigTemplateId;

    /**
    * 配置模板名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigTemplateName")
    @Expose
    private String ConfigTemplateName;

    /**
    * 配置模板描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigTemplateDesc")
    @Expose
    private String ConfigTemplateDesc;

    /**
    * 配置模板对应的微服务框架
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigTemplateType")
    @Expose
    private String ConfigTemplateType;

    /**
    * 配置模板数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigTemplateValue")
    @Expose
    private String ConfigTemplateValue;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 配置模板Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigTemplateId 配置模板Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigTemplateId() {
        return this.ConfigTemplateId;
    }

    /**
     * Set 配置模板Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigTemplateId 配置模板Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigTemplateId(String ConfigTemplateId) {
        this.ConfigTemplateId = ConfigTemplateId;
    }

    /**
     * Get 配置模板名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigTemplateName 配置模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigTemplateName() {
        return this.ConfigTemplateName;
    }

    /**
     * Set 配置模板名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigTemplateName 配置模板名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigTemplateName(String ConfigTemplateName) {
        this.ConfigTemplateName = ConfigTemplateName;
    }

    /**
     * Get 配置模板描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigTemplateDesc 配置模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigTemplateDesc() {
        return this.ConfigTemplateDesc;
    }

    /**
     * Set 配置模板描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigTemplateDesc 配置模板描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigTemplateDesc(String ConfigTemplateDesc) {
        this.ConfigTemplateDesc = ConfigTemplateDesc;
    }

    /**
     * Get 配置模板对应的微服务框架
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigTemplateType 配置模板对应的微服务框架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigTemplateType() {
        return this.ConfigTemplateType;
    }

    /**
     * Set 配置模板对应的微服务框架
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigTemplateType 配置模板对应的微服务框架
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigTemplateType(String ConfigTemplateType) {
        this.ConfigTemplateType = ConfigTemplateType;
    }

    /**
     * Get 配置模板数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigTemplateValue 配置模板数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigTemplateValue() {
        return this.ConfigTemplateValue;
    }

    /**
     * Set 配置模板数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigTemplateValue 配置模板数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigTemplateValue(String ConfigTemplateValue) {
        this.ConfigTemplateValue = ConfigTemplateValue;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ConfigTemplate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigTemplate(ConfigTemplate source) {
        if (source.ConfigTemplateId != null) {
            this.ConfigTemplateId = new String(source.ConfigTemplateId);
        }
        if (source.ConfigTemplateName != null) {
            this.ConfigTemplateName = new String(source.ConfigTemplateName);
        }
        if (source.ConfigTemplateDesc != null) {
            this.ConfigTemplateDesc = new String(source.ConfigTemplateDesc);
        }
        if (source.ConfigTemplateType != null) {
            this.ConfigTemplateType = new String(source.ConfigTemplateType);
        }
        if (source.ConfigTemplateValue != null) {
            this.ConfigTemplateValue = new String(source.ConfigTemplateValue);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigTemplateId", this.ConfigTemplateId);
        this.setParamSimple(map, prefix + "ConfigTemplateName", this.ConfigTemplateName);
        this.setParamSimple(map, prefix + "ConfigTemplateDesc", this.ConfigTemplateDesc);
        this.setParamSimple(map, prefix + "ConfigTemplateType", this.ConfigTemplateType);
        this.setParamSimple(map, prefix + "ConfigTemplateValue", this.ConfigTemplateValue);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

