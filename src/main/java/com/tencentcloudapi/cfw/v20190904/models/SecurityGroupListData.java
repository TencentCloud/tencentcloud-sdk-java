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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityGroupListData extends AbstractModel {

    /**
    * 执行顺序
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 访问源
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 访问源类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资源组
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 访问目的
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 访问目的类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100:资源组
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * 协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 目的端口
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 策略, 1：阻断，2：放行
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 描述
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 单/双向下发，0:单向下发，1：双向下发
    */
    @SerializedName("BothWay")
    @Expose
    private Long BothWay;

    /**
    * 规则ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 是否开关开启，0：未开启，1：开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否是正常规则，0：正常，1：异常
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * 私有网络ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例名称
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 公网IP，多个以英文逗号分隔
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网IP，多个以英文逗号分隔
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 掩码地址，多个以英文逗号分隔
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * 端口协议类型参数模板id
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 生成双向下发规则
    */
    @SerializedName("BothWayInfo")
    @Expose
    private SecurityGroupBothWayInfo [] BothWayInfo;

    /**
    * 方向，0：出站，1：入站，默认1
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 是否使用端口协议模板，0：否，1：是
    */
    @SerializedName("ProtocolPortType")
    @Expose
    private Long ProtocolPortType;

    /**
    * Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 资产分组名称
    */
    @SerializedName("AssetGroupNameIn")
    @Expose
    private String AssetGroupNameIn;

    /**
    * 资产分组名称
    */
    @SerializedName("AssetGroupNameOut")
    @Expose
    private String AssetGroupNameOut;

    /**
    * 模板名称
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * 端口协议类型参数模板名称
    */
    @SerializedName("ProtocolPortName")
    @Expose
    private String ProtocolPortName;

    /**
     * Get 执行顺序 
     * @return OrderIndex 执行顺序
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 执行顺序
     * @param OrderIndex 执行顺序
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 访问源 
     * @return SourceId 访问源
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 访问源
     * @param SourceId 访问源
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 访问源类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资源组 
     * @return SourceType 访问源类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资源组
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资源组
     * @param SourceType 访问源类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资源组
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问目的 
     * @return TargetId 访问目的
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 访问目的
     * @param TargetId 访问目的
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 访问目的类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100:资源组 
     * @return TargetType 访问目的类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100:资源组
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 访问目的类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100:资源组
     * @param TargetType 访问目的类型，默认为0，1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100:资源组
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
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
     * Get 目的端口 
     * @return Port 目的端口
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 目的端口
     * @param Port 目的端口
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 策略, 1：阻断，2：放行 
     * @return Strategy 策略, 1：阻断，2：放行
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 策略, 1：阻断，2：放行
     * @param Strategy 策略, 1：阻断，2：放行
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 描述 
     * @return Detail 描述
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
     * @param Detail 描述
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 单/双向下发，0:单向下发，1：双向下发 
     * @return BothWay 单/双向下发，0:单向下发，1：双向下发
     */
    public Long getBothWay() {
        return this.BothWay;
    }

    /**
     * Set 单/双向下发，0:单向下发，1：双向下发
     * @param BothWay 单/双向下发，0:单向下发，1：双向下发
     */
    public void setBothWay(Long BothWay) {
        this.BothWay = BothWay;
    }

    /**
     * Get 规则ID 
     * @return Id 规则ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 规则ID
     * @param Id 规则ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 是否开关开启，0：未开启，1：开启 
     * @return Status 是否开关开启，0：未开启，1：开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否开关开启，0：未开启，1：开启
     * @param Status 是否开关开启，0：未开启，1：开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否是正常规则，0：正常，1：异常 
     * @return IsNew 是否是正常规则，0：正常，1：异常
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set 是否是正常规则，0：正常，1：异常
     * @param IsNew 是否是正常规则，0：正常，1：异常
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
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
     * @return SubnetId 子网ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
     * @param SubnetId 子网ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
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
     * Get 公网IP，多个以英文逗号分隔 
     * @return PublicIp 公网IP，多个以英文逗号分隔
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP，多个以英文逗号分隔
     * @param PublicIp 公网IP，多个以英文逗号分隔
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网IP，多个以英文逗号分隔 
     * @return PrivateIp 内网IP，多个以英文逗号分隔
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网IP，多个以英文逗号分隔
     * @param PrivateIp 内网IP，多个以英文逗号分隔
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 掩码地址，多个以英文逗号分隔 
     * @return Cidr 掩码地址，多个以英文逗号分隔
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set 掩码地址，多个以英文逗号分隔
     * @param Cidr 掩码地址，多个以英文逗号分隔
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get 端口协议类型参数模板id 
     * @return ServiceTemplateId 端口协议类型参数模板id
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 端口协议类型参数模板id
     * @param ServiceTemplateId 端口协议类型参数模板id
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
    }

    /**
     * Get 生成双向下发规则 
     * @return BothWayInfo 生成双向下发规则
     */
    public SecurityGroupBothWayInfo [] getBothWayInfo() {
        return this.BothWayInfo;
    }

    /**
     * Set 生成双向下发规则
     * @param BothWayInfo 生成双向下发规则
     */
    public void setBothWayInfo(SecurityGroupBothWayInfo [] BothWayInfo) {
        this.BothWayInfo = BothWayInfo;
    }

    /**
     * Get 方向，0：出站，1：入站，默认1 
     * @return Direction 方向，0：出站，1：入站，默认1
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向，0：出站，1：入站，默认1
     * @param Direction 方向，0：出站，1：入站，默认1
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 是否使用端口协议模板，0：否，1：是 
     * @return ProtocolPortType 是否使用端口协议模板，0：否，1：是
     */
    public Long getProtocolPortType() {
        return this.ProtocolPortType;
    }

    /**
     * Set 是否使用端口协议模板，0：否，1：是
     * @param ProtocolPortType 是否使用端口协议模板，0：否，1：是
     */
    public void setProtocolPortType(Long ProtocolPortType) {
        this.ProtocolPortType = ProtocolPortType;
    }

    /**
     * Get Uuid 
     * @return Uuid Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set Uuid
     * @param Uuid Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
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
     * Get 资产分组名称 
     * @return AssetGroupNameIn 资产分组名称
     */
    public String getAssetGroupNameIn() {
        return this.AssetGroupNameIn;
    }

    /**
     * Set 资产分组名称
     * @param AssetGroupNameIn 资产分组名称
     */
    public void setAssetGroupNameIn(String AssetGroupNameIn) {
        this.AssetGroupNameIn = AssetGroupNameIn;
    }

    /**
     * Get 资产分组名称 
     * @return AssetGroupNameOut 资产分组名称
     */
    public String getAssetGroupNameOut() {
        return this.AssetGroupNameOut;
    }

    /**
     * Set 资产分组名称
     * @param AssetGroupNameOut 资产分组名称
     */
    public void setAssetGroupNameOut(String AssetGroupNameOut) {
        this.AssetGroupNameOut = AssetGroupNameOut;
    }

    /**
     * Get 模板名称 
     * @return ParameterName 模板名称
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set 模板名称
     * @param ParameterName 模板名称
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get 端口协议类型参数模板名称 
     * @return ProtocolPortName 端口协议类型参数模板名称
     */
    public String getProtocolPortName() {
        return this.ProtocolPortName;
    }

    /**
     * Set 端口协议类型参数模板名称
     * @param ProtocolPortName 端口协议类型参数模板名称
     */
    public void setProtocolPortName(String ProtocolPortName) {
        this.ProtocolPortName = ProtocolPortName;
    }

    public SecurityGroupListData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupListData(SecurityGroupListData source) {
        if (source.OrderIndex != null) {
            this.OrderIndex = new Long(source.OrderIndex);
        }
        if (source.SourceId != null) {
            this.SourceId = new String(source.SourceId);
        }
        if (source.SourceType != null) {
            this.SourceType = new Long(source.SourceType);
        }
        if (source.TargetId != null) {
            this.TargetId = new String(source.TargetId);
        }
        if (source.TargetType != null) {
            this.TargetType = new Long(source.TargetType);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Port != null) {
            this.Port = new String(source.Port);
        }
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.BothWay != null) {
            this.BothWay = new Long(source.BothWay);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.PublicIp != null) {
            this.PublicIp = new String(source.PublicIp);
        }
        if (source.PrivateIp != null) {
            this.PrivateIp = new String(source.PrivateIp);
        }
        if (source.Cidr != null) {
            this.Cidr = new String(source.Cidr);
        }
        if (source.ServiceTemplateId != null) {
            this.ServiceTemplateId = new String(source.ServiceTemplateId);
        }
        if (source.BothWayInfo != null) {
            this.BothWayInfo = new SecurityGroupBothWayInfo[source.BothWayInfo.length];
            for (int i = 0; i < source.BothWayInfo.length; i++) {
                this.BothWayInfo[i] = new SecurityGroupBothWayInfo(source.BothWayInfo[i]);
            }
        }
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.ProtocolPortType != null) {
            this.ProtocolPortType = new Long(source.ProtocolPortType);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.AssetGroupNameIn != null) {
            this.AssetGroupNameIn = new String(source.AssetGroupNameIn);
        }
        if (source.AssetGroupNameOut != null) {
            this.AssetGroupNameOut = new String(source.AssetGroupNameOut);
        }
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
        if (source.ProtocolPortName != null) {
            this.ProtocolPortName = new String(source.ProtocolPortName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OrderIndex", this.OrderIndex);
        this.setParamSimple(map, prefix + "SourceId", this.SourceId);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "TargetId", this.TargetId);
        this.setParamSimple(map, prefix + "TargetType", this.TargetType);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "BothWay", this.BothWay);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamArrayObj(map, prefix + "BothWayInfo.", this.BothWayInfo);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "ProtocolPortType", this.ProtocolPortType);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "AssetGroupNameIn", this.AssetGroupNameIn);
        this.setParamSimple(map, prefix + "AssetGroupNameOut", this.AssetGroupNameOut);
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);
        this.setParamSimple(map, prefix + "ProtocolPortName", this.ProtocolPortName);

    }
}

