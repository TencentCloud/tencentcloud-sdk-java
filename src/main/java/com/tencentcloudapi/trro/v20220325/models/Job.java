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
package com.tencentcloudapi.trro.v20220325.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Job extends AbstractModel {

    /**
    * <p>任务 ID</p>
    */
    @SerializedName("JobId")
    @Expose
    private String JobId;

    /**
    * <p>任务类型：1 单视频，2 批量</p><p>枚举值：</p><ul><li>1： 单视频</li><li>2： 批量</li></ul>
    */
    @SerializedName("JobType")
    @Expose
    private Long JobType;

    /**
    * <p>标注模式：3 精标注</p><p>枚举值：</p><ul><li>3： 精标注</li></ul>
    */
    @SerializedName("AnnotationType")
    @Expose
    private Long AnnotationType;

    /**
    * <p>任务状态：1 处理中，2 异常，3 成功</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>文件列举状态：0 列举中，1 全部加载，2 超过数量上限截断（仅批量任务）</p><p>枚举值：</p><ul><li>0： 列举中</li><li>1： 全部加载</li><li>2： 超过数量上限截断（仅批量任务）</li></ul>
    */
    @SerializedName("IngestStatus")
    @Expose
    private Long IngestStatus;

    /**
    * <p>输入路径（S3源为桶名/对象路径：批量任务为目录前缀，单文件为文件完整路径；HTTP源为完整URL）</p>
    */
    @SerializedName("InputPath")
    @Expose
    private String InputPath;

    /**
    * <p>处理项总数</p>
    */
    @SerializedName("TotalNumber")
    @Expose
    private Long TotalNumber;

    /**
    * <p>创建时间，Unix 时间戳（秒）</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>完成时间，Unix 时间戳（秒），未完成为 0</p>
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
     * Get <p>任务 ID</p> 
     * @return JobId <p>任务 ID</p>
     */
    public String getJobId() {
        return this.JobId;
    }

    /**
     * Set <p>任务 ID</p>
     * @param JobId <p>任务 ID</p>
     */
    public void setJobId(String JobId) {
        this.JobId = JobId;
    }

    /**
     * Get <p>任务类型：1 单视频，2 批量</p><p>枚举值：</p><ul><li>1： 单视频</li><li>2： 批量</li></ul> 
     * @return JobType <p>任务类型：1 单视频，2 批量</p><p>枚举值：</p><ul><li>1： 单视频</li><li>2： 批量</li></ul>
     */
    public Long getJobType() {
        return this.JobType;
    }

    /**
     * Set <p>任务类型：1 单视频，2 批量</p><p>枚举值：</p><ul><li>1： 单视频</li><li>2： 批量</li></ul>
     * @param JobType <p>任务类型：1 单视频，2 批量</p><p>枚举值：</p><ul><li>1： 单视频</li><li>2： 批量</li></ul>
     */
    public void setJobType(Long JobType) {
        this.JobType = JobType;
    }

    /**
     * Get <p>标注模式：3 精标注</p><p>枚举值：</p><ul><li>3： 精标注</li></ul> 
     * @return AnnotationType <p>标注模式：3 精标注</p><p>枚举值：</p><ul><li>3： 精标注</li></ul>
     */
    public Long getAnnotationType() {
        return this.AnnotationType;
    }

    /**
     * Set <p>标注模式：3 精标注</p><p>枚举值：</p><ul><li>3： 精标注</li></ul>
     * @param AnnotationType <p>标注模式：3 精标注</p><p>枚举值：</p><ul><li>3： 精标注</li></ul>
     */
    public void setAnnotationType(Long AnnotationType) {
        this.AnnotationType = AnnotationType;
    }

    /**
     * Get <p>任务状态：1 处理中，2 异常，3 成功</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul> 
     * @return Status <p>任务状态：1 处理中，2 异常，3 成功</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>任务状态：1 处理中，2 异常，3 成功</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul>
     * @param Status <p>任务状态：1 处理中，2 异常，3 成功</p><p>枚举值：</p><ul><li>1： 处理中</li><li>2： 异常</li><li>3： 成功</li></ul>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>文件列举状态：0 列举中，1 全部加载，2 超过数量上限截断（仅批量任务）</p><p>枚举值：</p><ul><li>0： 列举中</li><li>1： 全部加载</li><li>2： 超过数量上限截断（仅批量任务）</li></ul> 
     * @return IngestStatus <p>文件列举状态：0 列举中，1 全部加载，2 超过数量上限截断（仅批量任务）</p><p>枚举值：</p><ul><li>0： 列举中</li><li>1： 全部加载</li><li>2： 超过数量上限截断（仅批量任务）</li></ul>
     */
    public Long getIngestStatus() {
        return this.IngestStatus;
    }

    /**
     * Set <p>文件列举状态：0 列举中，1 全部加载，2 超过数量上限截断（仅批量任务）</p><p>枚举值：</p><ul><li>0： 列举中</li><li>1： 全部加载</li><li>2： 超过数量上限截断（仅批量任务）</li></ul>
     * @param IngestStatus <p>文件列举状态：0 列举中，1 全部加载，2 超过数量上限截断（仅批量任务）</p><p>枚举值：</p><ul><li>0： 列举中</li><li>1： 全部加载</li><li>2： 超过数量上限截断（仅批量任务）</li></ul>
     */
    public void setIngestStatus(Long IngestStatus) {
        this.IngestStatus = IngestStatus;
    }

    /**
     * Get <p>输入路径（S3源为桶名/对象路径：批量任务为目录前缀，单文件为文件完整路径；HTTP源为完整URL）</p> 
     * @return InputPath <p>输入路径（S3源为桶名/对象路径：批量任务为目录前缀，单文件为文件完整路径；HTTP源为完整URL）</p>
     */
    public String getInputPath() {
        return this.InputPath;
    }

    /**
     * Set <p>输入路径（S3源为桶名/对象路径：批量任务为目录前缀，单文件为文件完整路径；HTTP源为完整URL）</p>
     * @param InputPath <p>输入路径（S3源为桶名/对象路径：批量任务为目录前缀，单文件为文件完整路径；HTTP源为完整URL）</p>
     */
    public void setInputPath(String InputPath) {
        this.InputPath = InputPath;
    }

    /**
     * Get <p>处理项总数</p> 
     * @return TotalNumber <p>处理项总数</p>
     */
    public Long getTotalNumber() {
        return this.TotalNumber;
    }

    /**
     * Set <p>处理项总数</p>
     * @param TotalNumber <p>处理项总数</p>
     */
    public void setTotalNumber(Long TotalNumber) {
        this.TotalNumber = TotalNumber;
    }

    /**
     * Get <p>创建时间，Unix 时间戳（秒）</p> 
     * @return CreateTime <p>创建时间，Unix 时间戳（秒）</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>创建时间，Unix 时间戳（秒）</p>
     * @param CreateTime <p>创建时间，Unix 时间戳（秒）</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>完成时间，Unix 时间戳（秒），未完成为 0</p> 
     * @return FinishTime <p>完成时间，Unix 时间戳（秒），未完成为 0</p>
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set <p>完成时间，Unix 时间戳（秒），未完成为 0</p>
     * @param FinishTime <p>完成时间，Unix 时间戳（秒），未完成为 0</p>
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    public Job() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Job(Job source) {
        if (source.JobId != null) {
            this.JobId = new String(source.JobId);
        }
        if (source.JobType != null) {
            this.JobType = new Long(source.JobType);
        }
        if (source.AnnotationType != null) {
            this.AnnotationType = new Long(source.AnnotationType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.IngestStatus != null) {
            this.IngestStatus = new Long(source.IngestStatus);
        }
        if (source.InputPath != null) {
            this.InputPath = new String(source.InputPath);
        }
        if (source.TotalNumber != null) {
            this.TotalNumber = new Long(source.TotalNumber);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "AnnotationType", this.AnnotationType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "IngestStatus", this.IngestStatus);
        this.setParamSimple(map, prefix + "InputPath", this.InputPath);
        this.setParamSimple(map, prefix + "TotalNumber", this.TotalNumber);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);

    }
}

