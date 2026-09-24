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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudVersionApprovalAction extends AbstractModel {

    /**
    * <p>动作 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionId")
    @Expose
    private String ActionId;

    /**
    * <p>动作类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * <p>动作发起者类型。USER 用户；SYSTEM 系统自动通过。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActorType")
    @Expose
    private String ActorType;

    /**
    * <p>发起者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActorUin")
    @Expose
    private String ActorUin;

    /**
    * <p>发起者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActorSubAccountUin")
    @Expose
    private String ActorSubAccountUin;

    /**
    * <p>动作留言。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * <p>发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>对应云 API 请求的 RequestId。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>动作 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionId <p>动作 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionId() {
        return this.ActionId;
    }

    /**
     * Set <p>动作 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionId <p>动作 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionId(String ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get <p>动作类型。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActionType <p>动作类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * Set <p>动作类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType <p>动作类型。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * Get <p>动作发起者类型。USER 用户；SYSTEM 系统自动通过。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActorType <p>动作发起者类型。USER 用户；SYSTEM 系统自动通过。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActorType() {
        return this.ActorType;
    }

    /**
     * Set <p>动作发起者类型。USER 用户；SYSTEM 系统自动通过。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActorType <p>动作发起者类型。USER 用户；SYSTEM 系统自动通过。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActorType(String ActorType) {
        this.ActorType = ActorType;
    }

    /**
     * Get <p>发起者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActorUin <p>发起者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActorUin() {
        return this.ActorUin;
    }

    /**
     * Set <p>发起者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActorUin <p>发起者主账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActorUin(String ActorUin) {
        this.ActorUin = ActorUin;
    }

    /**
     * Get <p>发起者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ActorSubAccountUin <p>发起者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActorSubAccountUin() {
        return this.ActorSubAccountUin;
    }

    /**
     * Set <p>发起者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActorSubAccountUin <p>发起者子账号 UIN。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActorSubAccountUin(String ActorSubAccountUin) {
        this.ActorSubAccountUin = ActorSubAccountUin;
    }

    /**
     * Get <p>动作留言。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Comment <p>动作留言。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set <p>动作留言。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Comment <p>动作留言。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get <p>发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>对应云 API 请求的 RequestId。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RequestId <p>对应云 API 请求的 RequestId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set <p>对应云 API 请求的 RequestId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RequestId <p>对应云 API 请求的 RequestId。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public CloudVersionApprovalAction() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudVersionApprovalAction(CloudVersionApprovalAction source) {
        if (source.ActionId != null) {
            this.ActionId = new String(source.ActionId);
        }
        if (source.ActionType != null) {
            this.ActionType = new String(source.ActionType);
        }
        if (source.ActorType != null) {
            this.ActorType = new String(source.ActorType);
        }
        if (source.ActorUin != null) {
            this.ActorUin = new String(source.ActorUin);
        }
        if (source.ActorSubAccountUin != null) {
            this.ActorSubAccountUin = new String(source.ActorSubAccountUin);
        }
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "ActorType", this.ActorType);
        this.setParamSimple(map, prefix + "ActorUin", this.ActorUin);
        this.setParamSimple(map, prefix + "ActorSubAccountUin", this.ActorSubAccountUin);
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

