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
package com.tencentcloudapi.ctsdb.v20230202.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Database extends AbstractModel {

    /**
    * <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterID")
    @Expose
    private String ClusterID;

    /**
    * <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>降冷时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoolDownInDays")
    @Expose
    private Long CoolDownInDays;

    /**
    * <p>数据保留时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetentionInDays")
    @Expose
    private Long RetentionInDays;

    /**
    * <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * <p>状态：0: 资源初始化中， 1: 资源创建中， 2: 正常状态， 3: 资源删除中， 4: 资源已删除， 5: 资源禁用中， 6: 资源已禁用， 7: 资源异常，需要人工操作</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UpdatedAt")
    @Expose
    private String UpdatedAt;

    /**
    * <p>降冷开启时间</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoolDownTime")
    @Expose
    private String CoolDownTime;

    /**
     * Get <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ClusterID <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterID() {
        return this.ClusterID;
    }

    /**
     * Set <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterID <p>实例ID</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterID(String ClusterID) {
        this.ClusterID = ClusterID;
    }

    /**
     * Get <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>数据库名</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>降冷时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoolDownInDays <p>降冷时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoolDownInDays() {
        return this.CoolDownInDays;
    }

    /**
     * Set <p>降冷时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoolDownInDays <p>降冷时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoolDownInDays(Long CoolDownInDays) {
        this.CoolDownInDays = CoolDownInDays;
    }

    /**
     * Get <p>数据保留时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RetentionInDays <p>数据保留时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRetentionInDays() {
        return this.RetentionInDays;
    }

    /**
     * Set <p>数据保留时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetentionInDays <p>数据保留时间（天）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetentionInDays(Long RetentionInDays) {
        this.RetentionInDays = RetentionInDays;
    }

    /**
     * Get <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Remark <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Remark <p>备注</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get <p>状态：0: 资源初始化中， 1: 资源创建中， 2: 正常状态， 3: 资源删除中， 4: 资源已删除， 5: 资源禁用中， 6: 资源已禁用， 7: 资源异常，需要人工操作</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Status <p>状态：0: 资源初始化中， 1: 资源创建中， 2: 正常状态， 3: 资源删除中， 4: 资源已删除， 5: 资源禁用中， 6: 资源已禁用， 7: 资源异常，需要人工操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>状态：0: 资源初始化中， 1: 资源创建中， 2: 正常状态， 3: 资源删除中， 4: 资源已删除， 5: 资源禁用中， 6: 资源已禁用， 7: 资源异常，需要人工操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status <p>状态：0: 资源初始化中， 1: 资源创建中， 2: 正常状态， 3: 资源删除中， 4: 资源已删除， 5: 资源禁用中， 6: 资源已禁用， 7: 资源异常，需要人工操作</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatedAt <p>创建时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UpdatedAt <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUpdatedAt() {
        return this.UpdatedAt;
    }

    /**
     * Set <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UpdatedAt <p>最后修改时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUpdatedAt(String UpdatedAt) {
        this.UpdatedAt = UpdatedAt;
    }

    /**
     * Get <p>降冷开启时间</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoolDownTime <p>降冷开启时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCoolDownTime() {
        return this.CoolDownTime;
    }

    /**
     * Set <p>降冷开启时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoolDownTime <p>降冷开启时间</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoolDownTime(String CoolDownTime) {
        this.CoolDownTime = CoolDownTime;
    }

    public Database() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Database(Database source) {
        if (source.ClusterID != null) {
            this.ClusterID = new String(source.ClusterID);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.CoolDownInDays != null) {
            this.CoolDownInDays = new Long(source.CoolDownInDays);
        }
        if (source.RetentionInDays != null) {
            this.RetentionInDays = new Long(source.RetentionInDays);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.CreatedAt != null) {
            this.CreatedAt = new String(source.CreatedAt);
        }
        if (source.UpdatedAt != null) {
            this.UpdatedAt = new String(source.UpdatedAt);
        }
        if (source.CoolDownTime != null) {
            this.CoolDownTime = new String(source.CoolDownTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterID", this.ClusterID);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CoolDownInDays", this.CoolDownInDays);
        this.setParamSimple(map, prefix + "RetentionInDays", this.RetentionInDays);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "UpdatedAt", this.UpdatedAt);
        this.setParamSimple(map, prefix + "CoolDownTime", this.CoolDownTime);

    }
}

