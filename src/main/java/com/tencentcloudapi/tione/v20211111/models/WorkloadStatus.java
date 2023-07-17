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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkloadStatus extends AbstractModel{

    /**
    * 当前实例数
    */
    @SerializedName("Replicas")
    @Expose
    private Long Replicas;

    /**
    * 更新的实例数
    */
    @SerializedName("UpdatedReplicas")
    @Expose
    private Long UpdatedReplicas;

    /**
    * 就绪的实例数
    */
    @SerializedName("ReadyReplicas")
    @Expose
    private Long ReadyReplicas;

    /**
    * 可用的实例数
    */
    @SerializedName("AvailableReplicas")
    @Expose
    private Long AvailableReplicas;

    /**
    * 不可用的实例数
    */
    @SerializedName("UnavailableReplicas")
    @Expose
    private Long UnavailableReplicas;

    /**
    * Normal	正常运行中
Abnormal	服务异常，例如容器启动失败等
Waiting	服务等待中，例如容器下载镜像过程等
Stopped   已停止 
Pending 启动中
Stopping 停止中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 工作负载的状况信息
    */
    @SerializedName("StatefulSetCondition")
    @Expose
    private StatefulSetCondition [] StatefulSetCondition;

    /**
    * 工作负载历史的状况信息
    */
    @SerializedName("Conditions")
    @Expose
    private StatefulSetCondition [] Conditions;

    /**
    * 状态异常时，展示原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get 当前实例数 
     * @return Replicas 当前实例数
     */
    public Long getReplicas() {
        return this.Replicas;
    }

    /**
     * Set 当前实例数
     * @param Replicas 当前实例数
     */
    public void setReplicas(Long Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * Get 更新的实例数 
     * @return UpdatedReplicas 更新的实例数
     */
    public Long getUpdatedReplicas() {
        return this.UpdatedReplicas;
    }

    /**
     * Set 更新的实例数
     * @param UpdatedReplicas 更新的实例数
     */
    public void setUpdatedReplicas(Long UpdatedReplicas) {
        this.UpdatedReplicas = UpdatedReplicas;
    }

    /**
     * Get 就绪的实例数 
     * @return ReadyReplicas 就绪的实例数
     */
    public Long getReadyReplicas() {
        return this.ReadyReplicas;
    }

    /**
     * Set 就绪的实例数
     * @param ReadyReplicas 就绪的实例数
     */
    public void setReadyReplicas(Long ReadyReplicas) {
        this.ReadyReplicas = ReadyReplicas;
    }

    /**
     * Get 可用的实例数 
     * @return AvailableReplicas 可用的实例数
     */
    public Long getAvailableReplicas() {
        return this.AvailableReplicas;
    }

    /**
     * Set 可用的实例数
     * @param AvailableReplicas 可用的实例数
     */
    public void setAvailableReplicas(Long AvailableReplicas) {
        this.AvailableReplicas = AvailableReplicas;
    }

    /**
     * Get 不可用的实例数 
     * @return UnavailableReplicas 不可用的实例数
     */
    public Long getUnavailableReplicas() {
        return this.UnavailableReplicas;
    }

    /**
     * Set 不可用的实例数
     * @param UnavailableReplicas 不可用的实例数
     */
    public void setUnavailableReplicas(Long UnavailableReplicas) {
        this.UnavailableReplicas = UnavailableReplicas;
    }

    /**
     * Get Normal	正常运行中
Abnormal	服务异常，例如容器启动失败等
Waiting	服务等待中，例如容器下载镜像过程等
Stopped   已停止 
Pending 启动中
Stopping 停止中 
     * @return Status Normal	正常运行中
Abnormal	服务异常，例如容器启动失败等
Waiting	服务等待中，例如容器下载镜像过程等
Stopped   已停止 
Pending 启动中
Stopping 停止中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Normal	正常运行中
Abnormal	服务异常，例如容器启动失败等
Waiting	服务等待中，例如容器下载镜像过程等
Stopped   已停止 
Pending 启动中
Stopping 停止中
     * @param Status Normal	正常运行中
Abnormal	服务异常，例如容器启动失败等
Waiting	服务等待中，例如容器下载镜像过程等
Stopped   已停止 
Pending 启动中
Stopping 停止中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 工作负载的状况信息 
     * @return StatefulSetCondition 工作负载的状况信息
     */
    public StatefulSetCondition [] getStatefulSetCondition() {
        return this.StatefulSetCondition;
    }

    /**
     * Set 工作负载的状况信息
     * @param StatefulSetCondition 工作负载的状况信息
     */
    public void setStatefulSetCondition(StatefulSetCondition [] StatefulSetCondition) {
        this.StatefulSetCondition = StatefulSetCondition;
    }

    /**
     * Get 工作负载历史的状况信息 
     * @return Conditions 工作负载历史的状况信息
     */
    public StatefulSetCondition [] getConditions() {
        return this.Conditions;
    }

    /**
     * Set 工作负载历史的状况信息
     * @param Conditions 工作负载历史的状况信息
     */
    public void setConditions(StatefulSetCondition [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * Get 状态异常时，展示原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 状态异常时，展示原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 状态异常时，展示原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 状态异常时，展示原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public WorkloadStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkloadStatus(WorkloadStatus source) {
        if (source.Replicas != null) {
            this.Replicas = new Long(source.Replicas);
        }
        if (source.UpdatedReplicas != null) {
            this.UpdatedReplicas = new Long(source.UpdatedReplicas);
        }
        if (source.ReadyReplicas != null) {
            this.ReadyReplicas = new Long(source.ReadyReplicas);
        }
        if (source.AvailableReplicas != null) {
            this.AvailableReplicas = new Long(source.AvailableReplicas);
        }
        if (source.UnavailableReplicas != null) {
            this.UnavailableReplicas = new Long(source.UnavailableReplicas);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.StatefulSetCondition != null) {
            this.StatefulSetCondition = new StatefulSetCondition[source.StatefulSetCondition.length];
            for (int i = 0; i < source.StatefulSetCondition.length; i++) {
                this.StatefulSetCondition[i] = new StatefulSetCondition(source.StatefulSetCondition[i]);
            }
        }
        if (source.Conditions != null) {
            this.Conditions = new StatefulSetCondition[source.Conditions.length];
            for (int i = 0; i < source.Conditions.length; i++) {
                this.Conditions[i] = new StatefulSetCondition(source.Conditions[i]);
            }
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Replicas", this.Replicas);
        this.setParamSimple(map, prefix + "UpdatedReplicas", this.UpdatedReplicas);
        this.setParamSimple(map, prefix + "ReadyReplicas", this.ReadyReplicas);
        this.setParamSimple(map, prefix + "AvailableReplicas", this.AvailableReplicas);
        this.setParamSimple(map, prefix + "UnavailableReplicas", this.UnavailableReplicas);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "StatefulSetCondition.", this.StatefulSetCondition);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

