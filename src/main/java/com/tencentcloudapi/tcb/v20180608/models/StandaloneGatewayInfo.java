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

public class StandaloneGatewayInfo extends AbstractModel{

    /**
    * 独立网关名称
    */
    @SerializedName("GatewayName")
    @Expose
    private String GatewayName;

    /**
    * CPU核心数
    */
    @SerializedName("CPU")
    @Expose
    private Float CPU;

    /**
    * 内存大小，单位MB
    */
    @SerializedName("Mem")
    @Expose
    private Long Mem;

    /**
    * 套餐包版本名称
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 网关别名
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
    * 子网ID列表
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
    * 网关状态
    */
    @SerializedName("GateWayStatus")
    @Expose
    private String GateWayStatus;

    /**
    * 服务信息
    */
    @SerializedName("ServiceInfo")
    @Expose
    private BackendServiceInfo ServiceInfo;

    /**
    * 公网CLBIP
    */
    @SerializedName("PublicClbIp")
    @Expose
    private String PublicClbIp;

    /**
    * 内网CLBIP
    */
    @SerializedName("InternalClbIp")
    @Expose
    private String InternalClbIp;

    /**
     * Get 独立网关名称 
     * @return GatewayName 独立网关名称
     */
    public String getGatewayName() {
        return this.GatewayName;
    }

    /**
     * Set 独立网关名称
     * @param GatewayName 独立网关名称
     */
    public void setGatewayName(String GatewayName) {
        this.GatewayName = GatewayName;
    }

    /**
     * Get CPU核心数 
     * @return CPU CPU核心数
     */
    public Float getCPU() {
        return this.CPU;
    }

    /**
     * Set CPU核心数
     * @param CPU CPU核心数
     */
    public void setCPU(Float CPU) {
        this.CPU = CPU;
    }

    /**
     * Get 内存大小，单位MB 
     * @return Mem 内存大小，单位MB
     */
    public Long getMem() {
        return this.Mem;
    }

    /**
     * Set 内存大小，单位MB
     * @param Mem 内存大小，单位MB
     */
    public void setMem(Long Mem) {
        this.Mem = Mem;
    }

    /**
     * Get 套餐包版本名称 
     * @return PackageVersion 套餐包版本名称
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 套餐包版本名称
     * @param PackageVersion 套餐包版本名称
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 网关别名 
     * @return GatewayAlias 网关别名
     */
    public String getGatewayAlias() {
        return this.GatewayAlias;
    }

    /**
     * Set 网关别名
     * @param GatewayAlias 网关别名
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
     * Get 子网ID列表 
     * @return SubnetIds 子网ID列表
     */
    public String [] getSubnetIds() {
        return this.SubnetIds;
    }

    /**
     * Set 子网ID列表
     * @param SubnetIds 子网ID列表
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
     * Get 网关状态 
     * @return GateWayStatus 网关状态
     */
    public String getGateWayStatus() {
        return this.GateWayStatus;
    }

    /**
     * Set 网关状态
     * @param GateWayStatus 网关状态
     */
    public void setGateWayStatus(String GateWayStatus) {
        this.GateWayStatus = GateWayStatus;
    }

    /**
     * Get 服务信息 
     * @return ServiceInfo 服务信息
     */
    public BackendServiceInfo getServiceInfo() {
        return this.ServiceInfo;
    }

    /**
     * Set 服务信息
     * @param ServiceInfo 服务信息
     */
    public void setServiceInfo(BackendServiceInfo ServiceInfo) {
        this.ServiceInfo = ServiceInfo;
    }

    /**
     * Get 公网CLBIP 
     * @return PublicClbIp 公网CLBIP
     */
    public String getPublicClbIp() {
        return this.PublicClbIp;
    }

    /**
     * Set 公网CLBIP
     * @param PublicClbIp 公网CLBIP
     */
    public void setPublicClbIp(String PublicClbIp) {
        this.PublicClbIp = PublicClbIp;
    }

    /**
     * Get 内网CLBIP 
     * @return InternalClbIp 内网CLBIP
     */
    public String getInternalClbIp() {
        return this.InternalClbIp;
    }

    /**
     * Set 内网CLBIP
     * @param InternalClbIp 内网CLBIP
     */
    public void setInternalClbIp(String InternalClbIp) {
        this.InternalClbIp = InternalClbIp;
    }

    public StandaloneGatewayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StandaloneGatewayInfo(StandaloneGatewayInfo source) {
        if (source.GatewayName != null) {
            this.GatewayName = new String(source.GatewayName);
        }
        if (source.CPU != null) {
            this.CPU = new Float(source.CPU);
        }
        if (source.Mem != null) {
            this.Mem = new Long(source.Mem);
        }
        if (source.PackageVersion != null) {
            this.PackageVersion = new String(source.PackageVersion);
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
        if (source.GateWayStatus != null) {
            this.GateWayStatus = new String(source.GateWayStatus);
        }
        if (source.ServiceInfo != null) {
            this.ServiceInfo = new BackendServiceInfo(source.ServiceInfo);
        }
        if (source.PublicClbIp != null) {
            this.PublicClbIp = new String(source.PublicClbIp);
        }
        if (source.InternalClbIp != null) {
            this.InternalClbIp = new String(source.InternalClbIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GatewayName", this.GatewayName);
        this.setParamSimple(map, prefix + "CPU", this.CPU);
        this.setParamSimple(map, prefix + "Mem", this.Mem);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "GatewayAlias", this.GatewayAlias);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "SubnetIds.", this.SubnetIds);
        this.setParamSimple(map, prefix + "GatewayDesc", this.GatewayDesc);
        this.setParamSimple(map, prefix + "GateWayStatus", this.GateWayStatus);
        this.setParamObj(map, prefix + "ServiceInfo.", this.ServiceInfo);
        this.setParamSimple(map, prefix + "PublicClbIp", this.PublicClbIp);
        this.setParamSimple(map, prefix + "InternalClbIp", this.InternalClbIp);

    }
}

