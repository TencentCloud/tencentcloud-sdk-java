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

public class CloudAuditLog extends AbstractModel {

    /**
    * <p>审计日志 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuditLogId")
    @Expose
    private String AuditLogId;

    /**
    * <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * <p>动作发起者（主账号 UIN 或子账号 UIN）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Actor")
    @Expose
    private String Actor;

    /**
    * <p>Action 名称，等同 X-TC-Action。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * <p>动作脱敏摘要对象；使用云 API 字段命名，字段随 Action 而变；不包含凭据、预签名 URL 或完整 Descriptor。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Details")
    @Expose
    private String Details;

    /**
    * <p>动作发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>关联 Record ID；仅 Record / Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>关联 Version ID；仅 Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VersionId")
    @Expose
    private String VersionId;

    /**
     * Get <p>审计日志 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuditLogId <p>审计日志 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAuditLogId() {
        return this.AuditLogId;
    }

    /**
     * Set <p>审计日志 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuditLogId <p>审计日志 ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuditLogId(String AuditLogId) {
        this.AuditLogId = AuditLogId;
    }

    /**
     * Get <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegistryId <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegistryId <p>所属 Registry ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get <p>动作发起者（主账号 UIN 或子账号 UIN）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Actor <p>动作发起者（主账号 UIN 或子账号 UIN）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActor() {
        return this.Actor;
    }

    /**
     * Set <p>动作发起者（主账号 UIN 或子账号 UIN）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Actor <p>动作发起者（主账号 UIN 或子账号 UIN）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActor(String Actor) {
        this.Actor = Actor;
    }

    /**
     * Get <p>Action 名称，等同 X-TC-Action。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action <p>Action 名称，等同 X-TC-Action。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>Action 名称，等同 X-TC-Action。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action <p>Action 名称，等同 X-TC-Action。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get <p>动作脱敏摘要对象；使用云 API 字段命名，字段随 Action 而变；不包含凭据、预签名 URL 或完整 Descriptor。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Details <p>动作脱敏摘要对象；使用云 API 字段命名，字段随 Action 而变；不包含凭据、预签名 URL 或完整 Descriptor。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDetails() {
        return this.Details;
    }

    /**
     * Set <p>动作脱敏摘要对象；使用云 API 字段命名，字段随 Action 而变；不包含凭据、预签名 URL 或完整 Descriptor。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Details <p>动作脱敏摘要对象；使用云 API 字段命名，字段随 Action 而变；不包含凭据、预签名 URL 或完整 Descriptor。（JSON 字符串形式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetails(String Details) {
        this.Details = Details;
    }

    /**
     * Get <p>动作发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime <p>动作发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>动作发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime <p>动作发生时间。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>关联 Record ID；仅 Record / Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId <p>关联 Record ID；仅 Record / Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>关联 Record ID；仅 Record / Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId <p>关联 Record ID；仅 Record / Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>关联 Version ID；仅 Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VersionId <p>关联 Version ID；仅 Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVersionId() {
        return this.VersionId;
    }

    /**
     * Set <p>关联 Version ID；仅 Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param VersionId <p>关联 Version ID；仅 Version 相关动作。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersionId(String VersionId) {
        this.VersionId = VersionId;
    }

    public CloudAuditLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAuditLog(CloudAuditLog source) {
        if (source.AuditLogId != null) {
            this.AuditLogId = new String(source.AuditLogId);
        }
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Actor != null) {
            this.Actor = new String(source.Actor);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Details != null) {
            this.Details = new String(source.Details);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.VersionId != null) {
            this.VersionId = new String(source.VersionId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AuditLogId", this.AuditLogId);
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Actor", this.Actor);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Details", this.Details);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamSimple(map, prefix + "VersionId", this.VersionId);

    }
}

