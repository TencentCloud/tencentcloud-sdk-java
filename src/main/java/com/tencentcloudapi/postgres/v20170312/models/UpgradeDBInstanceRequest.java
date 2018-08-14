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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceRequest  extends AbstractModel{

    /**
    * 升级后的实例内存大小，单位GB
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 升级后的实例磁盘大小，单位GB
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 实例ID，形如postgres-lnp6j617
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 是否自动使用代金券,1是,0否，默认不使用
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Integer AutoVoucher;

    /**
    * 代金券ID列表，目前仅支持指定一张代金券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * 获取升级后的实例内存大小，单位GB
     * @return Memory 升级后的实例内存大小，单位GB
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置升级后的实例内存大小，单位GB
     * @param Memory 升级后的实例内存大小，单位GB
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取升级后的实例磁盘大小，单位GB
     * @return Storage 升级后的实例磁盘大小，单位GB
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置升级后的实例磁盘大小，单位GB
     * @param Storage 升级后的实例磁盘大小，单位GB
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取实例ID，形如postgres-lnp6j617
     * @return DBInstanceId 实例ID，形如postgres-lnp6j617
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID，形如postgres-lnp6j617
     * @param DBInstanceId 实例ID，形如postgres-lnp6j617
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取是否自动使用代金券,1是,0否，默认不使用
     * @return AutoVoucher 是否自动使用代金券,1是,0否，默认不使用
     */
    public Integer getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * 设置是否自动使用代金券,1是,0否，默认不使用
     * @param AutoVoucher 是否自动使用代金券,1是,0否，默认不使用
     */
    public void setAutoVoucher(Integer AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * 获取代金券ID列表，目前仅支持指定一张代金券
     * @return VoucherIds 代金券ID列表，目前仅支持指定一张代金券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * 设置代金券ID列表，目前仅支持指定一张代金券
     * @param VoucherIds 代金券ID列表，目前仅支持指定一张代金券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

