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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NamespaceInfo extends AbstractModel{

    /**
    * 命名空间名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 状态(Active|Terminating)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 是否保护(不允许删除)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protected")
    @Expose
    private Boolean Protected;

    /**
    * 对应的Yaml配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Yaml")
    @Expose
    private String Yaml;

    /**
     * Get 命名空间名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Namespace 命名空间名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Namespace 命名空间名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 状态(Active|Terminating)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态(Active|Terminating)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态(Active|Terminating)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态(Active|Terminating)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
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
     * Get 是否保护(不允许删除)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protected 是否保护(不允许删除)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getProtected() {
        return this.Protected;
    }

    /**
     * Set 是否保护(不允许删除)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protected 是否保护(不允许删除)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtected(Boolean Protected) {
        this.Protected = Protected;
    }

    /**
     * Get 对应的Yaml配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Yaml 对应的Yaml配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYaml() {
        return this.Yaml;
    }

    /**
     * Set 对应的Yaml配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param Yaml 对应的Yaml配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYaml(String Yaml) {
        this.Yaml = Yaml;
    }

    public NamespaceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NamespaceInfo(NamespaceInfo source) {
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Protected != null) {
            this.Protected = new Boolean(source.Protected);
        }
        if (source.Yaml != null) {
            this.Yaml = new String(source.Yaml);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Protected", this.Protected);
        this.setParamSimple(map, prefix + "Yaml", this.Yaml);

    }
}

