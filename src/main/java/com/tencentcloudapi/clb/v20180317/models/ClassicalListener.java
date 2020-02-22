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

public class ClassicalListener extends AbstractModel{

    /**
    * 负载均衡监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 负载均衡监听器端口
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * 监听器后端转发端口
    */
    @SerializedName("InstancePort")
    @Expose
    private Long InstancePort;

    /**
    * 监听器名称
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * 监听器协议类型
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 会话保持时间
    */
    @SerializedName("SessionExpire")
    @Expose
    private Long SessionExpire;

    /**
    * 是否开启了健康检查：1（开启）、0（关闭）
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * 响应超时时间
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 检查间隔
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * 健康阈值
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * 不健康阈值
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Long UnhealthNum;

    /**
    * 传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发
    */
    @SerializedName("HttpHash")
    @Expose
    private String HttpHash;

    /**
    * 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * 传统型公网负载均衡的 HTTPS 监听器的认证方式
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * 传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * 传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * 监听器的状态，0 表示创建中，1 表示运行中
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 负载均衡监听器ID 
     * @return ListenerId 负载均衡监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 负载均衡监听器ID
     * @param ListenerId 负载均衡监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 负载均衡监听器端口 
     * @return ListenerPort 负载均衡监听器端口
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set 负载均衡监听器端口
     * @param ListenerPort 负载均衡监听器端口
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get 监听器后端转发端口 
     * @return InstancePort 监听器后端转发端口
     */
    public Long getInstancePort() {
        return this.InstancePort;
    }

    /**
     * Set 监听器后端转发端口
     * @param InstancePort 监听器后端转发端口
     */
    public void setInstancePort(Long InstancePort) {
        this.InstancePort = InstancePort;
    }

    /**
     * Get 监听器名称 
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * Set 监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * Get 监听器协议类型 
     * @return Protocol 监听器协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 监听器协议类型
     * @param Protocol 监听器协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 会话保持时间 
     * @return SessionExpire 会话保持时间
     */
    public Long getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * Set 会话保持时间
     * @param SessionExpire 会话保持时间
     */
    public void setSessionExpire(Long SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * Get 是否开启了健康检查：1（开启）、0（关闭） 
     * @return HealthSwitch 是否开启了健康检查：1（开启）、0（关闭）
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set 是否开启了健康检查：1（开启）、0（关闭）
     * @param HealthSwitch 是否开启了健康检查：1（开启）、0（关闭）
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get 响应超时时间 
     * @return TimeOut 响应超时时间
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set 响应超时时间
     * @param TimeOut 响应超时时间
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get 检查间隔 
     * @return IntervalTime 检查间隔
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set 检查间隔
     * @param IntervalTime 检查间隔
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get 健康阈值 
     * @return HealthNum 健康阈值
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set 健康阈值
     * @param HealthNum 健康阈值
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get 不健康阈值 
     * @return UnhealthNum 不健康阈值
     */
    public Long getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * Set 不健康阈值
     * @param UnhealthNum 不健康阈值
     */
    public void setUnhealthNum(Long UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * Get 传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发 
     * @return HttpHash 传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发
     */
    public String getHttpHash() {
        return this.HttpHash;
    }

    /**
     * Set 传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发
     * @param HttpHash 传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发
     */
    public void setHttpHash(String HttpHash) {
        this.HttpHash = HttpHash;
    }

    /**
     * Get 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释 
     * @return HttpCode 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释
     * @param HttpCode 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径 
     * @return HttpCheckPath 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径
     * @param HttpCheckPath 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get 传统型公网负载均衡的 HTTPS 监听器的认证方式 
     * @return SSLMode 传统型公网负载均衡的 HTTPS 监听器的认证方式
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set 传统型公网负载均衡的 HTTPS 监听器的认证方式
     * @param SSLMode 传统型公网负载均衡的 HTTPS 监听器的认证方式
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get 传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID 
     * @return CertId 传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set 传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID
     * @param CertId 传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get 传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID 
     * @return CertCaId 传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set 传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID
     * @param CertCaId 传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get 监听器的状态，0 表示创建中，1 表示运行中 
     * @return Status 监听器的状态，0 表示创建中，1 表示运行中
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 监听器的状态，0 表示创建中，1 表示运行中
     * @param Status 监听器的状态，0 表示创建中，1 表示运行中
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "ListenerPort", this.ListenerPort);
        this.setParamSimple(map, prefix + "InstancePort", this.InstancePort);
        this.setParamSimple(map, prefix + "ListenerName", this.ListenerName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SessionExpire", this.SessionExpire);
        this.setParamSimple(map, prefix + "HealthSwitch", this.HealthSwitch);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "IntervalTime", this.IntervalTime);
        this.setParamSimple(map, prefix + "HealthNum", this.HealthNum);
        this.setParamSimple(map, prefix + "UnhealthNum", this.UnhealthNum);
        this.setParamSimple(map, prefix + "HttpHash", this.HttpHash);
        this.setParamSimple(map, prefix + "HttpCode", this.HttpCode);
        this.setParamSimple(map, prefix + "HttpCheckPath", this.HttpCheckPath);
        this.setParamSimple(map, prefix + "SSLMode", this.SSLMode);
        this.setParamSimple(map, prefix + "CertId", this.CertId);
        this.setParamSimple(map, prefix + "CertCaId", this.CertCaId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

