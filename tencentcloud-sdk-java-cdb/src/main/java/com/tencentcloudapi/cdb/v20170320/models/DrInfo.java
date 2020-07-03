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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrInfo extends AbstractModel{

    /**
    * 灾备实例状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 可用区信息
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 地域信息
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例同步状态。可能的返回值为：
0 - 灾备未同步；
1 - 灾备同步中；
2 - 灾备同步成功；
3 - 灾备同步失败；
4 - 灾备同步修复中。
    */
    @SerializedName("SyncStatus")
    @Expose
    private Long SyncStatus;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
     * Get 灾备实例状态 
     * @return Status 灾备实例状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 灾备实例状态
     * @param Status 灾备实例状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 可用区信息 
     * @return Zone 可用区信息
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区信息
     * @param Zone 可用区信息
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

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
     * Get 地域信息 
     * @return Region 地域信息
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域信息
     * @param Region 地域信息
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例同步状态。可能的返回值为：
0 - 灾备未同步；
1 - 灾备同步中；
2 - 灾备同步成功；
3 - 灾备同步失败；
4 - 灾备同步修复中。 
     * @return SyncStatus 实例同步状态。可能的返回值为：
0 - 灾备未同步；
1 - 灾备同步中；
2 - 灾备同步成功；
3 - 灾备同步失败；
4 - 灾备同步修复中。
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set 实例同步状态。可能的返回值为：
0 - 灾备未同步；
1 - 灾备同步中；
2 - 灾备同步成功；
3 - 灾备同步失败；
4 - 灾备同步修复中。
     * @param SyncStatus 实例同步状态。可能的返回值为：
0 - 灾备未同步；
1 - 灾备同步中；
2 - 灾备同步成功；
3 - 灾备同步失败；
4 - 灾备同步修复中。
     */
    public void setSyncStatus(Long SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);

    }
}

