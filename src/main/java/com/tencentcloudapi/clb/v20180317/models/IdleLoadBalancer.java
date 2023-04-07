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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IdleLoadBalancer extends AbstractModel{

    /**
    * 负载均衡ID
    */
    @SerializedName("LoadBalancerId")
    @Expose
    private String LoadBalancerId;

    /**
    * 负载均衡名字
    */
    @SerializedName("LoadBalancerName")
    @Expose
    private String LoadBalancerName;

    /**
    * 负载均衡所在地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 负载均衡的vip
    */
    @SerializedName("Vip")
    @Expose
    private String Vip;

    /**
    * 闲置原因。NO_RULES：没有规则，NO_RS：有规则没有绑定子机。
    */
    @SerializedName("IdleReason")
    @Expose
    private String IdleReason;

    /**
    * 负载均衡实例的状态，包括
0：创建中，1：正常运行。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。
    */
    @SerializedName("Forward")
    @Expose
    private Long Forward;

    /**
    * 负载均衡域名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
     * Get 负载均衡ID 
     * @return LoadBalancerId 负载均衡ID
     */
    public String getLoadBalancerId() {
        return this.LoadBalancerId;
    }

    /**
     * Set 负载均衡ID
     * @param LoadBalancerId 负载均衡ID
     */
    public void setLoadBalancerId(String LoadBalancerId) {
        this.LoadBalancerId = LoadBalancerId;
    }

    /**
     * Get 负载均衡名字 
     * @return LoadBalancerName 负载均衡名字
     */
    public String getLoadBalancerName() {
        return this.LoadBalancerName;
    }

    /**
     * Set 负载均衡名字
     * @param LoadBalancerName 负载均衡名字
     */
    public void setLoadBalancerName(String LoadBalancerName) {
        this.LoadBalancerName = LoadBalancerName;
    }

    /**
     * Get 负载均衡所在地域 
     * @return Region 负载均衡所在地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 负载均衡所在地域
     * @param Region 负载均衡所在地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 负载均衡的vip 
     * @return Vip 负载均衡的vip
     */
    public String getVip() {
        return this.Vip;
    }

    /**
     * Set 负载均衡的vip
     * @param Vip 负载均衡的vip
     */
    public void setVip(String Vip) {
        this.Vip = Vip;
    }

    /**
     * Get 闲置原因。NO_RULES：没有规则，NO_RS：有规则没有绑定子机。 
     * @return IdleReason 闲置原因。NO_RULES：没有规则，NO_RS：有规则没有绑定子机。
     */
    public String getIdleReason() {
        return this.IdleReason;
    }

    /**
     * Set 闲置原因。NO_RULES：没有规则，NO_RS：有规则没有绑定子机。
     * @param IdleReason 闲置原因。NO_RULES：没有规则，NO_RS：有规则没有绑定子机。
     */
    public void setIdleReason(String IdleReason) {
        this.IdleReason = IdleReason;
    }

    /**
     * Get 负载均衡实例的状态，包括
0：创建中，1：正常运行。 
     * @return Status 负载均衡实例的状态，包括
0：创建中，1：正常运行。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 负载均衡实例的状态，包括
0：创建中，1：正常运行。
     * @param Status 负载均衡实例的状态，包括
0：创建中，1：正常运行。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。 
     * @return Forward 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。
     */
    public Long getForward() {
        return this.Forward;
    }

    /**
     * Set 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。
     * @param Forward 负载均衡类型标识，1：负载均衡，0：传统型负载均衡。
     */
    public void setForward(Long Forward) {
        this.Forward = Forward;
    }

    /**
     * Get 负载均衡域名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Domain 负载均衡域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 负载均衡域名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Domain 负载均衡域名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public IdleLoadBalancer() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IdleLoadBalancer(IdleLoadBalancer source) {
        if (source.LoadBalancerId != null) {
            this.LoadBalancerId = new String(source.LoadBalancerId);
        }
        if (source.LoadBalancerName != null) {
            this.LoadBalancerName = new String(source.LoadBalancerName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Vip != null) {
            this.Vip = new String(source.Vip);
        }
        if (source.IdleReason != null) {
            this.IdleReason = new String(source.IdleReason);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Forward != null) {
            this.Forward = new Long(source.Forward);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadBalancerId", this.LoadBalancerId);
        this.setParamSimple(map, prefix + "LoadBalancerName", this.LoadBalancerName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Vip", this.Vip);
        this.setParamSimple(map, prefix + "IdleReason", this.IdleReason);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Forward", this.Forward);
        this.setParamSimple(map, prefix + "Domain", this.Domain);

    }
}

