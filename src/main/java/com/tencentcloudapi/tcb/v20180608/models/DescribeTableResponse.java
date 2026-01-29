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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTableResponse extends AbstractModel {

    /**
    * 索引相关信息
    */
    @SerializedName("Indexes")
    @Expose
    private IndexInfo [] Indexes;

    /**
    * 索引个数
    */
    @SerializedName("IndexNum")
    @Expose
    private Long IndexNum;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 索引相关信息 
     * @return Indexes 索引相关信息
     */
    public IndexInfo [] getIndexes() {
        return this.Indexes;
    }

    /**
     * Set 索引相关信息
     * @param Indexes 索引相关信息
     */
    public void setIndexes(IndexInfo [] Indexes) {
        this.Indexes = Indexes;
    }

    /**
     * Get 索引个数 
     * @return IndexNum 索引个数
     */
    public Long getIndexNum() {
        return this.IndexNum;
    }

    /**
     * Set 索引个数
     * @param IndexNum 索引个数
     */
    public void setIndexNum(Long IndexNum) {
        this.IndexNum = IndexNum;
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

    public DescribeTableResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTableResponse(DescribeTableResponse source) {
        if (source.Indexes != null) {
            this.Indexes = new IndexInfo[source.Indexes.length];
            for (int i = 0; i < source.Indexes.length; i++) {
                this.Indexes[i] = new IndexInfo(source.Indexes[i]);
            }
        }
        if (source.IndexNum != null) {
            this.IndexNum = new Long(source.IndexNum);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Indexes.", this.Indexes);
        this.setParamSimple(map, prefix + "IndexNum", this.IndexNum);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

