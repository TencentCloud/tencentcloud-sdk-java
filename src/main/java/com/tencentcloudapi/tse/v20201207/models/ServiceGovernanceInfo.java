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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceGovernanceInfo extends AbstractModel{

    /**
    * 引擎所在的地域
    */
    @SerializedName("EngineRegion")
    @Expose
    private String EngineRegion;

    /**
    * 服务治理引擎绑定的kubernetes集群信息
    */
    @SerializedName("BoundK8SInfos")
    @Expose
    private BoundK8SInfo [] BoundK8SInfos;

    /**
    * 服务治理引擎绑定的网络信息
    */
    @SerializedName("VpcInfos")
    @Expose
    private VpcInfo [] VpcInfos;

    /**
    * 当前实例鉴权是否开启
    */
    @SerializedName("AuthOpen")
    @Expose
    private Boolean AuthOpen;

    /**
    * 该实例支持的功能，鉴权就是 Auth
    */
    @SerializedName("Features")
    @Expose
    private String [] Features;

    /**
    * 主账户名默认为 polaris，该值为主账户的默认密码
    */
    @SerializedName("MainPassword")
    @Expose
    private String MainPassword;

    /**
     * Get 引擎所在的地域 
     * @return EngineRegion 引擎所在的地域
     */
    public String getEngineRegion() {
        return this.EngineRegion;
    }

    /**
     * Set 引擎所在的地域
     * @param EngineRegion 引擎所在的地域
     */
    public void setEngineRegion(String EngineRegion) {
        this.EngineRegion = EngineRegion;
    }

    /**
     * Get 服务治理引擎绑定的kubernetes集群信息 
     * @return BoundK8SInfos 服务治理引擎绑定的kubernetes集群信息
     */
    public BoundK8SInfo [] getBoundK8SInfos() {
        return this.BoundK8SInfos;
    }

    /**
     * Set 服务治理引擎绑定的kubernetes集群信息
     * @param BoundK8SInfos 服务治理引擎绑定的kubernetes集群信息
     */
    public void setBoundK8SInfos(BoundK8SInfo [] BoundK8SInfos) {
        this.BoundK8SInfos = BoundK8SInfos;
    }

    /**
     * Get 服务治理引擎绑定的网络信息 
     * @return VpcInfos 服务治理引擎绑定的网络信息
     */
    public VpcInfo [] getVpcInfos() {
        return this.VpcInfos;
    }

    /**
     * Set 服务治理引擎绑定的网络信息
     * @param VpcInfos 服务治理引擎绑定的网络信息
     */
    public void setVpcInfos(VpcInfo [] VpcInfos) {
        this.VpcInfos = VpcInfos;
    }

    /**
     * Get 当前实例鉴权是否开启 
     * @return AuthOpen 当前实例鉴权是否开启
     */
    public Boolean getAuthOpen() {
        return this.AuthOpen;
    }

    /**
     * Set 当前实例鉴权是否开启
     * @param AuthOpen 当前实例鉴权是否开启
     */
    public void setAuthOpen(Boolean AuthOpen) {
        this.AuthOpen = AuthOpen;
    }

    /**
     * Get 该实例支持的功能，鉴权就是 Auth 
     * @return Features 该实例支持的功能，鉴权就是 Auth
     */
    public String [] getFeatures() {
        return this.Features;
    }

    /**
     * Set 该实例支持的功能，鉴权就是 Auth
     * @param Features 该实例支持的功能，鉴权就是 Auth
     */
    public void setFeatures(String [] Features) {
        this.Features = Features;
    }

    /**
     * Get 主账户名默认为 polaris，该值为主账户的默认密码 
     * @return MainPassword 主账户名默认为 polaris，该值为主账户的默认密码
     */
    public String getMainPassword() {
        return this.MainPassword;
    }

    /**
     * Set 主账户名默认为 polaris，该值为主账户的默认密码
     * @param MainPassword 主账户名默认为 polaris，该值为主账户的默认密码
     */
    public void setMainPassword(String MainPassword) {
        this.MainPassword = MainPassword;
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

    }
}

