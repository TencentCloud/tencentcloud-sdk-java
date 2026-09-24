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

public class SyncRegistryRecordResponse extends AbstractModel {

    /**
    * <p>同步结果：UNCHANGED（远端无变化）/ VERSION_CREATED（远端有变化，已生成新 Version）/ FAILED（同步失败）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SyncStatus")
    @Expose
    private String SyncStatus;

    /**
    * <p>作为同步来源解析出的 Version ID（可能由 Label 解析而来）；不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResolvedVersionId")
    @Expose
    private String ResolvedVersionId;

    /**
    * <p>SyncStatus=VERSION_CREATED 时返回：本次新建的 Version。</p>
    */
    @SerializedName("CreatedVersion")
    @Expose
    private CloudRecordVersion CreatedVersion;

    /**
    * <p>SyncStatus=VERSION_CREATED 时返回：同步后的最新 Record。</p>
    */
    @SerializedName("Record")
    @Expose
    private CloudRecord Record;

    /**
    * <p>最后一次同步时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LastSyncTime")
    @Expose
    private String LastSyncTime;

    /**
    * <p>失败错误码；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorCode")
    @Expose
    private String ErrorCode;

    /**
    * <p>失败错误信息；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ErrorMessage")
    @Expose
    private String ErrorMessage;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>同步结果：UNCHANGED（远端无变化）/ VERSION_CREATED（远端有变化，已生成新 Version）/ FAILED（同步失败）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SyncStatus <p>同步结果：UNCHANGED（远端无变化）/ VERSION_CREATED（远端有变化，已生成新 Version）/ FAILED（同步失败）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSyncStatus() {
        return this.SyncStatus;
    }

    /**
     * Set <p>同步结果：UNCHANGED（远端无变化）/ VERSION_CREATED（远端有变化，已生成新 Version）/ FAILED（同步失败）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param SyncStatus <p>同步结果：UNCHANGED（远端无变化）/ VERSION_CREATED（远端有变化，已生成新 Version）/ FAILED（同步失败）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSyncStatus(String SyncStatus) {
        this.SyncStatus = SyncStatus;
    }

    /**
     * Get <p>作为同步来源解析出的 Version ID（可能由 Label 解析而来）；不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResolvedVersionId <p>作为同步来源解析出的 Version ID（可能由 Label 解析而来）；不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResolvedVersionId() {
        return this.ResolvedVersionId;
    }

    /**
     * Set <p>作为同步来源解析出的 Version ID（可能由 Label 解析而来）；不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResolvedVersionId <p>作为同步来源解析出的 Version ID（可能由 Label 解析而来）；不为空。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolvedVersionId(String ResolvedVersionId) {
        this.ResolvedVersionId = ResolvedVersionId;
    }

    /**
     * Get <p>SyncStatus=VERSION_CREATED 时返回：本次新建的 Version。</p> 
     * @return CreatedVersion <p>SyncStatus=VERSION_CREATED 时返回：本次新建的 Version。</p>
     */
    public CloudRecordVersion getCreatedVersion() {
        return this.CreatedVersion;
    }

    /**
     * Set <p>SyncStatus=VERSION_CREATED 时返回：本次新建的 Version。</p>
     * @param CreatedVersion <p>SyncStatus=VERSION_CREATED 时返回：本次新建的 Version。</p>
     */
    public void setCreatedVersion(CloudRecordVersion CreatedVersion) {
        this.CreatedVersion = CreatedVersion;
    }

    /**
     * Get <p>SyncStatus=VERSION_CREATED 时返回：同步后的最新 Record。</p> 
     * @return Record <p>SyncStatus=VERSION_CREATED 时返回：同步后的最新 Record。</p>
     */
    public CloudRecord getRecord() {
        return this.Record;
    }

    /**
     * Set <p>SyncStatus=VERSION_CREATED 时返回：同步后的最新 Record。</p>
     * @param Record <p>SyncStatus=VERSION_CREATED 时返回：同步后的最新 Record。</p>
     */
    public void setRecord(CloudRecord Record) {
        this.Record = Record;
    }

    /**
     * Get <p>最后一次同步时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LastSyncTime <p>最后一次同步时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLastSyncTime() {
        return this.LastSyncTime;
    }

    /**
     * Set <p>最后一次同步时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param LastSyncTime <p>最后一次同步时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLastSyncTime(String LastSyncTime) {
        this.LastSyncTime = LastSyncTime;
    }

    /**
     * Get <p>失败错误码；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorCode <p>失败错误码；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorCode() {
        return this.ErrorCode;
    }

    /**
     * Set <p>失败错误码；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorCode <p>失败错误码；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorCode(String ErrorCode) {
        this.ErrorCode = ErrorCode;
    }

    /**
     * Get <p>失败错误信息；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ErrorMessage <p>失败错误信息；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getErrorMessage() {
        return this.ErrorMessage;
    }

    /**
     * Set <p>失败错误信息；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ErrorMessage <p>失败错误信息；SyncStatus=FAILED 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setErrorMessage(String ErrorMessage) {
        this.ErrorMessage = ErrorMessage;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public SyncRegistryRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SyncRegistryRecordResponse(SyncRegistryRecordResponse source) {
        if (source.SyncStatus != null) {
            this.SyncStatus = new String(source.SyncStatus);
        }
        if (source.ResolvedVersionId != null) {
            this.ResolvedVersionId = new String(source.ResolvedVersionId);
        }
        if (source.CreatedVersion != null) {
            this.CreatedVersion = new CloudRecordVersion(source.CreatedVersion);
        }
        if (source.Record != null) {
            this.Record = new CloudRecord(source.Record);
        }
        if (source.LastSyncTime != null) {
            this.LastSyncTime = new String(source.LastSyncTime);
        }
        if (source.ErrorCode != null) {
            this.ErrorCode = new String(source.ErrorCode);
        }
        if (source.ErrorMessage != null) {
            this.ErrorMessage = new String(source.ErrorMessage);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SyncStatus", this.SyncStatus);
        this.setParamSimple(map, prefix + "ResolvedVersionId", this.ResolvedVersionId);
        this.setParamObj(map, prefix + "CreatedVersion.", this.CreatedVersion);
        this.setParamObj(map, prefix + "Record.", this.Record);
        this.setParamSimple(map, prefix + "LastSyncTime", this.LastSyncTime);
        this.setParamSimple(map, prefix + "ErrorCode", this.ErrorCode);
        this.setParamSimple(map, prefix + "ErrorMessage", this.ErrorMessage);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

