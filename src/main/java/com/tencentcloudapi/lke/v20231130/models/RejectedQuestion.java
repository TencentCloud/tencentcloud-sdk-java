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

public class RejectedQuestion extends AbstractModel {

    /**
    * 拒答问题ID


注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RejectedBizId")
    @Expose
    private String RejectedBizId;

    /**
    * 被拒答的问题

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Question")
    @Expose
    private String Question;

    /**
    * 状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 状态描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatusDesc")
    @Expose
    private String StatusDesc;

    /**
    * 更新时间

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 是否允许编辑

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAllowEdit")
    @Expose
    private Boolean IsAllowEdit;

    /**
    * 是否允许删除

注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsAllowDelete")
    @Expose
    private Boolean IsAllowDelete;

    /**
     * Get 拒答问题ID


注意：此字段可能返回 null，表示取不到有效值。 
     * @return RejectedBizId 拒答问题ID


注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRejectedBizId() {
        return this.RejectedBizId;
    }

    /**
     * Set 拒答问题ID


注意：此字段可能返回 null，表示取不到有效值。
     * @param RejectedBizId 拒答问题ID


注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRejectedBizId(String RejectedBizId) {
        this.RejectedBizId = RejectedBizId;
    }

    /**
     * Get 被拒答的问题

注意：此字段可能返回 null，表示取不到有效值。 
     * @return Question 被拒答的问题

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQuestion() {
        return this.Question;
    }

    /**
     * Set 被拒答的问题

注意：此字段可能返回 null，表示取不到有效值。
     * @param Question 被拒答的问题

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQuestion(String Question) {
        this.Question = Question;
    }

    /**
     * Get 状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 状态描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatusDesc() {
        return this.StatusDesc;
    }

    /**
     * Set 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatusDesc 状态描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatusDesc(String StatusDesc) {
        this.StatusDesc = StatusDesc;
    }

    /**
     * Get 更新时间

注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdateTime 更新时间

注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间

注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdateTime 更新时间

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 是否允许编辑

注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllowEdit 是否允许编辑

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAllowEdit() {
        return this.IsAllowEdit;
    }

    /**
     * Set 是否允许编辑

注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllowEdit 是否允许编辑

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAllowEdit(Boolean IsAllowEdit) {
        this.IsAllowEdit = IsAllowEdit;
    }

    /**
     * Get 是否允许删除

注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsAllowDelete 是否允许删除

注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getIsAllowDelete() {
        return this.IsAllowDelete;
    }

    /**
     * Set 是否允许删除

注意：此字段可能返回 null，表示取不到有效值。
     * @param IsAllowDelete 是否允许删除

注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsAllowDelete(Boolean IsAllowDelete) {
        this.IsAllowDelete = IsAllowDelete;
    }

    public RejectedQuestion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RejectedQuestion(RejectedQuestion source) {
        if (source.RejectedBizId != null) {
            this.RejectedBizId = new String(source.RejectedBizId);
        }
        if (source.Question != null) {
            this.Question = new String(source.Question);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StatusDesc != null) {
            this.StatusDesc = new String(source.StatusDesc);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.IsAllowEdit != null) {
            this.IsAllowEdit = new Boolean(source.IsAllowEdit);
        }
        if (source.IsAllowDelete != null) {
            this.IsAllowDelete = new Boolean(source.IsAllowDelete);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RejectedBizId", this.RejectedBizId);
        this.setParamSimple(map, prefix + "Question", this.Question);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StatusDesc", this.StatusDesc);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "IsAllowEdit", this.IsAllowEdit);
        this.setParamSimple(map, prefix + "IsAllowDelete", this.IsAllowDelete);

    }
}

