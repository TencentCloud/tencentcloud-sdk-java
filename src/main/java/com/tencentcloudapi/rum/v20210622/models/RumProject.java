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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RumProject extends AbstractModel{

    /**
    * 项目名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建者 id
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 实例 id
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
    * 项目类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 项目仓库地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Repo")
    @Expose
    private String Repo;

    /**
    * 项目网址地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 项目采样频率
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * 项目唯一key（长度 12 位）
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 是否开启url聚类
    */
    @SerializedName("EnableURLGroup")
    @Expose
    private Long EnableURLGroup;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 项目 ID
    */
    @SerializedName("ID")
    @Expose
    private Long ID;

    /**
    * 实例 key
    */
    @SerializedName("InstanceKey")
    @Expose
    private String InstanceKey;

    /**
    * 项目描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 是否星标  1:是 0:否
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsStar")
    @Expose
    private Long IsStar;

    /**
    * 项目状态(1 创建中，2 运行中，3 异常，4 重启中，5 停止中，6 已停止， 7 销毁中，8 已销毁)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectStatus")
    @Expose
    private Long ProjectStatus;

    /**
     * Get 项目名 
     * @return Name 项目名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 项目名
     * @param Name 项目名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建者 id 
     * @return Creator 创建者 id
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者 id
     * @param Creator 创建者 id
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 实例 id 
     * @return InstanceID 实例 id
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例 id
     * @param InstanceID 实例 id
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    /**
     * Get 项目类型 
     * @return Type 项目类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 项目类型
     * @param Type 项目类型
     */
    public void setType(String Type) {
        this.Type = Type;
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
     * Get 项目仓库地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Repo 项目仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRepo() {
        return this.Repo;
    }

    /**
     * Set 项目仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Repo 项目仓库地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRepo(String Repo) {
        this.Repo = Repo;
    }

    /**
     * Get 项目网址地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return URL 项目网址地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 项目网址地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param URL 项目网址地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 项目采样频率 
     * @return Rate 项目采样频率
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set 项目采样频率
     * @param Rate 项目采样频率
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 项目唯一key（长度 12 位） 
     * @return Key 项目唯一key（长度 12 位）
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 项目唯一key（长度 12 位）
     * @param Key 项目唯一key（长度 12 位）
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 是否开启url聚类 
     * @return EnableURLGroup 是否开启url聚类
     */
    public Long getEnableURLGroup() {
        return this.EnableURLGroup;
    }

    /**
     * Set 是否开启url聚类
     * @param EnableURLGroup 是否开启url聚类
     */
    public void setEnableURLGroup(Long EnableURLGroup) {
        this.EnableURLGroup = EnableURLGroup;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 项目 ID 
     * @return ID 项目 ID
     */
    public Long getID() {
        return this.ID;
    }

    /**
     * Set 项目 ID
     * @param ID 项目 ID
     */
    public void setID(Long ID) {
        this.ID = ID;
    }

    /**
     * Get 实例 key 
     * @return InstanceKey 实例 key
     */
    public String getInstanceKey() {
        return this.InstanceKey;
    }

    /**
     * Set 实例 key
     * @param InstanceKey 实例 key
     */
    public void setInstanceKey(String InstanceKey) {
        this.InstanceKey = InstanceKey;
    }

    /**
     * Get 项目描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Desc 项目描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 项目描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Desc 项目描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 是否星标  1:是 0:否
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsStar 是否星标  1:是 0:否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsStar() {
        return this.IsStar;
    }

    /**
     * Set 是否星标  1:是 0:否
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsStar 是否星标  1:是 0:否
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsStar(Long IsStar) {
        this.IsStar = IsStar;
    }

    /**
     * Get 项目状态(1 创建中，2 运行中，3 异常，4 重启中，5 停止中，6 已停止， 7 销毁中，8 已销毁)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectStatus 项目状态(1 创建中，2 运行中，3 异常，4 重启中，5 停止中，6 已停止， 7 销毁中，8 已销毁)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProjectStatus() {
        return this.ProjectStatus;
    }

    /**
     * Set 项目状态(1 创建中，2 运行中，3 异常，4 重启中，5 停止中，6 已停止， 7 销毁中，8 已销毁)
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectStatus 项目状态(1 创建中，2 运行中，3 异常，4 重启中，5 停止中，6 已停止， 7 销毁中，8 已销毁)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectStatus(Long ProjectStatus) {
        this.ProjectStatus = ProjectStatus;
    }

    public RumProject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RumProject(RumProject source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Repo != null) {
            this.Repo = new String(source.Repo);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.EnableURLGroup != null) {
            this.EnableURLGroup = new Long(source.EnableURLGroup);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ID != null) {
            this.ID = new Long(source.ID);
        }
        if (source.InstanceKey != null) {
            this.InstanceKey = new String(source.InstanceKey);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.IsStar != null) {
            this.IsStar = new Long(source.IsStar);
        }
        if (source.ProjectStatus != null) {
            this.ProjectStatus = new Long(source.ProjectStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Repo", this.Repo);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "EnableURLGroup", this.EnableURLGroup);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "InstanceKey", this.InstanceKey);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "IsStar", this.IsStar);
        this.setParamSimple(map, prefix + "ProjectStatus", this.ProjectStatus);

    }
}

