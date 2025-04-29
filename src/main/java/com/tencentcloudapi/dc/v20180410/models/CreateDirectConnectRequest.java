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

public class CreateDirectConnectRequest extends AbstractModel {

    /**
    * 物理专线的名称。
    */
    @SerializedName("DirectConnectName")
    @Expose
    private String DirectConnectName;

    /**
    * 物理专线所在的接入点。
您可以通过调用[DescribeAccessPoints](https://cloud.tencent.com/document/product/216/34827)接口获取接入点ID。
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * 提供接入物理专线的运营商。
ChinaTelecom：中国电信； 
ChinaMobile：中国移动；
ChinaUnicom：中国联通；
 In-houseWiring：楼内线；
ChinaOther：中国其他；
 InternationalOperator：境外其他。
    */
    @SerializedName("LineOperator")
    @Expose
    private String LineOperator;

    /**
    * 物理专线接入端口类型，取值：
100Base-T：百兆电口；
1000Base-T（默认值）：千兆电口；
1000Base-LX：千兆单模光口（10千米）；
10GBase-T：万兆电口；
10GBase-LR（默认值）：万兆单模光口（10千米）。
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
    * 本地数据中心的地理位置。
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * 物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

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
    * 物理专线调试腾讯侧互联 IP。默认自动分配。
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * 物理专线调试用户侧互联 IP。默认自动分配。
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
    * 物理专线申请者是否签署了用户使用协议。默认已签署。
    */
    @SerializedName("SignLaw")
    @Expose
    private Boolean SignLaw;

