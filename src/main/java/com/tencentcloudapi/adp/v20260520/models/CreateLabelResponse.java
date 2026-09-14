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

public class CreateLabelResponse extends AbstractModel {

    /**
    * <p>标签 ID</p>
    */
    @SerializedName("LabelId")
    @Expose
    private String LabelId;

    /**
    * <p>标签值（标准词 + 同义词列表，含后台生成的 term_id）</p>
    */
    @SerializedName("TermList")
    @Expose
    private LabelTerm [] TermList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>标签 ID</p> 
     * @return LabelId <p>标签 ID</p>
     */
    public String getLabelId() {
        return this.LabelId;
    }

    /**
     * Set <p>标签 ID</p>
     * @param LabelId <p>标签 ID</p>
     */
    public void setLabelId(String LabelId) {
        this.LabelId = LabelId;
    }

    /**
     * Get <p>标签值（标准词 + 同义词列表，含后台生成的 term_id）</p> 
     * @return TermList <p>标签值（标准词 + 同义词列表，含后台生成的 term_id）</p>
     */
    public LabelTerm [] getTermList() {
        return this.TermList;
    }

    /**
     * Set <p>标签值（标准词 + 同义词列表，含后台生成的 term_id）</p>
     * @param TermList <p>标签值（标准词 + 同义词列表，含后台生成的 term_id）</p>
     */
    public void setTermList(LabelTerm [] TermList) {
        this.TermList = TermList;
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

    public CreateLabelResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateLabelResponse(CreateLabelResponse source) {
        if (source.LabelId != null) {
            this.LabelId = new String(source.LabelId);
        }
        if (source.TermList != null) {
            this.TermList = new LabelTerm[source.TermList.length];
            for (int i = 0; i < source.TermList.length; i++) {
                this.TermList[i] = new LabelTerm(source.TermList[i]);
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
        this.setParamSimple(map, prefix + "LabelId", this.LabelId);
        this.setParamArrayObj(map, prefix + "TermList.", this.TermList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

