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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceUpgradeDBInstanceRequest extends AbstractModel {

    /**
    * <p>实例的磁盘大小，单位GB</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>实例的内存大小，单位GB</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>实例ID，形如postgres-hez4fh0v。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * <p>实例计费类型。</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>实例的Cpu大小，单位Core。<br>不传入此参数时，默认根据Memory确定的售卖规格所对应的Cpu进行设置。如Memory为2，支持的售卖规格有1核2GiB，则不传入Cpu时，Cpu默认为1。</p>
    */
    @SerializedName("Cpu")
    @Expose
    private Long Cpu;

    /**
     * Get <p>实例的磁盘大小，单位GB</p> 
     * @return Storage <p>实例的磁盘大小，单位GB</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>实例的磁盘大小，单位GB</p>
     * @param Storage <p>实例的磁盘大小，单位GB</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>实例的内存大小，单位GB</p> 
     * @return Memory <p>实例的内存大小，单位GB</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>实例的内存大小，单位GB</p>
     * @param Memory <p>实例的内存大小，单位GB</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>实例ID，形如postgres-hez4fh0v。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p> 
     * @return DBInstanceId <p>实例ID，形如postgres-hez4fh0v。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * Set <p>实例ID，形如postgres-hez4fh0v。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     * @param DBInstanceId <p>实例ID，形如postgres-hez4fh0v。可通过<a href="https://cloud.tencent.com/document/api/409/16773">DescribeDBInstances</a>接口获取</p>
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * Get <p>实例计费类型。</p> 
     * @return InstanceChargeType <p>实例计费类型。</p>
     * @deprecated
     */
    @Deprecated
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>实例计费类型。</p>
     * @param InstanceChargeType <p>实例计费类型。</p>
     * @deprecated
     */
    @Deprecated
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>实例的Cpu大小，单位Core。<br>不传入此参数时，默认根据Memory确定的售卖规格所对应的Cpu进行设置。如Memory为2，支持的售卖规格有1核2GiB，则不传入Cpu时，Cpu默认为1。</p> 
     * @return Cpu <p>实例的Cpu大小，单位Core。<br>不传入此参数时，默认根据Memory确定的售卖规格所对应的Cpu进行设置。如Memory为2，支持的售卖规格有1核2GiB，则不传入Cpu时，Cpu默认为1。</p>
     */
    public Long getCpu() {
        return this.Cpu;
    }

    /**
     * Set <p>实例的Cpu大小，单位Core。<br>不传入此参数时，默认根据Memory确定的售卖规格所对应的Cpu进行设置。如Memory为2，支持的售卖规格有1核2GiB，则不传入Cpu时，Cpu默认为1。</p>
     * @param Cpu <p>实例的Cpu大小，单位Core。<br>不传入此参数时，默认根据Memory确定的售卖规格所对应的Cpu进行设置。如Memory为2，支持的售卖规格有1核2GiB，则不传入Cpu时，Cpu默认为1。</p>
     */
    public void setCpu(Long Cpu) {
        this.Cpu = Cpu;
    }

    public InquiryPriceUpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InquiryPriceUpgradeDBInstanceRequest(InquiryPriceUpgradeDBInstanceRequest source) {
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.DBInstanceId != null) {
            this.DBInstanceId = new String(source.DBInstanceId);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.Cpu != null) {
            this.Cpu = new Long(source.Cpu);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamSimple(map, prefix + "Cpu", this.Cpu);

    }
}

