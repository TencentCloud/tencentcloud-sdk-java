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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudRecordLabelMutation extends AbstractModel {

    /**
    * <p>操作类型。SET：创建或移动 Label；DELETE：删除自定义 Label（stable/latest 保留 Label 禁止删除）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * <p>Label 名称，长度 1..63，格式 ^[a-z][a-z0-9._-]{0,62}$，按小写规范化。stable、latest 为系统保留 Label。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>目标 Version ID。SET 时可选：省略表示未绑定（自定义 Label 允许，stable 禁止）；DELETE 时禁止携带。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
    * <p>变更原因，最大 1024 字符，可选。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
     * Get <p>操作类型。SET：创建或移动 Label；DELETE：删除自定义 Label（stable/latest 保留 Label 禁止删除）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operation <p>操作类型。SET：创建或移动 Label；DELETE：删除自定义 Label（stable/latest 保留 Label 禁止删除）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set <p>操作类型。SET：创建或移动 Label；DELETE：删除自定义 Label（stable/latest 保留 Label 禁止删除）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operation <p>操作类型。SET：创建或移动 Label；DELETE：删除自定义 Label（stable/latest 保留 Label 禁止删除）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get <p>Label 名称，长度 1..63，格式 ^[a-z][a-z0-9._-]{0,62}$，按小写规范化。stable、latest 为系统保留 Label。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name <p>Label 名称，长度 1..63，格式 ^[a-z][a-z0-9._-]{0,62}$，按小写规范化。stable、latest 为系统保留 Label。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>Label 名称，长度 1..63，格式 ^[a-z][a-z0-9._-]{0,62}$，按小写规范化。stable、latest 为系统保留 Label。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name <p>Label 名称，长度 1..63，格式 ^[a-z][a-z0-9._-]{0,62}$，按小写规范化。stable、latest 为系统保留 Label。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>目标 Version ID。SET 时可选：省略表示未绑定（自定义 Label 允许，stable 禁止）；DELETE 时禁止携带。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId <p>目标 Version ID。SET 时可选：省略表示未绑定（自定义 Label 允许，stable 禁止）；DELETE 时禁止携带。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>目标 Version ID。SET 时可选：省略表示未绑定（自定义 Label 允许，stable 禁止）；DELETE 时禁止携带。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId <p>目标 Version ID。SET 时可选：省略表示未绑定（自定义 Label 允许，stable 禁止）；DELETE 时禁止携带。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    /**
     * Get <p>变更原因，最大 1024 字符，可选。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Reason <p>变更原因，最大 1024 字符，可选。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set <p>变更原因，最大 1024 字符，可选。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Reason <p>变更原因，最大 1024 字符，可选。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public CloudRecordLabelMutation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudRecordLabelMutation(CloudRecordLabelMutation source) {
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);
        this.setParamSimple(map, prefix + "Reason", this.Reason);

    }
}

