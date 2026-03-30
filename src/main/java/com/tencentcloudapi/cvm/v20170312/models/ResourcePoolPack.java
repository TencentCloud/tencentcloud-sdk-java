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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourcePoolPack extends AbstractModel {

    /**
    * 实例资源池ID。形如：rpp-rn99mzt2。
    */
    @SerializedName("DedicatedResourcePackId")
    @Expose
    private String DedicatedResourcePackId;

    /**
    * 实例资源池的名称。
    */
    @SerializedName("DedicatedResourcePackName")
    @Expose
    private String DedicatedResourcePackName;

    /**
    * 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例资源池预扣包的实例类型。形如：SA9。
    */
    @SerializedName("InstanceFamily")
    @Expose
    private String InstanceFamily;

    /**
    * 实例资源池类型。
返回项：EXCLUSIVE (独享) | SHARED (共享)。
    */
    @SerializedName("ResourcePoolPackType")
    @Expose
    private String ResourcePoolPackType;

    /**
    * 实例资源池状态。
返回项：CREATING (创建中) | ACTIVE (运行中) | FAILED (创建失败) | RETIRED (已过期)。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例资源池总容量。
    */
    @SerializedName("TotalCapacity")
    @Expose
    private ResourceCount TotalCapacity;

    /**
    * 实例资源池剩余容量。
    */
    @SerializedName("AvailableCapacity")
    @Expose
    private ResourceCount AvailableCapacity;

    /**
    * 底层物理机IP（已加密）。
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 机架ID（已加密）。
    */
    @SerializedName("RackId")
    @Expose
    private String RackId;

    /**
    * 交换机ID（已加密）。
    */
    @SerializedName("SwitchId")
    @Expose
    private String SwitchId;

    /**
    * 自动放置开关状态。开启则在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。关闭则在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。
    */
    @SerializedName("AutoPlacement")
    @Expose
    private Boolean AutoPlacement;

    /**
    * 自动续费标识。
返回项：NOTIFY_AND_AUTO_RENEW (通知且自动续费) | NOTIFY_AND_MANUAL_RENEW (通知不自动续费) | DISABLE_NOTIFY_AND_MANUAL_RENEW (不通知不自动续费)。
    */
    @SerializedName("RenewFlag")
    @Expose
    private String RenewFlag;

    /**
    * 实例资源池预扣包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 实例资源池到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * Get 实例资源池ID。形如：rpp-rn99mzt2。 
     * @return DedicatedResourcePackId 实例资源池ID。形如：rpp-rn99mzt2。
     */
    public String getDedicatedResourcePackId() {
        return this.DedicatedResourcePackId;
    }

    /**
     * Set 实例资源池ID。形如：rpp-rn99mzt2。
     * @param DedicatedResourcePackId 实例资源池ID。形如：rpp-rn99mzt2。
     */
    public void setDedicatedResourcePackId(String DedicatedResourcePackId) {
        this.DedicatedResourcePackId = DedicatedResourcePackId;
    }

    /**
     * Get 实例资源池的名称。 
     * @return DedicatedResourcePackName 实例资源池的名称。
     */
    public String getDedicatedResourcePackName() {
        return this.DedicatedResourcePackName;
    }

    /**
     * Set 实例资源池的名称。
     * @param DedicatedResourcePackName 实例资源池的名称。
     */
    public void setDedicatedResourcePackName(String DedicatedResourcePackName) {
        this.DedicatedResourcePackName = DedicatedResourcePackName;
    }

    /**
     * Get 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a> 
     * @return Zone 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     * @param Zone 实例资源池预扣包所在可用区。形如：ap-guangzhou-6。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。 
     * @return InstanceType 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。
     * @param InstanceType 实例资源池预扣包的规格，仅支持半整机/整机规格。形如：SA9.96XLARGE1152（SA9半整机）。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 实例资源池预扣包的实例类型。形如：SA9。 
     * @return InstanceFamily 实例资源池预扣包的实例类型。形如：SA9。
     */
    public String getInstanceFamily() {
        return this.InstanceFamily;
    }

    /**
     * Set 实例资源池预扣包的实例类型。形如：SA9。
     * @param InstanceFamily 实例资源池预扣包的实例类型。形如：SA9。
     */
    public void setInstanceFamily(String InstanceFamily) {
        this.InstanceFamily = InstanceFamily;
    }

    /**
     * Get 实例资源池类型。
返回项：EXCLUSIVE (独享) | SHARED (共享)。 
     * @return ResourcePoolPackType 实例资源池类型。
返回项：EXCLUSIVE (独享) | SHARED (共享)。
     */
    public String getResourcePoolPackType() {
        return this.ResourcePoolPackType;
    }

    /**
     * Set 实例资源池类型。
返回项：EXCLUSIVE (独享) | SHARED (共享)。
     * @param ResourcePoolPackType 实例资源池类型。
返回项：EXCLUSIVE (独享) | SHARED (共享)。
     */
    public void setResourcePoolPackType(String ResourcePoolPackType) {
        this.ResourcePoolPackType = ResourcePoolPackType;
    }

    /**
     * Get 实例资源池状态。
返回项：CREATING (创建中) | ACTIVE (运行中) | FAILED (创建失败) | RETIRED (已过期)。 
     * @return Status 实例资源池状态。
返回项：CREATING (创建中) | ACTIVE (运行中) | FAILED (创建失败) | RETIRED (已过期)。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例资源池状态。
返回项：CREATING (创建中) | ACTIVE (运行中) | FAILED (创建失败) | RETIRED (已过期)。
     * @param Status 实例资源池状态。
返回项：CREATING (创建中) | ACTIVE (运行中) | FAILED (创建失败) | RETIRED (已过期)。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例资源池总容量。 
     * @return TotalCapacity 实例资源池总容量。
     */
    public ResourceCount getTotalCapacity() {
        return this.TotalCapacity;
    }

    /**
     * Set 实例资源池总容量。
     * @param TotalCapacity 实例资源池总容量。
     */
    public void setTotalCapacity(ResourceCount TotalCapacity) {
        this.TotalCapacity = TotalCapacity;
    }

    /**
     * Get 实例资源池剩余容量。 
     * @return AvailableCapacity 实例资源池剩余容量。
     */
    public ResourceCount getAvailableCapacity() {
        return this.AvailableCapacity;
    }

    /**
     * Set 实例资源池剩余容量。
     * @param AvailableCapacity 实例资源池剩余容量。
     */
    public void setAvailableCapacity(ResourceCount AvailableCapacity) {
        this.AvailableCapacity = AvailableCapacity;
    }

    /**
     * Get 底层物理机IP（已加密）。 
     * @return HostIp 底层物理机IP（已加密）。
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 底层物理机IP（已加密）。
     * @param HostIp 底层物理机IP（已加密）。
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 机架ID（已加密）。 
     * @return RackId 机架ID（已加密）。
     */
    public String getRackId() {
        return this.RackId;
    }

    /**
     * Set 机架ID（已加密）。
     * @param RackId 机架ID（已加密）。
     */
    public void setRackId(String RackId) {
        this.RackId = RackId;
    }

    /**
     * Get 交换机ID（已加密）。 
     * @return SwitchId 交换机ID（已加密）。
     */
    public String getSwitchId() {
        return this.SwitchId;
    }

    /**
     * Set 交换机ID（已加密）。
     * @param SwitchId 交换机ID（已加密）。
     */
    public void setSwitchId(String SwitchId) {
        this.SwitchId = SwitchId;
    }

    /**
     * Get 自动放置开关状态。开启则在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。关闭则在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。 
     * @return AutoPlacement 自动放置开关状态。开启则在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。关闭则在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。
     */
    public Boolean getAutoPlacement() {
        return this.AutoPlacement;
    }

    /**
     * Set 自动放置开关状态。开启则在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。关闭则在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。
     * @param AutoPlacement 自动放置开关状态。开启则在不指定实例资源池创建实例时，系统会在开启了该能力的实例资源池里寻找合适的池子创建实例。关闭则在不指定实例资源池创建实例时，系统不会在该池子里创建实例，只有在指定实例资源池创建实例时，指定了该池子的ID，才允许在池子内创建实例。
     */
    public void setAutoPlacement(Boolean AutoPlacement) {
        this.AutoPlacement = AutoPlacement;
    }

    /**
     * Get 自动续费标识。
返回项：NOTIFY_AND_AUTO_RENEW (通知且自动续费) | NOTIFY_AND_MANUAL_RENEW (通知不自动续费) | DISABLE_NOTIFY_AND_MANUAL_RENEW (不通知不自动续费)。 
     * @return RenewFlag 自动续费标识。
返回项：NOTIFY_AND_AUTO_RENEW (通知且自动续费) | NOTIFY_AND_MANUAL_RENEW (通知不自动续费) | DISABLE_NOTIFY_AND_MANUAL_RENEW (不通知不自动续费)。
     */
    public String getRenewFlag() {
        return this.RenewFlag;
    }

    /**
     * Set 自动续费标识。
返回项：NOTIFY_AND_AUTO_RENEW (通知且自动续费) | NOTIFY_AND_MANUAL_RENEW (通知不自动续费) | DISABLE_NOTIFY_AND_MANUAL_RENEW (不通知不自动续费)。
     * @param RenewFlag 自动续费标识。
返回项：NOTIFY_AND_AUTO_RENEW (通知且自动续费) | NOTIFY_AND_MANUAL_RENEW (通知不自动续费) | DISABLE_NOTIFY_AND_MANUAL_RENEW (不通知不自动续费)。
     */
    public void setRenewFlag(String RenewFlag) {
        this.RenewFlag = RenewFlag;
    }

    /**
     * Get 实例资源池预扣包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return StartTime 实例资源池预扣包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 实例资源池预扣包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param StartTime 实例资源池预扣包创建时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 实例资源池到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return EndTime 实例资源池到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 实例资源池到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param EndTime 实例资源池到期时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public ResourcePoolPack() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourcePoolPack(ResourcePoolPack source) {
        if (source.DedicatedResourcePackId != null) {
            this.DedicatedResourcePackId = new String(source.DedicatedResourcePackId);
        }
        if (source.DedicatedResourcePackName != null) {
            this.DedicatedResourcePackName = new String(source.DedicatedResourcePackName);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.InstanceFamily != null) {
            this.InstanceFamily = new String(source.InstanceFamily);
        }
        if (source.ResourcePoolPackType != null) {
            this.ResourcePoolPackType = new String(source.ResourcePoolPackType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.TotalCapacity != null) {
            this.TotalCapacity = new ResourceCount(source.TotalCapacity);
        }
        if (source.AvailableCapacity != null) {
            this.AvailableCapacity = new ResourceCount(source.AvailableCapacity);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.RackId != null) {
            this.RackId = new String(source.RackId);
        }
        if (source.SwitchId != null) {
            this.SwitchId = new String(source.SwitchId);
        }
        if (source.AutoPlacement != null) {
            this.AutoPlacement = new Boolean(source.AutoPlacement);
        }
        if (source.RenewFlag != null) {
            this.RenewFlag = new String(source.RenewFlag);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DedicatedResourcePackId", this.DedicatedResourcePackId);
        this.setParamSimple(map, prefix + "DedicatedResourcePackName", this.DedicatedResourcePackName);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceFamily", this.InstanceFamily);
        this.setParamSimple(map, prefix + "ResourcePoolPackType", this.ResourcePoolPackType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "TotalCapacity.", this.TotalCapacity);
        this.setParamObj(map, prefix + "AvailableCapacity.", this.AvailableCapacity);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "RackId", this.RackId);
        this.setParamSimple(map, prefix + "SwitchId", this.SwitchId);
        this.setParamSimple(map, prefix + "AutoPlacement", this.AutoPlacement);
        this.setParamSimple(map, prefix + "RenewFlag", this.RenewFlag);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

