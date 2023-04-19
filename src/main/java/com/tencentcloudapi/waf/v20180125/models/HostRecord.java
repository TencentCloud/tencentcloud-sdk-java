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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostRecord extends AbstractModel{

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 域名ID
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * 主域名，入参时为空
    */
    @SerializedName("MainDomain")
    @Expose
    private String MainDomain;

    /**
    * waf模式，同saas waf保持一致
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * waf和LD的绑定，0：没有绑定，1：绑定
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 域名状态，0：正常，1：未检测到流量，2：即将过期，3：过期
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 使用的规则，同saas waf保持一致
    */
    @SerializedName("Engine")
    @Expose
    private Long Engine;

    /**
    * 是否开启代理，0：不开启，1：开启
    */
    @SerializedName("IsCdn")
    @Expose
    private Long IsCdn;

    /**
    * 绑定的LB列表
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancer [] LoadBalancerSet;

    /**
    * 域名绑定的LB的地域，以,分割多个地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 产品分类，取值为：sparta-waf、clb-waf、cdn-waf
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * WAF的流量模式，1：清洗模式，0：镜像模式
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * 是否开启访问日志，1：开启，0：关闭
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 域名需要下发到的cdc集群列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcClusters")
    @Expose
    private String [] CdcClusters;

    /**
    * 应用型负载均衡类型: clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IpHeaders")
    @Expose
    private String [] IpHeaders;

    /**
    * 规则引擎类型， 1: menshen,   2:tiga
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineType")
    @Expose
    private Long EngineType;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 域名ID 
     * @return DomainId 域名ID
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set 域名ID
     * @param DomainId 域名ID
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get 主域名，入参时为空 
     * @return MainDomain 主域名，入参时为空
     */
    public String getMainDomain() {
        return this.MainDomain;
    }

    /**
     * Set 主域名，入参时为空
     * @param MainDomain 主域名，入参时为空
     */
    public void setMainDomain(String MainDomain) {
        this.MainDomain = MainDomain;
    }

    /**
     * Get waf模式，同saas waf保持一致 
     * @return Mode waf模式，同saas waf保持一致
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set waf模式，同saas waf保持一致
     * @param Mode waf模式，同saas waf保持一致
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get waf和LD的绑定，0：没有绑定，1：绑定 
     * @return Status waf和LD的绑定，0：没有绑定，1：绑定
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set waf和LD的绑定，0：没有绑定，1：绑定
     * @param Status waf和LD的绑定，0：没有绑定，1：绑定
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 域名状态，0：正常，1：未检测到流量，2：即将过期，3：过期 
     * @return State 域名状态，0：正常，1：未检测到流量，2：即将过期，3：过期
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 域名状态，0：正常，1：未检测到流量，2：即将过期，3：过期
     * @param State 域名状态，0：正常，1：未检测到流量，2：即将过期，3：过期
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 使用的规则，同saas waf保持一致 
     * @return Engine 使用的规则，同saas waf保持一致
     */
    public Long getEngine() {
        return this.Engine;
    }

    /**
     * Set 使用的规则，同saas waf保持一致
     * @param Engine 使用的规则，同saas waf保持一致
     */
    public void setEngine(Long Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 是否开启代理，0：不开启，1：开启 
     * @return IsCdn 是否开启代理，0：不开启，1：开启
     */
    public Long getIsCdn() {
        return this.IsCdn;
    }

    /**
     * Set 是否开启代理，0：不开启，1：开启
     * @param IsCdn 是否开启代理，0：不开启，1：开启
     */
    public void setIsCdn(Long IsCdn) {
        this.IsCdn = IsCdn;
    }

    /**
     * Get 绑定的LB列表 
     * @return LoadBalancerSet 绑定的LB列表
     */
    public LoadBalancer [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set 绑定的LB列表
     * @param LoadBalancerSet 绑定的LB列表
     */
    public void setLoadBalancerSet(LoadBalancer [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get 域名绑定的LB的地域，以,分割多个地域 
     * @return Region 域名绑定的LB的地域，以,分割多个地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 域名绑定的LB的地域，以,分割多个地域
     * @param Region 域名绑定的LB的地域，以,分割多个地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 产品分类，取值为：sparta-waf、clb-waf、cdn-waf 
     * @return Edition 产品分类，取值为：sparta-waf、clb-waf、cdn-waf
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 产品分类，取值为：sparta-waf、clb-waf、cdn-waf
     * @param Edition 产品分类，取值为：sparta-waf、clb-waf、cdn-waf
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get WAF的流量模式，1：清洗模式，0：镜像模式 
     * @return FlowMode WAF的流量模式，1：清洗模式，0：镜像模式
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set WAF的流量模式，1：清洗模式，0：镜像模式
     * @param FlowMode WAF的流量模式，1：清洗模式，0：镜像模式
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get 是否开启访问日志，1：开启，0：关闭 
     * @return ClsStatus 是否开启访问日志，1：开启，0：关闭
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set 是否开启访问日志，1：开启，0：关闭
     * @param ClsStatus 是否开启访问日志，1：开启，0：关闭
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 防护等级，可选值100,200,300
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 域名需要下发到的cdc集群列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcClusters 域名需要下发到的cdc集群列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set 域名需要下发到的cdc集群列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcClusters 域名需要下发到的cdc集群列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcClusters(String [] CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get 应用型负载均衡类型: clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbType 应用型负载均衡类型: clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 应用型负载均衡类型: clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbType 应用型负载均衡类型: clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IpHeaders IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getIpHeaders() {
        return this.IpHeaders;
    }

    /**
     * Set IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     * @param IpHeaders IsCdn=3时，需要填此参数，表示自定义header
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIpHeaders(String [] IpHeaders) {
        this.IpHeaders = IpHeaders;
    }

    /**
     * Get 规则引擎类型， 1: menshen,   2:tiga
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineType 规则引擎类型， 1: menshen,   2:tiga
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEngineType() {
        return this.EngineType;
    }

    /**
     * Set 规则引擎类型， 1: menshen,   2:tiga
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineType 规则引擎类型， 1: menshen,   2:tiga
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineType(Long EngineType) {
        this.EngineType = EngineType;
    }

    public HostRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostRecord(HostRecord source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.MainDomain != null) {
            this.MainDomain = new String(source.MainDomain);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.Engine != null) {
            this.Engine = new Long(source.Engine);
        }
        if (source.IsCdn != null) {
            this.IsCdn = new Long(source.IsCdn);
        }
        if (source.LoadBalancerSet != null) {
            this.LoadBalancerSet = new LoadBalancer[source.LoadBalancerSet.length];
            for (int i = 0; i < source.LoadBalancerSet.length; i++) {
                this.LoadBalancerSet[i] = new LoadBalancer(source.LoadBalancerSet[i]);
            }
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
        if (source.ClsStatus != null) {
            this.ClsStatus = new Long(source.ClsStatus);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.CdcClusters != null) {
            this.CdcClusters = new String[source.CdcClusters.length];
            for (int i = 0; i < source.CdcClusters.length; i++) {
                this.CdcClusters[i] = new String(source.CdcClusters[i]);
            }
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.IpHeaders != null) {
            this.IpHeaders = new String[source.IpHeaders.length];
            for (int i = 0; i < source.IpHeaders.length; i++) {
                this.IpHeaders[i] = new String(source.IpHeaders[i]);
            }
        }
        if (source.EngineType != null) {
            this.EngineType = new Long(source.EngineType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "MainDomain", this.MainDomain);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamSimple(map, prefix + "IsCdn", this.IsCdn);
        this.setParamArrayObj(map, prefix + "LoadBalancerSet.", this.LoadBalancerSet);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamArraySimple(map, prefix + "CdcClusters.", this.CdcClusters);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamArraySimple(map, prefix + "IpHeaders.", this.IpHeaders);
        this.setParamSimple(map, prefix + "EngineType", this.EngineType);

    }
}

