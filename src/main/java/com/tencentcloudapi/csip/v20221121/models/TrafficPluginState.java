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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TrafficPluginState extends AbstractModel {

    /**
    * 插件安装状态（上层聚合）
枚举值：
NONE：未安装
INSTALLING：安装中
INSTALLED：已安装
INSTALL_FAIL：安装失败
    */
    @SerializedName("InstallStatus")
    @Expose
    private String InstallStatus;

    /**
    * 插件安装细分状态。取值与 InstallStatus 对应：未安装（InstallStatus=UNINSTALL）时为空字符串；安装成功（InstallStatus=INSTALLED）时为 SUCCESS；安装失败（InstallStatus=INSTALL_FAIL）时为具体失败原因
枚举值：
NOT_SUPPORT：环境不支持
CONTAINER_NOT_FOUND：容器不存在
REQUIRE_RESTART：需要重启
CA_FAILED：CA 失败
EBPF_FAILED：eBPF 失败
IPTABLE_FAILED：iptables 失败
REDIRECT_FAILED：流量重定向失败
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 状态文案（由 Status 根据请求语言派生的国际化描述）
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 插件最近活跃时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
    */
    @SerializedName("ActivityTime")
    @Expose
    private String ActivityTime;

    /**
     * Get 插件安装状态（上层聚合）
枚举值：
NONE：未安装
INSTALLING：安装中
INSTALLED：已安装
INSTALL_FAIL：安装失败 
     * @return InstallStatus 插件安装状态（上层聚合）
枚举值：
NONE：未安装
INSTALLING：安装中
INSTALLED：已安装
INSTALL_FAIL：安装失败
     */
    public String getInstallStatus() {
        return this.InstallStatus;
    }

    /**
     * Set 插件安装状态（上层聚合）
枚举值：
NONE：未安装
INSTALLING：安装中
INSTALLED：已安装
INSTALL_FAIL：安装失败
     * @param InstallStatus 插件安装状态（上层聚合）
枚举值：
NONE：未安装
INSTALLING：安装中
INSTALLED：已安装
INSTALL_FAIL：安装失败
     */
    public void setInstallStatus(String InstallStatus) {
        this.InstallStatus = InstallStatus;
    }

    /**
     * Get 插件安装细分状态。取值与 InstallStatus 对应：未安装（InstallStatus=UNINSTALL）时为空字符串；安装成功（InstallStatus=INSTALLED）时为 SUCCESS；安装失败（InstallStatus=INSTALL_FAIL）时为具体失败原因
枚举值：
NOT_SUPPORT：环境不支持
CONTAINER_NOT_FOUND：容器不存在
REQUIRE_RESTART：需要重启
CA_FAILED：CA 失败
EBPF_FAILED：eBPF 失败
IPTABLE_FAILED：iptables 失败
REDIRECT_FAILED：流量重定向失败 
     * @return Status 插件安装细分状态。取值与 InstallStatus 对应：未安装（InstallStatus=UNINSTALL）时为空字符串；安装成功（InstallStatus=INSTALLED）时为 SUCCESS；安装失败（InstallStatus=INSTALL_FAIL）时为具体失败原因
枚举值：
NOT_SUPPORT：环境不支持
CONTAINER_NOT_FOUND：容器不存在
REQUIRE_RESTART：需要重启
CA_FAILED：CA 失败
EBPF_FAILED：eBPF 失败
IPTABLE_FAILED：iptables 失败
REDIRECT_FAILED：流量重定向失败
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 插件安装细分状态。取值与 InstallStatus 对应：未安装（InstallStatus=UNINSTALL）时为空字符串；安装成功（InstallStatus=INSTALLED）时为 SUCCESS；安装失败（InstallStatus=INSTALL_FAIL）时为具体失败原因
枚举值：
NOT_SUPPORT：环境不支持
CONTAINER_NOT_FOUND：容器不存在
REQUIRE_RESTART：需要重启
CA_FAILED：CA 失败
EBPF_FAILED：eBPF 失败
IPTABLE_FAILED：iptables 失败
REDIRECT_FAILED：流量重定向失败
     * @param Status 插件安装细分状态。取值与 InstallStatus 对应：未安装（InstallStatus=UNINSTALL）时为空字符串；安装成功（InstallStatus=INSTALLED）时为 SUCCESS；安装失败（InstallStatus=INSTALL_FAIL）时为具体失败原因
枚举值：
NOT_SUPPORT：环境不支持
CONTAINER_NOT_FOUND：容器不存在
REQUIRE_RESTART：需要重启
CA_FAILED：CA 失败
EBPF_FAILED：eBPF 失败
IPTABLE_FAILED：iptables 失败
REDIRECT_FAILED：流量重定向失败
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 状态文案（由 Status 根据请求语言派生的国际化描述） 
     * @return Message 状态文案（由 Status 根据请求语言派生的国际化描述）
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 状态文案（由 Status 根据请求语言派生的国际化描述）
     * @param Message 状态文案（由 Status 根据请求语言派生的国际化描述）
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get 插件最近活跃时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式） 
     * @return ActivityTime 插件最近活跃时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public String getActivityTime() {
        return this.ActivityTime;
    }

    /**
     * Set 插件最近活跃时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     * @param ActivityTime 插件最近活跃时间
参数格式：YYYY-MM-DDTHH:mm:ssZ（ISO8601格式）
     */
    public void setActivityTime(String ActivityTime) {
        this.ActivityTime = ActivityTime;
    }

    public TrafficPluginState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TrafficPluginState(TrafficPluginState source) {
        if (source.InstallStatus != null) {
            this.InstallStatus = new String(source.InstallStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.ActivityTime != null) {
            this.ActivityTime = new String(source.ActivityTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstallStatus", this.InstallStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ActivityTime", this.ActivityTime);

    }
}

