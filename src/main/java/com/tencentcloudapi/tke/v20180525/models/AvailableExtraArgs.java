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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableExtraArgs extends AbstractModel {

    /**
    * kube-apiserver可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KubeAPIServer")
    @Expose
    private Flag [] KubeAPIServer;

    /**
    * kube-controller-manager可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KubeControllerManager")
    @Expose
    private Flag [] KubeControllerManager;

    /**
    * kube-scheduler可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KubeScheduler")
    @Expose
    private Flag [] KubeScheduler;

    /**
    * kubelet可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kubelet")
    @Expose
    private Flag [] Kubelet;

    /**
     * Get kube-apiserver可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KubeAPIServer kube-apiserver可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Flag [] getKubeAPIServer() {
        return this.KubeAPIServer;
    }

    /**
     * Set kube-apiserver可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param KubeAPIServer kube-apiserver可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeAPIServer(Flag [] KubeAPIServer) {
        this.KubeAPIServer = KubeAPIServer;
    }

    /**
     * Get kube-controller-manager可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KubeControllerManager kube-controller-manager可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Flag [] getKubeControllerManager() {
        return this.KubeControllerManager;
    }

    /**
     * Set kube-controller-manager可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param KubeControllerManager kube-controller-manager可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeControllerManager(Flag [] KubeControllerManager) {
        this.KubeControllerManager = KubeControllerManager;
    }

    /**
     * Get kube-scheduler可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KubeScheduler kube-scheduler可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Flag [] getKubeScheduler() {
        return this.KubeScheduler;
    }

    /**
     * Set kube-scheduler可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param KubeScheduler kube-scheduler可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubeScheduler(Flag [] KubeScheduler) {
        this.KubeScheduler = KubeScheduler;
    }

    /**
     * Get kubelet可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kubelet kubelet可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Flag [] getKubelet() {
        return this.Kubelet;
    }

    /**
     * Set kubelet可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kubelet kubelet可用的自定义参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKubelet(Flag [] Kubelet) {
        this.Kubelet = Kubelet;
    }

    public AvailableExtraArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AvailableExtraArgs(AvailableExtraArgs source) {
        if (source.KubeAPIServer != null) {
            this.KubeAPIServer = new Flag[source.KubeAPIServer.length];
            for (int i = 0; i < source.KubeAPIServer.length; i++) {
                this.KubeAPIServer[i] = new Flag(source.KubeAPIServer[i]);
            }
        }
        if (source.KubeControllerManager != null) {
            this.KubeControllerManager = new Flag[source.KubeControllerManager.length];
            for (int i = 0; i < source.KubeControllerManager.length; i++) {
                this.KubeControllerManager[i] = new Flag(source.KubeControllerManager[i]);
            }
        }
        if (source.KubeScheduler != null) {
            this.KubeScheduler = new Flag[source.KubeScheduler.length];
            for (int i = 0; i < source.KubeScheduler.length; i++) {
                this.KubeScheduler[i] = new Flag(source.KubeScheduler[i]);
            }
        }
        if (source.Kubelet != null) {
            this.Kubelet = new Flag[source.Kubelet.length];
            for (int i = 0; i < source.Kubelet.length; i++) {
                this.Kubelet[i] = new Flag(source.Kubelet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "KubeAPIServer.", this.KubeAPIServer);
        this.setParamArrayObj(map, prefix + "KubeControllerManager.", this.KubeControllerManager);
        this.setParamArrayObj(map, prefix + "KubeScheduler.", this.KubeScheduler);
        this.setParamArrayObj(map, prefix + "Kubelet.", this.Kubelet);

    }
}

