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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DrInfo extends AbstractModel {

    /**
    * <p>灾备实例状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 运行中</li><li>4： 正在进行隔离操作</li><li>5： 已隔离</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>可用区信息</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>地域信息</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例同步状态。可能的返回值为：<br>0 - 灾备未同步；<br>1 - 灾备同步中；<br>2 - 灾备同步成功；<br>3 - 灾备同步失败；<br>4 - 灾备同步修复中。</p>
    */
    @SerializedName("SyncStatus")
    @Expose
    private Long SyncStatus;

    /**
    * <p>实例名称</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>实例类型</p>
    */
    @SerializedName("InstanceType")
    @Expose
    private Long InstanceType;

    /**
     * Get <p>灾备实例状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 运行中</li><li>4： 正在进行隔离操作</li><li>5： 已隔离</li></ul> 
     * @return Status <p>灾备实例状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 运行中</li><li>4： 正在进行隔离操作</li><li>5： 已隔离</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>灾备实例状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 运行中</li><li>4： 正在进行隔离操作</li><li>5： 已隔离</li></ul>
     * @param Status <p>灾备实例状态</p><p>枚举值：</p><ul><li>0： 创建中</li><li>1： 运行中</li><li>4： 正在进行隔离操作</li><li>5： 已隔离</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>可用区信息</p> 
     * @return Zone <p>可用区信息</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区信息</p>
     * @param Zone <p>可用区信息</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

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
     * Get <p>地域信息</p> 
     * @return Region <p>地域信息</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域信息</p>
     * @param Region <p>地域信息</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例同步状态。可能的返回值为：<br>0 - 灾备未同步；<br>1 - 灾备同步中；<br>2 - 灾备同步成功；<br>3 - 灾备同步失败；<br>4 - 灾备同步修复中。</p> 
     * @return SyncStatus <p>实例同步状态。可能的返回值为：<br>0 - 灾备未同步；<br>1 - 灾备同步中；<br>2 - 灾备同步成功；<br>3 - 灾备同步失败；<br>4 - 灾备同步修复中。</p>
     */
    public Long getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>实例同步状态。可能的返回值为：<br>0 - 灾备未同步；<br>1 - 灾备同步中；<br>2 - 灾备同步成功；<br>3 - 灾备同步失败；<br>4 - 灾备同步修复中。</p>
     * @param SyncStatus <p>实例同步状态。可能的返回值为：<br>0 - 灾备未同步；<br>1 - 灾备同步中；<br>2 - 灾备同步成功；<br>3 - 灾备同步失败；<br>4 - 灾备同步修复中。</p>
     */
    public void setSyncStatus(Long SyncStatus) {
        this.SyncStatus = SyncStatus;
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
     * Get <p>实例类型</p> 
     * @return InstanceType <p>实例类型</p>
     */
    public Long getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set <p>实例类型</p>
     * @param InstanceType <p>实例类型</p>
     */
    public void setInstanceType(Long InstanceType) {
        this.InstanceType = InstanceType;
    }

    public DrInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DrInfo(DrInfo source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SyncStatus != null) {
            this.SyncStatus = new Long(source.SyncStatus);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new Long(source.InstanceType);
        }
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

