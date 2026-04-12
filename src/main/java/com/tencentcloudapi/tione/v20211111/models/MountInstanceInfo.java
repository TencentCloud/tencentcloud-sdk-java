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
    * <p>类型英文名</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>存储实例ID</p>
    */
    @SerializedName("StorageId")
    @Expose
    private String StorageId;

    /**
    * <p>存储实例名称</p>
    */
    @SerializedName("StorageName")
    @Expose
    private String StorageName;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>0： 可挂载（正常）</li><li>1： 不可挂载（挂载限制）</li><li>2： 不可挂载（存储配置关闭）</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>额外配置</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExtraConf")
    @Expose
    private StorageExtraConf ExtraConf;

    /**
     * Get <p>类型英文名</p> 
     * @return Type <p>类型英文名</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>类型英文名</p>
     * @param Type <p>类型英文名</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>存储实例ID</p> 
     * @return StorageId <p>存储实例ID</p>
     */
    public String getStorageId() {
        return this.StorageId;
    }

    /**
     * Set <p>存储实例ID</p>
     * @param StorageId <p>存储实例ID</p>
     */
    public void setStorageId(String StorageId) {
        this.StorageId = StorageId;
    }

    /**
     * Get <p>存储实例名称</p> 
     * @return StorageName <p>存储实例名称</p>
     */
    public String getStorageName() {
        return this.StorageName;
    }

    /**
     * Set <p>存储实例名称</p>
     * @param StorageName <p>存储实例名称</p>
     */
    public void setStorageName(String StorageName) {
        this.StorageName = StorageName;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>0： 可挂载（正常）</li><li>1： 不可挂载（挂载限制）</li><li>2： 不可挂载（存储配置关闭）</li></ul> 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>0： 可挂载（正常）</li><li>1： 不可挂载（挂载限制）</li><li>2： 不可挂载（存储配置关闭）</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>0： 可挂载（正常）</li><li>1： 不可挂载（挂载限制）</li><li>2： 不可挂载（存储配置关闭）</li></ul>
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>0： 可挂载（正常）</li><li>1： 不可挂载（挂载限制）</li><li>2： 不可挂载（存储配置关闭）</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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

