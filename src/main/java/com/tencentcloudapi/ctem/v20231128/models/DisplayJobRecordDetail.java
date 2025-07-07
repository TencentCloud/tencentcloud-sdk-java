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
package com.tencentcloudapi.ctem.v20231128.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DisplayJobRecordDetail extends AbstractModel {

    /**
    * 发现时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimeAt")
    @Expose
    private String TimeAt;

    /**
    * 模块
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 模块名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ModuleName")
    @Expose
    private String ModuleName;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("JobRecordId")
    @Expose
    private Long JobRecordId;

    /**
    * 目标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private IdndValue [] Data;

    /**
     * Get 发现时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimeAt 发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimeAt() {
        return this.TimeAt;
    }

    /**
     * Set 发现时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimeAt 发现时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimeAt(String TimeAt) {
        this.TimeAt = TimeAt;
    }

    /**
     * Get 模块
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Module 模块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块
注意：此字段可能返回 null，表示取不到有效值。
     * @param Module 模块
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 模块名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ModuleName 模块名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getModuleName() {
        return this.ModuleName;
    }

    /**
     * Set 模块名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ModuleName 模块名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setModuleName(String ModuleName) {
        this.ModuleName = ModuleName;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return JobRecordId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getJobRecordId() {
        return this.JobRecordId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param JobRecordId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setJobRecordId(Long JobRecordId) {
        this.JobRecordId = JobRecordId;
    }

    /**
     * Get 目标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 目标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IdndValue [] getData() {
        return this.Data;
    }

    /**
     * Set 目标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 目标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(IdndValue [] Data) {
        this.Data = Data;
    }

    public DisplayJobRecordDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DisplayJobRecordDetail(DisplayJobRecordDetail source) {
        if (source.TimeAt != null) {
            this.TimeAt = new String(source.TimeAt);
        }
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.ModuleName != null) {
            this.ModuleName = new String(source.ModuleName);
        }
        if (source.JobRecordId != null) {
            this.JobRecordId = new Long(source.JobRecordId);
        }
        if (source.Data != null) {
            this.Data = new IdndValue[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new IdndValue(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeAt", this.TimeAt);
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "ModuleName", this.ModuleName);
        this.setParamSimple(map, prefix + "JobRecordId", this.JobRecordId);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

