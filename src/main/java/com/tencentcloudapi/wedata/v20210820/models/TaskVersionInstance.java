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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TaskVersionInstance extends AbstractModel{

    /**
    * 实例版本号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceVersion")
    @Expose
    private Long InstanceVersion;

    /**
    * 实例描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionDesc")
    @Expose
    private String VersionDesc;

    /**
    * 0, "新增"，1, "修改"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChangeType")
    @Expose
    private Long ChangeType;

    /**
    * 版本提交人UIN
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubmitterUin")
    @Expose
    private String SubmitterUin;

    /**
    * 提交日期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceDate")
    @Expose
    private String InstanceDate;

    /**
    * 0, "未启用"，1, "启用(生产态)"
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private Long InstanceStatus;

    /**
     * Get 实例版本号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceVersion 实例版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceVersion() {
        return this.InstanceVersion;
    }

    /**
     * Set 实例版本号
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceVersion 实例版本号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceVersion(Long InstanceVersion) {
        this.InstanceVersion = InstanceVersion;
    }

    /**
     * Get 实例描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionDesc 实例描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionDesc() {
        return this.VersionDesc;
    }

    /**
     * Set 实例描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionDesc 实例描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionDesc(String VersionDesc) {
        this.VersionDesc = VersionDesc;
    }

    /**
     * Get 0, "新增"，1, "修改"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChangeType 0, "新增"，1, "修改"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getChangeType() {
        return this.ChangeType;
    }

    /**
     * Set 0, "新增"，1, "修改"
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChangeType 0, "新增"，1, "修改"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChangeType(Long ChangeType) {
        this.ChangeType = ChangeType;
    }

    /**
     * Get 版本提交人UIN
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubmitterUin 版本提交人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubmitterUin() {
        return this.SubmitterUin;
    }

    /**
     * Set 版本提交人UIN
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubmitterUin 版本提交人UIN
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubmitterUin(String SubmitterUin) {
        this.SubmitterUin = SubmitterUin;
    }

    /**
     * Get 提交日期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceDate 提交日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceDate() {
        return this.InstanceDate;
    }

    /**
     * Set 提交日期
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceDate 提交日期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceDate(String InstanceDate) {
        this.InstanceDate = InstanceDate;
    }

    /**
     * Get 0, "未启用"，1, "启用(生产态)"
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceStatus 0, "未启用"，1, "启用(生产态)"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * Set 0, "未启用"，1, "启用(生产态)"
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 0, "未启用"，1, "启用(生产态)"
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(Long InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    public TaskVersionInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TaskVersionInstance(TaskVersionInstance source) {
        if (source.InstanceVersion != null) {
            this.InstanceVersion = new Long(source.InstanceVersion);
        }
        if (source.VersionDesc != null) {
            this.VersionDesc = new String(source.VersionDesc);
        }
        if (source.ChangeType != null) {
            this.ChangeType = new Long(source.ChangeType);
        }
        if (source.SubmitterUin != null) {
            this.SubmitterUin = new String(source.SubmitterUin);
        }
        if (source.InstanceDate != null) {
            this.InstanceDate = new String(source.InstanceDate);
        }
        if (source.InstanceStatus != null) {
            this.InstanceStatus = new Long(source.InstanceStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceVersion", this.InstanceVersion);
        this.setParamSimple(map, prefix + "VersionDesc", this.VersionDesc);
        this.setParamSimple(map, prefix + "ChangeType", this.ChangeType);
        this.setParamSimple(map, prefix + "SubmitterUin", this.SubmitterUin);
        this.setParamSimple(map, prefix + "InstanceDate", this.InstanceDate);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);

    }
}

