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

public class K8sApiAbnormalTendencyItem extends AbstractModel {

    /**
    * <p>日期</p>
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * <p>异常UA请求事件数</p>
    */
    @SerializedName("ExceptionUARequestCount")
    @Expose
    private Long ExceptionUARequestCount;

    /**
    * <p>匿名用户权限事件数</p>
    */
    @SerializedName("AnonymousUserRightCount")
    @Expose
    private Long AnonymousUserRightCount;

    /**
    * <p>凭据信息获取事件数</p>
    */
    @SerializedName("CredentialInformationObtainCount")
    @Expose
    private Long CredentialInformationObtainCount;

    /**
    * <p>敏感数据挂载事件数</p>
    */
    @SerializedName("SensitiveDataMountCount")
    @Expose
    private Long SensitiveDataMountCount;

    /**
    * <p>命令执行事件数</p>
    */
    @SerializedName("CmdExecCount")
    @Expose
    private Long CmdExecCount;

    /**
    * <p>异常定时任务事件数</p>
    */
    @SerializedName("AbnormalScheduledTaskCount")
    @Expose
    private Long AbnormalScheduledTaskCount;

    /**
    * <p>静态Pod创建数</p>
    */
    @SerializedName("StaticsPodCreateCount")
    @Expose
    private Long StaticsPodCreateCount;

    /**
    * <p>可疑容器创建数</p>
    */
    @SerializedName("DoubtfulContainerCreateCount")
    @Expose
    private Long DoubtfulContainerCreateCount;

    /**
    * <p>自定义规则事件数</p>
    */
    @SerializedName("UserDefinedRuleCount")
    @Expose
    private Long UserDefinedRuleCount;

    /**
    * <p>匿名访问事件数</p>
    */
    @SerializedName("AnonymousAccessCount")
    @Expose
    private Long AnonymousAccessCount;

    /**
    * <p>特权容器事件数</p>
    */
    @SerializedName("PrivilegeContainerCount")
    @Expose
    private Long PrivilegeContainerCount;

    /**
    * <p>规则类型对应告警数量</p>
    */
    @SerializedName("RuleTypeCountSet")
    @Expose
    private K8SAPIRuleTypeCountItem [] RuleTypeCountSet;

    /**
     * Get <p>日期</p> 
     * @return Date <p>日期</p>
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set <p>日期</p>
     * @param Date <p>日期</p>
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get <p>异常UA请求事件数</p> 
     * @return ExceptionUARequestCount <p>异常UA请求事件数</p>
     */
    public Long getExceptionUARequestCount() {
        return this.ExceptionUARequestCount;
    }

    /**
     * Set <p>异常UA请求事件数</p>
     * @param ExceptionUARequestCount <p>异常UA请求事件数</p>
     */
    public void setExceptionUARequestCount(Long ExceptionUARequestCount) {
        this.ExceptionUARequestCount = ExceptionUARequestCount;
    }

    /**
     * Get <p>匿名用户权限事件数</p> 
     * @return AnonymousUserRightCount <p>匿名用户权限事件数</p>
     */
    public Long getAnonymousUserRightCount() {
        return this.AnonymousUserRightCount;
    }

    /**
     * Set <p>匿名用户权限事件数</p>
     * @param AnonymousUserRightCount <p>匿名用户权限事件数</p>
     */
    public void setAnonymousUserRightCount(Long AnonymousUserRightCount) {
        this.AnonymousUserRightCount = AnonymousUserRightCount;
    }

    /**
     * Get <p>凭据信息获取事件数</p> 
     * @return CredentialInformationObtainCount <p>凭据信息获取事件数</p>
     */
    public Long getCredentialInformationObtainCount() {
        return this.CredentialInformationObtainCount;
    }

    /**
     * Set <p>凭据信息获取事件数</p>
     * @param CredentialInformationObtainCount <p>凭据信息获取事件数</p>
     */
    public void setCredentialInformationObtainCount(Long CredentialInformationObtainCount) {
        this.CredentialInformationObtainCount = CredentialInformationObtainCount;
    }

    /**
     * Get <p>敏感数据挂载事件数</p> 
     * @return SensitiveDataMountCount <p>敏感数据挂载事件数</p>
     */
    public Long getSensitiveDataMountCount() {
        return this.SensitiveDataMountCount;
    }

    /**
     * Set <p>敏感数据挂载事件数</p>
     * @param SensitiveDataMountCount <p>敏感数据挂载事件数</p>
     */
    public void setSensitiveDataMountCount(Long SensitiveDataMountCount) {
        this.SensitiveDataMountCount = SensitiveDataMountCount;
    }

    /**
     * Get <p>命令执行事件数</p> 
     * @return CmdExecCount <p>命令执行事件数</p>
     */
    public Long getCmdExecCount() {
        return this.CmdExecCount;
    }

