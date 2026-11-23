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

public class ConfigFile extends AbstractModel {

    /**
    * <p>配置文件id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>配置文件名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>配置文件命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>配置文件组</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>配置文件内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>配置文件格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>配置文件注释</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>配置文件状态</p>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>配置文件标签数组</p>
    */
    @SerializedName("Tags")
    @Expose
    private ConfigFileTag [] Tags;

    /**
    * <p>配置文件创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>配置文件创建者</p>
    */
    @SerializedName("CreateBy")
    @Expose
    private String CreateBy;

    /**
    * <p>配置文件修改时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>配置文件修改者</p>
    */
    @SerializedName("ModifyBy")
    @Expose
    private String ModifyBy;

    /**
    * <p>配置文件发布时间</p>
    */
    @SerializedName("ReleaseTime")
    @Expose
    private String ReleaseTime;

    /**
    * <p>配置文件发布者</p>
    */
    @SerializedName("ReleaseBy")
    @Expose
    private String ReleaseBy;

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
    * <p>是否开启加密算法</p>
    */
    @SerializedName("Encrypted")
    @Expose
    private Boolean Encrypted;

    /**
    * <p>加密算法</p>
    */
    @SerializedName("EncryptAlgo")
    @Expose
    private String EncryptAlgo;

    /**
     * Get <p>配置文件id</p> 
     * @return Id <p>配置文件id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>配置文件id</p>
     * @param Id <p>配置文件id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>配置文件名称</p> 
     * @return Name <p>配置文件名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配置文件名称</p>
     * @param Name <p>配置文件名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>配置文件命名空间</p> 
     * @return Namespace <p>配置文件命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>配置文件命名空间</p>
     * @param Namespace <p>配置文件命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>配置文件组</p> 
     * @return Group <p>配置文件组</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>配置文件组</p>
     * @param Group <p>配置文件组</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>配置文件内容</p> 
     * @return Content <p>配置文件内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>配置文件内容</p>
     * @param Content <p>配置文件内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>配置文件格式</p> 
     * @return Format <p>配置文件格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>配置文件格式</p>
     * @param Format <p>配置文件格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>配置文件注释</p> 
     * @return Comment <p>配置文件注释</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>配置文件注释</p>
     * @param Comment <p>配置文件注释</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>配置文件状态</p> 
     * @return Status <p>配置文件状态</p>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>配置文件状态</p>
     * @param Status <p>配置文件状态</p>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>配置文件标签数组</p> 
     * @return Tags <p>配置文件标签数组</p>
     */
    public ConfigFileTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>配置文件标签数组</p>
     * @param Tags <p>配置文件标签数组</p>
     */
    public void setTags(ConfigFileTag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>配置文件创建时间</p> 
     * @return CreateTime <p>配置文件创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>配置文件创建时间</p>
     * @param CreateTime <p>配置文件创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>配置文件创建者</p> 
     * @return CreateBy <p>配置文件创建者</p>
     */
    public String getCreateBy() {
        return this.CreateBy;
    }

    /**
     * Set <p>配置文件创建者</p>
     * @param CreateBy <p>配置文件创建者</p>
     */
    public void setCreateBy(String CreateBy) {
        this.CreateBy = CreateBy;
    }

    /**
     * Get <p>配置文件修改时间</p> 
     * @return ModifyTime <p>配置文件修改时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>配置文件修改时间</p>
     * @param ModifyTime <p>配置文件修改时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>配置文件修改者</p> 
     * @return ModifyBy <p>配置文件修改者</p>
     */
    public String getModifyBy() {
        return this.ModifyBy;
    }

    /**
     * Set <p>配置文件修改者</p>
     * @param ModifyBy <p>配置文件修改者</p>
     */
    public void setModifyBy(String ModifyBy) {
        this.ModifyBy = ModifyBy;
    }

    /**
     * Get <p>配置文件发布时间</p> 
     * @return ReleaseTime <p>配置文件发布时间</p>
     */
    public String getReleaseTime() {
        return this.ReleaseTime;
    }

    /**
     * Set <p>配置文件发布时间</p>
     * @param ReleaseTime <p>配置文件发布时间</p>
     */
    public void setReleaseTime(String ReleaseTime) {
        this.ReleaseTime = ReleaseTime;
    }

    /**
     * Get <p>配置文件发布者</p> 
     * @return ReleaseBy <p>配置文件发布者</p>
     */
    public String getReleaseBy() {
        return this.ReleaseBy;
    }

    /**
     * Set <p>配置文件发布者</p>
     * @param ReleaseBy <p>配置文件发布者</p>
     */
    public void setReleaseBy(String ReleaseBy) {
        this.ReleaseBy = ReleaseBy;
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

    /**
     * Get <p>是否开启加密算法</p> 
     * @return Encrypted <p>是否开启加密算法</p>
     */
    public Boolean getEncrypted() {
        return this.Encrypted;
    }

    /**
     * Set <p>是否开启加密算法</p>
     * @param Encrypted <p>是否开启加密算法</p>
     */
    public void setEncrypted(Boolean Encrypted) {
        this.Encrypted = Encrypted;
    }

    /**
     * Get <p>加密算法</p> 
     * @return EncryptAlgo <p>加密算法</p>
     */
    public String getEncryptAlgo() {
        return this.EncryptAlgo;
    }

    /**
     * Set <p>加密算法</p>
     * @param EncryptAlgo <p>加密算法</p>
     */
    public void setEncryptAlgo(String EncryptAlgo) {
        this.EncryptAlgo = EncryptAlgo;
    }

    public ConfigFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigFile(ConfigFile source) {
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
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
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
        if (source.ReleaseTime != null) {
            this.ReleaseTime = new String(source.ReleaseTime);
        }
        if (source.ReleaseBy != null) {
            this.ReleaseBy = new String(source.ReleaseBy);
        }
        if (source.ConfigFileSupportedClient != null) {
            this.ConfigFileSupportedClient = new Long(source.ConfigFileSupportedClient);
        }
        if (source.ConfigFilePersistent != null) {
            this.ConfigFilePersistent = new ConfigFilePersistent(source.ConfigFilePersistent);
        }
        if (source.Encrypted != null) {
            this.Encrypted = new Boolean(source.Encrypted);
        }
        if (source.EncryptAlgo != null) {
            this.EncryptAlgo = new String(source.EncryptAlgo);
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
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyBy", this.ModifyBy);
        this.setParamSimple(map, prefix + "ReleaseTime", this.ReleaseTime);
        this.setParamSimple(map, prefix + "ReleaseBy", this.ReleaseBy);
        this.setParamSimple(map, prefix + "ConfigFileSupportedClient", this.ConfigFileSupportedClient);
        this.setParamObj(map, prefix + "ConfigFilePersistent.", this.ConfigFilePersistent);
        this.setParamSimple(map, prefix + "Encrypted", this.Encrypted);
        this.setParamSimple(map, prefix + "EncryptAlgo", this.EncryptAlgo);

    }
}

