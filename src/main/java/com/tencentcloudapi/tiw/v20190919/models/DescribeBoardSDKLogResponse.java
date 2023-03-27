/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.tiw.v20190919.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBoardSDKLogResponse extends AbstractModel{

    /**
    * 总共能查到日志条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 日志详细内容
    */
    @SerializedName("Sources")
    @Expose
    private String [] Sources;

    /**
    * 按时间段聚合后每个时间段的日志条数
    */
    @SerializedName("Buckets")
    @Expose
    private String [] Buckets;

    /**
    * 用于递归拉取的上下文Key，下一次请求的时候带上
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总共能查到日志条数 
     * @return Total 总共能查到日志条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总共能查到日志条数
     * @param Total 总共能查到日志条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 日志详细内容 
     * @return Sources 日志详细内容
     */
    public String [] getSources() {
        return this.Sources;
    }

    /**
     * Set 日志详细内容
     * @param Sources 日志详细内容
     */
    public void setSources(String [] Sources) {
        this.Sources = Sources;
    }

    /**
     * Get 按时间段聚合后每个时间段的日志条数 
     * @return Buckets 按时间段聚合后每个时间段的日志条数
     */
    public String [] getBuckets() {
        return this.Buckets;
    }

    /**
     * Set 按时间段聚合后每个时间段的日志条数
     * @param Buckets 按时间段聚合后每个时间段的日志条数
     */
    public void setBuckets(String [] Buckets) {
        this.Buckets = Buckets;
    }

    /**
     * Get 用于递归拉取的上下文Key，下一次请求的时候带上 
     * @return Context 用于递归拉取的上下文Key，下一次请求的时候带上
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 用于递归拉取的上下文Key，下一次请求的时候带上
     * @param Context 用于递归拉取的上下文Key，下一次请求的时候带上
     */
    public void setContext(String Context) {
        this.Context = Context;
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

    public DescribeBoardSDKLogResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBoardSDKLogResponse(DescribeBoardSDKLogResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.Sources != null) {
            this.Sources = new String[source.Sources.length];
            for (int i = 0; i < source.Sources.length; i++) {
                this.Sources[i] = new String(source.Sources[i]);
            }
        }
        if (source.Buckets != null) {
            this.Buckets = new String[source.Buckets.length];
            for (int i = 0; i < source.Buckets.length; i++) {
                this.Buckets[i] = new String(source.Buckets[i]);
            }
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
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
        this.setParamArraySimple(map, prefix + "Sources.", this.Sources);
        this.setParamArraySimple(map, prefix + "Buckets.", this.Buckets);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

