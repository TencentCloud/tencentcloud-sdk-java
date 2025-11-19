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

public class CreateNatGatewayRequest extends AbstractModel {

    /**
    * NAT网关名称，限制60字符
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * NAT网关最大外网出带宽(单位：Mbps)，支持的参数值：20, 50, 100, 200, 500, 1000, 2000, 5000，默认: 100Mbps。  当以下NatProductVersion参数值为2即标准型时，此参数无需填写，默认为5000Mbps。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Long InternetMaxBandwidthOut;

    /**
    * NAT网关并发连接数上限，支持参数值：1000000、3000000、10000000，默认值为1000000。 当NatProductVersion参数值为2即标准型时，此参数无需填写，默认为2000000。
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Long MaxConcurrentConnection;

    /**
    * 新建弹性公网IP个数，系统会按您的要求创建对应数量的弹性公网IP，其中AddressCount和PublicAddresses两个参数至少填写一个。
    */
    @SerializedName("AddressCount")
    @Expose
    private Long AddressCount;

    /**
    * 绑定NAT网关的已有弹性公网IP数组，其中AddressCount和PublicAddresses两个参数至少填写一个。 示例值：["139.199.232.119"]
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 可用区，形如：`ap-guangzhou-1`。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * NAT网关所属子网，已废弃
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 绑定NAT网关的弹性公网IP带宽值（单位：Mbps）。不填写此参数时：则该参数默认为弹性公网IP的带宽值，部分用户默认为该用户类型的弹性公网IP的带宽上限。
    */
    @SerializedName("StockPublicIpAddressesBandwidthOut")
    @Expose
    private Long StockPublicIpAddressesBandwidthOut;

    /**
    * 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
    */
    @SerializedName("PublicIpAddressesBandwidthOut")
    @Expose
    private Long PublicIpAddressesBandwidthOut;

    /**
    * 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。
    */
    @SerializedName("PublicIpFromSameZone")
    @Expose
    private Boolean PublicIpFromSameZone;

    /**
    * NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关，默认值是1。
    */
    @SerializedName("NatProductVersion")
    @Expose
    private Long NatProductVersion;

    /**
    * NAT实例是否开启删除保护
    */
    @SerializedName("DeletionProtectionEnabled")
    @Expose
    private Boolean DeletionProtectionEnabled;

