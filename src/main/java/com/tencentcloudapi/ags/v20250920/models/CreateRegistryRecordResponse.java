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

public class CreateRegistryRecordResponse extends AbstractModel {

    /**
    * <p>新 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RecordId")
    @Expose
    private String RecordId;

    /**
    * <p>新建的 Record 详情。</p>
    */
    @SerializedName("Record")
    @Expose
    private CloudRecord Record;

    /**
    * <p>本次创建的 Revision 1 Version 详情。</p>
    */
    @SerializedName("Version")
    @Expose
    private CloudRecordVersion Version;

    /**
    * <p>SkillSource.Type=TAR_PACKAGE 时返回：TAR 包上传预签名 URL。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadURL")
    @Expose
    private String UploadURL;

    /**
    * <p>SkillSource.Type=TAR_PACKAGE 时返回：UploadURL 过期时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>SkillSource.Type=TAR_PACKAGE 时返回：Version 内容当前状态（UPLOADING 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentStatus")
    @Expose
    private String ContentStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>新 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RecordId <p>新 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRecordId() {
        return this.RecordId;
    }

    /**
     * Set <p>新 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param RecordId <p>新 Record ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRecordId(String RecordId) {
        this.RecordId = RecordId;
    }

    /**
     * Get <p>新建的 Record 详情。</p> 
     * @return Record <p>新建的 Record 详情。</p>
     */
    public CloudRecord getRecord() {
        return this.Record;
    }

    /**
     * Set <p>新建的 Record 详情。</p>
     * @param Record <p>新建的 Record 详情。</p>
     */
    public void setRecord(CloudRecord Record) {
        this.Record = Record;
    }

    /**
     * Get <p>本次创建的 Revision 1 Version 详情。</p> 
     * @return Version <p>本次创建的 Revision 1 Version 详情。</p>
     */
    public CloudRecordVersion getVersion() {
        return this.Version;
    }

    /**
     * Set <p>本次创建的 Revision 1 Version 详情。</p>
     * @param Version <p>本次创建的 Revision 1 Version 详情。</p>
     */
    public void setVersion(CloudRecordVersion Version) {
        this.Version = Version;
    }

    /**
     * Get <p>SkillSource.Type=TAR_PACKAGE 时返回：TAR 包上传预签名 URL。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadURL <p>SkillSource.Type=TAR_PACKAGE 时返回：TAR 包上传预签名 URL。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadURL() {
        return this.UploadURL;
    }

    /**
     * Set <p>SkillSource.Type=TAR_PACKAGE 时返回：TAR 包上传预签名 URL。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadURL <p>SkillSource.Type=TAR_PACKAGE 时返回：TAR 包上传预签名 URL。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadURL(String UploadURL) {
        this.UploadURL = UploadURL;
    }

    /**
     * Get <p>SkillSource.Type=TAR_PACKAGE 时返回：UploadURL 过期时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>SkillSource.Type=TAR_PACKAGE 时返回：UploadURL 过期时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>SkillSource.Type=TAR_PACKAGE 时返回：UploadURL 过期时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>SkillSource.Type=TAR_PACKAGE 时返回：UploadURL 过期时间，ISO 8601 UTC。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>SkillSource.Type=TAR_PACKAGE 时返回：Version 内容当前状态（UPLOADING 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentStatus <p>SkillSource.Type=TAR_PACKAGE 时返回：Version 内容当前状态（UPLOADING 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentStatus() {
        return this.ContentStatus;
    }

    /**
     * Set <p>SkillSource.Type=TAR_PACKAGE 时返回：Version 内容当前状态（UPLOADING 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentStatus <p>SkillSource.Type=TAR_PACKAGE 时返回：Version 内容当前状态（UPLOADING 等）。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentStatus(String ContentStatus) {
        this.ContentStatus = ContentStatus;
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

    public CreateRegistryRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRegistryRecordResponse(CreateRegistryRecordResponse source) {
        if (source.RecordId != null) {
            this.RecordId = new String(source.RecordId);
        }
        if (source.Record != null) {
            this.Record = new CloudRecord(source.Record);
        }
        if (source.Version != null) {
            this.Version = new CloudRecordVersion(source.Version);
        }
        if (source.UploadURL != null) {
            this.UploadURL = new String(source.UploadURL);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ContentStatus != null) {
            this.ContentStatus = new String(source.ContentStatus);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecordId", this.RecordId);
        this.setParamObj(map, prefix + "Record.", this.Record);
        this.setParamObj(map, prefix + "Version.", this.Version);
        this.setParamSimple(map, prefix + "UploadURL", this.UploadURL);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ContentStatus", this.ContentStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

