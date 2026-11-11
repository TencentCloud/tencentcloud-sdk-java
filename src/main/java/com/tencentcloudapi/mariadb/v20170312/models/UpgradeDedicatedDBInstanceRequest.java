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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDedicatedDBInstanceRequest extends AbstractModel {

    /**
    * <p>待升级的实例ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例获得。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>内存大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得。</p>
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * <p>存储空间大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。</p>
    */
    @SerializedName("Storage")
    @Expose
    private Long Storage;

    /**
    * <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p>
    */
    @SerializedName("SwitchAutoRetry")
    @Expose
    private Long SwitchAutoRetry;

    /**
    * <p>切换时间窗口开始时间</p>
    */
    @SerializedName("SwitchStartTime")
    @Expose
    private String SwitchStartTime;

    /**
    * <p>切换时间窗口结束时间</p>
    */
    @SerializedName("SwitchEndTime")
    @Expose
    private String SwitchEndTime;

    /**
    * <p>主节点的机器id，类似svr-xxx</p>
    */
    @SerializedName("MasterHostId")
    @Expose
    private String MasterHostId;

    /**
    * <p>备节点的机器id组，类似[svr-xxx1, svr-xxx2]</p>
    */
    @SerializedName("SlaveHostIds")
    @Expose
    private String [] SlaveHostIds;

    /**
     * Get <p>待升级的实例ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例获得。</p> 
     * @return InstanceId <p>待升级的实例ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例获得。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>待升级的实例ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例获得。</p>
     * @param InstanceId <p>待升级的实例ID。形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例获得。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>内存大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得。</p> 
     * @return Memory <p>内存大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得。</p>
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set <p>内存大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得。</p>
     * @param Memory <p>内存大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得。</p>
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get <p>存储空间大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。</p> 
     * @return Storage <p>存储空间大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。</p>
     */
    public Long getStorage() {
        return this.Storage;
    }

    /**
     * Set <p>存储空间大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。</p>
     * @param Storage <p>存储空间大小，单位：GB，可以通过 DescribeFenceDBInstanceSpecs<br> 查询实例规格获得不同内存大小对应的磁盘规格下限和上限。</p>
     */
    public void setStorage(Long Storage) {
        this.Storage = Storage;
    }

    /**
     * Get <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p> 
     * @return SwitchAutoRetry <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p>
     */
    public Long getSwitchAutoRetry() {
        return this.SwitchAutoRetry;
    }

    /**
     * Set <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p>
     * @param SwitchAutoRetry <p>错过切换时间窗口时，是否自动重试一次，0-否，1-是</p>
     */
    public void setSwitchAutoRetry(Long SwitchAutoRetry) {
        this.SwitchAutoRetry = SwitchAutoRetry;
    }

    /**
     * Get <p>切换时间窗口开始时间</p> 
     * @return SwitchStartTime <p>切换时间窗口开始时间</p>
     */
    public String getSwitchStartTime() {
        return this.SwitchStartTime;
    }

    /**
     * Set <p>切换时间窗口开始时间</p>
     * @param SwitchStartTime <p>切换时间窗口开始时间</p>
     */
    public void setSwitchStartTime(String SwitchStartTime) {
        this.SwitchStartTime = SwitchStartTime;
    }

    /**
     * Get <p>切换时间窗口结束时间</p> 
     * @return SwitchEndTime <p>切换时间窗口结束时间</p>
     */
    public String getSwitchEndTime() {
        return this.SwitchEndTime;
    }

    /**
     * Set <p>切换时间窗口结束时间</p>
     * @param SwitchEndTime <p>切换时间窗口结束时间</p>
     */
    public void setSwitchEndTime(String SwitchEndTime) {
        this.SwitchEndTime = SwitchEndTime;
    }

    /**
     * Get <p>主节点的机器id，类似svr-xxx</p> 
     * @return MasterHostId <p>主节点的机器id，类似svr-xxx</p>
     */
    public String getMasterHostId() {
        return this.MasterHostId;
    }

    /**
     * Set <p>主节点的机器id，类似svr-xxx</p>
     * @param MasterHostId <p>主节点的机器id，类似svr-xxx</p>
     */
    public void setMasterHostId(String MasterHostId) {
        this.MasterHostId = MasterHostId;
    }

    /**
     * Get <p>备节点的机器id组，类似[svr-xxx1, svr-xxx2]</p> 
     * @return SlaveHostIds <p>备节点的机器id组，类似[svr-xxx1, svr-xxx2]</p>
     */
    public String [] getSlaveHostIds() {
        return this.SlaveHostIds;
    }

    /**
     * Set <p>备节点的机器id组，类似[svr-xxx1, svr-xxx2]</p>
     * @param SlaveHostIds <p>备节点的机器id组，类似[svr-xxx1, svr-xxx2]</p>
     */
    public void setSlaveHostIds(String [] SlaveHostIds) {
        this.SlaveHostIds = SlaveHostIds;
    }

    public UpgradeDedicatedDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDedicatedDBInstanceRequest(UpgradeDedicatedDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Storage != null) {
            this.Storage = new Long(source.Storage);
        }
        if (source.SwitchAutoRetry != null) {
            this.SwitchAutoRetry = new Long(source.SwitchAutoRetry);
        }
        if (source.SwitchStartTime != null) {
            this.SwitchStartTime = new String(source.SwitchStartTime);
        }
        if (source.SwitchEndTime != null) {
            this.SwitchEndTime = new String(source.SwitchEndTime);
        }
        if (source.MasterHostId != null) {
            this.MasterHostId = new String(source.MasterHostId);
        }
        if (source.SlaveHostIds != null) {
            this.SlaveHostIds = new String[source.SlaveHostIds.length];
            for (int i = 0; i < source.SlaveHostIds.length; i++) {
                this.SlaveHostIds[i] = new String(source.SlaveHostIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "SwitchAutoRetry", this.SwitchAutoRetry);
        this.setParamSimple(map, prefix + "SwitchStartTime", this.SwitchStartTime);
        this.setParamSimple(map, prefix + "SwitchEndTime", this.SwitchEndTime);
        this.setParamSimple(map, prefix + "MasterHostId", this.MasterHostId);
        this.setParamArraySimple(map, prefix + "SlaveHostIds.", this.SlaveHostIds);

    }
}

