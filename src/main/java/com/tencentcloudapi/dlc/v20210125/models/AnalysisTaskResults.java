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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AnalysisTaskResults extends AbstractModel {

    /**
    * 任务Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 任务创建时间，毫秒时间戳
    */
    @SerializedName("InstanceStartTime")
    @Expose
    private Long InstanceStartTime;

    /**
    * 任务结束时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceCompleteTime")
    @Expose
    private Long InstanceCompleteTime;

    /**
    * 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 任务SQL语句
    */
    @SerializedName("SQL")
    @Expose
    private String SQL;

    /**
    * 计算资源名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataEngineName")
    @Expose
    private String DataEngineName;

    /**
    * 单位毫秒，引擎内执行耗时
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobTimeSum")
    @Expose
    private Long JobTimeSum;

    /**
    * 单位秒，CU资源消耗
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskTimeSum")
    @Expose
    private Long TaskTimeSum;

    /**
    * 数据扫描总行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputRecordsSum")
    @Expose
    private Long InputRecordsSum;

    /**
    * 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputBytesSum")
    @Expose
    private Long InputBytesSum;

    /**
    * 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputRecordsSum")
    @Expose
    private Long OutputRecordsSum;

    /**
    * 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputBytesSum")
    @Expose
    private Long OutputBytesSum;

    /**
    * shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShuffleReadBytesSum")
    @Expose
    private Long ShuffleReadBytesSum;

    /**
    * shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShuffleReadRecordsSum")
    @Expose
    private Long ShuffleReadRecordsSum;

    /**
    * 洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AnalysisStatus")
    @Expose
    private String AnalysisStatus;

    /**
     * Get 任务Id 
     * @return Id 任务Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 任务Id
     * @param Id 任务Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 任务创建时间，毫秒时间戳 
     * @return InstanceStartTime 任务创建时间，毫秒时间戳
     */
    public Long getInstanceStartTime() {
        return this.InstanceStartTime;
    }

    /**
     * Set 任务创建时间，毫秒时间戳
     * @param InstanceStartTime 任务创建时间，毫秒时间戳
     */
    public void setInstanceStartTime(Long InstanceStartTime) {
        this.InstanceStartTime = InstanceStartTime;
    }

    /**
     * Get 任务结束时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceCompleteTime 任务结束时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceCompleteTime() {
        return this.InstanceCompleteTime;
    }

    /**
     * Set 任务结束时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceCompleteTime 任务结束时间，毫秒时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceCompleteTime(Long InstanceCompleteTime) {
        this.InstanceCompleteTime = InstanceCompleteTime;
    }

    /**
     * Get 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。 
     * @return State 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。
     * @param State 任务状态：0 初始化， 1 执行中， 2 执行成功，3 数据写入中，4 排队中。-1 执行失败，-3 已取消。
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 任务SQL语句 
     * @return SQL 任务SQL语句
     */
    public String getSQL() {
        return this.SQL;
    }

    /**
     * Set 任务SQL语句
     * @param SQL 任务SQL语句
     */
    public void setSQL(String SQL) {
        this.SQL = SQL;
    }

    /**
     * Get 计算资源名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataEngineName 计算资源名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataEngineName() {
        return this.DataEngineName;
    }

    /**
     * Set 计算资源名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataEngineName 计算资源名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataEngineName(String DataEngineName) {
        this.DataEngineName = DataEngineName;
    }

    /**
     * Get 单位毫秒，引擎内执行耗时
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobTimeSum 单位毫秒，引擎内执行耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobTimeSum() {
        return this.JobTimeSum;
    }

    /**
     * Set 单位毫秒，引擎内执行耗时
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobTimeSum 单位毫秒，引擎内执行耗时
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobTimeSum(Long JobTimeSum) {
        this.JobTimeSum = JobTimeSum;
    }

    /**
     * Get 单位秒，CU资源消耗
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskTimeSum 单位秒，CU资源消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskTimeSum() {
        return this.TaskTimeSum;
    }

    /**
     * Set 单位秒，CU资源消耗
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskTimeSum 单位秒，CU资源消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskTimeSum(Long TaskTimeSum) {
        this.TaskTimeSum = TaskTimeSum;
    }

    /**
     * Get 数据扫描总行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputRecordsSum 数据扫描总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputRecordsSum() {
        return this.InputRecordsSum;
    }

    /**
     * Set 数据扫描总行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputRecordsSum 数据扫描总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputRecordsSum(Long InputRecordsSum) {
        this.InputRecordsSum = InputRecordsSum;
    }

    /**
     * Get 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputBytesSum 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputBytesSum() {
        return this.InputBytesSum;
    }

    /**
     * Set 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputBytesSum 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputBytesSum(Long InputBytesSum) {
        this.InputBytesSum = InputBytesSum;
    }

    /**
     * Get 输出总行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputRecordsSum 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputRecordsSum() {
        return this.OutputRecordsSum;
    }

    /**
     * Set 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputRecordsSum 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputRecordsSum(Long OutputRecordsSum) {
        this.OutputRecordsSum = OutputRecordsSum;
    }

    /**
     * Get 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputBytesSum 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputBytesSum() {
        return this.OutputBytesSum;
    }

    /**
     * Set 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputBytesSum 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputBytesSum(Long OutputBytesSum) {
        this.OutputBytesSum = OutputBytesSum;
    }

    /**
     * Get shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShuffleReadBytesSum shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShuffleReadBytesSum() {
        return this.ShuffleReadBytesSum;
    }

    /**
     * Set shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShuffleReadBytesSum shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShuffleReadBytesSum(Long ShuffleReadBytesSum) {
        this.ShuffleReadBytesSum = ShuffleReadBytesSum;
    }

    /**
     * Get shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShuffleReadRecordsSum shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShuffleReadRecordsSum() {
        return this.ShuffleReadRecordsSum;
    }

    /**
     * Set shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShuffleReadRecordsSum shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShuffleReadRecordsSum(Long ShuffleReadRecordsSum) {
        this.ShuffleReadRecordsSum = ShuffleReadRecordsSum;
    }

    /**
     * Get 洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AnalysisStatus 洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAnalysisStatus() {
        return this.AnalysisStatus;
    }

    /**
     * Set 洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）
注意：此字段可能返回 null，表示取不到有效值。
     * @param AnalysisStatus 洞察结果类型分类，一个 json 数组，有如下几种类型：SPARK-StageScheduleDelay（资源抢占）, SPARK-ShuffleFailure（Shuffle异常）, SPARK-SlowTask（慢task）, SPARK-DataSkew（数据倾斜）, SPARK-InsufficientResource（磁盘或内存不足）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAnalysisStatus(String AnalysisStatus) {
        this.AnalysisStatus = AnalysisStatus;
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

    }
}

