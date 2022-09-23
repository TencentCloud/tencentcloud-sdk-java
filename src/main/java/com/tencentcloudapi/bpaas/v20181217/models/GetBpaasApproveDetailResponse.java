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

public class GetBpaasApproveDetailResponse extends AbstractModel{

    /**
    * 申请人uin
    */
    @SerializedName("ApplyUin")
    @Expose
    private Long ApplyUin;

    /**
    * 申请人主账号
    */
    @SerializedName("ApplyOwnUin")
    @Expose
    private Long ApplyOwnUin;

    /**
    * 申请人昵称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplyUinNick")
    @Expose
    private String ApplyUinNick;

    /**
    * 审批流id
    */
    @SerializedName("BpaasId")
    @Expose
    private Long BpaasId;

    /**
    * 审批流名称
    */
    @SerializedName("BpaasName")
    @Expose
    private String BpaasName;

    /**
    * 申请参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationParams")
    @Expose
    private ApplyParam [] ApplicationParams;

    /**
    * 申请原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 申请时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 申请单状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 节点信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Nodes")
    @Expose
    private StatusNode [] Nodes;

    /**
    * 正在审批的节点id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApprovingNodeId")
    @Expose
    private String ApprovingNodeId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 申请人uin 
     * @return ApplyUin 申请人uin
     */
    public Long getApplyUin() {
        return this.ApplyUin;
    }

    /**
     * Set 申请人uin
     * @param ApplyUin 申请人uin
     */
    public void setApplyUin(Long ApplyUin) {
        this.ApplyUin = ApplyUin;
    }

    /**
     * Get 申请人主账号 
     * @return ApplyOwnUin 申请人主账号
     */
    public Long getApplyOwnUin() {
        return this.ApplyOwnUin;
    }

    /**
     * Set 申请人主账号
     * @param ApplyOwnUin 申请人主账号
     */
    public void setApplyOwnUin(Long ApplyOwnUin) {
        this.ApplyOwnUin = ApplyOwnUin;
    }

    /**
     * Get 申请人昵称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplyUinNick 申请人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplyUinNick() {
        return this.ApplyUinNick;
    }

    /**
     * Set 申请人昵称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplyUinNick 申请人昵称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplyUinNick(String ApplyUinNick) {
        this.ApplyUinNick = ApplyUinNick;
    }

    /**
     * Get 审批流id 
     * @return BpaasId 审批流id
     */
    public Long getBpaasId() {
        return this.BpaasId;
    }

    /**
     * Set 审批流id
     * @param BpaasId 审批流id
     */
    public void setBpaasId(Long BpaasId) {
        this.BpaasId = BpaasId;
    }

    /**
     * Get 审批流名称 
     * @return BpaasName 审批流名称
     */
    public String getBpaasName() {
        return this.BpaasName;
    }

    /**
     * Set 审批流名称
     * @param BpaasName 审批流名称
     */
    public void setBpaasName(String BpaasName) {
        this.BpaasName = BpaasName;
    }

    /**
     * Get 申请参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationParams 申请参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplyParam [] getApplicationParams() {
        return this.ApplicationParams;
    }

    /**
     * Set 申请参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationParams 申请参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationParams(ApplyParam [] ApplicationParams) {
        this.ApplicationParams = ApplicationParams;
    }

    /**
     * Get 申请原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason 申请原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 申请原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason 申请原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 申请时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 申请时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 申请单状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 申请单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 申请单状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 申请单状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 节点信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Nodes 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public StatusNode [] getNodes() {
        return this.Nodes;
    }

    /**
     * Set 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Nodes 节点信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNodes(StatusNode [] Nodes) {
        this.Nodes = Nodes;
    }

    /**
     * Get 正在审批的节点id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApprovingNodeId 正在审批的节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApprovingNodeId() {
        return this.ApprovingNodeId;
    }

    /**
     * Set 正在审批的节点id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApprovingNodeId 正在审批的节点id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApprovingNodeId(String ApprovingNodeId) {
        this.ApprovingNodeId = ApprovingNodeId;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public GetBpaasApproveDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetBpaasApproveDetailResponse(GetBpaasApproveDetailResponse source) {
        if (source.ApplyUin != null) {
            this.ApplyUin = new Long(source.ApplyUin);
        }
        if (source.ApplyOwnUin != null) {
            this.ApplyOwnUin = new Long(source.ApplyOwnUin);
        }
        if (source.ApplyUinNick != null) {
            this.ApplyUinNick = new String(source.ApplyUinNick);
        }
        if (source.BpaasId != null) {
            this.BpaasId = new Long(source.BpaasId);
        }
        if (source.BpaasName != null) {
            this.BpaasName = new String(source.BpaasName);
        }
        if (source.ApplicationParams != null) {
            this.ApplicationParams = new ApplyParam[source.ApplicationParams.length];
            for (int i = 0; i < source.ApplicationParams.length; i++) {
                this.ApplicationParams[i] = new ApplyParam(source.ApplicationParams[i]);
            }
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Nodes != null) {
            this.Nodes = new StatusNode[source.Nodes.length];
            for (int i = 0; i < source.Nodes.length; i++) {
                this.Nodes[i] = new StatusNode(source.Nodes[i]);
            }
        }
        if (source.ApprovingNodeId != null) {
            this.ApprovingNodeId = new String(source.ApprovingNodeId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplyUin", this.ApplyUin);
        this.setParamSimple(map, prefix + "ApplyOwnUin", this.ApplyOwnUin);
        this.setParamSimple(map, prefix + "ApplyUinNick", this.ApplyUinNick);
        this.setParamSimple(map, prefix + "BpaasId", this.BpaasId);
        this.setParamSimple(map, prefix + "BpaasName", this.BpaasName);
        this.setParamArrayObj(map, prefix + "ApplicationParams.", this.ApplicationParams);
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Nodes.", this.Nodes);
        this.setParamSimple(map, prefix + "ApprovingNodeId", this.ApprovingNodeId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

