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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupPod extends AbstractModel{

    /**
    * 实例名称(对应到kubernetes的pod名称)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 实例ID(对应到kubernetes的pod id)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * 实例状态，请参考后面的实例以及容器的状态定义
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例处于当前状态的原因，例如容器下载镜像失败
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 主机IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 实例IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 实例中容器的重启次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * 实例中已就绪容器的个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReadyCount")
    @Expose
    private Long ReadyCount;

    /**
    * 运行时长
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 实例启动时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 服务实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceInstanceStatus")
    @Expose
    private String ServiceInstanceStatus;

    /**
    * 机器实例可使用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAvailableStatus")
    @Expose
    private String InstanceAvailableStatus;

    /**
    * 机器实例状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 节点实例id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeInstanceId")
    @Expose
    private String NodeInstanceId;

    /**
     * Get 实例名称(对应到kubernetes的pod名称)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodName 实例名称(对应到kubernetes的pod名称)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 实例名称(对应到kubernetes的pod名称)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodName 实例名称(对应到kubernetes的pod名称)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 实例ID(对应到kubernetes的pod id)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PodId 实例ID(对应到kubernetes的pod id)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set 实例ID(对应到kubernetes的pod id)
注意：此字段可能返回 null，表示取不到有效值。
     * @param PodId 实例ID(对应到kubernetes的pod id)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get 实例状态，请参考后面的实例以及容器的状态定义
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 实例状态，请参考后面的实例以及容器的状态定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，请参考后面的实例以及容器的状态定义
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 实例状态，请参考后面的实例以及容器的状态定义
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例处于当前状态的原因，例如容器下载镜像失败
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 实例处于当前状态的原因，例如容器下载镜像失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 实例处于当前状态的原因，例如容器下载镜像失败
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 实例处于当前状态的原因，例如容器下载镜像失败
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 主机IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeIp 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeIp 主机IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 实例IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ip 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ip 实例IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 实例中容器的重启次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RestartCount 实例中容器的重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 实例中容器的重启次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param RestartCount 实例中容器的重启次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get 实例中已就绪容器的个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReadyCount 实例中已就绪容器的个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReadyCount() {
        return this.ReadyCount;
    }

    /**
     * Set 实例中已就绪容器的个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReadyCount 实例中已就绪容器的个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReadyCount(Long ReadyCount) {
        this.ReadyCount = ReadyCount;
    }

    /**
     * Get 运行时长
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Runtime 运行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 运行时长
注意：此字段可能返回 null，表示取不到有效值。
     * @param Runtime 运行时长
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 实例启动时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt 实例启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 实例启动时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt 实例启动时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 服务实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceInstanceStatus 服务实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceInstanceStatus() {
        return this.ServiceInstanceStatus;
    }

    /**
     * Set 服务实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceInstanceStatus 服务实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceInstanceStatus(String ServiceInstanceStatus) {
        this.ServiceInstanceStatus = ServiceInstanceStatus;
    }

    /**
     * Get 机器实例可使用状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceAvailableStatus 机器实例可使用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceAvailableStatus() {
        return this.InstanceAvailableStatus;
    }

    /**
     * Set 机器实例可使用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAvailableStatus 机器实例可使用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAvailableStatus(String InstanceAvailableStatus) {
        this.InstanceAvailableStatus = InstanceAvailableStatus;
    }

    /**
     * Get 机器实例状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 机器实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 机器实例状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 机器实例状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 节点实例id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeInstanceId 节点实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeInstanceId() {
        return this.NodeInstanceId;
    }

    /**
     * Set 节点实例id
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeInstanceId 节点实例id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeInstanceId(String NodeInstanceId) {
        this.NodeInstanceId = NodeInstanceId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PodName", this.PodName);
        this.setParamSimple(map, prefix + "PodId", this.PodId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "NodeIp", this.NodeIp);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "RestartCount", this.RestartCount);
        this.setParamSimple(map, prefix + "ReadyCount", this.ReadyCount);
        this.setParamSimple(map, prefix + "Runtime", this.Runtime);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "ServiceInstanceStatus", this.ServiceInstanceStatus);
        this.setParamSimple(map, prefix + "InstanceAvailableStatus", this.InstanceAvailableStatus);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "NodeInstanceId", this.NodeInstanceId);

    }
}

