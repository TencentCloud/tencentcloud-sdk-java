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

public class WebhookNotifyItem extends AbstractModel {

    /**
    * <p>模块编码（与 ModifyNotifySettingAlert 共用枚举）<br>枚举值：<br>Vul：漏洞与云安全态势<br>Alert：告警中心<br>AkSk：云API风险治理<br>Agent：客户端/主机资产<br>LogAnalysis：日志分析</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>子模块编码<br>枚举值（部分）：<br>MALWARE_FILE：恶意文件<br>MALWARE_PROCESS：恶意进程<br>RISK_LOGIN：异常登录<br>BRUTE_FORCE：密码破解<br>MALICIOUS_REQUEST：恶意请求<br>HIGH_RISK_COMMAND：高危命令<br>PRIVILEGE_ESCALATION：本地提权<br>REVERSE_SHELL：反弹Shell<br>NETWORK_ATTACK：网络攻击<br>MULTI_BEHAVIOR_ATTACK：多行为攻击<br>AGENT_OFFLINE：客户端离线<br>AGENT_UNINSTALL：客户端卸载<br>完整枚举见 DescribeWebhookNotifyItemTree</p>
    */
    @SerializedName("SubModule")
    @Expose
    private String SubModule;

    /**
    * <p>风险等级集合<br>枚举值：<br>CRITICAL：严重<br>HIGH：高危<br>MEDIUM：中危<br>LOW：低危<br>INFO：提示<br>不支持等级的子模块传空数组</p>
    */
    @SerializedName("Levels")
    @Expose
    private String [] Levels;

    /**
    * <p>处理状态等</p>
    */
    @SerializedName("Items")
    @Expose
    private String [] Items;

    /**
     * Get <p>模块编码（与 ModifyNotifySettingAlert 共用枚举）<br>枚举值：<br>Vul：漏洞与云安全态势<br>Alert：告警中心<br>AkSk：云API风险治理<br>Agent：客户端/主机资产<br>LogAnalysis：日志分析</p> 
     * @return Module <p>模块编码（与 ModifyNotifySettingAlert 共用枚举）<br>枚举值：<br>Vul：漏洞与云安全态势<br>Alert：告警中心<br>AkSk：云API风险治理<br>Agent：客户端/主机资产<br>LogAnalysis：日志分析</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>模块编码（与 ModifyNotifySettingAlert 共用枚举）<br>枚举值：<br>Vul：漏洞与云安全态势<br>Alert：告警中心<br>AkSk：云API风险治理<br>Agent：客户端/主机资产<br>LogAnalysis：日志分析</p>
     * @param Module <p>模块编码（与 ModifyNotifySettingAlert 共用枚举）<br>枚举值：<br>Vul：漏洞与云安全态势<br>Alert：告警中心<br>AkSk：云API风险治理<br>Agent：客户端/主机资产<br>LogAnalysis：日志分析</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>子模块编码<br>枚举值（部分）：<br>MALWARE_FILE：恶意文件<br>MALWARE_PROCESS：恶意进程<br>RISK_LOGIN：异常登录<br>BRUTE_FORCE：密码破解<br>MALICIOUS_REQUEST：恶意请求<br>HIGH_RISK_COMMAND：高危命令<br>PRIVILEGE_ESCALATION：本地提权<br>REVERSE_SHELL：反弹Shell<br>NETWORK_ATTACK：网络攻击<br>MULTI_BEHAVIOR_ATTACK：多行为攻击<br>AGENT_OFFLINE：客户端离线<br>AGENT_UNINSTALL：客户端卸载<br>完整枚举见 DescribeWebhookNotifyItemTree</p> 
     * @return SubModule <p>子模块编码<br>枚举值（部分）：<br>MALWARE_FILE：恶意文件<br>MALWARE_PROCESS：恶意进程<br>RISK_LOGIN：异常登录<br>BRUTE_FORCE：密码破解<br>MALICIOUS_REQUEST：恶意请求<br>HIGH_RISK_COMMAND：高危命令<br>PRIVILEGE_ESCALATION：本地提权<br>REVERSE_SHELL：反弹Shell<br>NETWORK_ATTACK：网络攻击<br>MULTI_BEHAVIOR_ATTACK：多行为攻击<br>AGENT_OFFLINE：客户端离线<br>AGENT_UNINSTALL：客户端卸载<br>完整枚举见 DescribeWebhookNotifyItemTree</p>
     */
    public String getSubModule() {
        return this.SubModule;
    }

