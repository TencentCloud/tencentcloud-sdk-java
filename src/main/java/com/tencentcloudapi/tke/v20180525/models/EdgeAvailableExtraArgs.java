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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeAvailableExtraArgs extends AbstractModel {

    /**
    * kube-apiserver可用的自定义参数
    */
    @SerializedName("KubeAPIServer")
    @Expose
    private EdgeArgsFlag [] KubeAPIServer;

    /**
    * kube-controller-manager可用的自定义参数
    */
    @SerializedName("KubeControllerManager")
    @Expose
    private EdgeArgsFlag [] KubeControllerManager;

    /**
    * kube-scheduler可用的自定义参数
    */
    @SerializedName("KubeScheduler")
    @Expose
    private EdgeArgsFlag [] KubeScheduler;

    /**
    * kubelet可用的自定义参数
    */
    @SerializedName("Kubelet")
    @Expose
    private EdgeArgsFlag [] Kubelet;

    /**
     * Get kube-apiserver可用的自定义参数 
     * @return KubeAPIServer kube-apiserver可用的自定义参数
     */
    public EdgeArgsFlag [] getKubeAPIServer() {
        return this.KubeAPIServer;
    }

    /**
     * Set kube-apiserver可用的自定义参数
     * @param KubeAPIServer kube-apiserver可用的自定义参数
     */
    public void setKubeAPIServer(EdgeArgsFlag [] KubeAPIServer) {
        this.KubeAPIServer = KubeAPIServer;
    }

    /**
     * Get kube-controller-manager可用的自定义参数 
     * @return KubeControllerManager kube-controller-manager可用的自定义参数
     */
    public EdgeArgsFlag [] getKubeControllerManager() {
        return this.KubeControllerManager;
    }

    /**
     * Set kube-controller-manager可用的自定义参数
     * @param KubeControllerManager kube-controller-manager可用的自定义参数
     */
    public void setKubeControllerManager(EdgeArgsFlag [] KubeControllerManager) {
        this.KubeControllerManager = KubeControllerManager;
    }

    /**
     * Get kube-scheduler可用的自定义参数 
     * @return KubeScheduler kube-scheduler可用的自定义参数
     */
    public EdgeArgsFlag [] getKubeScheduler() {
        return this.KubeScheduler;
    }

    /**
     * Set kube-scheduler可用的自定义参数
     * @param KubeScheduler kube-scheduler可用的自定义参数
     */
    public void setKubeScheduler(EdgeArgsFlag [] KubeScheduler) {
        this.KubeScheduler = KubeScheduler;
    }

    /**
     * Get kubelet可用的自定义参数 
     * @return Kubelet kubelet可用的自定义参数
     */
    public EdgeArgsFlag [] getKubelet() {
        return this.Kubelet;
    }

    /**
     * Set kubelet可用的自定义参数
     * @param Kubelet kubelet可用的自定义参数
     */
    public void setKubelet(EdgeArgsFlag [] Kubelet) {
        this.Kubelet = Kubelet;
    }

    public EdgeAvailableExtraArgs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeAvailableExtraArgs(EdgeAvailableExtraArgs source) {
        if (source.KubeAPIServer != null) {
            this.KubeAPIServer = new EdgeArgsFlag[source.KubeAPIServer.length];
            for (int i = 0; i < source.KubeAPIServer.length; i++) {
                this.KubeAPIServer[i] = new EdgeArgsFlag(source.KubeAPIServer[i]);
            }
        }
        if (source.KubeControllerManager != null) {
            this.KubeControllerManager = new EdgeArgsFlag[source.KubeControllerManager.length];
            for (int i = 0; i < source.KubeControllerManager.length; i++) {
                this.KubeControllerManager[i] = new EdgeArgsFlag(source.KubeControllerManager[i]);
            }
        }
        if (source.KubeScheduler != null) {
            this.KubeScheduler = new EdgeArgsFlag[source.KubeScheduler.length];
            for (int i = 0; i < source.KubeScheduler.length; i++) {
                this.KubeScheduler[i] = new EdgeArgsFlag(source.KubeScheduler[i]);
            }
        }
        if (source.Kubelet != null) {
            this.Kubelet = new EdgeArgsFlag[source.Kubelet.length];
            for (int i = 0; i < source.Kubelet.length; i++) {
                this.Kubelet[i] = new EdgeArgsFlag(source.Kubelet[i]);
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

