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

public class TaskVersion extends AbstractModel {

    /**
    * <p>保存时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionNum")
    @Expose
    private String VersionNum;

    /**
    * <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * <p>保存版本id</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>版本描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionRemark")
    @Expose
    private String VersionRemark;

    /**
    * <p>审批状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveStatus")
    @Expose
    private String ApproveStatus;

    /**
    * <p>生产状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>审批人（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApproveUserUin")
    @Expose
    private String ApproveUserUin;

    /**
    * <p>是否为使用版本</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedVersion")
    @Expose
    private Boolean UsedVersion;

    /**
     * Get <p>保存时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>保存时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>保存时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>保存时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionNum <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionNum() {
        return this.VersionNum;
    }

    /**
     * Set <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionNum <p>版本号</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionNum(String VersionNum) {
        this.VersionNum = VersionNum;
    }

    /**
     * Get <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin <p>创建人</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get <p>保存版本id</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId <p>保存版本id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>保存版本id</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId <p>保存版本id</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>版本描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionRemark <p>版本描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionRemark() {
        return this.VersionRemark;
    }

    /**
     * Set <p>版本描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionRemark <p>版本描述信息</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionRemark(String VersionRemark) {
        this.VersionRemark = VersionRemark;
    }

    /**
     * Get <p>审批状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveStatus <p>审批状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveStatus() {
        return this.ApproveStatus;
    }

    /**
     * Set <p>审批状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveStatus <p>审批状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveStatus(String ApproveStatus) {
        this.ApproveStatus = ApproveStatus;
    }

    /**
     * Get <p>生产状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>生产状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>生产状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>生产状态（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>审批人（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApproveUserUin <p>审批人（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApproveUserUin() {
        return this.ApproveUserUin;
    }

    /**
     * Set <p>审批人（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApproveUserUin <p>审批人（只有提交版本有）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApproveUserUin(String ApproveUserUin) {
        this.ApproveUserUin = ApproveUserUin;
    }

    /**
     * Get <p>是否为使用版本</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedVersion <p>是否为使用版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getUsedVersion() {
        return this.UsedVersion;
    }

    /**
     * Set <p>是否为使用版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedVersion <p>是否为使用版本</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedVersion(Boolean UsedVersion) {
        this.UsedVersion = UsedVersion;
    }

    public TaskVersion() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskVersion(TaskVersion source) {
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
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ApproveUserUin != null) {
            this.ApproveUserUin = new String(source.ApproveUserUin);
        }
        if (source.UsedVersion != null) {
            this.UsedVersion = new Boolean(source.UsedVersion);
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
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ApproveUserUin", this.ApproveUserUin);
        this.setParamSimple(map, prefix + "UsedVersion", this.UsedVersion);

    }
}