    /**
     * Set <p>子模块编码<br>枚举值（部分）：<br>MALWARE_FILE：恶意文件<br>MALWARE_PROCESS：恶意进程<br>RISK_LOGIN：异常登录<br>BRUTE_FORCE：密码破解<br>MALICIOUS_REQUEST：恶意请求<br>HIGH_RISK_COMMAND：高危命令<br>PRIVILEGE_ESCALATION：本地提权<br>REVERSE_SHELL：反弹Shell<br>NETWORK_ATTACK：网络攻击<br>MULTI_BEHAVIOR_ATTACK：多行为攻击<br>AGENT_OFFLINE：客户端离线<br>AGENT_UNINSTALL：客户端卸载<br>完整枚举见 DescribeWebhookNotifyItemTree</p>
     * @param SubModule <p>子模块编码<br>枚举值（部分）：<br>MALWARE_FILE：恶意文件<br>MALWARE_PROCESS：恶意进程<br>RISK_LOGIN：异常登录<br>BRUTE_FORCE：密码破解<br>MALICIOUS_REQUEST：恶意请求<br>HIGH_RISK_COMMAND：高危命令<br>PRIVILEGE_ESCALATION：本地提权<br>REVERSE_SHELL：反弹Shell<br>NETWORK_ATTACK：网络攻击<br>MULTI_BEHAVIOR_ATTACK：多行为攻击<br>AGENT_OFFLINE：客户端离线<br>AGENT_UNINSTALL：客户端卸载<br>完整枚举见 DescribeWebhookNotifyItemTree</p>
     */
    public void setSubModule(String SubModule) {
        this.SubModule = SubModule;
    }

    /**
     * Get <p>风险等级集合<br>枚举值：<br>CRITICAL：严重<br>HIGH：高危<br>MEDIUM：中危<br>LOW：低危<br>INFO：提示<br>不支持等级的子模块传空数组</p> 
     * @return Levels <p>风险等级集合<br>枚举值：<br>CRITICAL：严重<br>HIGH：高危<br>MEDIUM：中危<br>LOW：低危<br>INFO：提示<br>不支持等级的子模块传空数组</p>
     */
    public String [] getLevels() {
        return this.Levels;
    }

    /**
     * Set <p>风险等级集合<br>枚举值：<br>CRITICAL：严重<br>HIGH：高危<br>MEDIUM：中危<br>LOW：低危<br>INFO：提示<br>不支持等级的子模块传空数组</p>
     * @param Levels <p>风险等级集合<br>枚举值：<br>CRITICAL：严重<br>HIGH：高危<br>MEDIUM：中危<br>LOW：低危<br>INFO：提示<br>不支持等级的子模块传空数组</p>
     */
    public void setLevels(String [] Levels) {
        this.Levels = Levels;
    }

    /**
     * Get <p>处理状态等</p> 
     * @return Items <p>处理状态等</p>
     */
    public String [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>处理状态等</p>
     * @param Items <p>处理状态等</p>
     */
    public void setItems(String [] Items) {
        this.Items = Items;
    }

    public WebhookNotifyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WebhookNotifyItem(WebhookNotifyItem source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.SubModule != null) {
            this.SubModule = new String(source.SubModule);
        }
        if (source.Levels != null) {
            this.Levels = new String[source.Levels.length];
            for (int i = 0; i < source.Levels.length; i++) {
                this.Levels[i] = new String(source.Levels[i]);
            }
        }
        if (source.Items != null) {
            this.Items = new String[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new String(source.Items[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "SubModule", this.SubModule);
        this.setParamArraySimple(map, prefix + "Levels.", this.Levels);
        this.setParamArraySimple(map, prefix + "Items.", this.Items);

    }
}