    /**
     * Set <p>命令执行事件数</p>
     * @param CmdExecCount <p>命令执行事件数</p>
     */
    public void setCmdExecCount(Long CmdExecCount) {
        this.CmdExecCount = CmdExecCount;
    }

    /**
     * Get <p>异常定时任务事件数</p> 
     * @return AbnormalScheduledTaskCount <p>异常定时任务事件数</p>
     */
    public Long getAbnormalScheduledTaskCount() {
        return this.AbnormalScheduledTaskCount;
    }

    /**
     * Set <p>异常定时任务事件数</p>
     * @param AbnormalScheduledTaskCount <p>异常定时任务事件数</p>
     */
    public void setAbnormalScheduledTaskCount(Long AbnormalScheduledTaskCount) {
        this.AbnormalScheduledTaskCount = AbnormalScheduledTaskCount;
    }

    /**
     * Get <p>静态Pod创建数</p> 
     * @return StaticsPodCreateCount <p>静态Pod创建数</p>
     */
    public Long getStaticsPodCreateCount() {
        return this.StaticsPodCreateCount;
    }

    /**
     * Set <p>静态Pod创建数</p>
     * @param StaticsPodCreateCount <p>静态Pod创建数</p>
     */
    public void setStaticsPodCreateCount(Long StaticsPodCreateCount) {
        this.StaticsPodCreateCount = StaticsPodCreateCount;
    }

    /**
     * Get <p>可疑容器创建数</p> 
     * @return DoubtfulContainerCreateCount <p>可疑容器创建数</p>
     */
    public Long getDoubtfulContainerCreateCount() {
        return this.DoubtfulContainerCreateCount;
    }

    /**
     * Set <p>可疑容器创建数</p>
     * @param DoubtfulContainerCreateCount <p>可疑容器创建数</p>
     */
    public void setDoubtfulContainerCreateCount(Long DoubtfulContainerCreateCount) {
        this.DoubtfulContainerCreateCount = DoubtfulContainerCreateCount;
    }

    /**
     * Get <p>自定义规则事件数</p> 
     * @return UserDefinedRuleCount <p>自定义规则事件数</p>
     */
    public Long getUserDefinedRuleCount() {
        return this.UserDefinedRuleCount;
    }

    /**
     * Set <p>自定义规则事件数</p>
     * @param UserDefinedRuleCount <p>自定义规则事件数</p>
     */
    public void setUserDefinedRuleCount(Long UserDefinedRuleCount) {
        this.UserDefinedRuleCount = UserDefinedRuleCount;
    }

    /**
     * Get <p>匿名访问事件数</p> 
     * @return AnonymousAccessCount <p>匿名访问事件数</p>
     */
    public Long getAnonymousAccessCount() {
        return this.AnonymousAccessCount;
    }

    /**
     * Set <p>匿名访问事件数</p>
     * @param AnonymousAccessCount <p>匿名访问事件数</p>
     */
    public void setAnonymousAccessCount(Long AnonymousAccessCount) {
        this.AnonymousAccessCount = AnonymousAccessCount;
    }

    /**
     * Get <p>特权容器事件数</p> 
     * @return PrivilegeContainerCount <p>特权容器事件数</p>
     */
    public Long getPrivilegeContainerCount() {
        return this.PrivilegeContainerCount;
    }

    /**
     * Set <p>特权容器事件数</p>
     * @param PrivilegeContainerCount <p>特权容器事件数</p>
     */
    public void setPrivilegeContainerCount(Long PrivilegeContainerCount) {
        this.PrivilegeContainerCount = PrivilegeContainerCount;
    }

    /**
     * Get <p>规则类型对应告警数量</p> 
     * @return RuleTypeCountSet <p>规则类型对应告警数量</p>
     */
    public K8SAPIRuleTypeCountItem [] getRuleTypeCountSet() {
        return this.RuleTypeCountSet;
    }

    /**
     * Set <p>规则类型对应告警数量</p>
     * @param RuleTypeCountSet <p>规则类型对应告警数量</p>
     */
    public void setRuleTypeCountSet(K8SAPIRuleTypeCountItem [] RuleTypeCountSet) {
        this.RuleTypeCountSet = RuleTypeCountSet;
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
        if (source.RuleTypeCountSet != null) {
            this.RuleTypeCountSet = new K8SAPIRuleTypeCountItem[source.RuleTypeCountSet.length];
            for (int i = 0; i < source.RuleTypeCountSet.length; i++) {
                this.RuleTypeCountSet[i] = new K8SAPIRuleTypeCountItem(source.RuleTypeCountSet[i]);
            }
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
        this.setParamArrayObj(map, prefix + "RuleTypeCountSet.", this.RuleTypeCountSet);

    }
}

