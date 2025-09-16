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

public class CreateBatchIpAccessControlRequest extends AbstractModel {

    /**
    * IP参数列表
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
    * 规则执行的方式，TimedJob为定时执行，CronJob为周期执行
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 定时任务配置
    */
    @SerializedName("JobDateTime")
    @Expose
    private JobDateTime JobDateTime;

    /**
    * 42为黑名单，40为白名单
    */
    @SerializedName("ActionType")
    @Expose
    private Long ActionType;

    /**
    * 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一
    */
    @SerializedName("GroupIds")
    @Expose
    private Long [] GroupIds;

    /**
    * 域名列表，如果绑定的是批量域名，和GroupIds参数二选一
    */
    @SerializedName("Domains")
    @Expose
    private String [] Domains;

    /**
    * 备注
    */
    @SerializedName("Note")
    @Expose
    private String Note;

    /**
     * Get IP参数列表 
     * @return IpList IP参数列表
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * Set IP参数列表
     * @param IpList IP参数列表
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
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
     * Get 定时任务配置 
     * @return JobDateTime 定时任务配置
     */
    public JobDateTime getJobDateTime() {
        return this.JobDateTime;
    }

    /**
     * Set 定时任务配置
     * @param JobDateTime 定时任务配置
     */
    public void setJobDateTime(JobDateTime JobDateTime) {
        this.JobDateTime = JobDateTime;
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
     * Get 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一 
     * @return GroupIds 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一
     */
    public Long [] getGroupIds() {
        return this.GroupIds;
    }

    /**
     * Set 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一
     * @param GroupIds 防护对象组ID列表，如果绑定的是防护对象组，和Domains参数二选一
     */
    public void setGroupIds(Long [] GroupIds) {
        this.GroupIds = GroupIds;
    }

    /**
     * Get 域名列表，如果绑定的是批量域名，和GroupIds参数二选一 
     * @return Domains 域名列表，如果绑定的是批量域名，和GroupIds参数二选一
     */
    public String [] getDomains() {
        return this.Domains;
    }

    /**
     * Set 域名列表，如果绑定的是批量域名，和GroupIds参数二选一
     * @param Domains 域名列表，如果绑定的是批量域名，和GroupIds参数二选一
     */
    public void setDomains(String [] Domains) {
        this.Domains = Domains;
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

    public CreateBatchIpAccessControlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateBatchIpAccessControlRequest(CreateBatchIpAccessControlRequest source) {
        if (source.IpList != null) {
            this.IpList = new String[source.IpList.length];
            for (int i = 0; i < source.IpList.length; i++) {
                this.IpList[i] = new String(source.IpList[i]);
            }
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.JobDateTime != null) {
            this.JobDateTime = new JobDateTime(source.JobDateTime);
        }
        if (source.ActionType != null) {
            this.ActionType = new Long(source.ActionType);
        }
        if (source.GroupIds != null) {
            this.GroupIds = new Long[source.GroupIds.length];
            for (int i = 0; i < source.GroupIds.length; i++) {
                this.GroupIds[i] = new Long(source.GroupIds[i]);
            }
        }
        if (source.Domains != null) {
            this.Domains = new String[source.Domains.length];
            for (int i = 0; i < source.Domains.length; i++) {
                this.Domains[i] = new String(source.Domains[i]);
            }
        }
        if (source.Note != null) {
            this.Note = new String(source.Note);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamObj(map, prefix + "JobDateTime.", this.JobDateTime);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamArraySimple(map, prefix + "GroupIds.", this.GroupIds);
        this.setParamArraySimple(map, prefix + "Domains.", this.Domains);
        this.setParamSimple(map, prefix + "Note", this.Note);

    }
}

