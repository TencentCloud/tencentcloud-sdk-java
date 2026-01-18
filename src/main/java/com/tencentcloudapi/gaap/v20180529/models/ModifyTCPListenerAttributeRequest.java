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

public class ModifyTCPListenerAttributeRequest extends AbstractModel {

    /**
    * <p>监听器ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p>
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * <p>通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p>
    */
    @SerializedName("ProxyId")
    @Expose
    private String ProxyId;

    /**
    * <p>监听器名称</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。注意：lrtt需要开通白名单；RealServerType 为 DOMAIN 不支持wrr 和 lrtt。</p>
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * <p>源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。</p>
    */
    @SerializedName("DelayLoop")
    @Expose
    private Long DelayLoop;

    /**
    * <p>源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。</p>
    */
    @SerializedName("ConnectTimeout")
    @Expose
    private Long ConnectTimeout;

    /**
    * <p>是否开启健康检查，1开启，0关闭。</p>
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * <p>源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启</p>
    */
    @SerializedName("FailoverSwitch")
    @Expose
    private Long FailoverSwitch;

    /**
    * <p>健康阈值，表示连续检查成功多少次数后认定源站健康。范围为1到10</p>
    */
    @SerializedName("HealthyThreshold")
    @Expose
    private Long HealthyThreshold;

    /**
    * <p>不健康阈值，表示连续检查失败次数后认定源站不健康。范围为1到10</p>
    */
    @SerializedName("UnhealthyThreshold")
    @Expose
    private Long UnhealthyThreshold;

    /**
     * Get <p>监听器ID</p> 
     * @return ListenerId <p>监听器ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>监听器ID</p>
     * @param ListenerId <p>监听器ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p> 
     * @return GroupId <p>通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p>
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set <p>通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p>
     * @param GroupId <p>通道组ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p>
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get <p>通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p> 
     * @return ProxyId <p>通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p>
     */
    public String getProxyId() {
        return this.ProxyId;
    }

    /**
     * Set <p>通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p>
     * @param ProxyId <p>通道ID，ProxyId和GroupId必须设置一个，但不能同时设置。</p>
     */
    public void setProxyId(String ProxyId) {
        this.ProxyId = ProxyId;
    }

    /**
     * Get <p>监听器名称</p> 
     * @return ListenerName <p>监听器名称</p>
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set <p>监听器名称</p>
     * @param ListenerName <p>监听器名称</p>
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。注意：lrtt需要开通白名单；RealServerType 为 DOMAIN 不支持wrr 和 lrtt。</p> 
     * @return Scheduler <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。注意：lrtt需要开通白名单；RealServerType 为 DOMAIN 不支持wrr 和 lrtt。</p>
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。注意：lrtt需要开通白名单；RealServerType 为 DOMAIN 不支持wrr 和 lrtt。</p>
     * @param Scheduler <p>监听器源站访问策略，其中：rr表示轮询；wrr表示加权轮询；lc表示最小连接数；lrtt表示最小时延。注意：lrtt需要开通白名单；RealServerType 为 DOMAIN 不支持wrr 和 lrtt。</p>
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * Get <p>源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。</p> 
     * @return DelayLoop <p>源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。</p>
     */
    public Long getDelayLoop() {
        return this.DelayLoop;
    }

    /**
     * Set <p>源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。</p>
     * @param DelayLoop <p>源站健康检查时间间隔，单位：秒。时间间隔取值在[5，300]之间。</p>
     */
    public void setDelayLoop(Long DelayLoop) {
        this.DelayLoop = DelayLoop;
    }

    /**
     * Get <p>源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。</p> 
     * @return ConnectTimeout <p>源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。</p>
     */
    public Long getConnectTimeout() {
        return this.ConnectTimeout;
    }

