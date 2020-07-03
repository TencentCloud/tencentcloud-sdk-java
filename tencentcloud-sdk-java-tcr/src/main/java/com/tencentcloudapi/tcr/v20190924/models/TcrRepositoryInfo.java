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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrRepositoryInfo extends AbstractModel{

    /**
    * 仓库名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间名称
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 创建时间
    */
    @SerializedName("CreationTime")
    @Expose
    private String CreationTime;

    /**
    * 是否公开
    */
    @SerializedName("Public")
    @Expose
    private Boolean Public;

    /**
    * 仓库详细描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 简单描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BriefDescription")
    @Expose
    private String BriefDescription;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 仓库名称 
     * @return Name 仓库名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 仓库名称
     * @param Name 仓库名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间名称 
     * @return Namespace 命名空间名称
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set 命名空间名称
     * @param Namespace 命名空间名称
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get 创建时间 
     * @return CreationTime 创建时间
     */
    public String getCreationTime() {
        return this.CreationTime;
    }

    /**
     * Set 创建时间
     * @param CreationTime 创建时间
     */
    public void setCreationTime(String CreationTime) {
        this.CreationTime = CreationTime;
    }

    /**
     * Get 是否公开 
     * @return Public 是否公开
     */
    public Boolean getPublic() {
        return this.Public;
    }

    /**
     * Set 是否公开
     * @param Public 是否公开
     */
    public void setPublic(Boolean Public) {
        this.Public = Public;
    }

    /**
     * Get 仓库详细描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 仓库详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 仓库详细描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 仓库详细描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 简单描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BriefDescription 简单描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBriefDescription() {
        return this.BriefDescription;
    }

    /**
     * Set 简单描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param BriefDescription 简单描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBriefDescription(String BriefDescription) {
        this.BriefDescription = BriefDescription;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "CreationTime", this.CreationTime);
        this.setParamSimple(map, prefix + "Public", this.Public);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "BriefDescription", this.BriefDescription);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

