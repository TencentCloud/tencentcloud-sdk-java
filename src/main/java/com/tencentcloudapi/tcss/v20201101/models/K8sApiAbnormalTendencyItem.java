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

public class K8sApiAbnormalTendencyItem extends AbstractModel{

    /**
    * 日期
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 异常UA请求事件数
    */
    @SerializedName("ExceptionUARequestCount")
    @Expose
    private Long ExceptionUARequestCount;

    /**
    * 匿名用户权限事件数
    */
    @SerializedName("AnonymousUserRightCount")
    @Expose
    private Long AnonymousUserRightCount;

    /**
    * 凭据信息获取事件数
    */
    @SerializedName("CredentialInformationObtainCount")
    @Expose
    private Long CredentialInformationObtainCount;

    /**
    * 敏感数据挂载事件数
    */
    @SerializedName("SensitiveDataMountCount")
    @Expose
    private Long SensitiveDataMountCount;

    /**
    * 命令执行事件数
    */
    @SerializedName("CmdExecCount")
    @Expose
    private Long CmdExecCount;

    /**
    * 异常定时任务事件数
    */
    @SerializedName("AbnormalScheduledTaskCount")
    @Expose
    private Long AbnormalScheduledTaskCount;

    /**
    * 静态Pod创建数
    */
    @SerializedName("StaticsPodCreateCount")
    @Expose
    private Long StaticsPodCreateCount;

    /**
    * 可疑容器创建数
    */
    @SerializedName("DoubtfulContainerCreateCount")
    @Expose
    private Long DoubtfulContainerCreateCount;

    /**
    * 自定义规则事件数
    */
    @SerializedName("UserDefinedRuleCount")
    @Expose
    private Long UserDefinedRuleCount;

    /**
    * 匿名访问事件数
    */
    @SerializedName("AnonymousAccessCount")
    @Expose
    private Long AnonymousAccessCount;

    /**
    * 特权容器事件数
    */
    @SerializedName("PrivilegeContainerCount")
    @Expose
    private Long PrivilegeContainerCount;

    /**
     * Get 日期 
     * @return Date 日期
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 日期
     * @param Date 日期
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 异常UA请求事件数 
     * @return ExceptionUARequestCount 异常UA请求事件数
     */
    public Long getExceptionUARequestCount() {
        return this.ExceptionUARequestCount;
    }

    /**
     * Set 异常UA请求事件数
     * @param ExceptionUARequestCount 异常UA请求事件数
     */
    public void setExceptionUARequestCount(Long ExceptionUARequestCount) {
        this.ExceptionUARequestCount = ExceptionUARequestCount;
    }

    /**
     * Get 匿名用户权限事件数 
     * @return AnonymousUserRightCount 匿名用户权限事件数
     */
    public Long getAnonymousUserRightCount() {
        return this.AnonymousUserRightCount;
    }

    /**
     * Set 匿名用户权限事件数
     * @param AnonymousUserRightCount 匿名用户权限事件数
     */
    public void setAnonymousUserRightCount(Long AnonymousUserRightCount) {
        this.AnonymousUserRightCount = AnonymousUserRightCount;
    }

    /**
     * Get 凭据信息获取事件数 
     * @return CredentialInformationObtainCount 凭据信息获取事件数
     */
    public Long getCredentialInformationObtainCount() {
        return this.CredentialInformationObtainCount;
    }

    /**
     * Set 凭据信息获取事件数
     * @param CredentialInformationObtainCount 凭据信息获取事件数
     */
    public void setCredentialInformationObtainCount(Long CredentialInformationObtainCount) {
        this.CredentialInformationObtainCount = CredentialInformationObtainCount;
    }

    /**
     * Get 敏感数据挂载事件数 
     * @return SensitiveDataMountCount 敏感数据挂载事件数
     */
    public Long getSensitiveDataMountCount() {
        return this.SensitiveDataMountCount;
    }

    /**
     * Set 敏感数据挂载事件数
     * @param SensitiveDataMountCount 敏感数据挂载事件数
     */
    public void setSensitiveDataMountCount(Long SensitiveDataMountCount) {
        this.SensitiveDataMountCount = SensitiveDataMountCount;
    }

    /**
     * Get 命令执行事件数 
     * @return CmdExecCount 命令执行事件数
     */
    public Long getCmdExecCount() {
        return this.CmdExecCount;
    }

    /**
     * Set 命令执行事件数
     * @param CmdExecCount 命令执行事件数
     */
    public void setCmdExecCount(Long CmdExecCount) {
        this.CmdExecCount = CmdExecCount;
    }

    /**
     * Get 异常定时任务事件数 
     * @return AbnormalScheduledTaskCount 异常定时任务事件数
     */
    public Long getAbnormalScheduledTaskCount() {
        return this.AbnormalScheduledTaskCount;
    }

    /**
     * Set 异常定时任务事件数
     * @param AbnormalScheduledTaskCount 异常定时任务事件数
     */
    public void setAbnormalScheduledTaskCount(Long AbnormalScheduledTaskCount) {
        this.AbnormalScheduledTaskCount = AbnormalScheduledTaskCount;
    }

    /**
     * Get 静态Pod创建数 
     * @return StaticsPodCreateCount 静态Pod创建数
     */
    public Long getStaticsPodCreateCount() {
        return this.StaticsPodCreateCount;
    }

