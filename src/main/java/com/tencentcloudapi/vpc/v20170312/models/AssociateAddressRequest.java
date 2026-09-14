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

public class AssociateAddressRequest extends AbstractModel {

    /**
    * <p>标识 EIP 的唯一 ID。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。EIP 唯一 ID 形如：<code>eip-11112222</code>。</p>
    */
    @SerializedName("AddressId")
    @Expose
    private String AddressId;

    /**
    * <p>要绑定的实例 ID。实例 ID 形如：<code>ins-11112222</code>、<code>lb-11112222</code>。可通过登录<a href="https://console.cloud.tencent.com/cvm">控制台</a>查询，也可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>要绑定的弹性网卡 ID。 弹性网卡 ID 形如：<code>eni-11112222</code>。<code>NetworkInterfaceId</code> 与 <code>InstanceId</code> 不可同时指定。弹性网卡 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>networkInterfaceId</code>获取。</p>
    */
    @SerializedName("NetworkInterfaceId")
    @Expose
    private String NetworkInterfaceId;

    /**
    * <p>要绑定的内网 IP。如果指定了 <code>NetworkInterfaceId</code> 则也必须指定 <code>PrivateIpAddress</code> ，表示将 EIP 绑定到指定弹性网卡的指定内网 IP 上。同时要确保指定的 <code>PrivateIpAddress</code> 是指定的 <code>NetworkInterfaceId</code> 上的一个内网 IP。指定弹性网卡的内网 IP 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>privateIpAddress</code>获取。</p>
    */
    @SerializedName("PrivateIpAddress")
    @Expose
    private String PrivateIpAddress;

    /**
    * <p>指定绑定时是否设置直通。弹性公网 IP 直通请参见 <a href="https://cloud.tencent.com/document/product/1199/41709">EIP 直通</a>。取值：true、false，默认值为 false。当绑定 CVM 实例、EKS 弹性集群时，可设定此参数为 true。此参数目前处于内测中，如需使用，请提交 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=6&amp;level2_id=163&amp;source=0&amp;data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20CLB&amp;level3_id=1071&amp;queue=96&amp;scene_code=34639&amp;step=2">工单申请</a>。</p>
    */
    @SerializedName("EipDirectConnection")
    @Expose
    private Boolean EipDirectConnection;

    /**
    * <p>要绑定的实例所在地域。默认无需填写，仅限GAAP特殊场景需指定实例所在地域。</p>
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
     * Get <p>标识 EIP 的唯一 ID。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。EIP 唯一 ID 形如：<code>eip-11112222</code>。</p> 
     * @return AddressId <p>标识 EIP 的唯一 ID。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。EIP 唯一 ID 形如：<code>eip-11112222</code>。</p>
     */
    public String getAddressId() {
        return this.AddressId;
    }

    /**
     * Set <p>标识 EIP 的唯一 ID。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。EIP 唯一 ID 形如：<code>eip-11112222</code>。</p>
     * @param AddressId <p>标识 EIP 的唯一 ID。可以使用<a href="https://cloud.tencent.com/document/product/215/16702">DescribeAddresses</a>接口获取AddressId。EIP 唯一 ID 形如：<code>eip-11112222</code>。</p>
     */
    public void setAddressId(String AddressId) {
        this.AddressId = AddressId;
    }