    /**
     * Get NAT网关名称，限制60字符 
     * @return NatGatewayName NAT网关名称，限制60字符
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * Set NAT网关名称，限制60字符
     * @param NatGatewayName NAT网关名称，限制60字符
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * Get VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。 
     * @return VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get NAT网关最大外网出带宽(单位：Mbps)，支持的参数值：20, 50, 100, 200, 500, 1000, 2000, 5000，默认: 100Mbps。  当以下NatProductVersion参数值为2即标准型时，此参数无需填写，默认为5000Mbps。 
     * @return InternetMaxBandwidthOut NAT网关最大外网出带宽(单位：Mbps)，支持的参数值：20, 50, 100, 200, 500, 1000, 2000, 5000，默认: 100Mbps。  当以下NatProductVersion参数值为2即标准型时，此参数无需填写，默认为5000Mbps。
     */
    public Long getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * Set NAT网关最大外网出带宽(单位：Mbps)，支持的参数值：20, 50, 100, 200, 500, 1000, 2000, 5000，默认: 100Mbps。  当以下NatProductVersion参数值为2即标准型时，此参数无需填写，默认为5000Mbps。
     * @param InternetMaxBandwidthOut NAT网关最大外网出带宽(单位：Mbps)，支持的参数值：20, 50, 100, 200, 500, 1000, 2000, 5000，默认: 100Mbps。  当以下NatProductVersion参数值为2即标准型时，此参数无需填写，默认为5000Mbps。
     */
    public void setInternetMaxBandwidthOut(Long InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * Get NAT网关并发连接数上限，支持参数值：1000000、3000000、10000000，默认值为1000000。 当NatProductVersion参数值为2即标准型时，此参数无需填写，默认为2000000。 
     * @return MaxConcurrentConnection NAT网关并发连接数上限，支持参数值：1000000、3000000、10000000，默认值为1000000。 当NatProductVersion参数值为2即标准型时，此参数无需填写，默认为2000000。
     */
    public Long getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * Set NAT网关并发连接数上限，支持参数值：1000000、3000000、10000000，默认值为1000000。 当NatProductVersion参数值为2即标准型时，此参数无需填写，默认为2000000。
     * @param MaxConcurrentConnection NAT网关并发连接数上限，支持参数值：1000000、3000000、10000000，默认值为1000000。 当NatProductVersion参数值为2即标准型时，此参数无需填写，默认为2000000。
     */
    public void setMaxConcurrentConnection(Long MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    /**
     * Get 新建弹性公网IP个数，系统会按您的要求创建对应数量的弹性公网IP，其中AddressCount和PublicAddresses两个参数至少填写一个。 
     * @return AddressCount 新建弹性公网IP个数，系统会按您的要求创建对应数量的弹性公网IP，其中AddressCount和PublicAddresses两个参数至少填写一个。
     */
    public Long getAddressCount() {
        return this.AddressCount;
    }

    /**
     * Set 新建弹性公网IP个数，系统会按您的要求创建对应数量的弹性公网IP，其中AddressCount和PublicAddresses两个参数至少填写一个。
     * @param AddressCount 新建弹性公网IP个数，系统会按您的要求创建对应数量的弹性公网IP，其中AddressCount和PublicAddresses两个参数至少填写一个。
     */
    public void setAddressCount(Long AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * Get 绑定NAT网关的已有弹性公网IP数组，其中AddressCount和PublicAddresses两个参数至少填写一个。 示例值：["139.199.232.119"] 
     * @return PublicIpAddresses 绑定NAT网关的已有弹性公网IP数组，其中AddressCount和PublicAddresses两个参数至少填写一个。 示例值：["139.199.232.119"]
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * Set 绑定NAT网关的已有弹性公网IP数组，其中AddressCount和PublicAddresses两个参数至少填写一个。 示例值：["139.199.232.119"]
     * @param PublicIpAddresses 绑定NAT网关的已有弹性公网IP数组，其中AddressCount和PublicAddresses两个参数至少填写一个。 示例值：["139.199.232.119"]
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * Get 可用区，形如：`ap-guangzhou-1`。 
     * @return Zone 可用区，形如：`ap-guangzhou-1`。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 可用区，形如：`ap-guangzhou-1`。
     * @param Zone 可用区，形如：`ap-guangzhou-1`。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * Get 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}] 
     * @return Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     * @param Tags 指定绑定的标签列表，例如：[{"Key": "city", "Value": "shanghai"}]
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get NAT网关所属子网，已废弃 
     * @return SubnetId NAT网关所属子网，已废弃
     * @deprecated
     */
    @Deprecated
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set NAT网关所属子网，已废弃
     * @param SubnetId NAT网关所属子网，已废弃
     * @deprecated
     */
    @Deprecated
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get 绑定NAT网关的弹性公网IP带宽值（单位：Mbps）。不填写此参数时：则该参数默认为弹性公网IP的带宽值，部分用户默认为该用户类型的弹性公网IP的带宽上限。 
     * @return StockPublicIpAddressesBandwidthOut 绑定NAT网关的弹性公网IP带宽值（单位：Mbps）。不填写此参数时：则该参数默认为弹性公网IP的带宽值，部分用户默认为该用户类型的弹性公网IP的带宽上限。
     */
    public Long getStockPublicIpAddressesBandwidthOut() {
        return this.StockPublicIpAddressesBandwidthOut;
    }

    /**
     * Set 绑定NAT网关的弹性公网IP带宽值（单位：Mbps）。不填写此参数时：则该参数默认为弹性公网IP的带宽值，部分用户默认为该用户类型的弹性公网IP的带宽上限。
     * @param StockPublicIpAddressesBandwidthOut 绑定NAT网关的弹性公网IP带宽值（单位：Mbps）。不填写此参数时：则该参数默认为弹性公网IP的带宽值，部分用户默认为该用户类型的弹性公网IP的带宽上限。
     */
    public void setStockPublicIpAddressesBandwidthOut(Long StockPublicIpAddressesBandwidthOut) {
        this.StockPublicIpAddressesBandwidthOut = StockPublicIpAddressesBandwidthOut;
    }

    /**
     * Get 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。 
     * @return PublicIpAddressesBandwidthOut 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     */
    public Long getPublicIpAddressesBandwidthOut() {
        return this.PublicIpAddressesBandwidthOut;
    }

    /**
     * Set 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     * @param PublicIpAddressesBandwidthOut 需要申请公网IP带宽大小（单位Mbps），默认为当前用户类型所能使用的最大值。
     */
    public void setPublicIpAddressesBandwidthOut(Long PublicIpAddressesBandwidthOut) {
        this.PublicIpAddressesBandwidthOut = PublicIpAddressesBandwidthOut;
    }

    /**
     * Get 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。 
     * @return PublicIpFromSameZone 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。
     */
    public Boolean getPublicIpFromSameZone() {
        return this.PublicIpFromSameZone;
    }

    /**
     * Set 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。
     * @param PublicIpFromSameZone 公网IP是否强制与NAT网关来自同可用区，true表示需要与NAT网关同可用区；false表示可与NAT网关不是同一个可用区。此参数只有当参数Zone存在时才能生效。
     */
    public void setPublicIpFromSameZone(Boolean PublicIpFromSameZone) {
        this.PublicIpFromSameZone = PublicIpFromSameZone;
    }

    /**
     * Get NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关，默认值是1。 
     * @return NatProductVersion NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关，默认值是1。
     */
    public Long getNatProductVersion() {
        return this.NatProductVersion;
    }

    /**
     * Set NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关，默认值是1。
     * @param NatProductVersion NAT网关类型，1表示传统型NAT网关，2表示标准型NAT网关，默认值是1。
     */
    public void setNatProductVersion(Long NatProductVersion) {
        this.NatProductVersion = NatProductVersion;
    }

    /**
     * Get NAT实例是否开启删除保护 
     * @return DeletionProtectionEnabled NAT实例是否开启删除保护
     */
    public Boolean getDeletionProtectionEnabled() {
        return this.DeletionProtectionEnabled;
    }

    /**
     * Set NAT实例是否开启删除保护
     * @param DeletionProtectionEnabled NAT实例是否开启删除保护
     */
    public void setDeletionProtectionEnabled(Boolean DeletionProtectionEnabled) {
        this.DeletionProtectionEnabled = DeletionProtectionEnabled;
    }

    public CreateNatGatewayRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateNatGatewayRequest(CreateNatGatewayRequest source) {
        if (source.NatGatewayName != null) {
            this.NatGatewayName = new String(source.NatGatewayName);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.InternetMaxBandwidthOut != null) {
            this.InternetMaxBandwidthOut = new Long(source.InternetMaxBandwidthOut);
        }
        if (source.MaxConcurrentConnection != null) {
            this.MaxConcurrentConnection = new Long(source.MaxConcurrentConnection);
        }
        if (source.AddressCount != null) {
            this.AddressCount = new Long(source.AddressCount);
        }
        if (source.PublicIpAddresses != null) {
            this.PublicIpAddresses = new String[source.PublicIpAddresses.length];
            for (int i = 0; i < source.PublicIpAddresses.length; i++) {
                this.PublicIpAddresses[i] = new String(source.PublicIpAddresses[i]);
            }
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.StockPublicIpAddressesBandwidthOut != null) {
            this.StockPublicIpAddressesBandwidthOut = new Long(source.StockPublicIpAddressesBandwidthOut);
        }
        if (source.PublicIpAddressesBandwidthOut != null) {
            this.PublicIpAddressesBandwidthOut = new Long(source.PublicIpAddressesBandwidthOut);
        }
        if (source.PublicIpFromSameZone != null) {
            this.PublicIpFromSameZone = new Boolean(source.PublicIpFromSameZone);
        }
        if (source.NatProductVersion != null) {
            this.NatProductVersion = new Long(source.NatProductVersion);
        }
        if (source.DeletionProtectionEnabled != null) {
            this.DeletionProtectionEnabled = new Boolean(source.DeletionProtectionEnabled);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "StockPublicIpAddressesBandwidthOut", this.StockPublicIpAddressesBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpAddressesBandwidthOut", this.PublicIpAddressesBandwidthOut);
        this.setParamSimple(map, prefix + "PublicIpFromSameZone", this.PublicIpFromSameZone);
        this.setParamSimple(map, prefix + "NatProductVersion", this.NatProductVersion);
        this.setParamSimple(map, prefix + "DeletionProtectionEnabled", this.DeletionProtectionEnabled);

    }
}

