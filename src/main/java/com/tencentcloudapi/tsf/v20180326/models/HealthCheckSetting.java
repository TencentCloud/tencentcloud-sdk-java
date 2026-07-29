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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckSetting extends AbstractModel {

    /**
    * <p>健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>容器延时启动健康检查的时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * <p>每次健康检查响应的最大超时时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * <p>进行健康检查的时间间隔，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
    * <p>表示后端容器从失败到成功的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessThreshold")
    @Expose
    private Long SuccessThreshold;

    /**
    * <p>表示后端容器从成功到失败的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureThreshold")
    @Expose
    private Long FailureThreshold;

    /**
    * <p>HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * <p>健康检查端口，范围 1~65535 。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * <p>HTTP 健康检查接口的请求路径。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * <p>执行命令检查方式，执行的命令。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Command")
    @Expose
    private String [] Command;

    /**
    * <p>TSF_DEFAULT：tsf 默认就绪探针。K8S_NATIVE：k8s 原生探针。不填默认为 k8s 原生探针。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get <p>健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType <p>健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType <p>健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>容器延时启动健康检查的时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitialDelaySeconds <p>容器延时启动健康检查的时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set <p>容器延时启动健康检查的时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitialDelaySeconds <p>容器延时启动健康检查的时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get <p>每次健康检查响应的最大超时时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutSeconds <p>每次健康检查响应的最大超时时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set <p>每次健康检查响应的最大超时时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutSeconds <p>每次健康检查响应的最大超时时间，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get <p>进行健康检查的时间间隔，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodSeconds <p>进行健康检查的时间间隔，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set <p>进行健康检查的时间间隔，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodSeconds <p>进行健康检查的时间间隔，单位秒。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    /**
     * Get <p>表示后端容器从失败到成功的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessThreshold <p>表示后端容器从失败到成功的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessThreshold() {
        return this.SuccessThreshold;
    }

    /**
     * Set <p>表示后端容器从失败到成功的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessThreshold <p>表示后端容器从失败到成功的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessThreshold(Long SuccessThreshold) {
        this.SuccessThreshold = SuccessThreshold;
    }

    /**
     * Get <p>表示后端容器从成功到失败的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureThreshold <p>表示后端容器从成功到失败的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailureThreshold() {
        return this.FailureThreshold;
    }

    /**
     * Set <p>表示后端容器从成功到失败的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureThreshold <p>表示后端容器从成功到失败的连续健康检查成功次数。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureThreshold(Long FailureThreshold) {
        this.FailureThreshold = FailureThreshold;
    }

    /**
     * Get <p>HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheme <p>HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set <p>HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheme <p>HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get <p>健康检查端口，范围 1~65535 。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port <p>健康检查端口，范围 1~65535 。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set <p>健康检查端口，范围 1~65535 。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port <p>健康检查端口，范围 1~65535 。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get <p>HTTP 健康检查接口的请求路径。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path <p>HTTP 健康检查接口的请求路径。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set <p>HTTP 健康检查接口的请求路径。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path <p>HTTP 健康检查接口的请求路径。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get <p>执行命令检查方式，执行的命令。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Command <p>执行命令检查方式，执行的命令。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCommand() {
        return this.Command;
    }

    /**
     * Set <p>执行命令检查方式，执行的命令。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Command <p>执行命令检查方式，执行的命令。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommand(String [] Command) {
        this.Command = Command;
    }

    /**
     * Get <p>TSF_DEFAULT：tsf 默认就绪探针。K8S_NATIVE：k8s 原生探针。不填默认为 k8s 原生探针。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type <p>TSF_DEFAULT：tsf 默认就绪探针。K8S_NATIVE：k8s 原生探针。不填默认为 k8s 原生探针。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>TSF_DEFAULT：tsf 默认就绪探针。K8S_NATIVE：k8s 原生探针。不填默认为 k8s 原生探针。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type <p>TSF_DEFAULT：tsf 默认就绪探针。K8S_NATIVE：k8s 原生探针。不填默认为 k8s 原生探针。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public HealthCheckSetting() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HealthCheckSetting(HealthCheckSetting source) {
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.InitialDelaySeconds != null) {
            this.InitialDelaySeconds = new Long(source.InitialDelaySeconds);
        }
        if (source.TimeoutSeconds != null) {
            this.TimeoutSeconds = new Long(source.TimeoutSeconds);
        }
        if (source.PeriodSeconds != null) {
            this.PeriodSeconds = new Long(source.PeriodSeconds);
        }
        if (source.SuccessThreshold != null) {
            this.SuccessThreshold = new Long(source.SuccessThreshold);
        }
        if (source.FailureThreshold != null) {
            this.FailureThreshold = new Long(source.FailureThreshold);
        }
        if (source.Scheme != null) {
            this.Scheme = new String(source.Scheme);
        }
        if (source.Port != null) {
            this.Port = new Long(source.Port);
        }
        if (source.Path != null) {
            this.Path = new String(source.Path);
        }
        if (source.Command != null) {
            this.Command = new String[source.Command.length];
            for (int i = 0; i < source.Command.length; i++) {
                this.Command[i] = new String(source.Command[i]);
            }
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "InitialDelaySeconds", this.InitialDelaySeconds);
        this.setParamSimple(map, prefix + "TimeoutSeconds", this.TimeoutSeconds);
        this.setParamSimple(map, prefix + "PeriodSeconds", this.PeriodSeconds);
        this.setParamSimple(map, prefix + "SuccessThreshold", this.SuccessThreshold);
        this.setParamSimple(map, prefix + "FailureThreshold", this.FailureThreshold);
        this.setParamSimple(map, prefix + "Scheme", this.Scheme);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamArraySimple(map, prefix + "Command.", this.Command);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

