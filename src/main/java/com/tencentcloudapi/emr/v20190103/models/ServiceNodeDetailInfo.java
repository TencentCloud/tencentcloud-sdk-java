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

public class ServiceNodeDetailInfo extends AbstractModel {

    /**
    * 进程所在节点IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 进程类型
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 进程名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 服务组件状态
    */
    @SerializedName("ServiceStatus")
    @Expose
    private Long ServiceStatus;

    /**
    * 进程监控状态
    */
    @SerializedName("MonitorStatus")
    @Expose
    private Long MonitorStatus;

    /**
    * 服务组件状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 进程端口信息
    */
    @SerializedName("PortsInfo")
    @Expose
    private String PortsInfo;

    /**
    * 最近重启时间
    */
    @SerializedName("LastRestartTime")
    @Expose
    private String LastRestartTime;

    /**
    * 节点类型
    */
    @SerializedName("Flag")
    @Expose
    private Long Flag;

    /**
    * 配置组ID
    */
    @SerializedName("ConfGroupId")
    @Expose
    private Long ConfGroupId;

    /**
    * 配置组名称
    */
    @SerializedName("ConfGroupName")
    @Expose
    private String ConfGroupName;

    /**
    * 节点是否需要重启
    */
    @SerializedName("ConfStatus")
    @Expose
    private Long ConfStatus;

    /**
    * 进程探测信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceDetectionInfo")
    @Expose
    private ServiceProcessFunctionInfo [] ServiceDetectionInfo;

    /**
    * 节点类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeFlagFilter")
    @Expose
    private String NodeFlagFilter;

    /**
    * 进程健康状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthStatus")
    @Expose
    private HealthStatus HealthStatus;

    /**
    * 角色是否支持监控
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSupportRoleMonitor")
    @Expose
    private Boolean IsSupportRoleMonitor;

    /**
    * 暂停策略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StopPolicies")
    @Expose
    private RestartPolicy [] StopPolicies;

    /**
    * 测试环境api强校验，现网没有，emrcc接口返回有。不加会报错
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HAState")
    @Expose
    private String HAState;

    /**
    * NameService名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NameService")
    @Expose
    private String NameService;

    /**
    * 是否支持联邦
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsFederation")
    @Expose
    private Boolean IsFederation;

    /**
    * datanode是否是维护状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataNodeMaintenanceState")
    @Expose
    private Long DataNodeMaintenanceState;

    /**
     * Get 进程所在节点IP 
     * @return Ip 进程所在节点IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 进程所在节点IP
     * @param Ip 进程所在节点IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 进程类型 
     * @return NodeType 进程类型
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 进程类型
     * @param NodeType 进程类型
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 进程名称 
     * @return NodeName 进程名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 进程名称
     * @param NodeName 进程名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 服务组件状态 
     * @return ServiceStatus 服务组件状态
     */
    public Long getServiceStatus() {
        return this.ServiceStatus;
    }

    /**
     * Set 服务组件状态
     * @param ServiceStatus 服务组件状态
     */
    public void setServiceStatus(Long ServiceStatus) {
        this.ServiceStatus = ServiceStatus;
    }

    /**
     * Get 进程监控状态 
     * @return MonitorStatus 进程监控状态
     */
    public Long getMonitorStatus() {
        return this.MonitorStatus;
    }

    /**
     * Set 进程监控状态
     * @param MonitorStatus 进程监控状态
     */
    public void setMonitorStatus(Long MonitorStatus) {
        this.MonitorStatus = MonitorStatus;
    }

    /**
     * Get 服务组件状态 
     * @return Status 服务组件状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 服务组件状态
     * @param Status 服务组件状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 进程端口信息 
     * @return PortsInfo 进程端口信息
     */
    public String getPortsInfo() {
        return this.PortsInfo;
    }

    /**
     * Set 进程端口信息
     * @param PortsInfo 进程端口信息
     */
    public void setPortsInfo(String PortsInfo) {
        this.PortsInfo = PortsInfo;
    }

    /**
     * Get 最近重启时间 
     * @return LastRestartTime 最近重启时间
     */
    public String getLastRestartTime() {
        return this.LastRestartTime;
    }

    /**
     * Set 最近重启时间
     * @param LastRestartTime 最近重启时间
     */
    public void setLastRestartTime(String LastRestartTime) {
        this.LastRestartTime = LastRestartTime;
    }

