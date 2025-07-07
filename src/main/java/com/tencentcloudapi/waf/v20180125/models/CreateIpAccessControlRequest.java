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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateIpAccessControlRequest extends AbstractModel {

    /**
    * 具体域名如：test.qcloudwaf.com
全局域名为：global
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * ip参数列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 42为黑名单，40为白名单
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
    */
    @SerializedName("ValidTS")
    @Expose
    private Long ValidTS;

    /**
    * 实例Id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
    */
    @SerializedName("Edition")
    @Expose
    private String Edition;

    /**
    * 可选值为：batch（批量添加）、bot（BOT流量分析中的BOT详情列表中添加时）、cc（在攻击日志列表中对攻击类型为CC的IP添加时）、custom（非批量添加时的默认值）
    */
    @SerializedName("SourceType")
    @Expose
    private String SourceType;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
    * 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 定时配置详情
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
     * Get 具体域名如：test.qcloudwaf.com
全局域名为：global 
     * @return Domain 具体域名如：test.qcloudwaf.com
全局域名为：global
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 具体域名如：test.qcloudwaf.com
全局域名为：global
     * @param Domain 具体域名如：test.qcloudwaf.com
全局域名为：global
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get ip参数列表 
     * @return IpList ip参数列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set ip参数列表
     * @param IpList ip参数列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * Get 42为黑名单，40为白名单 
     * @return ActionType 42为黑名单，40为白名单
     */
    public Long getActionType() {
        return this.ActionType;
    }

    /**
     * Set 42为黑名单，40为白名单
     * @param ActionType 42为黑名单，40为白名单
     */
    public void setActionType(Long ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00）） 
     * @return ValidTS valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     * @deprecated
     */
    @Deprecated
    public Long getValidTS() {
        return this.ValidTS;
    }

    /**
     * Set valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     * @param ValidTS valid_ts为有效日期，值为秒级时间戳（（如1680570420代表2023-04-04 09:07:00））
     * @deprecated
     */
    @Deprecated
    public void setValidTS(Long ValidTS) {
        this.ValidTS = ValidTS;
    }

    /**
     * Get 实例Id 
     * @return InstanceId 实例Id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例Id
     * @param InstanceId 实例Id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF 
     * @return Edition WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     */
    public String getEdition() {
        return this.Edition;
    }

    /**
     * Set WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     * @param Edition WAF实例类型，sparta-waf表示SAAS型WAF，clb-waf表示负载均衡型WAF
     */
    public void setEdition(String Edition) {
        this.Edition = Edition;
    }

    /**
     * Get 可选值为：batch（批量添加）、bot（BOT流量分析中的BOT详情列表中添加时）、cc（在攻击日志列表中对攻击类型为CC的IP添加时）、custom（非批量添加时的默认值） 
     * @return SourceType 可选值为：batch（批量添加）、bot（BOT流量分析中的BOT详情列表中添加时）、cc（在攻击日志列表中对攻击类型为CC的IP添加时）、custom（非批量添加时的默认值）
     */
    public String getSourceType() {
        return this.SourceType;
    }

    /**
     * Set 可选值为：batch（批量添加）、bot（BOT流量分析中的BOT详情列表中添加时）、cc（在攻击日志列表中对攻击类型为CC的IP添加时）、custom（非批量添加时的默认值）
     * @param SourceType 可选值为：batch（批量添加）、bot（BOT流量分析中的BOT详情列表中添加时）、cc（在攻击日志列表中对攻击类型为CC的IP添加时）、custom（非批量添加时的默认值）
     */
    public void setSourceType(String SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * Get 备注 
     * @return Note 备注
     */
    public String getNote() {
        return this.Note;
    }

    /**
     * Set 备注
     * @param Note 备注
     */
    public void setNote(String Note) {
        this.Note = Note;
    }

    /**
     * Get 规则执行的方式，TimedJob为定时执行，CronJob为周期执行 
     * @return JobType 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
     * @param JobType 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 定时配置详情 
     * @return JobDateTime 定时配置详情
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set 定时配置详情
     * @param JobDateTime 定时配置详情
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
    }

    public CreateIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateIpAccessControlRequest(CreateIpAccessControlRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.ValidTS != null) {
            this.ValidTS = new Long(source.ValidTS);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Edition != null) {
            this.Edition = new String(source.Edition);
        }
        if (source.SourceType != null) {
            this.SourceType = new String(source.SourceType);
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ValidTS", this.ValidTS);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Edition", this.Edition);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "Note", this.Note);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);

    }
}

