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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MigrateDBItem extends AbstractModel {

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例Vip</p>
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * <p>实例Vport</p>
    */
    @SerializedName("Vport")
    @Expose
    private Long Vport;

    /**
    * <p>是否可以作为迁移对象，1-可以，0-不可以</p>
    */
    @SerializedName("Usable")
    @Expose
    private Long Usable;

    /**
    * <p>不可以作为迁移对象的原因</p>
    */
    @SerializedName("Hint")
    @Expose
    private String Hint;

    /**
    * <p>硬盘类型，仅Postgresql适用</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 本地SSD</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： SSD云硬盘</li><li>CLOUD_HSSD： 增强型SSD云硬盘</li></ul>
    */
    @SerializedName("StorageType")
    @Expose
    private String StorageType;

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>实例名称</p> 
     * @return InstanceName <p>实例名称</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名称</p>
     * @param InstanceName <p>实例名称</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>实例Vip</p> 
     * @return Vip <p>实例Vip</p>
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set <p>实例Vip</p>
     * @param Vip <p>实例Vip</p>
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get <p>实例Vport</p> 
     * @return Vport <p>实例Vport</p>
     */
    public Long getVport() {
        return this.Vport;
    }

    /**
     * Set <p>实例Vport</p>
     * @param Vport <p>实例Vport</p>
     */
    public void setVport(Long Vport) {
        this.Vport = Vport;
    }

    /**
     * Get <p>是否可以作为迁移对象，1-可以，0-不可以</p> 
     * @return Usable <p>是否可以作为迁移对象，1-可以，0-不可以</p>
     */
    public Long getUsable() {
        return this.Usable;
    }

    /**
     * Set <p>是否可以作为迁移对象，1-可以，0-不可以</p>
     * @param Usable <p>是否可以作为迁移对象，1-可以，0-不可以</p>
     */
    public void setUsable(Long Usable) {
        this.Usable = Usable;
    }

    /**
     * Get <p>不可以作为迁移对象的原因</p> 
     * @return Hint <p>不可以作为迁移对象的原因</p>
     */
    public String getHint() {
        return this.Hint;
    }

    /**
     * Set <p>不可以作为迁移对象的原因</p>
     * @param Hint <p>不可以作为迁移对象的原因</p>
     */
    public void setHint(String Hint) {
        this.Hint = Hint;
    }

    /**
     * Get <p>硬盘类型，仅Postgresql适用</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 本地SSD</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： SSD云硬盘</li><li>CLOUD_HSSD： 增强型SSD云硬盘</li></ul> 
     * @return StorageType <p>硬盘类型，仅Postgresql适用</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 本地SSD</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： SSD云硬盘</li><li>CLOUD_HSSD： 增强型SSD云硬盘</li></ul>
     */
    public String getStorageType() {
        return this.StorageType;
    }

    /**
     * Set <p>硬盘类型，仅Postgresql适用</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 本地SSD</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： SSD云硬盘</li><li>CLOUD_HSSD： 增强型SSD云硬盘</li></ul>
     * @param StorageType <p>硬盘类型，仅Postgresql适用</p><p>枚举值：</p><ul><li>PHYSICAL_LOCAL_SSD： 本地SSD</li><li>CLOUD_PREMIUM： 高性能云硬盘</li><li>CLOUD_SSD： SSD云硬盘</li><li>CLOUD_HSSD： 增强型SSD云硬盘</li></ul>
     */
    public void setStorageType(String StorageType) {
        this.StorageType = StorageType;
    }

    public MigrateDBItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MigrateDBItem(MigrateDBItem source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.Vport != null) {
            this.Vport = new Long(source.Vport);
        }
        if (source.Usable != null) {
            this.Usable = new Long(source.Usable);
        }
        if (source.Hint != null) {
            this.Hint = new String(source.Hint);
        }
        if (source.StorageType != null) {
            this.StorageType = new String(source.StorageType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "Vport", this.Vport);
        this.setParamSimple(map, prefix + "Usable", this.Usable);
        this.setParamSimple(map, prefix + "Hint", this.Hint);
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);

    }
}

