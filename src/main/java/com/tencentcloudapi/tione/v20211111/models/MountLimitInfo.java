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

public class MountLimitInfo extends AbstractModel {

    /**
    * <p>数据源类型英文名</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>数据源所属存储实例ID</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>数据源所属存储实例名称</p>
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * <p>限制开关是否开启，只有开启时才有限制</p>
    */
    @SerializedName("LimitMount")
    @Expose
    private Boolean LimitMount;

    /**
    * <p>创建者uin</p>
    */
    @SerializedName("Creator")
    @Expose
    private String Creator;

    /**
    * <p>创建者名称</p>
    */
    @SerializedName("CreatorName")
    @Expose
    private String CreatorName;

    /**
    * <p>创建时间, 格式为yyyy-mm-ddThh:mm:ssZ</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>更新时间, 格式为yyyy-mm-ddThh:mm:ssZ</p>
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * <p>额外配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraConf")
    @Expose
    private StorageExtraConf ExtraConf;

    /**
     * Get <p>数据源类型英文名</p> 
     * @return Type <p>数据源类型英文名</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>数据源类型英文名</p>
     * @param Type <p>数据源类型英文名</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>数据源所属存储实例ID</p> 
     * @return StorageId <p>数据源所属存储实例ID</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>数据源所属存储实例ID</p>
     * @param StorageId <p>数据源所属存储实例ID</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>数据源所属存储实例名称</p> 
     * @return StorageName <p>数据源所属存储实例名称</p>
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set <p>数据源所属存储实例名称</p>
     * @param StorageName <p>数据源所属存储实例名称</p>
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get <p>限制开关是否开启，只有开启时才有限制</p> 
     * @return LimitMount <p>限制开关是否开启，只有开启时才有限制</p>
     */
    public Boolean getLimitMount() {
        return this.LimitMount;
    }

    /**
     * Set <p>限制开关是否开启，只有开启时才有限制</p>
     * @param LimitMount <p>限制开关是否开启，只有开启时才有限制</p>
     */
    public void setLimitMount(Boolean LimitMount) {
        this.LimitMount = LimitMount;
    }

    /**
     * Get <p>创建者uin</p> 
     * @return Creator <p>创建者uin</p>
     */
    public String getCreator() {
        return this.Creator;
    }

    /**
     * Set <p>创建者uin</p>
     * @param Creator <p>创建者uin</p>
     */
    public void setCreator(String Creator) {
        this.Creator = Creator;
    }

    /**
     * Get <p>创建者名称</p> 
     * @return CreatorName <p>创建者名称</p>
     */
    public String getCreatorName() {
        return this.CreatorName;
    }

    /**
     * Set <p>创建者名称</p>
     * @param CreatorName <p>创建者名称</p>
     */
    public void setCreatorName(String CreatorName) {
        this.CreatorName = CreatorName;
    }

    /**
     * Get <p>创建时间, 格式为yyyy-mm-ddThh:mm:ssZ</p> 
     * @return CreateTime <p>创建时间, 格式为yyyy-mm-ddThh:mm:ssZ</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间, 格式为yyyy-mm-ddThh:mm:ssZ</p>
     * @param CreateTime <p>创建时间, 格式为yyyy-mm-ddThh:mm:ssZ</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>更新时间, 格式为yyyy-mm-ddThh:mm:ssZ</p> 
     * @return UpdateTime <p>更新时间, 格式为yyyy-mm-ddThh:mm:ssZ</p>
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set <p>更新时间, 格式为yyyy-mm-ddThh:mm:ssZ</p>
     * @param UpdateTime <p>更新时间, 格式为yyyy-mm-ddThh:mm:ssZ</p>
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get <p>额外配置</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraConf <p>额外配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageExtraConf getExtraConf() {
        return this.ExtraConf;
    }

    /**
     * Set <p>额外配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraConf <p>额外配置</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraConf(StorageExtraConf ExtraConf) {
        this.ExtraConf = ExtraConf;
    }

    public MountLimitInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountLimitInfo(MountLimitInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
        if (source.LimitMount != null) {
            this.LimitMount = new Boolean(source.LimitMount);
        }
        if (source.Creator != null) {
            this.Creator = new String(source.Creator);
        }
        if (source.CreatorName != null) {
            this.CreatorName = new String(source.CreatorName);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.ExtraConf != null) {
            this.ExtraConf = new StorageExtraConf(source.ExtraConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StorageId", this.StorageId);
        this.setParamSimple(map, prefix + "StorageName", this.StorageName);
        this.setParamSimple(map, prefix + "LimitMount", this.LimitMount);
        this.setParamSimple(map, prefix + "Creator", this.Creator);
        this.setParamSimple(map, prefix + "CreatorName", this.CreatorName);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamObj(map, prefix + "ExtraConf.", this.ExtraConf);

    }
}

