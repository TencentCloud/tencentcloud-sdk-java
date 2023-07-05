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

public class DomainInfo extends AbstractModel{

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
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * cname地址
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * 实例类型,sparta-waf表示saaswaf实例域名,clb-waf表示clbwaf实例域名,cdc-clb-waf表示CDC环境下clbwaf实例域名,cdn-waf表示cdnwaf实例域名
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 地域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 实例名
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 日志包
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * clbwaf使用模式,0镜像模式 1清洗模式
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * waf开关,0关闭 1开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则防御模式,0观察模式 1拦截模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * AI防御模式,10规则引擎观察&&AI引擎关闭模式 11规则引擎观察&&AI引擎观察模式 12规则引擎观察&&AI引擎拦截模式 20规则引擎拦截&&AI引擎关闭模式 21规则引擎拦截&&AI引擎观察模式 22规则引擎拦截&&AI引擎拦截模式
    */
    @SerializedName("Engine")
    @Expose
    private Long Engine;

    /**
    * CC列表
    */
    @SerializedName("CCList")
    @Expose
    private String [] CCList;

    /**
    * 回源ip
    */
    @SerializedName("RsList")
    @Expose
    private String [] RsList;

    /**
    * 服务端口配置
    */
    @SerializedName("Ports")
    @Expose
    private PortInfo [] Ports;

    /**
    * 负载均衡器
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancerPackageNew [] LoadBalancerSet;

    /**
    * 用户id
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * clbwaf域名监听器状态,0操作成功 4正在绑定LB 6正在解绑LB 7解绑LB失败 8绑定LB失败 10内部错误
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * Ipv6开关状态,0关闭 1开启
    */
    @SerializedName("Ipv6Status")
    @Expose
    private Long Ipv6Status;

    /**
    * BOT开关状态,0关闭 1开启
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * 版本信息
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 是否开启投递CLS功能,0关闭 1开启
    */
    @SerializedName("PostCLSStatus")
    @Expose
    private Long PostCLSStatus;

    /**
    * 是否开启投递CKafka功能,0关闭 1开启
    */
    @SerializedName("PostCKafkaStatus")
    @Expose
    private Long PostCKafkaStatus;

    /**
    * cdc实例域名接入的集群信息,非cdc实例忽略
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CdcClusters")
    @Expose
    private String CdcClusters;

    /**
    * api安全开关状态,0关闭 1开启
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * 应用型负载均衡类型,clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * 安全组状态,0不展示 1非腾讯云源站 2安全组绑定失败 3安全组发生变更
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SgState")
    @Expose
    private Long SgState;

    /**
    * 安全组状态的详细解释
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SgDetail")
    @Expose
    private String SgDetail;

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
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get cname地址 
     * @return Cname cname地址
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set cname地址
     * @param Cname cname地址
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get 实例类型,sparta-waf表示saaswaf实例域名,clb-waf表示clbwaf实例域名,cdc-clb-waf表示CDC环境下clbwaf实例域名,cdn-waf表示cdnwaf实例域名 
     * @return Edition 实例类型,sparta-waf表示saaswaf实例域名,clb-waf表示clbwaf实例域名,cdc-clb-waf表示CDC环境下clbwaf实例域名,cdn-waf表示cdnwaf实例域名
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 实例类型,sparta-waf表示saaswaf实例域名,clb-waf表示clbwaf实例域名,cdc-clb-waf表示CDC环境下clbwaf实例域名,cdn-waf表示cdnwaf实例域名
     * @param Edition 实例类型,sparta-waf表示saaswaf实例域名,clb-waf表示clbwaf实例域名,cdc-clb-waf表示CDC环境下clbwaf实例域名,cdn-waf表示cdnwaf实例域名
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 地域 
     * @return Region 地域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
     * @param Region 地域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 实例名 
     * @return InstanceName 实例名
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set 实例名
     * @param InstanceName 实例名
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get 日志包 
     * @return ClsStatus 日志包
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set 日志包
     * @param ClsStatus 日志包
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get clbwaf使用模式,0镜像模式 1清洗模式 
     * @return FlowMode clbwaf使用模式,0镜像模式 1清洗模式
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set clbwaf使用模式,0镜像模式 1清洗模式
     * @param FlowMode clbwaf使用模式,0镜像模式 1清洗模式
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get waf开关,0关闭 1开启 
     * @return Status waf开关,0关闭 1开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set waf开关,0关闭 1开启
     * @param Status waf开关,0关闭 1开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则防御模式,0观察模式 1拦截模式 
     * @return Mode 规则防御模式,0观察模式 1拦截模式
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 规则防御模式,0观察模式 1拦截模式
     * @param Mode 规则防御模式,0观察模式 1拦截模式
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get AI防御模式,10规则引擎观察&&AI引擎关闭模式 11规则引擎观察&&AI引擎观察模式 12规则引擎观察&&AI引擎拦截模式 20规则引擎拦截&&AI引擎关闭模式 21规则引擎拦截&&AI引擎观察模式 22规则引擎拦截&&AI引擎拦截模式 
     * @return Engine AI防御模式,10规则引擎观察&&AI引擎关闭模式 11规则引擎观察&&AI引擎观察模式 12规则引擎观察&&AI引擎拦截模式 20规则引擎拦截&&AI引擎关闭模式 21规则引擎拦截&&AI引擎观察模式 22规则引擎拦截&&AI引擎拦截模式
     */
    public Long getEngine() {
        return this.Engine;
    }

