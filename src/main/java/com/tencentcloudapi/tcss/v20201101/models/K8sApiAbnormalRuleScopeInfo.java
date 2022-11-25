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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class K8sApiAbnormalRuleScopeInfo extends AbstractModel{

    /**
    * 范围
系统事件:
ANONYMOUS_ACCESS: 匿名访问
ABNORMAL_UA_REQ: 异常UA请求
ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动
GET_CREDENTIALS: 凭据信息获取
MOUNT_SENSITIVE_PATH: 敏感路径挂载
COMMAND_RUN: 命令执行
PRIVILEGE_CONTAINER: 特权容器
EXCEPTION_CRONTAB_TASK: 异常定时任务
STATICS_POD: 静态pod创建
ABNORMAL_CREATE_POD: 异常pod创建
USER_DEFINED: 用户自定义
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RiskLevel")
    @Expose
    private String RiskLevel;

    /**
    * 开关状态(true:开 false:关) 适用于系统规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * 是否被删除 适用于自定义规则入参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsDelete")
    @Expose
    private Boolean IsDelete;

    /**
     * Get 范围
系统事件:
ANONYMOUS_ACCESS: 匿名访问
ABNORMAL_UA_REQ: 异常UA请求
ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动
GET_CREDENTIALS: 凭据信息获取
MOUNT_SENSITIVE_PATH: 敏感路径挂载
COMMAND_RUN: 命令执行
PRIVILEGE_CONTAINER: 特权容器
EXCEPTION_CRONTAB_TASK: 异常定时任务
STATICS_POD: 静态pod创建
ABNORMAL_CREATE_POD: 异常pod创建
USER_DEFINED: 用户自定义 
     * @return Scope 范围
系统事件:
ANONYMOUS_ACCESS: 匿名访问
ABNORMAL_UA_REQ: 异常UA请求
ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动
GET_CREDENTIALS: 凭据信息获取
MOUNT_SENSITIVE_PATH: 敏感路径挂载
COMMAND_RUN: 命令执行
PRIVILEGE_CONTAINER: 特权容器
EXCEPTION_CRONTAB_TASK: 异常定时任务
STATICS_POD: 静态pod创建
ABNORMAL_CREATE_POD: 异常pod创建
USER_DEFINED: 用户自定义
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 范围
系统事件:
ANONYMOUS_ACCESS: 匿名访问
ABNORMAL_UA_REQ: 异常UA请求
ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动
GET_CREDENTIALS: 凭据信息获取
MOUNT_SENSITIVE_PATH: 敏感路径挂载
COMMAND_RUN: 命令执行
PRIVILEGE_CONTAINER: 特权容器
EXCEPTION_CRONTAB_TASK: 异常定时任务
STATICS_POD: 静态pod创建
ABNORMAL_CREATE_POD: 异常pod创建
USER_DEFINED: 用户自定义
     * @param Scope 范围
系统事件:
ANONYMOUS_ACCESS: 匿名访问
ABNORMAL_UA_REQ: 异常UA请求
ANONYMOUS_ABNORMAL_PERMISSION: 匿名用户权限异动
GET_CREDENTIALS: 凭据信息获取
MOUNT_SENSITIVE_PATH: 敏感路径挂载
COMMAND_RUN: 命令执行
PRIVILEGE_CONTAINER: 特权容器
EXCEPTION_CRONTAB_TASK: 异常定时任务
STATICS_POD: 静态pod创建
ABNORMAL_CREATE_POD: 异常pod创建
USER_DEFINED: 用户自定义
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行) 
     * @return Action 动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)
     * @param Action 动作(RULE_MODE_ALERT: 告警 RULE_MODE_RELEASE:放行)
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RiskLevel 威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * Set 威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示
注意：此字段可能返回 null，表示取不到有效值。
     * @param RiskLevel 威胁等级 HIGH:高级 MIDDLE: 中级 LOW:低级 NOTICE:提示
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRiskLevel(String RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * Get 开关状态(true:开 false:关) 适用于系统规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 开关状态(true:开 false:关) 适用于系统规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set 开关状态(true:开 false:关) 适用于系统规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 开关状态(true:开 false:关) 适用于系统规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get 是否被删除 适用于自定义规则入参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsDelete 是否被删除 适用于自定义规则入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsDelete() {
        return this.IsDelete;
    }

    /**
     * Set 是否被删除 适用于自定义规则入参
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsDelete 是否被删除 适用于自定义规则入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsDelete(Boolean IsDelete) {
        this.IsDelete = IsDelete;
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

    }
}

