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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSourceInfo extends AbstractModel {

    /**
    * 数据源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 数据源名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 创建者uin
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * 创建者名称
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * 数据源类型英文名
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 数据源权限，取值有RW RO
    */
    @SerializedName("Permission")
    @Expose
    private String Permission;

    /**
    * 数据源所属存储实例ID
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * 数据源所属存储实例名称
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * 数据源挂载配置
    */
    @SerializedName("MountConfigure")
    @Expose
    private MountConfigureInfo MountConfigure;

    /**
    * 创建时间, 格式为yyyy-mm-ddThh:mm:ssZ
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间, 格式为yyyy-mm-ddThh:mm:ssZ
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 限制开关是否开启，只有开启时才有限制
    */
    @SerializedName("LimitMount")
    @Expose
    private Boolean LimitMount;

    /**
    * 标签配置
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 额外配置,对应存储实例的额外配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraConf")
    @Expose
    private StorageExtraConf ExtraConf;

    /**
     * Get 数据源ID 
     * @return Id 数据源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 数据源ID
     * @param Id 数据源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 数据源名称 
     * @return Name 数据源名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 数据源名称
     * @param Name 数据源名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 创建者uin 
     * @return Creator 创建者uin
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set 创建者uin
     * @param Creator 创建者uin
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get 创建者名称 
     * @return CreatorName 创建者名称
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set 创建者名称
     * @param CreatorName 创建者名称
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get 数据源类型英文名 
     * @return Type 数据源类型英文名
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 数据源类型英文名
     * @param Type 数据源类型英文名
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 数据源权限，取值有RW RO 
     * @return Permission 数据源权限，取值有RW RO
     */
    public String getPermission() {
        return this.Permission;
    }

    /**
     * Set 数据源权限，取值有RW RO
     * @param Permission 数据源权限，取值有RW RO
     */
    public void setPermission(String Permission) {
        this.Permission = Permission;
    }

    /**
     * Get 数据源所属存储实例ID 
     * @return StorageId 数据源所属存储实例ID
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 数据源所属存储实例ID
     * @param StorageId 数据源所属存储实例ID
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get 数据源所属存储实例名称 
     * @return StorageName 数据源所属存储实例名称
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set 数据源所属存储实例名称
     * @param StorageName 数据源所属存储实例名称
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get 数据源挂载配置 
     * @return MountConfigure 数据源挂载配置
     */
    public MountConfigureInfo getMountConfigure() {
        return this.MountConfigure;
    }

    /**
     * Set 数据源挂载配置
     * @param MountConfigure 数据源挂载配置
     */
    public void setMountConfigure(MountConfigureInfo MountConfigure) {
        this.MountConfigure = MountConfigure;
    }

    /**
     * Get 创建时间, 格式为yyyy-mm-ddThh:mm:ssZ 
     * @return CreateTime 创建时间, 格式为yyyy-mm-ddThh:mm:ssZ
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间, 格式为yyyy-mm-ddThh:mm:ssZ
     * @param CreateTime 创建时间, 格式为yyyy-mm-ddThh:mm:ssZ
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间, 格式为yyyy-mm-ddThh:mm:ssZ 
     * @return UpdateTime 更新时间, 格式为yyyy-mm-ddThh:mm:ssZ
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间, 格式为yyyy-mm-ddThh:mm:ssZ
     * @param UpdateTime 更新时间, 格式为yyyy-mm-ddThh:mm:ssZ
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 限制开关是否开启，只有开启时才有限制 
     * @return LimitMount 限制开关是否开启，只有开启时才有限制
     */
    public Boolean getLimitMount() {
        return this.LimitMount;
    }

    /**
     * Set 限制开关是否开启，只有开启时才有限制
     * @param LimitMount 限制开关是否开启，只有开启时才有限制
     */
    public void setLimitMount(Boolean LimitMount) {
        this.LimitMount = LimitMount;
    }

    /**
     * Get 标签配置 
     * @return Tags 标签配置
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签配置
     * @param Tags 标签配置
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 额外配置,对应存储实例的额外配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraConf 额外配置,对应存储实例的额外配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageExtraConf getExtraConf() {
        return this.ExtraConf;
    }

    /**
     * Set 额外配置,对应存储实例的额外配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraConf 额外配置,对应存储实例的额外配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraConf(StorageExtraConf ExtraConf) {
        this.ExtraConf = ExtraConf;
    }

    public DataSourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSourceInfo(DataSourceInfo source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Permission != null) {
            this.Permission = new String(source.Permission);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
        if (source.MountConfigure != null) {
            this.MountConfigure = new MountConfigureInfo(source.MountConfigure);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LimitMount != null) {
            this.LimitMount = new Boolean(source.LimitMount);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ExtraConf != null) {
            this.ExtraConf = new StorageExtraConf(source.ExtraConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Permission", this.Permission);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);
        this.setParamObj(map, prefix + "MountConfigure.", this.MountConfigure);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LimitMount", this.LimitMount);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamObj(map, prefix + "ExtraConf.", this.ExtraConf);

    }
}

