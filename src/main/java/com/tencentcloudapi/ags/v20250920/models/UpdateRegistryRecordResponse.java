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

public class UpdateRegistryRecordResponse extends AbstractModel {

    /**
    * <p>更新后的 Record。</p>
    */
    @SerializedName("Record")
    @Expose
    private CloudRecord Record;

    /**
    * <p>Version 创建模式返回：本次创建的新 Version。</p>
    */
    @SerializedName("Version")
    @Expose
    private CloudRecordVersion Version;

    /**
    * <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadURL")
    @Expose
    private String UploadURL;

    /**
    * <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
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
     * Get <p>更新后的 Record。</p> 
     * @return Record <p>更新后的 Record。</p>
     */
    public CloudRecord getRecord() {
        return this.Record;
    }

    /**
     * Set <p>更新后的 Record。</p>
     * @param Record <p>更新后的 Record。</p>
     */
    public void setRecord(CloudRecord Record) {
        this.Record = Record;
    }

    /**
     * Get <p>Version 创建模式返回：本次创建的新 Version。</p> 
     * @return Version <p>Version 创建模式返回：本次创建的新 Version。</p>
     */
    public CloudRecordVersion getVersion() {
        return this.Version;
    }

    /**
     * Set <p>Version 创建模式返回：本次创建的新 Version。</p>
     * @param Version <p>Version 创建模式返回：本次创建的新 Version。</p>
     */
    public void setVersion(CloudRecordVersion Version) {
        this.Version = Version;
    }

    /**
     * Get <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadURL <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadURL() {
        return this.UploadURL;
    }

    /**
     * Set <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadURL <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadURL(String UploadURL) {
        this.UploadURL = UploadURL;
    }

    /**
     * Get <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentStatus <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContentStatus() {
        return this.ContentStatus;
    }

    /**
     * Set <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentStatus <p>Version 创建模式且 SkillSource.Type=TAR_PACKAGE 时返回。</p>
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

    public UpdateRegistryRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateRegistryRecordResponse(UpdateRegistryRecordResponse source) {
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
        this.setParamObj(map, prefix + "Record.", this.Record);
        this.setParamObj(map, prefix + "Version.", this.Version);
        this.setParamSimple(map, prefix + "UploadURL", this.UploadURL);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ContentStatus", this.ContentStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

