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

public class NodeRunDetail extends AbstractModel {

    /**
    * <p>节点运行信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeRun")
    @Expose
    private NodeRun NodeRun;

    /**
    * <p>节点运行内容</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeRunContent")
    @Expose
    private NodeRunContent NodeRunContent;

    /**
    * <p>节点运行过程</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeRunExecution")
    @Expose
    private NodeRunExecution NodeRunExecution;

    /**
    * <p>节点运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NodeRunLog")
    @Expose
    private NodeRunLog NodeRunLog;

    /**
    * <p>统计信息</p>
    */
    @SerializedName("StatisticList")
    @Expose
    private Statistic [] StatisticList;

    /**
     * Get <p>节点运行信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeRun <p>节点运行信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeRun getNodeRun() {
        return this.NodeRun;
    }

    /**
     * Set <p>节点运行信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeRun <p>节点运行信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeRun(NodeRun NodeRun) {
        this.NodeRun = NodeRun;
    }

    /**
     * Get <p>节点运行内容</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeRunContent <p>节点运行内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeRunContent getNodeRunContent() {
        return this.NodeRunContent;
    }

    /**
     * Set <p>节点运行内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeRunContent <p>节点运行内容</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeRunContent(NodeRunContent NodeRunContent) {
        this.NodeRunContent = NodeRunContent;
    }

    /**
     * Get <p>节点运行过程</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeRunExecution <p>节点运行过程</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeRunExecution getNodeRunExecution() {
        return this.NodeRunExecution;
    }

    /**
     * Set <p>节点运行过程</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeRunExecution <p>节点运行过程</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeRunExecution(NodeRunExecution NodeRunExecution) {
        this.NodeRunExecution = NodeRunExecution;
    }

    /**
     * Get <p>节点运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NodeRunLog <p>节点运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public NodeRunLog getNodeRunLog() {
        return this.NodeRunLog;
    }

    /**
     * Set <p>节点运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param NodeRunLog <p>节点运行日志</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodeRunLog(NodeRunLog NodeRunLog) {
        this.NodeRunLog = NodeRunLog;
    }

    /**
     * Get <p>统计信息</p> 
     * @return StatisticList <p>统计信息</p>
     */
    public Statistic [] getStatisticList() {
        return this.StatisticList;
    }

    /**
     * Set <p>统计信息</p>
     * @param StatisticList <p>统计信息</p>
     */
    public void setStatisticList(Statistic [] StatisticList) {
        this.StatisticList = StatisticList;
    }

    public NodeRunDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public NodeRunDetail(NodeRunDetail source) {
        if (source.NodeRun != null) {
            this.NodeRun = new NodeRun(source.NodeRun);
        }
        if (source.NodeRunContent != null) {
            this.NodeRunContent = new NodeRunContent(source.NodeRunContent);
        }
        if (source.NodeRunExecution != null) {
            this.NodeRunExecution = new NodeRunExecution(source.NodeRunExecution);
        }
        if (source.NodeRunLog != null) {
            this.NodeRunLog = new NodeRunLog(source.NodeRunLog);
        }
        if (source.StatisticList != null) {
            this.StatisticList = new Statistic[source.StatisticList.length];
            for (int i = 0; i < source.StatisticList.length; i++) {
                this.StatisticList[i] = new Statistic(source.StatisticList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "NodeRun.", this.NodeRun);
        this.setParamObj(map, prefix + "NodeRunContent.", this.NodeRunContent);
        this.setParamObj(map, prefix + "NodeRunExecution.", this.NodeRunExecution);
        this.setParamObj(map, prefix + "NodeRunLog.", this.NodeRunLog);
        this.setParamArrayObj(map, prefix + "StatisticList.", this.StatisticList);

    }
}

