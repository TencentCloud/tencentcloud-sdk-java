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
package com.tencentcloudapi.monitor.v20230616.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAIWorkbenchArtifactDownloadURLResponse extends AbstractModel {

    /**
    * <p>COS 预签名 HTTPS 下载 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadURL")
    @Expose
    private String DownloadURL;

    /**
    * <p>URL 过期时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredAt")
    @Expose
    private String ExpiredAt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>COS 预签名 HTTPS 下载 URL</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadURL <p>COS 预签名 HTTPS 下载 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadURL() {
        return this.DownloadURL;
    }

    /**
     * Set <p>COS 预签名 HTTPS 下载 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadURL <p>COS 预签名 HTTPS 下载 URL</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadURL(String DownloadURL) {
        this.DownloadURL = DownloadURL;
    }

    /**
     * Get <p>URL 过期时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredAt <p>URL 过期时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpiredAt() {
        return this.ExpiredAt;
    }

    /**
     * Set <p>URL 过期时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredAt <p>URL 过期时间（RFC3339 格式）</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredAt(String ExpiredAt) {
        this.ExpiredAt = ExpiredAt;
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

    public GetAIWorkbenchArtifactDownloadURLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAIWorkbenchArtifactDownloadURLResponse(GetAIWorkbenchArtifactDownloadURLResponse source) {
        if (source.DownloadURL != null) {
            this.DownloadURL = new String(source.DownloadURL);
        }
        if (source.ExpiredAt != null) {
            this.ExpiredAt = new String(source.ExpiredAt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DownloadURL", this.DownloadURL);
        this.setParamSimple(map, prefix + "ExpiredAt", this.ExpiredAt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

