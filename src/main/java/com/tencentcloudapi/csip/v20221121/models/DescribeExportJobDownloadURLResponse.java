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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeExportJobDownloadURLResponse extends AbstractModel {

    /**
    * 下载URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadURL")
    @Expose
    private String DownloadURL;

    /**
    * 任务状态 RUNNING/SUCCESS/FAILURE
    */
    @SerializedName("ExportStatus")
    @Expose
    private String ExportStatus;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 下载URL
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadURL 下载URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDownloadURL() {
        return this.DownloadURL;
    }

    /**
     * Set 下载URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadURL 下载URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadURL(String DownloadURL) {
        this.DownloadURL = DownloadURL;
    }

    /**
     * Get 任务状态 RUNNING/SUCCESS/FAILURE 
     * @return ExportStatus 任务状态 RUNNING/SUCCESS/FAILURE
     */
    public String getExportStatus() {
        return this.ExportStatus;
    }

    /**
     * Set 任务状态 RUNNING/SUCCESS/FAILURE
     * @param ExportStatus 任务状态 RUNNING/SUCCESS/FAILURE
     */
    public void setExportStatus(String ExportStatus) {
        this.ExportStatus = ExportStatus;
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

    public DescribeExportJobDownloadURLResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeExportJobDownloadURLResponse(DescribeExportJobDownloadURLResponse source) {
        if (source.DownloadURL != null) {
            this.DownloadURL = new String(source.DownloadURL);
        }
        if (source.ExportStatus != null) {
            this.ExportStatus = new String(source.ExportStatus);
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
        this.setParamSimple(map, prefix + "ExportStatus", this.ExportStatus);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