    /**
     * Get <p>要绑定的实例 ID。实例 ID 形如：<code>ins-11112222</code>、<code>lb-11112222</code>。可通过登录<a href="https://console.cloud.tencent.com/cvm">控制台</a>查询，也可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p> 
     * @return InstanceId <p>要绑定的实例 ID。实例 ID 形如：<code>ins-11112222</code>、<code>lb-11112222</code>。可通过登录<a href="https://console.cloud.tencent.com/cvm">控制台</a>查询，也可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>要绑定的实例 ID。实例 ID 形如：<code>ins-11112222</code>、<code>lb-11112222</code>。可通过登录<a href="https://console.cloud.tencent.com/cvm">控制台</a>查询，也可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p>
     * @param InstanceId <p>要绑定的实例 ID。实例 ID 形如：<code>ins-11112222</code>、<code>lb-11112222</code>。可通过登录<a href="https://console.cloud.tencent.com/cvm">控制台</a>查询，也可通过 <a href="https://cloud.tencent.com/document/api/213/15728">DescribeInstances</a> 接口返回值中的<code>InstanceId</code>获取。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>要绑定的弹性网卡 ID。 弹性网卡 ID 形如：<code>eni-11112222</code>。<code>NetworkInterfaceId</code> 与 <code>InstanceId</code> 不可同时指定。弹性网卡 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>networkInterfaceId</code>获取。</p> 
     * @return NetworkInterfaceId <p>要绑定的弹性网卡 ID。 弹性网卡 ID 形如：<code>eni-11112222</code>。<code>NetworkInterfaceId</code> 与 <code>InstanceId</code> 不可同时指定。弹性网卡 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>networkInterfaceId</code>获取。</p>
     */
    public String getNetworkInterfaceId() {
        return this.NetworkInterfaceId;
    }

    /**
     * Set <p>要绑定的弹性网卡 ID。 弹性网卡 ID 形如：<code>eni-11112222</code>。<code>NetworkInterfaceId</code> 与 <code>InstanceId</code> 不可同时指定。弹性网卡 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>networkInterfaceId</code>获取。</p>
     * @param NetworkInterfaceId <p>要绑定的弹性网卡 ID。 弹性网卡 ID 形如：<code>eni-11112222</code>。<code>NetworkInterfaceId</code> 与 <code>InstanceId</code> 不可同时指定。弹性网卡 ID 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>networkInterfaceId</code>获取。</p>
     */
    public void setNetworkInterfaceId(String NetworkInterfaceId) {
        this.NetworkInterfaceId = NetworkInterfaceId;
    }

    /**
     * Get <p>要绑定的内网 IP。如果指定了 <code>NetworkInterfaceId</code> 则也必须指定 <code>PrivateIpAddress</code> ，表示将 EIP 绑定到指定弹性网卡的指定内网 IP 上。同时要确保指定的 <code>PrivateIpAddress</code> 是指定的 <code>NetworkInterfaceId</code> 上的一个内网 IP。指定弹性网卡的内网 IP 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>privateIpAddress</code>获取。</p> 
     * @return PrivateIpAddress <p>要绑定的内网 IP。如果指定了 <code>NetworkInterfaceId</code> 则也必须指定 <code>PrivateIpAddress</code> ，表示将 EIP 绑定到指定弹性网卡的指定内网 IP 上。同时要确保指定的 <code>PrivateIpAddress</code> 是指定的 <code>NetworkInterfaceId</code> 上的一个内网 IP。指定弹性网卡的内网 IP 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>privateIpAddress</code>获取。</p>
     */
    public String getPrivateIpAddress() {
        return this.PrivateIpAddress;
    }

    /**
     * Set <p>要绑定的内网 IP。如果指定了 <code>NetworkInterfaceId</code> 则也必须指定 <code>PrivateIpAddress</code> ，表示将 EIP 绑定到指定弹性网卡的指定内网 IP 上。同时要确保指定的 <code>PrivateIpAddress</code> 是指定的 <code>NetworkInterfaceId</code> 上的一个内网 IP。指定弹性网卡的内网 IP 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>privateIpAddress</code>获取。</p>
     * @param PrivateIpAddress <p>要绑定的内网 IP。如果指定了 <code>NetworkInterfaceId</code> 则也必须指定 <code>PrivateIpAddress</code> ，表示将 EIP 绑定到指定弹性网卡的指定内网 IP 上。同时要确保指定的 <code>PrivateIpAddress</code> 是指定的 <code>NetworkInterfaceId</code> 上的一个内网 IP。指定弹性网卡的内网 IP 可通过登录<a href="https://console.cloud.tencent.com/vpc/eni">控制台</a>查询，也可通过<a href="https://cloud.tencent.com/document/api/215/15817">DescribeNetworkInterfaces</a>接口返回值中的<code>privateIpAddress</code>获取。</p>
     */
    public void setPrivateIpAddress(String PrivateIpAddress) {
        this.PrivateIpAddress = PrivateIpAddress;
    }

