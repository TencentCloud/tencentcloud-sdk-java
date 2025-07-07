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
package com.tencentcloudapi.tcm.v20210413.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IngressGatewayStatus extends AbstractModel {

    /**
    * 负载均衡实例状态
    */
    @SerializedName("LoadBalancer")
    @Expose
    private LoadBalancerStatus LoadBalancer;

    /**
    * ingress gateway 当前的版本
    */
    @SerializedName("CurrentVersion")
    @Expose
    private String CurrentVersion;

    /**
    * ingress gateway 目标的版本
    */
    @SerializedName("DesiredVersion")
    @Expose
    private String DesiredVersion;

    /**
    * ingress gateway的状态，取值running, upgrading, rollbacking
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
     * Get 负载均衡实例状态 
     * @return LoadBalancer 负载均衡实例状态
     */
    public LoadBalancerStatus getLoadBalancer() {
        return this.LoadBalancer;
    }

    /**
     * Set 负载均衡实例状态
     * @param LoadBalancer 负载均衡实例状态
     */
    public void setLoadBalancer(LoadBalancerStatus LoadBalancer) {
        this.LoadBalancer = LoadBalancer;
    }

    /**
     * Get ingress gateway 当前的版本 
     * @return CurrentVersion ingress gateway 当前的版本
     */
    public String getCurrentVersion() {
        return this.CurrentVersion;
    }

    /**
     * Set ingress gateway 当前的版本
     * @param CurrentVersion ingress gateway 当前的版本
     */
    public void setCurrentVersion(String CurrentVersion) {
        this.CurrentVersion = CurrentVersion;
    }

    /**
     * Get ingress gateway 目标的版本 
     * @return DesiredVersion ingress gateway 目标的版本
     */
    public String getDesiredVersion() {
        return this.DesiredVersion;
    }

    /**
     * Set ingress gateway 目标的版本
     * @param DesiredVersion ingress gateway 目标的版本
     */
    public void setDesiredVersion(String DesiredVersion) {
        this.DesiredVersion = DesiredVersion;
    }

    /**
     * Get ingress gateway的状态，取值running, upgrading, rollbacking 
     * @return State ingress gateway的状态，取值running, upgrading, rollbacking
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set ingress gateway的状态，取值running, upgrading, rollbacking
     * @param State ingress gateway的状态，取值running, upgrading, rollbacking
     */
    public void setState(String State) {
        this.State = State;
    }

    public IngressGatewayStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IngressGatewayStatus(IngressGatewayStatus source) {
        if (source.LoadBalancer != null) {
            this.LoadBalancer = new LoadBalancerStatus(source.LoadBalancer);
        }
        if (source.CurrentVersion != null) {
            this.CurrentVersion = new String(source.CurrentVersion);
        }
        if (source.DesiredVersion != null) {
            this.DesiredVersion = new String(source.DesiredVersion);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "LoadBalancer.", this.LoadBalancer);
        this.setParamSimple(map, prefix + "CurrentVersion", this.CurrentVersion);
        this.setParamSimple(map, prefix + "DesiredVersion", this.DesiredVersion);
        this.setParamSimple(map, prefix + "State", this.State);

    }
}

