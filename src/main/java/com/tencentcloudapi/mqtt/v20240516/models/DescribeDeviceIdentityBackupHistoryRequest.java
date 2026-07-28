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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceIdentityBackupHistoryRequest extends AbstractModel {

    /**
    * <p>集群id</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>灾备集群的集群ID</p>
    */
    @SerializedName("Destination")
    @Expose
    private String Destination;

    /**
    * <p>设备ID</p>
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * <p>同步发生的开始时间</p>
    */
    @SerializedName("ModificationTimeStart")
    @Expose
    private Long ModificationTimeStart;

    /**
    * <p>同步发生的结束时间</p>
    */
    @SerializedName("ModificationTimeEnd")
    @Expose
    private Long ModificationTimeEnd;

    /**
    * <p>查询条数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get <p>集群id</p> 
     * @return InstanceId <p>集群id</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>集群id</p>
     * @param InstanceId <p>集群id</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>灾备集群的集群ID</p> 
     * @return Destination <p>灾备集群的集群ID</p>
     */
    public String getDestination() {
        return this.Destination;
    }

    /**
     * Set <p>灾备集群的集群ID</p>
     * @param Destination <p>灾备集群的集群ID</p>
     */
    public void setDestination(String Destination) {
        this.Destination = Destination;
    }

    /**
     * Get <p>设备ID</p> 
     * @return DeviceId <p>设备ID</p>
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set <p>设备ID</p>
     * @param DeviceId <p>设备ID</p>
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get <p>同步发生的开始时间</p> 
     * @return ModificationTimeStart <p>同步发生的开始时间</p>
     */
    public Long getModificationTimeStart() {
        return this.ModificationTimeStart;
    }

    /**
     * Set <p>同步发生的开始时间</p>
     * @param ModificationTimeStart <p>同步发生的开始时间</p>
     */
    public void setModificationTimeStart(Long ModificationTimeStart) {
        this.ModificationTimeStart = ModificationTimeStart;
    }

    /**
     * Get <p>同步发生的结束时间</p> 
     * @return ModificationTimeEnd <p>同步发生的结束时间</p>
     */
    public Long getModificationTimeEnd() {
        return this.ModificationTimeEnd;
    }

    /**
     * Set <p>同步发生的结束时间</p>
     * @param ModificationTimeEnd <p>同步发生的结束时间</p>
     */
    public void setModificationTimeEnd(Long ModificationTimeEnd) {
        this.ModificationTimeEnd = ModificationTimeEnd;
    }

    /**
     * Get <p>查询条数</p> 
     * @return Limit <p>查询条数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>查询条数</p>
     * @param Limit <p>查询条数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeDeviceIdentityBackupHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceIdentityBackupHistoryRequest(DescribeDeviceIdentityBackupHistoryRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Destination != null) {
            this.Destination = new String(source.Destination);
        }
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.ModificationTimeStart != null) {
            this.ModificationTimeStart = new Long(source.ModificationTimeStart);
        }
        if (source.ModificationTimeEnd != null) {
            this.ModificationTimeEnd = new Long(source.ModificationTimeEnd);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Destination", this.Destination);
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ModificationTimeStart", this.ModificationTimeStart);
        this.setParamSimple(map, prefix + "ModificationTimeEnd", this.ModificationTimeEnd);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

