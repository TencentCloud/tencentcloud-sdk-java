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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DirectConnect extends AbstractModel{

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
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * 物理专线调试腾讯侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * 物理专线调试用户侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * 物理专线申请者姓名。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 物理专线申请者联系邮箱。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomerContactMail")
    @Expose
    private String CustomerContactMail;

    /**
    * 物理专线申请者联系号码。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomerContactNumber")
    @Expose
    private String CustomerContactNumber;

    /**
    * 物理专线的过期时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private String ExpiredTime;

    /**
    * 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
    * 报障联系人。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaultReportContactPerson")
    @Expose
    private String FaultReportContactPerson;

    /**
    * 报障联系电话。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FaultReportContactNumber")
    @Expose
    private String FaultReportContactNumber;

    /**
    * 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IdcCity")
    @Expose
    private String IdcCity;

    /**
    * 计费状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChargeState")
    @Expose
    private String ChargeState;

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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CircuitCode 运营商或者服务商为物理专线提供的电路编码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCircuitCode() {
        return this.CircuitCode;
    }

    /**
     * Set 运营商或者服务商为物理专线提供的电路编码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CircuitCode 运营商或者服务商为物理专线提供的电路编码。
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vlan 物理专线调试VLAN。默认开启VLAN，自动分配VLAN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set 物理专线调试VLAN。默认开启VLAN，自动分配VLAN。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vlan 物理专线调试VLAN。默认开启VLAN，自动分配VLAN。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get 物理专线调试腾讯侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TencentAddress 物理专线调试腾讯侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set 物理专线调试腾讯侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TencentAddress 物理专线调试腾讯侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get 物理专线调试用户侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomerAddress 物理专线调试用户侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set 物理专线调试用户侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomerAddress 物理专线调试用户侧互联IP。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get 物理专线申请者姓名。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomerName 物理专线申请者姓名。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 物理专线申请者姓名。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomerName 物理专线申请者姓名。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 物理专线申请者联系邮箱。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomerContactMail 物理专线申请者联系邮箱。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomerContactMail() {
        return this.CustomerContactMail;
    }

    /**
     * Set 物理专线申请者联系邮箱。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomerContactMail 物理专线申请者联系邮箱。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomerContactMail(String CustomerContactMail) {
        this.CustomerContactMail = CustomerContactMail;
    }

    /**
     * Get 物理专线申请者联系号码。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomerContactNumber 物理专线申请者联系号码。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCustomerContactNumber() {
        return this.CustomerContactNumber;
    }

    /**
     * Set 物理专线申请者联系号码。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomerContactNumber 物理专线申请者联系号码。默认从账户体系获取。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomerContactNumber(String CustomerContactNumber) {
        this.CustomerContactNumber = CustomerContactNumber;
    }

    /**
     * Get 物理专线的过期时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 物理专线的过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 物理专线的过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 物理专线的过期时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(String ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeType 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeType 物理专线计费类型。 NON_RECURRING_CHARGE：一次性接入费用；PREPAID_BY_YEAR：按年预付费。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    /**
     * Get 报障联系人。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaultReportContactPerson 报障联系人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaultReportContactPerson() {
        return this.FaultReportContactPerson;
    }

    /**
     * Set 报障联系人。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaultReportContactPerson 报障联系人。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaultReportContactPerson(String FaultReportContactPerson) {
        this.FaultReportContactPerson = FaultReportContactPerson;
    }

    /**
     * Get 报障联系电话。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FaultReportContactNumber 报障联系电话。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFaultReportContactNumber() {
        return this.FaultReportContactNumber;
    }

    /**
     * Set 报障联系电话。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FaultReportContactNumber 报障联系电话。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFaultReportContactNumber(String FaultReportContactNumber) {
        this.FaultReportContactNumber = FaultReportContactNumber;
    }

    /**
     * Get 标签键值对
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TagSet 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTagSet() {
        return this.TagSet;
    }

    /**
     * Set 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
     * @param TagSet 标签键值对
注意：此字段可能返回 null，表示取不到有效值。
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
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IdcCity IDC所在城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIdcCity() {
        return this.IdcCity;
    }

    /**
     * Set IDC所在城市
注意：此字段可能返回 null，表示取不到有效值。
     * @param IdcCity IDC所在城市
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIdcCity(String IdcCity) {
        this.IdcCity = IdcCity;
    }

    /**
     * Get 计费状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChargeState 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChargeState() {
        return this.ChargeState;
    }

    /**
     * Set 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChargeState 计费状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChargeState(String ChargeState) {
        this.ChargeState = ChargeState;
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

    }
}

