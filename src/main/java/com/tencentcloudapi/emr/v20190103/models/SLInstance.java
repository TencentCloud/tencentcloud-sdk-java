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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SLInstance extends AbstractModel {

    /**
    * EMR Instance Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * EMR Numeric Instance Id
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * Instance Name
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * Region id
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * Zone Name
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * Pay Mode
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * Disk Type
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * Disk Size
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * Node Type
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * Node Number
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * Expire Time
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * Isolate Time
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * Create Time
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Auto Renew Flag
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * EMR Numeric Instance Status
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * Zone Setting
    */
    @SerializedName("ZoneSettings")
    @Expose
    private ZoneSetting [] ZoneSettings;

    /**
    * Bound Tags
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * Deploy Role
    */
    @SerializedName("DeployRole")
    @Expose
    private String DeployRole;

    /**
     * Get EMR Instance Id 
     * @return InstanceId EMR Instance Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set EMR Instance Id
     * @param InstanceId EMR Instance Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get EMR Numeric Instance Id 
     * @return ClusterId EMR Numeric Instance Id
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set EMR Numeric Instance Id
     * @param ClusterId EMR Numeric Instance Id
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get Instance Name 
     * @return InstanceName Instance Name
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set Instance Name
     * @param InstanceName Instance Name
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get Region id 
     * @return RegionId Region id
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set Region id
     * @param RegionId Region id
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get Zone Name 
     * @return Zone Zone Name
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set Zone Name
     * @param Zone Zone Name
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get Pay Mode 
     * @return PayMode Pay Mode
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set Pay Mode
     * @param PayMode Pay Mode
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get Disk Type 
     * @return DiskType Disk Type
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set Disk Type
     * @param DiskType Disk Type
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get Disk Size 
     * @return DiskSize Disk Size
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set Disk Size
     * @param DiskSize Disk Size
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get Node Type 
     * @return NodeType Node Type
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set Node Type
     * @param NodeType Node Type
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get Node Number 
     * @return NodeNum Node Number
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set Node Number
     * @param NodeNum Node Number
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get Expire Time 
     * @return ExpireTime Expire Time
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set Expire Time
     * @param ExpireTime Expire Time
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get Isolate Time 
     * @return IsolateTime Isolate Time
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set Isolate Time
     * @param IsolateTime Isolate Time
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get Create Time 
     * @return CreateTime Create Time
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set Create Time
     * @param CreateTime Create Time
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Auto Renew Flag 
     * @return AutoRenewFlag Auto Renew Flag
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set Auto Renew Flag
     * @param AutoRenewFlag Auto Renew Flag
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get EMR Numeric Instance Status 
     * @return Status EMR Numeric Instance Status
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set EMR Numeric Instance Status
     * @param Status EMR Numeric Instance Status
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get Zone Setting 
     * @return ZoneSettings Zone Setting
     */
    public ZoneSetting [] getZoneSettings() {
        return this.ZoneSettings;
    }

    /**
     * Set Zone Setting
     * @param ZoneSettings Zone Setting
     */
    public void setZoneSettings(ZoneSetting [] ZoneSettings) {
        this.ZoneSettings = ZoneSettings;
    }

    /**
     * Get Bound Tags 
     * @return Tags Bound Tags
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set Bound Tags
     * @param Tags Bound Tags
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get Deploy Role 
     * @return DeployRole Deploy Role
     */
    public String getDeployRole() {
        return this.DeployRole;
    }

    /**
     * Set Deploy Role
     * @param DeployRole Deploy Role
     */
    public void setDeployRole(String DeployRole) {
        this.DeployRole = DeployRole;
    }

    public SLInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SLInstance(SLInstance source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.DiskType != null) {
            this.DiskType = new String(source.DiskType);
        }
        if (source.DiskSize != null) {
            this.DiskSize = new Long(source.DiskSize);
        }
        if (source.NodeType != null) {
            this.NodeType = new String(source.NodeType);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.ZoneSettings != null) {
            this.ZoneSettings = new ZoneSetting[source.ZoneSettings.length];
            for (int i = 0; i < source.ZoneSettings.length; i++) {
                this.ZoneSettings[i] = new ZoneSetting(source.ZoneSettings[i]);
            }
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.DeployRole != null) {
            this.DeployRole = new String(source.DeployRole);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "ZoneSettings.", this.ZoneSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeployRole", this.DeployRole);

    }
}

