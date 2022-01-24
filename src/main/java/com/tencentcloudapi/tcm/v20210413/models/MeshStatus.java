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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MeshStatus extends AbstractModel{

    /**
    * 服务数量
    */
    @SerializedName("ServiceCount")
    @Expose
    private Long ServiceCount;

    /**
    * 灰度升级的版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CanaryVersion")
    @Expose
    private String CanaryVersion;

    /**
    * 已废弃
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Prometheus")
    @Expose
    private PrometheusStatus [] Prometheus;

    /**
    * 状态附带信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StateMessage")
    @Expose
    private String StateMessage;

    /**
    * 正在执行的异步操作
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActiveOperationList")
    @Expose
    private ActiveOperation [] ActiveOperationList;

    /**
    * 获取TPS信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TPS")
    @Expose
    private PrometheusStatus TPS;

    /**
     * Get 服务数量 
     * @return ServiceCount 服务数量
     */
    public Long getServiceCount() {
        return this.ServiceCount;
    }

    /**
     * Set 服务数量
     * @param ServiceCount 服务数量
     */
    public void setServiceCount(Long ServiceCount) {
        this.ServiceCount = ServiceCount;
    }

    /**
     * Get 灰度升级的版本
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CanaryVersion 灰度升级的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCanaryVersion() {
        return this.CanaryVersion;
    }

    /**
     * Set 灰度升级的版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param CanaryVersion 灰度升级的版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCanaryVersion(String CanaryVersion) {
        this.CanaryVersion = CanaryVersion;
    }

    /**
     * Get 已废弃
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Prometheus 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusStatus [] getPrometheus() {
        return this.Prometheus;
    }

    /**
     * Set 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     * @param Prometheus 已废弃
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrometheus(PrometheusStatus [] Prometheus) {
        this.Prometheus = Prometheus;
    }

    /**
     * Get 状态附带信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StateMessage 状态附带信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStateMessage() {
        return this.StateMessage;
    }

    /**
     * Set 状态附带信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param StateMessage 状态附带信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStateMessage(String StateMessage) {
        this.StateMessage = StateMessage;
    }

    /**
     * Get 正在执行的异步操作
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActiveOperationList 正在执行的异步操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ActiveOperation [] getActiveOperationList() {
        return this.ActiveOperationList;
    }

    /**
     * Set 正在执行的异步操作
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActiveOperationList 正在执行的异步操作
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActiveOperationList(ActiveOperation [] ActiveOperationList) {
        this.ActiveOperationList = ActiveOperationList;
    }

    /**
     * Get 获取TPS信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TPS 获取TPS信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusStatus getTPS() {
        return this.TPS;
    }

    /**
     * Set 获取TPS信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TPS 获取TPS信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTPS(PrometheusStatus TPS) {
        this.TPS = TPS;
    }

    public MeshStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MeshStatus(MeshStatus source) {
        if (source.ServiceCount != null) {
            this.ServiceCount = new Long(source.ServiceCount);
        }
        if (source.CanaryVersion != null) {
            this.CanaryVersion = new String(source.CanaryVersion);
        }
        if (source.Prometheus != null) {
            this.Prometheus = new PrometheusStatus[source.Prometheus.length];
            for (int i = 0; i < source.Prometheus.length; i++) {
                this.Prometheus[i] = new PrometheusStatus(source.Prometheus[i]);
            }
        }
        if (source.StateMessage != null) {
            this.StateMessage = new String(source.StateMessage);
        }
        if (source.ActiveOperationList != null) {
            this.ActiveOperationList = new ActiveOperation[source.ActiveOperationList.length];
            for (int i = 0; i < source.ActiveOperationList.length; i++) {
                this.ActiveOperationList[i] = new ActiveOperation(source.ActiveOperationList[i]);
            }
        }
        if (source.TPS != null) {
            this.TPS = new PrometheusStatus(source.TPS);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceCount", this.ServiceCount);
        this.setParamSimple(map, prefix + "CanaryVersion", this.CanaryVersion);
        this.setParamArrayObj(map, prefix + "Prometheus.", this.Prometheus);
        this.setParamSimple(map, prefix + "StateMessage", this.StateMessage);
        this.setParamArrayObj(map, prefix + "ActiveOperationList.", this.ActiveOperationList);
        this.setParamObj(map, prefix + "TPS.", this.TPS);

    }
}

