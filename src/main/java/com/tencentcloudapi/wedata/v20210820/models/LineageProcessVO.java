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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineageProcessVO extends AbstractModel {

    /**
    * 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessId")
    @Expose
    private String ProcessId;

    /**
    * 任务类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessType")
    @Expose
    private String ProcessType;

    /**
    * 任务子类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessSubType")
    @Expose
    private String ProcessSubType;

    /**
    * 名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessName")
    @Expose
    private String ProcessName;

    /**
    * 描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QualifiedId")
    @Expose
    private String QualifiedId;

    /**
    * 来源
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Platform")
    @Expose
    private String Platform;

    /**
    * 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessProperties")
    @Expose
    private LineageProperty [] ProcessProperties;

    /**
     * Get 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessId 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessId() {
        return this.ProcessId;
    }

    /**
     * Set 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessId 原始唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessId(String ProcessId) {
        this.ProcessId = ProcessId;
    }

    /**
     * Get 任务类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessType() {
        return this.ProcessType;
    }

    /**
     * Set 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessType 任务类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessType(String ProcessType) {
        this.ProcessType = ProcessType;
    }

    /**
     * Get 任务子类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessSubType 任务子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessSubType() {
        return this.ProcessSubType;
    }

    /**
     * Set 任务子类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessSubType 任务子类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessSubType(String ProcessSubType) {
        this.ProcessSubType = ProcessSubType;
    }

    /**
     * Get 名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProcessName() {
        return this.ProcessName;
    }

    /**
     * Set 名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessName 名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessName(String ProcessName) {
        this.ProcessName = ProcessName;
    }

    /**
     * Get 描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 唯一ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QualifiedId 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getQualifiedId() {
        return this.QualifiedId;
    }

    /**
     * Set 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param QualifiedId 唯一ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQualifiedId(String QualifiedId) {
        this.QualifiedId = QualifiedId;
    }

    /**
     * Get 来源
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Platform 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPlatform() {
        return this.Platform;
    }

    /**
     * Set 来源
注意：此字段可能返回 null，表示取不到有效值。
     * @param Platform 来源
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPlatform(String Platform) {
        this.Platform = Platform;
    }

    /**
     * Get 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessProperties 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LineageProperty [] getProcessProperties() {
        return this.ProcessProperties;
    }

    /**
     * Set 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessProperties 额外扩展参数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessProperties(LineageProperty [] ProcessProperties) {
        this.ProcessProperties = ProcessProperties;
    }

    public LineageProcessVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineageProcessVO(LineageProcessVO source) {
        if (source.ProcessId != null) {
            this.ProcessId = new String(source.ProcessId);
        }
        if (source.ProcessType != null) {
            this.ProcessType = new String(source.ProcessType);
        }
        if (source.ProcessSubType != null) {
            this.ProcessSubType = new String(source.ProcessSubType);
        }
        if (source.ProcessName != null) {
            this.ProcessName = new String(source.ProcessName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.QualifiedId != null) {
            this.QualifiedId = new String(source.QualifiedId);
        }
        if (source.Platform != null) {
            this.Platform = new String(source.Platform);
        }
        if (source.ProcessProperties != null) {
            this.ProcessProperties = new LineageProperty[source.ProcessProperties.length];
            for (int i = 0; i < source.ProcessProperties.length; i++) {
                this.ProcessProperties[i] = new LineageProperty(source.ProcessProperties[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProcessId", this.ProcessId);
        this.setParamSimple(map, prefix + "ProcessType", this.ProcessType);
        this.setParamSimple(map, prefix + "ProcessSubType", this.ProcessSubType);
        this.setParamSimple(map, prefix + "ProcessName", this.ProcessName);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "QualifiedId", this.QualifiedId);
        this.setParamSimple(map, prefix + "Platform", this.Platform);
        this.setParamArrayObj(map, prefix + "ProcessProperties.", this.ProcessProperties);

    }
}

