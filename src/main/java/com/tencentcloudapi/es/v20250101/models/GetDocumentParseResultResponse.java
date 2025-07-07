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
package com.tencentcloudapi.es.v20250101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDocumentParseResultResponse extends AbstractModel {

    /**
    * 任务状态，-1：失败，0：运行中，1：成功。
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 结果文件。
    */
    @SerializedName("DocumentParseResultUrl")
    @Expose
    private String DocumentParseResultUrl;

    /**
    * 失败的页码。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailedPages")
    @Expose
    private Long [] FailedPages;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 任务状态，-1：失败，0：运行中，1：成功。 
     * @return Status 任务状态，-1：失败，0：运行中，1：成功。
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 任务状态，-1：失败，0：运行中，1：成功。
     * @param Status 任务状态，-1：失败，0：运行中，1：成功。
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 结果文件。 
     * @return DocumentParseResultUrl 结果文件。
     */
    public String getDocumentParseResultUrl() {
        return this.DocumentParseResultUrl;
    }

    /**
     * Set 结果文件。
     * @param DocumentParseResultUrl 结果文件。
     */
    public void setDocumentParseResultUrl(String DocumentParseResultUrl) {
        this.DocumentParseResultUrl = DocumentParseResultUrl;
    }

    /**
     * Get 失败的页码。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailedPages 失败的页码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getFailedPages() {
        return this.FailedPages;
    }

    /**
     * Set 失败的页码。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailedPages 失败的页码。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailedPages(Long [] FailedPages) {
        this.FailedPages = FailedPages;
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

    public GetDocumentParseResultResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDocumentParseResultResponse(GetDocumentParseResultResponse source) {
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DocumentParseResultUrl != null) {
            this.DocumentParseResultUrl = new String(source.DocumentParseResultUrl);
        }
        if (source.FailedPages != null) {
            this.FailedPages = new Long[source.FailedPages.length];
            for (int i = 0; i < source.FailedPages.length; i++) {
                this.FailedPages[i] = new Long(source.FailedPages[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "DocumentParseResultUrl", this.DocumentParseResultUrl);
        this.setParamArraySimple(map, prefix + "FailedPages.", this.FailedPages);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

