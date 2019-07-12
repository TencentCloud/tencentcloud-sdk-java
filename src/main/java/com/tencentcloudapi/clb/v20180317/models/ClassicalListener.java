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

public class ClassicalListener  extends AbstractModel{

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
    private Integer ListenerPort;

    /**
    * 监听器后端转发端口
    */
    @SerializedName("InstancePort")
    @Expose
    private Integer InstancePort;

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
    private Integer SessionExpire;

    /**
    * 是否开启了健康检查：1（开启）、0（关闭）
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Integer HealthSwitch;

    /**
    * 响应超时时间
    */
    @SerializedName("TimeOut")
    @Expose
    private Integer TimeOut;

    /**
    * 检查间隔
    */
    @SerializedName("IntervalTime")
    @Expose
    private Integer IntervalTime;

    /**
    * 健康阈值
    */
    @SerializedName("HealthNum")
    @Expose
    private Integer HealthNum;

    /**
    * 不健康阈值
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Integer UnhealthNum;

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
    private Integer HttpCode;

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
    private Integer Status;

    /**
     * 获取负载均衡监听器ID
     * @return ListenerId 负载均衡监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置负载均衡监听器ID
     * @param ListenerId 负载均衡监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取负载均衡监听器端口
     * @return ListenerPort 负载均衡监听器端口
     */
    public Integer getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * 设置负载均衡监听器端口
     * @param ListenerPort 负载均衡监听器端口
     */
    public void setListenerPort(Integer ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * 获取监听器后端转发端口
     * @return InstancePort 监听器后端转发端口
     */
    public Integer getInstancePort() {
        return this.InstancePort;
    }

    /**
     * 设置监听器后端转发端口
     * @param InstancePort 监听器后端转发端口
     */
    public void setInstancePort(Integer InstancePort) {
        this.InstancePort = InstancePort;
    }

    /**
     * 获取监听器名称
     * @return ListenerName 监听器名称
     */
    public String getListenerName() {
        return this.ListenerName;
    }

    /**
     * 设置监听器名称
     * @param ListenerName 监听器名称
     */
    public void setListenerName(String ListenerName) {
        this.ListenerName = ListenerName;
    }

    /**
     * 获取监听器协议类型
     * @return Protocol 监听器协议类型
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置监听器协议类型
     * @param Protocol 监听器协议类型
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取会话保持时间
     * @return SessionExpire 会话保持时间
     */
    public Integer getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * 设置会话保持时间
     * @param SessionExpire 会话保持时间
     */
    public void setSessionExpire(Integer SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * 获取是否开启了健康检查：1（开启）、0（关闭）
     * @return HealthSwitch 是否开启了健康检查：1（开启）、0（关闭）
     */
    public Integer getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * 设置是否开启了健康检查：1（开启）、0（关闭）
     * @param HealthSwitch 是否开启了健康检查：1（开启）、0（关闭）
     */
    public void setHealthSwitch(Integer HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * 获取响应超时时间
     * @return TimeOut 响应超时时间
     */
    public Integer getTimeOut() {
        return this.TimeOut;
    }

    /**
     * 设置响应超时时间
     * @param TimeOut 响应超时时间
     */
    public void setTimeOut(Integer TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * 获取检查间隔
     * @return IntervalTime 检查间隔
     */
    public Integer getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * 设置检查间隔
     * @param IntervalTime 检查间隔
     */
    public void setIntervalTime(Integer IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * 获取健康阈值
     * @return HealthNum 健康阈值
     */
    public Integer getHealthNum() {
        return this.HealthNum;
    }

    /**
     * 设置健康阈值
     * @param HealthNum 健康阈值
     */
    public void setHealthNum(Integer HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * 获取不健康阈值
     * @return UnhealthNum 不健康阈值
     */
    public Integer getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * 设置不健康阈值
     * @param UnhealthNum 不健康阈值
     */
    public void setUnhealthNum(Integer UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * 获取传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发
     * @return HttpHash 传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发
     */
    public String getHttpHash() {
        return this.HttpHash;
    }

    /**
     * 设置传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发
     * @param HttpHash 传统型公网负载均衡的 HTTP、HTTPS 监听器的请求均衡方法。wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发
     */
    public void setHttpHash(String HttpHash) {
        this.HttpHash = HttpHash;
    }

    /**
     * 获取传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释
     * @return HttpCode 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释
     */
    public Integer getHttpCode() {
        return this.HttpCode;
    }

    /**
     * 设置传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释
     * @param HttpCode 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释
     */
    public void setHttpCode(Integer HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * 获取传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径
     * @return HttpCheckPath 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * 设置传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径
     * @param HttpCheckPath 传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * 获取传统型公网负载均衡的 HTTPS 监听器的认证方式
     * @return SSLMode 传统型公网负载均衡的 HTTPS 监听器的认证方式
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * 设置传统型公网负载均衡的 HTTPS 监听器的认证方式
     * @param SSLMode 传统型公网负载均衡的 HTTPS 监听器的认证方式
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * 获取传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID
     * @return CertId 传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * 设置传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID
     * @param CertId 传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * 获取传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID
     * @return CertCaId 传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * 设置传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID
     * @param CertCaId 传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * 获取监听器的状态，0 表示创建中，1 表示运行中
     * @return Status 监听器的状态，0 表示创建中，1 表示运行中
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置监听器的状态，0 表示创建中，1 表示运行中
     * @param Status 监听器的状态，0 表示创建中，1 表示运行中
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
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

