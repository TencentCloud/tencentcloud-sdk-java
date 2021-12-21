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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RunJobDescription extends AbstractModel{

    /**
    * 作业Id
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * 运行类型，1：启动，2：恢复
    */
    @SerializedName("RunType")
    @Expose
    private Long RunType;

    /**
    * 已废弃。旧版 SQL 类型作业启动参数：指定数据源消费起始时间点
    */
    @SerializedName("StartMode")
    @Expose
    private String StartMode;

    /**
    * 当前作业的某个版本
    */
    @SerializedName("JobConfigVersion")
    @Expose
    private Long JobConfigVersion;

    /**
    * Savepoint路径
    */
    @SerializedName("SavepointPath")
    @Expose
    private String SavepointPath;

    /**
    * Savepoint的Id
    */
    @SerializedName("SavepointId")
    @Expose
    private String SavepointId;

    /**
     * Get 作业Id 
     * @return JobId 作业Id
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set 作业Id
     * @param JobId 作业Id
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 运行类型，1：启动，2：恢复 
     * @return RunType 运行类型，1：启动，2：恢复
     */
    public Long getRunType() {
        return this.RunType;
    }

    /**
     * Set 运行类型，1：启动，2：恢复
     * @param RunType 运行类型，1：启动，2：恢复
     */
    public void setRunType(Long RunType) {
        this.RunType = RunType;
    }

    /**
     * Get 已废弃。旧版 SQL 类型作业启动参数：指定数据源消费起始时间点 
     * @return StartMode 已废弃。旧版 SQL 类型作业启动参数：指定数据源消费起始时间点
     */
    public String getStartMode() {
        return this.StartMode;
    }

    /**
     * Set 已废弃。旧版 SQL 类型作业启动参数：指定数据源消费起始时间点
     * @param StartMode 已废弃。旧版 SQL 类型作业启动参数：指定数据源消费起始时间点
     */
    public void setStartMode(String StartMode) {
        this.StartMode = StartMode;
    }

    /**
     * Get 当前作业的某个版本 
     * @return JobConfigVersion 当前作业的某个版本
     */
    public Long getJobConfigVersion() {
        return this.JobConfigVersion;
    }

    /**
     * Set 当前作业的某个版本
     * @param JobConfigVersion 当前作业的某个版本
     */
    public void setJobConfigVersion(Long JobConfigVersion) {
        this.JobConfigVersion = JobConfigVersion;
    }

    /**
     * Get Savepoint路径 
     * @return SavepointPath Savepoint路径
     */
    public String getSavepointPath() {
        return this.SavepointPath;
    }

    /**
     * Set Savepoint路径
     * @param SavepointPath Savepoint路径
     */
    public void setSavepointPath(String SavepointPath) {
        this.SavepointPath = SavepointPath;
    }

    /**
     * Get Savepoint的Id 
     * @return SavepointId Savepoint的Id
     */
    public String getSavepointId() {
        return this.SavepointId;
    }

    /**
     * Set Savepoint的Id
     * @param SavepointId Savepoint的Id
     */
    public void setSavepointId(String SavepointId) {
        this.SavepointId = SavepointId;
    }

    public RunJobDescription() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RunJobDescription(RunJobDescription source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.RunType != null) {
            this.RunType = new Long(source.RunType);
        }
        if (source.StartMode != null) {
            this.StartMode = new String(source.StartMode);
        }
        if (source.JobConfigVersion != null) {
            this.JobConfigVersion = new Long(source.JobConfigVersion);
        }
        if (source.SavepointPath != null) {
            this.SavepointPath = new String(source.SavepointPath);
        }
        if (source.SavepointId != null) {
            this.SavepointId = new String(source.SavepointId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "RunType", this.RunType);
        this.setParamSimple(map, prefix + "StartMode", this.StartMode);
        this.setParamSimple(map, prefix + "JobConfigVersion", this.JobConfigVersion);
        this.setParamSimple(map, prefix + "SavepointPath", this.SavepointPath);
        this.setParamSimple(map, prefix + "SavepointId", this.SavepointId);

    }
}

