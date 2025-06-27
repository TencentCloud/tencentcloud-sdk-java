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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayJobRecord extends AbstractModel {

    /**
    * 任务Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 企业ID
    */
    @SerializedName("CustomerId")
    @Expose
    private Long CustomerId;

    /**
    * 企业名称
    */
    @SerializedName("CustomerName")
    @Expose
    private String CustomerName;

    /**
    * 周期任务详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Crontab")
    @Expose
    private String Crontab;

    /**
    * 状态：2-错误/已停止，3-进行中，1-已完成, 4-停止
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 新增数据
    */
    @SerializedName("NewCount")
    @Expose
    private Long NewCount;

    /**
    * 创建时间
    */
    @SerializedName("CreateAt")
    @Expose
    private String CreateAt;

    /**
    * 更新时间
    */
    @SerializedName("UpdateAt")
    @Expose
    private String UpdateAt;

    /**
    * 子任务进度
    */
    @SerializedName("Progress")
    @Expose
    private JobRecordProgress Progress;

    /**
    * 并发设置
    */
    @SerializedName("Qps")
    @Expose
    private Long Qps;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskType")
    @Expose
    private String TaskType;

    /**
    * 客户Uin
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 客户appid
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private Long AppId;

    /**
     * Get 任务Id 
     * @return Id 任务Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 任务Id
     * @param Id 任务Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 企业ID 
     * @return CustomerId 企业ID
     */
    public Long getCustomerId() {
        return this.CustomerId;
    }

    /**
     * Set 企业ID
     * @param CustomerId 企业ID
     */
    public void setCustomerId(Long CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * Get 企业名称 
     * @return CustomerName 企业名称
     */
    public String getCustomerName() {
        return this.CustomerName;
    }

    /**
     * Set 企业名称
     * @param CustomerName 企业名称
     */
    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    /**
     * Get 周期任务详情
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Crontab 周期任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCrontab() {
        return this.Crontab;
    }

    /**
     * Set 周期任务详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param Crontab 周期任务详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCrontab(String Crontab) {
        this.Crontab = Crontab;
    }

    /**
     * Get 状态：2-错误/已停止，3-进行中，1-已完成, 4-停止 
     * @return Status 状态：2-错误/已停止，3-进行中，1-已完成, 4-停止
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态：2-错误/已停止，3-进行中，1-已完成, 4-停止
     * @param Status 状态：2-错误/已停止，3-进行中，1-已完成, 4-停止
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 新增数据 
     * @return NewCount 新增数据
     */
    public Long getNewCount() {
        return this.NewCount;
    }

    /**
     * Set 新增数据
     * @param NewCount 新增数据
     */
    public void setNewCount(Long NewCount) {
        this.NewCount = NewCount;
    }

    /**
     * Get 创建时间 
     * @return CreateAt 创建时间
     */
    public String getCreateAt() {
        return this.CreateAt;
    }

    /**
     * Set 创建时间
     * @param CreateAt 创建时间
     */
    public void setCreateAt(String CreateAt) {
        this.CreateAt = CreateAt;
    }

    /**
     * Get 更新时间 
     * @return UpdateAt 更新时间
     */
    public String getUpdateAt() {
        return this.UpdateAt;
    }

    /**
     * Set 更新时间
     * @param UpdateAt 更新时间
     */
    public void setUpdateAt(String UpdateAt) {
        this.UpdateAt = UpdateAt;
    }

    /**
     * Get 子任务进度 
     * @return Progress 子任务进度
     */
    public JobRecordProgress getProgress() {
        return this.Progress;
    }

    /**
     * Set 子任务进度
     * @param Progress 子任务进度
     */
    public void setProgress(JobRecordProgress Progress) {
        this.Progress = Progress;
    }

    /**
     * Get 并发设置 
     * @return Qps 并发设置
     */
    public Long getQps() {
        return this.Qps;
    }

    /**
     * Set 并发设置
     * @param Qps 并发设置
     */
    public void setQps(Long Qps) {
        this.Qps = Qps;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTaskType() {
        return this.TaskType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskType(String TaskType) {
        this.TaskType = TaskType;
    }

    /**
     * Get 客户Uin
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Uin 客户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * Set 客户Uin
注意：此字段可能返回 null，表示取不到有效值。
     * @param Uin 客户Uin
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * Get 客户appid
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AppId 客户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAppId() {
        return this.AppId;
    }

    /**
     * Set 客户appid
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 客户appid
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(Long AppId) {
        this.AppId = AppId;
    }

    public DisplayJobRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayJobRecord(DisplayJobRecord source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.CustomerId != null) {
            this.CustomerId = new Long(source.CustomerId);
        }
        if (source.CustomerName != null) {
            this.CustomerName = new String(source.CustomerName);
        }
        if (source.Crontab != null) {
            this.Crontab = new String(source.Crontab);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.NewCount != null) {
            this.NewCount = new Long(source.NewCount);
        }
        if (source.CreateAt != null) {
            this.CreateAt = new String(source.CreateAt);
        }
        if (source.UpdateAt != null) {
            this.UpdateAt = new String(source.UpdateAt);
        }
        if (source.Progress != null) {
            this.Progress = new JobRecordProgress(source.Progress);
        }
        if (source.Qps != null) {
            this.Qps = new Long(source.Qps);
        }
        if (source.TaskType != null) {
            this.TaskType = new String(source.TaskType);
        }
        if (source.Uin != null) {
            this.Uin = new String(source.Uin);
        }
        if (source.AppId != null) {
            this.AppId = new Long(source.AppId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "CustomerId", this.CustomerId);
        this.setParamSimple(map, prefix + "CustomerName", this.CustomerName);
        this.setParamSimple(map, prefix + "Crontab", this.Crontab);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "NewCount", this.NewCount);
        this.setParamSimple(map, prefix + "CreateAt", this.CreateAt);
        this.setParamSimple(map, prefix + "UpdateAt", this.UpdateAt);
        this.setParamObj(map, prefix + "Progress.", this.Progress);
        this.setParamSimple(map, prefix + "Qps", this.Qps);
        this.setParamSimple(map, prefix + "TaskType", this.TaskType);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);

    }
}

