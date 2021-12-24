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
package com.tencentcloudapi.iecp.v20210914.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeEdgeUnitCloudResponse extends AbstractModel{

    /**
    * 边缘集群名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 集群最后探活时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LiveTime")
    @Expose
    private String LiveTime;

    /**
    * 集群状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MasterStatus")
    @Expose
    private String MasterStatus;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("K8sVersion")
    @Expose
    private String K8sVersion;

    /**
    * pod cidr
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodCIDR")
    @Expose
    private String PodCIDR;

    /**
    * service cidr
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceCIDR")
    @Expose
    private String ServiceCIDR;

    /**
    * 集群内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("APIServerAddress")
    @Expose
    private String APIServerAddress;

    /**
    * 集群外网访问地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("APIServerExposeAddress")
    @Expose
    private String APIServerExposeAddress;

    /**
    * 用户ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UID")
    @Expose
    private String UID;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnitID")
    @Expose
    private Long UnitID;

    /**
    * 集群标识
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 节点统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Node")
    @Expose
    private EdgeUnitStatisticItem Node;

    /**
    * 工作负载统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Workload")
    @Expose
    private EdgeUnitStatisticItem Workload;

    /**
    * Grid应用统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Grid")
    @Expose
    private EdgeUnitStatisticItem Grid;

    /**
    * 设备统计
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubDevice")
    @Expose
    private EdgeUnitStatisticItem SubDevice;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 边缘集群名称 
     * @return Name 边缘集群名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 边缘集群名称
     * @param Name 边缘集群名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 集群最后探活时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LiveTime 集群最后探活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLiveTime() {
        return this.LiveTime;
    }

    /**
     * Set 集群最后探活时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LiveTime 集群最后探活时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLiveTime(String LiveTime) {
        this.LiveTime = LiveTime;
    }

    /**
     * Get 集群状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MasterStatus 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMasterStatus() {
        return this.MasterStatus;
    }

    /**
     * Set 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param MasterStatus 集群状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMasterStatus(String MasterStatus) {
        this.MasterStatus = MasterStatus;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return K8sVersion 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getK8sVersion() {
        return this.K8sVersion;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param K8sVersion 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setK8sVersion(String K8sVersion) {
        this.K8sVersion = K8sVersion;
    }

    /**
     * Get pod cidr
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodCIDR pod cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodCIDR() {
        return this.PodCIDR;
    }

    /**
     * Set pod cidr
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodCIDR pod cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodCIDR(String PodCIDR) {
        this.PodCIDR = PodCIDR;
    }

    /**
     * Get service cidr
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceCIDR service cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceCIDR() {
        return this.ServiceCIDR;
    }

    /**
     * Set service cidr
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceCIDR service cidr
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceCIDR(String ServiceCIDR) {
        this.ServiceCIDR = ServiceCIDR;
    }

    /**
     * Get 集群内网访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return APIServerAddress 集群内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAPIServerAddress() {
        return this.APIServerAddress;
    }

    /**
     * Set 集群内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param APIServerAddress 集群内网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAPIServerAddress(String APIServerAddress) {
        this.APIServerAddress = APIServerAddress;
    }

    /**
     * Get 集群外网访问地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return APIServerExposeAddress 集群外网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAPIServerExposeAddress() {
        return this.APIServerExposeAddress;
    }

    /**
     * Set 集群外网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param APIServerExposeAddress 集群外网访问地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAPIServerExposeAddress(String APIServerExposeAddress) {
        this.APIServerExposeAddress = APIServerExposeAddress;
    }

    /**
     * Get 用户ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UID 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUID() {
        return this.UID;
    }

    /**
     * Set 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UID 用户ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUID(String UID) {
        this.UID = UID;
    }

    /**
     * Get 集群ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnitID 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getUnitID() {
        return this.UnitID;
    }

    /**
     * Set 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnitID 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnitID(Long UnitID) {
        this.UnitID = UnitID;
    }

    /**
     * Get 集群标识
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cluster 集群标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * Set 集群标识
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cluster 集群标识
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * Get 节点统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Node 节点统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeUnitStatisticItem getNode() {
        return this.Node;
    }

    /**
     * Set 节点统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Node 节点统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNode(EdgeUnitStatisticItem Node) {
        this.Node = Node;
    }

    /**
     * Get 工作负载统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Workload 工作负载统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeUnitStatisticItem getWorkload() {
        return this.Workload;
    }

    /**
     * Set 工作负载统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Workload 工作负载统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWorkload(EdgeUnitStatisticItem Workload) {
        this.Workload = Workload;
    }

    /**
     * Get Grid应用统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Grid Grid应用统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeUnitStatisticItem getGrid() {
        return this.Grid;
    }

    /**
     * Set Grid应用统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param Grid Grid应用统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGrid(EdgeUnitStatisticItem Grid) {
        this.Grid = Grid;
    }

    /**
     * Get 设备统计
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubDevice 设备统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public EdgeUnitStatisticItem getSubDevice() {
        return this.SubDevice;
    }

    /**
     * Set 设备统计
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubDevice 设备统计
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubDevice(EdgeUnitStatisticItem SubDevice) {
        this.SubDevice = SubDevice;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeEdgeUnitCloudResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeEdgeUnitCloudResponse(DescribeEdgeUnitCloudResponse source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.LiveTime != null) {
            this.LiveTime = new String(source.LiveTime);
        }
        if (source.MasterStatus != null) {
            this.MasterStatus = new String(source.MasterStatus);
        }
        if (source.K8sVersion != null) {
            this.K8sVersion = new String(source.K8sVersion);
        }
        if (source.PodCIDR != null) {
            this.PodCIDR = new String(source.PodCIDR);
        }
        if (source.ServiceCIDR != null) {
            this.ServiceCIDR = new String(source.ServiceCIDR);
        }
        if (source.APIServerAddress != null) {
            this.APIServerAddress = new String(source.APIServerAddress);
        }
        if (source.APIServerExposeAddress != null) {
            this.APIServerExposeAddress = new String(source.APIServerExposeAddress);
        }
        if (source.UID != null) {
            this.UID = new String(source.UID);
        }
        if (source.UnitID != null) {
            this.UnitID = new Long(source.UnitID);
        }
        if (source.Cluster != null) {
            this.Cluster = new String(source.Cluster);
        }
        if (source.Node != null) {
            this.Node = new EdgeUnitStatisticItem(source.Node);
        }
        if (source.Workload != null) {
            this.Workload = new EdgeUnitStatisticItem(source.Workload);
        }
        if (source.Grid != null) {
            this.Grid = new EdgeUnitStatisticItem(source.Grid);
        }
        if (source.SubDevice != null) {
            this.SubDevice = new EdgeUnitStatisticItem(source.SubDevice);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "LiveTime", this.LiveTime);
        this.setParamSimple(map, prefix + "MasterStatus", this.MasterStatus);
        this.setParamSimple(map, prefix + "K8sVersion", this.K8sVersion);
        this.setParamSimple(map, prefix + "PodCIDR", this.PodCIDR);
        this.setParamSimple(map, prefix + "ServiceCIDR", this.ServiceCIDR);
        this.setParamSimple(map, prefix + "APIServerAddress", this.APIServerAddress);
        this.setParamSimple(map, prefix + "APIServerExposeAddress", this.APIServerExposeAddress);
        this.setParamSimple(map, prefix + "UID", this.UID);
        this.setParamSimple(map, prefix + "UnitID", this.UnitID);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamObj(map, prefix + "Node.", this.Node);
        this.setParamObj(map, prefix + "Workload.", this.Workload);
        this.setParamObj(map, prefix + "Grid.", this.Grid);
        this.setParamObj(map, prefix + "SubDevice.", this.SubDevice);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

