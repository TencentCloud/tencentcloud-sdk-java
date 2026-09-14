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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeQASummaryListResponse extends AbstractModel {

    /**
    * <p>未采纳数量</p>
    */
    @SerializedName("NotAcceptedCount")
    @Expose
    private Long NotAcceptedCount;

    /**
    * <p>待校验数量</p>
    */
    @SerializedName("PendingVerifyCount")
    @Expose
    private Long PendingVerifyCount;

    /**
    * <p>QA 列表</p>
    */
    @SerializedName("QaList")
    @Expose
    private QASummary [] QaList;

    /**
    * <p>总数</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>未采纳数量</p> 
     * @return NotAcceptedCount <p>未采纳数量</p>
     */
    public Long getNotAcceptedCount() {
        return this.NotAcceptedCount;
    }

    /**
     * Set <p>未采纳数量</p>
     * @param NotAcceptedCount <p>未采纳数量</p>
     */
    public void setNotAcceptedCount(Long NotAcceptedCount) {
        this.NotAcceptedCount = NotAcceptedCount;
    }

    /**
     * Get <p>待校验数量</p> 
     * @return PendingVerifyCount <p>待校验数量</p>
     */
    public Long getPendingVerifyCount() {
        return this.PendingVerifyCount;
    }

    /**
     * Set <p>待校验数量</p>
     * @param PendingVerifyCount <p>待校验数量</p>
     */
    public void setPendingVerifyCount(Long PendingVerifyCount) {
        this.PendingVerifyCount = PendingVerifyCount;
    }

    /**
     * Get <p>QA 列表</p> 
     * @return QaList <p>QA 列表</p>
     */
    public QASummary [] getQaList() {
        return this.QaList;
    }

    /**
     * Set <p>QA 列表</p>
     * @param QaList <p>QA 列表</p>
     */
    public void setQaList(QASummary [] QaList) {
        this.QaList = QaList;
    }

    /**
     * Get <p>总数</p> 
     * @return TotalCount <p>总数</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>总数</p>
     * @param TotalCount <p>总数</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
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

    public DescribeQASummaryListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeQASummaryListResponse(DescribeQASummaryListResponse source) {
        if (source.NotAcceptedCount != null) {
            this.NotAcceptedCount = new Long(source.NotAcceptedCount);
        }
        if (source.PendingVerifyCount != null) {
            this.PendingVerifyCount = new Long(source.PendingVerifyCount);
        }
        if (source.QaList != null) {
            this.QaList = new QASummary[source.QaList.length];
            for (int i = 0; i < source.QaList.length; i++) {
                this.QaList[i] = new QASummary(source.QaList[i]);
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
        this.setParamSimple(map, prefix + "NotAcceptedCount", this.NotAcceptedCount);
        this.setParamSimple(map, prefix + "PendingVerifyCount", this.PendingVerifyCount);
        this.setParamArrayObj(map, prefix + "QaList.", this.QaList);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

