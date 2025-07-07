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

public class RuleInfo extends AbstractModel {

    /**
    * 规则信息
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 监听器信息
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 规则域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 源站类型
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 是否开启健康检查标志，1表示开启，0表示关闭
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * 规则状态，0表示运行中，1表示创建中，2表示销毁中，3表示绑定解绑源站中，4表示配置更新中
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * 健康检查相关参数
    */
    @SerializedName("CheckParams")
    @Expose
    private RuleCheckParams CheckParams;

    /**
    * 已绑定的源站相关信息
    */
    @SerializedName("RealServerSet")
    @Expose
    private BindRealServer [] RealServerSet;

    /**
    * 源站的服务状态，0表示异常，1表示正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * 通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
    */
    @SerializedName("ForwardHost")
    @Expose
    private String ForwardHost;

    /**
    * 服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerNameIndicationSwitch")
    @Expose
    private String ServerNameIndicationSwitch;

    /**
    * 服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerNameIndication")
    @Expose
    private String ServerNameIndication;

    /**
    * 强转HTTPS指示，当传递值为https:时表示强转为https
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForcedRedirect")
    @Expose
    private String ForcedRedirect;

    /**
     * Get 规则信息 
     * @return RuleId 规则信息
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则信息
     * @param RuleId 规则信息
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 监听器信息 
     * @return ListenerId 监听器信息
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 监听器信息
     * @param ListenerId 监听器信息
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 规则域名 
     * @return Domain 规则域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 规则域名
     * @param Domain 规则域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 规则路径 
     * @return Path 规则路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set 规则路径
     * @param Path 规则路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 源站类型 
     * @return RealServerType 源站类型
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * Set 源站类型
     * @param RealServerType 源站类型
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * Get 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。 
     * @return Scheduler 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
     * @param Scheduler 监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get 是否开启健康检查标志，1表示开启，0表示关闭 
     * @return HealthCheck 是否开启健康检查标志，1表示开启，0表示关闭
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set 是否开启健康检查标志，1表示开启，0表示关闭
     * @param HealthCheck 是否开启健康检查标志，1表示开启，0表示关闭
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get 规则状态，0表示运行中，1表示创建中，2表示销毁中，3表示绑定解绑源站中，4表示配置更新中 
     * @return RuleStatus 规则状态，0表示运行中，1表示创建中，2表示销毁中，3表示绑定解绑源站中，4表示配置更新中
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * Set 规则状态，0表示运行中，1表示创建中，2表示销毁中，3表示绑定解绑源站中，4表示配置更新中
     * @param RuleStatus 规则状态，0表示运行中，1表示创建中，2表示销毁中，3表示绑定解绑源站中，4表示配置更新中
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * Get 健康检查相关参数 
     * @return CheckParams 健康检查相关参数
     */
    public RuleCheckParams getCheckParams() {
        return this.CheckParams;
    }

    /**
     * Set 健康检查相关参数
     * @param CheckParams 健康检查相关参数
     */
    public void setCheckParams(RuleCheckParams CheckParams) {
        this.CheckParams = CheckParams;
    }

    /**
     * Get 已绑定的源站相关信息 
     * @return RealServerSet 已绑定的源站相关信息
     */
    public BindRealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * Set 已绑定的源站相关信息
     * @param RealServerSet 已绑定的源站相关信息
     */
    public void setRealServerSet(BindRealServer [] RealServerSet) {
        this.RealServerSet = RealServerSet;
    }

    /**
     * Get 源站的服务状态，0表示异常，1表示正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。 
     * @return BindStatus 源站的服务状态，0表示异常，1表示正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * Set 源站的服务状态，0表示异常，1表示正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
     * @param BindStatus 源站的服务状态，0表示异常，1表示正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * Get 通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。 
     * @return ForwardHost 通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
     */
    public String getForwardHost() {
        return this.ForwardHost;
    }

    /**
     * Set 通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
     * @param ForwardHost 通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
     */
    public void setForwardHost(String ForwardHost) {
        this.ForwardHost = ForwardHost;
    }

    /**
     * Get 服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerNameIndicationSwitch 服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerNameIndicationSwitch() {
        return this.ServerNameIndicationSwitch;
    }

    /**
     * Set 服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerNameIndicationSwitch 服务器名称指示（ServerNameIndication，简称SNI）开关。ON表示开启，OFF表示关闭。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerNameIndicationSwitch(String ServerNameIndicationSwitch) {
        this.ServerNameIndicationSwitch = ServerNameIndicationSwitch;
    }

    /**
     * Get 服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServerNameIndication 服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServerNameIndication() {
        return this.ServerNameIndication;
    }

    /**
     * Set 服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerNameIndication 服务器名称指示（ServerNameIndication，简称SNI），当SNI开关打开时，该字段必填。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerNameIndication(String ServerNameIndication) {
        this.ServerNameIndication = ServerNameIndication;
    }

    /**
     * Get 强转HTTPS指示，当传递值为https:时表示强转为https
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ForcedRedirect 强转HTTPS指示，当传递值为https:时表示强转为https
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getForcedRedirect() {
        return this.ForcedRedirect;
    }

    /**
     * Set 强转HTTPS指示，当传递值为https:时表示强转为https
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForcedRedirect 强转HTTPS指示，当传递值为https:时表示强转为https
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForcedRedirect(String ForcedRedirect) {
        this.ForcedRedirect = ForcedRedirect;
    }

    public RuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RuleInfo(RuleInfo source) {
        if (source.RuleId != null) {
            this.RuleId = new String(source.RuleId);
        }
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
        if (source.RuleStatus != null) {
            this.RuleStatus = new Long(source.RuleStatus);
        }
        if (source.CheckParams != null) {
            this.CheckParams = new RuleCheckParams(source.CheckParams);
        }
        if (source.RealServerSet != null) {
            this.RealServerSet = new BindRealServer[source.RealServerSet.length];
            for (int i = 0; i < source.RealServerSet.length; i++) {
                this.RealServerSet[i] = new BindRealServer(source.RealServerSet[i]);
            }
        }
        if (source.BindStatus != null) {
            this.BindStatus = new Long(source.BindStatus);
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
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamObj(map, prefix + "CheckParams.", this.CheckParams);
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "ForwardHost", this.ForwardHost);
        this.setParamSimple(map, prefix + "ServerNameIndicationSwitch", this.ServerNameIndicationSwitch);
        this.setParamSimple(map, prefix + "ServerNameIndication", this.ServerNameIndication);
        this.setParamSimple(map, prefix + "ForcedRedirect", this.ForcedRedirect);

    }
}