    /**
     * Get 节点类型 
     * @return Flag 节点类型
     */
    public Long getFlag() {
        return this.Flag;
    }

    /**
     * Set 节点类型
     * @param Flag 节点类型
     */
    public void setFlag(Long Flag) {
        this.Flag = Flag;
    }

    /**
     * Get 配置组ID 
     * @return ConfGroupId 配置组ID
     */
    public Long getConfGroupId() {
        return this.ConfGroupId;
    }

    /**
     * Set 配置组ID
     * @param ConfGroupId 配置组ID
     */
    public void setConfGroupId(Long ConfGroupId) {
        this.ConfGroupId = ConfGroupId;
    }

    /**
     * Get 配置组名称 
     * @return ConfGroupName 配置组名称
     */
    public String getConfGroupName() {
        return this.ConfGroupName;
    }

    /**
     * Set 配置组名称
     * @param ConfGroupName 配置组名称
     */
    public void setConfGroupName(String ConfGroupName) {
        this.ConfGroupName = ConfGroupName;
    }

    /**
     * Get 节点是否需要重启 
     * @return ConfStatus 节点是否需要重启
     */
    public Long getConfStatus() {
        return this.ConfStatus;
    }

    /**
     * Set 节点是否需要重启
     * @param ConfStatus 节点是否需要重启
     */
    public void setConfStatus(Long ConfStatus) {
        this.ConfStatus = ConfStatus;
    }