    /**
     * Set AI防御模式,10规则引擎观察&&AI引擎关闭模式 11规则引擎观察&&AI引擎观察模式 12规则引擎观察&&AI引擎拦截模式 20规则引擎拦截&&AI引擎关闭模式 21规则引擎拦截&&AI引擎观察模式 22规则引擎拦截&&AI引擎拦截模式
     * @param Engine AI防御模式,10规则引擎观察&&AI引擎关闭模式 11规则引擎观察&&AI引擎观察模式 12规则引擎观察&&AI引擎拦截模式 20规则引擎拦截&&AI引擎关闭模式 21规则引擎拦截&&AI引擎观察模式 22规则引擎拦截&&AI引擎拦截模式
     */
    public void setEngine(Long Engine) {
        this.Engine = Engine;
    }

    /**
     * Get CC列表 
     * @return CCList CC列表
     */
    public String [] getCCList() {
        return this.CCList;
    }

    /**
     * Set CC列表
     * @param CCList CC列表
     */
    public void setCCList(String [] CCList) {
        this.CCList = CCList;
    }

    /**
     * Get 回源ip 
     * @return RsList 回源ip
     */
    public String [] getRsList() {
        return this.RsList;
    }

    /**
     * Set 回源ip
     * @param RsList 回源ip
     */
    public void setRsList(String [] RsList) {
        this.RsList = RsList;
    }

    /**
     * Get 服务端口配置 
     * @return Ports 服务端口配置
     */
    public PortInfo [] getPorts() {
        return this.Ports;
    }

