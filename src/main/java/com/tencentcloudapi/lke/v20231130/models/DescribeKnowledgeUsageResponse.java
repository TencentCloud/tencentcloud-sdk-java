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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeKnowledgeUsageResponse extends AbstractModel {

    /**
    * 可用字符数上限
    */
    @SerializedName("AvailableCharSize")
    @Expose
    private String AvailableCharSize;

    /**
    * 超过可用字符数上限的字符数
    */
    @SerializedName("ExceedCharSize")
    @Expose
    private String ExceedCharSize;

    /**
    * 知识库使用字符总数
    */
    @SerializedName("UsedCharSize")
    @Expose
    private String UsedCharSize;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 可用字符数上限 
     * @return AvailableCharSize 可用字符数上限
     */
    public String getAvailableCharSize() {
        return this.AvailableCharSize;
    }

    /**
     * Set 可用字符数上限
     * @param AvailableCharSize 可用字符数上限
     */
    public void setAvailableCharSize(String AvailableCharSize) {
        this.AvailableCharSize = AvailableCharSize;
    }

    /**
     * Get 超过可用字符数上限的字符数 
     * @return ExceedCharSize 超过可用字符数上限的字符数
     */
    public String getExceedCharSize() {
        return this.ExceedCharSize;
    }

    /**
     * Set 超过可用字符数上限的字符数
     * @param ExceedCharSize 超过可用字符数上限的字符数
     */
    public void setExceedCharSize(String ExceedCharSize) {
        this.ExceedCharSize = ExceedCharSize;
    }

    /**
     * Get 知识库使用字符总数 
     * @return UsedCharSize 知识库使用字符总数
     */
    public String getUsedCharSize() {
        return this.UsedCharSize;
    }

    /**
     * Set 知识库使用字符总数
     * @param UsedCharSize 知识库使用字符总数
     */
    public void setUsedCharSize(String UsedCharSize) {
        this.UsedCharSize = UsedCharSize;
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

    public DescribeKnowledgeUsageResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeKnowledgeUsageResponse(DescribeKnowledgeUsageResponse source) {
        if (source.AvailableCharSize != null) {
            this.AvailableCharSize = new String(source.AvailableCharSize);
        }
        if (source.ExceedCharSize != null) {
            this.ExceedCharSize = new String(source.ExceedCharSize);
        }
        if (source.UsedCharSize != null) {
            this.UsedCharSize = new String(source.UsedCharSize);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AvailableCharSize", this.AvailableCharSize);
        this.setParamSimple(map, prefix + "ExceedCharSize", this.ExceedCharSize);
        this.setParamSimple(map, prefix + "UsedCharSize", this.UsedCharSize);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

