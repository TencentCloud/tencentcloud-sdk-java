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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateVpnGatewayRequest extends AbstractModel {

    /**
    * <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>。接口返回值中的VpcId获取</p><p>入参限制：当Type为CCN/SSL_CCN 类型时传 &quot;&quot;，IPSEC/SSL 类型必须传对应VPC实例ID。</p>
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * <p>VPN网关名称，最大长度不能超过60个字节。</p>
    */
    @SerializedName("VpnGatewayName")
    @Expose
    private String VpnGatewayName;

    /**
    * <p>公网带宽设置。可选带宽规格：5, 10, 20, 50, 100, 200, 500, 1000, 3000；单位：Mbps。</p>
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * <p>VPN网关计费模式，PREPAID：表示预付费，即包年包月，POSTPAID_BY_HOUR：表示后付费，即按量计费。默认：POSTPAID_BY_HOUR，如果指定预付费模式，参数InstanceChargePrepaid必填。</p>
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
    */
    @SerializedName("InstanceChargePrepaid")
    @Expose
    private InstanceChargePrepaid InstanceChargePrepaid;

    /**
    * <p>可用区，如：ap-guangzhou-2。</p>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * <p>VPN网关类型，默认为IPSEC。值“IPSEC”为VPC型IPSEC VPN网关，值“SSL”为VPC型SSL VPN网关，值“CCN”为云联网型IPSEC VPN网关，值“SSL_CCN”为云联网型SSL VPN网关。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * <p>CDC实例ID。</p>
    */
    @SerializedName("CdcId")
    @Expose
    private String CdcId;

    /**
    * <p>SSL VPN连接数设置，可选规格：5, 10, 20, 50, 100, 200, 500, 1000；</p><p>单位：个</p><p>默认值：5</p><p>仅 SSL / SSL_CCN 类型需要填这个参数。</p>
    */
    @SerializedName("MaxConnection")
    @Expose
    private Long MaxConnection;

    /**
    * <p>BGP ASN。</p>
    */
    @SerializedName("BgpAsn")
    @Expose
    private Long BgpAsn;

    /**
     * Get <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>。接口返回值中的VpcId获取</p><p>入参限制：当Type为CCN/SSL_CCN 类型时传 &quot;&quot;，IPSEC/SSL 类型必须传对应VPC实例ID。</p> 
     * @return VpcId <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>。接口返回值中的VpcId获取</p><p>入参限制：当Type为CCN/SSL_CCN 类型时传 &quot;&quot;，IPSEC/SSL 类型必须传对应VPC实例ID。</p>
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>。接口返回值中的VpcId获取</p><p>入参限制：当Type为CCN/SSL_CCN 类型时传 &quot;&quot;，IPSEC/SSL 类型必须传对应VPC实例ID。</p>
     * @param VpcId <p>VPC实例ID。可通过<a href="https://cloud.tencent.com/document/product/215/15778">DescribeVpcs</a>。接口返回值中的VpcId获取</p><p>入参限制：当Type为CCN/SSL_CCN 类型时传 &quot;&quot;，IPSEC/SSL 类型必须传对应VPC实例ID。</p>
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get <p>VPN网关名称，最大长度不能超过60个字节。</p> 
     * @return VpnGatewayName <p>VPN网关名称，最大长度不能超过60个字节。</p>
     */
    public String getVpnGatewayName() {
        return this.VpnGatewayName;
    }

    /**
     * Set <p>VPN网关名称，最大长度不能超过60个字节。</p>
     * @param VpnGatewayName <p>VPN网关名称，最大长度不能超过60个字节。</p>
     */
    public void setVpnGatewayName(String VpnGatewayName) {
        this.VpnGatewayName = VpnGatewayName;
    }

    /**
     * Get <p>公网带宽设置。可选带宽规格：5, 10, 20, 50, 100, 200, 500, 1000, 3000；单位：Mbps。</p> 
     * @return InternetMaxBandwidthOut <p>公网带宽设置。可选带宽规格：5, 10, 20, 50, 100, 200, 500, 1000, 3000；单位：Mbps。</p>
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set <p>公网带宽设置。可选带宽规格：5, 10, 20, 50, 100, 200, 500, 1000, 3000；单位：Mbps。</p>
     * @param InternetMaxBandwidthOut <p>公网带宽设置。可选带宽规格：5, 10, 20, 50, 100, 200, 500, 1000, 3000；单位：Mbps。</p>
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get <p>VPN网关计费模式，PREPAID：表示预付费，即包年包月，POSTPAID_BY_HOUR：表示后付费，即按量计费。默认：POSTPAID_BY_HOUR，如果指定预付费模式，参数InstanceChargePrepaid必填。</p> 
     * @return InstanceChargeType <p>VPN网关计费模式，PREPAID：表示预付费，即包年包月，POSTPAID_BY_HOUR：表示后付费，即按量计费。默认：POSTPAID_BY_HOUR，如果指定预付费模式，参数InstanceChargePrepaid必填。</p>
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * Set <p>VPN网关计费模式，PREPAID：表示预付费，即包年包月，POSTPAID_BY_HOUR：表示后付费，即按量计费。默认：POSTPAID_BY_HOUR，如果指定预付费模式，参数InstanceChargePrepaid必填。</p>
     * @param InstanceChargeType <p>VPN网关计费模式，PREPAID：表示预付费，即包年包月，POSTPAID_BY_HOUR：表示后付费，即按量计费。默认：POSTPAID_BY_HOUR，如果指定预付费模式，参数InstanceChargePrepaid必填。</p>
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * Get <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p> 
     * @return InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public InstanceChargePrepaid getInstanceChargePrepaid() {
        return this.InstanceChargePrepaid;
    }

    /**
     * Set <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     * @param InstanceChargePrepaid <p>预付费模式，即包年包月相关参数设置。通过该参数可以指定包年包月实例的购买时长、是否设置自动续费等属性。若指定实例的付费模式为预付费则该参数必传。</p>
     */
    public void setInstanceChargePrepaid(InstanceChargePrepaid InstanceChargePrepaid) {
        this.InstanceChargePrepaid = InstanceChargePrepaid;
    }

    /**
     * Get <p>可用区，如：ap-guangzhou-2。</p> 
     * @return Zone <p>可用区，如：ap-guangzhou-2。</p>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set <p>可用区，如：ap-guangzhou-2。</p>
     * @param Zone <p>可用区，如：ap-guangzhou-2。</p>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get <p>VPN网关类型，默认为IPSEC。值“IPSEC”为VPC型IPSEC VPN网关，值“SSL”为VPC型SSL VPN网关，值“CCN”为云联网型IPSEC VPN网关，值“SSL_CCN”为云联网型SSL VPN网关。</p> 
     * @return Type <p>VPN网关类型，默认为IPSEC。值“IPSEC”为VPC型IPSEC VPN网关，值“SSL”为VPC型SSL VPN网关，值“CCN”为云联网型IPSEC VPN网关，值“SSL_CCN”为云联网型SSL VPN网关。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>VPN网关类型，默认为IPSEC。值“IPSEC”为VPC型IPSEC VPN网关，值“SSL”为VPC型SSL VPN网关，值“CCN”为云联网型IPSEC VPN网关，值“SSL_CCN”为云联网型SSL VPN网关。</p>
     * @param Type <p>VPN网关类型，默认为IPSEC。值“IPSEC”为VPC型IPSEC VPN网关，值“SSL”为VPC型SSL VPN网关，值“CCN”为云联网型IPSEC VPN网关，值“SSL_CCN”为云联网型SSL VPN网关。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p> 
     * @return Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     * @param Tags <p>指定绑定的标签列表，例如：[{&quot;Key&quot;: &quot;city&quot;, &quot;Value&quot;: &quot;shanghai&quot;}]。</p>
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>CDC实例ID。</p> 
     * @return CdcId <p>CDC实例ID。</p>
     */
    public String getCdcId() {
        return this.CdcId;
    }

    /**
     * Set <p>CDC实例ID。</p>
     * @param CdcId <p>CDC实例ID。</p>
     */
    public void setCdcId(String CdcId) {
        this.CdcId = CdcId;
    }

    /**
     * Get <p>SSL VPN连接数设置，可选规格：5, 10, 20, 50, 100, 200, 500, 1000；</p><p>单位：个</p><p>默认值：5</p><p>仅 SSL / SSL_CCN 类型需要填这个参数。</p> 
     * @return MaxConnection <p>SSL VPN连接数设置，可选规格：5, 10, 20, 50, 100, 200, 500, 1000；</p><p>单位：个</p><p>默认值：5</p><p>仅 SSL / SSL_CCN 类型需要填这个参数。</p>
     */
    public Long getMaxConnection() {
        return this.MaxConnection;
    }

    /**
     * Set <p>SSL VPN连接数设置，可选规格：5, 10, 20, 50, 100, 200, 500, 1000；</p><p>单位：个</p><p>默认值：5</p><p>仅 SSL / SSL_CCN 类型需要填这个参数。</p>
     * @param MaxConnection <p>SSL VPN连接数设置，可选规格：5, 10, 20, 50, 100, 200, 500, 1000；</p><p>单位：个</p><p>默认值：5</p><p>仅 SSL / SSL_CCN 类型需要填这个参数。</p>
     */
    public void setMaxConnection(Long MaxConnection) {
        this.MaxConnection = MaxConnection;
    }

    /**
     * Get <p>BGP ASN。</p> 
     * @return BgpAsn <p>BGP ASN。</p>
     */
    public Long getBgpAsn() {
        return this.BgpAsn;
    }

    /**
     * Set <p>BGP ASN。</p>
     * @param BgpAsn <p>BGP ASN。</p>
     */
    public void setBgpAsn(Long BgpAsn) {
        this.BgpAsn = BgpAsn;
    }

    public CreateVpnGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateVpnGatewayRequest(CreateVpnGatewayRequest source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.VpnGatewayName != null) {
            this.VpnGatewayName = new String(source.VpnGatewayName);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.InstanceChargeType != null) {
            this.InstanceChargeType = new String(source.InstanceChargeType);
        }
        if (source.InstanceChargePrepaid != null) {
            this.InstanceChargePrepaid = new InstanceChargePrepaid(source.InstanceChargePrepaid);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.CdcId != null) {
            this.CdcId = new String(source.CdcId);
        }
        if (source.MaxConnection != null) {
            this.MaxConnection = new Long(source.MaxConnection);
        }
        if (source.BgpAsn != null) {
            this.BgpAsn = new Long(source.BgpAsn);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "VpnGatewayName", this.VpnGatewayName);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceChargePrepaid.", this.InstanceChargePrepaid);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "CdcId", this.CdcId);
        this.setParamSimple(map, prefix + "MaxConnection", this.MaxConnection);
        this.setParamSimple(map, prefix + "BgpAsn", this.BgpAsn);

    }
}

