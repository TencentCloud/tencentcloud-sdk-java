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
package com.tencentcloudapi.faceid.v20180301.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetAttackDetailRequest extends AbstractModel {

    /**
    * <p>待查询的检测请求 ID，来自上游检测接口（如 <code>DetectAIFakeFaces</code>）返回的 <code>RequestId</code>。长度 32 ~ 64，仅支持数字、字母及短横线 <code>-</code>。检测结果保留期为 3 天，超期后将返回 <code>ResourceUnavailable.ResultExpired</code>。</p>
    */
    @SerializedName("SeqId")
    @Expose
    private String SeqId;

    /**
     * Get <p>待查询的检测请求 ID，来自上游检测接口（如 <code>DetectAIFakeFaces</code>）返回的 <code>RequestId</code>。长度 32 ~ 64，仅支持数字、字母及短横线 <code>-</code>。检测结果保留期为 3 天，超期后将返回 <code>ResourceUnavailable.ResultExpired</code>。</p> 
     * @return SeqId <p>待查询的检测请求 ID，来自上游检测接口（如 <code>DetectAIFakeFaces</code>）返回的 <code>RequestId</code>。长度 32 ~ 64，仅支持数字、字母及短横线 <code>-</code>。检测结果保留期为 3 天，超期后将返回 <code>ResourceUnavailable.ResultExpired</code>。</p>
     */
    public String getSeqId() {
        return this.SeqId;
    }

    /**
     * Set <p>待查询的检测请求 ID，来自上游检测接口（如 <code>DetectAIFakeFaces</code>）返回的 <code>RequestId</code>。长度 32 ~ 64，仅支持数字、字母及短横线 <code>-</code>。检测结果保留期为 3 天，超期后将返回 <code>ResourceUnavailable.ResultExpired</code>。</p>
     * @param SeqId <p>待查询的检测请求 ID，来自上游检测接口（如 <code>DetectAIFakeFaces</code>）返回的 <code>RequestId</code>。长度 32 ~ 64，仅支持数字、字母及短横线 <code>-</code>。检测结果保留期为 3 天，超期后将返回 <code>ResourceUnavailable.ResultExpired</code>。</p>
     */
    public void setSeqId(String SeqId) {
        this.SeqId = SeqId;
    }

    public GetAttackDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetAttackDetailRequest(GetAttackDetailRequest source) {
        if (source.SeqId != null) {
            this.SeqId = new String(source.SeqId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SeqId", this.SeqId);

    }
}

