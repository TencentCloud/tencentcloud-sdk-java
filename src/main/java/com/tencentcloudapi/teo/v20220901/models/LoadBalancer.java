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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadBalancer extends AbstractModel {

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。	
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 实例类型，取值有：
<li>HTTP：HTTP 专用型，支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）；</li>
<li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。</li>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 健康检查策略。详情请参考 [健康检查策略介绍](https://cloud.tencent.com/document/product/1552/104228)。
    */
    @SerializedName("HealthChecker")
    @Expose
    private HealthChecker HealthChecker;

    /**
    * 源站组间的流量调度策略，取值有：
<li>Pritory：按优先级顺序进行故障转移 。</li>
    */
    @SerializedName("SteeringPolicy")
    @Expose
    private String SteeringPolicy;

    /**
    * 实际访问某源站失败时的请求重试策略，详情请参考 [请求重试策略介绍](https://cloud.tencent.com/document/product/1552/104227)，取值有：
<li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li>
<li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>
    */
    @SerializedName("FailoverPolicy")
    @Expose
    private String FailoverPolicy;

    /**
    * 源站组健康状态。
    */
    @SerializedName("OriginGroupHealthStatus")
    @Expose
    private OriginGroupHealthStatus [] OriginGroupHealthStatus;

    /**
    * 负载均衡状态，取值有：
<li>Pending：部署中；</li>
<li>Deleting：删除中；</li>
<li>Running：已生效。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 该负载均衡实例绑的定四层层代理实例的列表。
    */
    @SerializedName("L4UsedList")
    @Expose
    private String [] L4UsedList;

    /**
    * 该负载均衡实例绑定的七层域名列表。
    */
    @SerializedName("L7UsedList")
    @Expose
    private String [] L7UsedList;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。	 
     * @return Name 实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。	
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。	
     * @param Name 实例名称，可输入 1-200 个字符，允许字符为 a-z，A-Z，0-9，_，-。	
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 实例类型，取值有：
<li>HTTP：HTTP 专用型，支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）；</li>
<li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。</li> 
     * @return Type 实例类型，取值有：
<li>HTTP：HTTP 专用型，支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）；</li>
<li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。</li>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 实例类型，取值有：
<li>HTTP：HTTP 专用型，支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）；</li>
<li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。</li>
     * @param Type 实例类型，取值有：
<li>HTTP：HTTP 专用型，支持添加 HTTP 专用型和通用型源站组，仅支持被站点加速相关服务引用（如域名服务和规则引擎）；</li>
<li>GENERAL：通用型，仅支持添加通用型源站组，能被站点加速服务（如域名服务和规则引擎）和四层代理引用。</li>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 健康检查策略。详情请参考 [健康检查策略介绍](https://cloud.tencent.com/document/product/1552/104228)。 
     * @return HealthChecker 健康检查策略。详情请参考 [健康检查策略介绍](https://cloud.tencent.com/document/product/1552/104228)。
     */
    public HealthChecker getHealthChecker() {
        return this.HealthChecker;
    }

    /**
     * Set 健康检查策略。详情请参考 [健康检查策略介绍](https://cloud.tencent.com/document/product/1552/104228)。
     * @param HealthChecker 健康检查策略。详情请参考 [健康检查策略介绍](https://cloud.tencent.com/document/product/1552/104228)。
     */
    public void setHealthChecker(HealthChecker HealthChecker) {
        this.HealthChecker = HealthChecker;
    }

    /**
     * Get 源站组间的流量调度策略，取值有：
<li>Pritory：按优先级顺序进行故障转移 。</li> 
     * @return SteeringPolicy 源站组间的流量调度策略，取值有：
<li>Pritory：按优先级顺序进行故障转移 。</li>
     */
    public String getSteeringPolicy() {
        return this.SteeringPolicy;
    }

    /**
     * Set 源站组间的流量调度策略，取值有：
<li>Pritory：按优先级顺序进行故障转移 。</li>
     * @param SteeringPolicy 源站组间的流量调度策略，取值有：
<li>Pritory：按优先级顺序进行故障转移 。</li>
     */
    public void setSteeringPolicy(String SteeringPolicy) {
        this.SteeringPolicy = SteeringPolicy;
    }

    /**
     * Get 实际访问某源站失败时的请求重试策略，详情请参考 [请求重试策略介绍](https://cloud.tencent.com/document/product/1552/104227)，取值有：
<li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li>
<li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li> 
     * @return FailoverPolicy 实际访问某源站失败时的请求重试策略，详情请参考 [请求重试策略介绍](https://cloud.tencent.com/document/product/1552/104227)，取值有：
<li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li>
<li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>
     */
    public String getFailoverPolicy() {
        return this.FailoverPolicy;
    }

    /**
     * Set 实际访问某源站失败时的请求重试策略，详情请参考 [请求重试策略介绍](https://cloud.tencent.com/document/product/1552/104227)，取值有：
<li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li>
<li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>
     * @param FailoverPolicy 实际访问某源站失败时的请求重试策略，详情请参考 [请求重试策略介绍](https://cloud.tencent.com/document/product/1552/104227)，取值有：
<li>OtherOriginGroup：单次请求失败后，请求优先重试下一优先级源站组；</li>
<li>OtherRecordInOriginGroup：单次请求失败后，请求优先重试同源站组内的其他源站。</li>
     */
    public void setFailoverPolicy(String FailoverPolicy) {
        this.FailoverPolicy = FailoverPolicy;
    }

    /**
     * Get 源站组健康状态。 
     * @return OriginGroupHealthStatus 源站组健康状态。
     */
    public OriginGroupHealthStatus [] getOriginGroupHealthStatus() {
        return this.OriginGroupHealthStatus;
    }

    /**
     * Set 源站组健康状态。
     * @param OriginGroupHealthStatus 源站组健康状态。
     */
    public void setOriginGroupHealthStatus(OriginGroupHealthStatus [] OriginGroupHealthStatus) {
        this.OriginGroupHealthStatus = OriginGroupHealthStatus;
    }

    /**
     * Get 负载均衡状态，取值有：
<li>Pending：部署中；</li>
<li>Deleting：删除中；</li>
<li>Running：已生效。</li> 
     * @return Status 负载均衡状态，取值有：
<li>Pending：部署中；</li>
<li>Deleting：删除中；</li>
<li>Running：已生效。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 负载均衡状态，取值有：
<li>Pending：部署中；</li>
<li>Deleting：删除中；</li>
<li>Running：已生效。</li>
     * @param Status 负载均衡状态，取值有：
<li>Pending：部署中；</li>
<li>Deleting：删除中；</li>
<li>Running：已生效。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 该负载均衡实例绑的定四层层代理实例的列表。 
     * @return L4UsedList 该负载均衡实例绑的定四层层代理实例的列表。
     */
    public String [] getL4UsedList() {
        return this.L4UsedList;
    }

    /**
     * Set 该负载均衡实例绑的定四层层代理实例的列表。
     * @param L4UsedList 该负载均衡实例绑的定四层层代理实例的列表。
     */
    public void setL4UsedList(String [] L4UsedList) {
        this.L4UsedList = L4UsedList;
    }

    /**
     * Get 该负载均衡实例绑定的七层域名列表。 
     * @return L7UsedList 该负载均衡实例绑定的七层域名列表。
     */
    public String [] getL7UsedList() {
        return this.L7UsedList;
    }

    /**
     * Set 该负载均衡实例绑定的七层域名列表。
     * @param L7UsedList 该负载均衡实例绑定的七层域名列表。
     */
    public void setL7UsedList(String [] L7UsedList) {
        this.L7UsedList = L7UsedList;
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

    }
}

