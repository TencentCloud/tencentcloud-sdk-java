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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDirectConnectRequest extends AbstractModel {

    /**
    * <p>物理专线的名称。</p>
    */
    @SerializedName("DirectConnectName")
    @Expose
    private String DirectConnectName;

    /**
    * <p>物理专线所在的接入点。<br>您可以通过调用<a href="https://cloud.tencent.com/document/product/216/34827">DescribeAccessPoints</a>接口获取接入点ID。</p>
    */
    @SerializedName("AccessPointId")
    @Expose
    private String AccessPointId;

    /**
    * <p>提供接入物理专线的运营商。<br>ChinaTelecom：中国电信；<br>ChinaMobile：中国移动；<br>ChinaUnicom：中国联通；<br> In-houseWiring：楼内线；<br>ChinaOther：中国其他；<br> InternationalOperator：境外其他。</p>
    */
    @SerializedName("LineOperator")
    @Expose
    private String LineOperator;

    /**
    * <p>物理专线接入端口类型，取值：<br>100Base-T：百兆电口；<br>1000Base-T（默认值）：千兆电口；<br>1000Base-LX：千兆单模光口（10千米）；<br>10GBase-T：万兆电口；<br>10GBase-LR（默认值）：万兆单模光口（10千米）。</p>
    */
    @SerializedName("PortType")
    @Expose
    private String PortType;

    /**
    * <p>运营商或者服务商为物理专线提供的电路编码。</p>
    */
    @SerializedName("CircuitCode")
    @Expose
    private String CircuitCode;

    /**
    * <p>本地数据中心的地理位置。</p>
    */
    @SerializedName("Location")
    @Expose
    private String Location;

    /**
    * <p>物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。</p>
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * <p>冗余物理专线的ID。</p>
    */
    @SerializedName("RedundantDirectConnectId")
    @Expose
    private String RedundantDirectConnectId;

    /**
    * <p>物理专线调试VLAN。默认开启VLAN，自动分配VLAN。</p>
    */
    @SerializedName("Vlan")
    @Expose
    private Long Vlan;

    /**
    * <p>物理专线调试腾讯侧互联 IP。默认自动分配。</p>
    */
    @SerializedName("TencentAddress")
    @Expose
    private String TencentAddress;

    /**
    * <p>物理专线调试用户侧互联 IP。默认自动分配。</p>
    */
    @SerializedName("CustomerAddress")
    @Expose
    private String CustomerAddress;

    /**
    * <p>物理专线申请者姓名。默认从账户体系获取。</p>
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * <p>物理专线申请者联系邮箱。默认从账户体系获取。</p>
    */
    @SerializedName("CustomerContactMail")
    @Expose
    private String CustomerContactMail;

    /**
    * <p>物理专线申请者联系号码。默认从账户体系获取。</p>
    */
    @SerializedName("CustomerContactNumber")
    @Expose
    private String CustomerContactNumber;

    /**
    * <p>报障联系人。</p>
    */
    @SerializedName("FaultReportContactPerson")
    @Expose
    private String FaultReportContactPerson;

    /**
    * <p>报障联系电话。</p>
    */
    @SerializedName("FaultReportContactNumber")
    @Expose
    private String FaultReportContactNumber;

    /**
    * <p>报障联系邮箱。</p>
    */
    @SerializedName("FaultReportContactEmail")
    @Expose
    private String FaultReportContactEmail;

    /**
    * <p>物理专线申请者是否签署了用户使用协议。默认已签署。</p>
    */
    @SerializedName("SignLaw")
    @Expose
    private Boolean SignLaw;

    /**
    * <p>标签键值对</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>是否MACsec需求</p>
    */
    @SerializedName("IsMacSec")
    @Expose
    private Boolean IsMacSec;

    /**
     * Get <p>物理专线的名称。</p> 
     * @return DirectConnectName <p>物理专线的名称。</p>
     */
    public String getDirectConnectName() {
        return this.DirectConnectName;
    }

    /**
     * Set <p>物理专线的名称。</p>
     * @param DirectConnectName <p>物理专线的名称。</p>
     */
    public void setDirectConnectName(String DirectConnectName) {
        this.DirectConnectName = DirectConnectName;
    }

    /**
     * Get <p>物理专线所在的接入点。<br>您可以通过调用<a href="https://cloud.tencent.com/document/product/216/34827">DescribeAccessPoints</a>接口获取接入点ID。</p> 
     * @return AccessPointId <p>物理专线所在的接入点。<br>您可以通过调用<a href="https://cloud.tencent.com/document/product/216/34827">DescribeAccessPoints</a>接口获取接入点ID。</p>
     */
    public String getAccessPointId() {
        return this.AccessPointId;
    }

    /**
     * Set <p>物理专线所在的接入点。<br>您可以通过调用<a href="https://cloud.tencent.com/document/product/216/34827">DescribeAccessPoints</a>接口获取接入点ID。</p>
     * @param AccessPointId <p>物理专线所在的接入点。<br>您可以通过调用<a href="https://cloud.tencent.com/document/product/216/34827">DescribeAccessPoints</a>接口获取接入点ID。</p>
     */
    public void setAccessPointId(String AccessPointId) {
        this.AccessPointId = AccessPointId;
    }

    /**
     * Get <p>提供接入物理专线的运营商。<br>ChinaTelecom：中国电信；<br>ChinaMobile：中国移动；<br>ChinaUnicom：中国联通；<br> In-houseWiring：楼内线；<br>ChinaOther：中国其他；<br> InternationalOperator：境外其他。</p> 
     * @return LineOperator <p>提供接入物理专线的运营商。<br>ChinaTelecom：中国电信；<br>ChinaMobile：中国移动；<br>ChinaUnicom：中国联通；<br> In-houseWiring：楼内线；<br>ChinaOther：中国其他；<br> InternationalOperator：境外其他。</p>
     */
    public String getLineOperator() {
        return this.LineOperator;
    }

    /**
     * Set <p>提供接入物理专线的运营商。<br>ChinaTelecom：中国电信；<br>ChinaMobile：中国移动；<br>ChinaUnicom：中国联通；<br> In-houseWiring：楼内线；<br>ChinaOther：中国其他；<br> InternationalOperator：境外其他。</p>
     * @param LineOperator <p>提供接入物理专线的运营商。<br>ChinaTelecom：中国电信；<br>ChinaMobile：中国移动；<br>ChinaUnicom：中国联通；<br> In-houseWiring：楼内线；<br>ChinaOther：中国其他；<br> InternationalOperator：境外其他。</p>
     */
    public void setLineOperator(String LineOperator) {
        this.LineOperator = LineOperator;
    }

    /**
     * Get <p>物理专线接入端口类型，取值：<br>100Base-T：百兆电口；<br>1000Base-T（默认值）：千兆电口；<br>1000Base-LX：千兆单模光口（10千米）；<br>10GBase-T：万兆电口；<br>10GBase-LR（默认值）：万兆单模光口（10千米）。</p> 
     * @return PortType <p>物理专线接入端口类型，取值：<br>100Base-T：百兆电口；<br>1000Base-T（默认值）：千兆电口；<br>1000Base-LX：千兆单模光口（10千米）；<br>10GBase-T：万兆电口；<br>10GBase-LR（默认值）：万兆单模光口（10千米）。</p>
     */
    public String getPortType() {
        return this.PortType;
    }

    /**
     * Set <p>物理专线接入端口类型，取值：<br>100Base-T：百兆电口；<br>1000Base-T（默认值）：千兆电口；<br>1000Base-LX：千兆单模光口（10千米）；<br>10GBase-T：万兆电口；<br>10GBase-LR（默认值）：万兆单模光口（10千米）。</p>
     * @param PortType <p>物理专线接入端口类型，取值：<br>100Base-T：百兆电口；<br>1000Base-T（默认值）：千兆电口；<br>1000Base-LX：千兆单模光口（10千米）；<br>10GBase-T：万兆电口；<br>10GBase-LR（默认值）：万兆单模光口（10千米）。</p>
     */
    public void setPortType(String PortType) {
        this.PortType = PortType;
    }

    /**
     * Get <p>运营商或者服务商为物理专线提供的电路编码。</p> 
     * @return CircuitCode <p>运营商或者服务商为物理专线提供的电路编码。</p>
     */
    public String getCircuitCode() {
        return this.CircuitCode;
    }

    /**
     * Set <p>运营商或者服务商为物理专线提供的电路编码。</p>
     * @param CircuitCode <p>运营商或者服务商为物理专线提供的电路编码。</p>
     */
    public void setCircuitCode(String CircuitCode) {
        this.CircuitCode = CircuitCode;
    }

    /**
     * Get <p>本地数据中心的地理位置。</p> 
     * @return Location <p>本地数据中心的地理位置。</p>
     */
    public String getLocation() {
        return this.Location;
    }

    /**
     * Set <p>本地数据中心的地理位置。</p>
     * @param Location <p>本地数据中心的地理位置。</p>
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }

    /**
     * Get <p>物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。</p> 
     * @return Bandwidth <p>物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。</p>
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set <p>物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。</p>
     * @param Bandwidth <p>物理专线接入接口带宽，单位为Mbps，默认值为1000，取值范围为 [2, 10240]。</p>
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get <p>冗余物理专线的ID。</p> 
     * @return RedundantDirectConnectId <p>冗余物理专线的ID。</p>
     */
    public String getRedundantDirectConnectId() {
        return this.RedundantDirectConnectId;
    }

    /**
     * Set <p>冗余物理专线的ID。</p>
     * @param RedundantDirectConnectId <p>冗余物理专线的ID。</p>
     */
    public void setRedundantDirectConnectId(String RedundantDirectConnectId) {
        this.RedundantDirectConnectId = RedundantDirectConnectId;
    }

    /**
     * Get <p>物理专线调试VLAN。默认开启VLAN，自动分配VLAN。</p> 
     * @return Vlan <p>物理专线调试VLAN。默认开启VLAN，自动分配VLAN。</p>
     */
    public Long getVlan() {
        return this.Vlan;
    }

    /**
     * Set <p>物理专线调试VLAN。默认开启VLAN，自动分配VLAN。</p>
     * @param Vlan <p>物理专线调试VLAN。默认开启VLAN，自动分配VLAN。</p>
     */
    public void setVlan(Long Vlan) {
        this.Vlan = Vlan;
    }

    /**
     * Get <p>物理专线调试腾讯侧互联 IP。默认自动分配。</p> 
     * @return TencentAddress <p>物理专线调试腾讯侧互联 IP。默认自动分配。</p>
     */
    public String getTencentAddress() {
        return this.TencentAddress;
    }

    /**
     * Set <p>物理专线调试腾讯侧互联 IP。默认自动分配。</p>
     * @param TencentAddress <p>物理专线调试腾讯侧互联 IP。默认自动分配。</p>
     */
    public void setTencentAddress(String TencentAddress) {
        this.TencentAddress = TencentAddress;
    }

    /**
     * Get <p>物理专线调试用户侧互联 IP。默认自动分配。</p> 
     * @return CustomerAddress <p>物理专线调试用户侧互联 IP。默认自动分配。</p>
     */
    public String getCustomerAddress() {
        return this.CustomerAddress;
    }

    /**
     * Set <p>物理专线调试用户侧互联 IP。默认自动分配。</p>
     * @param CustomerAddress <p>物理专线调试用户侧互联 IP。默认自动分配。</p>
     */
    public void setCustomerAddress(String CustomerAddress) {
        this.CustomerAddress = CustomerAddress;
    }

    /**
     * Get <p>物理专线申请者姓名。默认从账户体系获取。</p> 
     * @return CustomerName <p>物理专线申请者姓名。默认从账户体系获取。</p>
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set <p>物理专线申请者姓名。默认从账户体系获取。</p>
     * @param CustomerName <p>物理专线申请者姓名。默认从账户体系获取。</p>
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get <p>物理专线申请者联系邮箱。默认从账户体系获取。</p> 
     * @return CustomerContactMail <p>物理专线申请者联系邮箱。默认从账户体系获取。</p>
     */
    public String getCustomerContactMail() {
        return this.CustomerContactMail;
    }

    /**
     * Set <p>物理专线申请者联系邮箱。默认从账户体系获取。</p>
     * @param CustomerContactMail <p>物理专线申请者联系邮箱。默认从账户体系获取。</p>
     */
    public void setCustomerContactMail(String CustomerContactMail) {
        this.CustomerContactMail = CustomerContactMail;
    }

    /**
     * Get <p>物理专线申请者联系号码。默认从账户体系获取。</p> 
     * @return CustomerContactNumber <p>物理专线申请者联系号码。默认从账户体系获取。</p>
     */
    public String getCustomerContactNumber() {
        return this.CustomerContactNumber;
    }

    /**
     * Set <p>物理专线申请者联系号码。默认从账户体系获取。</p>
     * @param CustomerContactNumber <p>物理专线申请者联系号码。默认从账户体系获取。</p>
     */
    public void setCustomerContactNumber(String CustomerContactNumber) {
        this.CustomerContactNumber = CustomerContactNumber;
    }

    /**
     * Get <p>报障联系人。</p> 
     * @return FaultReportContactPerson <p>报障联系人。</p>
     */
    public String getFaultReportContactPerson() {
        return this.FaultReportContactPerson;
    }

    /**
     * Set <p>报障联系人。</p>
     * @param FaultReportContactPerson <p>报障联系人。</p>
     */
    public void setFaultReportContactPerson(String FaultReportContactPerson) {
        this.FaultReportContactPerson = FaultReportContactPerson;
    }

    /**
     * Get <p>报障联系电话。</p> 
     * @return FaultReportContactNumber <p>报障联系电话。</p>
     */
    public String getFaultReportContactNumber() {
        return this.FaultReportContactNumber;
    }

    /**
     * Set <p>报障联系电话。</p>
     * @param FaultReportContactNumber <p>报障联系电话。</p>
     */
    public void setFaultReportContactNumber(String FaultReportContactNumber) {
        this.FaultReportContactNumber = FaultReportContactNumber;
    }

    /**
     * Get <p>报障联系邮箱。</p> 
     * @return FaultReportContactEmail <p>报障联系邮箱。</p>
     */
    public String getFaultReportContactEmail() {
        return this.FaultReportContactEmail;
    }

    /**
     * Set <p>报障联系邮箱。</p>
     * @param FaultReportContactEmail <p>报障联系邮箱。</p>
     */
    public void setFaultReportContactEmail(String FaultReportContactEmail) {
        this.FaultReportContactEmail = FaultReportContactEmail;
    }

    /**
     * Get <p>物理专线申请者是否签署了用户使用协议。默认已签署。</p> 
     * @return SignLaw <p>物理专线申请者是否签署了用户使用协议。默认已签署。</p>
     */
    public Boolean getSignLaw() {
        return this.SignLaw;
    }

    /**
     * Set <p>物理专线申请者是否签署了用户使用协议。默认已签署。</p>
     * @param SignLaw <p>物理专线申请者是否签署了用户使用协议。默认已签署。</p>
     */
    public void setSignLaw(Boolean SignLaw) {
        this.SignLaw = SignLaw;
    }

    /**
     * Get <p>标签键值对</p> 
     * @return Tags <p>标签键值对</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签键值对</p>
     * @param Tags <p>标签键值对</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>是否MACsec需求</p> 
     * @return IsMacSec <p>是否MACsec需求</p>
     */
    public Boolean getIsMacSec() {
        return this.IsMacSec;
    }

    /**
     * Set <p>是否MACsec需求</p>
     * @param IsMacSec <p>是否MACsec需求</p>
     */
    public void setIsMacSec(Boolean IsMacSec) {
        this.IsMacSec = IsMacSec;
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
        if (source.FaultReportContactEmail != null) {
            this.FaultReportContactEmail = new String(source.FaultReportContactEmail);
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
        if (source.IsMacSec != null) {
            this.IsMacSec = new Boolean(source.IsMacSec);
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
        this.setParamSimple(map, prefix + "FaultReportContactEmail", this.FaultReportContactEmail);
        this.setParamSimple(map, prefix + "SignLaw", this.SignLaw);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "IsMacSec", this.IsMacSec);

    }
}

