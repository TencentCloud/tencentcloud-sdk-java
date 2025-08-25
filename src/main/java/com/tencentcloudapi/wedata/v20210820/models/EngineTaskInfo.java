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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EngineTaskInfo extends AbstractModel {

    /**
    * 引擎提交时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineSubmitTime")
    @Expose
    private String EngineSubmitTime;

    /**
    * 引擎执行时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeTime")
    @Expose
    private String EngineExeTime;

    /**
    * 引擎执行总时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeTimes")
    @Expose
    private Long EngineExeTimes;

    /**
    * cu消耗
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CuConsume")
    @Expose
    private Long CuConsume;

    /**
    * 资源消耗
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceUsage")
    @Expose
    private Long ResourceUsage;

    /**
    * 引擎名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineName")
    @Expose
    private String EngineName;

    /**
    * 引擎执行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EngineExeStatus")
    @Expose
    private String EngineExeStatus;

    /**
    * 任务种类
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskKind")
    @Expose
    private String TaskKind;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 任务SQL语句
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskContent")
    @Expose
    private String TaskContent;

    /**
    * 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InputBytesSum")
    @Expose
    private Long InputBytesSum;

    /**
    * shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShuffleReadBytesSum")
    @Expose
    private Long ShuffleReadBytesSum;

    /**
    * shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShuffleReadRecordsSum")
    @Expose
    private Long ShuffleReadRecordsSum;

    /**
    * 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputRecordsSum")
    @Expose
    private Long OutputRecordsSum;

    /**
    * 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputBytesSum")
    @Expose
    private Long OutputBytesSum;

    /**
    * 输出文件数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputFilesNum")
    @Expose
    private Long OutputFilesNum;

    /**
    * 输出小文件数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OutputSmallFilesNum")
    @Expose
    private Long OutputSmallFilesNum;

    /**
    * 执行等待时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WaitTime")
    @Expose
    private Long WaitTime;

    /**
    * 查询结果时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryResultTime")
    @Expose
    private Long QueryResultTime;

    /**
    * 入参
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CmdArgs")
    @Expose
    private String CmdArgs;

    /**
    * 使用虚拟核心秒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VCoreSeconds")
    @Expose
    private Long VCoreSeconds;

    /**
    * 使用的内存秒数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MemorySeconds")
    @Expose
    private Long MemorySeconds;

    /**
    * EMR用户名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EmrUserName")
    @Expose
    private String EmrUserName;

    /**
    * 任务的查询ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryId")
    @Expose
    private String QueryId;

    /**
    * 应用程序ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
     * Get 引擎提交时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineSubmitTime 引擎提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineSubmitTime() {
        return this.EngineSubmitTime;
    }

    /**
     * Set 引擎提交时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineSubmitTime 引擎提交时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineSubmitTime(String EngineSubmitTime) {
        this.EngineSubmitTime = EngineSubmitTime;
    }

    /**
     * Get 引擎执行时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeTime 引擎执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExeTime() {
        return this.EngineExeTime;
    }

    /**
     * Set 引擎执行时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeTime 引擎执行时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeTime(String EngineExeTime) {
        this.EngineExeTime = EngineExeTime;
    }

    /**
     * Get 引擎执行总时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeTimes 引擎执行总时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getEngineExeTimes() {
        return this.EngineExeTimes;
    }

    /**
     * Set 引擎执行总时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeTimes 引擎执行总时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeTimes(Long EngineExeTimes) {
        this.EngineExeTimes = EngineExeTimes;
    }

    /**
     * Get cu消耗
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CuConsume cu消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCuConsume() {
        return this.CuConsume;
    }

    /**
     * Set cu消耗
注意：此字段可能返回 null，表示取不到有效值。
     * @param CuConsume cu消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCuConsume(Long CuConsume) {
        this.CuConsume = CuConsume;
    }

    /**
     * Get 资源消耗
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceUsage 资源消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getResourceUsage() {
        return this.ResourceUsage;
    }

    /**
     * Set 资源消耗
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceUsage 资源消耗
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceUsage(Long ResourceUsage) {
        this.ResourceUsage = ResourceUsage;
    }

    /**
     * Get 引擎名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineName 引擎名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineName() {
        return this.EngineName;
    }

    /**
     * Set 引擎名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineName 引擎名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineName(String EngineName) {
        this.EngineName = EngineName;
    }

    /**
     * Get 引擎执行状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EngineExeStatus 引擎执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEngineExeStatus() {
        return this.EngineExeStatus;
    }

    /**
     * Set 引擎执行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param EngineExeStatus 引擎执行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEngineExeStatus(String EngineExeStatus) {
        this.EngineExeStatus = EngineExeStatus;
    }

    /**
     * Get 任务种类
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskKind 任务种类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskKind() {
        return this.TaskKind;
    }

    /**
     * Set 任务种类
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskKind 任务种类
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskKind(String TaskKind) {
        this.TaskKind = TaskKind;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 任务SQL语句
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskContent 任务SQL语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskContent() {
        return this.TaskContent;
    }

    /**
     * Set 任务SQL语句
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskContent 任务SQL语句
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskContent(String TaskContent) {
        this.TaskContent = TaskContent;
    }

    /**
     * Get 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InputBytesSum 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInputBytesSum() {
        return this.InputBytesSum;
    }

    /**
     * Set 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InputBytesSum 数据扫描总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInputBytesSum(Long InputBytesSum) {
        this.InputBytesSum = InputBytesSum;
    }

    /**
     * Get shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShuffleReadBytesSum shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShuffleReadBytesSum() {
        return this.ShuffleReadBytesSum;
    }

    /**
     * Set shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShuffleReadBytesSum shuffle read 总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShuffleReadBytesSum(Long ShuffleReadBytesSum) {
        this.ShuffleReadBytesSum = ShuffleReadBytesSum;
    }

    /**
     * Get shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShuffleReadRecordsSum shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getShuffleReadRecordsSum() {
        return this.ShuffleReadRecordsSum;
    }

    /**
     * Set shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShuffleReadRecordsSum shuffle read 总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShuffleReadRecordsSum(Long ShuffleReadRecordsSum) {
        this.ShuffleReadRecordsSum = ShuffleReadRecordsSum;
    }

    /**
     * Get 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputRecordsSum 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputRecordsSum() {
        return this.OutputRecordsSum;
    }

    /**
     * Set 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputRecordsSum 输出总行数
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputRecordsSum(Long OutputRecordsSum) {
        this.OutputRecordsSum = OutputRecordsSum;
    }

    /**
     * Get 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputBytesSum 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputBytesSum() {
        return this.OutputBytesSum;
    }

    /**
     * Set 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputBytesSum 输出总 bytes
注意：此字段可能返回 null，表示取不到有效值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputBytesSum(Long OutputBytesSum) {
        this.OutputBytesSum = OutputBytesSum;
    }

    /**
     * Get 输出文件数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputFilesNum 输出文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputFilesNum() {
        return this.OutputFilesNum;
    }

    /**
     * Set 输出文件数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputFilesNum 输出文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputFilesNum(Long OutputFilesNum) {
        this.OutputFilesNum = OutputFilesNum;
    }

    /**
     * Get 输出小文件数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OutputSmallFilesNum 输出小文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOutputSmallFilesNum() {
        return this.OutputSmallFilesNum;
    }

    /**
     * Set 输出小文件数
注意：此字段可能返回 null，表示取不到有效值。
     * @param OutputSmallFilesNum 输出小文件数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutputSmallFilesNum(Long OutputSmallFilesNum) {
        this.OutputSmallFilesNum = OutputSmallFilesNum;
    }

    /**
     * Get 执行等待时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WaitTime 执行等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWaitTime() {
        return this.WaitTime;
    }

    /**
     * Set 执行等待时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param WaitTime 执行等待时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaitTime(Long WaitTime) {
        this.WaitTime = WaitTime;
    }

    /**
     * Get 查询结果时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryResultTime 查询结果时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getQueryResultTime() {
        return this.QueryResultTime;
    }

    /**
     * Set 查询结果时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryResultTime 查询结果时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryResultTime(Long QueryResultTime) {
        this.QueryResultTime = QueryResultTime;
    }

    /**
     * Get 入参
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CmdArgs 入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCmdArgs() {
        return this.CmdArgs;
    }

    /**
     * Set 入参
注意：此字段可能返回 null，表示取不到有效值。
     * @param CmdArgs 入参
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCmdArgs(String CmdArgs) {
        this.CmdArgs = CmdArgs;
    }

    /**
     * Get 使用虚拟核心秒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VCoreSeconds 使用虚拟核心秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVCoreSeconds() {
        return this.VCoreSeconds;
    }

    /**
     * Set 使用虚拟核心秒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param VCoreSeconds 使用虚拟核心秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVCoreSeconds(Long VCoreSeconds) {
        this.VCoreSeconds = VCoreSeconds;
    }

    /**
     * Get 使用的内存秒数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MemorySeconds 使用的内存秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMemorySeconds() {
        return this.MemorySeconds;
    }

    /**
     * Set 使用的内存秒数
注意：此字段可能返回 null，表示取不到有效值。
     * @param MemorySeconds 使用的内存秒数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMemorySeconds(Long MemorySeconds) {
        this.MemorySeconds = MemorySeconds;
    }

    /**
     * Get EMR用户名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EmrUserName EMR用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEmrUserName() {
        return this.EmrUserName;
    }

    /**
     * Set EMR用户名
注意：此字段可能返回 null，表示取不到有效值。
     * @param EmrUserName EMR用户名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEmrUserName(String EmrUserName) {
        this.EmrUserName = EmrUserName;
    }

    /**
     * Get 任务的查询ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryId 任务的查询ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQueryId() {
        return this.QueryId;
    }

    /**
     * Set 任务的查询ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryId 任务的查询ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryId(String QueryId) {
        this.QueryId = QueryId;
    }

    /**
     * Get 应用程序ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用程序ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用程序ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用程序ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    public EngineTaskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EngineTaskInfo(EngineTaskInfo source) {
        if (source.EngineSubmitTime != null) {
            this.EngineSubmitTime = new String(source.EngineSubmitTime);
        }
        if (source.EngineExeTime != null) {
            this.EngineExeTime = new String(source.EngineExeTime);
        }
        if (source.EngineExeTimes != null) {
            this.EngineExeTimes = new Long(source.EngineExeTimes);
        }
        if (source.CuConsume != null) {
            this.CuConsume = new Long(source.CuConsume);
        }
        if (source.ResourceUsage != null) {
            this.ResourceUsage = new Long(source.ResourceUsage);
        }
        if (source.EngineName != null) {
            this.EngineName = new String(source.EngineName);
        }
        if (source.EngineExeStatus != null) {
            this.EngineExeStatus = new String(source.EngineExeStatus);
        }
        if (source.TaskKind != null) {
            this.TaskKind = new String(source.TaskKind);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.TaskContent != null) {
            this.TaskContent = new String(source.TaskContent);
        }
        if (source.InputBytesSum != null) {
            this.InputBytesSum = new Long(source.InputBytesSum);
        }
        if (source.ShuffleReadBytesSum != null) {
            this.ShuffleReadBytesSum = new Long(source.ShuffleReadBytesSum);
        }
        if (source.ShuffleReadRecordsSum != null) {
            this.ShuffleReadRecordsSum = new Long(source.ShuffleReadRecordsSum);
        }
        if (source.OutputRecordsSum != null) {
            this.OutputRecordsSum = new Long(source.OutputRecordsSum);
        }
        if (source.OutputBytesSum != null) {
            this.OutputBytesSum = new Long(source.OutputBytesSum);
        }
        if (source.OutputFilesNum != null) {
            this.OutputFilesNum = new Long(source.OutputFilesNum);
        }
        if (source.OutputSmallFilesNum != null) {
            this.OutputSmallFilesNum = new Long(source.OutputSmallFilesNum);
        }
        if (source.WaitTime != null) {
            this.WaitTime = new Long(source.WaitTime);
        }
        if (source.QueryResultTime != null) {
            this.QueryResultTime = new Long(source.QueryResultTime);
        }
        if (source.CmdArgs != null) {
            this.CmdArgs = new String(source.CmdArgs);
        }
        if (source.VCoreSeconds != null) {
            this.VCoreSeconds = new Long(source.VCoreSeconds);
        }
        if (source.MemorySeconds != null) {
            this.MemorySeconds = new Long(source.MemorySeconds);
        }
        if (source.EmrUserName != null) {
            this.EmrUserName = new String(source.EmrUserName);
        }
        if (source.QueryId != null) {
            this.QueryId = new String(source.QueryId);
        }
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EngineSubmitTime", this.EngineSubmitTime);
        this.setParamSimple(map, prefix + "EngineExeTime", this.EngineExeTime);
        this.setParamSimple(map, prefix + "EngineExeTimes", this.EngineExeTimes);
        this.setParamSimple(map, prefix + "CuConsume", this.CuConsume);
        this.setParamSimple(map, prefix + "ResourceUsage", this.ResourceUsage);
        this.setParamSimple(map, prefix + "EngineName", this.EngineName);
        this.setParamSimple(map, prefix + "EngineExeStatus", this.EngineExeStatus);
        this.setParamSimple(map, prefix + "TaskKind", this.TaskKind);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "TaskContent", this.TaskContent);
        this.setParamSimple(map, prefix + "InputBytesSum", this.InputBytesSum);
        this.setParamSimple(map, prefix + "ShuffleReadBytesSum", this.ShuffleReadBytesSum);
        this.setParamSimple(map, prefix + "ShuffleReadRecordsSum", this.ShuffleReadRecordsSum);
        this.setParamSimple(map, prefix + "OutputRecordsSum", this.OutputRecordsSum);
        this.setParamSimple(map, prefix + "OutputBytesSum", this.OutputBytesSum);
        this.setParamSimple(map, prefix + "OutputFilesNum", this.OutputFilesNum);
        this.setParamSimple(map, prefix + "OutputSmallFilesNum", this.OutputSmallFilesNum);
        this.setParamSimple(map, prefix + "WaitTime", this.WaitTime);
        this.setParamSimple(map, prefix + "QueryResultTime", this.QueryResultTime);
        this.setParamSimple(map, prefix + "CmdArgs", this.CmdArgs);
        this.setParamSimple(map, prefix + "VCoreSeconds", this.VCoreSeconds);
        this.setParamSimple(map, prefix + "MemorySeconds", this.MemorySeconds);
        this.setParamSimple(map, prefix + "EmrUserName", this.EmrUserName);
        this.setParamSimple(map, prefix + "QueryId", this.QueryId);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);

    }
}

