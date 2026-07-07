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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * 应用型负载均衡的地址类型。取值：

- **Internet**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * 应用型负载均衡实例计费配置。
    */
    @SerializedName("LoadBalancerBillingConfig")
    @Expose
    private LoadBalancerBillingConfig LoadBalancerBillingConfig;

    /**
    * 私有网络 ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 可用区及私有网络子网映射列表，最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
    */
    @SerializedName("ZoneMappings")
    @Expose
    private ZoneMappingsItem [] ZoneMappings;

    /**
    * IP 地址版本，取值 IPv4 或 IPv6。
    */
    @SerializedName("AddressIpVersion")
    @Expose
    private String AddressIpVersion;

    /**
    * 客户端Token，用于保证请求的幂等性。

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。
    */
    @SerializedName("ClientToken")
    @Expose
    private String ClientToken;

    /**
    * 删除保护配置。
    */
    @SerializedName("DeleteProtection")
    @Expose
    private DeletionProtectionConfig DeleteProtection;

    /**
    * 是否只预检此次请求，取值：

- **true**：发送检查请求，不会创建应用型负载均衡实例。检查项包括是否填写了必需参数、请求格式和业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码`DryRunOperation`。

- **false**（默认值）：发送正常请求，通过检查后返回HTTP 2xx状态码并直接进行操作。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * EIP 地址类型，可取值：
- **EIP**: 普通弹性公网 IP
- **AntiDDoSEIP**: 高防EIP
- **AnycastEIP**: 加速 EIP
- **HighQualityEIP**: 精品 IP。仅新加坡和中国香港支持精品IP。
- **ResidentialEIP**: 原生 IP

不传默认是EIP。
    */
    @SerializedName("InternetAddressType")
    @Expose
    private String InternetAddressType;

    /**
    * 应用型负载均衡实例名称。长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 标签。
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
     * Get 应用型负载均衡的地址类型。取值：

- **Internet**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。 
     * @return AddressType 应用型负载均衡的地址类型。取值：

- **Internet**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set 应用型负载均衡的地址类型。取值：

- **Internet**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。
     * @param AddressType 应用型负载均衡的地址类型。取值：

- **Internet**：负载均衡具有公网IP地址，DNS域名被解析到公网IP，因此可以在公网环境访问。

- **Intranet**：负载均衡只有私网IP地址，DNS域名被解析到私网IP，因此只能被负载均衡所在VPC的内网环境访问。
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get 应用型负载均衡实例计费配置。 
     * @return LoadBalancerBillingConfig 应用型负载均衡实例计费配置。
     */
    public LoadBalancerBillingConfig getLoadBalancerBillingConfig() {
        return this.LoadBalancerBillingConfig;
    }

    /**
     * Set 应用型负载均衡实例计费配置。
     * @param LoadBalancerBillingConfig 应用型负载均衡实例计费配置。
     */
    public void setLoadBalancerBillingConfig(LoadBalancerBillingConfig LoadBalancerBillingConfig) {
        this.LoadBalancerBillingConfig = LoadBalancerBillingConfig;
    }

    /**
     * Get 私有网络 ID。 
     * @return VpcId 私有网络 ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私有网络 ID。
     * @param VpcId 私有网络 ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 可用区及私有网络子网映射列表，最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。 
     * @return ZoneMappings 可用区及私有网络子网映射列表，最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
     */
    public ZoneMappingsItem [] getZoneMappings() {
        return this.ZoneMappings;
    }

    /**
     * Set 可用区及私有网络子网映射列表，最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
     * @param ZoneMappings 可用区及私有网络子网映射列表，最多支持添加10个可用区。若当前地域支持2个及以上的可用区，至少需要添加2个可用区。
     */
    public void setZoneMappings(ZoneMappingsItem [] ZoneMappings) {
        this.ZoneMappings = ZoneMappings;
    }

    /**
     * Get IP 地址版本，取值 IPv4 或 IPv6。 
     * @return AddressIpVersion IP 地址版本，取值 IPv4 或 IPv6。
     */
    public String getAddressIpVersion() {
        return this.AddressIpVersion;
    }

    /**
     * Set IP 地址版本，取值 IPv4 或 IPv6。
     * @param AddressIpVersion IP 地址版本，取值 IPv4 或 IPv6。
     */
    public void setAddressIpVersion(String AddressIpVersion) {
        this.AddressIpVersion = AddressIpVersion;
    }

    /**
     * Get 客户端Token，用于保证请求的幂等性。

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。 
     * @return ClientToken 客户端Token，用于保证请求的幂等性。

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。
     */
    public String getClientToken() {
        return this.ClientToken;
    }

    /**
     * Set 客户端Token，用于保证请求的幂等性。

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。
     * @param ClientToken 客户端Token，用于保证请求的幂等性。

从您的客户端生成一个参数值，确保不同请求间该参数值唯一。ClientToken只支持ASCII字符。
     */
    public void setClientToken(String ClientToken) {
        this.ClientToken = ClientToken;
    }

    /**
     * Get 删除保护配置。 
     * @return DeleteProtection 删除保护配置。
     */
    public DeletionProtectionConfig getDeleteProtection() {
        return this.DeleteProtection;
    }

    /**
     * Set 删除保护配置。
     * @param DeleteProtection 删除保护配置。
     */
    public void setDeleteProtection(DeletionProtectionConfig DeleteProtection) {
        this.DeleteProtection = DeleteProtection;
    }

    /**
     * Get 是否只预检此次请求，取值：

- **true**：发送检查请求，不会创建应用型负载均衡实例。检查项包括是否填写了必需参数、请求格式和业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码`DryRunOperation`。

- **false**（默认值）：发送正常请求，通过检查后返回HTTP 2xx状态码并直接进行操作。 
     * @return DryRun 是否只预检此次请求，取值：

- **true**：发送检查请求，不会创建应用型负载均衡实例。检查项包括是否填写了必需参数、请求格式和业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码`DryRunOperation`。

- **false**（默认值）：发送正常请求，通过检查后返回HTTP 2xx状态码并直接进行操作。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检此次请求，取值：

- **true**：发送检查请求，不会创建应用型负载均衡实例。检查项包括是否填写了必需参数、请求格式和业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码`DryRunOperation`。

- **false**（默认值）：发送正常请求，通过检查后返回HTTP 2xx状态码并直接进行操作。
     * @param DryRun 是否只预检此次请求，取值：

- **true**：发送检查请求，不会创建应用型负载均衡实例。检查项包括是否填写了必需参数、请求格式和业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码`DryRunOperation`。

- **false**（默认值）：发送正常请求，通过检查后返回HTTP 2xx状态码并直接进行操作。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get EIP 地址类型，可取值：
- **EIP**: 普通弹性公网 IP
- **AntiDDoSEIP**: 高防EIP
- **AnycastEIP**: 加速 EIP
- **HighQualityEIP**: 精品 IP。仅新加坡和中国香港支持精品IP。
- **ResidentialEIP**: 原生 IP

不传默认是EIP。 
     * @return InternetAddressType EIP 地址类型，可取值：
- **EIP**: 普通弹性公网 IP
- **AntiDDoSEIP**: 高防EIP
- **AnycastEIP**: 加速 EIP
- **HighQualityEIP**: 精品 IP。仅新加坡和中国香港支持精品IP。
- **ResidentialEIP**: 原生 IP

不传默认是EIP。
     */
    public String getInternetAddressType() {
        return this.InternetAddressType;
    }

    /**
     * Set EIP 地址类型，可取值：
- **EIP**: 普通弹性公网 IP
- **AntiDDoSEIP**: 高防EIP
- **AnycastEIP**: 加速 EIP
- **HighQualityEIP**: 精品 IP。仅新加坡和中国香港支持精品IP。
- **ResidentialEIP**: 原生 IP

不传默认是EIP。
     * @param InternetAddressType EIP 地址类型，可取值：
- **EIP**: 普通弹性公网 IP
- **AntiDDoSEIP**: 高防EIP
- **AnycastEIP**: 加速 EIP
- **HighQualityEIP**: 精品 IP。仅新加坡和中国香港支持精品IP。
- **ResidentialEIP**: 原生 IP

不传默认是EIP。
     */
    public void setInternetAddressType(String InternetAddressType) {
        this.InternetAddressType = InternetAddressType;
    }

    /**
     * Get 应用型负载均衡实例名称。长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。 
     * @return LoadBalancerName 应用型负载均衡实例名称。长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 应用型负载均衡实例名称。长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。
     * @param LoadBalancerName 应用型负载均衡实例名称。长度为1~80个字符，可包含中文、字母、数字、短划线（-）、正斜线（/）、半角句号（.）和下划线（_）。
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 标签。 
     * @return Tags 标签。
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签。
     * @param Tags 标签。
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.LoadBalancerBillingConfig != null) {
            this.LoadBalancerBillingConfig = new LoadBalancerBillingConfig(source.LoadBalancerBillingConfig);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.ZoneMappings != null) {
            this.ZoneMappings = new ZoneMappingsItem[source.ZoneMappings.length];
            for (int i = 0; i < source.ZoneMappings.length; i++) {
                this.ZoneMappings[i] = new ZoneMappingsItem(source.ZoneMappings[i]);
            }
        }
        if (source.AddressIpVersion != null) {
            this.AddressIpVersion = new String(source.AddressIpVersion);
        }
        if (source.ClientToken != null) {
            this.ClientToken = new String(source.ClientToken);
        }
        if (source.DeleteProtection != null) {
            this.DeleteProtection = new DeletionProtectionConfig(source.DeleteProtection);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.InternetAddressType != null) {
            this.InternetAddressType = new String(source.InternetAddressType);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamObj(map, prefix + "LoadBalancerBillingConfig.", this.LoadBalancerBillingConfig);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArrayObj(map, prefix + "ZoneMappings.", this.ZoneMappings);
        this.setParamSimple(map, prefix + "AddressIpVersion", this.AddressIpVersion);
        this.setParamSimple(map, prefix + "ClientToken", this.ClientToken);
        this.setParamObj(map, prefix + "DeleteProtection.", this.DeleteProtection);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "InternetAddressType", this.InternetAddressType);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

