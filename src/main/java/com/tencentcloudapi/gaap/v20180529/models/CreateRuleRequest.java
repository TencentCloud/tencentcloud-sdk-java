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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRuleRequest extends AbstractModel {

    /**
    * <p>7层监听器ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>转发规则的域名</p>
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * <p>转发规则的路径</p>
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>转发规则对应源站的类型，支持IP和DOMAIN类型。</p>
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数。</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>规则是否开启健康检查，1开启，0关闭。</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * <p>源站健康检查相关参数</p>
    */
    @SerializedName("CheckParams")
    @Expose
    private RuleCheckParams CheckParams;

    /**
    * <p>加速通道转发到源站的协议类型：支持HTTP或HTTPS。不传递该字段时表示使用对应监听器的ForwardProtocol。</p>
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * <p>回源Host。加速通道转发到源站的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。</p>
    */
    @SerializedName("ForwardHost")
    @Expose
    private String ForwardHost;

    /**
    * <p>服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。创建HTTP监听器转发规则时，SNI功能默认关闭。</p>
    */
    @SerializedName("ServerNameIndicationSwitch")
    @Expose
    private String ServerNameIndicationSwitch;

    /**
    * <p>服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。</p>
    */
    @SerializedName("ServerNameIndication")
    @Expose
    private String ServerNameIndication;

    /**
    * <p>HTTP强制跳转HTTPS。输入当前规则对应的域名与地址。</p>
    */
    @SerializedName("ForcedRedirect")
    @Expose
    private String ForcedRedirect;

    /**
     * Get <p>7层监听器ID</p> 
     * @return ListenerId <p>7层监听器ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>7层监听器ID</p>
     * @param ListenerId <p>7层监听器ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>转发规则的域名</p> 
     * @return Domain <p>转发规则的域名</p>
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set <p>转发规则的域名</p>
     * @param Domain <p>转发规则的域名</p>
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get <p>转发规则的路径</p> 
     * @return Path <p>转发规则的路径</p>
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>转发规则的路径</p>
     * @param Path <p>转发规则的路径</p>
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>转发规则对应源站的类型，支持IP和DOMAIN类型。</p> 
     * @return RealServerType <p>转发规则对应源站的类型，支持IP和DOMAIN类型。</p>
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set <p>转发规则对应源站的类型，支持IP和DOMAIN类型。</p>
     * @param RealServerType <p>转发规则对应源站的类型，支持IP和DOMAIN类型。</p>
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数。</p> 
     * @return Scheduler <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数。</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数。</p>
     * @param Scheduler <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数。</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>规则是否开启健康检查，1开启，0关闭。</p> 
     * @return HealthCheck <p>规则是否开启健康检查，1开启，0关闭。</p>
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>规则是否开启健康检查，1开启，0关闭。</p>
     * @param HealthCheck <p>规则是否开启健康检查，1开启，0关闭。</p>
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>源站健康检查相关参数</p> 
     * @return CheckParams <p>源站健康检查相关参数</p>
     */
    public RuleCheckParams getCheckParams() {
        return this.CheckParams;
    }

    /**
     * Set <p>源站健康检查相关参数</p>
     * @param CheckParams <p>源站健康检查相关参数</p>
     */
    public void setCheckParams(RuleCheckParams CheckParams) {
        this.CheckParams = CheckParams;
    }

    /**
     * Get <p>加速通道转发到源站的协议类型：支持HTTP或HTTPS。不传递该字段时表示使用对应监听器的ForwardProtocol。</p> 
     * @return ForwardProtocol <p>加速通道转发到源站的协议类型：支持HTTP或HTTPS。不传递该字段时表示使用对应监听器的ForwardProtocol。</p>
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set <p>加速通道转发到源站的协议类型：支持HTTP或HTTPS。不传递该字段时表示使用对应监听器的ForwardProtocol。</p>
     * @param ForwardProtocol <p>加速通道转发到源站的协议类型：支持HTTP或HTTPS。不传递该字段时表示使用对应监听器的ForwardProtocol。</p>
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get <p>回源Host。加速通道转发到源站的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。</p> 
     * @return ForwardHost <p>回源Host。加速通道转发到源站的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。</p>
     */
    public String getForwardHost() {
        return this.ForwardHost;
    }

    /**
     * Set <p>回源Host。加速通道转发到源站的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。</p>
     * @param ForwardHost <p>回源Host。加速通道转发到源站的host，不设置该参数时，使用默认的host设置，即客户端发起的http请求的host。</p>
     */
    public void setForwardHost(String ForwardHost) {
        this.ForwardHost = ForwardHost;
    }

    /**
     * Get <p>服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。创建HTTP监听器转发规则时，SNI功能默认关闭。</p> 
     * @return ServerNameIndicationSwitch <p>服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。创建HTTP监听器转发规则时，SNI功能默认关闭。</p>
     */
    public String getServerNameIndicationSwitch() {
        return this.ServerNameIndicationSwitch;
    }

    /**
     * Set <p>服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。创建HTTP监听器转发规则时，SNI功能默认关闭。</p>
     * @param ServerNameIndicationSwitch <p>服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。创建HTTP监听器转发规则时，SNI功能默认关闭。</p>
     */
    public void setServerNameIndicationSwitch(String ServerNameIndicationSwitch) {
        this.ServerNameIndicationSwitch = ServerNameIndicationSwitch;
    }

    /**
     * Get <p>服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。</p> 
     * @return ServerNameIndication <p>服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。</p>
     */
    public String getServerNameIndication() {
        return this.ServerNameIndication;
    }

    /**
     * Set <p>服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。</p>
     * @param ServerNameIndication <p>服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。</p>
     */
    public void setServerNameIndication(String ServerNameIndication) {
        this.ServerNameIndication = ServerNameIndication;
    }

    /**
     * Get <p>HTTP强制跳转HTTPS。输入当前规则对应的域名与地址。</p> 
     * @return ForcedRedirect <p>HTTP强制跳转HTTPS。输入当前规则对应的域名与地址。</p>
     */
    public String getForcedRedirect() {
        return this.ForcedRedirect;
    }

    /**
     * Set <p>HTTP强制跳转HTTPS。输入当前规则对应的域名与地址。</p>
     * @param ForcedRedirect <p>HTTP强制跳转HTTPS。输入当前规则对应的域名与地址。</p>
     */
    public void setForcedRedirect(String ForcedRedirect) {
        this.ForcedRedirect = ForcedRedirect;
    }

    public CreateRuleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRuleRequest(CreateRuleRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.RealServerType != null) {
            this.RealServerType = new String(source.RealServerType);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
        }
        if (source.CheckParams != null) {
            this.CheckParams = new RuleCheckParams(source.CheckParams);
        }
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.ForwardHost != null) {
            this.ForwardHost = new String(source.ForwardHost);
        }
        if (source.ServerNameIndicationSwitch != null) {
            this.ServerNameIndicationSwitch = new String(source.ServerNameIndicationSwitch);
        }
        if (source.ServerNameIndication != null) {
            this.ServerNameIndication = new String(source.ServerNameIndication);
        }
        if (source.ForcedRedirect != null) {
            this.ForcedRedirect = new String(source.ForcedRedirect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamObj(map, prefix + "CheckParams.", this.CheckParams);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "ForwardHost", this.ForwardHost);
        this.setParamSimple(map, prefix + "ServerNameIndicationSwitch", this.ServerNameIndicationSwitch);
        this.setParamSimple(map, prefix + "ServerNameIndication", this.ServerNameIndication);
        this.setParamSimple(map, prefix + "ForcedRedirect", this.ForcedRedirect);

    }
}

