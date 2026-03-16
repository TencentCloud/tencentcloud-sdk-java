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

public class MountInstanceInfo extends AbstractModel {

    /**
    * 类型英文名
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 存储实例ID
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * 存储实例名称
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * 状态，0可挂载 1不可挂载(挂载限制)
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 额外配置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraConf")
    @Expose
    private StorageExtraConf ExtraConf;

    /**
     * Get 类型英文名 
     * @return Type 类型英文名
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型英文名
     * @param Type 类型英文名
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 存储实例ID 
     * @return StorageId 存储实例ID
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set 存储实例ID
     * @param StorageId 存储实例ID
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get 存储实例名称 
     * @return StorageName 存储实例名称
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set 存储实例名称
     * @param StorageName 存储实例名称
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get 状态，0可挂载 1不可挂载(挂载限制) 
     * @return Status 状态，0可挂载 1不可挂载(挂载限制)
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态，0可挂载 1不可挂载(挂载限制)
     * @param Status 状态，0可挂载 1不可挂载(挂载限制)
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 额外配置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExtraConf 额外配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StorageExtraConf getExtraConf() {
        return this.ExtraConf;
    }

    /**
     * Set 额外配置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExtraConf 额外配置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExtraConf(StorageExtraConf ExtraConf) {
        this.ExtraConf = ExtraConf;
    }

    public MountInstanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MountInstanceInfo(MountInstanceInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.StorageId != null) {
            this.StorageId = new String(source.StorageId);
        }
        if (source.StorageName != null) {
            this.StorageName = new String(source.StorageName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "ExtraConf.", this.ExtraConf);

    }
}

