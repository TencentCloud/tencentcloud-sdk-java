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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyMigrationJobRequest extends AbstractModel{

    /**
    * 任务id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)
    */
    @SerializedName("RunMode")
    @Expose
    private String RunMode;

    /**
    * 迁移任务配置选项，描述任务如何执行迁移等一系列配置信息；字段下的RateLimitOption不可配置、如果需要修改任务的限速信息、请在任务运行后通过ModifyMigrateRateLimit接口修改
    */
    @SerializedName("MigrateOption")
    @Expose
    private MigrateOption MigrateOption;

    /**
    * 源实例信息
    */
    @SerializedName("SrcInfo")
    @Expose
    private DBEndpointInfo SrcInfo;

    /**
    * 目标实例信息
    */
    @SerializedName("DstInfo")
    @Expose
    private DBEndpointInfo DstInfo;

    /**
    * 迁移任务名称，最大长度128
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 期待启动时间，当RunMode取值为timed时，此值必填，形如："2006-01-02 15:04:05"
    */
    @SerializedName("ExpectRunTime")
    @Expose
    private String ExpectRunTime;

    /**
    * 标签信息
    */
    @SerializedName("Tags")
    @Expose
    private TagItem [] Tags;

    /**
    * 自动重试的时间段、可设置5至720分钟、0表示不重试
    */
    @SerializedName("AutoRetryTimeRangeMinutes")
    @Expose
    private Long AutoRetryTimeRangeMinutes;

    /**
     * Get 任务id 
     * @return JobId 任务id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 任务id
     * @param JobId 任务id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行) 
     * @return RunMode 运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)
     */
    public String getRunMode() {
        return this.RunMode;
    }

    /**
     * Set 运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)
     * @param RunMode 运行模式，取值如：immediate(表示立即运行)、timed(表示定时运行)
     */
    public void setRunMode(String RunMode) {
        this.RunMode = RunMode;
    }

    /**
     * Get 迁移任务配置选项，描述任务如何执行迁移等一系列配置信息；字段下的RateLimitOption不可配置、如果需要修改任务的限速信息、请在任务运行后通过ModifyMigrateRateLimit接口修改 
     * @return MigrateOption 迁移任务配置选项，描述任务如何执行迁移等一系列配置信息；字段下的RateLimitOption不可配置、如果需要修改任务的限速信息、请在任务运行后通过ModifyMigrateRateLimit接口修改
     */
    public MigrateOption getMigrateOption() {
        return this.MigrateOption;
    }

    /**
     * Set 迁移任务配置选项，描述任务如何执行迁移等一系列配置信息；字段下的RateLimitOption不可配置、如果需要修改任务的限速信息、请在任务运行后通过ModifyMigrateRateLimit接口修改
     * @param MigrateOption 迁移任务配置选项，描述任务如何执行迁移等一系列配置信息；字段下的RateLimitOption不可配置、如果需要修改任务的限速信息、请在任务运行后通过ModifyMigrateRateLimit接口修改
     */
    public void setMigrateOption(MigrateOption MigrateOption) {
        this.MigrateOption = MigrateOption;
    }

    /**
     * Get 源实例信息 
     * @return SrcInfo 源实例信息
     */
    public DBEndpointInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源实例信息
     * @param SrcInfo 源实例信息
     */
    public void setSrcInfo(DBEndpointInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 目标实例信息 
     * @return DstInfo 目标实例信息
     */
    public DBEndpointInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标实例信息
     * @param DstInfo 目标实例信息
     */
    public void setDstInfo(DBEndpointInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 迁移任务名称，最大长度128 
     * @return JobName 迁移任务名称，最大长度128
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 迁移任务名称，最大长度128
     * @param JobName 迁移任务名称，最大长度128
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 期待启动时间，当RunMode取值为timed时，此值必填，形如："2006-01-02 15:04:05" 
     * @return ExpectRunTime 期待启动时间，当RunMode取值为timed时，此值必填，形如："2006-01-02 15:04:05"
     */
    public String getExpectRunTime() {
        return this.ExpectRunTime;
    }

    /**
     * Set 期待启动时间，当RunMode取值为timed时，此值必填，形如："2006-01-02 15:04:05"
     * @param ExpectRunTime 期待启动时间，当RunMode取值为timed时，此值必填，形如："2006-01-02 15:04:05"
     */
    public void setExpectRunTime(String ExpectRunTime) {
        this.ExpectRunTime = ExpectRunTime;
    }

    /**
     * Get 标签信息 
     * @return Tags 标签信息
     */
    public TagItem [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签信息
     * @param Tags 标签信息
     */
    public void setTags(TagItem [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 自动重试的时间段、可设置5至720分钟、0表示不重试 
     * @return AutoRetryTimeRangeMinutes 自动重试的时间段、可设置5至720分钟、0表示不重试
     */
    public Long getAutoRetryTimeRangeMinutes() {
        return this.AutoRetryTimeRangeMinutes;
    }

    /**
     * Set 自动重试的时间段、可设置5至720分钟、0表示不重试
     * @param AutoRetryTimeRangeMinutes 自动重试的时间段、可设置5至720分钟、0表示不重试
     */
    public void setAutoRetryTimeRangeMinutes(Long AutoRetryTimeRangeMinutes) {
        this.AutoRetryTimeRangeMinutes = AutoRetryTimeRangeMinutes;
    }

    public ModifyMigrationJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyMigrationJobRequest(ModifyMigrationJobRequest source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.RunMode != null) {
            this.RunMode = new String(source.RunMode);
        }
        if (source.MigrateOption != null) {
            this.MigrateOption = new MigrateOption(source.MigrateOption);
        }
        if (source.SrcInfo != null) {
            this.SrcInfo = new DBEndpointInfo(source.SrcInfo);
        }
        if (source.DstInfo != null) {
            this.DstInfo = new DBEndpointInfo(source.DstInfo);
        }
        if (source.JobName != null) {
            this.JobName = new String(source.JobName);
        }
        if (source.ExpectRunTime != null) {
            this.ExpectRunTime = new String(source.ExpectRunTime);
        }
        if (source.Tags != null) {
            this.Tags = new TagItem[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagItem(source.Tags[i]);
            }
        }
        if (source.AutoRetryTimeRangeMinutes != null) {
            this.AutoRetryTimeRangeMinutes = new Long(source.AutoRetryTimeRangeMinutes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RunMode", this.RunMode);
        this.setParamObj(map, prefix + "MigrateOption.", this.MigrateOption);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamSimple(map, prefix + "ExpectRunTime", this.ExpectRunTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "AutoRetryTimeRangeMinutes", this.AutoRetryTimeRangeMinutes);

    }
}

