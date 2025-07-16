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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteAuditKeywordsResponse extends AbstractModel {

    /**
    * 成功删除关键词的数量。
    */
    @SerializedName("SuccessCount")
    @Expose
    private Long SuccessCount;

    /**
    * 关键词详情列表。
    */
    @SerializedName("Infos")
    @Expose
    private AuditKeywordDeleteDetail [] Infos;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 成功删除关键词的数量。 
     * @return SuccessCount 成功删除关键词的数量。
     */
    public Long getSuccessCount() {
        return this.SuccessCount;
    }

    /**
     * Set 成功删除关键词的数量。
     * @param SuccessCount 成功删除关键词的数量。
     */
    public void setSuccessCount(Long SuccessCount) {
        this.SuccessCount = SuccessCount;
    }

    /**
     * Get 关键词详情列表。 
     * @return Infos 关键词详情列表。
     */
    public AuditKeywordDeleteDetail [] getInfos() {
        return this.Infos;
    }

    /**
     * Set 关键词详情列表。
     * @param Infos 关键词详情列表。
     */
    public void setInfos(AuditKeywordDeleteDetail [] Infos) {
        this.Infos = Infos;
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

    public DeleteAuditKeywordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteAuditKeywordsResponse(DeleteAuditKeywordsResponse source) {
        if (source.SuccessCount != null) {
            this.SuccessCount = new Long(source.SuccessCount);
        }
        if (source.Infos != null) {
            this.Infos = new AuditKeywordDeleteDetail[source.Infos.length];
            for (int i = 0; i < source.Infos.length; i++) {
                this.Infos[i] = new AuditKeywordDeleteDetail(source.Infos[i]);
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
        this.setParamSimple(map, prefix + "SuccessCount", this.SuccessCount);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

