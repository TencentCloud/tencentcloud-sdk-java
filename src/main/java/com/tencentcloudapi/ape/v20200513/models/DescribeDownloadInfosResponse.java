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
package com.tencentcloudapi.ape.v20200513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDownloadInfosResponse extends AbstractModel {

    /**
    * 核销下载记录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DownloadInfos")
    @Expose
    private DownloadInfo [] DownloadInfos;

    /**
    * 总记录数量
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 核销下载记录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DownloadInfos 核销下载记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DownloadInfo [] getDownloadInfos() {
        return this.DownloadInfos;
    }

    /**
     * Set 核销下载记录
注意：此字段可能返回 null，表示取不到有效值。
     * @param DownloadInfos 核销下载记录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDownloadInfos(DownloadInfo [] DownloadInfos) {
        this.DownloadInfos = DownloadInfos;
    }

    /**
     * Get 总记录数量 
     * @return TotalCount 总记录数量
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总记录数量
     * @param TotalCount 总记录数量
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDownloadInfosResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDownloadInfosResponse(DescribeDownloadInfosResponse source) {
        if (source.DownloadInfos != null) {
            this.DownloadInfos = new DownloadInfo[source.DownloadInfos.length];
            for (int i = 0; i < source.DownloadInfos.length; i++) {
                this.DownloadInfos[i] = new DownloadInfo(source.DownloadInfos[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DownloadInfos.", this.DownloadInfos);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