    /**
     * Get 进程探测信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceDetectionInfo 进程探测信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceProcessFunctionInfo [] getServiceDetectionInfo() {
        return this.ServiceDetectionInfo;
    }

    /**
     * Set 进程探测信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceDetectionInfo 进程探测信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceDetectionInfo(ServiceProcessFunctionInfo [] ServiceDetectionInfo) {
        this.ServiceDetectionInfo = ServiceDetectionInfo;
    }

    /**
     * Get 节点类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeFlagFilter 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeFlagFilter() {
        return this.NodeFlagFilter;
    }

    /**
     * Set 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeFlagFilter 节点类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeFlagFilter(String NodeFlagFilter) {
        this.NodeFlagFilter = NodeFlagFilter;
    }

    /**
     * Get 进程健康状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HealthStatus 进程健康状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HealthStatus getHealthStatus() {
        return this.HealthStatus;
    }

    /**
     * Set 进程健康状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthStatus 进程健康状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthStatus(HealthStatus HealthStatus) {
        this.HealthStatus = HealthStatus;
    }

    /**
     * Get 角色是否支持监控
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSupportRoleMonitor 角色是否支持监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsSupportRoleMonitor() {
        return this.IsSupportRoleMonitor;
    }

    /**
     * Set 角色是否支持监控
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSupportRoleMonitor 角色是否支持监控
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSupportRoleMonitor(Boolean IsSupportRoleMonitor) {
        this.IsSupportRoleMonitor = IsSupportRoleMonitor;
    }

    /**
     * Get 暂停策略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StopPolicies 暂停策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RestartPolicy [] getStopPolicies() {
        return this.StopPolicies;
    }

    /**
     * Set 暂停策略
注意：此字段可能返回 null，表示取不到有效值。
     * @param StopPolicies 暂停策略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStopPolicies(RestartPolicy [] StopPolicies) {
        this.StopPolicies = StopPolicies;
    }

    /**
     * Get 测试环境api强校验，现网没有，emrcc接口返回有。不加会报错
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HAState 测试环境api强校验，现网没有，emrcc接口返回有。不加会报错
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHAState() {
        return this.HAState;
    }

    /**
     * Set 测试环境api强校验，现网没有，emrcc接口返回有。不加会报错
注意：此字段可能返回 null，表示取不到有效值。
     * @param HAState 测试环境api强校验，现网没有，emrcc接口返回有。不加会报错
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHAState(String HAState) {
        this.HAState = HAState;
    }

    /**
     * Get NameService名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NameService NameService名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNameService() {
        return this.NameService;
    }

    /**
     * Set NameService名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NameService NameService名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNameService(String NameService) {
        this.NameService = NameService;
    }

    /**
     * Get 是否支持联邦
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsFederation 是否支持联邦
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsFederation() {
        return this.IsFederation;
    }

    /**
     * Set 是否支持联邦
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsFederation 是否支持联邦
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsFederation(Boolean IsFederation) {
        this.IsFederation = IsFederation;
    }

    /**
     * Get datanode是否是维护状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataNodeMaintenanceState datanode是否是维护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDataNodeMaintenanceState() {
        return this.DataNodeMaintenanceState;
    }

    /**
     * Set datanode是否是维护状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataNodeMaintenanceState datanode是否是维护状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataNodeMaintenanceState(Long DataNodeMaintenanceState) {
        this.DataNodeMaintenanceState = DataNodeMaintenanceState;
    }

    public ServiceNodeDetailInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceNodeDetailInfo(ServiceNodeDetailInfo source) {
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.ServiceStatus != null) {
            this.ServiceStatus = new Long(source.ServiceStatus);
        }
        if (source.MonitorStatus != null) {
            this.MonitorStatus = new Long(source.MonitorStatus);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.PortsInfo != null) {
            this.PortsInfo = new String(source.PortsInfo);
        }
        if (source.LastRestartTime != null) {
            this.LastRestartTime = new String(source.LastRestartTime);
        }
        if (source.Flag != null) {
            this.Flag = new Long(source.Flag);
        }
        if (source.ConfGroupId != null) {
            this.ConfGroupId = new Long(source.ConfGroupId);
        }
        if (source.ConfGroupName != null) {
            this.ConfGroupName = new String(source.ConfGroupName);
        }
        if (source.ConfStatus != null) {
            this.ConfStatus = new Long(source.ConfStatus);
        }
        if (source.ServiceDetectionInfo != null) {
            this.ServiceDetectionInfo = new ServiceProcessFunctionInfo[source.ServiceDetectionInfo.length];
            for (int i = 0; i < source.ServiceDetectionInfo.length; i++) {
                this.ServiceDetectionInfo[i] = new ServiceProcessFunctionInfo(source.ServiceDetectionInfo[i]);
            }
        }
        if (source.NodeFlagFilter != null) {
            this.NodeFlagFilter = new String(source.NodeFlagFilter);
        }
        if (source.HealthStatus != null) {
            this.HealthStatus = new HealthStatus(source.HealthStatus);
        }
        if (source.IsSupportRoleMonitor != null) {
            this.IsSupportRoleMonitor = new Boolean(source.IsSupportRoleMonitor);
        }
        if (source.StopPolicies != null) {
            this.StopPolicies = new RestartPolicy[source.StopPolicies.length];
            for (int i = 0; i < source.StopPolicies.length; i++) {
                this.StopPolicies[i] = new RestartPolicy(source.StopPolicies[i]);
            }
        }
        if (source.HAState != null) {
            this.HAState = new String(source.HAState);
        }
        if (source.NameService != null) {
            this.NameService = new String(source.NameService);
        }
        if (source.IsFederation != null) {
            this.IsFederation = new Boolean(source.IsFederation);
        }
        if (source.DataNodeMaintenanceState != null) {
            this.DataNodeMaintenanceState = new Long(source.DataNodeMaintenanceState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "ServiceStatus", this.ServiceStatus);
        this.setParamSimple(map, prefix + "MonitorStatus", this.MonitorStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "PortsInfo", this.PortsInfo);
        this.setParamSimple(map, prefix + "LastRestartTime", this.LastRestartTime);
        this.setParamSimple(map, prefix + "Flag", this.Flag);
        this.setParamSimple(map, prefix + "ConfGroupId", this.ConfGroupId);
        this.setParamSimple(map, prefix + "ConfGroupName", this.ConfGroupName);
        this.setParamSimple(map, prefix + "ConfStatus", this.ConfStatus);
        this.setParamArrayObj(map, prefix + "ServiceDetectionInfo.", this.ServiceDetectionInfo);
        this.setParamSimple(map, prefix + "NodeFlagFilter", this.NodeFlagFilter);
        this.setParamObj(map, prefix + "HealthStatus.", this.HealthStatus);
        this.setParamSimple(map, prefix + "IsSupportRoleMonitor", this.IsSupportRoleMonitor);
        this.setParamArrayObj(map, prefix + "StopPolicies.", this.StopPolicies);
        this.setParamSimple(map, prefix + "HAState", this.HAState);
        this.setParamSimple(map, prefix + "NameService", this.NameService);
        this.setParamSimple(map, prefix + "IsFederation", this.IsFederation);
        this.setParamSimple(map, prefix + "DataNodeMaintenanceState", this.DataNodeMaintenanceState);

    }
}

