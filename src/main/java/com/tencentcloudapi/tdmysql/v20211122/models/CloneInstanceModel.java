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
package com.tencentcloudapi.tdmysql.v20211122.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloneInstanceModel extends AbstractModel {

    /**
    * 克隆任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneEndTime")
    @Expose
    private String CloneEndTime;

    /**
    * 克隆记录ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneId")
    @Expose
    private Long CloneId;

    /**
    * 克隆实例类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneInsType")
    @Expose
    private String CloneInsType;

    /**
    * 克隆实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneInstanceId")
    @Expose
    private String CloneInstanceId;

    /**
    * 克隆实例是否已经删除
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneInstanceIsDeleted")
    @Expose
    private Boolean CloneInstanceIsDeleted;

    /**
    * 克隆任务进度
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneProgress")
    @Expose
    private Float CloneProgress;

    /**
    * 克隆任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneStartTime")
    @Expose
    private String CloneStartTime;

    /**
    * 克隆任务状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneStatus")
    @Expose
    private String CloneStatus;

    /**
    * 克隆时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneTime")
    @Expose
    private String CloneTime;

    /**
    * 克隆类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CloneType")
    @Expose
    private String CloneType;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DBType")
    @Expose
    private String DBType;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 源实例ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceInstanceId")
    @Expose
    private String SourceInstanceId;

    /**
     * Get 克隆任务结束时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneEndTime 克隆任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloneEndTime() {
        return this.CloneEndTime;
    }

    /**
     * Set 克隆任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneEndTime 克隆任务结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneEndTime(String CloneEndTime) {
        this.CloneEndTime = CloneEndTime;
    }

    /**
     * Get 克隆记录ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneId 克隆记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCloneId() {
        return this.CloneId;
    }

    /**
     * Set 克隆记录ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneId 克隆记录ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneId(Long CloneId) {
        this.CloneId = CloneId;
    }

    /**
     * Get 克隆实例类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneInsType 克隆实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloneInsType() {
        return this.CloneInsType;
    }

    /**
     * Set 克隆实例类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneInsType 克隆实例类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneInsType(String CloneInsType) {
        this.CloneInsType = CloneInsType;
    }

    /**
     * Get 克隆实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneInstanceId 克隆实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloneInstanceId() {
        return this.CloneInstanceId;
    }

    /**
     * Set 克隆实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneInstanceId 克隆实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneInstanceId(String CloneInstanceId) {
        this.CloneInstanceId = CloneInstanceId;
    }

    /**
     * Get 克隆实例是否已经删除
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneInstanceIsDeleted 克隆实例是否已经删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getCloneInstanceIsDeleted() {
        return this.CloneInstanceIsDeleted;
    }

    /**
     * Set 克隆实例是否已经删除
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneInstanceIsDeleted 克隆实例是否已经删除
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneInstanceIsDeleted(Boolean CloneInstanceIsDeleted) {
        this.CloneInstanceIsDeleted = CloneInstanceIsDeleted;
    }

    /**
     * Get 克隆任务进度
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneProgress 克隆任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Float getCloneProgress() {
        return this.CloneProgress;
    }

    /**
     * Set 克隆任务进度
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneProgress 克隆任务进度
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneProgress(Float CloneProgress) {
        this.CloneProgress = CloneProgress;
    }

    /**
     * Get 克隆任务开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneStartTime 克隆任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloneStartTime() {
        return this.CloneStartTime;
    }

    /**
     * Set 克隆任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneStartTime 克隆任务开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneStartTime(String CloneStartTime) {
        this.CloneStartTime = CloneStartTime;
    }

    /**
     * Get 克隆任务状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneStatus 克隆任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloneStatus() {
        return this.CloneStatus;
    }

    /**
     * Set 克隆任务状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneStatus 克隆任务状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneStatus(String CloneStatus) {
        this.CloneStatus = CloneStatus;
    }

    /**
     * Get 克隆时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneTime 克隆时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloneTime() {
        return this.CloneTime;
    }

    /**
     * Set 克隆时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneTime 克隆时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneTime(String CloneTime) {
        this.CloneTime = CloneTime;
    }

    /**
     * Get 克隆类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CloneType 克隆类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCloneType() {
        return this.CloneType;
    }

    /**
     * Set 克隆类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param CloneType 克隆类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCloneType(String CloneType) {
        this.CloneType = CloneType;
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
     * Get 引擎类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DBType 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * Set 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param DBType 引擎类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDBType(String DBType) {
        this.DBType = DBType;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 源实例ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceInstanceId 源实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceInstanceId() {
        return this.SourceInstanceId;
    }

    /**
     * Set 源实例ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceInstanceId 源实例ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceInstanceId(String SourceInstanceId) {
        this.SourceInstanceId = SourceInstanceId;
    }

    public CloneInstanceModel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloneInstanceModel(CloneInstanceModel source) {
        if (source.CloneEndTime != null) {
            this.CloneEndTime = new String(source.CloneEndTime);
        }
        if (source.CloneId != null) {
            this.CloneId = new Long(source.CloneId);
        }
        if (source.CloneInsType != null) {
            this.CloneInsType = new String(source.CloneInsType);
        }
        if (source.CloneInstanceId != null) {
            this.CloneInstanceId = new String(source.CloneInstanceId);
        }
        if (source.CloneInstanceIsDeleted != null) {
            this.CloneInstanceIsDeleted = new Boolean(source.CloneInstanceIsDeleted);
        }
        if (source.CloneProgress != null) {
            this.CloneProgress = new Float(source.CloneProgress);
        }
        if (source.CloneStartTime != null) {
            this.CloneStartTime = new String(source.CloneStartTime);
        }
        if (source.CloneStatus != null) {
            this.CloneStatus = new String(source.CloneStatus);
        }
        if (source.CloneTime != null) {
            this.CloneTime = new String(source.CloneTime);
        }
        if (source.CloneType != null) {
            this.CloneType = new String(source.CloneType);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.DBType != null) {
            this.DBType = new String(source.DBType);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.SourceInstanceId != null) {
            this.SourceInstanceId = new String(source.SourceInstanceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CloneEndTime", this.CloneEndTime);
        this.setParamSimple(map, prefix + "CloneId", this.CloneId);
        this.setParamSimple(map, prefix + "CloneInsType", this.CloneInsType);
        this.setParamSimple(map, prefix + "CloneInstanceId", this.CloneInstanceId);
        this.setParamSimple(map, prefix + "CloneInstanceIsDeleted", this.CloneInstanceIsDeleted);
        this.setParamSimple(map, prefix + "CloneProgress", this.CloneProgress);
        this.setParamSimple(map, prefix + "CloneStartTime", this.CloneStartTime);
        this.setParamSimple(map, prefix + "CloneStatus", this.CloneStatus);
        this.setParamSimple(map, prefix + "CloneTime", this.CloneTime);
        this.setParamSimple(map, prefix + "CloneType", this.CloneType);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "DBType", this.DBType);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "SourceInstanceId", this.SourceInstanceId);

    }
}

