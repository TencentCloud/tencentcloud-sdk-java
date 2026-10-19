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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NodeRun extends AbstractModel {

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
20: 数据库节点
21: 变量赋值节点数据
22: 变量转换节点数据
23: Agent节点
24: 注释节点
25: 文件收集节点
26: 文本收集节点
27: Widget节点
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 运行状态。1: 初始状态；2: 运行中；3: 运行成功； 4: 运行失败； 5: 已取消
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 错误信息
    */
    @SerializedName("FailMessage")
    @Expose
    private String FailMessage;

    /**
    * 消耗的总时间（毫秒）
    */
    @SerializedName("TotalCostMs")
    @Expose
    private Long TotalCostMs;

    /**
    * 消耗的token总数
    */
    @SerializedName("TotalTokens")
    @Expose
    private Long TotalTokens;

    /**
    * 错误码
    */
    @SerializedName("FailCode")
    @Expose
    private String FailCode;

    /**
    * 分支下标的列表
    */
    @SerializedName("BranchIndexList")
    @Expose
    private Long [] BranchIndexList;

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
20: 数据库节点
21: 变量赋值节点数据
22: 变量转换节点数据
23: Agent节点
24: 注释节点
25: 文件收集节点
26: 文本收集节点
27: Widget节点 
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
20: 数据库节点
21: 变量赋值节点数据
22: 变量转换节点数据
23: Agent节点
24: 注释节点
25: 文件收集节点
26: 文本收集节点
27: Widget节点
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
20: 数据库节点
21: 变量赋值节点数据
22: 变量转换节点数据
23: Agent节点
24: 注释节点
25: 文件收集节点
26: 文本收集节点
27: Widget节点
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
20: 数据库节点
21: 变量赋值节点数据
22: 变量转换节点数据
23: Agent节点
24: 注释节点
25: 文件收集节点
26: 文本收集节点
27: Widget节点
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 运行状态。1: 初始状态；2: 运行中；3: 运行成功； 4: 运行失败； 5: 已取消 
     * @return Status 运行状态。1: 初始状态；2: 运行中；3: 运行成功； 4: 运行失败； 5: 已取消
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 运行状态。1: 初始状态；2: 运行中；3: 运行成功； 4: 运行失败； 5: 已取消
     * @param Status 运行状态。1: 初始状态；2: 运行中；3: 运行成功； 4: 运行失败； 5: 已取消
     */
    public void setStatus(Long Status) {
        this.Status = Status;
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
     * Get 消耗的总时间（毫秒） 
     * @return TotalCostMs 消耗的总时间（毫秒）
     */
    public Long getTotalCostMs() {
        return this.TotalCostMs;
    }

    /**
     * Set 消耗的总时间（毫秒）
     * @param TotalCostMs 消耗的总时间（毫秒）
     */
    public void setTotalCostMs(Long TotalCostMs) {
        this.TotalCostMs = TotalCostMs;
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
     * Get 分支下标的列表 
     * @return BranchIndexList 分支下标的列表
     */
    public Long [] getBranchIndexList() {
        return this.BranchIndexList;
    }

    /**
     * Set 分支下标的列表
     * @param BranchIndexList 分支下标的列表
     */
    public void setBranchIndexList(Long [] BranchIndexList) {
        this.BranchIndexList = BranchIndexList;
    }

    public NodeRun() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRun(NodeRun source) {
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
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.FailMessage != null) {
            this.FailMessage = new String(source.FailMessage);
        }
        if (source.TotalCostMs != null) {
            this.TotalCostMs = new Long(source.TotalCostMs);
        }
        if (source.TotalTokens != null) {
            this.TotalTokens = new Long(source.TotalTokens);
        }
        if (source.FailCode != null) {
            this.FailCode = new String(source.FailCode);
        }
        if (source.BranchIndexList != null) {
            this.BranchIndexList = new Long[source.BranchIndexList.length];
            for (int i = 0; i < source.BranchIndexList.length; i++) {
                this.BranchIndexList[i] = new Long(source.BranchIndexList[i]);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FailMessage", this.FailMessage);
        this.setParamSimple(map, prefix + "TotalCostMs", this.TotalCostMs);
        this.setParamSimple(map, prefix + "TotalTokens", this.TotalTokens);
        this.setParamSimple(map, prefix + "FailCode", this.FailCode);
        this.setParamArraySimple(map, prefix + "BranchIndexList.", this.BranchIndexList);

    }
}

