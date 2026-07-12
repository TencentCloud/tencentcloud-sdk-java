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

public class ConfigFileRelease extends AbstractModel {

    /**
    * <p>配置文件发布id</p>
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * <p>配置文件发布名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>配置文件发布命名空间</p>
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * <p>配置文件发布组</p>
    */
    @SerializedName("Group")
    @Expose
    private String Group;

    /**
    * <p>配置文件发布文件名称</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * <p>配置文件发布内容</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>配置文件发布注释</p>
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>配置文件发布Md5</p>
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * <p>配置文件发布版本</p>
    */
    @SerializedName("Version")
    @Expose
    private Long Version;

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
    * <p>是否生效</p>
    */
    @SerializedName("Active")
    @Expose
    private Boolean Active;

    /**
    * <p>格式</p>
    */
    @SerializedName("Format")
    @Expose
    private String Format;

    /**
    * <p>配置文件ID</p>
    */
    @SerializedName("ConfigFileId")
    @Expose
    private String ConfigFileId;

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
    * <p>灰度标签</p>
    */
    @SerializedName("BetaLabels")
    @Expose
    private BetaLabel [] BetaLabels;

    /**
    * <p>发布类型</p><p>枚举值：</p><ul><li>gary： 灰度发布</li></ul>
    */
    @SerializedName("ReleaseType")
    @Expose
    private String ReleaseType;

    /**
     * Get <p>配置文件发布id</p> 
     * @return Id <p>配置文件发布id</p>
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set <p>配置文件发布id</p>
     * @param Id <p>配置文件发布id</p>
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get <p>配置文件发布名称</p> 
     * @return Name <p>配置文件发布名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配置文件发布名称</p>
     * @param Name <p>配置文件发布名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>配置文件发布命名空间</p> 
     * @return Namespace <p>配置文件发布命名空间</p>
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * Set <p>配置文件发布命名空间</p>
     * @param Namespace <p>配置文件发布命名空间</p>
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * Get <p>配置文件发布组</p> 
     * @return Group <p>配置文件发布组</p>
     */
    public String getGroup() {
        return this.Group;
    }

    /**
     * Set <p>配置文件发布组</p>
     * @param Group <p>配置文件发布组</p>
     */
    public void setGroup(String Group) {
        this.Group = Group;
    }

    /**
     * Get <p>配置文件发布文件名称</p> 
     * @return FileName <p>配置文件发布文件名称</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>配置文件发布文件名称</p>
     * @param FileName <p>配置文件发布文件名称</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get <p>配置文件发布内容</p> 
     * @return Content <p>配置文件发布内容</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>配置文件发布内容</p>
     * @param Content <p>配置文件发布内容</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>配置文件发布注释</p> 
     * @return Comment <p>配置文件发布注释</p>
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>配置文件发布注释</p>
     * @param Comment <p>配置文件发布注释</p>
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>配置文件发布Md5</p> 
     * @return Md5 <p>配置文件发布Md5</p>
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set <p>配置文件发布Md5</p>
     * @param Md5 <p>配置文件发布Md5</p>
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get <p>配置文件发布版本</p> 
     * @return Version <p>配置文件发布版本</p>
     */
    public Long getVersion() {
        return this.Version;
    }

    /**
     * Set <p>配置文件发布版本</p>
     * @param Version <p>配置文件发布版本</p>
     */
    public void setVersion(Long Version) {
        this.Version = Version;
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
     * Get <p>是否生效</p> 
     * @return Active <p>是否生效</p>
     */
    public Boolean getActive() {
        return this.Active;
    }

    /**
     * Set <p>是否生效</p>
     * @param Active <p>是否生效</p>
     */
    public void setActive(Boolean Active) {
        this.Active = Active;
    }

    /**
     * Get <p>格式</p> 
     * @return Format <p>格式</p>
     */
    public String getFormat() {
        return this.Format;
    }

    /**
     * Set <p>格式</p>
     * @param Format <p>格式</p>
     */
    public void setFormat(String Format) {
        this.Format = Format;
    }

    /**
     * Get <p>配置文件ID</p> 
     * @return ConfigFileId <p>配置文件ID</p>
     */
    public String getConfigFileId() {
        return this.ConfigFileId;
    }

    /**
     * Set <p>配置文件ID</p>
     * @param ConfigFileId <p>配置文件ID</p>
     */
    public void setConfigFileId(String ConfigFileId) {
        this.ConfigFileId = ConfigFileId;
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
     * Get <p>灰度标签</p> 
     * @return BetaLabels <p>灰度标签</p>
     */
    public BetaLabel [] getBetaLabels() {
        return this.BetaLabels;
    }

    /**
     * Set <p>灰度标签</p>
     * @param BetaLabels <p>灰度标签</p>
     */
    public void setBetaLabels(BetaLabel [] BetaLabels) {
        this.BetaLabels = BetaLabels;
    }

    /**
     * Get <p>发布类型</p><p>枚举值：</p><ul><li>gary： 灰度发布</li></ul> 
     * @return ReleaseType <p>发布类型</p><p>枚举值：</p><ul><li>gary： 灰度发布</li></ul>
     */
    public String getReleaseType() {
        return this.ReleaseType;
    }

    /**
     * Set <p>发布类型</p><p>枚举值：</p><ul><li>gary： 灰度发布</li></ul>
     * @param ReleaseType <p>发布类型</p><p>枚举值：</p><ul><li>gary： 灰度发布</li></ul>
     */
    public void setReleaseType(String ReleaseType) {
        this.ReleaseType = ReleaseType;
    }

    public ConfigFileRelease() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigFileRelease(ConfigFileRelease source) {
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
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.Md5 != null) {
            this.Md5 = new String(source.Md5);
        }
        if (source.Version != null) {
            this.Version = new Long(source.Version);
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
        if (source.Active != null) {
            this.Active = new Boolean(source.Active);
        }
        if (source.Format != null) {
            this.Format = new String(source.Format);
        }
        if (source.ConfigFileId != null) {
            this.ConfigFileId = new String(source.ConfigFileId);
        }
        if (source.ConfigFileSupportedClient != null) {
            this.ConfigFileSupportedClient = new Long(source.ConfigFileSupportedClient);
        }
        if (source.ConfigFilePersistent != null) {
            this.ConfigFilePersistent = new ConfigFilePersistent(source.ConfigFilePersistent);
        }
        if (source.BetaLabels != null) {
            this.BetaLabels = new BetaLabel[source.BetaLabels.length];
            for (int i = 0; i < source.BetaLabels.length; i++) {
                this.BetaLabels[i] = new BetaLabel(source.BetaLabels[i]);
            }
        }
        if (source.ReleaseType != null) {
            this.ReleaseType = new String(source.ReleaseType);
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
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "Version", this.Version);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "CreateBy", this.CreateBy);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ModifyBy", this.ModifyBy);
        this.setParamSimple(map, prefix + "ReleaseDescription", this.ReleaseDescription);
        this.setParamSimple(map, prefix + "Active", this.Active);
        this.setParamSimple(map, prefix + "Format", this.Format);
        this.setParamSimple(map, prefix + "ConfigFileId", this.ConfigFileId);
        this.setParamSimple(map, prefix + "ConfigFileSupportedClient", this.ConfigFileSupportedClient);
        this.setParamObj(map, prefix + "ConfigFilePersistent.", this.ConfigFilePersistent);
        this.setParamArrayObj(map, prefix + "BetaLabels.", this.BetaLabels);
        this.setParamSimple(map, prefix + "ReleaseType", this.ReleaseType);

    }
}

