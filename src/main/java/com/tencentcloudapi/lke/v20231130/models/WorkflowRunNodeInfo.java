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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WorkflowRunNodeInfo extends AbstractModel {

    /**
    * <p>节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * <p>节点类型</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 开始节点</li><li>2： 参数提取节点</li><li>3： 大模型节点</li><li>4： 知识问答节点</li><li>5： 知识检索节点</li><li>6： 标签提取节点</li><li>7： 代码执行节点</li><li>8： 工具节点</li><li>9： 逻辑判断节点</li><li>10： 消息节点</li><li>11： 选项卡节点</li><li>12： 循环节点</li><li>13： 意图识别节点</li><li>14： 工作流节点</li><li>15： 插件节点</li><li>16： 结束节点</li><li>17： 变量聚合节点</li><li>18： 批处理节点</li><li>19： 消息队列节点</li><li>20： 数据库节点</li><li>21： 变量赋值节点</li><li>22： 变量转换节点</li><li>23： Agent节点</li><li>24： 注释节点</li><li>25： 文件收集节点</li><li>26： 文本收集节点</li><li>27： Widget 节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * <p>状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>输入</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Input")
    @Expose
    private String Input;

    /**
    * <p>输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Output")
    @Expose
    private String Output;

    /**
    * <p>任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskOutput")
    @Expose
    private String TaskOutput;

    /**
    * <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * <p>花费时长，单位为毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CostMilliSeconds")
    @Expose
    private Long CostMilliSeconds;

    /**
    * <p>大模型输出信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticInfos")
    @Expose
    private StatisticInfo [] StatisticInfos;

    /**
    * <p>错误代码</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailCode")
    @Expose
    private String FailCode;

    /**
     * Get <p>节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeId <p>节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set <p>节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeId <p>节点ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
    }

    /**
     * Get <p>节点类型</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 开始节点</li><li>2： 参数提取节点</li><li>3： 大模型节点</li><li>4： 知识问答节点</li><li>5： 知识检索节点</li><li>6： 标签提取节点</li><li>7： 代码执行节点</li><li>8： 工具节点</li><li>9： 逻辑判断节点</li><li>10： 消息节点</li><li>11： 选项卡节点</li><li>12： 循环节点</li><li>13： 意图识别节点</li><li>14： 工作流节点</li><li>15： 插件节点</li><li>16： 结束节点</li><li>17： 变量聚合节点</li><li>18： 批处理节点</li><li>19： 消息队列节点</li><li>20： 数据库节点</li><li>21： 变量赋值节点</li><li>22： 变量转换节点</li><li>23： Agent节点</li><li>24： 注释节点</li><li>25： 文件收集节点</li><li>26： 文本收集节点</li><li>27： Widget 节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeType <p>节点类型</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 开始节点</li><li>2： 参数提取节点</li><li>3： 大模型节点</li><li>4： 知识问答节点</li><li>5： 知识检索节点</li><li>6： 标签提取节点</li><li>7： 代码执行节点</li><li>8： 工具节点</li><li>9： 逻辑判断节点</li><li>10： 消息节点</li><li>11： 选项卡节点</li><li>12： 循环节点</li><li>13： 意图识别节点</li><li>14： 工作流节点</li><li>15： 插件节点</li><li>16： 结束节点</li><li>17： 变量聚合节点</li><li>18： 批处理节点</li><li>19： 消息队列节点</li><li>20： 数据库节点</li><li>21： 变量赋值节点</li><li>22： 变量转换节点</li><li>23： Agent节点</li><li>24： 注释节点</li><li>25： 文件收集节点</li><li>26： 文本收集节点</li><li>27： Widget 节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set <p>节点类型</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 开始节点</li><li>2： 参数提取节点</li><li>3： 大模型节点</li><li>4： 知识问答节点</li><li>5： 知识检索节点</li><li>6： 标签提取节点</li><li>7： 代码执行节点</li><li>8： 工具节点</li><li>9： 逻辑判断节点</li><li>10： 消息节点</li><li>11： 选项卡节点</li><li>12： 循环节点</li><li>13： 意图识别节点</li><li>14： 工作流节点</li><li>15： 插件节点</li><li>16： 结束节点</li><li>17： 变量聚合节点</li><li>18： 批处理节点</li><li>19： 消息队列节点</li><li>20： 数据库节点</li><li>21： 变量赋值节点</li><li>22： 变量转换节点</li><li>23： Agent节点</li><li>24： 注释节点</li><li>25： 文件收集节点</li><li>26： 文本收集节点</li><li>27： Widget 节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeType <p>节点类型</p><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 开始节点</li><li>2： 参数提取节点</li><li>3： 大模型节点</li><li>4： 知识问答节点</li><li>5： 知识检索节点</li><li>6： 标签提取节点</li><li>7： 代码执行节点</li><li>8： 工具节点</li><li>9： 逻辑判断节点</li><li>10： 消息节点</li><li>11： 选项卡节点</li><li>12： 循环节点</li><li>13： 意图识别节点</li><li>14： 工作流节点</li><li>15： 插件节点</li><li>16： 结束节点</li><li>17： 变量聚合节点</li><li>18： 批处理节点</li><li>19： 消息队列节点</li><li>20： 数据库节点</li><li>21： 变量赋值节点</li><li>22： 变量转换节点</li><li>23： Agent节点</li><li>24： 注释节点</li><li>25： 文件收集节点</li><li>26： 文本收集节点</li><li>27： Widget 节点</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeName <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNodeName() {
        return this.NodeName;
    }

    /**
     * Set <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeName <p>节点名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeName(String NodeName) {
        this.NodeName = NodeName;
    }

    /**
     * Get <p>状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态</p><p>枚举值：</p><ul><li>0： 初始状态</li><li>1： 运行中</li><li>2： 运行成功</li><li>3： 运行失败</li></ul>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>输入</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Input <p>输入</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInput() {
        return this.Input;
    }

    /**
     * Set <p>输入</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Input <p>输入</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInput(String Input) {
        this.Input = Input;
    }

    /**
     * Get <p>输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Output <p>输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOutput() {
        return this.Output;
    }

    /**
     * Set <p>输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Output <p>输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOutput(String Output) {
        this.Output = Output;
    }

    /**
     * Get <p>任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskOutput <p>任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskOutput() {
        return this.TaskOutput;
    }

    /**
     * Set <p>任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskOutput <p>任务输出</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskOutput(String TaskOutput) {
        this.TaskOutput = TaskOutput;
    }

    /**
     * Get <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailMessage <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailMessage() {
        return this.FailMessage;
    }

    /**
     * Set <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailMessage <p>错误信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailMessage(String FailMessage) {
        this.FailMessage = FailMessage;
    }

    /**
     * Get <p>花费时长，单位为毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CostMilliSeconds <p>花费时长，单位为毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCostMilliSeconds() {
        return this.CostMilliSeconds;
    }

    /**
     * Set <p>花费时长，单位为毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CostMilliSeconds <p>花费时长，单位为毫秒</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCostMilliSeconds(Long CostMilliSeconds) {
        this.CostMilliSeconds = CostMilliSeconds;
    }

    /**
     * Get <p>大模型输出信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticInfos <p>大模型输出信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatisticInfo [] getStatisticInfos() {
        return this.StatisticInfos;
    }

    /**
     * Set <p>大模型输出信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticInfos <p>大模型输出信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticInfos(StatisticInfo [] StatisticInfos) {
        this.StatisticInfos = StatisticInfos;
    }

    /**
     * Get <p>错误代码</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailCode <p>错误代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailCode() {
        return this.FailCode;
    }

    /**
     * Set <p>错误代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailCode <p>错误代码</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailCode(String FailCode) {
        this.FailCode = FailCode;
    }

    public WorkflowRunNodeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WorkflowRunNodeInfo(WorkflowRunNodeInfo source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Input != null) {
            this.Input = new String(source.Input);
        }
        if (source.Output != null) {
            this.Output = new String(source.Output);
        }
        if (source.TaskOutput != null) {
            this.TaskOutput = new String(source.TaskOutput);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.CostMilliSeconds != null) {
            this.CostMilliSeconds = new Long(source.CostMilliSeconds);
        }
        if (source.StatisticInfos != null) {
            this.StatisticInfos = new StatisticInfo[source.StatisticInfos.length];
            for (int i = 0; i < source.StatisticInfos.length; i++) {
                this.StatisticInfos[i] = new StatisticInfo(source.StatisticInfos[i]);
            }
        }
        if (source.FailCode != null) {
            this.FailCode = new String(source.FailCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Input", this.Input);
        this.setParamSimple(map, prefix + "Output", this.Output);
        this.setParamSimple(map, prefix + "TaskOutput", this.TaskOutput);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "CostMilliSeconds", this.CostMilliSeconds);
        this.setParamArrayObj(map, prefix + "StatisticInfos.", this.StatisticInfos);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);

    }
}