    /**
    * 标签键值对
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

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
     * Get 物理专线所在的接入点。
您可以通过调用[DescribeAccessPoints](https://cloud.tencent.com/document/product/216/34827)接口获取接入点ID。 
     * @return AccessPointId 物理专线所在的接入点。
您可以通过调用[DescribeAccessPoints](https://cloud.tencent.com/document/product/216/34827)接口获取接入点ID。
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set 物理专线所在的接入点。
您可以通过调用[DescribeAccessPoints](https://cloud.tencent.com/document/product/216/34827)接口获取接入点ID。
     * @param AccessPointId 物理专线所在的接入点。
您可以通过调用[DescribeAccessPoints](https://cloud.tencent.com/document/product/216/34827)接口获取接入点ID。
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get 提供接入物理专线的运营商。
ChinaTelecom：中国电信； 
ChinaMobile：中国移动；
ChinaUnicom：中国联通；
 In-houseWiring：楼内线；
ChinaOther：中国其他；
 InternationalOperator：境外其他。 
     * @return LineOperator 提供接入物理专线的运营商。
ChinaTelecom：中国电信； 
ChinaMobile：中国移动；
ChinaUnicom：中国联通；
 In-houseWiring：楼内线；
ChinaOther：中国其他；
 InternationalOperator：境外其他。
     */
    public String getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set 提供接入物理专线的运营商。
ChinaTelecom：中国电信； 
ChinaMobile：中国移动；
ChinaUnicom：中国联通；
 In-houseWiring：楼内线；
ChinaOther：中国其他；
 InternationalOperator：境外其他。
     * @param LineOperator 提供接入物理专线的运营商。
ChinaTelecom：中国电信； 
ChinaMobile：中国移动；
ChinaUnicom：中国联通；
 In-houseWiring：楼内线；
ChinaOther：中国其他；
 InternationalOperator：境外其他。
     */
    public void setLineOperator(String LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get 物理专线接入端口类型，取值：
100Base-T：百兆电口；
1000Base-T（默认值）：千兆电口；
1000Base-LX：千兆单模光口（10千米）；
10GBase-T：万兆电口；
10GBase-LR（默认值）：万兆单模光口（10千米）。 
     * @return PortType 物理专线接入端口类型，取值：
100Base-T：百兆电口；
1000Base-T（默认值）：千兆电口；
1000Base-LX：千兆单模光口（10千米）；
10GBase-T：万兆电口；
10GBase-LR（默认值）：万兆单模光口（10千米）。
     */
    public String getPortType() {
        return this.PortType;
    }

    /**
     * Set 物理专线接入端口类型，取值：
100Base-T：百兆电口；
1000Base-T（默认值）：千兆电口；
1000Base-LX：千兆单模光口（10千米）；
10GBase-T：万兆电口；
10GBase-LR（默认值）：万兆单模光口（10千米）。
     * @param PortType 物理专线接入端口类型，取值：
100Base-T：百兆电口；
1000Base-T（默认值）：千兆电口；
1000Base-LX：千兆单模光口（10千米）；
10GBase-T：万兆电口；
10GBase-LR（默认值）：万兆单模光口（10千米）。
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
     * Get 物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。 
     * @return Bandwidth 物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。
     * @param Bandwidth 物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
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
     * Get 物理专线调试腾讯侧互联 IP。默认自动分配。 
     * @return TencentAddress 物理专线调试腾讯侧互联 IP。默认自动分配。
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set 物理专线调试腾讯侧互联 IP。默认自动分配。
     * @param TencentAddress 物理专线调试腾讯侧互联 IP。默认自动分配。
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get 物理专线调试用户侧互联 IP。默认自动分配。 
     * @return CustomerAddress 物理专线调试用户侧互联 IP。默认自动分配。
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set 物理专线调试用户侧互联 IP。默认自动分配。
     * @param CustomerAddress 物理专线调试用户侧互联 IP。默认自动分配。
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
     * Get 物理专线申请者是否签署了用户使用协议。默认已签署。 
     * @return SignLaw 物理专线申请者是否签署了用户使用协议。默认已签署。
     */
    public Boolean getSignLaw() {
        return this.SignLaw;
    }

    /**
     * Set 物理专线申请者是否签署了用户使用协议。默认已签署。
     * @param SignLaw 物理专线申请者是否签署了用户使用协议。默认已签署。
     */
    public void setSignLaw(Boolean SignLaw) {
        this.SignLaw = SignLaw;
    }

    /**
     * Get 标签键值对 
     * @return Tags 标签键值对
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签键值对
     * @param Tags 标签键值对
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    public CreateDirectConnectRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDirectConnectRequest(CreateDirectConnectRequest source) {
        if (source.DirectConnectName != null) {
            this.DirectConnectName = new String(source.DirectConnectName);
        }
        if (source.AccessPointId != null) {
            this.AccessPointId = new String(source.AccessPointId);
        }
        if (source.LineOperator != null) {
            this.LineOperator = new String(source.LineOperator);
        }
        if (source.PortType != null) {
            this.PortType = new String(source.PortType);
        }
        if (source.CircuitCode != null) {
            this.CircuitCode = new String(source.CircuitCode);
        }
        if (source.Location != null) {
            this.Location = new String(source.Location);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
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
        if (source.FaultReportContactPerson != null) {
            this.FaultReportContactPerson = new String(source.FaultReportContactPerson);
        }
        if (source.FaultReportContactNumber != null) {
            this.FaultReportContactNumber = new String(source.FaultReportContactNumber);
        }
        if (source.SignLaw != null) {
            this.SignLaw = new Boolean(source.SignLaw);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectConnectName", this.DirectConnectName);
        this.setParamSimple(map, prefix + "AccessPointId", this.AccessPointId);
        this.setParamSimple(map, prefix + "LineOperator", this.LineOperator);
        this.setParamSimple(map, prefix + "PortType", this.PortType);
        this.setParamSimple(map, prefix + "CircuitCode", this.CircuitCode);
        this.setParamSimple(map, prefix + "Location", this.Location);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "RedundantDirectConnectId", this.RedundantDirectConnectId);
        this.setParamSimple(map, prefix + "Vlan", this.Vlan);
        this.setParamSimple(map, prefix + "TencentAddress", this.TencentAddress);
        this.setParamSimple(map, prefix + "CustomerAddress", this.CustomerAddress);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "CustomerContactMail", this.CustomerContactMail);
        this.setParamSimple(map, prefix + "CustomerContactNumber", this.CustomerContactNumber);
        this.setParamSimple(map, prefix + "FaultReportContactPerson", this.FaultReportContactPerson);
        this.setParamSimple(map, prefix + "FaultReportContactNumber", this.FaultReportContactNumber);
        this.setParamSimple(map, prefix + "SignLaw", this.SignLaw);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

