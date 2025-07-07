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

public class EdgeIpInfo extends AbstractModel {

    /**
    * 公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 公网 IP 类型 1 公网,2 弹性,3 弹性ipv6,4 anycastIP, 6 HighQualityEIP
    */
    @SerializedName("PublicIpType")
    @Expose
    private Long PublicIpType;

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 内网IP
    */
    @SerializedName("IntranetIp")
    @Expose
    private String IntranetIp;

    /**
    * 资产类型
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 风险端口数
    */
    @SerializedName("PortRiskCount")
    @Expose
    private Long PortRiskCount;

    /**
    * 最近扫描时间
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
    */
    @SerializedName("IsRegionEip")
    @Expose
    private Long IsRegionEip;

    /**
    * EIP 所关联的VPC
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
    */
    @SerializedName("IsSerialRegion")
    @Expose
    private Long IsSerialRegion;

    /**
    * 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

    */
    @SerializedName("IsPublicClb")
    @Expose
    private Long IsPublicClb;

    /**
    * 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
    */
    @SerializedName("EndpointBindEipNum")
    @Expose
    private Long EndpointBindEipNum;

    /**
    * 扫描深度
    */
    @SerializedName("ScanMode")
    @Expose
    private String ScanMode;

    /**
    * 扫描状态
    */
    @SerializedName("ScanStatus")
    @Expose
    private Long ScanStatus;

    /**
    * 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 私有连接ID
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * 私有连接IP
    */
    @SerializedName("EndpointIp")
    @Expose
    private String EndpointIp;

    /**
    * 0 : 旁路
1 : 串行
2 : 正在模式切换
    */
    @SerializedName("SwitchMode")
    @Expose
    private Long SwitchMode;

    /**
    * 开关权重
    */
    @SerializedName("SwitchWeight")
    @Expose
    private Long SwitchWeight;

    /**
    * 域名化CLB的域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * IP超量状态
    */
    @SerializedName("OverUsedStatus")
    @Expose
    private Long OverUsedStatus;

    /**
     * Get 公网IP 
     * @return PublicIp 公网IP
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP
     * @param PublicIp 公网IP
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 公网 IP 类型 1 公网,2 弹性,3 弹性ipv6,4 anycastIP, 6 HighQualityEIP 
     * @return PublicIpType 公网 IP 类型 1 公网,2 弹性,3 弹性ipv6,4 anycastIP, 6 HighQualityEIP
     */
    public Long getPublicIpType() {
        return this.PublicIpType;
    }

