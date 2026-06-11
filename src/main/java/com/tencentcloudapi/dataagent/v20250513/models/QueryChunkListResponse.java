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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryChunkListResponse extends AbstractModel {

    /**
    * <p>总数</p>
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * <p>文档的自动分段数</p>
    */
    @SerializedName("AutoTotal")
    @Expose
    private Long AutoTotal;

    /**
    * <p>文档的手动新建分段数</p>
    */
    @SerializedName("ManualTotal")
    @Expose
    private Long ManualTotal;

    /**
    * <p>分片信息</p>
    */
    @SerializedName("Chunks")
    @Expose
    private Chunk [] Chunks;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>总数</p> 
     * @return Total <p>总数</p>
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set <p>总数</p>
     * @param Total <p>总数</p>
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get <p>文档的自动分段数</p> 
     * @return AutoTotal <p>文档的自动分段数</p>
     */
    public Long getAutoTotal() {
        return this.AutoTotal;
    }

    /**
     * Set <p>文档的自动分段数</p>
     * @param AutoTotal <p>文档的自动分段数</p>
     */
    public void setAutoTotal(Long AutoTotal) {
        this.AutoTotal = AutoTotal;
    }

    /**
     * Get <p>文档的手动新建分段数</p> 
     * @return ManualTotal <p>文档的手动新建分段数</p>
     */
    public Long getManualTotal() {
        return this.ManualTotal;
    }

    /**
     * Set <p>文档的手动新建分段数</p>
     * @param ManualTotal <p>文档的手动新建分段数</p>
     */
    public void setManualTotal(Long ManualTotal) {
        this.ManualTotal = ManualTotal;
    }

    /**
     * Get <p>分片信息</p> 
     * @return Chunks <p>分片信息</p>
     */
    public Chunk [] getChunks() {
        return this.Chunks;
    }

    /**
     * Set <p>分片信息</p>
     * @param Chunks <p>分片信息</p>
     */
    public void setChunks(Chunk [] Chunks) {
        this.Chunks = Chunks;
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

    public QueryChunkListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryChunkListResponse(QueryChunkListResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.AutoTotal != null) {
            this.AutoTotal = new Long(source.AutoTotal);
        }
        if (source.ManualTotal != null) {
            this.ManualTotal = new Long(source.ManualTotal);
        }
        if (source.Chunks != null) {
            this.Chunks = new Chunk[source.Chunks.length];
            for (int i = 0; i < source.Chunks.length; i++) {
                this.Chunks[i] = new Chunk(source.Chunks[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "AutoTotal", this.AutoTotal);
        this.setParamSimple(map, prefix + "ManualTotal", this.ManualTotal);
        this.setParamArrayObj(map, prefix + "Chunks.", this.Chunks);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

