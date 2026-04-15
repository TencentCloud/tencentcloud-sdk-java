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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NDRAssetServiceInfo extends AbstractModel {

    /**
    * 资产ID
    */
    @SerializedName("AssetId")
    @Expose
    private String AssetId;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 实例类型
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 私有网络名称
    */
    @SerializedName("VpcName")
    @Expose
    private String VpcName;

    /**
    * 服务IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 服务端口
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * IP版本 
"0": IPv4
"1": IPv6
    */
    @SerializedName("IpVersion")
    @Expose
    private String IpVersion;

    /**
    * IP类型
"0": 公网IP
"1": EIP
"-1": 内网IP
    */
    @SerializedName("IpType")
    @Expose
    private String IpType;

    /**
    * 服务名称
    */
    @SerializedName("AssetService")
    @Expose
    private String AssetService;

    /**
    * 服务版本
    */
    @SerializedName("AssetVersion")
    @Expose
    private String AssetVersion;

    /**
    * 服务类型
    */
    @SerializedName("AssetCategory")
    @Expose
    private String AssetCategory;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 识别来源
"0": 流量识别
"1": 云资产实例
    */
    @SerializedName("IdentificationSource")
    @Expose
    private String IdentificationSource;

    /**
    * 首次识别时间
    */
    @SerializedName("FirstIdentificationTime")
    @Expose
    private String FirstIdentificationTime;

    /**
    * 最近识别时间
    */
    @SerializedName("LatestIdentificationTime")
    @Expose
    private String LatestIdentificationTime;

    /**
    * 服务地址
    */
    @SerializedName("ServerAddr")
    @Expose
    private String ServerAddr;

    /**
     * Get 资产ID 
     * @return AssetId 资产ID
     */
    public String getAssetId() {
        return this.AssetId;
    }

    /**
     * Set 资产ID
     * @param AssetId 资产ID
     */
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
    }

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称 
     * @return InstanceName 实例名称
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
     * @param InstanceName 实例名称
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 实例类型 
     * @return InstanceType 实例类型
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * Set 实例类型
     * @param InstanceType 实例类型
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
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
     * Get 私有网络名称 
     * @return VpcName 私有网络名称
     */
    public String getVpcName() {
        return this.VpcName;
    }

    /**
     * Set 私有网络名称
     * @param VpcName 私有网络名称
     */
    public void setVpcName(String VpcName) {
        this.VpcName = VpcName;
    }

    /**
     * Get 服务IP 
     * @return Ip 服务IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 服务IP
     * @param Ip 服务IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 服务端口 
     * @return Port 服务端口
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 服务端口
     * @param Port 服务端口
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get IP版本 
"0": IPv4
"1": IPv6 
     * @return IpVersion IP版本 
"0": IPv4
"1": IPv6
     */
    public String getIpVersion() {
        return this.IpVersion;
    }

    /**
     * Set IP版本 
"0": IPv4
"1": IPv6
     * @param IpVersion IP版本 
"0": IPv4
"1": IPv6
     */
    public void setIpVersion(String IpVersion) {
        this.IpVersion = IpVersion;
    }

    /**
     * Get IP类型
"0": 公网IP
"1": EIP
"-1": 内网IP 
     * @return IpType IP类型
"0": 公网IP
"1": EIP
"-1": 内网IP
     */
    public String getIpType() {
        return this.IpType;
    }

    /**
     * Set IP类型
"0": 公网IP
"1": EIP
"-1": 内网IP
     * @param IpType IP类型
"0": 公网IP
"1": EIP
"-1": 内网IP
     */
    public void setIpType(String IpType) {
        this.IpType = IpType;
    }

    /**
     * Get 服务名称 
     * @return AssetService 服务名称
     */
    public String getAssetService() {
        return this.AssetService;
    }

    /**
     * Set 服务名称
     * @param AssetService 服务名称
     */
    public void setAssetService(String AssetService) {
        this.AssetService = AssetService;
    }

    /**
     * Get 服务版本 
     * @return AssetVersion 服务版本
     */
    public String getAssetVersion() {
        return this.AssetVersion;
    }

    /**
     * Set 服务版本
     * @param AssetVersion 服务版本
     */
    public void setAssetVersion(String AssetVersion) {
        this.AssetVersion = AssetVersion;
    }

    /**
     * Get 服务类型 
     * @return AssetCategory 服务类型
     */
    public String getAssetCategory() {
        return this.AssetCategory;
    }

    /**
     * Set 服务类型
     * @param AssetCategory 服务类型
     */
    public void setAssetCategory(String AssetCategory) {
        this.AssetCategory = AssetCategory;
    }

    /**
     * Get 协议 
     * @return Protocol 协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
     * @param Protocol 协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 识别来源
"0": 流量识别
"1": 云资产实例 
     * @return IdentificationSource 识别来源
"0": 流量识别
"1": 云资产实例
     */
    public String getIdentificationSource() {
        return this.IdentificationSource;
    }

    /**
     * Set 识别来源
"0": 流量识别
"1": 云资产实例
     * @param IdentificationSource 识别来源
"0": 流量识别
"1": 云资产实例
     */
    public void setIdentificationSource(String IdentificationSource) {
        this.IdentificationSource = IdentificationSource;
    }

    /**
     * Get 首次识别时间 
     * @return FirstIdentificationTime 首次识别时间
     */
    public String getFirstIdentificationTime() {
        return this.FirstIdentificationTime;
    }

    /**
     * Set 首次识别时间
     * @param FirstIdentificationTime 首次识别时间
     */
    public void setFirstIdentificationTime(String FirstIdentificationTime) {
        this.FirstIdentificationTime = FirstIdentificationTime;
    }

    /**
     * Get 最近识别时间 
     * @return LatestIdentificationTime 最近识别时间
     */
    public String getLatestIdentificationTime() {
        return this.LatestIdentificationTime;
    }

    /**
     * Set 最近识别时间
     * @param LatestIdentificationTime 最近识别时间
     */
    public void setLatestIdentificationTime(String LatestIdentificationTime) {
        this.LatestIdentificationTime = LatestIdentificationTime;
    }

    /**
     * Get 服务地址 
     * @return ServerAddr 服务地址
     */
    public String getServerAddr() {
        return this.ServerAddr;
    }

    /**
     * Set 服务地址
     * @param ServerAddr 服务地址
     */
    public void setServerAddr(String ServerAddr) {
        this.ServerAddr = ServerAddr;
    }

    public NDRAssetServiceInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NDRAssetServiceInfo(NDRAssetServiceInfo source) {
        if (source.AssetId != null) {
            this.AssetId = new String(source.AssetId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.InstanceType != null) {
            this.InstanceType = new String(source.InstanceType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpcName != null) {
            this.VpcName = new String(source.VpcName);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.IpVersion != null) {
            this.IpVersion = new String(source.IpVersion);
        }
        if (source.IpType != null) {
            this.IpType = new String(source.IpType);
        }
        if (source.AssetService != null) {
            this.AssetService = new String(source.AssetService);
        }
        if (source.AssetVersion != null) {
            this.AssetVersion = new String(source.AssetVersion);
        }
        if (source.AssetCategory != null) {
            this.AssetCategory = new String(source.AssetCategory);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.IdentificationSource != null) {
            this.IdentificationSource = new String(source.IdentificationSource);
        }
        if (source.FirstIdentificationTime != null) {
            this.FirstIdentificationTime = new String(source.FirstIdentificationTime);
        }
        if (source.LatestIdentificationTime != null) {
            this.LatestIdentificationTime = new String(source.LatestIdentificationTime);
        }
        if (source.ServerAddr != null) {
            this.ServerAddr = new String(source.ServerAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AssetId", this.AssetId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpcName", this.VpcName);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "IpVersion", this.IpVersion);
        this.setParamSimple(map, prefix + "IpType", this.IpType);
        this.setParamSimple(map, prefix + "AssetService", this.AssetService);
        this.setParamSimple(map, prefix + "AssetVersion", this.AssetVersion);
        this.setParamSimple(map, prefix + "AssetCategory", this.AssetCategory);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "IdentificationSource", this.IdentificationSource);
        this.setParamSimple(map, prefix + "FirstIdentificationTime", this.FirstIdentificationTime);
        this.setParamSimple(map, prefix + "LatestIdentificationTime", this.LatestIdentificationTime);
        this.setParamSimple(map, prefix + "ServerAddr", this.ServerAddr);

    }
}