    /**
     * Set 服务端口配置
     * @param Ports 服务端口配置
     */
    public void setPorts(PortInfo [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get 负载均衡器 
     * @return LoadBalancerSet 负载均衡器
     */
    public LoadBalancerPackageNew [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set 负载均衡器
     * @param LoadBalancerSet 负载均衡器
     */
    public void setLoadBalancerSet(LoadBalancerPackageNew [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get 用户id 
     * @return AppId 用户id
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 用户id
     * @param AppId 用户id
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get clbwaf域名监听器状态,0操作成功 4正在绑定LB 6正在解绑LB 7解绑LB失败 8绑定LB失败 10内部错误 
     * @return State clbwaf域名监听器状态,0操作成功 4正在绑定LB 6正在解绑LB 7解绑LB失败 8绑定LB失败 10内部错误
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set clbwaf域名监听器状态,0操作成功 4正在绑定LB 6正在解绑LB 7解绑LB失败 8绑定LB失败 10内部错误
     * @param State clbwaf域名监听器状态,0操作成功 4正在绑定LB 6正在解绑LB 7解绑LB失败 8绑定LB失败 10内部错误
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get Ipv6开关状态,0关闭 1开启 
     * @return Ipv6Status Ipv6开关状态,0关闭 1开启
     */
    public Long getIpv6Status() {
        return this.Ipv6Status;
    }

    /**
     * Set Ipv6开关状态,0关闭 1开启
     * @param Ipv6Status Ipv6开关状态,0关闭 1开启
     */
    public void setIpv6Status(Long Ipv6Status) {
        this.Ipv6Status = Ipv6Status;
    }

    /**
     * Get BOT开关状态,0关闭 1开启 
     * @return BotStatus BOT开关状态,0关闭 1开启
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set BOT开关状态,0关闭 1开启
     * @param BotStatus BOT开关状态,0关闭 1开启
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get 版本信息 
     * @return Level 版本信息
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 版本信息
     * @param Level 版本信息
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 是否开启投递CLS功能,0关闭 1开启 
     * @return PostCLSStatus 是否开启投递CLS功能,0关闭 1开启
     */
    public Long getPostCLSStatus() {
        return this.PostCLSStatus;
    }

    /**
     * Set 是否开启投递CLS功能,0关闭 1开启
     * @param PostCLSStatus 是否开启投递CLS功能,0关闭 1开启
     */
    public void setPostCLSStatus(Long PostCLSStatus) {
        this.PostCLSStatus = PostCLSStatus;
    }

    /**
     * Get 是否开启投递CKafka功能,0关闭 1开启 
     * @return PostCKafkaStatus 是否开启投递CKafka功能,0关闭 1开启
     */
    public Long getPostCKafkaStatus() {
        return this.PostCKafkaStatus;
    }

    /**
     * Set 是否开启投递CKafka功能,0关闭 1开启
     * @param PostCKafkaStatus 是否开启投递CKafka功能,0关闭 1开启
     */
    public void setPostCKafkaStatus(Long PostCKafkaStatus) {
        this.PostCKafkaStatus = PostCKafkaStatus;
    }

    /**
     * Get cdc实例域名接入的集群信息,非cdc实例忽略
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CdcClusters cdc实例域名接入的集群信息,非cdc实例忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set cdc实例域名接入的集群信息,非cdc实例忽略
注意：此字段可能返回 null，表示取不到有效值。
     * @param CdcClusters cdc实例域名接入的集群信息,非cdc实例忽略
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCdcClusters(String CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get api安全开关状态,0关闭 1开启
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiStatus api安全开关状态,0关闭 1开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set api安全开关状态,0关闭 1开启
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiStatus api安全开关状态,0关闭 1开启
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get 应用型负载均衡类型,clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AlbType 应用型负载均衡类型,clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 应用型负载均衡类型,clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。
     * @param AlbType 应用型负载均衡类型,clb或者apisix，默认clb
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get 安全组状态,0不展示 1非腾讯云源站 2安全组绑定失败 3安全组发生变更
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SgState 安全组状态,0不展示 1非腾讯云源站 2安全组绑定失败 3安全组发生变更
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSgState() {
        return this.SgState;
    }

    /**
     * Set 安全组状态,0不展示 1非腾讯云源站 2安全组绑定失败 3安全组发生变更
注意：此字段可能返回 null，表示取不到有效值。
     * @param SgState 安全组状态,0不展示 1非腾讯云源站 2安全组绑定失败 3安全组发生变更
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSgState(Long SgState) {
        this.SgState = SgState;
    }

    /**
     * Get 安全组状态的详细解释
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SgDetail 安全组状态的详细解释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSgDetail() {
        return this.SgDetail;
    }

    /**
     * Set 安全组状态的详细解释
注意：此字段可能返回 null，表示取不到有效值。
     * @param SgDetail 安全组状态的详细解释
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSgDetail(String SgDetail) {
        this.SgDetail = SgDetail;
    }

    public DomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DomainInfo(DomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.DomainId != null) {
            this.DomainId = new String(source.DomainId);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Cname != null) {
            this.Cname = new String(source.Cname);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.InstanceName != null) {
            this.InstanceName = new String(source.InstanceName);
        }
        if (source.ClsStatus != null) {
            this.ClsStatus = new Long(source.ClsStatus);
        }
        if (source.FlowMode != null) {
            this.FlowMode = new Long(source.FlowMode);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Mode != null) {
            this.Mode = new Long(source.Mode);
        }
        if (source.Engine != null) {
            this.Engine = new Long(source.Engine);
        }
        if (source.CCList != null) {
            this.CCList = new String[source.CCList.length];
            for (int i = 0; i < source.CCList.length; i++) {
                this.CCList[i] = new String(source.CCList[i]);
            }
        }
        if (source.RsList != null) {
            this.RsList = new String[source.RsList.length];
            for (int i = 0; i < source.RsList.length; i++) {
                this.RsList[i] = new String(source.RsList[i]);
            }
        }
        if (source.Ports != null) {
            this.Ports = new PortInfo[source.Ports.length];
            for (int i = 0; i < source.Ports.length; i++) {
                this.Ports[i] = new PortInfo(source.Ports[i]);
            }
        }
        if (source.LoadBalancerSet != null) {
            this.LoadBalancerSet = new LoadBalancerPackageNew[source.LoadBalancerSet.length];
            for (int i = 0; i < source.LoadBalancerSet.length; i++) {
                this.LoadBalancerSet[i] = new LoadBalancerPackageNew(source.LoadBalancerSet[i]);
            }
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Ipv6Status != null) {
            this.Ipv6Status = new Long(source.Ipv6Status);
        }
        if (source.BotStatus != null) {
            this.BotStatus = new Long(source.BotStatus);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.PostCLSStatus != null) {
            this.PostCLSStatus = new Long(source.PostCLSStatus);
        }
        if (source.PostCKafkaStatus != null) {
            this.PostCKafkaStatus = new Long(source.PostCKafkaStatus);
        }
        if (source.CdcClusters != null) {
            this.CdcClusters = new String(source.CdcClusters);
        }
        if (source.ApiStatus != null) {
            this.ApiStatus = new Long(source.ApiStatus);
        }
        if (source.AlbType != null) {
            this.AlbType = new String(source.AlbType);
        }
        if (source.SgState != null) {
            this.SgState = new Long(source.SgState);
        }
        if (source.SgDetail != null) {
            this.SgDetail = new String(source.SgDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "DomainId", this.DomainId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Cname", this.Cname);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "Engine", this.Engine);
        this.setParamArraySimple(map, prefix + "CCList.", this.CCList);
        this.setParamArraySimple(map, prefix + "RsList.", this.RsList);
        this.setParamArrayObj(map, prefix + "Ports.", this.Ports);
        this.setParamArrayObj(map, prefix + "LoadBalancerSet.", this.LoadBalancerSet);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Ipv6Status", this.Ipv6Status);
        this.setParamSimple(map, prefix + "BotStatus", this.BotStatus);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "PostCLSStatus", this.PostCLSStatus);
        this.setParamSimple(map, prefix + "PostCKafkaStatus", this.PostCKafkaStatus);
        this.setParamSimple(map, prefix + "CdcClusters", this.CdcClusters);
        this.setParamSimple(map, prefix + "ApiStatus", this.ApiStatus);
        this.setParamSimple(map, prefix + "AlbType", this.AlbType);
        this.setParamSimple(map, prefix + "SgState", this.SgState);
        this.setParamSimple(map, prefix + "SgDetail", this.SgDetail);

    }
}

