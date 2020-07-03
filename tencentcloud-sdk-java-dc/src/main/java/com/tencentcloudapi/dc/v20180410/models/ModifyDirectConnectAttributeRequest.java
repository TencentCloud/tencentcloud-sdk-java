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

public class ModifyDirectConnectAttributeRequest extends AbstractModel{

    /**
    * 物理专线的ID。
    */
    @SerializedName("DirectConnectId")
    @Expose
    private String DirectConnectId;

    /**
    * 物理专线名称。
    */
    @SerializedName("DirectConnectName")
    @Expose
    private String DirectConnectName;

    /**
    * 运营商或者服务商为物理专线提供的电路编码。
    */
    @SerializedName("CircuitCode")
    @Expose
    private String CircuitCode;

    /**
    * 物理专线调试VLAN。
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * 物理专线调试腾讯侧互联 IP。
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * 物理专线调试用户侧互联 IP。
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
     * Get 物理专线的ID。 
     * @return DirectConnectId 物理专线的ID。
     */
    public String getDirectConnectId() {
        return this.DirectConnectId;
    }

    /**
     * Set 物理专线的ID。
     * @param DirectConnectId 物理专线的ID。
     */
    public void setDirectConnectId(String DirectConnectId) {
        this.DirectConnectId = DirectConnectId;
    }

    /**
     * Get 物理专线名称。 
     * @return DirectConnectName 物理专线名称。
     */
    public String getDirectConnectName() {
        return this.DirectConnectName;
    }

    /**
     * Set 物理专线名称。
     * @param DirectConnectName 物理专线名称。
     */
    public void setDirectConnectName(String DirectConnectName) {
        this.DirectConnectName = DirectConnectName;
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
     * Get 物理专线调试VLAN。 
     * @return Vlan 物理专线调试VLAN。
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set 物理专线调试VLAN。
     * @param Vlan 物理专线调试VLAN。
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get 物理专线调试腾讯侧互联 IP。 
     * @return TencentAddress 物理专线调试腾讯侧互联 IP。
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set 物理专线调试腾讯侧互联 IP。
     * @param TencentAddress 物理专线调试腾讯侧互联 IP。
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get 物理专线调试用户侧互联 IP。 
     * @return CustomerAddress 物理专线调试用户侧互联 IP。
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set 物理专线调试用户侧互联 IP。
     * @param CustomerAddress 物理专线调试用户侧互联 IP。
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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectId", this.DirectConnectId);
        this.setParamSimple(map, prefix + "DirectConnectName", this.DirectConnectName);
        this.setParamSimple(map, prefix + "CircuitCode", this.CircuitCode);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "CustomerContactMail", this.CustomerContactMail);
        this.setParamSimple(map, prefix + "CustomerContactNumber", this.CustomerContactNumber);
        this.setParamSimple(map, prefix + "FaultReportContactPerson", this.FaultReportContactPerson);
        this.setParamSimple(map, prefix + "FaultReportContactNumber", this.FaultReportContactNumber);

    }
}

