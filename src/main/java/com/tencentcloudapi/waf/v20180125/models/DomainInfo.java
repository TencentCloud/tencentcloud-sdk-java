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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DomainInfo extends AbstractModel {

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
    * 域名所属实例类型。
sparta-waf：SaaS型WAF实例
clb-waf：负载均衡型WAF实例
cdc-clb-waf：CDC环境下负载均衡型WAF实例
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 地域。
"多伦多": "ca"
"广州": "gz"
"成都": "cd"
"福州": "fzec"
"深圳": "szx"
"印度": "in"
"济南": "jnec"
"重庆": "cq"
"天津": "tsn"
"欧洲东北": "ru"
"南京": "nj"
"美国硅谷": "usw"
"泰国": "th"
"广州Open": "gzopen"
"深圳金融": "szjr"
"法兰克福": "de"
"日本": "jp"
"弗吉尼亚": "use"
"北京": "bj"
"中国香港": "hk"
"杭州": "hzec"
"北京金融": "bjjr"
"上海金融": "shjr"
"台北": "tpe"
"首尔": "kr"
"上海": "sh"
"新加坡": "sg"
"清远": "qy"
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
    * 访问日志开关状态。
0：关闭
1：开启
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * 负载均衡型WAF使用模式。
0：镜像模式 
1：清洗模式
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * waf开关状态。
0：关闭 
1：开启
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则引擎防护模式。
0：观察模式 
1：拦截模式
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
    */
    @SerializedName("Engine")
    @Expose
    private Long Engine;

    /**
    * 沙箱集群回源出口IP列表
    */
    @SerializedName("CCList")
    @Expose
    private String [] CCList;

    /**
    * 生产集群回源出口IP列表
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
    * 负载均衡器相关配置
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
    * 负载均衡型WAF域名LB监听器状态。
0：操作成功 
4：正在绑定LB 
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误
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
    * Ipv6开关状态。
0：关闭 
1：开启
    */
    @SerializedName("Ipv6Status")
    @Expose
    private Long Ipv6Status;

    /**
    * BOT开关状态。
0：关闭 
1：关闭
2：开启
3：开启
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * 实例版本信息。
101：小微敏捷版 
102：小微超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 投递CLS状态。
0：关闭 
1：开启
    */
    @SerializedName("PostCLSStatus")
    @Expose
    private Long PostCLSStatus;

    /**
    * 投递CKafka状态。
0：关闭 
1：开启
    */
    @SerializedName("PostCKafkaStatus")
    @Expose
    private Long PostCKafkaStatus;

    /**
    * cdc实例域名接入的集群信息,非cdc实例忽略。
    */
    @SerializedName("CdcClusters")
    @Expose
    private String CdcClusters;

    /**
    * api安全开关状态。
0：关闭 
1：开启
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * 应用型负载均衡类型，默认clb。
clb：七层负载均衡器类型
apisix：apisix网关型
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * 安全组状态。
0：不展示
1：非腾讯云源站
2：安全组绑定失败
3：安全组发生变更
    */
    @SerializedName("SgState")
    @Expose
    private Long SgState;

    /**
    * 安全组状态的详细解释
    */
    @SerializedName("SgDetail")
    @Expose
    private String SgDetail;

    /**
    * 域名云环境。hybrid：混合云域名
public：公有云域名
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * 域名备注信息
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * SAASWAF源站IP列表
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * SAASWAF源站域名列表
    */
    @SerializedName("UpstreamDomainList")
    @Expose
    private String [] UpstreamDomainList;

    /**
    * 安全组ID
    */
    @SerializedName("SgID")
    @Expose
    private String SgID;

    /**
    * clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”
    */
    @SerializedName("AccessStatus")
    @Expose
    private Long AccessStatus;

    /**
    * 域名标签
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

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
     * Get 域名所属实例类型。
sparta-waf：SaaS型WAF实例
clb-waf：负载均衡型WAF实例
cdc-clb-waf：CDC环境下负载均衡型WAF实例 
     * @return Edition 域名所属实例类型。
sparta-waf：SaaS型WAF实例
clb-waf：负载均衡型WAF实例
cdc-clb-waf：CDC环境下负载均衡型WAF实例
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set 域名所属实例类型。
sparta-waf：SaaS型WAF实例
clb-waf：负载均衡型WAF实例
cdc-clb-waf：CDC环境下负载均衡型WAF实例
     * @param Edition 域名所属实例类型。
sparta-waf：SaaS型WAF实例
clb-waf：负载均衡型WAF实例
cdc-clb-waf：CDC环境下负载均衡型WAF实例
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 地域。
"多伦多": "ca"
"广州": "gz"
"成都": "cd"
"福州": "fzec"
"深圳": "szx"
"印度": "in"
"济南": "jnec"
"重庆": "cq"
"天津": "tsn"
"欧洲东北": "ru"
"南京": "nj"
"美国硅谷": "usw"
"泰国": "th"
"广州Open": "gzopen"
"深圳金融": "szjr"
"法兰克福": "de"
"日本": "jp"
"弗吉尼亚": "use"
"北京": "bj"
"中国香港": "hk"
"杭州": "hzec"
"北京金融": "bjjr"
"上海金融": "shjr"
"台北": "tpe"
"首尔": "kr"
"上海": "sh"
"新加坡": "sg"
"清远": "qy" 
     * @return Region 地域。
"多伦多": "ca"
"广州": "gz"
"成都": "cd"
"福州": "fzec"
"深圳": "szx"
"印度": "in"
"济南": "jnec"
"重庆": "cq"
"天津": "tsn"
"欧洲东北": "ru"
"南京": "nj"
"美国硅谷": "usw"
"泰国": "th"
"广州Open": "gzopen"
"深圳金融": "szjr"
"法兰克福": "de"
"日本": "jp"
"弗吉尼亚": "use"
"北京": "bj"
"中国香港": "hk"
"杭州": "hzec"
"北京金融": "bjjr"
"上海金融": "shjr"
"台北": "tpe"
"首尔": "kr"
"上海": "sh"
"新加坡": "sg"
"清远": "qy"
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域。
"多伦多": "ca"
"广州": "gz"
"成都": "cd"
"福州": "fzec"
"深圳": "szx"
"印度": "in"
"济南": "jnec"
"重庆": "cq"
"天津": "tsn"
"欧洲东北": "ru"
"南京": "nj"
"美国硅谷": "usw"
"泰国": "th"
"广州Open": "gzopen"
"深圳金融": "szjr"
"法兰克福": "de"
"日本": "jp"
"弗吉尼亚": "use"
"北京": "bj"
"中国香港": "hk"
"杭州": "hzec"
"北京金融": "bjjr"
"上海金融": "shjr"
"台北": "tpe"
"首尔": "kr"
"上海": "sh"
"新加坡": "sg"
"清远": "qy"
     * @param Region 地域。
"多伦多": "ca"
"广州": "gz"
"成都": "cd"
"福州": "fzec"
"深圳": "szx"
"印度": "in"
"济南": "jnec"
"重庆": "cq"
"天津": "tsn"
"欧洲东北": "ru"
"南京": "nj"
"美国硅谷": "usw"
"泰国": "th"
"广州Open": "gzopen"
"深圳金融": "szjr"
"法兰克福": "de"
"日本": "jp"
"弗吉尼亚": "use"
"北京": "bj"
"中国香港": "hk"
"杭州": "hzec"
"北京金融": "bjjr"
"上海金融": "shjr"
"台北": "tpe"
"首尔": "kr"
"上海": "sh"
"新加坡": "sg"
"清远": "qy"
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
     * Get 访问日志开关状态。
0：关闭
1：开启 
     * @return ClsStatus 访问日志开关状态。
0：关闭
1：开启
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set 访问日志开关状态。
0：关闭
1：开启
     * @param ClsStatus 访问日志开关状态。
0：关闭
1：开启
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get 负载均衡型WAF使用模式。
0：镜像模式 
1：清洗模式 
     * @return FlowMode 负载均衡型WAF使用模式。
0：镜像模式 
1：清洗模式
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set 负载均衡型WAF使用模式。
0：镜像模式 
1：清洗模式
     * @param FlowMode 负载均衡型WAF使用模式。
0：镜像模式 
1：清洗模式
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get waf开关状态。
0：关闭 
1：开启 
     * @return Status waf开关状态。
0：关闭 
1：开启
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set waf开关状态。
0：关闭 
1：开启
     * @param Status waf开关状态。
0：关闭 
1：开启
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则引擎防护模式。
0：观察模式 
1：拦截模式 
     * @return Mode 规则引擎防护模式。
0：观察模式 
1：拦截模式
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set 规则引擎防护模式。
0：观察模式 
1：拦截模式
     * @param Mode 规则引擎防护模式。
0：观察模式 
1：拦截模式
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式 
     * @return Engine 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     */
    public Long getEngine() {
        return this.Engine;
    }

    /**
     * Set 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     * @param Engine 规则引擎和AI引擎防护模式联合状态。
1:初始状态,规则引擎拦截&&AI引擎未操作开关状态
10：规则引擎观察&&AI引擎关闭模式 
11：规则引擎观察&&AI引擎观察模式 
12：规则引擎观察&&AI引擎拦截模式 
20：规则引擎拦截&&AI引擎关闭模式 
21：规则引擎拦截&&AI引擎观察模式 
22：规则引擎拦截&&AI引擎拦截模式
     */
    public void setEngine(Long Engine) {
        this.Engine = Engine;
    }

    /**
     * Get 沙箱集群回源出口IP列表 
     * @return CCList 沙箱集群回源出口IP列表
     */
    public String [] getCCList() {
        return this.CCList;
    }

    /**
     * Set 沙箱集群回源出口IP列表
     * @param CCList 沙箱集群回源出口IP列表
     */
    public void setCCList(String [] CCList) {
        this.CCList = CCList;
    }

    /**
     * Get 生产集群回源出口IP列表 
     * @return RsList 生产集群回源出口IP列表
     */
    public String [] getRsList() {
        return this.RsList;
    }

    /**
     * Set 生产集群回源出口IP列表
     * @param RsList 生产集群回源出口IP列表
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
     * Get 负载均衡器相关配置 
     * @return LoadBalancerSet 负载均衡器相关配置
     */
    public LoadBalancerPackageNew [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set 负载均衡器相关配置
     * @param LoadBalancerSet 负载均衡器相关配置
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
     * Get 负载均衡型WAF域名LB监听器状态。
0：操作成功 
4：正在绑定LB 
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误 
     * @return State 负载均衡型WAF域名LB监听器状态。
0：操作成功 
4：正在绑定LB 
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 负载均衡型WAF域名LB监听器状态。
0：操作成功 
4：正在绑定LB 
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误
     * @param State 负载均衡型WAF域名LB监听器状态。
0：操作成功 
4：正在绑定LB 
6：正在解绑LB 
7：解绑LB失败 
8：绑定LB失败 
10：内部错误
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
     * Get Ipv6开关状态。
0：关闭 
1：开启 
     * @return Ipv6Status Ipv6开关状态。
0：关闭 
1：开启
     */
    public Long getIpv6Status() {
        return this.Ipv6Status;
    }

    /**
     * Set Ipv6开关状态。
0：关闭 
1：开启
     * @param Ipv6Status Ipv6开关状态。
0：关闭 
1：开启
     */
    public void setIpv6Status(Long Ipv6Status) {
        this.Ipv6Status = Ipv6Status;
    }

    /**
     * Get BOT开关状态。
0：关闭 
1：关闭
2：开启
3：开启 
     * @return BotStatus BOT开关状态。
0：关闭 
1：关闭
2：开启
3：开启
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set BOT开关状态。
0：关闭 
1：关闭
2：开启
3：开启
     * @param BotStatus BOT开关状态。
0：关闭 
1：关闭
2：开启
3：开启
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get 实例版本信息。
101：小微敏捷版 
102：小微超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版 
     * @return Level 实例版本信息。
101：小微敏捷版 
102：小微超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 实例版本信息。
101：小微敏捷版 
102：小微超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版
     * @param Level 实例版本信息。
101：小微敏捷版 
102：小微超轻版
2：高级版
3：企业版
4：旗舰版
6：独享版
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 投递CLS状态。
0：关闭 
1：开启 
     * @return PostCLSStatus 投递CLS状态。
0：关闭 
1：开启
     */
    public Long getPostCLSStatus() {
        return this.PostCLSStatus;
    }

    /**
     * Set 投递CLS状态。
0：关闭 
1：开启
     * @param PostCLSStatus 投递CLS状态。
0：关闭 
1：开启
     */
    public void setPostCLSStatus(Long PostCLSStatus) {
        this.PostCLSStatus = PostCLSStatus;
    }

    /**
     * Get 投递CKafka状态。
0：关闭 
1：开启 
     * @return PostCKafkaStatus 投递CKafka状态。
0：关闭 
1：开启
     */
    public Long getPostCKafkaStatus() {
        return this.PostCKafkaStatus;
    }

    /**
     * Set 投递CKafka状态。
0：关闭 
1：开启
     * @param PostCKafkaStatus 投递CKafka状态。
0：关闭 
1：开启
     */
    public void setPostCKafkaStatus(Long PostCKafkaStatus) {
        this.PostCKafkaStatus = PostCKafkaStatus;
    }

    /**
     * Get cdc实例域名接入的集群信息,非cdc实例忽略。 
     * @return CdcClusters cdc实例域名接入的集群信息,非cdc实例忽略。
     */
    public String getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set cdc实例域名接入的集群信息,非cdc实例忽略。
     * @param CdcClusters cdc实例域名接入的集群信息,非cdc实例忽略。
     */
    public void setCdcClusters(String CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get api安全开关状态。
0：关闭 
1：开启 
     * @return ApiStatus api安全开关状态。
0：关闭 
1：开启
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set api安全开关状态。
0：关闭 
1：开启
     * @param ApiStatus api安全开关状态。
0：关闭 
1：开启
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get 应用型负载均衡类型，默认clb。
clb：七层负载均衡器类型
apisix：apisix网关型 
     * @return AlbType 应用型负载均衡类型，默认clb。
clb：七层负载均衡器类型
apisix：apisix网关型
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set 应用型负载均衡类型，默认clb。
clb：七层负载均衡器类型
apisix：apisix网关型
     * @param AlbType 应用型负载均衡类型，默认clb。
clb：七层负载均衡器类型
apisix：apisix网关型
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get 安全组状态。
0：不展示
1：非腾讯云源站
2：安全组绑定失败
3：安全组发生变更 
     * @return SgState 安全组状态。
0：不展示
1：非腾讯云源站
2：安全组绑定失败
3：安全组发生变更
     */
    public Long getSgState() {
        return this.SgState;
    }

    /**
     * Set 安全组状态。
0：不展示
1：非腾讯云源站
2：安全组绑定失败
3：安全组发生变更
     * @param SgState 安全组状态。
0：不展示
1：非腾讯云源站
2：安全组绑定失败
3：安全组发生变更
     */
    public void setSgState(Long SgState) {
        this.SgState = SgState;
    }

    /**
     * Get 安全组状态的详细解释 
     * @return SgDetail 安全组状态的详细解释
     */
    public String getSgDetail() {
        return this.SgDetail;
    }

    /**
     * Set 安全组状态的详细解释
     * @param SgDetail 安全组状态的详细解释
     */
    public void setSgDetail(String SgDetail) {
        this.SgDetail = SgDetail;
    }

    /**
     * Get 域名云环境。hybrid：混合云域名
public：公有云域名 
     * @return CloudType 域名云环境。hybrid：混合云域名
public：公有云域名
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set 域名云环境。hybrid：混合云域名
public：公有云域名
     * @param CloudType 域名云环境。hybrid：混合云域名
public：公有云域名
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get 域名备注信息 
     * @return Note 域名备注信息
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 域名备注信息
     * @param Note 域名备注信息
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get SAASWAF源站IP列表 
     * @return SrcList SAASWAF源站IP列表
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set SAASWAF源站IP列表
     * @param SrcList SAASWAF源站IP列表
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get SAASWAF源站域名列表 
     * @return UpstreamDomainList SAASWAF源站域名列表
     */
    public String [] getUpstreamDomainList() {
        return this.UpstreamDomainList;
    }

    /**
     * Set SAASWAF源站域名列表
     * @param UpstreamDomainList SAASWAF源站域名列表
     */
    public void setUpstreamDomainList(String [] UpstreamDomainList) {
        this.UpstreamDomainList = UpstreamDomainList;
    }

    /**
     * Get 安全组ID 
     * @return SgID 安全组ID
     */
    public String getSgID() {
        return this.SgID;
    }

    /**
     * Set 安全组ID
     * @param SgID 安全组ID
     */
    public void setSgID(String SgID) {
        this.SgID = SgID;
    }

    /**
     * Get clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中” 
     * @return AccessStatus clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”
     */
    public Long getAccessStatus() {
        return this.AccessStatus;
    }

    /**
     * Set clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”
     * @param AccessStatus clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”
     */
    public void setAccessStatus(Long AccessStatus) {
        this.AccessStatus = AccessStatus;
    }

    /**
     * Get 域名标签 
     * @return Labels 域名标签
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 域名标签
     * @param Labels 域名标签
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
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
        if (source.CloudType != null) {
            this.CloudType = new String(source.CloudType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.SrcList != null) {
            this.SrcList = new String[source.SrcList.length];
            for (int i = 0; i < source.SrcList.length; i++) {
                this.SrcList[i] = new String(source.SrcList[i]);
            }
        }
        if (source.UpstreamDomainList != null) {
            this.UpstreamDomainList = new String[source.UpstreamDomainList.length];
            for (int i = 0; i < source.UpstreamDomainList.length; i++) {
                this.UpstreamDomainList[i] = new String(source.UpstreamDomainList[i]);
            }
        }
        if (source.SgID != null) {
            this.SgID = new String(source.SgID);
        }
        if (source.AccessStatus != null) {
            this.AccessStatus = new Long(source.AccessStatus);
        }
        if (source.Labels != null) {
            this.Labels = new String[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new String(source.Labels[i]);
            }
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
        this.setParamSimple(map, prefix + "CloudType", this.CloudType);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamArraySimple(map, prefix + "SrcList.", this.SrcList);
        this.setParamArraySimple(map, prefix + "UpstreamDomainList.", this.UpstreamDomainList);
        this.setParamSimple(map, prefix + "SgID", this.SgID);
        this.setParamSimple(map, prefix + "AccessStatus", this.AccessStatus);
        this.setParamArraySimple(map, prefix + "Labels.", this.Labels);

    }
}

