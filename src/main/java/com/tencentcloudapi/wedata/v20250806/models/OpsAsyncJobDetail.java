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

public class OpsAsyncJobDetail extends AbstractModel {

    /**
    * 项目id
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 操作id
    */
    @SerializedName("AsyncId")
    @Expose
    private String AsyncId;

    /**
    * 异步操作类型
    */
    @SerializedName("AsyncType")
    @Expose
    private String AsyncType;

    /**
    * 异步操作状态：初始状态: INIT; 运行中: RUNNING; 成功: SUCCESS; 失败: FAIL; 部分成功: PART_SUCCESS
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorDesc")
    @Expose
    private String ErrorDesc;

    /**
    * 子操作总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalSubProcessCount")
    @Expose
    private Long TotalSubProcessCount;

    /**
    * 已完成的子操作个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FinishedSubProcessCount")
    @Expose
    private Long FinishedSubProcessCount;

    /**
    * 已成功的子操作个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SuccessSubProcessCount")
    @Expose
    private Long SuccessSubProcessCount;

    /**
    * 操作人id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 操作创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 项目id 
     * @return ProjectId 项目id
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目id
     * @param ProjectId 项目id
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 操作id 
     * @return AsyncId 操作id
     */
    public String getAsyncId() {
        return this.AsyncId;
    }

    /**
     * Set 操作id
     * @param AsyncId 操作id
     */
    public void setAsyncId(String AsyncId) {
        this.AsyncId = AsyncId;
    }

    /**
     * Get 异步操作类型 
     * @return AsyncType 异步操作类型
     */
    public String getAsyncType() {
        return this.AsyncType;
    }

    /**
     * Set 异步操作类型
     * @param AsyncType 异步操作类型
     */
    public void setAsyncType(String AsyncType) {
        this.AsyncType = AsyncType;
    }

    /**
     * Get 异步操作状态：初始状态: INIT; 运行中: RUNNING; 成功: SUCCESS; 失败: FAIL; 部分成功: PART_SUCCESS 
     * @return Status 异步操作状态：初始状态: INIT; 运行中: RUNNING; 成功: SUCCESS; 失败: FAIL; 部分成功: PART_SUCCESS
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 异步操作状态：初始状态: INIT; 运行中: RUNNING; 成功: SUCCESS; 失败: FAIL; 部分成功: PART_SUCCESS
     * @param Status 异步操作状态：初始状态: INIT; 运行中: RUNNING; 成功: SUCCESS; 失败: FAIL; 部分成功: PART_SUCCESS
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorDesc 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorDesc() {
        return this.ErrorDesc;
    }

    /**
     * Set 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorDesc 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorDesc(String ErrorDesc) {
        this.ErrorDesc = ErrorDesc;
    }

    /**
     * Get 子操作总数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalSubProcessCount 子操作总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTotalSubProcessCount() {
        return this.TotalSubProcessCount;
    }

    /**
     * Set 子操作总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalSubProcessCount 子操作总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalSubProcessCount(Long TotalSubProcessCount) {
        this.TotalSubProcessCount = TotalSubProcessCount;
    }

    /**
     * Get 已完成的子操作个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FinishedSubProcessCount 已完成的子操作个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFinishedSubProcessCount() {
        return this.FinishedSubProcessCount;
    }

    /**
     * Set 已完成的子操作个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param FinishedSubProcessCount 已完成的子操作个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFinishedSubProcessCount(Long FinishedSubProcessCount) {
        this.FinishedSubProcessCount = FinishedSubProcessCount;
    }

    /**
     * Get 已成功的子操作个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SuccessSubProcessCount 已成功的子操作个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSuccessSubProcessCount() {
        return this.SuccessSubProcessCount;
    }

    /**
     * Set 已成功的子操作个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param SuccessSubProcessCount 已成功的子操作个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSuccessSubProcessCount(Long SuccessSubProcessCount) {
        this.SuccessSubProcessCount = SuccessSubProcessCount;
    }

    /**
     * Get 操作人id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateUserUin 操作人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 操作人id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateUserUin 操作人id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 操作创建时间 
     * @return CreateTime 操作创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 操作创建时间
     * @param CreateTime 操作创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public OpsAsyncJobDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OpsAsyncJobDetail(OpsAsyncJobDetail source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AsyncId != null) {
            this.AsyncId = new String(source.AsyncId);
        }
        if (source.AsyncType != null) {
            this.AsyncType = new String(source.AsyncType);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorDesc != null) {
            this.ErrorDesc = new String(source.ErrorDesc);
        }
        if (source.TotalSubProcessCount != null) {
            this.TotalSubProcessCount = new Long(source.TotalSubProcessCount);
        }
        if (source.FinishedSubProcessCount != null) {
            this.FinishedSubProcessCount = new Long(source.FinishedSubProcessCount);
        }
        if (source.SuccessSubProcessCount != null) {
            this.SuccessSubProcessCount = new Long(source.SuccessSubProcessCount);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AsyncId", this.AsyncId);
        this.setParamSimple(map, prefix + "AsyncType", this.AsyncType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ErrorDesc", this.ErrorDesc);
        this.setParamSimple(map, prefix + "TotalSubProcessCount", this.TotalSubProcessCount);
        this.setParamSimple(map, prefix + "FinishedSubProcessCount", this.FinishedSubProcessCount);
        this.setParamSimple(map, prefix + "SuccessSubProcessCount", this.SuccessSubProcessCount);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

