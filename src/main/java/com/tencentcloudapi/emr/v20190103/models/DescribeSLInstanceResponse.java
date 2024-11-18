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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSLInstanceResponse extends AbstractModel {

    /**
    * 实例字符串标识。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 实例存储类型。
    */
    @SerializedName("DiskType")
    @Expose
    private String DiskType;

    /**
    * 实例单节点磁盘容量，单位GB。
    */
    @SerializedName("DiskSize")
    @Expose
    private Long DiskSize;

    /**
    * 实例节点规格。
    */
    @SerializedName("NodeType")
    @Expose
    private String NodeType;

    /**
    * 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。
    */
    @SerializedName("ZoneSettings")
    @Expose
    private ZoneSetting [] ZoneSettings;

    /**
    * 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 实例数字标识。
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * 实例区域ID。
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
    * 实例主可用区。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 实例过期时间，后付费返回0000-00-00 00:00:00
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 实例隔离时间，未隔离返回0000-00-00 00:00:00。
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 实例创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例状态码，-2:  "TERMINATED", 2:   "RUNNING", 14:  "TERMINATING", 19:  "ISOLATING", 22:  "ADJUSTING", 201: "ISOLATED"。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 自动续费标记， 0：表示通知即将过期，但不自动续费 1：表示通知即将过期，而且自动续费 2：表示不通知即将过期，也不自动续费，若业务无续费概念为0
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 实例节点总数。
    */
    @SerializedName("NodeNum")
    @Expose
    private Long NodeNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 实例字符串标识。 
     * @return InstanceId 实例字符串标识。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例字符串标识。
     * @param InstanceId 实例字符串标识。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称。 
     * @return InstanceName 实例名称。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称。
     * @param InstanceName 实例名称。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。 
     * @return PayMode 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。
     * @param PayMode 实例计费模式。0表示后付费，即按量计费，1表示预付费，即包年包月。
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 实例存储类型。 
     * @return DiskType 实例存储类型。
     */
    public String getDiskType() {
        return this.DiskType;
    }

    /**
     * Set 实例存储类型。
     * @param DiskType 实例存储类型。
     */
    public void setDiskType(String DiskType) {
        this.DiskType = DiskType;
    }

    /**
     * Get 实例单节点磁盘容量，单位GB。 
     * @return DiskSize 实例单节点磁盘容量，单位GB。
     */
    public Long getDiskSize() {
        return this.DiskSize;
    }

    /**
     * Set 实例单节点磁盘容量，单位GB。
     * @param DiskSize 实例单节点磁盘容量，单位GB。
     */
    public void setDiskSize(Long DiskSize) {
        this.DiskSize = DiskSize;
    }

    /**
     * Get 实例节点规格。 
     * @return NodeType 实例节点规格。
     */
    public String getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 实例节点规格。
     * @param NodeType 实例节点规格。
     */
    public void setNodeType(String NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。 
     * @return ZoneSettings 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。
     */
    public ZoneSetting [] getZoneSettings() {
        return this.ZoneSettings;
    }

    /**
     * Set 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。
     * @param ZoneSettings 实例可用区详细配置，包含可用区名称，VPC信息、节点数量。
     */
    public void setZoneSettings(ZoneSetting [] ZoneSettings) {
        this.ZoneSettings = ZoneSettings;
    }

    /**
     * Get 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 实例绑定的标签列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 实例数字标识。 
     * @return ClusterId 实例数字标识。
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 实例数字标识。
     * @param ClusterId 实例数字标识。
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 实例区域ID。 
     * @return RegionId 实例区域ID。
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 实例区域ID。
     * @param RegionId 实例区域ID。
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Get 实例主可用区。 
     * @return Zone 实例主可用区。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 实例主可用区。
     * @param Zone 实例主可用区。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 实例过期时间，后付费返回0000-00-00 00:00:00 
     * @return ExpireTime 实例过期时间，后付费返回0000-00-00 00:00:00
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 实例过期时间，后付费返回0000-00-00 00:00:00
     * @param ExpireTime 实例过期时间，后付费返回0000-00-00 00:00:00
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 实例隔离时间，未隔离返回0000-00-00 00:00:00。 
     * @return IsolateTime 实例隔离时间，未隔离返回0000-00-00 00:00:00。
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 实例隔离时间，未隔离返回0000-00-00 00:00:00。
     * @param IsolateTime 实例隔离时间，未隔离返回0000-00-00 00:00:00。
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 实例创建时间。 
     * @return CreateTime 实例创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 实例创建时间。
     * @param CreateTime 实例创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例状态码，-2:  "TERMINATED", 2:   "RUNNING", 14:  "TERMINATING", 19:  "ISOLATING", 22:  "ADJUSTING", 201: "ISOLATED"。 
     * @return Status 实例状态码，-2:  "TERMINATED", 2:   "RUNNING", 14:  "TERMINATING", 19:  "ISOLATING", 22:  "ADJUSTING", 201: "ISOLATED"。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态码，-2:  "TERMINATED", 2:   "RUNNING", 14:  "TERMINATING", 19:  "ISOLATING", 22:  "ADJUSTING", 201: "ISOLATED"。
     * @param Status 实例状态码，-2:  "TERMINATED", 2:   "RUNNING", 14:  "TERMINATING", 19:  "ISOLATING", 22:  "ADJUSTING", 201: "ISOLATED"。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 自动续费标记， 0：表示通知即将过期，但不自动续费 1：表示通知即将过期，而且自动续费 2：表示不通知即将过期，也不自动续费，若业务无续费概念为0 
     * @return AutoRenewFlag 自动续费标记， 0：表示通知即将过期，但不自动续费 1：表示通知即将过期，而且自动续费 2：表示不通知即将过期，也不自动续费，若业务无续费概念为0
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记， 0：表示通知即将过期，但不自动续费 1：表示通知即将过期，而且自动续费 2：表示不通知即将过期，也不自动续费，若业务无续费概念为0
     * @param AutoRenewFlag 自动续费标记， 0：表示通知即将过期，但不自动续费 1：表示通知即将过期，而且自动续费 2：表示不通知即将过期，也不自动续费，若业务无续费概念为0
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 实例节点总数。 
     * @return NodeNum 实例节点总数。
     */
    public Long getNodeNum() {
        return this.NodeNum;
    }

    /**
     * Set 实例节点总数。
     * @param NodeNum 实例节点总数。
     */
    public void setNodeNum(Long NodeNum) {
        this.NodeNum = NodeNum;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeSLInstanceResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSLInstanceResponse(DescribeSLInstanceResponse source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
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
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.RegionId != null) {
            this.RegionId = new Long(source.RegionId);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.NodeNum != null) {
            this.NodeNum = new Long(source.NodeNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "DiskType", this.DiskType);
        this.setParamSimple(map, prefix + "DiskSize", this.DiskSize);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamArrayObj(map, prefix + "ZoneSettings.", this.ZoneSettings);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "NodeNum", this.NodeNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

