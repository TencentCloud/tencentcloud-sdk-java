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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyRuleAttributeRequest  extends AbstractModel{

    /**
    * 监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 转发规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 调度策略，其中：
rr，轮询；
wrr，加权轮询；
lc，最小连接数。
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 源站健康检查开关，其中：
1，开启；
0，关闭。
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * 健康检查配置参数
    */
    @SerializedName("CheckParams")
    @Expose
    private RuleCheckParams CheckParams;

    /**
    * 转发规则路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 加速通道转发到源站的协议类型，支持：default, HTTP和HTTPS。
当ForwardProtocol=default时，表示使用对应监听器的ForwardProtocol。
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * 加速通道转发到源站的请求中携带的host。
当ForwardHost=default时，使用规则的域名，其他情况为该字段所设置的值。
    */
    @SerializedName("ForwardHost")
    @Expose
    private String ForwardHost;

    /**
     * 获取监听器ID
     * @return ListenerId 监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置监听器ID
     * @param ListenerId 监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取转发规则ID
     * @return RuleId 转发规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置转发规则ID
     * @param RuleId 转发规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取调度策略，其中：
rr，轮询；
wrr，加权轮询；
lc，最小连接数。
     * @return Scheduler 调度策略，其中：
rr，轮询；
wrr，加权轮询；
lc，最小连接数。
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * 设置调度策略，其中：
rr，轮询；
wrr，加权轮询；
lc，最小连接数。
     * @param Scheduler 调度策略，其中：
rr，轮询；
wrr，加权轮询；
lc，最小连接数。
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * 获取源站健康检查开关，其中：
1，开启；
0，关闭。
     * @return HealthCheck 源站健康检查开关，其中：
1，开启；
0，关闭。
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * 设置源站健康检查开关，其中：
1，开启；
0，关闭。
     * @param HealthCheck 源站健康检查开关，其中：
1，开启；
0，关闭。
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * 获取健康检查配置参数
     * @return CheckParams 健康检查配置参数
     */
    public RuleCheckParams getCheckParams() {
        return this.CheckParams;
    }

    /**
     * 设置健康检查配置参数
     * @param CheckParams 健康检查配置参数
     */
    public void setCheckParams(RuleCheckParams CheckParams) {
        this.CheckParams = CheckParams;
    }

    /**
     * 获取转发规则路径
     * @return Path 转发规则路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * 设置转发规则路径
     * @param Path 转发规则路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * 获取加速通道转发到源站的协议类型，支持：default, HTTP和HTTPS。
当ForwardProtocol=default时，表示使用对应监听器的ForwardProtocol。
     * @return ForwardProtocol 加速通道转发到源站的协议类型，支持：default, HTTP和HTTPS。
当ForwardProtocol=default时，表示使用对应监听器的ForwardProtocol。
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * 设置加速通道转发到源站的协议类型，支持：default, HTTP和HTTPS。
当ForwardProtocol=default时，表示使用对应监听器的ForwardProtocol。
     * @param ForwardProtocol 加速通道转发到源站的协议类型，支持：default, HTTP和HTTPS。
当ForwardProtocol=default时，表示使用对应监听器的ForwardProtocol。
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * 获取加速通道转发到源站的请求中携带的host。
当ForwardHost=default时，使用规则的域名，其他情况为该字段所设置的值。
     * @return ForwardHost 加速通道转发到源站的请求中携带的host。
当ForwardHost=default时，使用规则的域名，其他情况为该字段所设置的值。
     */
    public String getForwardHost() {
        return this.ForwardHost;
    }

    /**
     * 设置加速通道转发到源站的请求中携带的host。
当ForwardHost=default时，使用规则的域名，其他情况为该字段所设置的值。
     * @param ForwardHost 加速通道转发到源站的请求中携带的host。
当ForwardHost=default时，使用规则的域名，其他情况为该字段所设置的值。
     */
    public void setForwardHost(String ForwardHost) {
        this.ForwardHost = ForwardHost;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamObj(map, prefix + "CheckParams.", this.CheckParams);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "ForwardHost", this.ForwardHost);

    }
}

