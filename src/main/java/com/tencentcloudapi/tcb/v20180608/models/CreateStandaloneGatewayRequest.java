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

public class CreateStandaloneGatewayRequest extends AbstractModel{

    /**
    * 环境ID
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 网关名
    */
    @SerializedName("GatewayAlias")
    @Expose
    private String GatewayAlias;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetIds")
    @Expose
    private String [] SubnetIds;

    /**
    * 网关描述
    */
    @SerializedName("GatewayDesc")
    @Expose
    private String GatewayDesc;

    /**
    * 网关套餐版本
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

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
     * Get 网关名 
     * @return GatewayAlias 网关名
     */
    public String getGatewayAlias() {
        return this.GatewayAlias;
    }

    /**
     * Set 网关名
     * @param GatewayAlias 网关名
     */
    public void setGatewayAlias(String GatewayAlias) {
        this.GatewayAlias = GatewayAlias;
    }

    /**
     * Get 私有网络ID 
     * @return VpcId 私有网络ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
     * @param VpcId 私有网络ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID 
     * @return SubnetIds 子网ID
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID
     * @param SubnetIds 子网ID
     */
    public void setSubnetIds(String [] SubnetIds) {
        this.SubnetIds = SubnetIds;
    }

    /**
     * Get 网关描述 
     * @return GatewayDesc 网关描述
     */
    public String getGatewayDesc() {
        return this.GatewayDesc;
    }

    /**
     * Set 网关描述
     * @param GatewayDesc 网关描述
     */
    public void setGatewayDesc(String GatewayDesc) {
        this.GatewayDesc = GatewayDesc;
    }

    /**
     * Get 网关套餐版本 
     * @return PackageVersion 网关套餐版本
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 网关套餐版本
     * @param PackageVersion 网关套餐版本
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    public CreateStandaloneGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateStandaloneGatewayRequest(CreateStandaloneGatewayRequest source) {
        if (source.EnvId != null) {
            this.EnvId = new String(source.EnvId);
        }
        if (source.GatewayAlias != null) {
            this.GatewayAlias = new String(source.GatewayAlias);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetIds != null) {
            this.SubnetIds = new String[source.SubnetIds.length];
            for (int i = 0; i < source.SubnetIds.length; i++) {
                this.SubnetIds[i] = new String(source.SubnetIds[i]);
            }
        }
        if (source.GatewayDesc != null) {
            this.GatewayDesc = new String(source.GatewayDesc);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "GatewayAlias", this.GatewayAlias);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "GatewayDesc", this.GatewayDesc);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);

    }
}

