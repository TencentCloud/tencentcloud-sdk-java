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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigFileReleaseHistory extends AbstractModel {

    /**
    * <p>配置文件发布历史记录id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>配置文件发布历史名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>配置文件发布历史命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>配置文件发布历史组</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>配置文件发布历史名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>配置文件发布历史内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>配置文件发布历史格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>配置文件发布历史注释</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>配置文件发布历史Md5</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>配置文件发布历史类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>配置文件发布历史状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>配置文件发布历史标签组</p>
    */
    @SerializedName("Tags")
    @Expose
    private ConfigFileTag [] Tags;

    /**
    * <p>配置文件发布创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>配置文件发布创建者</p>
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * <p>配置文件发布修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>配置文件发布修改者</p>
    */
    @SerializedName("ModifyBy")
    @Expose
    private String ModifyBy;

    /**
    * <p>发布描述</p>
    */
    @SerializedName("ReleaseDescription")
    @Expose
    private String ReleaseDescription;

    /**
    * <p>原因，用于失败时原因展示</p>
    */
    @SerializedName("ReleaseReason")
    @Expose
    private String ReleaseReason;

    /**
    * <p>配置文件类型</p>
    */
    @SerializedName("ConfigFileSupportedClient")
    @Expose
    private Long ConfigFileSupportedClient;

    /**
    * <p>配置文件持久化</p>
    */
    @SerializedName("ConfigFilePersistent")
    @Expose
    private ConfigFilePersistent ConfigFilePersistent;

    /**
     * Get <p>配置文件发布历史记录id</p> 
     * @return Id <p>配置文件发布历史记录id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>配置文件发布历史记录id</p>
     * @param Id <p>配置文件发布历史记录id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>配置文件发布历史名称</p> 
     * @return Name <p>配置文件发布历史名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配置文件发布历史名称</p>
     * @param Name <p>配置文件发布历史名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>配置文件发布历史命名空间</p> 
     * @return Namespace <p>配置文件发布历史命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>配置文件发布历史命名空间</p>
     * @param Namespace <p>配置文件发布历史命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>配置文件发布历史组</p> 
     * @return Group <p>配置文件发布历史组</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>配置文件发布历史组</p>
     * @param Group <p>配置文件发布历史组</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>配置文件发布历史名称</p> 
     * @return FileName <p>配置文件发布历史名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>配置文件发布历史名称</p>
     * @param FileName <p>配置文件发布历史名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>配置文件发布历史内容</p> 
     * @return Content <p>配置文件发布历史内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>配置文件发布历史内容</p>
     * @param Content <p>配置文件发布历史内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>配置文件发布历史格式</p> 
     * @return Format <p>配置文件发布历史格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>配置文件发布历史格式</p>
     * @param Format <p>配置文件发布历史格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>配置文件发布历史注释</p> 
     * @return Comment <p>配置文件发布历史注释</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>配置文件发布历史注释</p>
     * @param Comment <p>配置文件发布历史注释</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>配置文件发布历史Md5</p> 
     * @return Md5 <p>配置文件发布历史Md5</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>配置文件发布历史Md5</p>
     * @param Md5 <p>配置文件发布历史Md5</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>配置文件发布历史类型</p> 
     * @return Type <p>配置文件发布历史类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>配置文件发布历史类型</p>
     * @param Type <p>配置文件发布历史类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>配置文件发布历史状态</p> 
     * @return Status <p>配置文件发布历史状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>配置文件发布历史状态</p>
     * @param Status <p>配置文件发布历史状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>配置文件发布历史标签组</p> 
     * @return Tags <p>配置文件发布历史标签组</p>
     */
    public ConfigFileTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>配置文件发布历史标签组</p>
     * @param Tags <p>配置文件发布历史标签组</p>
     */
    public void setTags(ConfigFileTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>配置文件发布创建时间</p> 
     * @return CreateTime <p>配置文件发布创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>配置文件发布创建时间</p>
     * @param CreateTime <p>配置文件发布创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>配置文件发布创建者</p> 
     * @return CreateBy <p>配置文件发布创建者</p>
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set <p>配置文件发布创建者</p>
     * @param CreateBy <p>配置文件发布创建者</p>
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get <p>配置文件发布修改时间</p> 
     * @return ModifyTime <p>配置文件发布修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>配置文件发布修改时间</p>
     * @param ModifyTime <p>配置文件发布修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>配置文件发布修改者</p> 
     * @return ModifyBy <p>配置文件发布修改者</p>
     */
    public String getModifyBy() {
        return this.ModifyBy;
    }

    /**
     * Set <p>配置文件发布修改者</p>
     * @param ModifyBy <p>配置文件发布修改者</p>
     */
    public void setModifyBy(String ModifyBy) {
        this.ModifyBy = ModifyBy;
    }

    /**
     * Get <p>发布描述</p> 
     * @return ReleaseDescription <p>发布描述</p>
     */
    public String getReleaseDescription() {
        return this.ReleaseDescription;
    }

    /**
     * Set <p>发布描述</p>
     * @param ReleaseDescription <p>发布描述</p>
     */
    public void setReleaseDescription(String ReleaseDescription) {
        this.ReleaseDescription = ReleaseDescription;
    }

    /**
     * Get <p>原因，用于失败时原因展示</p> 
     * @return ReleaseReason <p>原因，用于失败时原因展示</p>
     */
    public String getReleaseReason() {
        return this.ReleaseReason;
    }

    /**
     * Set <p>原因，用于失败时原因展示</p>
     * @param ReleaseReason <p>原因，用于失败时原因展示</p>
     */
    public void setReleaseReason(String ReleaseReason) {
        this.ReleaseReason = ReleaseReason;
    }

    /**
     * Get <p>配置文件类型</p> 
     * @return ConfigFileSupportedClient <p>配置文件类型</p>
     */
    public Long getConfigFileSupportedClient() {
        return this.ConfigFileSupportedClient;
    }

    /**
     * Set <p>配置文件类型</p>
     * @param ConfigFileSupportedClient <p>配置文件类型</p>
     */
    public void setConfigFileSupportedClient(Long ConfigFileSupportedClient) {
        this.ConfigFileSupportedClient = ConfigFileSupportedClient;
    }

    /**
     * Get <p>配置文件持久化</p> 
     * @return ConfigFilePersistent <p>配置文件持久化</p>
     */
    public ConfigFilePersistent getConfigFilePersistent() {
        return this.ConfigFilePersistent;
    }

    /**
     * Set <p>配置文件持久化</p>
     * @param ConfigFilePersistent <p>配置文件持久化</p>
     */
    public void setConfigFilePersistent(ConfigFilePersistent ConfigFilePersistent) {
        this.ConfigFilePersistent = ConfigFilePersistent;
    }

    public ConfigFileReleaseHistory() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigFileReleaseHistory(ConfigFileReleaseHistory source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Namespace != null) {
            this.Namespace = new String(source.Namespace);
        }
        if (source.Group != null) {
            this.Group = new String(source.Group);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new ConfigFileTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ConfigFileTag(source.Tags[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.CreateBy != null) {
            this.CreateBy = new String(source.CreateBy);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ModifyBy != null) {
            this.ModifyBy = new String(source.ModifyBy);
        }
        if (source.ReleaseDescription != null) {
            this.ReleaseDescription = new String(source.ReleaseDescription);
        }
        if (source.ReleaseReason != null) {
            this.ReleaseReason = new String(source.ReleaseReason);
        }
        if (source.ConfigFileSupportedClient != null) {
            this.ConfigFileSupportedClient = new Long(source.ConfigFileSupportedClient);
        }
        if (source.ConfigFilePersistent != null) {
            this.ConfigFilePersistent = new ConfigFilePersistent(source.ConfigFilePersistent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "Group", this.Group);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyBy", this.ModifyBy);
        this.setParamSimple(map, prefix + "ReleaseDescription", this.ReleaseDescription);
        this.setParamSimple(map, prefix + "ReleaseReason", this.ReleaseReason);
        this.setParamSimple(map, prefix + "ConfigFileSupportedClient", this.ConfigFileSupportedClient);
        this.setParamObj(map, prefix + "ConfigFilePersistent.", this.ConfigFilePersistent);

    }
}

