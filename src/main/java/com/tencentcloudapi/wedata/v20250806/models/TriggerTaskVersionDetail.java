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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TriggerTaskVersionDetail extends AbstractModel {

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * 版本创建人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 保存版本Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * 审批状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveStatus")
    @Expose
    private String ApproveStatus;

    /**
    * 生产状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveTime")
    @Expose
    private String ApproveTime;

    /**
    * 审批人Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveUserUin")
    @Expose
    private String ApproveUserUin;

    /**
    * 版本的任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Task")
    @Expose
    private TriggerTask Task;

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionNum 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set 版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionNum 版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get 版本创建人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 版本创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 版本创建人
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 版本创建人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 保存版本Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId 保存版本Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set 保存版本Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId 保存版本Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionRemark 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionRemark 版本描述信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get 审批状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveStatus 审批状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set 审批状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveStatus 审批状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveStatus(String ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get 生产状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveTime 生产状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveTime() {
        return this.ApproveTime;
    }

    /**
     * Set 生产状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveTime 生产状态（只有提交版本有）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveTime(String ApproveTime) {
        this.ApproveTime = ApproveTime;
    }

    /**
     * Get 审批人Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveUserUin 审批人Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveUserUin() {
        return this.ApproveUserUin;
    }

    /**
     * Set 审批人Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveUserUin 审批人Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveUserUin(String ApproveUserUin) {
        this.ApproveUserUin = ApproveUserUin;
    }

    /**
     * Get 版本的任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Task 版本的任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerTask getTask() {
        return this.Task;
    }

    /**
     * Set 版本的任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Task 版本的任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTask(TriggerTask Task) {
        this.Task = Task;
    }

    public TriggerTaskVersionDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TriggerTaskVersionDetail(TriggerTaskVersionDetail source) {
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.VersionNum != null) {
            this.VersionNum = new String(source.VersionNum);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.VersionRemark != null) {
            this.VersionRemark = new String(source.VersionRemark);
        }
        if (source.ApproveStatus != null) {
            this.ApproveStatus = new String(source.ApproveStatus);
        }
        if (source.ApproveTime != null) {
            this.ApproveTime = new String(source.ApproveTime);
        }
        if (source.ApproveUserUin != null) {
            this.ApproveUserUin = new String(source.ApproveUserUin);
        }
        if (source.Task != null) {
            this.Task = new TriggerTask(source.Task);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "VersionNum", this.VersionNum);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "VersionRemark", this.VersionRemark);
        this.setParamSimple(map, prefix + "ApproveStatus", this.ApproveStatus);
        this.setParamSimple(map, prefix + "ApproveTime", this.ApproveTime);
        this.setParamSimple(map, prefix + "ApproveUserUin", this.ApproveUserUin);
        this.setParamObj(map, prefix + "Task.", this.Task);

    }
}