    /**
     * Get <p>指定绑定时是否设置直通。弹性公网 IP 直通请参见 <a href="https://cloud.tencent.com/document/product/1199/41709">EIP 直通</a>。取值：true、false，默认值为 false。当绑定 CVM 实例、EKS 弹性集群时，可设定此参数为 true。此参数目前处于内测中，如需使用，请提交 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=6&amp;level2_id=163&amp;source=0&amp;data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20CLB&amp;level3_id=1071&amp;queue=96&amp;scene_code=34639&amp;step=2">工单申请</a>。</p> 
     * @return EipDirectConnection <p>指定绑定时是否设置直通。弹性公网 IP 直通请参见 <a href="https://cloud.tencent.com/document/product/1199/41709">EIP 直通</a>。取值：true、false，默认值为 false。当绑定 CVM 实例、EKS 弹性集群时，可设定此参数为 true。此参数目前处于内测中，如需使用，请提交 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=6&amp;level2_id=163&amp;source=0&amp;data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20CLB&amp;level3_id=1071&amp;queue=96&amp;scene_code=34639&amp;step=2">工单申请</a>。</p>
     */
    public Boolean getEipDirectConnection() {
        return this.EipDirectConnection;
    }

    /**
     * Set <p>指定绑定时是否设置直通。弹性公网 IP 直通请参见 <a href="https://cloud.tencent.com/document/product/1199/41709">EIP 直通</a>。取值：true、false，默认值为 false。当绑定 CVM 实例、EKS 弹性集群时，可设定此参数为 true。此参数目前处于内测中，如需使用，请提交 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=6&amp;level2_id=163&amp;source=0&amp;data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20CLB&amp;level3_id=1071&amp;queue=96&amp;scene_code=34639&amp;step=2">工单申请</a>。</p>
     * @param EipDirectConnection <p>指定绑定时是否设置直通。弹性公网 IP 直通请参见 <a href="https://cloud.tencent.com/document/product/1199/41709">EIP 直通</a>。取值：true、false，默认值为 false。当绑定 CVM 实例、EKS 弹性集群时，可设定此参数为 true。此参数目前处于内测中，如需使用，请提交 <a href="https://console.cloud.tencent.com/workorder/category?level1_id=6&amp;level2_id=163&amp;source=0&amp;data_title=%E8%B4%9F%E8%BD%BD%E5%9D%87%E8%A1%A1%20CLB&amp;level3_id=1071&amp;queue=96&amp;scene_code=34639&amp;step=2">工单申请</a>。</p>
     */
    public void setEipDirectConnection(Boolean EipDirectConnection) {
        this.EipDirectConnection = EipDirectConnection;
    }

    /**
     * Get <p>要绑定的实例所在地域。默认无需填写，仅限GAAP特殊场景需指定实例所在地域。</p> 
     * @return InstanceRegion <p>要绑定的实例所在地域。默认无需填写，仅限GAAP特殊场景需指定实例所在地域。</p>
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set <p>要绑定的实例所在地域。默认无需填写，仅限GAAP特殊场景需指定实例所在地域。</p>
     * @param InstanceRegion <p>要绑定的实例所在地域。默认无需填写，仅限GAAP特殊场景需指定实例所在地域。</p>
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    public AssociateAddressRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AssociateAddressRequest(AssociateAddressRequest source) {
        if (source.AddressId != null) {
            this.AddressId = new String(source.AddressId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.NetworkInterfaceId != null) {
            this.NetworkInterfaceId = new String(source.NetworkInterfaceId);
        }
        if (source.PrivateIpAddress != null) {
            this.PrivateIpAddress = new String(source.PrivateIpAddress);
        }
        if (source.EipDirectConnection != null) {
            this.EipDirectConnection = new Boolean(source.EipDirectConnection);
        }
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressId", this.AddressId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "NetworkInterfaceId", this.NetworkInterfaceId);
        this.setParamSimple(map, prefix + "PrivateIpAddress", this.PrivateIpAddress);
        this.setParamSimple(map, prefix + "EipDirectConnection", this.EipDirectConnection);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);

    }
}

