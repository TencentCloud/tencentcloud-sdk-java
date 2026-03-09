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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ClassicalListener extends AbstractModel {

    /**
    * <p>负载均衡监听器ID</p>
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * <p>负载均衡监听器端口</p>
    */
    @SerializedName("ListenerPort")
    @Expose
    private Long ListenerPort;

    /**
    * <p>监听器后端转发端口</p>
    */
    @SerializedName("InstancePort")
    @Expose
    private Long InstancePort;

    /**
    * <p>监听器名称</p>
    */
    @SerializedName("ListenerName")
    @Expose
    private String ListenerName;

    /**
    * <p>监听器协议类型</p>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>会话保持时间</p>
    */
    @SerializedName("SessionExpire")
    @Expose
    private Long SessionExpire;

    /**
    * <p>是否开启了健康检查：1（开启）、0（关闭）</p>
    */
    @SerializedName("HealthSwitch")
    @Expose
    private Long HealthSwitch;

    /**
    * <p>响应超时时间</p><p>单位：秒</p>
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * <p>检查间隔</p><p>单位：秒</p>
    */
    @SerializedName("IntervalTime")
    @Expose
    private Long IntervalTime;

    /**
    * <p>健康阈值</p>
    */
    @SerializedName("HealthNum")
    @Expose
    private Long HealthNum;

    /**
    * <p>不健康阈值</p>
    */
    @SerializedName("UnhealthNum")
    @Expose
    private Long UnhealthNum;

    /**
    * <p>传统型公网负载均衡 监听器的请求均衡方法。空字符串或wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发，least_conn表示按最小连接数。</p>
    */
    @SerializedName("HttpHash")
    @Expose
    private String HttpHash;

    /**
    * <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释</p>
    */
    @SerializedName("HttpCode")
    @Expose
    private Long HttpCode;

    /**
    * <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径</p>
    */
    @SerializedName("HttpCheckPath")
    @Expose
    private String HttpCheckPath;

    /**
    * <p>传统型公网负载均衡的 HTTPS 监听器的认证方式</p>
    */
    @SerializedName("SSLMode")
    @Expose
    private String SSLMode;

    /**
    * <p>传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID</p>
    */
    @SerializedName("CertId")
    @Expose
    private String CertId;

    /**
    * <p>传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID</p>
    */
    @SerializedName("CertCaId")
    @Expose
    private String CertCaId;

    /**
    * <p>监听器的状态，0 表示创建中，1 表示运行中</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get <p>负载均衡监听器ID</p> 
     * @return ListenerId <p>负载均衡监听器ID</p>
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set <p>负载均衡监听器ID</p>
     * @param ListenerId <p>负载均衡监听器ID</p>
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get <p>负载均衡监听器端口</p> 
     * @return ListenerPort <p>负载均衡监听器端口</p>
     */
    public Long getListenerPort() {
        return this.ListenerPort;
    }

    /**
     * Set <p>负载均衡监听器端口</p>
     * @param ListenerPort <p>负载均衡监听器端口</p>
     */
    public void setListenerPort(Long ListenerPort) {
        this.ListenerPort = ListenerPort;
    }

    /**
     * Get <p>监听器后端转发端口</p> 
     * @return InstancePort <p>监听器后端转发端口</p>
     */
    public Long getInstancePort() {
        return this.InstancePort;
    }

    /**
     * Set <p>监听器后端转发端口</p>
     * @param InstancePort <p>监听器后端转发端口</p>
     */
    public void setInstancePort(Long InstancePort) {
        this.InstancePort = InstancePort;
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
     * Get <p>监听器协议类型</p> 
     * @return Protocol <p>监听器协议类型</p>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>监听器协议类型</p>
     * @param Protocol <p>监听器协议类型</p>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>会话保持时间</p> 
     * @return SessionExpire <p>会话保持时间</p>
     */
    public Long getSessionExpire() {
        return this.SessionExpire;
    }

    /**
     * Set <p>会话保持时间</p>
     * @param SessionExpire <p>会话保持时间</p>
     */
    public void setSessionExpire(Long SessionExpire) {
        this.SessionExpire = SessionExpire;
    }

    /**
     * Get <p>是否开启了健康检查：1（开启）、0（关闭）</p> 
     * @return HealthSwitch <p>是否开启了健康检查：1（开启）、0（关闭）</p>
     */
    public Long getHealthSwitch() {
        return this.HealthSwitch;
    }

    /**
     * Set <p>是否开启了健康检查：1（开启）、0（关闭）</p>
     * @param HealthSwitch <p>是否开启了健康检查：1（开启）、0（关闭）</p>
     */
    public void setHealthSwitch(Long HealthSwitch) {
        this.HealthSwitch = HealthSwitch;
    }

    /**
     * Get <p>响应超时时间</p><p>单位：秒</p> 
     * @return TimeOut <p>响应超时时间</p><p>单位：秒</p>
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * Set <p>响应超时时间</p><p>单位：秒</p>
     * @param TimeOut <p>响应超时时间</p><p>单位：秒</p>
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * Get <p>检查间隔</p><p>单位：秒</p> 
     * @return IntervalTime <p>检查间隔</p><p>单位：秒</p>
     */
    public Long getIntervalTime() {
        return this.IntervalTime;
    }

    /**
     * Set <p>检查间隔</p><p>单位：秒</p>
     * @param IntervalTime <p>检查间隔</p><p>单位：秒</p>
     */
    public void setIntervalTime(Long IntervalTime) {
        this.IntervalTime = IntervalTime;
    }

    /**
     * Get <p>健康阈值</p> 
     * @return HealthNum <p>健康阈值</p>
     */
    public Long getHealthNum() {
        return this.HealthNum;
    }

    /**
     * Set <p>健康阈值</p>
     * @param HealthNum <p>健康阈值</p>
     */
    public void setHealthNum(Long HealthNum) {
        this.HealthNum = HealthNum;
    }

    /**
     * Get <p>不健康阈值</p> 
     * @return UnhealthNum <p>不健康阈值</p>
     */
    public Long getUnhealthNum() {
        return this.UnhealthNum;
    }

    /**
     * Set <p>不健康阈值</p>
     * @param UnhealthNum <p>不健康阈值</p>
     */
    public void setUnhealthNum(Long UnhealthNum) {
        this.UnhealthNum = UnhealthNum;
    }

    /**
     * Get <p>传统型公网负载均衡 监听器的请求均衡方法。空字符串或wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发，least_conn表示按最小连接数。</p> 
     * @return HttpHash <p>传统型公网负载均衡 监听器的请求均衡方法。空字符串或wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发，least_conn表示按最小连接数。</p>
     */
    public String getHttpHash() {
        return this.HttpHash;
    }

    /**
     * Set <p>传统型公网负载均衡 监听器的请求均衡方法。空字符串或wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发，least_conn表示按最小连接数。</p>
     * @param HttpHash <p>传统型公网负载均衡 监听器的请求均衡方法。空字符串或wrr 表示按权重轮询，ip_hash 表示根据访问的源 IP 进行一致性哈希方式来分发，least_conn表示按最小连接数。</p>
     */
    public void setHttpHash(String HttpHash) {
        this.HttpHash = HttpHash;
    }

    /**
     * Get <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释</p> 
     * @return HttpCode <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释</p>
     */
    public Long getHttpCode() {
        return this.HttpCode;
    }

    /**
     * Set <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释</p>
     * @param HttpCode <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查返回码。具体可参考创建监听器中对该字段的解释</p>
     */
    public void setHttpCode(Long HttpCode) {
        this.HttpCode = HttpCode;
    }

    /**
     * Get <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径</p> 
     * @return HttpCheckPath <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径</p>
     */
    public String getHttpCheckPath() {
        return this.HttpCheckPath;
    }

    /**
     * Set <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径</p>
     * @param HttpCheckPath <p>传统型公网负载均衡的 HTTP、HTTPS 监听器的健康检查路径</p>
     */
    public void setHttpCheckPath(String HttpCheckPath) {
        this.HttpCheckPath = HttpCheckPath;
    }

    /**
     * Get <p>传统型公网负载均衡的 HTTPS 监听器的认证方式</p> 
     * @return SSLMode <p>传统型公网负载均衡的 HTTPS 监听器的认证方式</p>
     */
    public String getSSLMode() {
        return this.SSLMode;
    }

    /**
     * Set <p>传统型公网负载均衡的 HTTPS 监听器的认证方式</p>
     * @param SSLMode <p>传统型公网负载均衡的 HTTPS 监听器的认证方式</p>
     */
    public void setSSLMode(String SSLMode) {
        this.SSLMode = SSLMode;
    }

    /**
     * Get <p>传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID</p> 
     * @return CertId <p>传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID</p>
     */
    public String getCertId() {
        return this.CertId;
    }

    /**
     * Set <p>传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID</p>
     * @param CertId <p>传统型公网负载均衡的 HTTPS 监听器的服务端证书 ID</p>
     */
    public void setCertId(String CertId) {
        this.CertId = CertId;
    }

    /**
     * Get <p>传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID</p> 
     * @return CertCaId <p>传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID</p>
     */
    public String getCertCaId() {
        return this.CertCaId;
    }

    /**
     * Set <p>传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID</p>
     * @param CertCaId <p>传统型公网负载均衡的 HTTPS 监听器的客户端证书 ID</p>
     */
    public void setCertCaId(String CertCaId) {
        this.CertCaId = CertCaId;
    }

    /**
     * Get <p>监听器的状态，0 表示创建中，1 表示运行中</p> 
     * @return Status <p>监听器的状态，0 表示创建中，1 表示运行中</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>监听器的状态，0 表示创建中，1 表示运行中</p>
     * @param Status <p>监听器的状态，0 表示创建中，1 表示运行中</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public ClassicalListener() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ClassicalListener(ClassicalListener source) {
        if (source.ListenerId != null) {
            this.ListenerId = new String(source.ListenerId);
        }
        if (source.ListenerPort != null) {
            this.ListenerPort = new Long(source.ListenerPort);
        }
        if (source.InstancePort != null) {
            this.InstancePort = new Long(source.InstancePort);
        }
        if (source.ListenerName != null) {
            this.ListenerName = new String(source.ListenerName);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SessionExpire != null) {
            this.SessionExpire = new Long(source.SessionExpire);
        }
        if (source.HealthSwitch != null) {
            this.HealthSwitch = new Long(source.HealthSwitch);
        }
        if (source.TimeOut != null) {
            this.TimeOut = new Long(source.TimeOut);
        }
        if (source.IntervalTime != null) {
            this.IntervalTime = new Long(source.IntervalTime);
        }
        if (source.HealthNum != null) {
            this.HealthNum = new Long(source.HealthNum);
        }
        if (source.UnhealthNum != null) {
            this.UnhealthNum = new Long(source.UnhealthNum);
        }
        if (source.HttpHash != null) {
            this.HttpHash = new String(source.HttpHash);
        }
        if (source.HttpCode != null) {
            this.HttpCode = new Long(source.HttpCode);
        }
        if (source.HttpCheckPath != null) {
            this.HttpCheckPath = new String(source.HttpCheckPath);
        }
        if (source.SSLMode != null) {
            this.SSLMode = new String(source.SSLMode);
        }
        if (source.CertId != null) {
            this.CertId = new String(source.CertId);
        }
        if (source.CertCaId != null) {
            this.CertCaId = new String(source.CertCaId);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
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

