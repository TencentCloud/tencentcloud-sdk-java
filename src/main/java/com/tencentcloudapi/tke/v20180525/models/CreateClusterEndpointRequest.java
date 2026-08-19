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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateClusterEndpointRequest extends AbstractModel {

    /**
    * <p>集群ID</p>
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * <p>集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)。获取方式：https://cloud.tencent.com/document/product/215/15784</p>
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * <p>是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）</p>
    */
    @SerializedName("IsExtranet")
    @Expose
    private Boolean IsExtranet;

    /**
    * <p>设置域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>使用的安全组（开启内外网访问且不使用已有clb时可传，内网访问需要先找clb侧加白使用）。获取方式：https://cloud.tencent.com/document/api/215/15808</p>
    */
    @SerializedName("SecurityGroup")
    @Expose
    private String SecurityGroup;

    /**
    * <p>创建lb参数，只有外网访问需要设置，是一个json格式化后的字符串：{&quot;InternetAccessible&quot;:{&quot;InternetChargeType&quot;:&quot;TRAFFIC_POSTPAID_BY_HOUR&quot;,&quot;InternetMaxBandwidthOut&quot;:200},&quot;VipIsp&quot;:&quot;&quot;,&quot;BandwidthPackageId&quot;:&quot;&quot;}。<br>各个参数意义：<br>InternetAccessible.InternetChargeType含义：TRAFFIC_POSTPAID_BY_HOUR按流量按小时后计费;BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;InternetAccessible.BANDWIDTH_PACKAGE 按带宽包计费。<br>InternetMaxBandwidthOut含义：最大出带宽，单位Mbps，范围支持0到2048，默认值10。<br>VipIsp含义：CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费BANDWIDTH_PACKAGE。<br>BandwidthPackageId含义：带宽包ID，指定此参数时，网络计费方式InternetAccessible.InternetChargeType只支持按带宽包计费BANDWIDTH_PACKAGE。</p>
    */
    @SerializedName("ExtensiveParameters")
    @Expose
    private String ExtensiveParameters;

    /**
    * <p>使用已有clb开启内网或外网访问</p>
    */
    @SerializedName("ExistedLoadBalancerId")
    @Expose
    private String ExistedLoadBalancerId;

    /**
     * Get <p>集群ID</p> 
     * @return ClusterId <p>集群ID</p>
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set <p>集群ID</p>
     * @param ClusterId <p>集群ID</p>
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get <p>集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)。获取方式：https://cloud.tencent.com/document/product/215/15784</p> 
     * @return SubnetId <p>集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)。获取方式：https://cloud.tencent.com/document/product/215/15784</p>
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * Set <p>集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)。获取方式：https://cloud.tencent.com/document/product/215/15784</p>
     * @param SubnetId <p>集群端口所在的子网ID  (仅在开启非外网访问时需要填，必须为集群所在VPC内的子网)。获取方式：https://cloud.tencent.com/document/product/215/15784</p>
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * Get <p>是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）</p> 
     * @return IsExtranet <p>是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）</p>
     */
    public Boolean getIsExtranet() {
        return this.IsExtranet;
    }

    /**
     * Set <p>是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）</p>
     * @param IsExtranet <p>是否为外网访问（TRUE 外网访问 FALSE 内网访问，默认值： FALSE）</p>
     */
    public void setIsExtranet(Boolean IsExtranet) {
        this.IsExtranet = IsExtranet;
    }

    /**
     * Get <p>设置域名</p> 
     * @return Domain <p>设置域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>设置域名</p>
     * @param Domain <p>设置域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>使用的安全组（开启内外网访问且不使用已有clb时可传，内网访问需要先找clb侧加白使用）。获取方式：https://cloud.tencent.com/document/api/215/15808</p> 
     * @return SecurityGroup <p>使用的安全组（开启内外网访问且不使用已有clb时可传，内网访问需要先找clb侧加白使用）。获取方式：https://cloud.tencent.com/document/api/215/15808</p>
     */
    public String getSecurityGroup() {
        return this.SecurityGroup;
    }

    /**
     * Set <p>使用的安全组（开启内外网访问且不使用已有clb时可传，内网访问需要先找clb侧加白使用）。获取方式：https://cloud.tencent.com/document/api/215/15808</p>
     * @param SecurityGroup <p>使用的安全组（开启内外网访问且不使用已有clb时可传，内网访问需要先找clb侧加白使用）。获取方式：https://cloud.tencent.com/document/api/215/15808</p>
     */
    public void setSecurityGroup(String SecurityGroup) {
        this.SecurityGroup = SecurityGroup;
    }

    /**
     * Get <p>创建lb参数，只有外网访问需要设置，是一个json格式化后的字符串：{&quot;InternetAccessible&quot;:{&quot;InternetChargeType&quot;:&quot;TRAFFIC_POSTPAID_BY_HOUR&quot;,&quot;InternetMaxBandwidthOut&quot;:200},&quot;VipIsp&quot;:&quot;&quot;,&quot;BandwidthPackageId&quot;:&quot;&quot;}。<br>各个参数意义：<br>InternetAccessible.InternetChargeType含义：TRAFFIC_POSTPAID_BY_HOUR按流量按小时后计费;BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;InternetAccessible.BANDWIDTH_PACKAGE 按带宽包计费。<br>InternetMaxBandwidthOut含义：最大出带宽，单位Mbps，范围支持0到2048，默认值10。<br>VipIsp含义：CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费BANDWIDTH_PACKAGE。<br>BandwidthPackageId含义：带宽包ID，指定此参数时，网络计费方式InternetAccessible.InternetChargeType只支持按带宽包计费BANDWIDTH_PACKAGE。</p> 
     * @return ExtensiveParameters <p>创建lb参数，只有外网访问需要设置，是一个json格式化后的字符串：{&quot;InternetAccessible&quot;:{&quot;InternetChargeType&quot;:&quot;TRAFFIC_POSTPAID_BY_HOUR&quot;,&quot;InternetMaxBandwidthOut&quot;:200},&quot;VipIsp&quot;:&quot;&quot;,&quot;BandwidthPackageId&quot;:&quot;&quot;}。<br>各个参数意义：<br>InternetAccessible.InternetChargeType含义：TRAFFIC_POSTPAID_BY_HOUR按流量按小时后计费;BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;InternetAccessible.BANDWIDTH_PACKAGE 按带宽包计费。<br>InternetMaxBandwidthOut含义：最大出带宽，单位Mbps，范围支持0到2048，默认值10。<br>VipIsp含义：CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费BANDWIDTH_PACKAGE。<br>BandwidthPackageId含义：带宽包ID，指定此参数时，网络计费方式InternetAccessible.InternetChargeType只支持按带宽包计费BANDWIDTH_PACKAGE。</p>
     */
    public String getExtensiveParameters() {
        return this.ExtensiveParameters;
    }

    /**
     * Set <p>创建lb参数，只有外网访问需要设置，是一个json格式化后的字符串：{&quot;InternetAccessible&quot;:{&quot;InternetChargeType&quot;:&quot;TRAFFIC_POSTPAID_BY_HOUR&quot;,&quot;InternetMaxBandwidthOut&quot;:200},&quot;VipIsp&quot;:&quot;&quot;,&quot;BandwidthPackageId&quot;:&quot;&quot;}。<br>各个参数意义：<br>InternetAccessible.InternetChargeType含义：TRAFFIC_POSTPAID_BY_HOUR按流量按小时后计费;BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;InternetAccessible.BANDWIDTH_PACKAGE 按带宽包计费。<br>InternetMaxBandwidthOut含义：最大出带宽，单位Mbps，范围支持0到2048，默认值10。<br>VipIsp含义：CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费BANDWIDTH_PACKAGE。<br>BandwidthPackageId含义：带宽包ID，指定此参数时，网络计费方式InternetAccessible.InternetChargeType只支持按带宽包计费BANDWIDTH_PACKAGE。</p>
     * @param ExtensiveParameters <p>创建lb参数，只有外网访问需要设置，是一个json格式化后的字符串：{&quot;InternetAccessible&quot;:{&quot;InternetChargeType&quot;:&quot;TRAFFIC_POSTPAID_BY_HOUR&quot;,&quot;InternetMaxBandwidthOut&quot;:200},&quot;VipIsp&quot;:&quot;&quot;,&quot;BandwidthPackageId&quot;:&quot;&quot;}。<br>各个参数意义：<br>InternetAccessible.InternetChargeType含义：TRAFFIC_POSTPAID_BY_HOUR按流量按小时后计费;BANDWIDTH_POSTPAID_BY_HOUR 按带宽按小时后计费;InternetAccessible.BANDWIDTH_PACKAGE 按带宽包计费。<br>InternetMaxBandwidthOut含义：最大出带宽，单位Mbps，范围支持0到2048，默认值10。<br>VipIsp含义：CMCC | CTCC | CUCC，分别对应 移动 | 电信 | 联通，如果不指定本参数，则默认使用BGP。可通过 DescribeSingleIsp 接口查询一个地域所支持的Isp。如果指定运营商，则网络计费式只能使用按带宽包计费BANDWIDTH_PACKAGE。<br>BandwidthPackageId含义：带宽包ID，指定此参数时，网络计费方式InternetAccessible.InternetChargeType只支持按带宽包计费BANDWIDTH_PACKAGE。</p>
     */
    public void setExtensiveParameters(String ExtensiveParameters) {
        this.ExtensiveParameters = ExtensiveParameters;
    }

    /**
     * Get <p>使用已有clb开启内网或外网访问</p> 
     * @return ExistedLoadBalancerId <p>使用已有clb开启内网或外网访问</p>
     */
    public String getExistedLoadBalancerId() {
        return this.ExistedLoadBalancerId;
    }

    /**
     * Set <p>使用已有clb开启内网或外网访问</p>
     * @param ExistedLoadBalancerId <p>使用已有clb开启内网或外网访问</p>
     */
    public void setExistedLoadBalancerId(String ExistedLoadBalancerId) {
        this.ExistedLoadBalancerId = ExistedLoadBalancerId;
    }

    public CreateClusterEndpointRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateClusterEndpointRequest(CreateClusterEndpointRequest source) {
        if (source.ClusterId != null) {
            this.ClusterId = new String(source.ClusterId);
        }
        if (source.SubnetId != null) {
            this.SubnetId = new String(source.SubnetId);
        }
        if (source.IsExtranet != null) {
            this.IsExtranet = new Boolean(source.IsExtranet);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.SecurityGroup != null) {
            this.SecurityGroup = new String(source.SecurityGroup);
        }
        if (source.ExtensiveParameters != null) {
            this.ExtensiveParameters = new String(source.ExtensiveParameters);
        }
        if (source.ExistedLoadBalancerId != null) {
            this.ExistedLoadBalancerId = new String(source.ExistedLoadBalancerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "IsExtranet", this.IsExtranet);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SecurityGroup", this.SecurityGroup);
        this.setParamSimple(map, prefix + "ExtensiveParameters", this.ExtensiveParameters);
        this.setParamSimple(map, prefix + "ExistedLoadBalancerId", this.ExistedLoadBalancerId);

    }
}

