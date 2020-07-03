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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Config extends AbstractModel{

    /**
    * Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 配置名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 模型地址
    */
    @SerializedName("ModelUri")
    @Expose
    private String ModelUri;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 运行环境
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 配置版本
    */
    @SerializedName("Version")
    @Expose
    private String Version;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 配置描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get Id 
     * @return Id Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set Id
     * @param Id Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 配置名 
     * @return Name 配置名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配置名
     * @param Name 配置名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 模型地址 
     * @return ModelUri 模型地址
     */
    public String getModelUri() {
        return this.ModelUri;
    }

    /**
     * Set 模型地址
     * @param ModelUri 模型地址
     */
    public void setModelUri(String ModelUri) {
        this.ModelUri = ModelUri;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 运行环境 
     * @return Runtime 运行环境
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 运行环境
     * @param Runtime 运行环境
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 配置版本 
     * @return Version 配置版本
     */
    public String getVersion() {
        return this.Version;
    }

    /**
     * Set 配置版本
     * @param Version 配置版本
     */
    public void setVersion(String Version) {
        this.Version = Version;
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
     * Get 配置描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 配置描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 配置描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 配置描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ModelUri", this.ModelUri);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

