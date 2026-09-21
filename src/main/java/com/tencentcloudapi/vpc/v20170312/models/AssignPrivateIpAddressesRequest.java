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

public class AssignPrivateIpAddressesRequest extends AbstractModel {

    /**
    * <p>弹性网卡实例ID，例如：eni-m6dyj72l。可通过<a href="https://cloud.tencent.com/document/product/215/15817">DescribeNetworkInterfaces</a>接口获取。</p>
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * <p>指定的内网IP信息，单次最多指定10个。与SecondaryPrivateIpAddressCount至少提供一个。</p>
    */
    @SerializedName("PrivateIpAddresses")
    @Expose
    private PrivateIpAddressSpecification [] PrivateIpAddresses;

    /**
    * <p>新申请的内网IP地址个数，与PrivateIpAddresses至少提供一个。内网IP地址个数总和不能超过配额数，详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。</p>
    */
    @SerializedName("SecondaryPrivateIpAddressCount")
    @Expose
    private Long SecondaryPrivateIpAddressCount;

    /**
    * <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
    * <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
     * Get <p>弹性网卡实例ID，例如：eni-m6dyj72l。可通过<a href="https://cloud.tencent.com/document/product/215/15817">DescribeNetworkInterfaces</a>接口获取。</p> 
     * @return NetworkInterfaceId <p>弹性网卡实例ID，例如：eni-m6dyj72l。可通过<a href="https://cloud.tencent.com/document/product/215/15817">DescribeNetworkInterfaces</a>接口获取。</p>
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set <p>弹性网卡实例ID，例如：eni-m6dyj72l。可通过<a href="https://cloud.tencent.com/document/product/215/15817">DescribeNetworkInterfaces</a>接口获取。</p>
     * @param NetworkInterfaceId <p>弹性网卡实例ID，例如：eni-m6dyj72l。可通过<a href="https://cloud.tencent.com/document/product/215/15817">DescribeNetworkInterfaces</a>接口获取。</p>
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get <p>指定的内网IP信息，单次最多指定10个。与SecondaryPrivateIpAddressCount至少提供一个。</p> 
     * @return PrivateIpAddresses <p>指定的内网IP信息，单次最多指定10个。与SecondaryPrivateIpAddressCount至少提供一个。</p>
     */
    public PrivateIpAddressSpecification [] getPrivateIpAddresses() {
        return this.PrivateIpAddresses;
    }

    /**
     * Set <p>指定的内网IP信息，单次最多指定10个。与SecondaryPrivateIpAddressCount至少提供一个。</p>
     * @param PrivateIpAddresses <p>指定的内网IP信息，单次最多指定10个。与SecondaryPrivateIpAddressCount至少提供一个。</p>
     */
    public void setPrivateIpAddresses(PrivateIpAddressSpecification [] PrivateIpAddresses) {
        this.PrivateIpAddresses = PrivateIpAddresses;
    }

    /**
     * Get <p>新申请的内网IP地址个数，与PrivateIpAddresses至少提供一个。内网IP地址个数总和不能超过配额数，详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。</p> 
     * @return SecondaryPrivateIpAddressCount <p>新申请的内网IP地址个数，与PrivateIpAddresses至少提供一个。内网IP地址个数总和不能超过配额数，详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。</p>
     */
    public Long getSecondaryPrivateIpAddressCount() {
        return this.SecondaryPrivateIpAddressCount;
    }

    /**
     * Set <p>新申请的内网IP地址个数，与PrivateIpAddresses至少提供一个。内网IP地址个数总和不能超过配额数，详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。</p>
     * @param SecondaryPrivateIpAddressCount <p>新申请的内网IP地址个数，与PrivateIpAddresses至少提供一个。内网IP地址个数总和不能超过配额数，详见<a href="/document/product/576/18527">弹性网卡使用限制</a>。</p>
     */
    public void setSecondaryPrivateIpAddressCount(Long SecondaryPrivateIpAddressCount) {
        this.SecondaryPrivateIpAddressCount = SecondaryPrivateIpAddressCount;
    }

    /**
     * Get <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p> 
     * @return QosLevel <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * Set <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     * @param QosLevel <p>IP服务质量等级，和SecondaryPrivateIpAddressCount配合使用，可选值：PT（云金）、AU（云银）、AG(云铜）、DEFAULT（默认）。</p>
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * Get <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p> 
     * @return ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     * @param ClientToken <p>用于保证请求幂等性的字符串。该字符串由客户生成，需保证不同请求之间唯一，最大值不超过64个ASCII字符。若不指定该参数，则无法保证请求的幂等性。</p>
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    public AssignPrivateIpAddressesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssignPrivateIpAddressesRequest(AssignPrivateIpAddressesRequest source) {
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.PrivateIpAddresses != null) {
            this.PrivateIpAddresses = new PrivateIpAddressSpecification[source.PrivateIpAddresses.length];
            for (int i = 0; i < source.PrivateIpAddresses.length; i++) {
                this.PrivateIpAddresses[i] = new PrivateIpAddressSpecification(source.PrivateIpAddresses[i]);
            }
        }
        if (source.SecondaryPrivateIpAddressCount != null) {
            this.SecondaryPrivateIpAddressCount = new Long(source.SecondaryPrivateIpAddressCount);
        }
        if (source.QosLevel != null) {
            this.QosLevel = new String(source.QosLevel);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamArrayObj(map, prefix + "PrivateIpAddresses.", this.PrivateIpAddresses);
        this.setParamSimple(map, prefix + "SecondaryPrivateIpAddressCount", this.SecondaryPrivateIpAddressCount);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);

    }
}

