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

public class LoadBalancer extends AbstractModel {

    /**
    * <p>实例 ID。</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

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
    * <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。</p>
    */
    @SerializedName("HealthChecker")
    @Expose
    private HealthChecker HealthChecker;

    /**
    * <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移 。</li>
    */
    @SerializedName("SteeringPolicy")
    @Expose
    private String SteeringPolicy;

    /**
    * <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>
    */
    @SerializedName("FailoverPolicy")
    @Expose
    private String FailoverPolicy;

    /**
    * <p>源站组健康状态。</p>
    */
    @SerializedName("OriginGroupHealthStatus")
    @Expose
    private OriginGroupHealthStatus [] OriginGroupHealthStatus;

    /**
    * <p>负载均衡状态，取值有：</p><li>Pending：部署中；</li><li>Deleting：删除中；</li><li>Running：已生效。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>该负载均衡实例绑的四层代理实例的列表。</p>
    */
    @SerializedName("L4UsedList")
    @Expose
    private String [] L4UsedList;

    /**
    * <p>该负载均衡实例绑定的七层域名列表。</p>
    */
    @SerializedName("L7UsedList")
    @Expose
    private String [] L7UsedList;

    /**
    * <p>负载均衡被引用实例的列表。</p>
    */
    @SerializedName("References")
    @Expose
    private OriginGroupReference [] References;

    /**
     * Get <p>实例 ID。</p> 
     * @return InstanceId <p>实例 ID。</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例 ID。</p>
     * @param InstanceId <p>实例 ID。</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
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
     * Get <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。</p> 
     * @return HealthChecker <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。</p>
     */
    public HealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。</p>
     * @param HealthChecker <p>健康检查策略。详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104228">健康检查策略介绍</a>。</p>
     */
    public void setHealthChecker(HealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移 。</li> 
     * @return SteeringPolicy <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移 。</li>
     */
    public String getSteeringPolicy() {
        return this.SteeringPolicy;
    }

    /**
     * Set <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移 。</li>
     * @param SteeringPolicy <p>源站组间的流量调度策略，取值有：</p><li>Pritory：按优先级顺序进行故障转移 。</li>
     */
    public void setSteeringPolicy(String SteeringPolicy) {
        this.SteeringPolicy = SteeringPolicy;
    }

    /**
     * Get <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li> 
     * @return FailoverPolicy <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>
     */
    public String getFailoverPolicy() {
        return this.FailoverPolicy;
    }

    /**
     * Set <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>
     * @param FailoverPolicy <p>实际访问某源站失败时的请求重试策略，详情请参考 <a href="https://cloud.tencent.com/document/product/1552/104227">请求重试策略介绍</a>，取值有：</p><li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li><li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>
     */
    public void setFailoverPolicy(String FailoverPolicy) {
        this.FailoverPolicy = FailoverPolicy;
    }

    /**
     * Get <p>源站组健康状态。</p> 
     * @return OriginGroupHealthStatus <p>源站组健康状态。</p>
     */
    public OriginGroupHealthStatus [] getOriginGroupHealthStatus() {
        return this.OriginGroupHealthStatus;
    }

    /**
     * Set <p>源站组健康状态。</p>
     * @param OriginGroupHealthStatus <p>源站组健康状态。</p>
     */
    public void setOriginGroupHealthStatus(OriginGroupHealthStatus [] OriginGroupHealthStatus) {
        this.OriginGroupHealthStatus = OriginGroupHealthStatus;
    }

    /**
     * Get <p>负载均衡状态，取值有：</p><li>Pending：部署中；</li><li>Deleting：删除中；</li><li>Running：已生效。</li> 
     * @return Status <p>负载均衡状态，取值有：</p><li>Pending：部署中；</li><li>Deleting：删除中；</li><li>Running：已生效。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>负载均衡状态，取值有：</p><li>Pending：部署中；</li><li>Deleting：删除中；</li><li>Running：已生效。</li>
     * @param Status <p>负载均衡状态，取值有：</p><li>Pending：部署中；</li><li>Deleting：删除中；</li><li>Running：已生效。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>该负载均衡实例绑的四层代理实例的列表。</p> 
     * @return L4UsedList <p>该负载均衡实例绑的四层代理实例的列表。</p>
     */
    public String [] getL4UsedList() {
        return this.L4UsedList;
    }

    /**
     * Set <p>该负载均衡实例绑的四层代理实例的列表。</p>
     * @param L4UsedList <p>该负载均衡实例绑的四层代理实例的列表。</p>
     */
    public void setL4UsedList(String [] L4UsedList) {
        this.L4UsedList = L4UsedList;
    }

    /**
     * Get <p>该负载均衡实例绑定的七层域名列表。</p> 
     * @return L7UsedList <p>该负载均衡实例绑定的七层域名列表。</p>
     */
    public String [] getL7UsedList() {
        return this.L7UsedList;
    }

    /**
     * Set <p>该负载均衡实例绑定的七层域名列表。</p>
     * @param L7UsedList <p>该负载均衡实例绑定的七层域名列表。</p>
     */
    public void setL7UsedList(String [] L7UsedList) {
        this.L7UsedList = L7UsedList;
    }

    /**
     * Get <p>负载均衡被引用实例的列表。</p> 
     * @return References <p>负载均衡被引用实例的列表。</p>
     */
    public OriginGroupReference [] getReferences() {
        return this.References;
    }

    /**
     * Set <p>负载均衡被引用实例的列表。</p>
     * @param References <p>负载均衡被引用实例的列表。</p>
     */
    public void setReferences(OriginGroupReference [] References) {
        this.References = References;
    }

    public LoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadBalancer(LoadBalancer source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
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
        if (source.OriginGroupHealthStatus != null) {
            this.OriginGroupHealthStatus = new OriginGroupHealthStatus[source.OriginGroupHealthStatus.length];
            for (int i = 0; i < source.OriginGroupHealthStatus.length; i++) {
                this.OriginGroupHealthStatus[i] = new OriginGroupHealthStatus(source.OriginGroupHealthStatus[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.L4UsedList != null) {
            this.L4UsedList = new String[source.L4UsedList.length];
            for (int i = 0; i < source.L4UsedList.length; i++) {
                this.L4UsedList[i] = new String(source.L4UsedList[i]);
            }
        }
        if (source.L7UsedList != null) {
            this.L7UsedList = new String[source.L7UsedList.length];
            for (int i = 0; i < source.L7UsedList.length; i++) {
                this.L7UsedList[i] = new String(source.L7UsedList[i]);
            }
        }
        if (source.References != null) {
            this.References = new OriginGroupReference[source.References.length];
            for (int i = 0; i < source.References.length; i++) {
                this.References[i] = new OriginGroupReference(source.References[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "HealthChecker.", this.HealthChecker);
        this.setParamSimple(map, prefix + "SteeringPolicy", this.SteeringPolicy);
        this.setParamSimple(map, prefix + "FailoverPolicy", this.FailoverPolicy);
        this.setParamArrayObj(map, prefix + "OriginGroupHealthStatus.", this.OriginGroupHealthStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "L4UsedList.", this.L4UsedList);
        this.setParamArraySimple(map, prefix + "L7UsedList.", this.L7UsedList);
        this.setParamArrayObj(map, prefix + "References.", this.References);

    }
}

