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
package com.tencentcloudapi.bpaas.v20181217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StatusNode extends AbstractModel{

    /**
    * 节点id
    */
    @SerializedName("NodeId")
    @Expose
    private String NodeId;

    /**
    * 节点名称
    */
    @SerializedName("NodeName")
    @Expose
    private String NodeName;

    /**
    * 节点类型 1:审批节点 2:执行节点 3:条件节点
    */
    @SerializedName("NodeType")
    @Expose
    private Long NodeType;

    /**
    * 下一个节点
    */
    @SerializedName("NextNode")
    @Expose
    private String NextNode;

    /**
    * 审批意见模型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Opinion")
    @Expose
    private ApproveOpinion Opinion;

    /**
    * scf函数名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScfName")
    @Expose
    private String ScfName;

    /**
    * 状态（0：待审批，1：审批通过，2：拒绝，3：scf执行失败，4：scf执行成功）18: 外部审批中
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubStatus")
    @Expose
    private Long SubStatus;

    /**
    * 审批节点审批人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApprovedUin")
    @Expose
    private Long [] ApprovedUin;

    /**
    * 审批时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 审批意见信息 审批节点:审批人意见  执行节点:scf函数执行日志
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Msg")
    @Expose
    private String Msg;

    /**
    * 有权限审批该节点的uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Users")
    @Expose
    private ApproveUser Users;

    /**
    * 是否有权限审批该节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsApprove")
    @Expose
    private Boolean IsApprove;

    /**
    * 审批id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveId")
    @Expose
    private String ApproveId;

    /**
    * 审批方式 0或签 1会签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveMethod")
    @Expose
    private Long ApproveMethod;

    /**
    * 审批节点审批类型，1人工审批 2自动通过 3自动决绝 4外部审批scf
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveType")
    @Expose
    private Long ApproveType;

    /**
    * 外部审批类型 scf:0或null ; CKafka:1
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CallMethod")
    @Expose
    private Long CallMethod;

    /**
    * CKafka - 接入资源ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataHubId")
    @Expose
    private String DataHubId;

    /**
    * CKafka - 任务名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * CKafka - 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CKafkaRegion")
    @Expose
    private String CKafkaRegion;

    /**
    * 外部审批Url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExternalUrl")
    @Expose
    private String ExternalUrl;

    /**
    * 并行节点 3-4
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParallelNodes")
    @Expose
    private String ParallelNodes;

    /**
    * scf拒绝时返回信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RejectedCloudFunctionMsg")
    @Expose
    private String RejectedCloudFunctionMsg;

    /**
    * 上一个节点
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PrevNode")
    @Expose
    private String PrevNode;

    /**
     * Get 节点id 
     * @return NodeId 节点id
     */
    public String getNodeId() {
        return this.NodeId;
    }

    /**
     * Set 节点id
     * @param NodeId 节点id
     */
    public void setNodeId(String NodeId) {
        this.NodeId = NodeId;
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
     * Get 节点类型 1:审批节点 2:执行节点 3:条件节点 
     * @return NodeType 节点类型 1:审批节点 2:执行节点 3:条件节点
     */
    public Long getNodeType() {
        return this.NodeType;
    }

    /**
     * Set 节点类型 1:审批节点 2:执行节点 3:条件节点
     * @param NodeType 节点类型 1:审批节点 2:执行节点 3:条件节点
     */
    public void setNodeType(Long NodeType) {
        this.NodeType = NodeType;
    }

    /**
     * Get 下一个节点 
     * @return NextNode 下一个节点
     */
    public String getNextNode() {
        return this.NextNode;
    }

    /**
     * Set 下一个节点
     * @param NextNode 下一个节点
     */
    public void setNextNode(String NextNode) {
        this.NextNode = NextNode;
    }

    /**
     * Get 审批意见模型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Opinion 审批意见模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApproveOpinion getOpinion() {
        return this.Opinion;
    }

    /**
     * Set 审批意见模型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Opinion 审批意见模型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOpinion(ApproveOpinion Opinion) {
        this.Opinion = Opinion;
    }

    /**
     * Get scf函数名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScfName scf函数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getScfName() {
        return this.ScfName;
    }

    /**
     * Set scf函数名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScfName scf函数名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScfName(String ScfName) {
        this.ScfName = ScfName;
    }

    /**
     * Get 状态（0：待审批，1：审批通过，2：拒绝，3：scf执行失败，4：scf执行成功）18: 外部审批中
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubStatus 状态（0：待审批，1：审批通过，2：拒绝，3：scf执行失败，4：scf执行成功）18: 外部审批中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 状态（0：待审批，1：审批通过，2：拒绝，3：scf执行失败，4：scf执行成功）18: 外部审批中
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubStatus 状态（0：待审批，1：审批通过，2：拒绝，3：scf执行失败，4：scf执行成功）18: 外部审批中
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubStatus(Long SubStatus) {
        this.SubStatus = SubStatus;
    }

    /**
     * Get 审批节点审批人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApprovedUin 审批节点审批人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getApprovedUin() {
        return this.ApprovedUin;
    }

    /**
     * Set 审批节点审批人
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApprovedUin 审批节点审批人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApprovedUin(Long [] ApprovedUin) {
        this.ApprovedUin = ApprovedUin;
    }

    /**
     * Get 审批时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 审批时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 审批意见信息 审批节点:审批人意见  执行节点:scf函数执行日志
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Msg 审批意见信息 审批节点:审批人意见  执行节点:scf函数执行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMsg() {
        return this.Msg;
    }

    /**
     * Set 审批意见信息 审批节点:审批人意见  执行节点:scf函数执行日志
注意：此字段可能返回 null，表示取不到有效值。
     * @param Msg 审批意见信息 审批节点:审批人意见  执行节点:scf函数执行日志
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMsg(String Msg) {
        this.Msg = Msg;
    }

    /**
     * Get 有权限审批该节点的uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Users 有权限审批该节点的uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApproveUser getUsers() {
        return this.Users;
    }

    /**
     * Set 有权限审批该节点的uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Users 有权限审批该节点的uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsers(ApproveUser Users) {
        this.Users = Users;
    }

    /**
     * Get 是否有权限审批该节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsApprove 是否有权限审批该节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsApprove() {
        return this.IsApprove;
    }

    /**
     * Set 是否有权限审批该节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsApprove 是否有权限审批该节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsApprove(Boolean IsApprove) {
        this.IsApprove = IsApprove;
    }

    /**
     * Get 审批id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveId 审批id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveId() {
        return this.ApproveId;
    }

    /**
     * Set 审批id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveId 审批id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveId(String ApproveId) {
        this.ApproveId = ApproveId;
    }

    /**
     * Get 审批方式 0或签 1会签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveMethod 审批方式 0或签 1会签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApproveMethod() {
        return this.ApproveMethod;
    }

    /**
     * Set 审批方式 0或签 1会签
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveMethod 审批方式 0或签 1会签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveMethod(Long ApproveMethod) {
        this.ApproveMethod = ApproveMethod;
    }

    /**
     * Get 审批节点审批类型，1人工审批 2自动通过 3自动决绝 4外部审批scf
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveType 审批节点审批类型，1人工审批 2自动通过 3自动决绝 4外部审批scf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getApproveType() {
        return this.ApproveType;
    }

    /**
     * Set 审批节点审批类型，1人工审批 2自动通过 3自动决绝 4外部审批scf
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveType 审批节点审批类型，1人工审批 2自动通过 3自动决绝 4外部审批scf
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveType(Long ApproveType) {
        this.ApproveType = ApproveType;
    }

    /**
     * Get 外部审批类型 scf:0或null ; CKafka:1
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CallMethod 外部审批类型 scf:0或null ; CKafka:1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCallMethod() {
        return this.CallMethod;
    }

    /**
     * Set 外部审批类型 scf:0或null ; CKafka:1
注意：此字段可能返回 null，表示取不到有效值。
     * @param CallMethod 外部审批类型 scf:0或null ; CKafka:1
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCallMethod(Long CallMethod) {
        this.CallMethod = CallMethod;
    }

    /**
     * Get CKafka - 接入资源ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataHubId CKafka - 接入资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataHubId() {
        return this.DataHubId;
    }

    /**
     * Set CKafka - 接入资源ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataHubId CKafka - 接入资源ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataHubId(String DataHubId) {
        this.DataHubId = DataHubId;
    }

    /**
     * Get CKafka - 任务名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskName CKafka - 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set CKafka - 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskName CKafka - 任务名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get CKafka - 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CKafkaRegion CKafka - 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCKafkaRegion() {
        return this.CKafkaRegion;
    }

    /**
     * Set CKafka - 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param CKafkaRegion CKafka - 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCKafkaRegion(String CKafkaRegion) {
        this.CKafkaRegion = CKafkaRegion;
    }

    /**
     * Get 外部审批Url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExternalUrl 外部审批Url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExternalUrl() {
        return this.ExternalUrl;
    }

    /**
     * Set 外部审批Url
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExternalUrl 外部审批Url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExternalUrl(String ExternalUrl) {
        this.ExternalUrl = ExternalUrl;
    }

    /**
     * Get 并行节点 3-4
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParallelNodes 并行节点 3-4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParallelNodes() {
        return this.ParallelNodes;
    }

    /**
     * Set 并行节点 3-4
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParallelNodes 并行节点 3-4
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParallelNodes(String ParallelNodes) {
        this.ParallelNodes = ParallelNodes;
    }

    /**
     * Get scf拒绝时返回信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RejectedCloudFunctionMsg scf拒绝时返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRejectedCloudFunctionMsg() {
        return this.RejectedCloudFunctionMsg;
    }

    /**
     * Set scf拒绝时返回信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RejectedCloudFunctionMsg scf拒绝时返回信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRejectedCloudFunctionMsg(String RejectedCloudFunctionMsg) {
        this.RejectedCloudFunctionMsg = RejectedCloudFunctionMsg;
    }

    /**
     * Get 上一个节点
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PrevNode 上一个节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPrevNode() {
        return this.PrevNode;
    }

    /**
     * Set 上一个节点
注意：此字段可能返回 null，表示取不到有效值。
     * @param PrevNode 上一个节点
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPrevNode(String PrevNode) {
        this.PrevNode = PrevNode;
    }

    public StatusNode() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public StatusNode(StatusNode source) {
        if (source.NodeId != null) {
            this.NodeId = new String(source.NodeId);
        }
        if (source.NodeName != null) {
            this.NodeName = new String(source.NodeName);
        }
        if (source.NodeType != null) {
            this.NodeType = new Long(source.NodeType);
        }
        if (source.NextNode != null) {
            this.NextNode = new String(source.NextNode);
        }
        if (source.Opinion != null) {
            this.Opinion = new ApproveOpinion(source.Opinion);
        }
        if (source.ScfName != null) {
            this.ScfName = new String(source.ScfName);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new Long(source.SubStatus);
        }
        if (source.ApprovedUin != null) {
            this.ApprovedUin = new Long[source.ApprovedUin.length];
            for (int i = 0; i < source.ApprovedUin.length; i++) {
                this.ApprovedUin[i] = new Long(source.ApprovedUin[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Msg != null) {
            this.Msg = new String(source.Msg);
        }
        if (source.Users != null) {
            this.Users = new ApproveUser(source.Users);
        }
        if (source.IsApprove != null) {
            this.IsApprove = new Boolean(source.IsApprove);
        }
        if (source.ApproveId != null) {
            this.ApproveId = new String(source.ApproveId);
        }
        if (source.ApproveMethod != null) {
            this.ApproveMethod = new Long(source.ApproveMethod);
        }
        if (source.ApproveType != null) {
            this.ApproveType = new Long(source.ApproveType);
        }
        if (source.CallMethod != null) {
            this.CallMethod = new Long(source.CallMethod);
        }
        if (source.DataHubId != null) {
            this.DataHubId = new String(source.DataHubId);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.CKafkaRegion != null) {
            this.CKafkaRegion = new String(source.CKafkaRegion);
        }
        if (source.ExternalUrl != null) {
            this.ExternalUrl = new String(source.ExternalUrl);
        }
        if (source.ParallelNodes != null) {
            this.ParallelNodes = new String(source.ParallelNodes);
        }
        if (source.RejectedCloudFunctionMsg != null) {
            this.RejectedCloudFunctionMsg = new String(source.RejectedCloudFunctionMsg);
        }
        if (source.PrevNode != null) {
            this.PrevNode = new String(source.PrevNode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NodeId", this.NodeId);
        this.setParamSimple(map, prefix + "NodeName", this.NodeName);
        this.setParamSimple(map, prefix + "NodeType", this.NodeType);
        this.setParamSimple(map, prefix + "NextNode", this.NextNode);
        this.setParamObj(map, prefix + "Opinion.", this.Opinion);
        this.setParamSimple(map, prefix + "ScfName", this.ScfName);
        this.setParamSimple(map, prefix + "SubStatus", this.SubStatus);
        this.setParamArraySimple(map, prefix + "ApprovedUin.", this.ApprovedUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Msg", this.Msg);
        this.setParamObj(map, prefix + "Users.", this.Users);
        this.setParamSimple(map, prefix + "IsApprove", this.IsApprove);
        this.setParamSimple(map, prefix + "ApproveId", this.ApproveId);
        this.setParamSimple(map, prefix + "ApproveMethod", this.ApproveMethod);
        this.setParamSimple(map, prefix + "ApproveType", this.ApproveType);
        this.setParamSimple(map, prefix + "CallMethod", this.CallMethod);
        this.setParamSimple(map, prefix + "DataHubId", this.DataHubId);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "CKafkaRegion", this.CKafkaRegion);
        this.setParamSimple(map, prefix + "ExternalUrl", this.ExternalUrl);
        this.setParamSimple(map, prefix + "ParallelNodes", this.ParallelNodes);
        this.setParamSimple(map, prefix + "RejectedCloudFunctionMsg", this.RejectedCloudFunctionMsg);
        this.setParamSimple(map, prefix + "PrevNode", this.PrevNode);

    }
}

