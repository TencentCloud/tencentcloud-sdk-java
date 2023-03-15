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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RabbitMQClusterAccessInfo extends AbstractModel{

    /**
    * 集群公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicAccessEndpoint")
    @Expose
    private String PublicAccessEndpoint;

    /**
    * 集群控制台访问地址
    */
    @SerializedName("WebConsoleEndpoint")
    @Expose
    private String WebConsoleEndpoint;

    /**
    * 集群控制台登录用户名
    */
    @SerializedName("WebConsoleUsername")
    @Expose
    private String WebConsoleUsername;

    /**
    * 集群控制台登录密码
    */
    @SerializedName("WebConsolePassword")
    @Expose
    private String WebConsolePassword;

    /**
    * 已废弃
    */
    @SerializedName("PublicAccessEndpointStatus")
    @Expose
    private Boolean PublicAccessEndpointStatus;

    /**
    * 已废弃
    */
    @SerializedName("PublicControlConsoleSwitchStatus")
    @Expose
    private Boolean PublicControlConsoleSwitchStatus;

    /**
    * 已废弃
    */
    @SerializedName("VpcControlConsoleSwitchStatus")
    @Expose
    private Boolean VpcControlConsoleSwitchStatus;

    /**
    * Vpc管控台访问地址，示例值，http://1.1.1.1:15672
    */
    @SerializedName("VpcWebConsoleEndpoint")
    @Expose
    private String VpcWebConsoleEndpoint;

    /**
    * 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicWebConsoleSwitchStatus")
    @Expose
    private String PublicWebConsoleSwitchStatus;

    /**
    * Vpc管控台开关状态，示例值，
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcWebConsoleSwitchStatus")
    @Expose
    private String VpcWebConsoleSwitchStatus;

    /**
    * 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PublicDataStreamStatus")
    @Expose
    private String PublicDataStreamStatus;

    /**
    * Prometheus信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrometheusEndpointInfo")
    @Expose
    private PrometheusEndpointInfo PrometheusEndpointInfo;

    /**
     * Get 集群公网接入地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicAccessEndpoint 集群公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicAccessEndpoint() {
        return this.PublicAccessEndpoint;
    }

    /**
     * Set 集群公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicAccessEndpoint 集群公网接入地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicAccessEndpoint(String PublicAccessEndpoint) {
        this.PublicAccessEndpoint = PublicAccessEndpoint;
    }

    /**
     * Get 集群控制台访问地址 
     * @return WebConsoleEndpoint 集群控制台访问地址
     */
    public String getWebConsoleEndpoint() {
        return this.WebConsoleEndpoint;
    }

    /**
     * Set 集群控制台访问地址
     * @param WebConsoleEndpoint 集群控制台访问地址
     */
    public void setWebConsoleEndpoint(String WebConsoleEndpoint) {
        this.WebConsoleEndpoint = WebConsoleEndpoint;
    }

    /**
     * Get 集群控制台登录用户名 
     * @return WebConsoleUsername 集群控制台登录用户名
     */
    public String getWebConsoleUsername() {
        return this.WebConsoleUsername;
    }

    /**
     * Set 集群控制台登录用户名
     * @param WebConsoleUsername 集群控制台登录用户名
     */
    public void setWebConsoleUsername(String WebConsoleUsername) {
        this.WebConsoleUsername = WebConsoleUsername;
    }

    /**
     * Get 集群控制台登录密码 
     * @return WebConsolePassword 集群控制台登录密码
     */
    public String getWebConsolePassword() {
        return this.WebConsolePassword;
    }

    /**
     * Set 集群控制台登录密码
     * @param WebConsolePassword 集群控制台登录密码
     */
    public void setWebConsolePassword(String WebConsolePassword) {
        this.WebConsolePassword = WebConsolePassword;
    }

    /**
     * Get 已废弃 
     * @return PublicAccessEndpointStatus 已废弃
     */
    public Boolean getPublicAccessEndpointStatus() {
        return this.PublicAccessEndpointStatus;
    }

    /**
     * Set 已废弃
     * @param PublicAccessEndpointStatus 已废弃
     */
    public void setPublicAccessEndpointStatus(Boolean PublicAccessEndpointStatus) {
        this.PublicAccessEndpointStatus = PublicAccessEndpointStatus;
    }

    /**
     * Get 已废弃 
     * @return PublicControlConsoleSwitchStatus 已废弃
     */
    public Boolean getPublicControlConsoleSwitchStatus() {
        return this.PublicControlConsoleSwitchStatus;
    }

    /**
     * Set 已废弃
     * @param PublicControlConsoleSwitchStatus 已废弃
     */
    public void setPublicControlConsoleSwitchStatus(Boolean PublicControlConsoleSwitchStatus) {
        this.PublicControlConsoleSwitchStatus = PublicControlConsoleSwitchStatus;
    }

    /**
     * Get 已废弃 
     * @return VpcControlConsoleSwitchStatus 已废弃
     */
    public Boolean getVpcControlConsoleSwitchStatus() {
        return this.VpcControlConsoleSwitchStatus;
    }

    /**
     * Set 已废弃
     * @param VpcControlConsoleSwitchStatus 已废弃
     */
    public void setVpcControlConsoleSwitchStatus(Boolean VpcControlConsoleSwitchStatus) {
        this.VpcControlConsoleSwitchStatus = VpcControlConsoleSwitchStatus;
    }

    /**
     * Get Vpc管控台访问地址，示例值，http://1.1.1.1:15672 
     * @return VpcWebConsoleEndpoint Vpc管控台访问地址，示例值，http://1.1.1.1:15672
     */
    public String getVpcWebConsoleEndpoint() {
        return this.VpcWebConsoleEndpoint;
    }

    /**
     * Set Vpc管控台访问地址，示例值，http://1.1.1.1:15672
     * @param VpcWebConsoleEndpoint Vpc管控台访问地址，示例值，http://1.1.1.1:15672
     */
    public void setVpcWebConsoleEndpoint(String VpcWebConsoleEndpoint) {
        this.VpcWebConsoleEndpoint = VpcWebConsoleEndpoint;
    }

    /**
     * Get 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicWebConsoleSwitchStatus 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicWebConsoleSwitchStatus() {
        return this.PublicWebConsoleSwitchStatus;
    }

    /**
     * Set 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicWebConsoleSwitchStatus 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicWebConsoleSwitchStatus(String PublicWebConsoleSwitchStatus) {
        this.PublicWebConsoleSwitchStatus = PublicWebConsoleSwitchStatus;
    }

    /**
     * Get Vpc管控台开关状态，示例值，
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcWebConsoleSwitchStatus Vpc管控台开关状态，示例值，
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcWebConsoleSwitchStatus() {
        return this.VpcWebConsoleSwitchStatus;
    }

    /**
     * Set Vpc管控台开关状态，示例值，
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcWebConsoleSwitchStatus Vpc管控台开关状态，示例值，
OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcWebConsoleSwitchStatus(String VpcWebConsoleSwitchStatus) {
        this.VpcWebConsoleSwitchStatus = VpcWebConsoleSwitchStatus;
    }

    /**
     * Get 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PublicDataStreamStatus 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPublicDataStreamStatus() {
        return this.PublicDataStreamStatus;
    }

    /**
     * Set 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     * @param PublicDataStreamStatus 公网管控台开关状态，示例值，OFF/ON/CREATING/DELETING
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPublicDataStreamStatus(String PublicDataStreamStatus) {
        this.PublicDataStreamStatus = PublicDataStreamStatus;
    }

    /**
     * Get Prometheus信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrometheusEndpointInfo Prometheus信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public PrometheusEndpointInfo getPrometheusEndpointInfo() {
        return this.PrometheusEndpointInfo;
    }

    /**
     * Set Prometheus信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrometheusEndpointInfo Prometheus信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrometheusEndpointInfo(PrometheusEndpointInfo PrometheusEndpointInfo) {
        this.PrometheusEndpointInfo = PrometheusEndpointInfo;
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

    }
}

