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

public class ModifyLoadBalancerAddressTypeRequest extends AbstractModel {

    /**
    * 目标网络类型。取值：
- **Internet**（公网型）
负载均衡实例分配公网 IP 地址，域名（DNS）解析至公网 IP，可在公网环境中直接访问，适用于对外提供服务的业务场景。
- **Intranet**（内网型）
负载均衡实例仅分配私网 IP 地址，域名（DNS）解析至私网 IP，仅支持在负载均衡实例所属 VPC 内的内网环境访问，适用于内部业务或对安全性要求较高的场景。
    */
    @SerializedName("AddressType")
    @Expose
    private String AddressType;

    /**
    * 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 共享带宽包 ID。
    */
    @SerializedName("BandwidthPackageId")
    @Expose
    private String BandwidthPackageId;

    /**
    * 是否只预检此次请求。取值：
- **true**：发送检查请求，不会更新实例的网络类型。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。
- **false**（默认值）：发送正常请求，通过检查后返回 HTTP 2xx 状态码并直接进行操作。
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 可用区及子网映射结构体。
若当前地域支持 2 个及以上的可用区，至少需要添加 2 个可用区。
    */
    @SerializedName("ZoneMappings")
    @Expose
    private ZoneMappingsItem [] ZoneMappings;

    /**
     * Get 目标网络类型。取值：
- **Internet**（公网型）
负载均衡实例分配公网 IP 地址，域名（DNS）解析至公网 IP，可在公网环境中直接访问，适用于对外提供服务的业务场景。
- **Intranet**（内网型）
负载均衡实例仅分配私网 IP 地址，域名（DNS）解析至私网 IP，仅支持在负载均衡实例所属 VPC 内的内网环境访问，适用于内部业务或对安全性要求较高的场景。 
     * @return AddressType 目标网络类型。取值：
- **Internet**（公网型）
负载均衡实例分配公网 IP 地址，域名（DNS）解析至公网 IP，可在公网环境中直接访问，适用于对外提供服务的业务场景。
- **Intranet**（内网型）
负载均衡实例仅分配私网 IP 地址，域名（DNS）解析至私网 IP，仅支持在负载均衡实例所属 VPC 内的内网环境访问，适用于内部业务或对安全性要求较高的场景。
     */
    public String getAddressType() {
        return this.AddressType;
    }

    /**
     * Set 目标网络类型。取值：
- **Internet**（公网型）
负载均衡实例分配公网 IP 地址，域名（DNS）解析至公网 IP，可在公网环境中直接访问，适用于对外提供服务的业务场景。
- **Intranet**（内网型）
负载均衡实例仅分配私网 IP 地址，域名（DNS）解析至私网 IP，仅支持在负载均衡实例所属 VPC 内的内网环境访问，适用于内部业务或对安全性要求较高的场景。
     * @param AddressType 目标网络类型。取值：
- **Internet**（公网型）
负载均衡实例分配公网 IP 地址，域名（DNS）解析至公网 IP，可在公网环境中直接访问，适用于对外提供服务的业务场景。
- **Intranet**（内网型）
负载均衡实例仅分配私网 IP 地址，域名（DNS）解析至私网 IP，仅支持在负载均衡实例所属 VPC 内的内网环境访问，适用于内部业务或对安全性要求较高的场景。
     */
    public void setAddressType(String AddressType) {
        this.AddressType = AddressType;
    }

    /**
     * Get 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。 
     * @return LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     * @param LoadBalancerId 负载均衡实例 ID，格式为 alb- 后接 8 位字母数字。
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 共享带宽包 ID。 
     * @return BandwidthPackageId 共享带宽包 ID。
     */
    public String getBandwidthPackageId() {
        return this.BandwidthPackageId;
    }

    /**
     * Set 共享带宽包 ID。
     * @param BandwidthPackageId 共享带宽包 ID。
     */
    public void setBandwidthPackageId(String BandwidthPackageId) {
        this.BandwidthPackageId = BandwidthPackageId;
    }

    /**
     * Get 是否只预检此次请求。取值：
- **true**：发送检查请求，不会更新实例的网络类型。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。
- **false**（默认值）：发送正常请求，通过检查后返回 HTTP 2xx 状态码并直接进行操作。 
     * @return DryRun 是否只预检此次请求。取值：
- **true**：发送检查请求，不会更新实例的网络类型。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。
- **false**（默认值）：发送正常请求，通过检查后返回 HTTP 2xx 状态码并直接进行操作。
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检此次请求。取值：
- **true**：发送检查请求，不会更新实例的网络类型。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。
- **false**（默认值）：发送正常请求，通过检查后返回 HTTP 2xx 状态码并直接进行操作。
     * @param DryRun 是否只预检此次请求。取值：
- **true**：发送检查请求，不会更新实例的网络类型。检查项包括是否填写了必需参数、请求格式、业务限制。如果检查不通过，则返回对应错误。如果检查通过，则返回错误码DryRunOperation。
- **false**（默认值）：发送正常请求，通过检查后返回 HTTP 2xx 状态码并直接进行操作。
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 可用区及子网映射结构体。
若当前地域支持 2 个及以上的可用区，至少需要添加 2 个可用区。 
     * @return ZoneMappings 可用区及子网映射结构体。
若当前地域支持 2 个及以上的可用区，至少需要添加 2 个可用区。
     */
    public ZoneMappingsItem [] getZoneMappings() {
        return this.ZoneMappings;
    }

    /**
     * Set 可用区及子网映射结构体。
若当前地域支持 2 个及以上的可用区，至少需要添加 2 个可用区。
     * @param ZoneMappings 可用区及子网映射结构体。
若当前地域支持 2 个及以上的可用区，至少需要添加 2 个可用区。
     */
    public void setZoneMappings(ZoneMappingsItem [] ZoneMappings) {
        this.ZoneMappings = ZoneMappings;
    }

    public ModifyLoadBalancerAddressTypeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyLoadBalancerAddressTypeRequest(ModifyLoadBalancerAddressTypeRequest source) {
        if (source.AddressType != null) {
            this.AddressType = new String(source.AddressType);
        }
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.BandwidthPackageId != null) {
            this.BandwidthPackageId = new String(source.BandwidthPackageId);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.ZoneMappings != null) {
            this.ZoneMappings = new ZoneMappingsItem[source.ZoneMappings.length];
            for (int i = 0; i < source.ZoneMappings.length; i++) {
                this.ZoneMappings[i] = new ZoneMappingsItem(source.ZoneMappings[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressType", this.AddressType);
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "BandwidthPackageId", this.BandwidthPackageId);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamArrayObj(map, prefix + "ZoneMappings.", this.ZoneMappings);

    }
}

