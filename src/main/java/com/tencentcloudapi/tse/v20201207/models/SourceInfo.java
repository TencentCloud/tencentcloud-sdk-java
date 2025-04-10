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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SourceInfo extends AbstractModel {

    /**
    * 微服务引擎接入IP地址信息
    */
    @SerializedName("Addresses")
    @Expose
    private String [] Addresses;

    /**
    * 微服务引擎VPC信息
    */
    @SerializedName("VpcInfo")
    @Expose
    private SourceInstanceVpcInfo VpcInfo;

    /**
    * 微服务引擎鉴权信息
    */
    @SerializedName("Auth")
    @Expose
    private SourceInstanceAuth Auth;

    /**
     * Get 微服务引擎接入IP地址信息 
     * @return Addresses 微服务引擎接入IP地址信息
     */
    public String [] getAddresses() {
        return this.Addresses;
    }

    /**
     * Set 微服务引擎接入IP地址信息
     * @param Addresses 微服务引擎接入IP地址信息
     */
    public void setAddresses(String [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * Get 微服务引擎VPC信息 
     * @return VpcInfo 微服务引擎VPC信息
     */
    public SourceInstanceVpcInfo getVpcInfo() {
        return this.VpcInfo;
    }

    /**
     * Set 微服务引擎VPC信息
     * @param VpcInfo 微服务引擎VPC信息
     */
    public void setVpcInfo(SourceInstanceVpcInfo VpcInfo) {
        this.VpcInfo = VpcInfo;
    }

    /**
     * Get 微服务引擎鉴权信息 
     * @return Auth 微服务引擎鉴权信息
     */
    public SourceInstanceAuth getAuth() {
        return this.Auth;
    }

    /**
     * Set 微服务引擎鉴权信息
     * @param Auth 微服务引擎鉴权信息
     */
    public void setAuth(SourceInstanceAuth Auth) {
        this.Auth = Auth;
    }

    public SourceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SourceInfo(SourceInfo source) {
        if (source.Addresses != null) {
            this.Addresses = new String[source.Addresses.length];
            for (int i = 0; i < source.Addresses.length; i++) {
                this.Addresses[i] = new String(source.Addresses[i]);
            }
        }
        if (source.VpcInfo != null) {
            this.VpcInfo = new SourceInstanceVpcInfo(source.VpcInfo);
        }
        if (source.Auth != null) {
            this.Auth = new SourceInstanceAuth(source.Auth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Addresses.", this.Addresses);
        this.setParamObj(map, prefix + "VpcInfo.", this.VpcInfo);
        this.setParamObj(map, prefix + "Auth.", this.Auth);

    }
}

