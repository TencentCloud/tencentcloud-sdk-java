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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchJobVO extends AbstractModel {

    /**
    * 批量操作Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobId")
    @Expose
    private Long JobId;

    /**
    * 批量操作类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobType")
    @Expose
    private String JobType;

    /**
    * 状态
初始状态：INIT;运行中：RUNNING;成功：SUCCESS;失败：FAIL;部分成功PART_SUCCESS
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 操作人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerName")
    @Expose
    private String OwnerName;

    /**
    * 项目ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 操作人Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("OwnerId")
    @Expose
    private String OwnerId;

    /**
     * Get 批量操作Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobId 批量操作Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobId() {
        return this.JobId;
    }

    /**
     * Set 批量操作Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobId 批量操作Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobId(Long JobId) {
        this.JobId = JobId;
    }

    /**
     * Get 批量操作类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobType 批量操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getJobType() {
        return this.JobType;
    }

    /**
     * Set 批量操作类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobType 批量操作类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobType(String JobType) {
        this.JobType = JobType;
    }

    /**
     * Get 状态
初始状态：INIT;运行中：RUNNING;成功：SUCCESS;失败：FAIL;部分成功PART_SUCCESS
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status 状态
初始状态：INIT;运行中：RUNNING;成功：SUCCESS;失败：FAIL;部分成功PART_SUCCESS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
初始状态：INIT;运行中：RUNNING;成功：SUCCESS;失败：FAIL;部分成功PART_SUCCESS
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 状态
初始状态：INIT;运行中：RUNNING;成功：SUCCESS;失败：FAIL;部分成功PART_SUCCESS
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

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
     * Get 操作人
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerName 操作人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerName() {
        return this.OwnerName;
    }

    /**
     * Set 操作人
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerName 操作人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    /**
     * Get 项目ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectId 项目ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 操作人Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return OwnerId 操作人Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOwnerId() {
        return this.OwnerId;
    }

    /**
     * Set 操作人Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param OwnerId 操作人Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOwnerId(String OwnerId) {
        this.OwnerId = OwnerId;
    }

    public BatchJobVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchJobVO(BatchJobVO source) {
        if (source.JobId != null) {
            this.JobId = new Long(source.JobId);
        }
        if (source.JobType != null) {
            this.JobType = new String(source.JobType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.OwnerName != null) {
            this.OwnerName = new String(source.OwnerName);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.OwnerId != null) {
            this.OwnerId = new String(source.OwnerId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "JobId", this.JobId);
        this.setParamSimple(map, prefix + "JobType", this.JobType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "OwnerName", this.OwnerName);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "OwnerId", this.OwnerId);

    }
}

