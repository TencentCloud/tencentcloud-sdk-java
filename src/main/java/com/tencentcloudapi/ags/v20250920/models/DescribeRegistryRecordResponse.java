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

public class DescribeRegistryRecordResponse extends AbstractModel {

    /**
    * <p>Record 元数据和全部 Label。</p>
    */
    @SerializedName("Record")
    @Expose
    private CloudRecord Record;

    /**
    * <p>根据 VersionId / Label 解析得到的完整 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Version")
    @Expose
    private CloudRecordVersion Version;

    /**
    * <p>解析方式：DEFAULT_STABLE / LABEL / VERSION_ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResolvedBy")
    @Expose
    private String ResolvedBy;

    /**
    * <p>通过 Label 解析（ResolvedBy=LABEL 或 DEFAULT_STABLE）时返回该 Label 名称，例如 stable。</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResolvedLabel")
    @Expose
    private String ResolvedLabel;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>Record 元数据和全部 Label。</p> 
     * @return Record <p>Record 元数据和全部 Label。</p>
     */
    public CloudRecord getRecord() {
        return this.Record;
    }

    /**
     * Set <p>Record 元数据和全部 Label。</p>
     * @param Record <p>Record 元数据和全部 Label。</p>
     */
    public void setRecord(CloudRecord Record) {
        this.Record = Record;
    }

    /**
     * Get <p>根据 VersionId / Label 解析得到的完整 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Version <p>根据 VersionId / Label 解析得到的完整 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CloudRecordVersion getVersion() {
        return this.Version;
    }

    /**
     * Set <p>根据 VersionId / Label 解析得到的完整 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Version <p>根据 VersionId / Label 解析得到的完整 Version。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVersion(CloudRecordVersion Version) {
        this.Version = Version;
    }

    /**
     * Get <p>解析方式：DEFAULT_STABLE / LABEL / VERSION_ID。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResolvedBy <p>解析方式：DEFAULT_STABLE / LABEL / VERSION_ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResolvedBy() {
        return this.ResolvedBy;
    }

    /**
     * Set <p>解析方式：DEFAULT_STABLE / LABEL / VERSION_ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResolvedBy <p>解析方式：DEFAULT_STABLE / LABEL / VERSION_ID。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolvedBy(String ResolvedBy) {
        this.ResolvedBy = ResolvedBy;
    }

    /**
     * Get <p>通过 Label 解析（ResolvedBy=LABEL 或 DEFAULT_STABLE）时返回该 Label 名称，例如 stable。</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResolvedLabel <p>通过 Label 解析（ResolvedBy=LABEL 或 DEFAULT_STABLE）时返回该 Label 名称，例如 stable。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResolvedLabel() {
        return this.ResolvedLabel;
    }

    /**
     * Set <p>通过 Label 解析（ResolvedBy=LABEL 或 DEFAULT_STABLE）时返回该 Label 名称，例如 stable。</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResolvedLabel <p>通过 Label 解析（ResolvedBy=LABEL 或 DEFAULT_STABLE）时返回该 Label 名称，例如 stable。</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolvedLabel(String ResolvedLabel) {
        this.ResolvedLabel = ResolvedLabel;
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

    public DescribeRegistryRecordResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegistryRecordResponse(DescribeRegistryRecordResponse source) {
        if (source.Record != null) {
            this.Record = new CloudRecord(source.Record);
        }
        if (source.Version != null) {
            this.Version = new CloudRecordVersion(source.Version);
        }
        if (source.ResolvedBy != null) {
            this.ResolvedBy = new String(source.ResolvedBy);
        }
        if (source.ResolvedLabel != null) {
            this.ResolvedLabel = new String(source.ResolvedLabel);
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
        this.setParamSimple(map, prefix + "ResolvedBy", this.ResolvedBy);
        this.setParamSimple(map, prefix + "ResolvedLabel", this.ResolvedLabel);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

