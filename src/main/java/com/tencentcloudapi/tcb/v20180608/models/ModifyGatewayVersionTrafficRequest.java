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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyGatewayVersionTrafficRequest extends AbstractModel{

    /**
    * 环境id
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 网关id
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关版本流量比例信息
    */
    @SerializedName("VersionsWeight")
    @Expose
    private GatewayVersionItem [] VersionsWeight;

    /**
     * Get 环境id 
     * @return EnvId 环境id
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境id
     * @param EnvId 环境id
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 网关id 
     * @return GatewayId 网关id
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关id
     * @param GatewayId 网关id
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关版本流量比例信息 
     * @return VersionsWeight 网关版本流量比例信息
     */
    public GatewayVersionItem [] getVersionsWeight() {
        return this.VersionsWeight;
    }

    /**
     * Set 网关版本流量比例信息
     * @param VersionsWeight 网关版本流量比例信息
     */
    public void setVersionsWeight(GatewayVersionItem [] VersionsWeight) {
        this.VersionsWeight = VersionsWeight;
    }

    public ModifyGatewayVersionTrafficRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyGatewayVersionTrafficRequest(ModifyGatewayVersionTrafficRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.VersionsWeight != null) {
            this.VersionsWeight = new GatewayVersionItem[source.VersionsWeight.length];
            for (int i = 0; i < source.VersionsWeight.length; i++) {
                this.VersionsWeight[i] = new GatewayVersionItem(source.VersionsWeight[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamArrayObj(map, prefix + "VersionsWeight.", this.VersionsWeight);

    }
}

