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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterAccessInfo extends AbstractModel {

    /**
    * <p>集群公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * <p>集群 Web 控制台公网访问地址</p>
    */
    @SerializedName("WebConsoleEndpoint")
    @Expose
    private String WebConsoleEndpoint;

    /**
    * <p>集群 Web 控制台登录用户名</p>
    */
    @SerializedName("WebConsoleUsername")
    @Expose
    private String WebConsoleUsername;

    /**
    * <p>集群 Web 控制台登录密码</p>
    */
    @SerializedName("WebConsolePassword")
    @Expose
    private String WebConsolePassword;

    /**
    * <p>已废弃</p>
    */
    @SerializedName("PublicAccessEndpointStatus")
    @Expose
    private Boolean PublicAccessEndpointStatus;

    /**
    * <p>已废弃</p>
    */
    @SerializedName("PublicControlConsoleSwitchStatus")
    @Expose
    private Boolean PublicControlConsoleSwitchStatus;

    /**
    * <p>已废弃</p>
    */
    @SerializedName("VpcControlConsoleSwitchStatus")
    @Expose
    private Boolean VpcControlConsoleSwitchStatus;

    /**
    * <p>Web 管控台 VPC 访问地址</p>
    */
    @SerializedName("VpcWebConsoleEndpoint")
    @Expose
    private String VpcWebConsoleEndpoint;

    /**
    * <p>Web 控制台公网访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
    */
    @SerializedName("PublicWebConsoleSwitchStatus")
    @Expose
    private String PublicWebConsoleSwitchStatus;

    /**
    * <p>Web 控制台 VPC 访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
    */
    @SerializedName("VpcWebConsoleSwitchStatus")
    @Expose
    private String VpcWebConsoleSwitchStatus;

    /**
    * <p>公网接入点开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
    */
    @SerializedName("PublicDataStreamStatus")
    @Expose
    private String PublicDataStreamStatus;

    /**
    * <p>Prometheus信息</p>
    */
    @SerializedName("PrometheusEndpointInfo")
    @Expose
    private PrometheusEndpointInfo PrometheusEndpointInfo;

    /**
    * <p>公网域名接入点</p>
    */
    @SerializedName("WebConsoleDomainEndpoint")
    @Expose
    private String WebConsoleDomainEndpoint;

    /**
    * <p>控制面所使用的VPC信息</p>
    */
    @SerializedName("ControlPlaneEndpointInfo")
    @Expose
    private VpcEndpointInfo ControlPlaneEndpointInfo;

    /**
    * <p>TLS加密的数据流公网接入点</p>
    */
    @SerializedName("PublicTlsAccessEndpoint")
    @Expose
    private String PublicTlsAccessEndpoint;

    /**
    * <p>公网IP是否复用</p>
    */
    @SerializedName("PublicIpReused")
    @Expose
    private Boolean PublicIpReused;

    /**
    * <p>Web 控制台公网访问操作的错误信息</p>
    */
    @SerializedName("PublicWebConsoleErrorMessage")
    @Expose
    private String PublicWebConsoleErrorMessage;

    /**
    * <p>Web 控制台 VPC 访问操作的错误信息</p>
    */
    @SerializedName("VpcWebConsoleErrorMessage")
    @Expose
    private String VpcWebConsoleErrorMessage;

    /**
    * <p>公网接入点操作的错误信息</p>
    */
    @SerializedName("PublicDataStreamErrorMessage")
    @Expose
    private String PublicDataStreamErrorMessage;

    /**
    * <p>公网Stream接入点</p>
    */
    @SerializedName("PublicStreamAccessEndpoint")
    @Expose
    private String PublicStreamAccessEndpoint;

    /**
     * Get <p>集群公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAccessEndpoint <p>集群公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set <p>集群公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAccessEndpoint <p>集群公网接入地址</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get <p>集群 Web 控制台公网访问地址</p> 
     * @return WebConsoleEndpoint <p>集群 Web 控制台公网访问地址</p>
     */
    public String getWebConsoleEndpoint() {
        return this.WebConsoleEndpoint;
    }

    /**
     * Set <p>集群 Web 控制台公网访问地址</p>
     * @param WebConsoleEndpoint <p>集群 Web 控制台公网访问地址</p>
     */
    public void setWebConsoleEndpoint(String WebConsoleEndpoint) {
        this.WebConsoleEndpoint = WebConsoleEndpoint;
    }

    /**
     * Get <p>集群 Web 控制台登录用户名</p> 
     * @return WebConsoleUsername <p>集群 Web 控制台登录用户名</p>
     */
    public String getWebConsoleUsername() {
        return this.WebConsoleUsername;
    }

    /**
     * Set <p>集群 Web 控制台登录用户名</p>
     * @param WebConsoleUsername <p>集群 Web 控制台登录用户名</p>
     */
    public void setWebConsoleUsername(String WebConsoleUsername) {
        this.WebConsoleUsername = WebConsoleUsername;
    }

    /**
     * Get <p>集群 Web 控制台登录密码</p> 
     * @return WebConsolePassword <p>集群 Web 控制台登录密码</p>
     */
    public String getWebConsolePassword() {
        return this.WebConsolePassword;
    }

    /**
     * Set <p>集群 Web 控制台登录密码</p>
     * @param WebConsolePassword <p>集群 Web 控制台登录密码</p>
     */
    public void setWebConsolePassword(String WebConsolePassword) {
        this.WebConsolePassword = WebConsolePassword;
    }

    /**
     * Get <p>已废弃</p> 
     * @return PublicAccessEndpointStatus <p>已废弃</p>
     */
    public Boolean getPublicAccessEndpointStatus() {
        return this.PublicAccessEndpointStatus;
    }

    /**
     * Set <p>已废弃</p>
     * @param PublicAccessEndpointStatus <p>已废弃</p>
     */
    public void setPublicAccessEndpointStatus(Boolean PublicAccessEndpointStatus) {
        this.PublicAccessEndpointStatus = PublicAccessEndpointStatus;
    }

    /**
     * Get <p>已废弃</p> 
     * @return PublicControlConsoleSwitchStatus <p>已废弃</p>
     */
    public Boolean getPublicControlConsoleSwitchStatus() {
        return this.PublicControlConsoleSwitchStatus;
    }

    /**
     * Set <p>已废弃</p>
     * @param PublicControlConsoleSwitchStatus <p>已废弃</p>
     */
    public void setPublicControlConsoleSwitchStatus(Boolean PublicControlConsoleSwitchStatus) {
        this.PublicControlConsoleSwitchStatus = PublicControlConsoleSwitchStatus;
    }

    /**
     * Get <p>已废弃</p> 
     * @return VpcControlConsoleSwitchStatus <p>已废弃</p>
     */
    public Boolean getVpcControlConsoleSwitchStatus() {
        return this.VpcControlConsoleSwitchStatus;
    }

    /**
     * Set <p>已废弃</p>
     * @param VpcControlConsoleSwitchStatus <p>已废弃</p>
     */
    public void setVpcControlConsoleSwitchStatus(Boolean VpcControlConsoleSwitchStatus) {
        this.VpcControlConsoleSwitchStatus = VpcControlConsoleSwitchStatus;
    }

    /**
     * Get <p>Web 管控台 VPC 访问地址</p> 
     * @return VpcWebConsoleEndpoint <p>Web 管控台 VPC 访问地址</p>
     */
    public String getVpcWebConsoleEndpoint() {
        return this.VpcWebConsoleEndpoint;
    }

    /**
     * Set <p>Web 管控台 VPC 访问地址</p>
     * @param VpcWebConsoleEndpoint <p>Web 管控台 VPC 访问地址</p>
     */
    public void setVpcWebConsoleEndpoint(String VpcWebConsoleEndpoint) {
        this.VpcWebConsoleEndpoint = VpcWebConsoleEndpoint;
    }

    /**
     * Get <p>Web 控制台公网访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul> 
     * @return PublicWebConsoleSwitchStatus <p>Web 控制台公网访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     */
    public String getPublicWebConsoleSwitchStatus() {
        return this.PublicWebConsoleSwitchStatus;
    }

    /**
     * Set <p>Web 控制台公网访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     * @param PublicWebConsoleSwitchStatus <p>Web 控制台公网访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     */
    public void setPublicWebConsoleSwitchStatus(String PublicWebConsoleSwitchStatus) {
        this.PublicWebConsoleSwitchStatus = PublicWebConsoleSwitchStatus;
    }

    /**
     * Get <p>Web 控制台 VPC 访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul> 
     * @return VpcWebConsoleSwitchStatus <p>Web 控制台 VPC 访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     */
    public String getVpcWebConsoleSwitchStatus() {
        return this.VpcWebConsoleSwitchStatus;
    }

    /**
     * Set <p>Web 控制台 VPC 访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     * @param VpcWebConsoleSwitchStatus <p>Web 控制台 VPC 访问开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     */
    public void setVpcWebConsoleSwitchStatus(String VpcWebConsoleSwitchStatus) {
        this.VpcWebConsoleSwitchStatus = VpcWebConsoleSwitchStatus;
    }

    /**
     * Get <p>公网接入点开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul> 
     * @return PublicDataStreamStatus <p>公网接入点开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     */
    public String getPublicDataStreamStatus() {
        return this.PublicDataStreamStatus;
    }

    /**
     * Set <p>公网接入点开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     * @param PublicDataStreamStatus <p>公网接入点开关状态</p><p>枚举值：</p><ul><li>OFF： 已关闭</li><li>ON： 已开启</li><li>CREATING： 创建中</li><li>DELETING： 删除中</li><li>CREATE_FAILURE： 创建失败</li><li>DELETE_FAILURE： 删除失败</li></ul>
     */
    public void setPublicDataStreamStatus(String PublicDataStreamStatus) {
        this.PublicDataStreamStatus = PublicDataStreamStatus;
    }

    /**
     * Get <p>Prometheus信息</p> 
     * @return PrometheusEndpointInfo <p>Prometheus信息</p>
     */
    public PrometheusEndpointInfo getPrometheusEndpointInfo() {
        return this.PrometheusEndpointInfo;
    }

    /**
     * Set <p>Prometheus信息</p>
     * @param PrometheusEndpointInfo <p>Prometheus信息</p>
     */
    public void setPrometheusEndpointInfo(PrometheusEndpointInfo PrometheusEndpointInfo) {
        this.PrometheusEndpointInfo = PrometheusEndpointInfo;
    }

    /**
     * Get <p>公网域名接入点</p> 
     * @return WebConsoleDomainEndpoint <p>公网域名接入点</p>
     */
    public String getWebConsoleDomainEndpoint() {
        return this.WebConsoleDomainEndpoint;
    }

    /**
     * Set <p>公网域名接入点</p>
     * @param WebConsoleDomainEndpoint <p>公网域名接入点</p>
     */
    public void setWebConsoleDomainEndpoint(String WebConsoleDomainEndpoint) {
        this.WebConsoleDomainEndpoint = WebConsoleDomainEndpoint;
    }

    /**
     * Get <p>控制面所使用的VPC信息</p> 
     * @return ControlPlaneEndpointInfo <p>控制面所使用的VPC信息</p>
     */
    public VpcEndpointInfo getControlPlaneEndpointInfo() {
        return this.ControlPlaneEndpointInfo;
    }

    /**
     * Set <p>控制面所使用的VPC信息</p>
     * @param ControlPlaneEndpointInfo <p>控制面所使用的VPC信息</p>
     */
    public void setControlPlaneEndpointInfo(VpcEndpointInfo ControlPlaneEndpointInfo) {
        this.ControlPlaneEndpointInfo = ControlPlaneEndpointInfo;
    }

    /**
     * Get <p>TLS加密的数据流公网接入点</p> 
     * @return PublicTlsAccessEndpoint <p>TLS加密的数据流公网接入点</p>
     */
    public String getPublicTlsAccessEndpoint() {
        return this.PublicTlsAccessEndpoint;
    }

    /**
     * Set <p>TLS加密的数据流公网接入点</p>
     * @param PublicTlsAccessEndpoint <p>TLS加密的数据流公网接入点</p>
     */
    public void setPublicTlsAccessEndpoint(String PublicTlsAccessEndpoint) {
        this.PublicTlsAccessEndpoint = PublicTlsAccessEndpoint;
    }

    /**
     * Get <p>公网IP是否复用</p> 
     * @return PublicIpReused <p>公网IP是否复用</p>
     */
    public Boolean getPublicIpReused() {
        return this.PublicIpReused;
    }

    /**
     * Set <p>公网IP是否复用</p>
     * @param PublicIpReused <p>公网IP是否复用</p>
     */
    public void setPublicIpReused(Boolean PublicIpReused) {
        this.PublicIpReused = PublicIpReused;
    }

    /**
     * Get <p>Web 控制台公网访问操作的错误信息</p> 
     * @return PublicWebConsoleErrorMessage <p>Web 控制台公网访问操作的错误信息</p>
     */
    public String getPublicWebConsoleErrorMessage() {
        return this.PublicWebConsoleErrorMessage;
    }

    /**
     * Set <p>Web 控制台公网访问操作的错误信息</p>
     * @param PublicWebConsoleErrorMessage <p>Web 控制台公网访问操作的错误信息</p>
     */
    public void setPublicWebConsoleErrorMessage(String PublicWebConsoleErrorMessage) {
        this.PublicWebConsoleErrorMessage = PublicWebConsoleErrorMessage;
    }

    /**
     * Get <p>Web 控制台 VPC 访问操作的错误信息</p> 
     * @return VpcWebConsoleErrorMessage <p>Web 控制台 VPC 访问操作的错误信息</p>
     */
    public String getVpcWebConsoleErrorMessage() {
        return this.VpcWebConsoleErrorMessage;
    }

    /**
     * Set <p>Web 控制台 VPC 访问操作的错误信息</p>
     * @param VpcWebConsoleErrorMessage <p>Web 控制台 VPC 访问操作的错误信息</p>
     */
    public void setVpcWebConsoleErrorMessage(String VpcWebConsoleErrorMessage) {
        this.VpcWebConsoleErrorMessage = VpcWebConsoleErrorMessage;
    }

    /**
     * Get <p>公网接入点操作的错误信息</p> 
     * @return PublicDataStreamErrorMessage <p>公网接入点操作的错误信息</p>
     */
    public String getPublicDataStreamErrorMessage() {
        return this.PublicDataStreamErrorMessage;
    }

    /**
     * Set <p>公网接入点操作的错误信息</p>
     * @param PublicDataStreamErrorMessage <p>公网接入点操作的错误信息</p>
     */
    public void setPublicDataStreamErrorMessage(String PublicDataStreamErrorMessage) {
        this.PublicDataStreamErrorMessage = PublicDataStreamErrorMessage;
    }

    /**
     * Get <p>公网Stream接入点</p> 
     * @return PublicStreamAccessEndpoint <p>公网Stream接入点</p>
     */
    public String getPublicStreamAccessEndpoint() {
        return this.PublicStreamAccessEndpoint;
    }

    /**
     * Set <p>公网Stream接入点</p>
     * @param PublicStreamAccessEndpoint <p>公网Stream接入点</p>
     */
    public void setPublicStreamAccessEndpoint(String PublicStreamAccessEndpoint) {
        this.PublicStreamAccessEndpoint = PublicStreamAccessEndpoint;
    }

    public RabbitMQClusterAccessInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RabbitMQClusterAccessInfo(RabbitMQClusterAccessInfo source) {
        if (source.PublicAccessEndpoint != null) {
            this.PublicAccessEndpoint = new String(source.PublicAccessEndpoint);
        }
        if (source.WebConsoleEndpoint != null) {
            this.WebConsoleEndpoint = new String(source.WebConsoleEndpoint);
        }
        if (source.WebConsoleUsername != null) {
            this.WebConsoleUsername = new String(source.WebConsoleUsername);
        }
        if (source.WebConsolePassword != null) {
            this.WebConsolePassword = new String(source.WebConsolePassword);
        }
        if (source.PublicAccessEndpointStatus != null) {
            this.PublicAccessEndpointStatus = new Boolean(source.PublicAccessEndpointStatus);
        }
        if (source.PublicControlConsoleSwitchStatus != null) {
            this.PublicControlConsoleSwitchStatus = new Boolean(source.PublicControlConsoleSwitchStatus);
        }
        if (source.VpcControlConsoleSwitchStatus != null) {
            this.VpcControlConsoleSwitchStatus = new Boolean(source.VpcControlConsoleSwitchStatus);
        }
        if (source.VpcWebConsoleEndpoint != null) {
            this.VpcWebConsoleEndpoint = new String(source.VpcWebConsoleEndpoint);
        }
        if (source.PublicWebConsoleSwitchStatus != null) {
            this.PublicWebConsoleSwitchStatus = new String(source.PublicWebConsoleSwitchStatus);
        }
        if (source.VpcWebConsoleSwitchStatus != null) {
            this.VpcWebConsoleSwitchStatus = new String(source.VpcWebConsoleSwitchStatus);
        }
        if (source.PublicDataStreamStatus != null) {
            this.PublicDataStreamStatus = new String(source.PublicDataStreamStatus);
        }
        if (source.PrometheusEndpointInfo != null) {
            this.PrometheusEndpointInfo = new PrometheusEndpointInfo(source.PrometheusEndpointInfo);
        }
        if (source.WebConsoleDomainEndpoint != null) {
            this.WebConsoleDomainEndpoint = new String(source.WebConsoleDomainEndpoint);
        }
        if (source.ControlPlaneEndpointInfo != null) {
            this.ControlPlaneEndpointInfo = new VpcEndpointInfo(source.ControlPlaneEndpointInfo);
        }
        if (source.PublicTlsAccessEndpoint != null) {
            this.PublicTlsAccessEndpoint = new String(source.PublicTlsAccessEndpoint);
        }
        if (source.PublicIpReused != null) {
            this.PublicIpReused = new Boolean(source.PublicIpReused);
        }
        if (source.PublicWebConsoleErrorMessage != null) {
            this.PublicWebConsoleErrorMessage = new String(source.PublicWebConsoleErrorMessage);
        }
        if (source.VpcWebConsoleErrorMessage != null) {
            this.VpcWebConsoleErrorMessage = new String(source.VpcWebConsoleErrorMessage);
        }
        if (source.PublicDataStreamErrorMessage != null) {
            this.PublicDataStreamErrorMessage = new String(source.PublicDataStreamErrorMessage);
        }
        if (source.PublicStreamAccessEndpoint != null) {
            this.PublicStreamAccessEndpoint = new String(source.PublicStreamAccessEndpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PublicAccessEndpoint", this.PublicAccessEndpoint);
        this.setParamSimple(map, prefix + "WebConsoleEndpoint", this.WebConsoleEndpoint);
        this.setParamSimple(map, prefix + "WebConsoleUsername", this.WebConsoleUsername);
        this.setParamSimple(map, prefix + "WebConsolePassword", this.WebConsolePassword);
        this.setParamSimple(map, prefix + "PublicAccessEndpointStatus", this.PublicAccessEndpointStatus);
        this.setParamSimple(map, prefix + "PublicControlConsoleSwitchStatus", this.PublicControlConsoleSwitchStatus);
        this.setParamSimple(map, prefix + "VpcControlConsoleSwitchStatus", this.VpcControlConsoleSwitchStatus);
        this.setParamSimple(map, prefix + "VpcWebConsoleEndpoint", this.VpcWebConsoleEndpoint);
        this.setParamSimple(map, prefix + "PublicWebConsoleSwitchStatus", this.PublicWebConsoleSwitchStatus);
        this.setParamSimple(map, prefix + "VpcWebConsoleSwitchStatus", this.VpcWebConsoleSwitchStatus);
        this.setParamSimple(map, prefix + "PublicDataStreamStatus", this.PublicDataStreamStatus);
        this.setParamObj(map, prefix + "PrometheusEndpointInfo.", this.PrometheusEndpointInfo);
        this.setParamSimple(map, prefix + "WebConsoleDomainEndpoint", this.WebConsoleDomainEndpoint);
        this.setParamObj(map, prefix + "ControlPlaneEndpointInfo.", this.ControlPlaneEndpointInfo);
        this.setParamSimple(map, prefix + "PublicTlsAccessEndpoint", this.PublicTlsAccessEndpoint);
        this.setParamSimple(map, prefix + "PublicIpReused", this.PublicIpReused);
        this.setParamSimple(map, prefix + "PublicWebConsoleErrorMessage", this.PublicWebConsoleErrorMessage);
        this.setParamSimple(map, prefix + "VpcWebConsoleErrorMessage", this.VpcWebConsoleErrorMessage);
        this.setParamSimple(map, prefix + "PublicDataStreamErrorMessage", this.PublicDataStreamErrorMessage);
        this.setParamSimple(map, prefix + "PublicStreamAccessEndpoint", this.PublicStreamAccessEndpoint);

    }
}