    /**
     * Set <p>源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。</p>
     * @param ConnectTimeout <p>源站健康检查响应超时时间，单位：秒。超时时间取值在[2，60]之间。超时时间应小于健康检查时间间隔DelayLoop。</p>
     */
    public void setConnectTimeout(Long ConnectTimeout) {
        this.ConnectTimeout = ConnectTimeout;
    }

    /**
     * Get <p>是否开启健康检查，1开启，0关闭。</p> 
     * @return HealthCheck <p>是否开启健康检查，1开启，0关闭。</p>
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * Set <p>是否开启健康检查，1开启，0关闭。</p>
     * @param HealthCheck <p>是否开启健康检查，1开启，0关闭。</p>
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * Get <p>源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启</p> 
     * @return FailoverSwitch <p>源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启</p>
     */
    public Long getFailoverSwitch() {
        return this.FailoverSwitch;
    }

    /**
     * Set <p>源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启</p>
     * @param FailoverSwitch <p>源站是否开启主备模式：1开启，0关闭，DOMAIN类型源站不支持开启</p>
     */
    public void setFailoverSwitch(Long FailoverSwitch) {
        this.FailoverSwitch = FailoverSwitch;
    }

    /**
     * Get <p>健康阈值，表示连续检查成功多少次数后认定源站健康。范围为1到10</p> 
     * @return HealthyThreshold <p>健康阈值，表示连续检查成功多少次数后认定源站健康。范围为1到10</p>
     */
    public Long getHealthyThreshold() {
        return this.HealthyThreshold;
    }

    /**
     * Set <p>健康阈值，表示连续检查成功多少次数后认定源站健康。范围为1到10</p>
     * @param HealthyThreshold <p>健康阈值，表示连续检查成功多少次数后认定源站健康。范围为1到10</p>
     */
    public void setHealthyThreshold(Long HealthyThreshold) {
        this.HealthyThreshold = HealthyThreshold;
    }

    /**
     * Get <p>不健康阈值，表示连续检查失败次数后认定源站不健康。范围为1到10</p> 
     * @return UnhealthyThreshold <p>不健康阈值，表示连续检查失败次数后认定源站不健康。范围为1到10</p>
     */
    public Long getUnhealthyThreshold() {
        return this.UnhealthyThreshold;
    }

    /**
     * Set <p>不健康阈值，表示连续检查失败次数后认定源站不健康。范围为1到10</p>
     * @param UnhealthyThreshold <p>不健康阈值，表示连续检查失败次数后认定源站不健康。范围为1到10</p>
     */
    public void setUnhealthyThreshold(Long UnhealthyThreshold) {
        this.UnhealthyThreshold = UnhealthyThreshold;
    }

    public ModifyTCPListenerAttributeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyTCPListenerAttributeRequest(ModifyTCPListenerAttributeRequest source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ProxyId != null) {
            this.ProxyId = new String(source.ProxyId);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
        if (source.DelayLoop != null) {
            this.DelayLoop = new Long(source.DelayLoop);
        }
        if (source.ConnectTimeout != null) {
            this.ConnectTimeout = new Long(source.ConnectTimeout);
        }
        if (source.HealthCheck != null) {
            this.HealthCheck = new Long(source.HealthCheck);
        }
        if (source.FailoverSwitch != null) {
            this.FailoverSwitch = new Long(source.FailoverSwitch);
        }
        if (source.HealthyThreshold != null) {
            this.HealthyThreshold = new Long(source.HealthyThreshold);
        }
        if (source.UnhealthyThreshold != null) {
            this.UnhealthyThreshold = new Long(source.UnhealthyThreshold);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "ProxyId", this.ProxyId);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "DelayLoop", this.DelayLoop);
        this.setParamSimple(map, prefix + "ConnectTimeout", this.ConnectTimeout);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "FailoverSwitch", this.FailoverSwitch);
        this.setParamSimple(map, prefix + "HealthyThreshold", this.HealthyThreshold);
        this.setParamSimple(map, prefix + "UnhealthyThreshold", this.UnhealthyThreshold);

    }
}

