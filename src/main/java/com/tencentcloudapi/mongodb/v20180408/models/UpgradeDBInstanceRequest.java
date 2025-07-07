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
package com.tencentcloudapi.mongodb.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceRequest extends AbstractModel {

    /**
    * 实例ID，格式如：cmgo-iga0****。与云数据库控制台页面中显示的实例ID相同
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 升级后的内存大小，单位：GB
    */
    @SerializedName("Memory")
    @Expose
    private Long Memory;

    /**
    * 升级后的硬盘大小，单位：GB
    */
    @SerializedName("Volume")
    @Expose
    private Long Volume;

    /**
    * 升级后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
    */
    @SerializedName("OplogSize")
    @Expose
    private Long OplogSize;

    /**
     * Get 实例ID，格式如：cmgo-iga0****。与云数据库控制台页面中显示的实例ID相同 
     * @return InstanceId 实例ID，格式如：cmgo-iga0****。与云数据库控制台页面中显示的实例ID相同
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，格式如：cmgo-iga0****。与云数据库控制台页面中显示的实例ID相同
     * @param InstanceId 实例ID，格式如：cmgo-iga0****。与云数据库控制台页面中显示的实例ID相同
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 升级后的内存大小，单位：GB 
     * @return Memory 升级后的内存大小，单位：GB
     */
    public Long getMemory() {
        return this.Memory;
    }

    /**
     * Set 升级后的内存大小，单位：GB
     * @param Memory 升级后的内存大小，单位：GB
     */
    public void setMemory(Long Memory) {
        this.Memory = Memory;
    }

    /**
     * Get 升级后的硬盘大小，单位：GB 
     * @return Volume 升级后的硬盘大小，单位：GB
     */
    public Long getVolume() {
        return this.Volume;
    }

    /**
     * Set 升级后的硬盘大小，单位：GB
     * @param Volume 升级后的硬盘大小，单位：GB
     */
    public void setVolume(Long Volume) {
        this.Volume = Volume;
    }

    /**
     * Get 升级后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90% 
     * @return OplogSize 升级后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
     */
    public Long getOplogSize() {
        return this.OplogSize;
    }

    /**
     * Set 升级后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
     * @param OplogSize 升级后oplog的大小，单位：GB，默认为磁盘空间的10%，允许设置的最小值为磁盘的10%，最大值为磁盘的90%
     */
    public void setOplogSize(Long OplogSize) {
        this.OplogSize = OplogSize;
    }

    public UpgradeDBInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpgradeDBInstanceRequest(UpgradeDBInstanceRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Memory != null) {
            this.Memory = new Long(source.Memory);
        }
        if (source.Volume != null) {
            this.Volume = new Long(source.Volume);
        }
        if (source.OplogSize != null) {
            this.OplogSize = new Long(source.OplogSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Volume", this.Volume);
        this.setParamSimple(map, prefix + "OplogSize", this.OplogSize);

    }
}

