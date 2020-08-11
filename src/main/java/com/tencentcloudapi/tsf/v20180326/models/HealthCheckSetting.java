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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HealthCheckSetting extends AbstractModel{

    /**
    * 健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 容器延时启动健康检查的时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InitialDelaySeconds")
    @Expose
    private Long InitialDelaySeconds;

    /**
    * 每次健康检查响应的最大超时时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeoutSeconds")
    @Expose
    private Long TimeoutSeconds;

    /**
    * 进行健康检查的时间间隔。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PeriodSeconds")
    @Expose
    private Long PeriodSeconds;

    /**
    * 表示后端容器从失败到成功的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessThreshold")
    @Expose
    private Long SuccessThreshold;

    /**
    * 表示后端容器从成功到失败的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailureThreshold")
    @Expose
    private Long FailureThreshold;

    /**
    * HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Scheme")
    @Expose
    private String Scheme;

    /**
    * 健康检查端口，范围 1~65535 。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private Long Port;

    /**
    * HTTP 健康检查接口的请求路径。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 执行命令检查方式，执行的命令。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Command")
    @Expose
    private String [] Command;

    /**
     * Get 健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType 健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set 健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 健康检查方法。HTTP：通过 HTTP 接口检查；CMD：通过执行命令检查；TCP：通过建立 TCP 连接检查。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get 容器延时启动健康检查的时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InitialDelaySeconds 容器延时启动健康检查的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInitialDelaySeconds() {
        return this.InitialDelaySeconds;
    }

    /**
     * Set 容器延时启动健康检查的时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InitialDelaySeconds 容器延时启动健康检查的时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInitialDelaySeconds(Long InitialDelaySeconds) {
        this.InitialDelaySeconds = InitialDelaySeconds;
    }

    /**
     * Get 每次健康检查响应的最大超时时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeoutSeconds 每次健康检查响应的最大超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTimeoutSeconds() {
        return this.TimeoutSeconds;
    }

    /**
     * Set 每次健康检查响应的最大超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeoutSeconds 每次健康检查响应的最大超时时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeoutSeconds(Long TimeoutSeconds) {
        this.TimeoutSeconds = TimeoutSeconds;
    }

    /**
     * Get 进行健康检查的时间间隔。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PeriodSeconds 进行健康检查的时间间隔。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPeriodSeconds() {
        return this.PeriodSeconds;
    }

    /**
     * Set 进行健康检查的时间间隔。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PeriodSeconds 进行健康检查的时间间隔。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPeriodSeconds(Long PeriodSeconds) {
        this.PeriodSeconds = PeriodSeconds;
    }

    /**
     * Get 表示后端容器从失败到成功的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessThreshold 表示后端容器从失败到成功的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessThreshold() {
        return this.SuccessThreshold;
    }

    /**
     * Set 表示后端容器从失败到成功的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessThreshold 表示后端容器从失败到成功的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessThreshold(Long SuccessThreshold) {
        this.SuccessThreshold = SuccessThreshold;
    }

    /**
     * Get 表示后端容器从成功到失败的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailureThreshold 表示后端容器从成功到失败的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFailureThreshold() {
        return this.FailureThreshold;
    }

    /**
     * Set 表示后端容器从成功到失败的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailureThreshold 表示后端容器从成功到失败的连续健康检查成功次数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailureThreshold(Long FailureThreshold) {
        this.FailureThreshold = FailureThreshold;
    }

    /**
     * Get HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Scheme HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScheme() {
        return this.Scheme;
    }

    /**
     * Set HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Scheme HTTP 健康检查方法使用的检查协议。支持HTTP、HTTPS。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScheme(String Scheme) {
        this.Scheme = Scheme;
    }

    /**
     * Get 健康检查端口，范围 1~65535 。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Port 健康检查端口，范围 1~65535 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPort() {
        return this.Port;
    }

    /**
     * Set 健康检查端口，范围 1~65535 。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 健康检查端口，范围 1~65535 。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(Long Port) {
        this.Port = Port;
    }

    /**
     * Get HTTP 健康检查接口的请求路径。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Path HTTP 健康检查接口的请求路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * Set HTTP 健康检查接口的请求路径。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Path HTTP 健康检查接口的请求路径。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * Get 执行命令检查方式，执行的命令。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Command 执行命令检查方式，执行的命令。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCommand() {
        return this.Command;
    }

    /**
     * Set 执行命令检查方式，执行的命令。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Command 执行命令检查方式，执行的命令。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCommand(String [] Command) {
        this.Command = Command;
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

    }
}

