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

public class DescribeWxGatewayRoutesRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 网关名称
    */
    @SerializedName("GatewayId")
    @Expose
    private String GatewayId;

    /**
    * 网关路由名称
    */
    @SerializedName("GatewayRouteName")
    @Expose
    private String GatewayRouteName;

    /**
    * 网关版本名
    */
    @SerializedName("GatewayVersion")
    @Expose
    private String GatewayVersion;

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
     * @return GatewayId 网关名称
     */
    public String getGatewayId() {
        return this.GatewayId;
    }

    /**
     * Set 网关名称
     * @param GatewayId 网关名称
     */
    public void setGatewayId(String GatewayId) {
        this.GatewayId = GatewayId;
    }

    /**
     * Get 网关路由名称 
     * @return GatewayRouteName 网关路由名称
     */
    public String getGatewayRouteName() {
        return this.GatewayRouteName;
    }

    /**
     * Set 网关路由名称
     * @param GatewayRouteName 网关路由名称
     */
    public void setGatewayRouteName(String GatewayRouteName) {
        this.GatewayRouteName = GatewayRouteName;
    }

    /**
     * Get 网关版本名 
     * @return GatewayVersion 网关版本名
     */
    public String getGatewayVersion() {
        return this.GatewayVersion;
    }

    /**
     * Set 网关版本名
     * @param GatewayVersion 网关版本名
     */
    public void setGatewayVersion(String GatewayVersion) {
        this.GatewayVersion = GatewayVersion;
    }

    public DescribeWxGatewayRoutesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeWxGatewayRoutesRequest(DescribeWxGatewayRoutesRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GatewayId != null) {
            this.GatewayId = new String(source.GatewayId);
        }
        if (source.GatewayRouteName != null) {
            this.GatewayRouteName = new String(source.GatewayRouteName);
        }
        if (source.GatewayVersion != null) {
            this.GatewayVersion = new String(source.GatewayVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "GatewayId", this.GatewayId);
        this.setParamSimple(map, prefix + "GatewayRouteName", this.GatewayRouteName);
        this.setParamSimple(map, prefix + "GatewayVersion", this.GatewayVersion);

    }
}

