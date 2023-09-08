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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EdgeIpInfo extends AbstractModel{

    /**
    * 公网IP
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIpType")
    @Expose
    private Long PublicIpType;

    /**
    * 实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IntranetIp")
    @Expose
    private String IntranetIp;

    /**
    * 资产类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetType")
    @Expose
    private String AssetType;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 风险端口数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PortRiskCount")
    @Expose
    private Long PortRiskCount;

    /**
    * 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsRegionEip")
    @Expose
    private Long IsRegionEip;

    /**
    * EIP 所关联的VPC
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsSerialRegion")
    @Expose
    private Long IsSerialRegion;

    /**
    * 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsPublicClb")
    @Expose
    private Long IsPublicClb;

    /**
    * 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndpointBindEipNum")
    @Expose
    private Long EndpointBindEipNum;

    /**
    * 扫描深度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScanMode")
    @Expose
    private String ScanMode;

    /**
    * 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 私有连接ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EndpointId")
    @Expose
    private String EndpointId;

    /**
    * 私有连接IP
注意：此字段可能返回 null，表示取不到有效值。
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
     * Get 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIpType 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPublicIpType() {
        return this.PublicIpType;
    }

    /**
     * Set 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIpType 公网 IP 类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIpType(Long PublicIpType) {
        this.PublicIpType = PublicIpType;
    }

    /**
     * Get 实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 内网IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IntranetIp 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIntranetIp() {
        return this.IntranetIp;
    }

    /**
     * Set 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param IntranetIp 内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIntranetIp(String IntranetIp) {
        this.IntranetIp = IntranetIp;
    }

    /**
     * Get 资产类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetType 资产类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetType(String AssetType) {
        this.AssetType = AssetType;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 风险端口数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PortRiskCount 风险端口数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPortRiskCount() {
        return this.PortRiskCount;
    }

    /**
     * Set 风险端口数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PortRiskCount 风险端口数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPortRiskCount(Long PortRiskCount) {
        this.PortRiskCount = PortRiskCount;
    }

    /**
     * Get 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * Set 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastScanTime 最近扫描时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * Get 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsRegionEip 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsRegionEip() {
        return this.IsRegionEip;
    }

    /**
     * Set 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsRegionEip 是否为region eip
0 不为region eip，不能选择串行
1 为region eip 可以选择串行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsRegionEip(Long IsRegionEip) {
        this.IsRegionEip = IsRegionEip;
    }

    /**
     * Get EIP 所关联的VPC
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId EIP 所关联的VPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set EIP 所关联的VPC
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId EIP 所关联的VPC
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsSerialRegion 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsSerialRegion() {
        return this.IsSerialRegion;
    }

    /**
     * Set 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsSerialRegion 0: 该地域暂未支持串行
1: 该用户未在该地域配置串行带宽
2: 该用户已在该地域配置串行带宽，可以开启串行开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsSerialRegion(Long IsSerialRegion) {
        this.IsSerialRegion = IsSerialRegion;
    }

    /**
     * Get 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsPublicClb 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsPublicClb() {
        return this.IsPublicClb;
    }

    /**
     * Set 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

注意：此字段可能返回 null，表示取不到有效值。
     * @param IsPublicClb 0: 不是公网CLB 可以开启串行开关
1: 是公网CLB 不可以开启串行开关

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsPublicClb(Long IsPublicClb) {
        this.IsPublicClb = IsPublicClb;
    }

    /**
     * Get 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointBindEipNum 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEndpointBindEipNum() {
        return this.EndpointBindEipNum;
    }

    /**
     * Set 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointBindEipNum 0: 开启开关时提示要创建私有连接。
1: 关闭该开关是提示删除私有连接。
如果大于 1: 关闭开关 、开启开关不需提示创建删除私有连接。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpointBindEipNum(Long EndpointBindEipNum) {
        this.EndpointBindEipNum = EndpointBindEipNum;
    }

    /**
     * Get 扫描深度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanMode 扫描深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScanMode() {
        return this.ScanMode;
    }

    /**
     * Set 扫描深度
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanMode 扫描深度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScanMode(String ScanMode) {
        this.ScanMode = ScanMode;
    }

    /**
     * Get 扫描状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScanStatus 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScanStatus() {
        return this.ScanStatus;
    }

    /**
     * Set 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScanStatus 扫描状态
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 开关状态
0 : 关闭
1 : 开启
2 : 开启中
3 : 关闭中
4 : 异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 私有连接ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointId 私有连接ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpointId() {
        return this.EndpointId;
    }

    /**
     * Set 私有连接ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointId 私有连接ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEndpointId(String EndpointId) {
        this.EndpointId = EndpointId;
    }

    /**
     * Get 私有连接IP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EndpointIp 私有连接IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEndpointIp() {
        return this.EndpointIp;
    }

    /**
     * Set 私有连接IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param EndpointIp 私有连接IP
注意：此字段可能返回 null，表示取不到有效值。
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

    }
}

