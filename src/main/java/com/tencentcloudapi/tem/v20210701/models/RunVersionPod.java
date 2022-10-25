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
package com.tencentcloudapi.tem.v20210701.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunVersionPod extends AbstractModel{

    /**
    * shell地址
    */
    @SerializedName("Webshell")
    @Expose
    private String Webshell;

    /**
    * pod的id
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 实例的ip
    */
    @SerializedName("PodIp")
    @Expose
    private String PodIp;

    /**
    * 可用区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 部署版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DeployVersion")
    @Expose
    private String DeployVersion;

    /**
    * 重启次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * pod是否就绪
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ready")
    @Expose
    private Boolean Ready;

    /**
    * 容器状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContainerState")
    @Expose
    private String ContainerState;

    /**
    * 实例所在节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeInfo")
    @Expose
    private NodeInfo NodeInfo;

    /**
    * 启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 是否健康
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unhealthy")
    @Expose
    private Boolean Unhealthy;

    /**
    * 不健康时的提示信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UnhealthyWarningMsg")
    @Expose
    private String UnhealthyWarningMsg;

    /**
    * 版本ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
     * Get shell地址 
     * @return Webshell shell地址
     */
    public String getWebshell() {
        return this.Webshell;
    }

    /**
     * Set shell地址
     * @param Webshell shell地址
     */
    public void setWebshell(String Webshell) {
        this.Webshell = Webshell;
    }

    /**
     * Get pod的id 
     * @return PodId pod的id
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set pod的id
     * @param PodId pod的id
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 实例的ip 
     * @return PodIp 实例的ip
     */
    public String getPodIp() {
        return this.PodIp;
    }

    /**
     * Set 实例的ip
     * @param PodIp 实例的ip
     */
    public void setPodIp(String PodIp) {
        this.PodIp = PodIp;
    }

    /**
     * Get 可用区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区
注意：此字段可能返回 null，表示取不到有效值。
     * @param Zone 可用区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 部署版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DeployVersion 部署版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDeployVersion() {
        return this.DeployVersion;
    }

    /**
     * Set 部署版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param DeployVersion 部署版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDeployVersion(String DeployVersion) {
        this.DeployVersion = DeployVersion;
    }

    /**
     * Get 重启次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount 重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get pod是否就绪
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ready pod是否就绪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getReady() {
        return this.Ready;
    }

    /**
     * Set pod是否就绪
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ready pod是否就绪
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReady(Boolean Ready) {
        this.Ready = Ready;
    }

    /**
     * Get 容器状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContainerState 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContainerState() {
        return this.ContainerState;
    }

    /**
     * Set 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContainerState 容器状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContainerState(String ContainerState) {
        this.ContainerState = ContainerState;
    }

    /**
     * Get 实例所在节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeInfo 实例所在节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeInfo getNodeInfo() {
        return this.NodeInfo;
    }

    /**
     * Set 实例所在节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeInfo 实例所在节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeInfo(NodeInfo NodeInfo) {
        this.NodeInfo = NodeInfo;
    }

    /**
     * Get 启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StartTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param StartTime 启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 是否健康
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Unhealthy 是否健康
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUnhealthy() {
        return this.Unhealthy;
    }

    /**
     * Set 是否健康
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unhealthy 是否健康
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnhealthy(Boolean Unhealthy) {
        this.Unhealthy = Unhealthy;
    }

    /**
     * Get 不健康时的提示信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UnhealthyWarningMsg 不健康时的提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnhealthyWarningMsg() {
        return this.UnhealthyWarningMsg;
    }

    /**
     * Set 不健康时的提示信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UnhealthyWarningMsg 不健康时的提示信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnhealthyWarningMsg(String UnhealthyWarningMsg) {
        this.UnhealthyWarningMsg = UnhealthyWarningMsg;
    }

    /**
     * Get 版本ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId 版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 版本ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId 版本ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 应用名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * Set 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    public RunVersionPod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunVersionPod(RunVersionPod source) {
        if (source.Webshell != null) {
            this.Webshell = new String(source.Webshell);
        }
        if (source.PodId != null) {
            this.PodId = new String(source.PodId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.PodIp != null) {
            this.PodIp = new String(source.PodIp);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.DeployVersion != null) {
            this.DeployVersion = new String(source.DeployVersion);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.Ready != null) {
            this.Ready = new Boolean(source.Ready);
        }
        if (source.ContainerState != null) {
            this.ContainerState = new String(source.ContainerState);
        }
        if (source.NodeInfo != null) {
            this.NodeInfo = new NodeInfo(source.NodeInfo);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.Unhealthy != null) {
            this.Unhealthy = new Boolean(source.Unhealthy);
        }
        if (source.UnhealthyWarningMsg != null) {
            this.UnhealthyWarningMsg = new String(source.UnhealthyWarningMsg);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.ApplicationName != null) {
            this.ApplicationName = new String(source.ApplicationName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Webshell", this.Webshell);
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "PodIp", this.PodIp);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "DeployVersion", this.DeployVersion);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamSimple(map, prefix + "ContainerState", this.ContainerState);
        this.setParamObj(map, prefix + "NodeInfo.", this.NodeInfo);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Unhealthy", this.Unhealthy);
        this.setParamSimple(map, prefix + "UnhealthyWarningMsg", this.UnhealthyWarningMsg);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);

    }
}