    /**
     * Set 静态Pod创建数
     * @param StaticsPodCreateCount 静态Pod创建数
     */
    public void setStaticsPodCreateCount(Long StaticsPodCreateCount) {
        this.StaticsPodCreateCount = StaticsPodCreateCount;
    }

    /**
     * Get 可疑容器创建数 
     * @return DoubtfulContainerCreateCount 可疑容器创建数
     */
    public Long getDoubtfulContainerCreateCount() {
        return this.DoubtfulContainerCreateCount;
    }

    /**
     * Set 可疑容器创建数
     * @param DoubtfulContainerCreateCount 可疑容器创建数
     */
    public void setDoubtfulContainerCreateCount(Long DoubtfulContainerCreateCount) {
        this.DoubtfulContainerCreateCount = DoubtfulContainerCreateCount;
    }

    /**
     * Get 自定义规则事件数 
     * @return UserDefinedRuleCount 自定义规则事件数
     */
    public Long getUserDefinedRuleCount() {
        return this.UserDefinedRuleCount;
    }

    /**
     * Set 自定义规则事件数
     * @param UserDefinedRuleCount 自定义规则事件数
     */
    public void setUserDefinedRuleCount(Long UserDefinedRuleCount) {
        this.UserDefinedRuleCount = UserDefinedRuleCount;
    }

    /**
     * Get 匿名访问事件数 
     * @return AnonymousAccessCount 匿名访问事件数
     */
    public Long getAnonymousAccessCount() {
        return this.AnonymousAccessCount;
    }

    /**
     * Set 匿名访问事件数
     * @param AnonymousAccessCount 匿名访问事件数
     */
    public void setAnonymousAccessCount(Long AnonymousAccessCount) {
        this.AnonymousAccessCount = AnonymousAccessCount;
    }

    /**
     * Get 特权容器事件数 
     * @return PrivilegeContainerCount 特权容器事件数
     */
    public Long getPrivilegeContainerCount() {
        return this.PrivilegeContainerCount;
    }

    /**
     * Set 特权容器事件数
     * @param PrivilegeContainerCount 特权容器事件数
     */
    public void setPrivilegeContainerCount(Long PrivilegeContainerCount) {
        this.PrivilegeContainerCount = PrivilegeContainerCount;
    }

    public K8sApiAbnormalTendencyItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public K8sApiAbnormalTendencyItem(K8sApiAbnormalTendencyItem source) {
        if (source.Date != null) {
            this.Date = new String(source.Date);
        }
        if (source.ExceptionUARequestCount != null) {
            this.ExceptionUARequestCount = new Long(source.ExceptionUARequestCount);
        }
        if (source.AnonymousUserRightCount != null) {
            this.AnonymousUserRightCount = new Long(source.AnonymousUserRightCount);
        }
        if (source.CredentialInformationObtainCount != null) {
            this.CredentialInformationObtainCount = new Long(source.CredentialInformationObtainCount);
        }
        if (source.SensitiveDataMountCount != null) {
            this.SensitiveDataMountCount = new Long(source.SensitiveDataMountCount);
        }
        if (source.CmdExecCount != null) {
            this.CmdExecCount = new Long(source.CmdExecCount);
        }
        if (source.AbnormalScheduledTaskCount != null) {
            this.AbnormalScheduledTaskCount = new Long(source.AbnormalScheduledTaskCount);
        }
        if (source.StaticsPodCreateCount != null) {
            this.StaticsPodCreateCount = new Long(source.StaticsPodCreateCount);
        }
        if (source.DoubtfulContainerCreateCount != null) {
            this.DoubtfulContainerCreateCount = new Long(source.DoubtfulContainerCreateCount);
        }
        if (source.UserDefinedRuleCount != null) {
            this.UserDefinedRuleCount = new Long(source.UserDefinedRuleCount);
        }
        if (source.AnonymousAccessCount != null) {
            this.AnonymousAccessCount = new Long(source.AnonymousAccessCount);
        }
        if (source.PrivilegeContainerCount != null) {
            this.PrivilegeContainerCount = new Long(source.PrivilegeContainerCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "ExceptionUARequestCount", this.ExceptionUARequestCount);
        this.setParamSimple(map, prefix + "AnonymousUserRightCount", this.AnonymousUserRightCount);
        this.setParamSimple(map, prefix + "CredentialInformationObtainCount", this.CredentialInformationObtainCount);
        this.setParamSimple(map, prefix + "SensitiveDataMountCount", this.SensitiveDataMountCount);
        this.setParamSimple(map, prefix + "CmdExecCount", this.CmdExecCount);
        this.setParamSimple(map, prefix + "AbnormalScheduledTaskCount", this.AbnormalScheduledTaskCount);
        this.setParamSimple(map, prefix + "StaticsPodCreateCount", this.StaticsPodCreateCount);
        this.setParamSimple(map, prefix + "DoubtfulContainerCreateCount", this.DoubtfulContainerCreateCount);
        this.setParamSimple(map, prefix + "UserDefinedRuleCount", this.UserDefinedRuleCount);
        this.setParamSimple(map, prefix + "AnonymousAccessCount", this.AnonymousAccessCount);
        this.setParamSimple(map, prefix + "PrivilegeContainerCount", this.PrivilegeContainerCount);

    }
}

