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

public class TurnOnStandaloneGatewayRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 网关名称
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * 服务名称列表
    */
    @SerializedName("ServiceNameList")
    @Expose
    private String [] ServiceNameList;

    /**
     * Get 环境ID 
     * @return EnvId 环境ID
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * Set 环境ID
     * @param EnvId 环境ID
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * Get 网关名称 
     * @return GatewayName 网关名称
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 网关名称
     * @param GatewayName 网关名称
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get 服务名称列表 
     * @return ServiceNameList 服务名称列表
     */
    public String [] getServiceNameList() {
        return this.ServiceNameList;
    }

    /**
     * Set 服务名称列表
     * @param ServiceNameList 服务名称列表
     */
    public void setServiceNameList(String [] ServiceNameList) {
        this.ServiceNameList = ServiceNameList;
    }

    public TurnOnStandaloneGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TurnOnStandaloneGatewayRequest(TurnOnStandaloneGatewayRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.ServiceNameList != null) {
            this.ServiceNameList = new String[source.ServiceNameList.length];
            for (int i = 0; i < source.ServiceNameList.length; i++) {
                this.ServiceNameList[i] = new String(source.ServiceNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamArraySimple(map, prefix + "ServiceNameList.", this.ServiceNameList);

    }
}

