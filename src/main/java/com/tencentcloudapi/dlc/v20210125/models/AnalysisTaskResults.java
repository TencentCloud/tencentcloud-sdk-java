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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisTaskResults extends AbstractModel {

    /**
    * <p>任务Id</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>任务创建时间，毫秒时间戳</p>
    */
    @SerializedName("InstanceStartTime")
    @Expose
    private Long InstanceStartTime;

    /**
    * <p>任务结束时间，毫秒时间戳</p>
    */
    @SerializedName("InstanceCompleteTime")
    @Expose
    private Long InstanceCompleteTime;

    /**
    * <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>任务SQL语句</p>
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * <p>计算资源名字</p>
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * <p>单位毫秒，引擎内执行耗时, 反映真正用于计算所需的耗时，即从  Spark 任务第一个 Task  开始执行到任务结束之间的耗时。<br>具体的：会统计任务的每个 Spark Stage 第一个 Task 到最后一个 Task 完成时长之和，不包含任务开始的排队耗时（即剔除从任务提交到 Spark Task 开始执行之间的调度等其他耗时），也不包含任务执行过程中多个 Spark Stage 之间因 executor 资源不足而等待执行 Task 所消耗的时间。</p>
    */
    @SerializedName("JobTimeSum")
    @Expose
    private Long JobTimeSum;

    /**
    * <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和</p>
    */
    @SerializedName("TaskTimeSum")
    @Expose
    private Long TaskTimeSum;

    /**
    * <p>数据扫描总行数</p>
    */
    @SerializedName("InputRecordsSum")
    @Expose
    private Long InputRecordsSum;

    /**
    * <p>数据扫描总 bytes</p>
    */
    @SerializedName("InputBytesSum")
    @Expose
    private Long InputBytesSum;

    /**
    * <p>输出总行数</p>
    */
    @SerializedName("OutputRecordsSum")
    @Expose
    private Long OutputRecordsSum;

    /**
    * <p>输出总 bytes</p>
    */
    @SerializedName("OutputBytesSum")
    @Expose
    private Long OutputBytesSum;

    /**
    * <p>shuffle read 总 bytes</p>
    */
    @SerializedName("ShuffleReadBytesSum")
    @Expose
    private Long ShuffleReadBytesSum;

    /**
    * <p>shuffle read 总行数</p>
    */
    @SerializedName("ShuffleReadRecordsSum")
    @Expose
    private Long ShuffleReadRecordsSum;

    /**
    * <p>洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）</p>
    */
    @SerializedName("AnalysisStatus")
    @Expose
    private String AnalysisStatus;

    /**
    * <p>任务输出文件总数</p>
    */
    @SerializedName("OutputFilesNum")
    @Expose
    private Long OutputFilesNum;

    /**
    * <p>任务输出小文件总数</p>
    */
    @SerializedName("OutputSmallFilesNum")
    @Expose
    private Long OutputSmallFilesNum;

    /**
    * <p>shuffle write 总 Bytes 大小</p><p>单位：Bytes</p><p>默认值：无</p>
    */
    @SerializedName("ShuffleWriteBytesSum")
    @Expose
    private Long ShuffleWriteBytesSum;

    /**
     * Get <p>任务Id</p> 
     * @return Id <p>任务Id</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>任务Id</p>
     * @param Id <p>任务Id</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>任务创建时间，毫秒时间戳</p> 
     * @return InstanceStartTime <p>任务创建时间，毫秒时间戳</p>
     */
    public Long getInstanceStartTime() {
        return this.InstanceStartTime;
    }

    /**
     * Set <p>任务创建时间，毫秒时间戳</p>
     * @param InstanceStartTime <p>任务创建时间，毫秒时间戳</p>
     */
    public void setInstanceStartTime(Long InstanceStartTime) {
        this.InstanceStartTime = InstanceStartTime;
    }

    /**
     * Get <p>任务结束时间，毫秒时间戳</p> 
     * @return InstanceCompleteTime <p>任务结束时间，毫秒时间戳</p>
     */
    public Long getInstanceCompleteTime() {
        return this.InstanceCompleteTime;
    }

    /**
     * Set <p>任务结束时间，毫秒时间戳</p>
     * @param InstanceCompleteTime <p>任务结束时间，毫秒时间戳</p>
     */
    public void setInstanceCompleteTime(Long InstanceCompleteTime) {
        this.InstanceCompleteTime = InstanceCompleteTime;
    }

    /**
     * Get <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p> 
     * @return State <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p>
     * @param State <p>任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>任务SQL语句</p> 
     * @return SQL <p>任务SQL语句</p>
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set <p>任务SQL语句</p>
     * @param SQL <p>任务SQL语句</p>
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get <p>计算资源名字</p> 
     * @return DataEngineName <p>计算资源名字</p>
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set <p>计算资源名字</p>
     * @param DataEngineName <p>计算资源名字</p>
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get <p>单位毫秒，引擎内执行耗时, 反映真正用于计算所需的耗时，即从  Spark 任务第一个 Task  开始执行到任务结束之间的耗时。<br>具体的：会统计任务的每个 Spark Stage 第一个 Task 到最后一个 Task 完成时长之和，不包含任务开始的排队耗时（即剔除从任务提交到 Spark Task 开始执行之间的调度等其他耗时），也不包含任务执行过程中多个 Spark Stage 之间因 executor 资源不足而等待执行 Task 所消耗的时间。</p> 
     * @return JobTimeSum <p>单位毫秒，引擎内执行耗时, 反映真正用于计算所需的耗时，即从  Spark 任务第一个 Task  开始执行到任务结束之间的耗时。<br>具体的：会统计任务的每个 Spark Stage 第一个 Task 到最后一个 Task 完成时长之和，不包含任务开始的排队耗时（即剔除从任务提交到 Spark Task 开始执行之间的调度等其他耗时），也不包含任务执行过程中多个 Spark Stage 之间因 executor 资源不足而等待执行 Task 所消耗的时间。</p>
     */
    public Long getJobTimeSum() {
        return this.JobTimeSum;
    }

    /**
     * Set <p>单位毫秒，引擎内执行耗时, 反映真正用于计算所需的耗时，即从  Spark 任务第一个 Task  开始执行到任务结束之间的耗时。<br>具体的：会统计任务的每个 Spark Stage 第一个 Task 到最后一个 Task 完成时长之和，不包含任务开始的排队耗时（即剔除从任务提交到 Spark Task 开始执行之间的调度等其他耗时），也不包含任务执行过程中多个 Spark Stage 之间因 executor 资源不足而等待执行 Task 所消耗的时间。</p>
     * @param JobTimeSum <p>单位毫秒，引擎内执行耗时, 反映真正用于计算所需的耗时，即从  Spark 任务第一个 Task  开始执行到任务结束之间的耗时。<br>具体的：会统计任务的每个 Spark Stage 第一个 Task 到最后一个 Task 完成时长之和，不包含任务开始的排队耗时（即剔除从任务提交到 Spark Task 开始执行之间的调度等其他耗时），也不包含任务执行过程中多个 Spark Stage 之间因 executor 资源不足而等待执行 Task 所消耗的时间。</p>
     */
    public void setJobTimeSum(Long JobTimeSum) {
        this.JobTimeSum = JobTimeSum;
    }

    /**
     * Get <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和</p> 
     * @return TaskTimeSum <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和</p>
     */
    public Long getTaskTimeSum() {
        return this.TaskTimeSum;
    }

    /**
     * Set <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和</p>
     * @param TaskTimeSum <p>单位秒，累计 CPU* 秒 ( 累计 CPU * 时 = 累计 CPU* 秒/ 3600)，统计参与计算所用 Spark Executor 每个 core 的 CPU 执行时长总和</p>
     */
    public void setTaskTimeSum(Long TaskTimeSum) {
        this.TaskTimeSum = TaskTimeSum;
    }

    /**
     * Get <p>数据扫描总行数</p> 
     * @return InputRecordsSum <p>数据扫描总行数</p>
     */
    public Long getInputRecordsSum() {
        return this.InputRecordsSum;
    }

    /**
     * Set <p>数据扫描总行数</p>
     * @param InputRecordsSum <p>数据扫描总行数</p>
     */
    public void setInputRecordsSum(Long InputRecordsSum) {
        this.InputRecordsSum = InputRecordsSum;
    }

    /**
     * Get <p>数据扫描总 bytes</p> 
     * @return InputBytesSum <p>数据扫描总 bytes</p>
     */
    public Long getInputBytesSum() {
        return this.InputBytesSum;
    }

    /**
     * Set <p>数据扫描总 bytes</p>
     * @param InputBytesSum <p>数据扫描总 bytes</p>
     */
    public void setInputBytesSum(Long InputBytesSum) {
        this.InputBytesSum = InputBytesSum;
    }

    /**
     * Get <p>输出总行数</p> 
     * @return OutputRecordsSum <p>输出总行数</p>
     */
    public Long getOutputRecordsSum() {
        return this.OutputRecordsSum;
    }

    /**
     * Set <p>输出总行数</p>
     * @param OutputRecordsSum <p>输出总行数</p>
     */
    public void setOutputRecordsSum(Long OutputRecordsSum) {
        this.OutputRecordsSum = OutputRecordsSum;
    }

    /**
     * Get <p>输出总 bytes</p> 
     * @return OutputBytesSum <p>输出总 bytes</p>
     */
    public Long getOutputBytesSum() {
        return this.OutputBytesSum;
    }

    /**
     * Set <p>输出总 bytes</p>
     * @param OutputBytesSum <p>输出总 bytes</p>
     */
    public void setOutputBytesSum(Long OutputBytesSum) {
        this.OutputBytesSum = OutputBytesSum;
    }

    /**
     * Get <p>shuffle read 总 bytes</p> 
     * @return ShuffleReadBytesSum <p>shuffle read 总 bytes</p>
     */
    public Long getShuffleReadBytesSum() {
        return this.ShuffleReadBytesSum;
    }

    /**
     * Set <p>shuffle read 总 bytes</p>
     * @param ShuffleReadBytesSum <p>shuffle read 总 bytes</p>
     */
    public void setShuffleReadBytesSum(Long ShuffleReadBytesSum) {
        this.ShuffleReadBytesSum = ShuffleReadBytesSum;
    }

    /**
     * Get <p>shuffle read 总行数</p> 
     * @return ShuffleReadRecordsSum <p>shuffle read 总行数</p>
     */
    public Long getShuffleReadRecordsSum() {
        return this.ShuffleReadRecordsSum;
    }

    /**
     * Set <p>shuffle read 总行数</p>
     * @param ShuffleReadRecordsSum <p>shuffle read 总行数</p>
     */
    public void setShuffleReadRecordsSum(Long ShuffleReadRecordsSum) {
        this.ShuffleReadRecordsSum = ShuffleReadRecordsSum;
    }

    /**
     * Get <p>洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）</p> 
     * @return AnalysisStatus <p>洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）</p>
     */
    public String getAnalysisStatus() {
        return this.AnalysisStatus;
    }

    /**
     * Set <p>洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）</p>
     * @param AnalysisStatus <p>洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）</p>
     */
    public void setAnalysisStatus(String AnalysisStatus) {
        this.AnalysisStatus = AnalysisStatus;
    }

    /**
     * Get <p>任务输出文件总数</p> 
     * @return OutputFilesNum <p>任务输出文件总数</p>
     */
    public Long getOutputFilesNum() {
        return this.OutputFilesNum;
    }

    /**
     * Set <p>任务输出文件总数</p>
     * @param OutputFilesNum <p>任务输出文件总数</p>
     */
    public void setOutputFilesNum(Long OutputFilesNum) {
        this.OutputFilesNum = OutputFilesNum;
    }

    /**
     * Get <p>任务输出小文件总数</p> 
     * @return OutputSmallFilesNum <p>任务输出小文件总数</p>
     */
    public Long getOutputSmallFilesNum() {
        return this.OutputSmallFilesNum;
    }

    /**
     * Set <p>任务输出小文件总数</p>
     * @param OutputSmallFilesNum <p>任务输出小文件总数</p>
     */
    public void setOutputSmallFilesNum(Long OutputSmallFilesNum) {
        this.OutputSmallFilesNum = OutputSmallFilesNum;
    }

    /**
     * Get <p>shuffle write 总 Bytes 大小</p><p>单位：Bytes</p><p>默认值：无</p> 
     * @return ShuffleWriteBytesSum <p>shuffle write 总 Bytes 大小</p><p>单位：Bytes</p><p>默认值：无</p>
     */
    public Long getShuffleWriteBytesSum() {
        return this.ShuffleWriteBytesSum;
    }

    /**
     * Set <p>shuffle write 总 Bytes 大小</p><p>单位：Bytes</p><p>默认值：无</p>
     * @param ShuffleWriteBytesSum <p>shuffle write 总 Bytes 大小</p><p>单位：Bytes</p><p>默认值：无</p>
     */
    public void setShuffleWriteBytesSum(Long ShuffleWriteBytesSum) {
        this.ShuffleWriteBytesSum = ShuffleWriteBytesSum;
    }

    public AnalysisTaskResults() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AnalysisTaskResults(AnalysisTaskResults source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.InstanceStartTime != null) {
            this.InstanceStartTime = new Long(source.InstanceStartTime);
        }
        if (source.InstanceCompleteTime != null) {
            this.InstanceCompleteTime = new Long(source.InstanceCompleteTime);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.SQL != null) {
            this.SQL = new String(source.SQL);
        }
        if (source.DataEngineName != null) {
            this.DataEngineName = new String(source.DataEngineName);
        }
        if (source.JobTimeSum != null) {
            this.JobTimeSum = new Long(source.JobTimeSum);
        }
        if (source.TaskTimeSum != null) {
            this.TaskTimeSum = new Long(source.TaskTimeSum);
        }
        if (source.InputRecordsSum != null) {
            this.InputRecordsSum = new Long(source.InputRecordsSum);
        }
        if (source.InputBytesSum != null) {
            this.InputBytesSum = new Long(source.InputBytesSum);
        }
        if (source.OutputRecordsSum != null) {
            this.OutputRecordsSum = new Long(source.OutputRecordsSum);
        }
        if (source.OutputBytesSum != null) {
            this.OutputBytesSum = new Long(source.OutputBytesSum);
        }
        if (source.ShuffleReadBytesSum != null) {
            this.ShuffleReadBytesSum = new Long(source.ShuffleReadBytesSum);
        }
        if (source.ShuffleReadRecordsSum != null) {
            this.ShuffleReadRecordsSum = new Long(source.ShuffleReadRecordsSum);
        }
        if (source.AnalysisStatus != null) {
            this.AnalysisStatus = new String(source.AnalysisStatus);
        }
        if (source.OutputFilesNum != null) {
            this.OutputFilesNum = new Long(source.OutputFilesNum);
        }
        if (source.OutputSmallFilesNum != null) {
            this.OutputSmallFilesNum = new Long(source.OutputSmallFilesNum);
        }
        if (source.ShuffleWriteBytesSum != null) {
            this.ShuffleWriteBytesSum = new Long(source.ShuffleWriteBytesSum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "InstanceStartTime", this.InstanceStartTime);
        this.setParamSimple(map, prefix + "InstanceCompleteTime", this.InstanceCompleteTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "SQL", this.SQL);
        this.setParamSimple(map, prefix + "DataEngineName", this.DataEngineName);
        this.setParamSimple(map, prefix + "JobTimeSum", this.JobTimeSum);
        this.setParamSimple(map, prefix + "TaskTimeSum", this.TaskTimeSum);
        this.setParamSimple(map, prefix + "InputRecordsSum", this.InputRecordsSum);
        this.setParamSimple(map, prefix + "InputBytesSum", this.InputBytesSum);
        this.setParamSimple(map, prefix + "OutputRecordsSum", this.OutputRecordsSum);
        this.setParamSimple(map, prefix + "OutputBytesSum", this.OutputBytesSum);
        this.setParamSimple(map, prefix + "ShuffleReadBytesSum", this.ShuffleReadBytesSum);
        this.setParamSimple(map, prefix + "ShuffleReadRecordsSum", this.ShuffleReadRecordsSum);
        this.setParamSimple(map, prefix + "AnalysisStatus", this.AnalysisStatus);
        this.setParamSimple(map, prefix + "OutputFilesNum", this.OutputFilesNum);
        this.setParamSimple(map, prefix + "OutputSmallFilesNum", this.OutputSmallFilesNum);
        this.setParamSimple(map, prefix + "ShuffleWriteBytesSum", this.ShuffleWriteBytesSum);

    }
}

