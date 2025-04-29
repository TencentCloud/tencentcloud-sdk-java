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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DirectConnect extends AbstractModel {

    /**
    * 物理专线ID。
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * 物理专线的名称。
    */
    @SerializedName("DirectConnectName")
    @Expose
    private String DirectConnectName;

    /**
    * 物理专线的接入点ID。
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * 物理专线的状态。
申请中：PENDING 
申请驳回：REJECTED   
待付款：TOPAY 
已付款：PAID 
建设中：ALLOCATED   
已开通：AVAILABLE  
删除中 ：DELETING
已删除：DELETED 。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 物理专线创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 物理专线的开通时间。
    */
    @SerializedName("EnabledTime")
    @Expose
    private String EnabledTime;

    /**
    * 提供接入物理专线的运营商。ChinaTelecom：中国电信， ChinaMobile：中国移动，ChinaUnicom：中国联通， In-houseWiring：楼内线，ChinaOther：中国其他， InternationalOperator：境外其他。
    */
    @SerializedName("LineOperator")
    @Expose
    private String LineOperator;

    /**
    * 本地数据中心的地理位置。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 物理专线接入接口带宽，单位为Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 用户侧物理专线接入端口类型,取值：100Base-T：百兆电口,1000Base-T（默认值）：千兆电口,1000Base-LX：千兆单模光口（10千米）,10GBase-T：万兆电口10GBase-LR：万兆单模光口（10千米），默认值，千兆单模光口（10千米）
    */
    @SerializedName("PortType")
    @Expose
    private String PortType;

    /**
    * 运营商或者服务商为物理专线提供的电路编码。
    */
    @SerializedName("CircuitCode")
    @Expose
    private String CircuitCode;

    /**
    * 冗余物理专线的ID。
    */
    @SerializedName("RedundantDirectConnectId")
    @Expose
    private String RedundantDirectConnectId;

    /**
    * 物理专线调试VLAN。默认开启VLAN，自动分配VLAN。
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * 物理专线调试腾讯侧互联IP。
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * 物理专线调试用户侧互联IP。
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * 物理专线申请者姓名。默认从账户体系获取。
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 物理专线申请者联系邮箱。默认从账户体系获取。
    */
    @SerializedName("CustomerContactMail")
    @Expose
    private String CustomerContactMail;

    /**
    * 物理专线申请者联系号码。默认从账户体系获取。
    */
    @SerializedName("CustomerContactNumber")
    @Expose
    private String CustomerContactNumber;

    /**
    * 物理专线的过期时间。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 报障联系人。
    */
    @SerializedName("FaultReportContactPerson")
    @Expose
    private String FaultReportContactPerson;

    /**
    * 报障联系电话。
    */
    @SerializedName("FaultReportContactNumber")
    @Expose
    private String FaultReportContactNumber;

    /**
    * 标签键值对
    */
    @SerializedName("TagSet")
    @Expose
    private Tag [] TagSet;

    /**
    * 物理专线的接入点类型。
    */
    @SerializedName("AccessPointType")
    @Expose
    private String AccessPointType;

    /**
    * IDC所在城市
    */
    @SerializedName("IdcCity")
    @Expose
    private String IdcCity;

    /**
    * 计费状态
    */
    @SerializedName("ChargeState")
    @Expose
    private String ChargeState;

    /**
    * 物理专线开通时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 物理专线是否已签署用户协议
    */
    @SerializedName("SignLaw")
    @Expose
    private Boolean SignLaw;

    /**
    * 物理专线是否为LocalZone
    */
    @SerializedName("LocalZone")
    @Expose
    private Boolean LocalZone;

    /**
    * 该物理专线下vlan 0的专用通道数量
    */
    @SerializedName("VlanZeroDirectConnectTunnelCount")
    @Expose
    private Long VlanZeroDirectConnectTunnelCount;

    /**
    * 该物理专线下非vlan 0的专用通道数量
    */
    @SerializedName("OtherVlanDirectConnectTunnelCount")
    @Expose
    private Long OtherVlanDirectConnectTunnelCount;

    /**
    * 物理专线最小带宽
    */
    @SerializedName("MinBandwidth")
    @Expose
    private Long MinBandwidth;

    /**
    * 建设模式
    */
    @SerializedName("Construct")
    @Expose
    private Long Construct;

    /**
    * 物理专线的接入点名称
    */
    @SerializedName("AccessPointName")
    @Expose
    private String AccessPointName;

    /**
    * 是否三层架构
    */
    @SerializedName("IsThreeArch")
    @Expose
    private Boolean IsThreeArch;

    /**
     * Get 物理专线ID。 
     * @return DirectConnectId 物理专线ID。
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set 物理专线ID。
     * @param DirectConnectId 物理专线ID。
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Get 物理专线的名称。 
     * @return DirectConnectName 物理专线的名称。
     */
    public String getDirectConnectName() {
        return this.DirectConnectName;
    }

    /**
     * Set 物理专线的名称。
     * @param DirectConnectName 物理专线的名称。
     */
    public void setDirectConnectName(String DirectConnectName) {
        this.DirectConnectName = DirectConnectName;
    }

    /**
     * Get 物理专线的接入点ID。 
     * @return AccessPointId 物理专线的接入点ID。
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set 物理专线的接入点ID。
     * @param AccessPointId 物理专线的接入点ID。
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get 物理专线的状态。
申请中：PENDING 
申请驳回：REJECTED   
待付款：TOPAY 
已付款：PAID 
建设中：ALLOCATED   
已开通：AVAILABLE  
删除中 ：DELETING
已删除：DELETED 。 
     * @return State 物理专线的状态。
申请中：PENDING 
申请驳回：REJECTED   
待付款：TOPAY 
已付款：PAID 
建设中：ALLOCATED   
已开通：AVAILABLE  
删除中 ：DELETING
已删除：DELETED 。
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 物理专线的状态。
申请中：PENDING 
申请驳回：REJECTED   
待付款：TOPAY 
已付款：PAID 
建设中：ALLOCATED   
已开通：AVAILABLE  
删除中 ：DELETING
已删除：DELETED 。
     * @param State 物理专线的状态。
申请中：PENDING 
申请驳回：REJECTED   
待付款：TOPAY 
已付款：PAID 
建设中：ALLOCATED   
已开通：AVAILABLE  
删除中 ：DELETING
已删除：DELETED 。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 物理专线创建时间。 
     * @return CreatedTime 物理专线创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 物理专线创建时间。
     * @param CreatedTime 物理专线创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 物理专线的开通时间。 
     * @return EnabledTime 物理专线的开通时间。
     */
    public String getEnabledTime() {
        return this.EnabledTime;
    }

    /**
     * Set 物理专线的开通时间。
     * @param EnabledTime 物理专线的开通时间。
     */
    public void setEnabledTime(String EnabledTime) {
        this.EnabledTime = EnabledTime;
    }

    /**
     * Get 提供接入物理专线的运营商。ChinaTelecom：中国电信， ChinaMobile：中国移动，ChinaUnicom：中国联通， In-houseWiring：楼内线，ChinaOther：中国其他， InternationalOperator：境外其他。 
     * @return LineOperator 提供接入物理专线的运营商。ChinaTelecom：中国电信， ChinaMobile：中国移动，ChinaUnicom：中国联通， In-houseWiring：楼内线，ChinaOther：中国其他， InternationalOperator：境外其他。
     */
    public String getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set 提供接入物理专线的运营商。ChinaTelecom：中国电信， ChinaMobile：中国移动，ChinaUnicom：中国联通， In-houseWiring：楼内线，ChinaOther：中国其他， InternationalOperator：境外其他。
     * @param LineOperator 提供接入物理专线的运营商。ChinaTelecom：中国电信， ChinaMobile：中国移动，ChinaUnicom：中国联通， In-houseWiring：楼内线，ChinaOther：中国其他， InternationalOperator：境外其他。
     */
    public void setLineOperator(String LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get 本地数据中心的地理位置。 
     * @return Location 本地数据中心的地理位置。
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set 本地数据中心的地理位置。
     * @param Location 本地数据中心的地理位置。
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get 物理专线接入接口带宽，单位为Mbps。 
     * @return Bandwidth 物理专线接入接口带宽，单位为Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 物理专线接入接口带宽，单位为Mbps。
     * @param Bandwidth 物理专线接入接口带宽，单位为Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 用户侧物理专线接入端口类型,取值：100Base-T：百兆电口,1000Base-T（默认值）：千兆电口,1000Base-LX：千兆单模光口（10千米）,10GBase-T：万兆电口10GBase-LR：万兆单模光口（10千米），默认值，千兆单模光口（10千米） 
     * @return PortType 用户侧物理专线接入端口类型,取值：100Base-T：百兆电口,1000Base-T（默认值）：千兆电口,1000Base-LX：千兆单模光口（10千米）,10GBase-T：万兆电口10GBase-LR：万兆单模光口（10千米），默认值，千兆单模光口（10千米）
     */
    public String getPortType() {
        return this.PortType;
    }

    /**
     * Set 用户侧物理专线接入端口类型,取值：100Base-T：百兆电口,1000Base-T（默认值）：千兆电口,1000Base-LX：千兆单模光口（10千米）,10GBase-T：万兆电口10GBase-LR：万兆单模光口（10千米），默认值，千兆单模光口（10千米）
     * @param PortType 用户侧物理专线接入端口类型,取值：100Base-T：百兆电口,1000Base-T（默认值）：千兆电口,1000Base-LX：千兆单模光口（10千米）,10GBase-T：万兆电口10GBase-LR：万兆单模光口（10千米），默认值，千兆单模光口（10千米）
     */
    public void setPortType(String PortType) {
        this.PortType = PortType;
    }

    /**
     * Get 运营商或者服务商为物理专线提供的电路编码。 
     * @return CircuitCode 运营商或者服务商为物理专线提供的电路编码。
     */
    public String getCircuitCode() {
        return this.CircuitCode;
    }

    /**
     * Set 运营商或者服务商为物理专线提供的电路编码。
     * @param CircuitCode 运营商或者服务商为物理专线提供的电路编码。
     */
    public void setCircuitCode(String CircuitCode) {
        this.CircuitCode = CircuitCode;
    }

    /**
     * Get 冗余物理专线的ID。 
     * @return RedundantDirectConnectId 冗余物理专线的ID。
     */
    public String getRedundantDirectConnectId() {
        return this.RedundantDirectConnectId;
    }

    /**
     * Set 冗余物理专线的ID。
     * @param RedundantDirectConnectId 冗余物理专线的ID。
     */
    public void setRedundantDirectConnectId(String RedundantDirectConnectId) {
        this.RedundantDirectConnectId = RedundantDirectConnectId;
    }

    /**
     * Get 物理专线调试VLAN。默认开启VLAN，自动分配VLAN。 
     * @return Vlan 物理专线调试VLAN。默认开启VLAN，自动分配VLAN。
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set 物理专线调试VLAN。默认开启VLAN，自动分配VLAN。
     * @param Vlan 物理专线调试VLAN。默认开启VLAN，自动分配VLAN。
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get 物理专线调试腾讯侧互联IP。 
     * @return TencentAddress 物理专线调试腾讯侧互联IP。
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set 物理专线调试腾讯侧互联IP。
     * @param TencentAddress 物理专线调试腾讯侧互联IP。
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get 物理专线调试用户侧互联IP。 
     * @return CustomerAddress 物理专线调试用户侧互联IP。
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set 物理专线调试用户侧互联IP。
     * @param CustomerAddress 物理专线调试用户侧互联IP。
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get 物理专线申请者姓名。默认从账户体系获取。 
     * @return CustomerName 物理专线申请者姓名。默认从账户体系获取。
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 物理专线申请者姓名。默认从账户体系获取。
     * @param CustomerName 物理专线申请者姓名。默认从账户体系获取。
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 物理专线申请者联系邮箱。默认从账户体系获取。 
     * @return CustomerContactMail 物理专线申请者联系邮箱。默认从账户体系获取。
     */
    public String getCustomerContactMail() {
        return this.CustomerContactMail;
    }

    /**
     * Set 物理专线申请者联系邮箱。默认从账户体系获取。
     * @param CustomerContactMail 物理专线申请者联系邮箱。默认从账户体系获取。
     */
    public void setCustomerContactMail(String CustomerContactMail) {
        this.CustomerContactMail = CustomerContactMail;
    }

    /**
     * Get 物理专线申请者联系号码。默认从账户体系获取。 
     * @return CustomerContactNumber 物理专线申请者联系号码。默认从账户体系获取。
     */
    public String getCustomerContactNumber() {
        return this.CustomerContactNumber;
    }

    /**
     * Set 物理专线申请者联系号码。默认从账户体系获取。
     * @param CustomerContactNumber 物理专线申请者联系号码。默认从账户体系获取。
     */
    public void setCustomerContactNumber(String CustomerContactNumber) {
        this.CustomerContactNumber = CustomerContactNumber;
    }

    /**
     * Get 物理专线的过期时间。 
     * @return ExpiredTime 物理专线的过期时间。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 物理专线的过期时间。
     * @param ExpiredTime 物理专线的过期时间。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。 
     * @return ChargeType 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
     * @param ChargeType 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 报障联系人。 
     * @return FaultReportContactPerson 报障联系人。
     */
    public String getFaultReportContactPerson() {
        return this.FaultReportContactPerson;
    }

    /**
     * Set 报障联系人。
     * @param FaultReportContactPerson 报障联系人。
     */
    public void setFaultReportContactPerson(String FaultReportContactPerson) {
        this.FaultReportContactPerson = FaultReportContactPerson;
    }

    /**
     * Get 报障联系电话。 
     * @return FaultReportContactNumber 报障联系电话。
     */
    public String getFaultReportContactNumber() {
        return this.FaultReportContactNumber;
    }

    /**
     * Set 报障联系电话。
     * @param FaultReportContactNumber 报障联系电话。
     */
    public void setFaultReportContactNumber(String FaultReportContactNumber) {
        this.FaultReportContactNumber = FaultReportContactNumber;
    }

    /**
     * Get 标签键值对 
     * @return TagSet 标签键值对
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对
     * @param TagSet 标签键值对
     */
    public void setTagSet(Tag [] TagSet) {
        this.TagSet = TagSet;
    }

    /**
     * Get 物理专线的接入点类型。 
     * @return AccessPointType 物理专线的接入点类型。
     */
    public String getAccessPointType() {
        return this.AccessPointType;
    }

    /**
     * Set 物理专线的接入点类型。
     * @param AccessPointType 物理专线的接入点类型。
     */
    public void setAccessPointType(String AccessPointType) {
        this.AccessPointType = AccessPointType;
    }

    /**
     * Get IDC所在城市 
     * @return IdcCity IDC所在城市
     */
    public String getIdcCity() {
        return this.IdcCity;
    }

    /**
     * Set IDC所在城市
     * @param IdcCity IDC所在城市
     */
    public void setIdcCity(String IdcCity) {
        this.IdcCity = IdcCity;
    }

    /**
     * Get 计费状态 
     * @return ChargeState 计费状态
     */
    public String getChargeState() {
        return this.ChargeState;
    }

    /**
     * Set 计费状态
     * @param ChargeState 计费状态
     */
    public void setChargeState(String ChargeState) {
        this.ChargeState = ChargeState;
    }

    /**
     * Get 物理专线开通时间 
     * @return StartTime 物理专线开通时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 物理专线开通时间
     * @param StartTime 物理专线开通时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 物理专线是否已签署用户协议 
     * @return SignLaw 物理专线是否已签署用户协议
     */
    public Boolean getSignLaw() {
        return this.SignLaw;
    }

    /**
     * Set 物理专线是否已签署用户协议
     * @param SignLaw 物理专线是否已签署用户协议
     */
    public void setSignLaw(Boolean SignLaw) {
        this.SignLaw = SignLaw;
    }

    /**
     * Get 物理专线是否为LocalZone 
     * @return LocalZone 物理专线是否为LocalZone
     */
    public Boolean getLocalZone() {
        return this.LocalZone;
    }

    /**
     * Set 物理专线是否为LocalZone
     * @param LocalZone 物理专线是否为LocalZone
     */
    public void setLocalZone(Boolean LocalZone) {
        this.LocalZone = LocalZone;
    }

    /**
     * Get 该物理专线下vlan 0的专用通道数量 
     * @return VlanZeroDirectConnectTunnelCount 该物理专线下vlan 0的专用通道数量
     */
    public Long getVlanZeroDirectConnectTunnelCount() {
        return this.VlanZeroDirectConnectTunnelCount;
    }

    /**
     * Set 该物理专线下vlan 0的专用通道数量
     * @param VlanZeroDirectConnectTunnelCount 该物理专线下vlan 0的专用通道数量
     */
    public void setVlanZeroDirectConnectTunnelCount(Long VlanZeroDirectConnectTunnelCount) {
        this.VlanZeroDirectConnectTunnelCount = VlanZeroDirectConnectTunnelCount;
    }

    /**
     * Get 该物理专线下非vlan 0的专用通道数量 
     * @return OtherVlanDirectConnectTunnelCount 该物理专线下非vlan 0的专用通道数量
     */
    public Long getOtherVlanDirectConnectTunnelCount() {
        return this.OtherVlanDirectConnectTunnelCount;
    }

    /**
     * Set 该物理专线下非vlan 0的专用通道数量
     * @param OtherVlanDirectConnectTunnelCount 该物理专线下非vlan 0的专用通道数量
     */
    public void setOtherVlanDirectConnectTunnelCount(Long OtherVlanDirectConnectTunnelCount) {
        this.OtherVlanDirectConnectTunnelCount = OtherVlanDirectConnectTunnelCount;
    }

    /**
     * Get 物理专线最小带宽 
     * @return MinBandwidth 物理专线最小带宽
     */
    public Long getMinBandwidth() {
        return this.MinBandwidth;
    }

    /**
     * Set 物理专线最小带宽
     * @param MinBandwidth 物理专线最小带宽
     */
    public void setMinBandwidth(Long MinBandwidth) {
        this.MinBandwidth = MinBandwidth;
    }

    /**
     * Get 建设模式 
     * @return Construct 建设模式
     */
    public Long getConstruct() {
        return this.Construct;
    }

    /**
     * Set 建设模式
     * @param Construct 建设模式
     */
    public void setConstruct(Long Construct) {
        this.Construct = Construct;
    }

    /**
     * Get 物理专线的接入点名称 
     * @return AccessPointName 物理专线的接入点名称
     */
    public String getAccessPointName() {
        return this.AccessPointName;
    }

    /**
     * Set 物理专线的接入点名称
     * @param AccessPointName 物理专线的接入点名称
     */
    public void setAccessPointName(String AccessPointName) {
        this.AccessPointName = AccessPointName;
    }

    /**
     * Get 是否三层架构 
     * @return IsThreeArch 是否三层架构
     */
    public Boolean getIsThreeArch() {
        return this.IsThreeArch;
    }

    /**
     * Set 是否三层架构
     * @param IsThreeArch 是否三层架构
     */
    public void setIsThreeArch(Boolean IsThreeArch) {
        this.IsThreeArch = IsThreeArch;
    }

    public DirectConnect() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DirectConnect(DirectConnect source) {
        if (source.DirectConnectId != null) {
            this.DirectConnectId = new String(source.DirectConnectId);
        }
        if (source.DirectConnectName != null) {
            this.DirectConnectName = new String(source.DirectConnectName);
        }
        if (source.AccessPointId != null) {
            this.AccessPointId = new String(source.AccessPointId);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.EnabledTime != null) {
            this.EnabledTime = new String(source.EnabledTime);
        }
        if (source.LineOperator != null) {
            this.LineOperator = new String(source.LineOperator);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.PortType != null) {
            this.PortType = new String(source.PortType);
        }
        if (source.CircuitCode != null) {
            this.CircuitCode = new String(source.CircuitCode);
        }
        if (source.RedundantDirectConnectId != null) {
            this.RedundantDirectConnectId = new String(source.RedundantDirectConnectId);
        }
        if (source.Vlan != null) {
            this.Vlan = new Long(source.Vlan);
        }
        if (source.TencentAddress != null) {
            this.TencentAddress = new String(source.TencentAddress);
        }
        if (source.CustomerAddress != null) {
            this.CustomerAddress = new String(source.CustomerAddress);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.CustomerContactMail != null) {
            this.CustomerContactMail = new String(source.CustomerContactMail);
        }
        if (source.CustomerContactNumber != null) {
            this.CustomerContactNumber = new String(source.CustomerContactNumber);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new String(source.ExpiredTime);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
        if (source.FaultReportContactPerson != null) {
            this.FaultReportContactPerson = new String(source.FaultReportContactPerson);
        }
        if (source.FaultReportContactNumber != null) {
            this.FaultReportContactNumber = new String(source.FaultReportContactNumber);
        }
        if (source.TagSet != null) {
            this.TagSet = new Tag[source.TagSet.length];
            for (int i = 0; i < source.TagSet.length; i++) {
                this.TagSet[i] = new Tag(source.TagSet[i]);
            }
        }
        if (source.AccessPointType != null) {
            this.AccessPointType = new String(source.AccessPointType);
        }
        if (source.IdcCity != null) {
            this.IdcCity = new String(source.IdcCity);
        }
        if (source.ChargeState != null) {
            this.ChargeState = new String(source.ChargeState);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.SignLaw != null) {
            this.SignLaw = new Boolean(source.SignLaw);
        }
        if (source.LocalZone != null) {
            this.LocalZone = new Boolean(source.LocalZone);
        }
        if (source.VlanZeroDirectConnectTunnelCount != null) {
            this.VlanZeroDirectConnectTunnelCount = new Long(source.VlanZeroDirectConnectTunnelCount);
        }
        if (source.OtherVlanDirectConnectTunnelCount != null) {
            this.OtherVlanDirectConnectTunnelCount = new Long(source.OtherVlanDirectConnectTunnelCount);
        }
        if (source.MinBandwidth != null) {
            this.MinBandwidth = new Long(source.MinBandwidth);
        }
        if (source.Construct != null) {
            this.Construct = new Long(source.Construct);
        }
        if (source.AccessPointName != null) {
            this.AccessPointName = new String(source.AccessPointName);
        }
        if (source.IsThreeArch != null) {
            this.IsThreeArch = new Boolean(source.IsThreeArch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "DirectConnectName", this.DirectConnectName);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "EnabledTime", this.EnabledTime);
        this.setParamSimple(map, prefix + "LineOperator", this.LineOperator);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "PortType", this.PortType);
        this.setParamSimple(map, prefix + "CircuitCode", this.CircuitCode);
        this.setParamSimple(map, prefix + "RedundantDirectConnectId", this.RedundantDirectConnectId);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "CustomerContactMail", this.CustomerContactMail);
        this.setParamSimple(map, prefix + "CustomerContactNumber", this.CustomerContactNumber);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);
        this.setParamSimple(map, prefix + "FaultReportContactPerson", this.FaultReportContactPerson);
        this.setParamSimple(map, prefix + "FaultReportContactNumber", this.FaultReportContactNumber);
        this.setParamArrayObj(map, prefix + "TagSet.", this.TagSet);
        this.setParamSimple(map, prefix + "AccessPointType", this.AccessPointType);
        this.setParamSimple(map, prefix + "IdcCity", this.IdcCity);
        this.setParamSimple(map, prefix + "ChargeState", this.ChargeState);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "SignLaw", this.SignLaw);
        this.setParamSimple(map, prefix + "LocalZone", this.LocalZone);
        this.setParamSimple(map, prefix + "VlanZeroDirectConnectTunnelCount", this.VlanZeroDirectConnectTunnelCount);
        this.setParamSimple(map, prefix + "OtherVlanDirectConnectTunnelCount", this.OtherVlanDirectConnectTunnelCount);
        this.setParamSimple(map, prefix + "MinBandwidth", this.MinBandwidth);
        this.setParamSimple(map, prefix + "Construct", this.Construct);
        this.setParamSimple(map, prefix + "AccessPointName", this.AccessPointName);
        this.setParamSimple(map, prefix + "IsThreeArch", this.IsThreeArch);

    }
}

