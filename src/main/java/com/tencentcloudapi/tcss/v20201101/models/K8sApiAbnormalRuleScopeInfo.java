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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalRuleScopeInfo extends AbstractModel {

    /**
    * <p>范围<br>系统事件:<br>ANONYMOUS_ACCESS: 匿名访问<br>ABNORMAL_UA_REQ: 异常UA请求<br>ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动<br>GET_CREDENTIALS: 凭据信息获取<br>MOUNT_SENSITIVE_PATH: 敏感路径挂载<br>COMMAND_RUN: 命令执行<br>PRIVILEGE_CONTAINER: 特权容器<br>EXCEPTION_CRONTAB_TASK: 异常定时任务<br>STATICS_POD: 静态pod创建<br>ABNORMAL_CREATE_POD: 异常pod创建<br>USER_DEFINED: 用户自定义</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)</p>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示</p>
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * <p>开关状态(true:开 false:关) 适用于系统规则</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>是否被删除 适用于自定义规则入参</p>
    */
    @SerializedName("IsDelete")
    @Expose
    private Boolean IsDelete;

    /**
    * <p>规则类型对应中文</p>
    */
    @SerializedName("RuleTypeZH")
    @Expose
    private String RuleTypeZH;

    /**
     * Get <p>范围<br>系统事件:<br>ANONYMOUS_ACCESS: 匿名访问<br>ABNORMAL_UA_REQ: 异常UA请求<br>ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动<br>GET_CREDENTIALS: 凭据信息获取<br>MOUNT_SENSITIVE_PATH: 敏感路径挂载<br>COMMAND_RUN: 命令执行<br>PRIVILEGE_CONTAINER: 特权容器<br>EXCEPTION_CRONTAB_TASK: 异常定时任务<br>STATICS_POD: 静态pod创建<br>ABNORMAL_CREATE_POD: 异常pod创建<br>USER_DEFINED: 用户自定义</p> 
     * @return Scope <p>范围<br>系统事件:<br>ANONYMOUS_ACCESS: 匿名访问<br>ABNORMAL_UA_REQ: 异常UA请求<br>ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动<br>GET_CREDENTIALS: 凭据信息获取<br>MOUNT_SENSITIVE_PATH: 敏感路径挂载<br>COMMAND_RUN: 命令执行<br>PRIVILEGE_CONTAINER: 特权容器<br>EXCEPTION_CRONTAB_TASK: 异常定时任务<br>STATICS_POD: 静态pod创建<br>ABNORMAL_CREATE_POD: 异常pod创建<br>USER_DEFINED: 用户自定义</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>范围<br>系统事件:<br>ANONYMOUS_ACCESS: 匿名访问<br>ABNORMAL_UA_REQ: 异常UA请求<br>ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动<br>GET_CREDENTIALS: 凭据信息获取<br>MOUNT_SENSITIVE_PATH: 敏感路径挂载<br>COMMAND_RUN: 命令执行<br>PRIVILEGE_CONTAINER: 特权容器<br>EXCEPTION_CRONTAB_TASK: 异常定时任务<br>STATICS_POD: 静态pod创建<br>ABNORMAL_CREATE_POD: 异常pod创建<br>USER_DEFINED: 用户自定义</p>
     * @param Scope <p>范围<br>系统事件:<br>ANONYMOUS_ACCESS: 匿名访问<br>ABNORMAL_UA_REQ: 异常UA请求<br>ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动<br>GET_CREDENTIALS: 凭据信息获取<br>MOUNT_SENSITIVE_PATH: 敏感路径挂载<br>COMMAND_RUN: 命令执行<br>PRIVILEGE_CONTAINER: 特权容器<br>EXCEPTION_CRONTAB_TASK: 异常定时任务<br>STATICS_POD: 静态pod创建<br>ABNORMAL_CREATE_POD: 异常pod创建<br>USER_DEFINED: 用户自定义</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)</p> 
     * @return Action <p>动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)</p>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)</p>
     * @param Action <p>动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)</p>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示</p> 
     * @return RiskLevel <p>威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示</p>
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set <p>威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示</p>
     * @param RiskLevel <p>威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示</p>
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get <p>开关状态(true:开 false:关) 适用于系统规则</p> 
     * @return Status <p>开关状态(true:开 false:关) 适用于系统规则</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>开关状态(true:开 false:关) 适用于系统规则</p>
     * @param Status <p>开关状态(true:开 false:关) 适用于系统规则</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>是否被删除 适用于自定义规则入参</p> 
     * @return IsDelete <p>是否被删除 适用于自定义规则入参</p>
     */
    public Boolean getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set <p>是否被删除 适用于自定义规则入参</p>
     * @param IsDelete <p>是否被删除 适用于自定义规则入参</p>
     */
    public void setIsDelete(Boolean IsDelete) {
        this.IsDelete = IsDelete;
    }

    /**
     * Get <p>规则类型对应中文</p> 
     * @return RuleTypeZH <p>规则类型对应中文</p>
     */
    public String getRuleTypeZH() {
        return this.RuleTypeZH;
    }

    /**
     * Set <p>规则类型对应中文</p>
     * @param RuleTypeZH <p>规则类型对应中文</p>
     */
    public void setRuleTypeZH(String RuleTypeZH) {
        this.RuleTypeZH = RuleTypeZH;
    }

    public K8sApiAbnormalRuleScopeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalRuleScopeInfo(K8sApiAbnormalRuleScopeInfo source) {
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.RiskLevel != null) {
            this.RiskLevel = new String(source.RiskLevel);
        }
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.IsDelete != null) {
            this.IsDelete = new Boolean(source.IsDelete);
        }
        if (source.RuleTypeZH != null) {
            this.RuleTypeZH = new String(source.RuleTypeZH);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IsDelete", this.IsDelete);
        this.setParamSimple(map, prefix + "RuleTypeZH", this.RuleTypeZH);

    }
}

