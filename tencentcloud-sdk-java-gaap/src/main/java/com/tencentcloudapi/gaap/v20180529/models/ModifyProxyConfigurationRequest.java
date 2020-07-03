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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyProxyConfigurationRequest extends AbstractModel{

    /**
    * （旧参数，请切换到ProxyId）通道的实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 需要调整到的目标带宽，单位：Mbps。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 需要调整到的目标并发值，单位：万。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到
    */
    @SerializedName("Concurrent")
    @Expose
    private Long Concurrent;

    /**
    * 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * （新参数）通道的实例ID。
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
     * Get （旧参数，请切换到ProxyId）通道的实例ID。 
     * @return InstanceId （旧参数，请切换到ProxyId）通道的实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set （旧参数，请切换到ProxyId）通道的实例ID。
     * @param InstanceId （旧参数，请切换到ProxyId）通道的实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 需要调整到的目标带宽，单位：Mbps。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到 
     * @return Bandwidth 需要调整到的目标带宽，单位：Mbps。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 需要调整到的目标带宽，单位：Mbps。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到
     * @param Bandwidth 需要调整到的目标带宽，单位：Mbps。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 需要调整到的目标并发值，单位：万。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到 
     * @return Concurrent 需要调整到的目标并发值，单位：万。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到
     */
    public Long getConcurrent() {
        return this.Concurrent;
    }

    /**
     * Set 需要调整到的目标并发值，单位：万。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到
     * @param Concurrent 需要调整到的目标并发值，单位：万。
Bandwidth与Concurrent必须至少设置一个。取值范围根据DescribeAccessRegionsByDestRegion接口获取得到
     */
    public void setConcurrent(Long Concurrent) {
        this.Concurrent = Concurrent;
    }

    /**
     * Get 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。 
     * @return ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     * @param ClientToken 用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。
更多详细信息请参阅：如何保证幂等性。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get （新参数）通道的实例ID。 
     * @return ProxyId （新参数）通道的实例ID。
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set （新参数）通道的实例ID。
     * @param ProxyId （新参数）通道的实例ID。
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费） 
     * @return BillingType 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
     * @param BillingType 计费方式 (0:按带宽计费，1:按流量计费 默认按带宽计费）
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "Concurrent", this.Concurrent);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);

    }
}

