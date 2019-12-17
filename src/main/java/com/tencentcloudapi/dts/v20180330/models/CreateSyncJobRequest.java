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

public class CreateSyncJobRequest extends AbstractModel{

    /**
    * 灾备同步任务名
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
    * 源实例数据库类型，目前仅包括：mysql
    */
    @SerializedName("SrcDatabaseType")
    @Expose
    private String SrcDatabaseType;

    /**
    * 源实例接入类型，目前仅包括：cdb(云上cdb实例)
    */
    @SerializedName("SrcAccessType")
    @Expose
    private String SrcAccessType;

    /**
    * 源实例信息
    */
    @SerializedName("SrcInfo")
    @Expose
    private SyncInstanceInfo SrcInfo;

    /**
    * 目标实例数据库类型，目前仅包括：mysql
    */
    @SerializedName("DstDatabaseType")
    @Expose
    private String DstDatabaseType;

    /**
    * 目标实例接入类型，目前仅包括：cdb(云上cdb实例)
    */
    @SerializedName("DstAccessType")
    @Expose
    private String DstAccessType;

    /**
    * 目标实例信息
    */
    @SerializedName("DstInfo")
    @Expose
    private SyncInstanceInfo DstInfo;

    /**
    * 需要同步的源数据库表信息，用json格式的字符串描述。
对于database-table两级结构的数据库：
[{Database:db1,Table:[table1,table2]},{Database:db2}]
    */
    @SerializedName("DatabaseInfo")
    @Expose
    private String DatabaseInfo;

    /**
     * Get 灾备同步任务名 
     * @return JobName 灾备同步任务名
     */
    public String getJobName() {
        return this.JobName;
    }

    /**
     * Set 灾备同步任务名
     * @param JobName 灾备同步任务名
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
     * Get 源实例数据库类型，目前仅包括：mysql 
     * @return SrcDatabaseType 源实例数据库类型，目前仅包括：mysql
     */
    public String getSrcDatabaseType() {
        return this.SrcDatabaseType;
    }

    /**
     * Set 源实例数据库类型，目前仅包括：mysql
     * @param SrcDatabaseType 源实例数据库类型，目前仅包括：mysql
     */
    public void setSrcDatabaseType(String SrcDatabaseType) {
        this.SrcDatabaseType = SrcDatabaseType;
    }

    /**
     * Get 源实例接入类型，目前仅包括：cdb(云上cdb实例) 
     * @return SrcAccessType 源实例接入类型，目前仅包括：cdb(云上cdb实例)
     */
    public String getSrcAccessType() {
        return this.SrcAccessType;
    }

    /**
     * Set 源实例接入类型，目前仅包括：cdb(云上cdb实例)
     * @param SrcAccessType 源实例接入类型，目前仅包括：cdb(云上cdb实例)
     */
    public void setSrcAccessType(String SrcAccessType) {
        this.SrcAccessType = SrcAccessType;
    }

    /**
     * Get 源实例信息 
     * @return SrcInfo 源实例信息
     */
    public SyncInstanceInfo getSrcInfo() {
        return this.SrcInfo;
    }

    /**
     * Set 源实例信息
     * @param SrcInfo 源实例信息
     */
    public void setSrcInfo(SyncInstanceInfo SrcInfo) {
        this.SrcInfo = SrcInfo;
    }

    /**
     * Get 目标实例数据库类型，目前仅包括：mysql 
     * @return DstDatabaseType 目标实例数据库类型，目前仅包括：mysql
     */
    public String getDstDatabaseType() {
        return this.DstDatabaseType;
    }

    /**
     * Set 目标实例数据库类型，目前仅包括：mysql
     * @param DstDatabaseType 目标实例数据库类型，目前仅包括：mysql
     */
    public void setDstDatabaseType(String DstDatabaseType) {
        this.DstDatabaseType = DstDatabaseType;
    }

    /**
     * Get 目标实例接入类型，目前仅包括：cdb(云上cdb实例) 
     * @return DstAccessType 目标实例接入类型，目前仅包括：cdb(云上cdb实例)
     */
    public String getDstAccessType() {
        return this.DstAccessType;
    }

    /**
     * Set 目标实例接入类型，目前仅包括：cdb(云上cdb实例)
     * @param DstAccessType 目标实例接入类型，目前仅包括：cdb(云上cdb实例)
     */
    public void setDstAccessType(String DstAccessType) {
        this.DstAccessType = DstAccessType;
    }

    /**
     * Get 目标实例信息 
     * @return DstInfo 目标实例信息
     */
    public SyncInstanceInfo getDstInfo() {
        return this.DstInfo;
    }

    /**
     * Set 目标实例信息
     * @param DstInfo 目标实例信息
     */
    public void setDstInfo(SyncInstanceInfo DstInfo) {
        this.DstInfo = DstInfo;
    }

    /**
     * Get 需要同步的源数据库表信息，用json格式的字符串描述。
对于database-table两级结构的数据库：
[{Database:db1,Table:[table1,table2]},{Database:db2}] 
     * @return DatabaseInfo 需要同步的源数据库表信息，用json格式的字符串描述。
对于database-table两级结构的数据库：
[{Database:db1,Table:[table1,table2]},{Database:db2}]
     */
    public String getDatabaseInfo() {
        return this.DatabaseInfo;
    }

    /**
     * Set 需要同步的源数据库表信息，用json格式的字符串描述。
对于database-table两级结构的数据库：
[{Database:db1,Table:[table1,table2]},{Database:db2}]
     * @param DatabaseInfo 需要同步的源数据库表信息，用json格式的字符串描述。
对于database-table两级结构的数据库：
[{Database:db1,Table:[table1,table2]},{Database:db2}]
     */
    public void setDatabaseInfo(String DatabaseInfo) {
        this.DatabaseInfo = DatabaseInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobName", this.JobName);
        this.setParamObj(map, prefix + "SyncOption.", this.SyncOption);
        this.setParamSimple(map, prefix + "SrcDatabaseType", this.SrcDatabaseType);
        this.setParamSimple(map, prefix + "SrcAccessType", this.SrcAccessType);
        this.setParamObj(map, prefix + "SrcInfo.", this.SrcInfo);
        this.setParamSimple(map, prefix + "DstDatabaseType", this.DstDatabaseType);
        this.setParamSimple(map, prefix + "DstAccessType", this.DstAccessType);
        this.setParamObj(map, prefix + "DstInfo.", this.DstInfo);
        this.setParamSimple(map, prefix + "DatabaseInfo", this.DatabaseInfo);

    }
}

