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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeJobLogResponse extends AbstractModel {

    /**
    * <p>日志行数据。</p>
    */
    @SerializedName("Lines")
    @Expose
    private String [] Lines;

    /**
    * <p>下一页游标（不透明令牌，原样透传回请求即可；无更多日志时不返回）。</p>
    */
    @SerializedName("Cursor")
    @Expose
    private String Cursor;

    /**
    * <p>是否还有更多日志。</p>
    */
    @SerializedName("HasMore")
    @Expose
    private Boolean HasMore;

    /**
    * <p>日志条目列表。</p>
    */
    @SerializedName("Results")
    @Expose
    private ClsLogEntry [] Results;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>日志行数据。</p> 
     * @return Lines <p>日志行数据。</p>
     */
    public String [] getLines() {
        return this.Lines;
    }

    /**
     * Set <p>日志行数据。</p>
     * @param Lines <p>日志行数据。</p>
     */
    public void setLines(String [] Lines) {
        this.Lines = Lines;
    }

    /**
     * Get <p>下一页游标（不透明令牌，原样透传回请求即可；无更多日志时不返回）。</p> 
     * @return Cursor <p>下一页游标（不透明令牌，原样透传回请求即可；无更多日志时不返回）。</p>
     */
    public String getCursor() {
        return this.Cursor;
    }

    /**
     * Set <p>下一页游标（不透明令牌，原样透传回请求即可；无更多日志时不返回）。</p>
     * @param Cursor <p>下一页游标（不透明令牌，原样透传回请求即可；无更多日志时不返回）。</p>
     */
    public void setCursor(String Cursor) {
        this.Cursor = Cursor;
    }

    /**
     * Get <p>是否还有更多日志。</p> 
     * @return HasMore <p>是否还有更多日志。</p>
     */
    public Boolean getHasMore() {
        return this.HasMore;
    }

    /**
     * Set <p>是否还有更多日志。</p>
     * @param HasMore <p>是否还有更多日志。</p>
     */
    public void setHasMore(Boolean HasMore) {
        this.HasMore = HasMore;
    }

    /**
     * Get <p>日志条目列表。</p> 
     * @return Results <p>日志条目列表。</p>
     */
    public ClsLogEntry [] getResults() {
        return this.Results;
    }

    /**
     * Set <p>日志条目列表。</p>
     * @param Results <p>日志条目列表。</p>
     */
    public void setResults(ClsLogEntry [] Results) {
        this.Results = Results;
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

    public DescribeJobLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeJobLogResponse(DescribeJobLogResponse source) {
        if (source.Lines != null) {
            this.Lines = new String[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new String(source.Lines[i]);
            }
        }
        if (source.Cursor != null) {
            this.Cursor = new String(source.Cursor);
        }
        if (source.HasMore != null) {
            this.HasMore = new Boolean(source.HasMore);
        }
        if (source.Results != null) {
            this.Results = new ClsLogEntry[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new ClsLogEntry(source.Results[i]);
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
        this.setParamArraySimple(map, prefix + "Lines.", this.Lines);
        this.setParamSimple(map, prefix + "Cursor", this.Cursor);
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

