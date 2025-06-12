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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeRunDetail extends AbstractModel {

    /**
    * 节点运行的ID
    */
    @SerializedName("NodeRunId")
    @Expose
    private String NodeRunId;

    /**
    * 节点ID
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 工作流运行实例的ID
    */
    @SerializedName("WorkflowRunId")
    @Expose
    private String WorkflowRunId;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点类型。
1： 开始节点
2：参数提取节点
3：大模型节点
4：知识问答节点
5：知识检索节点
6：标签提取节点
7：代码执行节点
8：工具节点
9：逻辑判断节点
10：回复节点
11：选项卡节点
12：循环节点
13：意图识别节点
14：工作流节点
15：插件节点
16：结束节点
17: 变量聚合节点数据
18: 批处理节点
19: 消息队列节点
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 错误码
    */
    @SerializedName("FailCode")
    @Expose
    private String FailCode;

    /**
    * 错误信息
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * 消耗时间（毫秒）
    */
    @SerializedName("CostMilliseconds")
    @Expose
    private Long CostMilliseconds;

    /**
    * 消耗的token总数
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * 输入变量信息
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * 节点的输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值）
    */
    @SerializedName("InputRef")
    @Expose
    private String InputRef;

    /**
    * 输出变量信息
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * 节点的输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值）
    */
    @SerializedName("OutputRef")
    @Expose
    private String OutputRef;

    /**
    * 原始输出信息。部分节点才有值，如工具节点、代码节点
    */
    @SerializedName("TaskOutput")
    @Expose
    private String TaskOutput;

    /**
    * 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值）
    */
    @SerializedName("TaskOutputRef")
    @Expose
    private String TaskOutputRef;

    /**
    * 节点的日志
    */
    @SerializedName("Log")
    @Expose
    private String Log;

    /**
    * 节点的日志的完整内容的链接志（当Log内容超过限制的时候才有值）
    */
    @SerializedName("LogRef")
    @Expose
    private String LogRef;

    /**
    * 开始时间戳（毫秒）
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间戳（毫秒）
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * LLM统计信息。
    */
    @SerializedName("StatisticInfos")
    @Expose
    private StatisticInfo [] StatisticInfos;

    /**
     * Get 节点运行的ID 
     * @return NodeRunId 节点运行的ID
     */
    public String getNodeRunId() {
        return this.NodeRunId;
    }

    /**
     * Set 节点运行的ID
     * @param NodeRunId 节点运行的ID
     */
    public void setNodeRunId(String NodeRunId) {
        this.NodeRunId = NodeRunId;
    }

    /**
     * Get 节点ID 
     * @return NodeId 节点ID
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点ID
     * @param NodeId 节点ID
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get 工作流运行实例的ID 
     * @return WorkflowRunId 工作流运行实例的ID
     */
    public String getWorkflowRunId() {
        return this.WorkflowRunId;
    }

    /**
     * Set 工作流运行实例的ID
     * @param WorkflowRunId 工作流运行实例的ID
     */
    public void setWorkflowRunId(String WorkflowRunId) {
        this.WorkflowRunId = WorkflowRunId;
    }

    /**
     * Get 节点名称 
     * @return NodeName 节点名称
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set 节点名称
     * @param NodeName 节点名称
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get 节点类型。
1： 开始节点
2：参数提取节点
3：大模型节点
4：知识问答节点
5：知识检索节点
6：标签提取节点
7：代码执行节点
8：工具节点
9：逻辑判断节点
10：回复节点
11：选项卡节点
12：循环节点
13：意图识别节点
14：工作流节点
15：插件节点
16：结束节点
17: 变量聚合节点数据
18: 批处理节点
19: 消息队列节点 
     * @return NodeType 节点类型。
1： 开始节点
2：参数提取节点
3：大模型节点
4：知识问答节点
5：知识检索节点
6：标签提取节点
7：代码执行节点
8：工具节点
9：逻辑判断节点
10：回复节点
11：选项卡节点
12：循环节点
13：意图识别节点
14：工作流节点
15：插件节点
16：结束节点
17: 变量聚合节点数据
18: 批处理节点
19: 消息队列节点
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型。
1： 开始节点
2：参数提取节点
3：大模型节点
4：知识问答节点
5：知识检索节点
6：标签提取节点
7：代码执行节点
8：工具节点
9：逻辑判断节点
10：回复节点
11：选项卡节点
12：循环节点
13：意图识别节点
14：工作流节点
15：插件节点
16：结束节点
17: 变量聚合节点数据
18: 批处理节点
19: 消息队列节点
     * @param NodeType 节点类型。
1： 开始节点
2：参数提取节点
3：大模型节点
4：知识问答节点
5：知识检索节点
6：标签提取节点
7：代码执行节点
8：工具节点
9：逻辑判断节点
10：回复节点
11：选项卡节点
12：循环节点
13：意图识别节点
14：工作流节点
15：插件节点
16：结束节点
17: 变量聚合节点数据
18: 批处理节点
19: 消息队列节点
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消 
     * @return State 运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消
     * @param State 运行状态。0: 初始状态；1: 运行中；2: 运行成功； 3: 运行失败； 4: 已取消
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 错误码 
     * @return FailCode 错误码
     */
    public String getFailCode() {
        return this.FailCode;
    }

    /**
     * Set 错误码
     * @param FailCode 错误码
     */
    public void setFailCode(String FailCode) {
        this.FailCode = FailCode;
    }

    /**
     * Get 错误信息 
     * @return FailMessage 错误信息
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set 错误信息
     * @param FailMessage 错误信息
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get 消耗时间（毫秒） 
     * @return CostMilliseconds 消耗时间（毫秒）
     */
    public Long getCostMilliseconds() {
        return this.CostMilliseconds;
    }

    /**
     * Set 消耗时间（毫秒）
     * @param CostMilliseconds 消耗时间（毫秒）
     */
    public void setCostMilliseconds(Long CostMilliseconds) {
        this.CostMilliseconds = CostMilliseconds;
    }

    /**
     * Get 消耗的token总数 
     * @return TotalTokens 消耗的token总数
     */
    public Long getTotalTokens() {
        return this.TotalTokens;
    }

    /**
     * Set 消耗的token总数
     * @param TotalTokens 消耗的token总数
     */
    public void setTotalTokens(Long TotalTokens) {
        this.TotalTokens = TotalTokens;
    }

    /**
     * Get 输入变量信息 
     * @return Input 输入变量信息
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set 输入变量信息
     * @param Input 输入变量信息
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get 节点的输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值） 
     * @return InputRef 节点的输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值）
     */
    public String getInputRef() {
        return this.InputRef;
    }

    /**
     * Set 节点的输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值）
     * @param InputRef 节点的输入的完整内容的链接。（当Input内容超过限制的时候此字段才有值）
     */
    public void setInputRef(String InputRef) {
        this.InputRef = InputRef;
    }

    /**
     * Get 输出变量信息 
     * @return Output 输出变量信息
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set 输出变量信息
     * @param Output 输出变量信息
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get 节点的输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值） 
     * @return OutputRef 节点的输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值）
     */
    public String getOutputRef() {
        return this.OutputRef;
    }

    /**
     * Set 节点的输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值）
     * @param OutputRef 节点的输出的完整内容的链接。（当Output内容超过限制的时候此字段才有值）
     */
    public void setOutputRef(String OutputRef) {
        this.OutputRef = OutputRef;
    }

    /**
     * Get 原始输出信息。部分节点才有值，如工具节点、代码节点 
     * @return TaskOutput 原始输出信息。部分节点才有值，如工具节点、代码节点
     */
    public String getTaskOutput() {
        return this.TaskOutput;
    }

    /**
     * Set 原始输出信息。部分节点才有值，如工具节点、代码节点
     * @param TaskOutput 原始输出信息。部分节点才有值，如工具节点、代码节点
     */
    public void setTaskOutput(String TaskOutput) {
        this.TaskOutput = TaskOutput;
    }

    /**
     * Get 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值） 
     * @return TaskOutputRef 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值）
     */
    public String getTaskOutputRef() {
        return this.TaskOutputRef;
    }

    /**
     * Set 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值）
     * @param TaskOutputRef 任务的原始输出的完整内容的链接。（当TaskOutput内容超过限制的时候此字段才有值）
     */
    public void setTaskOutputRef(String TaskOutputRef) {
        this.TaskOutputRef = TaskOutputRef;
    }

    /**
     * Get 节点的日志 
     * @return Log 节点的日志
     */
    public String getLog() {
        return this.Log;
    }

    /**
     * Set 节点的日志
     * @param Log 节点的日志
     */
    public void setLog(String Log) {
        this.Log = Log;
    }

    /**
     * Get 节点的日志的完整内容的链接志（当Log内容超过限制的时候才有值） 
     * @return LogRef 节点的日志的完整内容的链接志（当Log内容超过限制的时候才有值）
     */
    public String getLogRef() {
        return this.LogRef;
    }

    /**
     * Set 节点的日志的完整内容的链接志（当Log内容超过限制的时候才有值）
     * @param LogRef 节点的日志的完整内容的链接志（当Log内容超过限制的时候才有值）
     */
    public void setLogRef(String LogRef) {
        this.LogRef = LogRef;
    }

    /**
     * Get 开始时间戳（毫秒） 
     * @return StartTime 开始时间戳（毫秒）
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间戳（毫秒）
     * @param StartTime 开始时间戳（毫秒）
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间戳（毫秒） 
     * @return EndTime 结束时间戳（毫秒）
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间戳（毫秒）
     * @param EndTime 结束时间戳（毫秒）
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get LLM统计信息。 
     * @return StatisticInfos LLM统计信息。
     */
    public StatisticInfo [] getStatisticInfos() {
        return this.StatisticInfos;
    }

    /**
     * Set LLM统计信息。
     * @param StatisticInfos LLM统计信息。
     */
    public void setStatisticInfos(StatisticInfo [] StatisticInfos) {
        this.StatisticInfos = StatisticInfos;
    }

    public NodeRunDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRunDetail(NodeRunDetail source) {
        if (source.NodeRunId != null) {
            this.NodeRunId = new String(source.NodeRunId);
        }
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.WorkflowRunId != null) {
            this.WorkflowRunId = new String(source.WorkflowRunId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.FailCode != null) {
            this.FailCode = new String(source.FailCode);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.CostMilliseconds != null) {
            this.CostMilliseconds = new Long(source.CostMilliseconds);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.InputRef != null) {
            this.InputRef = new String(source.InputRef);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.OutputRef != null) {
            this.OutputRef = new String(source.OutputRef);
        }
        if (source.TaskOutput != null) {
            this.TaskOutput = new String(source.TaskOutput);
        }
        if (source.TaskOutputRef != null) {
            this.TaskOutputRef = new String(source.TaskOutputRef);
        }
        if (source.Log != null) {
            this.Log = new String(source.Log);
        }
        if (source.LogRef != null) {
            this.LogRef = new String(source.LogRef);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.StatisticInfos != null) {
            this.StatisticInfos = new StatisticInfo[source.StatisticInfos.length];
            for (int i = 0; i < source.StatisticInfos.length; i++) {
                this.StatisticInfos[i] = new StatisticInfo(source.StatisticInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeRunId", this.NodeRunId);
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "WorkflowRunId", this.WorkflowRunId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "CostMilliseconds", this.CostMilliseconds);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "InputRef", this.InputRef);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "OutputRef", this.OutputRef);
        this.setParamSimple(map, prefix + "TaskOutput", this.TaskOutput);
        this.setParamSimple(map, prefix + "TaskOutputRef", this.TaskOutputRef);
        this.setParamSimple(map, prefix + "Log", this.Log);
        this.setParamSimple(map, prefix + "LogRef", this.LogRef);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArrayObj(map, prefix + "StatisticInfos.", this.StatisticInfos);

    }
}

