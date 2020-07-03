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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySyncJobRequest extends AbstractModel{

    /**
    * 待修改的灾备同步任务ID
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 灾备同步任务名称
    */
    @SerializedName("JobName")
    @Expose
    private String JobName;

    /**
    * 灾备同步任务配置选项
    */
    @SerializedName("SyncOption")
    @Expose
    private SyncOption SyncOption;

    /**
    * 当选择'指定库表'灾备同步的时候, 需要设置待同步的源数据库表信息,用符合json数组格式的字符串描述, 如下所例。
对于database-table两级结构的数据库：
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
     * Get 待修改的灾备同步任务ID 
     * @return JobId 待修改的灾备同步任务ID
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 待修改的灾备同步任务ID
     * @param JobId 待修改的灾备同步任务ID
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 灾备同步任务名称 
     * @return JobName 灾备同步任务名称
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 灾备同步任务名称
     * @param JobName 灾备同步任务名称
     */
    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    /**
     * Get 灾备同步任务配置选项 
     * @return SyncOption 灾备同步任务配置选项
     */
    public SyncOption getSyncOption() {
        return this.SyncOption;
    }

    /**
     * Set 灾备同步任务配置选项
     * @param SyncOption 灾备同步任务配置选项
     */
    public void setSyncOption(SyncOption SyncOption) {
        this.SyncOption = SyncOption;
    }

    /**
     * Get 当选择'指定库表'灾备同步的时候, 需要设置待同步的源数据库表信息,用符合json数组格式的字符串描述, 如下所例。
对于database-table两级结构的数据库：
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}] 
     * @return DatabaseInfo 当选择'指定库表'灾备同步的时候, 需要设置待同步的源数据库表信息,用符合json数组格式的字符串描述, 如下所例。
对于database-table两级结构的数据库：
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set 当选择'指定库表'灾备同步的时候, 需要设置待同步的源数据库表信息,用符合json数组格式的字符串描述, 如下所例。
对于database-table两级结构的数据库：
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
     * @param DatabaseInfo 当选择'指定库表'灾备同步的时候, 需要设置待同步的源数据库表信息,用符合json数组格式的字符串描述, 如下所例。
对于database-table两级结构的数据库：
[{"Database":"db1","Table":["table1","table2"]},{"Database":"db2"}]
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "SyncOption.", this.SyncOption);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);

    }
}