    /**
     * Set 公网 IP 类型 1 公网,2 弹性,3 弹性ipv6,4 anycastIP, 6 HighQualityEIP
     * @param PublicIpType 公网 IP 类型 1 公网,2 弹性,3 弹性ipv6,4 anycastIP, 6 HighQualityEIP
     */
    public void setPublicIpType(Long PublicIpType) {
        this.PublicIpType = PublicIpType;
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
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 内网IP 
     * @return IntranetIp 内网IP
     */
    public String getIntranetIp() {
        return this.IntranetIp;
    }

    /**
     * Set 内网IP
     * @param IntranetIp 内网IP
     */
    public void setIntranetIp(String IntranetIp) {
        this.IntranetIp = IntranetIp;
    }

    /**
     * Get 资产类型 
     * @return AssetType 资产类型
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
     * @param AssetType 资产类型
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
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
     * Get 风险端口数 
     * @return PortRiskCount 风险端口数
     */
    public Long getPortRiskCount() {
        return this.PortRiskCount;
    }

    /**
     * Set 风险端口数
     * @param PortRiskCount 风险端口数
     */
    public void setPortRiskCount(Long PortRiskCount) {
        this.PortRiskCount = PortRiskCount;
    }

    /**
     * Get 最近扫描时间 
     * @return LastScanTime 最近扫描时间
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最近扫描时间
     * @param LastScanTime 最近扫描时间
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行 
     * @return IsRegionEip 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
     */
    public Long getIsRegionEip() {
        return this.IsRegionEip;
    }

    /**
     * Set 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
     * @param IsRegionEip 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
     */
    public void setIsRegionEip(Long IsRegionEip) {
        this.IsRegionEip = IsRegionEip;
    }

    /**
     * Get EIP 所关联的VPC 
     * @return VpcId EIP 所关联的VPC
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set EIP 所关联的VPC
     * @param VpcId EIP 所关联的VPC
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关 
     * @return IsSerialRegion 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
     */
    public Long getIsSerialRegion() {
        return this.IsSerialRegion;
    }

    /**
     * Set 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
     * @param IsSerialRegion 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
     */
    public void setIsSerialRegion(Long IsSerialRegion) {
        this.IsSerialRegion = IsSerialRegion;
    }

    /**
     * Get 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关
 
     * @return IsPublicClb 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

     */
    public Long getIsPublicClb() {
        return this.IsPublicClb;
    }

    /**
     * Set 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

     * @param IsPublicClb 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

     */
    public void setIsPublicClb(Long IsPublicClb) {
        this.IsPublicClb = IsPublicClb;
    }

    /**
     * Get 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。 
     * @return EndpointBindEipNum 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
     */
    public Long getEndpointBindEipNum() {
        return this.EndpointBindEipNum;
    }

    /**
     * Set 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
     * @param EndpointBindEipNum 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
     */
    public void setEndpointBindEipNum(Long EndpointBindEipNum) {
        this.EndpointBindEipNum = EndpointBindEipNum;
    }

    /**
     * Get 扫描深度 
     * @return ScanMode 扫描深度
     */
    public String getScanMode() {
        return this.ScanMode;
    }

    /**
     * Set 扫描深度
     * @param ScanMode 扫描深度
     */
    public void setScanMode(String ScanMode) {
        this.ScanMode = ScanMode;
    }

    /**
     * Get 扫描状态 
     * @return ScanStatus 扫描状态
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态
     * @param ScanStatus 扫描状态
     */
    public void setScanStatus(Long ScanStatus) {
        this.ScanStatus = ScanStatus;
    }

    /**
     * Get 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常 
     * @return Status 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
     * @param Status 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 私有连接ID 
     * @return EndpointId 私有连接ID
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set 私有连接ID
     * @param EndpointId 私有连接ID
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get 私有连接IP 
     * @return EndpointIp 私有连接IP
     */
    public String getEndpointIp() {
        return this.EndpointIp;
    }

    /**
     * Set 私有连接IP
     * @param EndpointIp 私有连接IP
     */
    public void setEndpointIp(String EndpointIp) {
        this.EndpointIp = EndpointIp;
    }

    /**
     * Get 0 : 旁路
1 : 串行
2 : 正在模式切换 
     * @return SwitchMode 0 : 旁路
1 : 串行
2 : 正在模式切换
     */
    public Long getSwitchMode() {
        return this.SwitchMode;
    }

    /**
     * Set 0 : 旁路
1 : 串行
2 : 正在模式切换
     * @param SwitchMode 0 : 旁路
1 : 串行
2 : 正在模式切换
     */
    public void setSwitchMode(Long SwitchMode) {
        this.SwitchMode = SwitchMode;
    }

    /**
     * Get 开关权重 
     * @return SwitchWeight 开关权重
     */
    public Long getSwitchWeight() {
        return this.SwitchWeight;
    }

    /**
     * Set 开关权重
     * @param SwitchWeight 开关权重
     */
    public void setSwitchWeight(Long SwitchWeight) {
        this.SwitchWeight = SwitchWeight;
    }

    /**
     * Get 域名化CLB的域名 
     * @return Domain 域名化CLB的域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名化CLB的域名
     * @param Domain 域名化CLB的域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get IP超量状态 
     * @return OverUsedStatus IP超量状态
     */
    public Long getOverUsedStatus() {
        return this.OverUsedStatus;
    }

    /**
     * Set IP超量状态
     * @param OverUsedStatus IP超量状态
     */
    public void setOverUsedStatus(Long OverUsedStatus) {
        this.OverUsedStatus = OverUsedStatus;
    }

    public EdgeIpInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EdgeIpInfo(EdgeIpInfo source) {
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PublicIpType != null) {
            this.PublicIpType = new Long(source.PublicIpType);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.IntranetIp != null) {
            this.IntranetIp = new String(source.IntranetIp);
        }
        if (source.AssetType != null) {
            this.AssetType = new String(source.AssetType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.PortRiskCount != null) {
            this.PortRiskCount = new Long(source.PortRiskCount);
        }
        if (source.LastScanTime != null) {
            this.LastScanTime = new String(source.LastScanTime);
        }
        if (source.IsRegionEip != null) {
            this.IsRegionEip = new Long(source.IsRegionEip);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.IsSerialRegion != null) {
            this.IsSerialRegion = new Long(source.IsSerialRegion);
        }
        if (source.IsPublicClb != null) {
            this.IsPublicClb = new Long(source.IsPublicClb);
        }
        if (source.EndpointBindEipNum != null) {
            this.EndpointBindEipNum = new Long(source.EndpointBindEipNum);
        }
        if (source.ScanMode != null) {
            this.ScanMode = new String(source.ScanMode);
        }
        if (source.ScanStatus != null) {
            this.ScanStatus = new Long(source.ScanStatus);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.EndpointId != null) {
            this.EndpointId = new String(source.EndpointId);
        }
        if (source.EndpointIp != null) {
            this.EndpointIp = new String(source.EndpointIp);
        }
        if (source.SwitchMode != null) {
            this.SwitchMode = new Long(source.SwitchMode);
        }
        if (source.SwitchWeight != null) {
            this.SwitchWeight = new Long(source.SwitchWeight);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.OverUsedStatus != null) {
            this.OverUsedStatus = new Long(source.OverUsedStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PublicIpType", this.PublicIpType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "IntranetIp", this.IntranetIp);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "PortRiskCount", this.PortRiskCount);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "IsRegionEip", this.IsRegionEip);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "IsSerialRegion", this.IsSerialRegion);
        this.setParamSimple(map, prefix + "IsPublicClb", this.IsPublicClb);
        this.setParamSimple(map, prefix + "EndpointBindEipNum", this.EndpointBindEipNum);
        this.setParamSimple(map, prefix + "ScanMode", this.ScanMode);
        this.setParamSimple(map, prefix + "ScanStatus", this.ScanStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "EndpointId", this.EndpointId);
        this.setParamSimple(map, prefix + "EndpointIp", this.EndpointIp);
        this.setParamSimple(map, prefix + "SwitchMode", this.SwitchMode);
        this.setParamSimple(map, prefix + "SwitchWeight", this.SwitchWeight);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "OverUsedStatus", this.OverUsedStatus);

    }
}

