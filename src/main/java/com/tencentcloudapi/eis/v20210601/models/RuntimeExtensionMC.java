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
package com.tencentcloudapi.eis.v20210601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RuntimeExtensionMC extends AbstractModel{

    /**
    * 扩展组件类型：0:cdc
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 部署规格vcore数
    */
    @SerializedName("Size")
    @Expose
    private Float Size;

    /**
    * 副本数
    */
    @SerializedName("Replica")
    @Expose
    private Long Replica;

    /**
    * 扩展组件名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 状态 1:未启用 2:已启用
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private Long CreatedAt;

    /**
    * 修改时间
    */
    @SerializedName("UpdatedAt")
    @Expose
    private Long UpdatedAt;

    /**
     * Get 扩展组件类型：0:cdc 
     * @return Type 扩展组件类型：0:cdc
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 扩展组件类型：0:cdc
     * @param Type 扩展组件类型：0:cdc
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 部署规格vcore数 
     * @return Size 部署规格vcore数
     */
    public Float getSize() {
        return this.Size;
    }

    /**
     * Set 部署规格vcore数
     * @param Size 部署规格vcore数
     */
    public void setSize(Float Size) {
        this.Size = Size;
    }

    /**
     * Get 副本数 
     * @return Replica 副本数
     */
    public Long getReplica() {
        return this.Replica;
    }

    /**
     * Set 副本数
     * @param Replica 副本数
     */
    public void setReplica(Long Replica) {
        this.Replica = Replica;
    }

    /**
     * Get 扩展组件名称 
     * @return Name 扩展组件名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 扩展组件名称
     * @param Name 扩展组件名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 状态 1:未启用 2:已启用 
     * @return Status 状态 1:未启用 2:已启用
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态 1:未启用 2:已启用
     * @param Status 状态 1:未启用 2:已启用
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreatedAt 创建时间
     */
    public Long getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 创建时间
     * @param CreatedAt 创建时间
     */
    public void setCreatedAt(Long CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 修改时间 
     * @return UpdatedAt 修改时间
     */
    public Long getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set 修改时间
     * @param UpdatedAt 修改时间
     */
    public void setUpdatedAt(Long UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    public RuntimeExtensionMC() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuntimeExtensionMC(RuntimeExtensionMC source) {
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Size != null) {
            this.Size = new Float(source.Size);
        }
        if (source.Replica != null) {
            this.Replica = new Long(source.Replica);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new Long(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new Long(source.UpdatedAt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Replica", this.Replica);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);

    }
}

