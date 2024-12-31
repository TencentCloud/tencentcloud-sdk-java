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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InsightResult extends AbstractModel {

    /**
    * 当Type为HIVE时，是Hive查询ID，当Type为MAPREDUCE，SPARK，TEZ时则是YarnAppID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 洞察应用的类型，HIVE,SPARK,MAPREDUCE,TEZ
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 洞察规则ID
HIVE-ScanManyMeta:元数据扫描过多
HIVE-ScanManyPartition:大表扫描
HIVE-SlowCompile:编译耗时过长
HIVE-UnSuitableConfig:不合理参数
MAPREDUCE-MapperDataSkew:Map数据倾斜
MAPREDUCE-MapperMemWaste:MapMemory资源浪费
MAPREDUCE-MapperSlowTask:Map慢Task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded:峰值内存超限
MAPREDUCE-ReducerDataSkew:Reduce数据倾斜
MAPREDUCE-ReducerMemWaste:ReduceMemory资源浪费
MAPREDUCE-ReducerSlowTask:Reduce慢Task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay:调度延迟
SPARK-CpuWaste:CPU资源浪费
SPARK-DataSkew:数据倾斜
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded:峰值内存超限
SPARK-MemWaste:Memory资源浪费
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew:调度倾斜
SPARK-SlowTask:慢Task
TEZ-DataSkew:数据倾斜
TEZ-MapperDataSkew:Map数据倾斜
TEZ-ReducerDataSkew:Reduce数据倾斜
TEZ-TezMemWaste:Memory资源浪费
TEZ-TezSlowTask:慢Task
TEZ-TezTaskGC:TasksGC
    */
    @SerializedName("RuleID")
    @Expose
    private String RuleID;

    /**
    * 洞察规则名字，可参考RuleID的说明
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 洞察规则解释
    */
    @SerializedName("RuleExplain")
    @Expose
    private String RuleExplain;

    /**
    * 详情
    */
    @SerializedName("Detail")
    @Expose
    private String Detail;

    /**
    * 建议信息
    */
    @SerializedName("Suggestion")
    @Expose
    private String Suggestion;

    /**
    * 洞察异常衡量值，同类型的洞察项越大越严重，不同类型的洞察项无对比意义
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
    * 调度任务执行ID
    */
    @SerializedName("ScheduleTaskExecID")
    @Expose
    private String ScheduleTaskExecID;

    /**
    * 调度流，DAG
    */
    @SerializedName("ScheduleFlowName")
    @Expose
    private String ScheduleFlowName;

    /**
    * 调度flow中的某个task节点
    */
    @SerializedName("ScheduleTaskName")
    @Expose
    private String ScheduleTaskName;

    /**
    * Yarn任务的部分核心配置
    */
    @SerializedName("JobConf")
    @Expose
    private String JobConf;

    /**
     * Get 当Type为HIVE时，是Hive查询ID，当Type为MAPREDUCE，SPARK，TEZ时则是YarnAppID 
     * @return ID 当Type为HIVE时，是Hive查询ID，当Type为MAPREDUCE，SPARK，TEZ时则是YarnAppID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 当Type为HIVE时，是Hive查询ID，当Type为MAPREDUCE，SPARK，TEZ时则是YarnAppID
     * @param ID 当Type为HIVE时，是Hive查询ID，当Type为MAPREDUCE，SPARK，TEZ时则是YarnAppID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 洞察应用的类型，HIVE,SPARK,MAPREDUCE,TEZ 
     * @return Type 洞察应用的类型，HIVE,SPARK,MAPREDUCE,TEZ
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 洞察应用的类型，HIVE,SPARK,MAPREDUCE,TEZ
     * @param Type 洞察应用的类型，HIVE,SPARK,MAPREDUCE,TEZ
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 洞察规则ID
HIVE-ScanManyMeta:元数据扫描过多
HIVE-ScanManyPartition:大表扫描
HIVE-SlowCompile:编译耗时过长
HIVE-UnSuitableConfig:不合理参数
MAPREDUCE-MapperDataSkew:Map数据倾斜
MAPREDUCE-MapperMemWaste:MapMemory资源浪费
MAPREDUCE-MapperSlowTask:Map慢Task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded:峰值内存超限
MAPREDUCE-ReducerDataSkew:Reduce数据倾斜
MAPREDUCE-ReducerMemWaste:ReduceMemory资源浪费
MAPREDUCE-ReducerSlowTask:Reduce慢Task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay:调度延迟
SPARK-CpuWaste:CPU资源浪费
SPARK-DataSkew:数据倾斜
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded:峰值内存超限
SPARK-MemWaste:Memory资源浪费
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew:调度倾斜
SPARK-SlowTask:慢Task
TEZ-DataSkew:数据倾斜
TEZ-MapperDataSkew:Map数据倾斜
TEZ-ReducerDataSkew:Reduce数据倾斜
TEZ-TezMemWaste:Memory资源浪费
TEZ-TezSlowTask:慢Task
TEZ-TezTaskGC:TasksGC 
     * @return RuleID 洞察规则ID
HIVE-ScanManyMeta:元数据扫描过多
HIVE-ScanManyPartition:大表扫描
HIVE-SlowCompile:编译耗时过长
HIVE-UnSuitableConfig:不合理参数
MAPREDUCE-MapperDataSkew:Map数据倾斜
MAPREDUCE-MapperMemWaste:MapMemory资源浪费
MAPREDUCE-MapperSlowTask:Map慢Task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded:峰值内存超限
MAPREDUCE-ReducerDataSkew:Reduce数据倾斜
MAPREDUCE-ReducerMemWaste:ReduceMemory资源浪费
MAPREDUCE-ReducerSlowTask:Reduce慢Task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay:调度延迟
SPARK-CpuWaste:CPU资源浪费
SPARK-DataSkew:数据倾斜
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded:峰值内存超限
SPARK-MemWaste:Memory资源浪费
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew:调度倾斜
SPARK-SlowTask:慢Task
TEZ-DataSkew:数据倾斜
TEZ-MapperDataSkew:Map数据倾斜
TEZ-ReducerDataSkew:Reduce数据倾斜
TEZ-TezMemWaste:Memory资源浪费
TEZ-TezSlowTask:慢Task
TEZ-TezTaskGC:TasksGC
     */
    public String getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 洞察规则ID
HIVE-ScanManyMeta:元数据扫描过多
HIVE-ScanManyPartition:大表扫描
HIVE-SlowCompile:编译耗时过长
HIVE-UnSuitableConfig:不合理参数
MAPREDUCE-MapperDataSkew:Map数据倾斜
MAPREDUCE-MapperMemWaste:MapMemory资源浪费
MAPREDUCE-MapperSlowTask:Map慢Task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded:峰值内存超限
MAPREDUCE-ReducerDataSkew:Reduce数据倾斜
MAPREDUCE-ReducerMemWaste:ReduceMemory资源浪费
MAPREDUCE-ReducerSlowTask:Reduce慢Task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay:调度延迟
SPARK-CpuWaste:CPU资源浪费
SPARK-DataSkew:数据倾斜
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded:峰值内存超限
SPARK-MemWaste:Memory资源浪费
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew:调度倾斜
SPARK-SlowTask:慢Task
TEZ-DataSkew:数据倾斜
TEZ-MapperDataSkew:Map数据倾斜
TEZ-ReducerDataSkew:Reduce数据倾斜
TEZ-TezMemWaste:Memory资源浪费
TEZ-TezSlowTask:慢Task
TEZ-TezTaskGC:TasksGC
     * @param RuleID 洞察规则ID
HIVE-ScanManyMeta:元数据扫描过多
HIVE-ScanManyPartition:大表扫描
HIVE-SlowCompile:编译耗时过长
HIVE-UnSuitableConfig:不合理参数
MAPREDUCE-MapperDataSkew:Map数据倾斜
MAPREDUCE-MapperMemWaste:MapMemory资源浪费
MAPREDUCE-MapperSlowTask:Map慢Task
MAPREDUCE-MapperTaskGC:MapperTaskGC
MAPREDUCE-MemExceeded:峰值内存超限
MAPREDUCE-ReducerDataSkew:Reduce数据倾斜
MAPREDUCE-ReducerMemWaste:ReduceMemory资源浪费
MAPREDUCE-ReducerSlowTask:Reduce慢Task
MAPREDUCE-ReducerTaskGC:ReducerTaskGC
MAPREDUCE-SchedulingDelay:调度延迟
SPARK-CpuWaste:CPU资源浪费
SPARK-DataSkew:数据倾斜
SPARK-ExecutorGC:ExecutorGC
SPARK-MemExceeded:峰值内存超限
SPARK-MemWaste:Memory资源浪费
SPARK-ScheduleOverhead:ScheduleOverhead
SPARK-ScheduleSkew:调度倾斜
SPARK-SlowTask:慢Task
TEZ-DataSkew:数据倾斜
TEZ-MapperDataSkew:Map数据倾斜
TEZ-ReducerDataSkew:Reduce数据倾斜
TEZ-TezMemWaste:Memory资源浪费
TEZ-TezSlowTask:慢Task
TEZ-TezTaskGC:TasksGC
     */
    public void setRuleID(String RuleID) {
        this.RuleID = RuleID;
    }

    /**
     * Get 洞察规则名字，可参考RuleID的说明 
     * @return RuleName 洞察规则名字，可参考RuleID的说明
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 洞察规则名字，可参考RuleID的说明
     * @param RuleName 洞察规则名字，可参考RuleID的说明
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 洞察规则解释 
     * @return RuleExplain 洞察规则解释
     */
    public String getRuleExplain() {
        return this.RuleExplain;
    }

    /**
     * Set 洞察规则解释
     * @param RuleExplain 洞察规则解释
     */
    public void setRuleExplain(String RuleExplain) {
        this.RuleExplain = RuleExplain;
    }

    /**
     * Get 详情 
     * @return Detail 详情
     */
    public String getDetail() {
        return this.Detail;
    }

    /**
     * Set 详情
     * @param Detail 详情
     */
    public void setDetail(String Detail) {
        this.Detail = Detail;
    }

    /**
     * Get 建议信息 
     * @return Suggestion 建议信息
     */
    public String getSuggestion() {
        return this.Suggestion;
    }

    /**
     * Set 建议信息
     * @param Suggestion 建议信息
     */
    public void setSuggestion(String Suggestion) {
        this.Suggestion = Suggestion;
    }

    /**
     * Get 洞察异常衡量值，同类型的洞察项越大越严重，不同类型的洞察项无对比意义 
     * @return Value 洞察异常衡量值，同类型的洞察项越大越严重，不同类型的洞察项无对比意义
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 洞察异常衡量值，同类型的洞察项越大越严重，不同类型的洞察项无对比意义
     * @param Value 洞察异常衡量值，同类型的洞察项越大越严重，不同类型的洞察项无对比意义
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    /**
     * Get 调度任务执行ID 
     * @return ScheduleTaskExecID 调度任务执行ID
     */
    public String getScheduleTaskExecID() {
        return this.ScheduleTaskExecID;
    }

    /**
     * Set 调度任务执行ID
     * @param ScheduleTaskExecID 调度任务执行ID
     */
    public void setScheduleTaskExecID(String ScheduleTaskExecID) {
        this.ScheduleTaskExecID = ScheduleTaskExecID;
    }

    /**
     * Get 调度流，DAG 
     * @return ScheduleFlowName 调度流，DAG
     */
    public String getScheduleFlowName() {
        return this.ScheduleFlowName;
    }

    /**
     * Set 调度流，DAG
     * @param ScheduleFlowName 调度流，DAG
     */
    public void setScheduleFlowName(String ScheduleFlowName) {
        this.ScheduleFlowName = ScheduleFlowName;
    }

    /**
     * Get 调度flow中的某个task节点 
     * @return ScheduleTaskName 调度flow中的某个task节点
     */
    public String getScheduleTaskName() {
        return this.ScheduleTaskName;
    }

    /**
     * Set 调度flow中的某个task节点
     * @param ScheduleTaskName 调度flow中的某个task节点
     */
    public void setScheduleTaskName(String ScheduleTaskName) {
        this.ScheduleTaskName = ScheduleTaskName;
    }

    /**
     * Get Yarn任务的部分核心配置 
     * @return JobConf Yarn任务的部分核心配置
     */
    public String getJobConf() {
        return this.JobConf;
    }

    /**
     * Set Yarn任务的部分核心配置
     * @param JobConf Yarn任务的部分核心配置
     */
    public void setJobConf(String JobConf) {
        this.JobConf = JobConf;
    }

    public InsightResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InsightResult(InsightResult source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.RuleID != null) {
            this.RuleID = new String(source.RuleID);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.RuleExplain != null) {
            this.RuleExplain = new String(source.RuleExplain);
        }
        if (source.Detail != null) {
            this.Detail = new String(source.Detail);
        }
        if (source.Suggestion != null) {
            this.Suggestion = new String(source.Suggestion);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
        if (source.ScheduleTaskExecID != null) {
            this.ScheduleTaskExecID = new String(source.ScheduleTaskExecID);
        }
        if (source.ScheduleFlowName != null) {
            this.ScheduleFlowName = new String(source.ScheduleFlowName);
        }
        if (source.ScheduleTaskName != null) {
            this.ScheduleTaskName = new String(source.ScheduleTaskName);
        }
        if (source.JobConf != null) {
            this.JobConf = new String(source.JobConf);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "RuleExplain", this.RuleExplain);
        this.setParamSimple(map, prefix + "Detail", this.Detail);
        this.setParamSimple(map, prefix + "Suggestion", this.Suggestion);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ScheduleTaskExecID", this.ScheduleTaskExecID);
        this.setParamSimple(map, prefix + "ScheduleFlowName", this.ScheduleFlowName);
        this.setParamSimple(map, prefix + "ScheduleTaskName", this.ScheduleTaskName);
        this.setParamSimple(map, prefix + "JobConf", this.JobConf);

    }
}

