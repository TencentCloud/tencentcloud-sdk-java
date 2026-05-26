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
    * <p>域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>域名ID</p>
    */
    @SerializedName("DomainId")
    @Expose
    private String DomainId;

    /**
    * <p>实例ID</p>
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * <p>cname地址</p>
    */
    @SerializedName("Cname")
    @Expose
    private String Cname;

    /**
    * <p>域名所属实例类型。<br>sparta-waf：SaaS型WAF实例<br>clb-waf：负载均衡型WAF实例<br>cdc-clb-waf：CDC环境下负载均衡型WAF实例</p>
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * <p>地域。<br>&quot;多伦多&quot;: &quot;ca&quot;<br>&quot;广州&quot;: &quot;gz&quot;<br>&quot;成都&quot;: &quot;cd&quot;<br>&quot;福州&quot;: &quot;fzec&quot;<br>&quot;深圳&quot;: &quot;szx&quot;<br>&quot;印度&quot;: &quot;in&quot;<br>&quot;济南&quot;: &quot;jnec&quot;<br>&quot;重庆&quot;: &quot;cq&quot;<br>&quot;天津&quot;: &quot;tsn&quot;<br>&quot;欧洲东北&quot;: &quot;ru&quot;<br>&quot;南京&quot;: &quot;nj&quot;<br>&quot;美国硅谷&quot;: &quot;usw&quot;<br>&quot;泰国&quot;: &quot;th&quot;<br>&quot;广州Open&quot;: &quot;gzopen&quot;<br>&quot;深圳金融&quot;: &quot;szjr&quot;<br>&quot;法兰克福&quot;: &quot;de&quot;<br>&quot;日本&quot;: &quot;jp&quot;<br>&quot;弗吉尼亚&quot;: &quot;use&quot;<br>&quot;北京&quot;: &quot;bj&quot;<br>&quot;中国香港&quot;: &quot;hk&quot;<br>&quot;杭州&quot;: &quot;hzec&quot;<br>&quot;北京金融&quot;: &quot;bjjr&quot;<br>&quot;上海金融&quot;: &quot;shjr&quot;<br>&quot;台北&quot;: &quot;tpe&quot;<br>&quot;首尔&quot;: &quot;kr&quot;<br>&quot;上海&quot;: &quot;sh&quot;<br>&quot;新加坡&quot;: &quot;sg&quot;<br>&quot;清远&quot;: &quot;qy&quot;</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例名</p>
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * <p>访问日志开关状态。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("ClsStatus")
    @Expose
    private Long ClsStatus;

    /**
    * <p>负载均衡型WAF使用模式。<br>0：镜像模式<br>1：清洗模式</p>
    */
    @SerializedName("FlowMode")
    @Expose
    private Long FlowMode;

    /**
    * <p>waf开关状态。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>规则引擎防护模式。<br>0：观察模式<br>1：拦截模式</p>
    */
    @SerializedName("Mode")
    @Expose
    private Long Mode;

    /**
    * <p>规则引擎和AI引擎防护模式联合状态。<br>1:初始状态,规则引擎拦截&amp;&amp;AI引擎未操作开关状态<br>10：规则引擎观察&amp;&amp;AI引擎关闭模式<br>11：规则引擎观察&amp;&amp;AI引擎观察模式<br>12：规则引擎观察&amp;&amp;AI引擎拦截模式<br>20：规则引擎拦截&amp;&amp;AI引擎关闭模式<br>21：规则引擎拦截&amp;&amp;AI引擎观察模式<br>22：规则引擎拦截&amp;&amp;AI引擎拦截模式</p>
    */
    @SerializedName("Engine")
    @Expose
    private Long Engine;

    /**
    * <p>沙箱集群回源出口IP列表</p>
    */
    @SerializedName("CCList")
    @Expose
    private String [] CCList;

    /**
    * <p>生产集群回源出口IP列表</p>
    */
    @SerializedName("RsList")
    @Expose
    private String [] RsList;

    /**
    * <p>服务端口配置</p>
    */
    @SerializedName("Ports")
    @Expose
    private PortInfo [] Ports;

    /**
    * <p>负载均衡器相关配置</p>
    */
    @SerializedName("LoadBalancerSet")
    @Expose
    private LoadBalancerPackageNew [] LoadBalancerSet;

    /**
    * <p>用户id</p>
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
    * <p>SAAS型WAF域名状态：<br>-2：配置下发失败<br>-1：配置下发中<br>0：DNS解析中<br>1：无DNS解析记录，请接入WAF<br>10：DNS解析未知，域名启用了代理<br>11：DNS解析异常，使用A记录接入WAF IP<br>200：检测源站不可达<br>220：源站不支持长连接<br>311：证书过期<br>312：证书即将过期<br>310：证书异常<br>316：备案异常<br>5：WAF回源已变更<br>负载均衡型WAF域名LB监听器状态：<br>0：操作成功<br>4：正在绑定LB<br>6：正在解绑LB<br>7：解绑LB失败<br>8：绑定LB失败<br>10：内部错误</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>编辑时间</p>
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * <p>Ipv6开关状态。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("Ipv6Status")
    @Expose
    private Long Ipv6Status;

    /**
    * <p>BOT开关状态。<br>0：关闭<br>1：关闭<br>2：开启<br>3：开启</p>
    */
    @SerializedName("BotStatus")
    @Expose
    private Long BotStatus;

    /**
    * <p>实例版本信息。<br>101：小微敏捷版<br>102：小微超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p>
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * <p>投递CLS状态。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("PostCLSStatus")
    @Expose
    private Long PostCLSStatus;

    /**
    * <p>投递CKafka状态。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("PostCKafkaStatus")
    @Expose
    private Long PostCKafkaStatus;

    /**
    * <p>cdc实例域名接入的集群信息,非cdc实例忽略。</p>
    */
    @SerializedName("CdcClusters")
    @Expose
    private String CdcClusters;

    /**
    * <p>api安全开关状态。<br>0：关闭<br>1：开启</p>
    */
    @SerializedName("ApiStatus")
    @Expose
    private Long ApiStatus;

    /**
    * <p>应用型负载均衡类型，默认clb。<br>clb：七层负载均衡器类型<br>apisix：apisix网关型</p>
    */
    @SerializedName("AlbType")
    @Expose
    private String AlbType;

    /**
    * <p>安全组状态。<br>0：不展示<br>1：非腾讯云源站<br>2：安全组绑定失败<br>3：安全组发生变更</p>
    */
    @SerializedName("SgState")
    @Expose
    private Long SgState;

    /**
    * <p>安全组状态的详细解释</p>
    */
    @SerializedName("SgDetail")
    @Expose
    private String SgDetail;

    /**
    * <p>域名云环境。hybrid：混合云域名<br>public：公有云域名</p>
    */
    @SerializedName("CloudType")
    @Expose
    private String CloudType;

    /**
    * <p>域名备注信息</p>
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * <p>SAASWAF源站IP列表</p>
    */
    @SerializedName("SrcList")
    @Expose
    private String [] SrcList;

    /**
    * <p>SAASWAF源站域名列表</p>
    */
    @SerializedName("UpstreamDomainList")
    @Expose
    private String [] UpstreamDomainList;

    /**
    * <p>安全组ID</p>
    */
    @SerializedName("SgID")
    @Expose
    private String SgID;

    /**
    * <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p>
    */
    @SerializedName("AccessStatus")
    @Expose
    private Long AccessStatus;

    /**
    * <p>域名标签</p>
    */
    @SerializedName("Labels")
    @Expose
    private String [] Labels;

    /**
    * <p>saaswaf独享ip状态，0是关闭，1是开启，2是开启中</p>
    */
    @SerializedName("PrivateVipStatus")
    @Expose
    private Long PrivateVipStatus;

    /**
    * <p>代表是否是四层clbwaf域名</p>
    */
    @SerializedName("IsREIP")
    @Expose
    private Long IsREIP;

    /**
    * <p>四层关联的对象ID</p>
    */
    @SerializedName("REIPObjectId")
    @Expose
    private String REIPObjectId;

    /**
    * <p>标签结构体</p>
    */
    @SerializedName("TagInfos")
    @Expose
    private TagInfo [] TagInfos;

    /**
    * <p>大模型开关</p><p>枚举值：</p><ul><li>0： 大模型开关关闭状态</li><li>1： 大模型开关开启状态</li></ul>
    */
    @SerializedName("LLMStatus")
    @Expose
    private Long LLMStatus;

    /**
     * Get <p>域名</p> 
     * @return Domain <p>域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>域名</p>
     * @param Domain <p>域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>域名ID</p> 
     * @return DomainId <p>域名ID</p>
     */
    public String getDomainId() {
        return this.DomainId;
    }

    /**
     * Set <p>域名ID</p>
     * @param DomainId <p>域名ID</p>
     */
    public void setDomainId(String DomainId) {
        this.DomainId = DomainId;
    }

    /**
     * Get <p>实例ID</p> 
     * @return InstanceId <p>实例ID</p>
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set <p>实例ID</p>
     * @param InstanceId <p>实例ID</p>
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get <p>cname地址</p> 
     * @return Cname <p>cname地址</p>
     */
    public String getCname() {
        return this.Cname;
    }

    /**
     * Set <p>cname地址</p>
     * @param Cname <p>cname地址</p>
     */
    public void setCname(String Cname) {
        this.Cname = Cname;
    }

    /**
     * Get <p>域名所属实例类型。<br>sparta-waf：SaaS型WAF实例<br>clb-waf：负载均衡型WAF实例<br>cdc-clb-waf：CDC环境下负载均衡型WAF实例</p> 
     * @return Edition <p>域名所属实例类型。<br>sparta-waf：SaaS型WAF实例<br>clb-waf：负载均衡型WAF实例<br>cdc-clb-waf：CDC环境下负载均衡型WAF实例</p>
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set <p>域名所属实例类型。<br>sparta-waf：SaaS型WAF实例<br>clb-waf：负载均衡型WAF实例<br>cdc-clb-waf：CDC环境下负载均衡型WAF实例</p>
     * @param Edition <p>域名所属实例类型。<br>sparta-waf：SaaS型WAF实例<br>clb-waf：负载均衡型WAF实例<br>cdc-clb-waf：CDC环境下负载均衡型WAF实例</p>
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get <p>地域。<br>&quot;多伦多&quot;: &quot;ca&quot;<br>&quot;广州&quot;: &quot;gz&quot;<br>&quot;成都&quot;: &quot;cd&quot;<br>&quot;福州&quot;: &quot;fzec&quot;<br>&quot;深圳&quot;: &quot;szx&quot;<br>&quot;印度&quot;: &quot;in&quot;<br>&quot;济南&quot;: &quot;jnec&quot;<br>&quot;重庆&quot;: &quot;cq&quot;<br>&quot;天津&quot;: &quot;tsn&quot;<br>&quot;欧洲东北&quot;: &quot;ru&quot;<br>&quot;南京&quot;: &quot;nj&quot;<br>&quot;美国硅谷&quot;: &quot;usw&quot;<br>&quot;泰国&quot;: &quot;th&quot;<br>&quot;广州Open&quot;: &quot;gzopen&quot;<br>&quot;深圳金融&quot;: &quot;szjr&quot;<br>&quot;法兰克福&quot;: &quot;de&quot;<br>&quot;日本&quot;: &quot;jp&quot;<br>&quot;弗吉尼亚&quot;: &quot;use&quot;<br>&quot;北京&quot;: &quot;bj&quot;<br>&quot;中国香港&quot;: &quot;hk&quot;<br>&quot;杭州&quot;: &quot;hzec&quot;<br>&quot;北京金融&quot;: &quot;bjjr&quot;<br>&quot;上海金融&quot;: &quot;shjr&quot;<br>&quot;台北&quot;: &quot;tpe&quot;<br>&quot;首尔&quot;: &quot;kr&quot;<br>&quot;上海&quot;: &quot;sh&quot;<br>&quot;新加坡&quot;: &quot;sg&quot;<br>&quot;清远&quot;: &quot;qy&quot;</p> 
     * @return Region <p>地域。<br>&quot;多伦多&quot;: &quot;ca&quot;<br>&quot;广州&quot;: &quot;gz&quot;<br>&quot;成都&quot;: &quot;cd&quot;<br>&quot;福州&quot;: &quot;fzec&quot;<br>&quot;深圳&quot;: &quot;szx&quot;<br>&quot;印度&quot;: &quot;in&quot;<br>&quot;济南&quot;: &quot;jnec&quot;<br>&quot;重庆&quot;: &quot;cq&quot;<br>&quot;天津&quot;: &quot;tsn&quot;<br>&quot;欧洲东北&quot;: &quot;ru&quot;<br>&quot;南京&quot;: &quot;nj&quot;<br>&quot;美国硅谷&quot;: &quot;usw&quot;<br>&quot;泰国&quot;: &quot;th&quot;<br>&quot;广州Open&quot;: &quot;gzopen&quot;<br>&quot;深圳金融&quot;: &quot;szjr&quot;<br>&quot;法兰克福&quot;: &quot;de&quot;<br>&quot;日本&quot;: &quot;jp&quot;<br>&quot;弗吉尼亚&quot;: &quot;use&quot;<br>&quot;北京&quot;: &quot;bj&quot;<br>&quot;中国香港&quot;: &quot;hk&quot;<br>&quot;杭州&quot;: &quot;hzec&quot;<br>&quot;北京金融&quot;: &quot;bjjr&quot;<br>&quot;上海金融&quot;: &quot;shjr&quot;<br>&quot;台北&quot;: &quot;tpe&quot;<br>&quot;首尔&quot;: &quot;kr&quot;<br>&quot;上海&quot;: &quot;sh&quot;<br>&quot;新加坡&quot;: &quot;sg&quot;<br>&quot;清远&quot;: &quot;qy&quot;</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域。<br>&quot;多伦多&quot;: &quot;ca&quot;<br>&quot;广州&quot;: &quot;gz&quot;<br>&quot;成都&quot;: &quot;cd&quot;<br>&quot;福州&quot;: &quot;fzec&quot;<br>&quot;深圳&quot;: &quot;szx&quot;<br>&quot;印度&quot;: &quot;in&quot;<br>&quot;济南&quot;: &quot;jnec&quot;<br>&quot;重庆&quot;: &quot;cq&quot;<br>&quot;天津&quot;: &quot;tsn&quot;<br>&quot;欧洲东北&quot;: &quot;ru&quot;<br>&quot;南京&quot;: &quot;nj&quot;<br>&quot;美国硅谷&quot;: &quot;usw&quot;<br>&quot;泰国&quot;: &quot;th&quot;<br>&quot;广州Open&quot;: &quot;gzopen&quot;<br>&quot;深圳金融&quot;: &quot;szjr&quot;<br>&quot;法兰克福&quot;: &quot;de&quot;<br>&quot;日本&quot;: &quot;jp&quot;<br>&quot;弗吉尼亚&quot;: &quot;use&quot;<br>&quot;北京&quot;: &quot;bj&quot;<br>&quot;中国香港&quot;: &quot;hk&quot;<br>&quot;杭州&quot;: &quot;hzec&quot;<br>&quot;北京金融&quot;: &quot;bjjr&quot;<br>&quot;上海金融&quot;: &quot;shjr&quot;<br>&quot;台北&quot;: &quot;tpe&quot;<br>&quot;首尔&quot;: &quot;kr&quot;<br>&quot;上海&quot;: &quot;sh&quot;<br>&quot;新加坡&quot;: &quot;sg&quot;<br>&quot;清远&quot;: &quot;qy&quot;</p>
     * @param Region <p>地域。<br>&quot;多伦多&quot;: &quot;ca&quot;<br>&quot;广州&quot;: &quot;gz&quot;<br>&quot;成都&quot;: &quot;cd&quot;<br>&quot;福州&quot;: &quot;fzec&quot;<br>&quot;深圳&quot;: &quot;szx&quot;<br>&quot;印度&quot;: &quot;in&quot;<br>&quot;济南&quot;: &quot;jnec&quot;<br>&quot;重庆&quot;: &quot;cq&quot;<br>&quot;天津&quot;: &quot;tsn&quot;<br>&quot;欧洲东北&quot;: &quot;ru&quot;<br>&quot;南京&quot;: &quot;nj&quot;<br>&quot;美国硅谷&quot;: &quot;usw&quot;<br>&quot;泰国&quot;: &quot;th&quot;<br>&quot;广州Open&quot;: &quot;gzopen&quot;<br>&quot;深圳金融&quot;: &quot;szjr&quot;<br>&quot;法兰克福&quot;: &quot;de&quot;<br>&quot;日本&quot;: &quot;jp&quot;<br>&quot;弗吉尼亚&quot;: &quot;use&quot;<br>&quot;北京&quot;: &quot;bj&quot;<br>&quot;中国香港&quot;: &quot;hk&quot;<br>&quot;杭州&quot;: &quot;hzec&quot;<br>&quot;北京金融&quot;: &quot;bjjr&quot;<br>&quot;上海金融&quot;: &quot;shjr&quot;<br>&quot;台北&quot;: &quot;tpe&quot;<br>&quot;首尔&quot;: &quot;kr&quot;<br>&quot;上海&quot;: &quot;sh&quot;<br>&quot;新加坡&quot;: &quot;sg&quot;<br>&quot;清远&quot;: &quot;qy&quot;</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例名</p> 
     * @return InstanceName <p>实例名</p>
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * Set <p>实例名</p>
     * @param InstanceName <p>实例名</p>
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * Get <p>访问日志开关状态。<br>0：关闭<br>1：开启</p> 
     * @return ClsStatus <p>访问日志开关状态。<br>0：关闭<br>1：开启</p>
     */
    public Long getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set <p>访问日志开关状态。<br>0：关闭<br>1：开启</p>
     * @param ClsStatus <p>访问日志开关状态。<br>0：关闭<br>1：开启</p>
     */
    public void setClsStatus(Long ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get <p>负载均衡型WAF使用模式。<br>0：镜像模式<br>1：清洗模式</p> 
     * @return FlowMode <p>负载均衡型WAF使用模式。<br>0：镜像模式<br>1：清洗模式</p>
     */
    public Long getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set <p>负载均衡型WAF使用模式。<br>0：镜像模式<br>1：清洗模式</p>
     * @param FlowMode <p>负载均衡型WAF使用模式。<br>0：镜像模式<br>1：清洗模式</p>
     */
    public void setFlowMode(Long FlowMode) {
        this.FlowMode = FlowMode;
    }

    /**
     * Get <p>waf开关状态。<br>0：关闭<br>1：开启</p> 
     * @return Status <p>waf开关状态。<br>0：关闭<br>1：开启</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>waf开关状态。<br>0：关闭<br>1：开启</p>
     * @param Status <p>waf开关状态。<br>0：关闭<br>1：开启</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>规则引擎防护模式。<br>0：观察模式<br>1：拦截模式</p> 
     * @return Mode <p>规则引擎防护模式。<br>0：观察模式<br>1：拦截模式</p>
     */
    public Long getMode() {
        return this.Mode;
    }

    /**
     * Set <p>规则引擎防护模式。<br>0：观察模式<br>1：拦截模式</p>
     * @param Mode <p>规则引擎防护模式。<br>0：观察模式<br>1：拦截模式</p>
     */
    public void setMode(Long Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>规则引擎和AI引擎防护模式联合状态。<br>1:初始状态,规则引擎拦截&amp;&amp;AI引擎未操作开关状态<br>10：规则引擎观察&amp;&amp;AI引擎关闭模式<br>11：规则引擎观察&amp;&amp;AI引擎观察模式<br>12：规则引擎观察&amp;&amp;AI引擎拦截模式<br>20：规则引擎拦截&amp;&amp;AI引擎关闭模式<br>21：规则引擎拦截&amp;&amp;AI引擎观察模式<br>22：规则引擎拦截&amp;&amp;AI引擎拦截模式</p> 
     * @return Engine <p>规则引擎和AI引擎防护模式联合状态。<br>1:初始状态,规则引擎拦截&amp;&amp;AI引擎未操作开关状态<br>10：规则引擎观察&amp;&amp;AI引擎关闭模式<br>11：规则引擎观察&amp;&amp;AI引擎观察模式<br>12：规则引擎观察&amp;&amp;AI引擎拦截模式<br>20：规则引擎拦截&amp;&amp;AI引擎关闭模式<br>21：规则引擎拦截&amp;&amp;AI引擎观察模式<br>22：规则引擎拦截&amp;&amp;AI引擎拦截模式</p>
     */
    public Long getEngine() {
        return this.Engine;
    }

    /**
     * Set <p>规则引擎和AI引擎防护模式联合状态。<br>1:初始状态,规则引擎拦截&amp;&amp;AI引擎未操作开关状态<br>10：规则引擎观察&amp;&amp;AI引擎关闭模式<br>11：规则引擎观察&amp;&amp;AI引擎观察模式<br>12：规则引擎观察&amp;&amp;AI引擎拦截模式<br>20：规则引擎拦截&amp;&amp;AI引擎关闭模式<br>21：规则引擎拦截&amp;&amp;AI引擎观察模式<br>22：规则引擎拦截&amp;&amp;AI引擎拦截模式</p>
     * @param Engine <p>规则引擎和AI引擎防护模式联合状态。<br>1:初始状态,规则引擎拦截&amp;&amp;AI引擎未操作开关状态<br>10：规则引擎观察&amp;&amp;AI引擎关闭模式<br>11：规则引擎观察&amp;&amp;AI引擎观察模式<br>12：规则引擎观察&amp;&amp;AI引擎拦截模式<br>20：规则引擎拦截&amp;&amp;AI引擎关闭模式<br>21：规则引擎拦截&amp;&amp;AI引擎观察模式<br>22：规则引擎拦截&amp;&amp;AI引擎拦截模式</p>
     */
    public void setEngine(Long Engine) {
        this.Engine = Engine;
    }

    /**
     * Get <p>沙箱集群回源出口IP列表</p> 
     * @return CCList <p>沙箱集群回源出口IP列表</p>
     */
    public String [] getCCList() {
        return this.CCList;
    }

    /**
     * Set <p>沙箱集群回源出口IP列表</p>
     * @param CCList <p>沙箱集群回源出口IP列表</p>
     */
    public void setCCList(String [] CCList) {
        this.CCList = CCList;
    }

    /**
     * Get <p>生产集群回源出口IP列表</p> 
     * @return RsList <p>生产集群回源出口IP列表</p>
     */
    public String [] getRsList() {
        return this.RsList;
    }

    /**
     * Set <p>生产集群回源出口IP列表</p>
     * @param RsList <p>生产集群回源出口IP列表</p>
     */
    public void setRsList(String [] RsList) {
        this.RsList = RsList;
    }

    /**
     * Get <p>服务端口配置</p> 
     * @return Ports <p>服务端口配置</p>
     */
    public PortInfo [] getPorts() {
        return this.Ports;
    }

    /**
     * Set <p>服务端口配置</p>
     * @param Ports <p>服务端口配置</p>
     */
    public void setPorts(PortInfo [] Ports) {
        this.Ports = Ports;
    }

    /**
     * Get <p>负载均衡器相关配置</p> 
     * @return LoadBalancerSet <p>负载均衡器相关配置</p>
     */
    public LoadBalancerPackageNew [] getLoadBalancerSet() {
        return this.LoadBalancerSet;
    }

    /**
     * Set <p>负载均衡器相关配置</p>
     * @param LoadBalancerSet <p>负载均衡器相关配置</p>
     */
    public void setLoadBalancerSet(LoadBalancerPackageNew [] LoadBalancerSet) {
        this.LoadBalancerSet = LoadBalancerSet;
    }

    /**
     * Get <p>用户id</p> 
     * @return AppId <p>用户id</p>
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>用户id</p>
     * @param AppId <p>用户id</p>
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>SAAS型WAF域名状态：<br>-2：配置下发失败<br>-1：配置下发中<br>0：DNS解析中<br>1：无DNS解析记录，请接入WAF<br>10：DNS解析未知，域名启用了代理<br>11：DNS解析异常，使用A记录接入WAF IP<br>200：检测源站不可达<br>220：源站不支持长连接<br>311：证书过期<br>312：证书即将过期<br>310：证书异常<br>316：备案异常<br>5：WAF回源已变更<br>负载均衡型WAF域名LB监听器状态：<br>0：操作成功<br>4：正在绑定LB<br>6：正在解绑LB<br>7：解绑LB失败<br>8：绑定LB失败<br>10：内部错误</p> 
     * @return State <p>SAAS型WAF域名状态：<br>-2：配置下发失败<br>-1：配置下发中<br>0：DNS解析中<br>1：无DNS解析记录，请接入WAF<br>10：DNS解析未知，域名启用了代理<br>11：DNS解析异常，使用A记录接入WAF IP<br>200：检测源站不可达<br>220：源站不支持长连接<br>311：证书过期<br>312：证书即将过期<br>310：证书异常<br>316：备案异常<br>5：WAF回源已变更<br>负载均衡型WAF域名LB监听器状态：<br>0：操作成功<br>4：正在绑定LB<br>6：正在解绑LB<br>7：解绑LB失败<br>8：绑定LB失败<br>10：内部错误</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>SAAS型WAF域名状态：<br>-2：配置下发失败<br>-1：配置下发中<br>0：DNS解析中<br>1：无DNS解析记录，请接入WAF<br>10：DNS解析未知，域名启用了代理<br>11：DNS解析异常，使用A记录接入WAF IP<br>200：检测源站不可达<br>220：源站不支持长连接<br>311：证书过期<br>312：证书即将过期<br>310：证书异常<br>316：备案异常<br>5：WAF回源已变更<br>负载均衡型WAF域名LB监听器状态：<br>0：操作成功<br>4：正在绑定LB<br>6：正在解绑LB<br>7：解绑LB失败<br>8：绑定LB失败<br>10：内部错误</p>
     * @param State <p>SAAS型WAF域名状态：<br>-2：配置下发失败<br>-1：配置下发中<br>0：DNS解析中<br>1：无DNS解析记录，请接入WAF<br>10：DNS解析未知，域名启用了代理<br>11：DNS解析异常，使用A记录接入WAF IP<br>200：检测源站不可达<br>220：源站不支持长连接<br>311：证书过期<br>312：证书即将过期<br>310：证书异常<br>316：备案异常<br>5：WAF回源已变更<br>负载均衡型WAF域名LB监听器状态：<br>0：操作成功<br>4：正在绑定LB<br>6：正在解绑LB<br>7：解绑LB失败<br>8：绑定LB失败<br>10：内部错误</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>创建时间</p> 
     * @return CreateTime <p>创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间</p>
     * @param CreateTime <p>创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>编辑时间</p> 
     * @return ModifyTime <p>编辑时间</p>
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set <p>编辑时间</p>
     * @param ModifyTime <p>编辑时间</p>
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get <p>Ipv6开关状态。<br>0：关闭<br>1：开启</p> 
     * @return Ipv6Status <p>Ipv6开关状态。<br>0：关闭<br>1：开启</p>
     */
    public Long getIpv6Status() {
        return this.Ipv6Status;
    }

    /**
     * Set <p>Ipv6开关状态。<br>0：关闭<br>1：开启</p>
     * @param Ipv6Status <p>Ipv6开关状态。<br>0：关闭<br>1：开启</p>
     */
    public void setIpv6Status(Long Ipv6Status) {
        this.Ipv6Status = Ipv6Status;
    }

    /**
     * Get <p>BOT开关状态。<br>0：关闭<br>1：关闭<br>2：开启<br>3：开启</p> 
     * @return BotStatus <p>BOT开关状态。<br>0：关闭<br>1：关闭<br>2：开启<br>3：开启</p>
     */
    public Long getBotStatus() {
        return this.BotStatus;
    }

    /**
     * Set <p>BOT开关状态。<br>0：关闭<br>1：关闭<br>2：开启<br>3：开启</p>
     * @param BotStatus <p>BOT开关状态。<br>0：关闭<br>1：关闭<br>2：开启<br>3：开启</p>
     */
    public void setBotStatus(Long BotStatus) {
        this.BotStatus = BotStatus;
    }

    /**
     * Get <p>实例版本信息。<br>101：小微敏捷版<br>102：小微超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p> 
     * @return Level <p>实例版本信息。<br>101：小微敏捷版<br>102：小微超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p>
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set <p>实例版本信息。<br>101：小微敏捷版<br>102：小微超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p>
     * @param Level <p>实例版本信息。<br>101：小微敏捷版<br>102：小微超轻版<br>2：高级版<br>3：企业版<br>4：旗舰版<br>6：独享版</p>
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get <p>投递CLS状态。<br>0：关闭<br>1：开启</p> 
     * @return PostCLSStatus <p>投递CLS状态。<br>0：关闭<br>1：开启</p>
     */
    public Long getPostCLSStatus() {
        return this.PostCLSStatus;
    }

    /**
     * Set <p>投递CLS状态。<br>0：关闭<br>1：开启</p>
     * @param PostCLSStatus <p>投递CLS状态。<br>0：关闭<br>1：开启</p>
     */
    public void setPostCLSStatus(Long PostCLSStatus) {
        this.PostCLSStatus = PostCLSStatus;
    }

    /**
     * Get <p>投递CKafka状态。<br>0：关闭<br>1：开启</p> 
     * @return PostCKafkaStatus <p>投递CKafka状态。<br>0：关闭<br>1：开启</p>
     */
    public Long getPostCKafkaStatus() {
        return this.PostCKafkaStatus;
    }

    /**
     * Set <p>投递CKafka状态。<br>0：关闭<br>1：开启</p>
     * @param PostCKafkaStatus <p>投递CKafka状态。<br>0：关闭<br>1：开启</p>
     */
    public void setPostCKafkaStatus(Long PostCKafkaStatus) {
        this.PostCKafkaStatus = PostCKafkaStatus;
    }

    /**
     * Get <p>cdc实例域名接入的集群信息,非cdc实例忽略。</p> 
     * @return CdcClusters <p>cdc实例域名接入的集群信息,非cdc实例忽略。</p>
     */
    public String getCdcClusters() {
        return this.CdcClusters;
    }

    /**
     * Set <p>cdc实例域名接入的集群信息,非cdc实例忽略。</p>
     * @param CdcClusters <p>cdc实例域名接入的集群信息,非cdc实例忽略。</p>
     */
    public void setCdcClusters(String CdcClusters) {
        this.CdcClusters = CdcClusters;
    }

    /**
     * Get <p>api安全开关状态。<br>0：关闭<br>1：开启</p> 
     * @return ApiStatus <p>api安全开关状态。<br>0：关闭<br>1：开启</p>
     */
    public Long getApiStatus() {
        return this.ApiStatus;
    }

    /**
     * Set <p>api安全开关状态。<br>0：关闭<br>1：开启</p>
     * @param ApiStatus <p>api安全开关状态。<br>0：关闭<br>1：开启</p>
     */
    public void setApiStatus(Long ApiStatus) {
        this.ApiStatus = ApiStatus;
    }

    /**
     * Get <p>应用型负载均衡类型，默认clb。<br>clb：七层负载均衡器类型<br>apisix：apisix网关型</p> 
     * @return AlbType <p>应用型负载均衡类型，默认clb。<br>clb：七层负载均衡器类型<br>apisix：apisix网关型</p>
     */
    public String getAlbType() {
        return this.AlbType;
    }

    /**
     * Set <p>应用型负载均衡类型，默认clb。<br>clb：七层负载均衡器类型<br>apisix：apisix网关型</p>
     * @param AlbType <p>应用型负载均衡类型，默认clb。<br>clb：七层负载均衡器类型<br>apisix：apisix网关型</p>
     */
    public void setAlbType(String AlbType) {
        this.AlbType = AlbType;
    }

    /**
     * Get <p>安全组状态。<br>0：不展示<br>1：非腾讯云源站<br>2：安全组绑定失败<br>3：安全组发生变更</p> 
     * @return SgState <p>安全组状态。<br>0：不展示<br>1：非腾讯云源站<br>2：安全组绑定失败<br>3：安全组发生变更</p>
     */
    public Long getSgState() {
        return this.SgState;
    }

    /**
     * Set <p>安全组状态。<br>0：不展示<br>1：非腾讯云源站<br>2：安全组绑定失败<br>3：安全组发生变更</p>
     * @param SgState <p>安全组状态。<br>0：不展示<br>1：非腾讯云源站<br>2：安全组绑定失败<br>3：安全组发生变更</p>
     */
    public void setSgState(Long SgState) {
        this.SgState = SgState;
    }

    /**
     * Get <p>安全组状态的详细解释</p> 
     * @return SgDetail <p>安全组状态的详细解释</p>
     */
    public String getSgDetail() {
        return this.SgDetail;
    }

    /**
     * Set <p>安全组状态的详细解释</p>
     * @param SgDetail <p>安全组状态的详细解释</p>
     */
    public void setSgDetail(String SgDetail) {
        this.SgDetail = SgDetail;
    }

    /**
     * Get <p>域名云环境。hybrid：混合云域名<br>public：公有云域名</p> 
     * @return CloudType <p>域名云环境。hybrid：混合云域名<br>public：公有云域名</p>
     */
    public String getCloudType() {
        return this.CloudType;
    }

    /**
     * Set <p>域名云环境。hybrid：混合云域名<br>public：公有云域名</p>
     * @param CloudType <p>域名云环境。hybrid：混合云域名<br>public：公有云域名</p>
     */
    public void setCloudType(String CloudType) {
        this.CloudType = CloudType;
    }

    /**
     * Get <p>域名备注信息</p> 
     * @return Note <p>域名备注信息</p>
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set <p>域名备注信息</p>
     * @param Note <p>域名备注信息</p>
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get <p>SAASWAF源站IP列表</p> 
     * @return SrcList <p>SAASWAF源站IP列表</p>
     */
    public String [] getSrcList() {
        return this.SrcList;
    }

    /**
     * Set <p>SAASWAF源站IP列表</p>
     * @param SrcList <p>SAASWAF源站IP列表</p>
     */
    public void setSrcList(String [] SrcList) {
        this.SrcList = SrcList;
    }

    /**
     * Get <p>SAASWAF源站域名列表</p> 
     * @return UpstreamDomainList <p>SAASWAF源站域名列表</p>
     */
    public String [] getUpstreamDomainList() {
        return this.UpstreamDomainList;
    }

    /**
     * Set <p>SAASWAF源站域名列表</p>
     * @param UpstreamDomainList <p>SAASWAF源站域名列表</p>
     */
    public void setUpstreamDomainList(String [] UpstreamDomainList) {
        this.UpstreamDomainList = UpstreamDomainList;
    }

    /**
     * Get <p>安全组ID</p> 
     * @return SgID <p>安全组ID</p>
     */
    public String getSgID() {
        return this.SgID;
    }

    /**
     * Set <p>安全组ID</p>
     * @param SgID <p>安全组ID</p>
     */
    public void setSgID(String SgID) {
        this.SgID = SgID;
    }

    /**
     * Get <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p> 
     * @return AccessStatus <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p>
     */
    public Long getAccessStatus() {
        return this.AccessStatus;
    }

    /**
     * Set <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p>
     * @param AccessStatus <p>clbwaf接入状态，0代表“尚无流量接入”，1代表“流量接入”，2代表“CLB监听器已注销”，3代表“配置生效中”，4代表“配置下发失败中”</p>
     */
    public void setAccessStatus(Long AccessStatus) {
        this.AccessStatus = AccessStatus;
    }

    /**
     * Get <p>域名标签</p> 
     * @return Labels <p>域名标签</p>
     */
    public String [] getLabels() {
        return this.Labels;
    }

    /**
     * Set <p>域名标签</p>
     * @param Labels <p>域名标签</p>
     */
    public void setLabels(String [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get <p>saaswaf独享ip状态，0是关闭，1是开启，2是开启中</p> 
     * @return PrivateVipStatus <p>saaswaf独享ip状态，0是关闭，1是开启，2是开启中</p>
     */
    public Long getPrivateVipStatus() {
        return this.PrivateVipStatus;
    }

    /**
     * Set <p>saaswaf独享ip状态，0是关闭，1是开启，2是开启中</p>
     * @param PrivateVipStatus <p>saaswaf独享ip状态，0是关闭，1是开启，2是开启中</p>
     */
    public void setPrivateVipStatus(Long PrivateVipStatus) {
        this.PrivateVipStatus = PrivateVipStatus;
    }

    /**
     * Get <p>代表是否是四层clbwaf域名</p> 
     * @return IsREIP <p>代表是否是四层clbwaf域名</p>
     */
    public Long getIsREIP() {
        return this.IsREIP;
    }

    /**
     * Set <p>代表是否是四层clbwaf域名</p>
     * @param IsREIP <p>代表是否是四层clbwaf域名</p>
     */
    public void setIsREIP(Long IsREIP) {
        this.IsREIP = IsREIP;
    }

    /**
     * Get <p>四层关联的对象ID</p> 
     * @return REIPObjectId <p>四层关联的对象ID</p>
     */
    public String getREIPObjectId() {
        return this.REIPObjectId;
    }

    /**
     * Set <p>四层关联的对象ID</p>
     * @param REIPObjectId <p>四层关联的对象ID</p>
     */
    public void setREIPObjectId(String REIPObjectId) {
        this.REIPObjectId = REIPObjectId;
    }

    /**
     * Get <p>标签结构体</p> 
     * @return TagInfos <p>标签结构体</p>
     */
    public TagInfo [] getTagInfos() {
        return this.TagInfos;
    }

    /**
     * Set <p>标签结构体</p>
     * @param TagInfos <p>标签结构体</p>
     */
    public void setTagInfos(TagInfo [] TagInfos) {
        this.TagInfos = TagInfos;
    }

    /**
     * Get <p>大模型开关</p><p>枚举值：</p><ul><li>0： 大模型开关关闭状态</li><li>1： 大模型开关开启状态</li></ul> 
     * @return LLMStatus <p>大模型开关</p><p>枚举值：</p><ul><li>0： 大模型开关关闭状态</li><li>1： 大模型开关开启状态</li></ul>
     */
    public Long getLLMStatus() {
        return this.LLMStatus;
    }

    /**
     * Set <p>大模型开关</p><p>枚举值：</p><ul><li>0： 大模型开关关闭状态</li><li>1： 大模型开关开启状态</li></ul>
     * @param LLMStatus <p>大模型开关</p><p>枚举值：</p><ul><li>0： 大模型开关关闭状态</li><li>1： 大模型开关开启状态</li></ul>
     */
    public void setLLMStatus(Long LLMStatus) {
        this.LLMStatus = LLMStatus;
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
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
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
        if (source.PrivateVipStatus != null) {
            this.PrivateVipStatus = new Long(source.PrivateVipStatus);
        }
        if (source.IsREIP != null) {
            this.IsREIP = new Long(source.IsREIP);
        }
        if (source.REIPObjectId != null) {
            this.REIPObjectId = new String(source.REIPObjectId);
        }
        if (source.TagInfos != null) {
            this.TagInfos = new TagInfo[source.TagInfos.length];
            for (int i = 0; i < source.TagInfos.length; i++) {
                this.TagInfos[i] = new TagInfo(source.TagInfos[i]);
            }
        }
        if (source.LLMStatus != null) {
            this.LLMStatus = new Long(source.LLMStatus);
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
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
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
        this.setParamSimple(map, prefix + "PrivateVipStatus", this.PrivateVipStatus);
        this.setParamSimple(map, prefix + "IsREIP", this.IsREIP);
        this.setParamSimple(map, prefix + "REIPObjectId", this.REIPObjectId);
        this.setParamArrayObj(map, prefix + "TagInfos.", this.TagInfos);
        this.setParamSimple(map, prefix + "LLMStatus", this.LLMStatus);

    }
}

