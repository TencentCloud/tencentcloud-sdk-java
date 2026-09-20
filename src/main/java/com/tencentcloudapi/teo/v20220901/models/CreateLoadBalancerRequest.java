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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateLoadBalancerRequest extends AbstractModel {

    /**
    * <p>站点 ID。</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>实例类型，取值有：</p><li>HTTP_V2：HTTP 专用型（V2），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型支持选择发起探测的区域，可显著降低探测请求量但对源站的健康感知灵敏度更低；</li><li>HTTP：HTTP 专用型（V1），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高；</li><li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>源站组列表及其对应的容灾调度优先级。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104223">快速创建负载均衡实例</a> 中的示例场景。</p>
    */
    @SerializedName("OriginGroups")
    @Expose
    private OriginGroupInLoadBalancer [] OriginGroups;

    /**
    * <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。不填写时，默认为不启用健康检查。</p>
    */
    @SerializedName("HealthChecker")
    @Expose
    private HealthChecker HealthChecker;

    /**
    * <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移。</li>默认值为 Pritory。
    */
    @SerializedName("SteeringPolicy")
    @Expose
    private String SteeringPolicy;

    /**
    * <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>默认值为 OtherRecordInOriginGroup。
    */
    @SerializedName("FailoverPolicy")
    @Expose
    private String FailoverPolicy;

    /**
     * Get <p>站点 ID。</p> 
     * @return ZoneId <p>站点 ID。</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>站点 ID。</p>
     * @param ZoneId <p>站点 ID。</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。</p> 
     * @return Name <p>实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。</p>
     * @param Name <p>实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>实例类型，取值有：</p><li>HTTP_V2：HTTP 专用型（V2），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型支持选择发起探测的区域，可显著降低探测请求量但对源站的健康感知灵敏度更低；</li><li>HTTP：HTTP 专用型（V1），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高；</li><li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高。</li> 
     * @return Type <p>实例类型，取值有：</p><li>HTTP_V2：HTTP 专用型（V2），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型支持选择发起探测的区域，可显著降低探测请求量但对源站的健康感知灵敏度更低；</li><li>HTTP：HTTP 专用型（V1），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高；</li><li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>实例类型，取值有：</p><li>HTTP_V2：HTTP 专用型（V2），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型支持选择发起探测的区域，可显著降低探测请求量但对源站的健康感知灵敏度更低；</li><li>HTTP：HTTP 专用型（V1），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高；</li><li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高。</li>
     * @param Type <p>实例类型，取值有：</p><li>HTTP_V2：HTTP 专用型（V2），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型支持选择发起探测的区域，可显著降低探测请求量但对源站的健康感知灵敏度更低；</li><li>HTTP：HTTP 专用型（V1），支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高；</li><li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。该实例类型不支持选择发起探测的区域，探测请求量较大但对源站的健康感知灵敏度更高。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>源站组列表及其对应的容灾调度优先级。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104223">快速创建负载均衡实例</a> 中的示例场景。</p> 
     * @return OriginGroups <p>源站组列表及其对应的容灾调度优先级。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104223">快速创建负载均衡实例</a> 中的示例场景。</p>
     */
    public OriginGroupInLoadBalancer [] getOriginGroups() {
        return this.OriginGroups;
    }

    /**
     * Set <p>源站组列表及其对应的容灾调度优先级。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104223">快速创建负载均衡实例</a> 中的示例场景。</p>
     * @param OriginGroups <p>源站组列表及其对应的容灾调度优先级。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104223">快速创建负载均衡实例</a> 中的示例场景。</p>
     */
    public void setOriginGroups(OriginGroupInLoadBalancer [] OriginGroups) {
        this.OriginGroups = OriginGroups;
    }

    /**
     * Get <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。不填写时，默认为不启用健康检查。</p> 
     * @return HealthChecker <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。不填写时，默认为不启用健康检查。</p>
     */
    public HealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。不填写时，默认为不启用健康检查。</p>
     * @param HealthChecker <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。不填写时，默认为不启用健康检查。</p>
     */
    public void setHealthChecker(HealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移。</li>默认值为 Pritory。 
     * @return SteeringPolicy <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移。</li>默认值为 Pritory。
     */
    public String getSteeringPolicy() {
        return this.SteeringPolicy;
    }

    /**
     * Set <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移。</li>默认值为 Pritory。
     * @param SteeringPolicy <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移。</li>默认值为 Pritory。
     */
    public void setSteeringPolicy(String SteeringPolicy) {
        this.SteeringPolicy = SteeringPolicy;
    }

    /**
     * Get <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>默认值为 OtherRecordInOriginGroup。 
     * @return FailoverPolicy <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>默认值为 OtherRecordInOriginGroup。
     */
    public String getFailoverPolicy() {
        return this.FailoverPolicy;
    }

    /**
     * Set <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>默认值为 OtherRecordInOriginGroup。
     * @param FailoverPolicy <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>默认值为 OtherRecordInOriginGroup。
     */
    public void setFailoverPolicy(String FailoverPolicy) {
        this.FailoverPolicy = FailoverPolicy;
    }

    public CreateLoadBalancerRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLoadBalancerRequest(CreateLoadBalancerRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.OriginGroups != null) {
            this.OriginGroups = new OriginGroupInLoadBalancer[source.OriginGroups.length];
            for (int i = 0; i < source.OriginGroups.length; i++) {
                this.OriginGroups[i] = new OriginGroupInLoadBalancer(source.OriginGroups[i]);
            }
        }
        if (source.HealthChecker != null) {
            this.HealthChecker = new HealthChecker(source.HealthChecker);
        }
        if (source.SteeringPolicy != null) {
            this.SteeringPolicy = new String(source.SteeringPolicy);
        }
        if (source.FailoverPolicy != null) {
            this.FailoverPolicy = new String(source.FailoverPolicy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "OriginGroups.", this.OriginGroups);
        this.setParamObj(map, prefix + "HealthChecker.", this.HealthChecker);
        this.setParamSimple(map, prefix + "SteeringPolicy", this.SteeringPolicy);
        this.setParamSimple(map, prefix + "FailoverPolicy", this.FailoverPolicy);

    }
}

