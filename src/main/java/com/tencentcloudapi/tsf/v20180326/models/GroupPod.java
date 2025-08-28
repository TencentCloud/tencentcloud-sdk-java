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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GroupPod extends AbstractModel {

    /**
    * 实例名称(对应到kubernetes的pod名称)
    */
    @SerializedName("PodName")
    @Expose
    private String PodName;

    /**
    * 实例ID(对应到kubernetes的pod id)
    */
    @SerializedName("PodId")
    @Expose
    private String PodId;

    /**
    * 实例状态，请参考后面的实例以及容器的状态定义。启动中（pod 未 ready）：Starting；运行中：Running；异常：Abnormal；停止：Stopped；
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 实例处于当前状态的原因，例如容器下载镜像失败
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 主机IP
    */
    @SerializedName("NodeIp")
    @Expose
    private String NodeIp;

    /**
    * 实例IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 实例中容器的重启次数
    */
    @SerializedName("RestartCount")
    @Expose
    private Long RestartCount;

    /**
    * 实例中已就绪容器的个数
    */
    @SerializedName("ReadyCount")
    @Expose
    private Long ReadyCount;

    /**
    * 运行时长，单位秒
    */
    @SerializedName("Runtime")
    @Expose
    private String Runtime;

    /**
    * 实例启动时的时间戳，单位秒
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * 服务实例状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知
    */
    @SerializedName("ServiceInstanceStatus")
    @Expose
    private String ServiceInstanceStatus;

    /**
    * 机器实例可使用状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知
    */
    @SerializedName("InstanceAvailableStatus")
    @Expose
    private String InstanceAvailableStatus;

    /**
    * 机器实例状态
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 节点实例id
    */
    @SerializedName("NodeInstanceId")
    @Expose
    private String NodeInstanceId;

    /**
    * 预期副本数
    */
    @SerializedName("SpecTotalCount")
    @Expose
    private String SpecTotalCount;

    /**
     * Get 实例名称(对应到kubernetes的pod名称) 
     * @return PodName 实例名称(对应到kubernetes的pod名称)
     */
    public String getPodName() {
        return this.PodName;
    }

    /**
     * Set 实例名称(对应到kubernetes的pod名称)
     * @param PodName 实例名称(对应到kubernetes的pod名称)
     */
    public void setPodName(String PodName) {
        this.PodName = PodName;
    }

    /**
     * Get 实例ID(对应到kubernetes的pod id) 
     * @return PodId 实例ID(对应到kubernetes的pod id)
     */
    public String getPodId() {
        return this.PodId;
    }

    /**
     * Set 实例ID(对应到kubernetes的pod id)
     * @param PodId 实例ID(对应到kubernetes的pod id)
     */
    public void setPodId(String PodId) {
        this.PodId = PodId;
    }

    /**
     * Get 实例状态，请参考后面的实例以及容器的状态定义。启动中（pod 未 ready）：Starting；运行中：Running；异常：Abnormal；停止：Stopped； 
     * @return Status 实例状态，请参考后面的实例以及容器的状态定义。启动中（pod 未 ready）：Starting；运行中：Running；异常：Abnormal；停止：Stopped；
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 实例状态，请参考后面的实例以及容器的状态定义。启动中（pod 未 ready）：Starting；运行中：Running；异常：Abnormal；停止：Stopped；
     * @param Status 实例状态，请参考后面的实例以及容器的状态定义。启动中（pod 未 ready）：Starting；运行中：Running；异常：Abnormal；停止：Stopped；
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 实例处于当前状态的原因，例如容器下载镜像失败 
     * @return Reason 实例处于当前状态的原因，例如容器下载镜像失败
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 实例处于当前状态的原因，例如容器下载镜像失败
     * @param Reason 实例处于当前状态的原因，例如容器下载镜像失败
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 主机IP 
     * @return NodeIp 主机IP
     */
    public String getNodeIp() {
        return this.NodeIp;
    }

    /**
     * Set 主机IP
     * @param NodeIp 主机IP
     */
    public void setNodeIp(String NodeIp) {
        this.NodeIp = NodeIp;
    }

    /**
     * Get 实例IP 
     * @return Ip 实例IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 实例IP
     * @param Ip 实例IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 实例中容器的重启次数 
     * @return RestartCount 实例中容器的重启次数
     */
    public Long getRestartCount() {
        return this.RestartCount;
    }

    /**
     * Set 实例中容器的重启次数
     * @param RestartCount 实例中容器的重启次数
     */
    public void setRestartCount(Long RestartCount) {
        this.RestartCount = RestartCount;
    }

    /**
     * Get 实例中已就绪容器的个数 
     * @return ReadyCount 实例中已就绪容器的个数
     */
    public Long getReadyCount() {
        return this.ReadyCount;
    }

    /**
     * Set 实例中已就绪容器的个数
     * @param ReadyCount 实例中已就绪容器的个数
     */
    public void setReadyCount(Long ReadyCount) {
        this.ReadyCount = ReadyCount;
    }

    /**
     * Get 运行时长，单位秒 
     * @return Runtime 运行时长，单位秒
     */
    public String getRuntime() {
        return this.Runtime;
    }

    /**
     * Set 运行时长，单位秒
     * @param Runtime 运行时长，单位秒
     */
    public void setRuntime(String Runtime) {
        this.Runtime = Runtime;
    }

    /**
     * Get 实例启动时的时间戳，单位秒 
     * @return CreatedAt 实例启动时的时间戳，单位秒
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set 实例启动时的时间戳，单位秒
     * @param CreatedAt 实例启动时的时间戳，单位秒
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get 服务实例状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知 
     * @return ServiceInstanceStatus 服务实例状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知
     */
    public String getServiceInstanceStatus() {
        return this.ServiceInstanceStatus;
    }

    /**
     * Set 服务实例状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知
     * @param ServiceInstanceStatus 服务实例状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知
     */
    public void setServiceInstanceStatus(String ServiceInstanceStatus) {
        this.ServiceInstanceStatus = ServiceInstanceStatus;
    }

    /**
     * Get 机器实例可使用状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知 
     * @return InstanceAvailableStatus 机器实例可使用状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知
     */
    public String getInstanceAvailableStatus() {
        return this.InstanceAvailableStatus;
    }

    /**
     * Set 机器实例可使用状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知
     * @param InstanceAvailableStatus 机器实例可使用状态，枚举值为：
- `Starting`：启动中
- `Running`：运行中
- `Stopping`：停止中
- `Stopped`: 已停止
- `StopFailed`: 停止失败
- `Abnormal`: 异常
- `Unknown`: 未知
     */
    public void setInstanceAvailableStatus(String InstanceAvailableStatus) {
        this.InstanceAvailableStatus = InstanceAvailableStatus;
    }

    /**
     * Get 机器实例状态 
     * @return InstanceStatus 机器实例状态
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 机器实例状态
     * @param InstanceStatus 机器实例状态
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * Get 节点实例id 
     * @return NodeInstanceId 节点实例id
     */
    public String getNodeInstanceId() {
        return this.NodeInstanceId;
    }

    /**
     * Set 节点实例id
     * @param NodeInstanceId 节点实例id
     */
    public void setNodeInstanceId(String NodeInstanceId) {
        this.NodeInstanceId = NodeInstanceId;
    }

    /**
     * Get 预期副本数 
     * @return SpecTotalCount 预期副本数
     */
    public String getSpecTotalCount() {
        return this.SpecTotalCount;
    }

    /**
     * Set 预期副本数
     * @param SpecTotalCount 预期副本数
     */
    public void setSpecTotalCount(String SpecTotalCount) {
        this.SpecTotalCount = SpecTotalCount;
    }

    public GroupPod() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GroupPod(GroupPod source) {
        if (source.PodName != null) {
            this.PodName = new String(source.PodName);
        }
        if (source.PodId != null) {
            this.PodId = new String(source.PodId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.NodeIp != null) {
            this.NodeIp = new String(source.NodeIp);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.RestartCount != null) {
            this.RestartCount = new Long(source.RestartCount);
        }
        if (source.ReadyCount != null) {
            this.ReadyCount = new Long(source.ReadyCount);
        }
        if (source.Runtime != null) {
            this.Runtime = new String(source.Runtime);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.ServiceInstanceStatus != null) {
            this.ServiceInstanceStatus = new String(source.ServiceInstanceStatus);
        }
        if (source.InstanceAvailableStatus != null) {
            this.InstanceAvailableStatus = new String(source.InstanceAvailableStatus);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new String(source.InstanceStatus);
        }
        if (source.NodeInstanceId != null) {
            this.NodeInstanceId = new String(source.NodeInstanceId);
        }
        if (source.SpecTotalCount != null) {
            this.SpecTotalCount = new String(source.SpecTotalCount);
        }
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
        this.setParamSimple(map, prefix + "SpecTotalCount", this.SpecTotalCount);

    }
}

