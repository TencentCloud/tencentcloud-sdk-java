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

public class SecurityGroupBothWayInfo extends AbstractModel{

    /**
    * 执行顺序
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OrderIndex")
    @Expose
    private Long OrderIndex;

    /**
    * 访问源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceId")
    @Expose
    private String SourceId;

    /**
    * 访问源类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 访问目的
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetId")
    @Expose
    private String TargetId;

    /**
    * 访问目的类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TargetType")
    @Expose
    private Long TargetType;

    /**
    * 协议
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 目的端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 策略, 1：阻断，2：放行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 方向，0：出站，1：入站，默认1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 是否开关开启，0：未开启，1：开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 是否是正常规则，0：正常，1：异常
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsNew")
    @Expose
    private Long IsNew;

    /**
    * 单/双向下发，0:单向下发，1：双向下发
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BothWay")
    @Expose
    private Long BothWay;

    /**
    * 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 实例名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 公网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicIp")
    @Expose
    private String PublicIp;

    /**
    * 内网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrivateIp")
    @Expose
    private String PrivateIp;

    /**
    * 掩码地址，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Cidr")
    @Expose
    private String Cidr;

    /**
    * 端口协议类型参数模板id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceTemplateId")
    @Expose
    private String ServiceTemplateId;

    /**
    * 是否使用端口协议模板，0：否，1：是
    */
    @SerializedName("ProtocolPortType")
    @Expose
    private Long ProtocolPortType;

    /**
     * Get 执行顺序
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OrderIndex 执行顺序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOrderIndex() {
        return this.OrderIndex;
    }

    /**
     * Set 执行顺序
注意：此字段可能返回 null，表示取不到有效值。
     * @param OrderIndex 执行顺序
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrderIndex(Long OrderIndex) {
        this.OrderIndex = OrderIndex;
    }

    /**
     * Get 访问源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceId 访问源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceId() {
        return this.SourceId;
    }

    /**
     * Set 访问源
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceId 访问源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceId(String SourceId) {
        this.SourceId = SourceId;
    }

    /**
     * Get 访问源类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceType 访问源类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 访问源类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceType 访问源类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 访问目的
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetId 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTargetId() {
        return this.TargetId;
    }

    /**
     * Set 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetId 访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetId(String TargetId) {
        this.TargetId = TargetId;
    }

    /**
     * Get 访问目的类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TargetType 访问目的类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTargetType() {
        return this.TargetType;
    }

    /**
     * Set 访问目的类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。
     * @param TargetType 访问目的类型，默认为0，0: IP, 1: VPC, 2: SUBNET, 3: CVM, 4: CLB, 5: ENI, 6: CDB, 7: 参数模板, 100: 资产分组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTargetType(Long TargetType) {
        this.TargetType = TargetType;
    }

    /**
     * Get 协议
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议
注意：此字段可能返回 null，表示取不到有效值。
     * @param Protocol 协议
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 目的端口
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * Set 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 目的端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * Get 策略, 1：阻断，2：放行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Strategy 策略, 1：阻断，2：放行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 策略, 1：阻断，2：放行
注意：此字段可能返回 null，表示取不到有效值。
     * @param Strategy 策略, 1：阻断，2：放行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 方向，0：出站，1：入站，默认1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Direction 方向，0：出站，1：入站，默认1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 方向，0：出站，1：入站，默认1
注意：此字段可能返回 null，表示取不到有效值。
     * @param Direction 方向，0：出站，1：入站，默认1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
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
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 是否开关开启，0：未开启，1：开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 是否开关开启，0：未开启，1：开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 是否开关开启，0：未开启，1：开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 是否开关开启，0：未开启，1：开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 是否是正常规则，0：正常，1：异常
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsNew 是否是正常规则，0：正常，1：异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIsNew() {
        return this.IsNew;
    }

    /**
     * Set 是否是正常规则，0：正常，1：异常
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsNew 是否是正常规则，0：正常，1：异常
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsNew(Long IsNew) {
        this.IsNew = IsNew;
    }

    /**
     * Get 单/双向下发，0:单向下发，1：双向下发
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BothWay 单/双向下发，0:单向下发，1：双向下发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBothWay() {
        return this.BothWay;
    }

    /**
     * Set 单/双向下发，0:单向下发，1：双向下发
注意：此字段可能返回 null，表示取不到有效值。
     * @param BothWay 单/双向下发，0:单向下发，1：双向下发
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBothWay(Long BothWay) {
        this.BothWay = BothWay;
    }

    /**
     * Get 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 私有网络ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 子网ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubnetId 子网ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 实例名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 实例名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 公网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicIp 公网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicIp() {
        return this.PublicIp;
    }

    /**
     * Set 公网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicIp 公网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicIp(String PublicIp) {
        this.PublicIp = PublicIp;
    }

    /**
     * Get 内网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrivateIp 内网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrivateIp() {
        return this.PrivateIp;
    }

    /**
     * Set 内网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrivateIp 内网IP，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrivateIp(String PrivateIp) {
        this.PrivateIp = PrivateIp;
    }

    /**
     * Get 掩码地址，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Cidr 掩码地址，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCidr() {
        return this.Cidr;
    }

    /**
     * Set 掩码地址，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     * @param Cidr 掩码地址，多个以英文逗号分隔
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCidr(String Cidr) {
        this.Cidr = Cidr;
    }

    /**
     * Get 端口协议类型参数模板id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceTemplateId 端口协议类型参数模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceTemplateId() {
        return this.ServiceTemplateId;
    }

    /**
     * Set 端口协议类型参数模板id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceTemplateId 端口协议类型参数模板id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceTemplateId(String ServiceTemplateId) {
        this.ServiceTemplateId = ServiceTemplateId;
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

    public SecurityGroupBothWayInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SecurityGroupBothWayInfo(SecurityGroupBothWayInfo source) {
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
        if (source.Direction != null) {
            this.Direction = new Long(source.Direction);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IsNew != null) {
            this.IsNew = new Long(source.IsNew);
        }
        if (source.BothWay != null) {
            this.BothWay = new Long(source.BothWay);
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
        if (source.ProtocolPortType != null) {
            this.ProtocolPortType = new Long(source.ProtocolPortType);
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
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsNew", this.IsNew);
        this.setParamSimple(map, prefix + "BothWay", this.BothWay);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "PublicIp", this.PublicIp);
        this.setParamSimple(map, prefix + "PrivateIp", this.PrivateIp);
        this.setParamSimple(map, prefix + "Cidr", this.Cidr);
        this.setParamSimple(map, prefix + "ServiceTemplateId", this.ServiceTemplateId);
        this.setParamSimple(map, prefix + "ProtocolPortType", this.ProtocolPortType);

    }
}

