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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceGovernanceInfo extends AbstractModel {

    /**
    * <p>引擎所在的地域</p>
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * <p>服务治理引擎绑定的kubernetes集群信息</p>
    */
    @SerializedName("BoundK8SInfos")
    @Expose
    private BoundK8SInfo [] BoundK8SInfos;

    /**
    * <p>服务治理引擎绑定的网络信息</p>
    */
    @SerializedName("VpcInfos")
    @Expose
    private VpcInfo [] VpcInfos;

    /**
    * <p>当前实例鉴权是否开启</p>
    */
    @SerializedName("AuthOpen")
    @Expose
    private Boolean AuthOpen;

    /**
    * <p>该实例支持的功能，鉴权就是 Auth</p>
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * <p>主账户名默认为 polaris，该值为主账户的默认密码</p>
    */
    @SerializedName("MainPassword")
    @Expose
    private String MainPassword;

    /**
    * <p>服务治理pushgateway引擎绑定的网络信息</p>
    */
    @SerializedName("PgwVpcInfos")
    @Expose
    private VpcInfo [] PgwVpcInfos;

    /**
    * <p>服务治理限流server引擎绑定的网络信息</p>
    */
    @SerializedName("LimiterVpcInfos")
    @Expose
    private VpcInfo [] LimiterVpcInfos;

    /**
    * <p>引擎关联CLS日志主题信息</p>
    */
    @SerializedName("CLSTopics")
    @Expose
    private PolarisCLSTopicInfo [] CLSTopics;

    /**
    * <p>子用户密码</p>
    */
    @SerializedName("SubPassword")
    @Expose
    private String SubPassword;

    /**
    * <p>是否允许变更</p>
    */
    @SerializedName("DisableMutation")
    @Expose
    private Boolean DisableMutation;

    /**
    * <p>是否开启限流</p>
    */
    @SerializedName("MaxCapacityLimitEnabled")
    @Expose
    private Boolean MaxCapacityLimitEnabled;

    /**
     * Get <p>引擎所在的地域</p> 
     * @return EngineRegion <p>引擎所在的地域</p>
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set <p>引擎所在的地域</p>
     * @param EngineRegion <p>引擎所在的地域</p>
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get <p>服务治理引擎绑定的kubernetes集群信息</p> 
     * @return BoundK8SInfos <p>服务治理引擎绑定的kubernetes集群信息</p>
     */
    public BoundK8SInfo [] getBoundK8SInfos() {
        return this.BoundK8SInfos;
    }

    /**
     * Set <p>服务治理引擎绑定的kubernetes集群信息</p>
     * @param BoundK8SInfos <p>服务治理引擎绑定的kubernetes集群信息</p>
     */
    public void setBoundK8SInfos(BoundK8SInfo [] BoundK8SInfos) {
        this.BoundK8SInfos = BoundK8SInfos;
    }

    /**
     * Get <p>服务治理引擎绑定的网络信息</p> 
     * @return VpcInfos <p>服务治理引擎绑定的网络信息</p>
     */
    public VpcInfo [] getVpcInfos() {
        return this.VpcInfos;
    }

    /**
     * Set <p>服务治理引擎绑定的网络信息</p>
     * @param VpcInfos <p>服务治理引擎绑定的网络信息</p>
     */
    public void setVpcInfos(VpcInfo [] VpcInfos) {
        this.VpcInfos = VpcInfos;
    }

    /**
     * Get <p>当前实例鉴权是否开启</p> 
     * @return AuthOpen <p>当前实例鉴权是否开启</p>
     */
    public Boolean getAuthOpen() {
        return this.AuthOpen;
    }

    /**
     * Set <p>当前实例鉴权是否开启</p>
     * @param AuthOpen <p>当前实例鉴权是否开启</p>
     */
    public void setAuthOpen(Boolean AuthOpen) {
        this.AuthOpen = AuthOpen;
    }

    /**
     * Get <p>该实例支持的功能，鉴权就是 Auth</p> 
     * @return Features <p>该实例支持的功能，鉴权就是 Auth</p>
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set <p>该实例支持的功能，鉴权就是 Auth</p>
     * @param Features <p>该实例支持的功能，鉴权就是 Auth</p>
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get <p>主账户名默认为 polaris，该值为主账户的默认密码</p> 
     * @return MainPassword <p>主账户名默认为 polaris，该值为主账户的默认密码</p>
     */
    public String getMainPassword() {
        return this.MainPassword;
    }

    /**
     * Set <p>主账户名默认为 polaris，该值为主账户的默认密码</p>
     * @param MainPassword <p>主账户名默认为 polaris，该值为主账户的默认密码</p>
     */
    public void setMainPassword(String MainPassword) {
        this.MainPassword = MainPassword;
    }

    /**
     * Get <p>服务治理pushgateway引擎绑定的网络信息</p> 
     * @return PgwVpcInfos <p>服务治理pushgateway引擎绑定的网络信息</p>
     */
    public VpcInfo [] getPgwVpcInfos() {
        return this.PgwVpcInfos;
    }

    /**
     * Set <p>服务治理pushgateway引擎绑定的网络信息</p>
     * @param PgwVpcInfos <p>服务治理pushgateway引擎绑定的网络信息</p>
     */
    public void setPgwVpcInfos(VpcInfo [] PgwVpcInfos) {
        this.PgwVpcInfos = PgwVpcInfos;
    }

    /**
     * Get <p>服务治理限流server引擎绑定的网络信息</p> 
     * @return LimiterVpcInfos <p>服务治理限流server引擎绑定的网络信息</p>
     */
    public VpcInfo [] getLimiterVpcInfos() {
        return this.LimiterVpcInfos;
    }

    /**
     * Set <p>服务治理限流server引擎绑定的网络信息</p>
     * @param LimiterVpcInfos <p>服务治理限流server引擎绑定的网络信息</p>
     */
    public void setLimiterVpcInfos(VpcInfo [] LimiterVpcInfos) {
        this.LimiterVpcInfos = LimiterVpcInfos;
    }

    /**
     * Get <p>引擎关联CLS日志主题信息</p> 
     * @return CLSTopics <p>引擎关联CLS日志主题信息</p>
     */
    public PolarisCLSTopicInfo [] getCLSTopics() {
        return this.CLSTopics;
    }

    /**
     * Set <p>引擎关联CLS日志主题信息</p>
     * @param CLSTopics <p>引擎关联CLS日志主题信息</p>
     */
    public void setCLSTopics(PolarisCLSTopicInfo [] CLSTopics) {
        this.CLSTopics = CLSTopics;
    }

    /**
     * Get <p>子用户密码</p> 
     * @return SubPassword <p>子用户密码</p>
     */
    public String getSubPassword() {
        return this.SubPassword;
    }

    /**
     * Set <p>子用户密码</p>
     * @param SubPassword <p>子用户密码</p>
     */
    public void setSubPassword(String SubPassword) {
        this.SubPassword = SubPassword;
    }

    /**
     * Get <p>是否允许变更</p> 
     * @return DisableMutation <p>是否允许变更</p>
     */
    public Boolean getDisableMutation() {
        return this.DisableMutation;
    }

    /**
     * Set <p>是否允许变更</p>
     * @param DisableMutation <p>是否允许变更</p>
     */
    public void setDisableMutation(Boolean DisableMutation) {
        this.DisableMutation = DisableMutation;
    }

    /**
     * Get <p>是否开启限流</p> 
     * @return MaxCapacityLimitEnabled <p>是否开启限流</p>
     */
    public Boolean getMaxCapacityLimitEnabled() {
        return this.MaxCapacityLimitEnabled;
    }

    /**
     * Set <p>是否开启限流</p>
     * @param MaxCapacityLimitEnabled <p>是否开启限流</p>
     */
    public void setMaxCapacityLimitEnabled(Boolean MaxCapacityLimitEnabled) {
        this.MaxCapacityLimitEnabled = MaxCapacityLimitEnabled;
    }

    public ServiceGovernanceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceGovernanceInfo(ServiceGovernanceInfo source) {
        if (source.EngineRegion != null) {
            this.EngineRegion = new String(source.EngineRegion);
        }
        if (source.BoundK8SInfos != null) {
            this.BoundK8SInfos = new BoundK8SInfo[source.BoundK8SInfos.length];
            for (int i = 0; i < source.BoundK8SInfos.length; i++) {
                this.BoundK8SInfos[i] = new BoundK8SInfo(source.BoundK8SInfos[i]);
            }
        }
        if (source.VpcInfos != null) {
            this.VpcInfos = new VpcInfo[source.VpcInfos.length];
            for (int i = 0; i < source.VpcInfos.length; i++) {
                this.VpcInfos[i] = new VpcInfo(source.VpcInfos[i]);
            }
        }
        if (source.AuthOpen != null) {
            this.AuthOpen = new Boolean(source.AuthOpen);
        }
        if (source.Features != null) {
            this.Features = new String[source.Features.length];
            for (int i = 0; i < source.Features.length; i++) {
                this.Features[i] = new String(source.Features[i]);
            }
        }
        if (source.MainPassword != null) {
            this.MainPassword = new String(source.MainPassword);
        }
        if (source.PgwVpcInfos != null) {
            this.PgwVpcInfos = new VpcInfo[source.PgwVpcInfos.length];
            for (int i = 0; i < source.PgwVpcInfos.length; i++) {
                this.PgwVpcInfos[i] = new VpcInfo(source.PgwVpcInfos[i]);
            }
        }
        if (source.LimiterVpcInfos != null) {
            this.LimiterVpcInfos = new VpcInfo[source.LimiterVpcInfos.length];
            for (int i = 0; i < source.LimiterVpcInfos.length; i++) {
                this.LimiterVpcInfos[i] = new VpcInfo(source.LimiterVpcInfos[i]);
            }
        }
        if (source.CLSTopics != null) {
            this.CLSTopics = new PolarisCLSTopicInfo[source.CLSTopics.length];
            for (int i = 0; i < source.CLSTopics.length; i++) {
                this.CLSTopics[i] = new PolarisCLSTopicInfo(source.CLSTopics[i]);
            }
        }
        if (source.SubPassword != null) {
            this.SubPassword = new String(source.SubPassword);
        }
        if (source.DisableMutation != null) {
            this.DisableMutation = new Boolean(source.DisableMutation);
        }
        if (source.MaxCapacityLimitEnabled != null) {
            this.MaxCapacityLimitEnabled = new Boolean(source.MaxCapacityLimitEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineRegion", this.EngineRegion);
        this.setParamArrayObj(map, prefix + "BoundK8SInfos.", this.BoundK8SInfos);
        this.setParamArrayObj(map, prefix + "VpcInfos.", this.VpcInfos);
        this.setParamSimple(map, prefix + "AuthOpen", this.AuthOpen);
        this.setParamArraySimple(map, prefix + "Features.", this.Features);
        this.setParamSimple(map, prefix + "MainPassword", this.MainPassword);
        this.setParamArrayObj(map, prefix + "PgwVpcInfos.", this.PgwVpcInfos);
        this.setParamArrayObj(map, prefix + "LimiterVpcInfos.", this.LimiterVpcInfos);
        this.setParamArrayObj(map, prefix + "CLSTopics.", this.CLSTopics);
        this.setParamSimple(map, prefix + "SubPassword", this.SubPassword);
        this.setParamSimple(map, prefix + "DisableMutation", this.DisableMutation);
        this.setParamSimple(map, prefix + "MaxCapacityLimitEnabled", this.MaxCapacityLimitEnabled);

    }
}

