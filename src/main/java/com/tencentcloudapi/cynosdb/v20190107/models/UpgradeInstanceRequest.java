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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeInstanceRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库CPU
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
    * 数据库内存，单位GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 升级类型：upgradeImmediate，upgradeInMaintain
    */
    @SerializedName("UpgradeType")
    @Expose
    private String UpgradeType;

    /**
    * 存储上限，为0表示使用标准配置
    */
    @SerializedName("StorageLimit")
    @Expose
    private Long StorageLimit;

    /**
    * 是否自动选择代金券 1是 0否 默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Long AutoVoucher;

    /**
    * 数据库类型，取值范围: 
<li> MYSQL </li>
    */
    @SerializedName("DbType")
    @Expose
    private String DbType;

    /**
    * 交易模式 0-下单并支付 1-下单
    */
    @SerializedName("DealMode")
    @Expose
    private Long DealMode;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 数据库CPU 
     * @return Cpu 数据库CPU
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set 数据库CPU
     * @param Cpu 数据库CPU
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    /**
     * Get 数据库内存，单位GB 
     * @return Memory 数据库内存，单位GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 数据库内存，单位GB
     * @param Memory 数据库内存，单位GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 升级类型：upgradeImmediate，upgradeInMaintain 
     * @return UpgradeType 升级类型：upgradeImmediate，upgradeInMaintain
     */
    public String getUpgradeType() {
        return this.UpgradeType;
    }

    /**
     * Set 升级类型：upgradeImmediate，upgradeInMaintain
     * @param UpgradeType 升级类型：upgradeImmediate，upgradeInMaintain
     */
    public void setUpgradeType(String UpgradeType) {
        this.UpgradeType = UpgradeType;
    }

    /**
     * Get 存储上限，为0表示使用标准配置 
     * @return StorageLimit 存储上限，为0表示使用标准配置
     */
    public Long getStorageLimit() {
        return this.StorageLimit;
    }

    /**
     * Set 存储上限，为0表示使用标准配置
     * @param StorageLimit 存储上限，为0表示使用标准配置
     */
    public void setStorageLimit(Long StorageLimit) {
        this.StorageLimit = StorageLimit;
    }

    /**
     * Get 是否自动选择代金券 1是 0否 默认为0 
     * @return AutoVoucher 是否自动选择代金券 1是 0否 默认为0
     */
    public Long getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券 1是 0否 默认为0
     * @param AutoVoucher 是否自动选择代金券 1是 0否 默认为0
     */
    public void setAutoVoucher(Long AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 数据库类型，取值范围: 
<li> MYSQL </li> 
     * @return DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public String getDbType() {
        return this.DbType;
    }

    /**
     * Set 数据库类型，取值范围: 
<li> MYSQL </li>
     * @param DbType 数据库类型，取值范围: 
<li> MYSQL </li>
     */
    public void setDbType(String DbType) {
        this.DbType = DbType;
    }

    /**
     * Get 交易模式 0-下单并支付 1-下单 
     * @return DealMode 交易模式 0-下单并支付 1-下单
     */
    public Long getDealMode() {
        return this.DealMode;
    }

    /**
     * Set 交易模式 0-下单并支付 1-下单
     * @param DealMode 交易模式 0-下单并支付 1-下单
     */
    public void setDealMode(Long DealMode) {
        this.DealMode = DealMode;
    }

    public UpgradeInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeInstanceRequest(UpgradeInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.UpgradeType != null) {
            this.UpgradeType = new String(source.UpgradeType);
        }
        if (source.StorageLimit != null) {
            this.StorageLimit = new Long(source.StorageLimit);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Long(source.AutoVoucher);
        }
        if (source.DbType != null) {
            this.DbType = new String(source.DbType);
        }
        if (source.DealMode != null) {
            this.DealMode = new Long(source.DealMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "UpgradeType", this.UpgradeType);
        this.setParamSimple(map, prefix + "StorageLimit", this.StorageLimit);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamSimple(map, prefix + "DbType", this.DbType);
        this.setParamSimple(map, prefix + "DealMode", this.DealMode);

    }
}

