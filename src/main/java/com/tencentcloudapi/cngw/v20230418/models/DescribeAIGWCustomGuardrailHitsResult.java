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
package com.tencentcloudapi.cngw.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAIGWCustomGuardrailHitsResult extends AbstractModel {

    /**
    * <p>时间范围和过滤条件内匹配的审核日志总数，分页前统计；不再限定为最多 1000 条。日志异常条目可能无法解析为 Hits。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>当前页审核记录，按时间倒序；同一业务请求的多次送审会产生多条记录，不能直接把条数当业务请求数。</p>
    */
    @SerializedName("Hits")
    @Expose
    private CustomGuardrailHit [] Hits;

    /**
    * <p>兼容字段，当前分页查询返回 false；用 Offset、Limit、TotalCount 翻页。1000 条限制只适用于导出接口。</p>
    */
    @SerializedName("Truncated")
    @Expose
    private Boolean Truncated;

    /**
     * Get <p>时间范围和过滤条件内匹配的审核日志总数，分页前统计；不再限定为最多 1000 条。日志异常条目可能无法解析为 Hits。</p> 
     * @return TotalCount <p>时间范围和过滤条件内匹配的审核日志总数，分页前统计；不再限定为最多 1000 条。日志异常条目可能无法解析为 Hits。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>时间范围和过滤条件内匹配的审核日志总数，分页前统计；不再限定为最多 1000 条。日志异常条目可能无法解析为 Hits。</p>
     * @param TotalCount <p>时间范围和过滤条件内匹配的审核日志总数，分页前统计；不再限定为最多 1000 条。日志异常条目可能无法解析为 Hits。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>当前页审核记录，按时间倒序；同一业务请求的多次送审会产生多条记录，不能直接把条数当业务请求数。</p> 
     * @return Hits <p>当前页审核记录，按时间倒序；同一业务请求的多次送审会产生多条记录，不能直接把条数当业务请求数。</p>
     */
    public CustomGuardrailHit [] getHits() {
        return this.Hits;
    }

    /**
     * Set <p>当前页审核记录，按时间倒序；同一业务请求的多次送审会产生多条记录，不能直接把条数当业务请求数。</p>
     * @param Hits <p>当前页审核记录，按时间倒序；同一业务请求的多次送审会产生多条记录，不能直接把条数当业务请求数。</p>
     */
    public void setHits(CustomGuardrailHit [] Hits) {
        this.Hits = Hits;
    }

    /**
     * Get <p>兼容字段，当前分页查询返回 false；用 Offset、Limit、TotalCount 翻页。1000 条限制只适用于导出接口。</p> 
     * @return Truncated <p>兼容字段，当前分页查询返回 false；用 Offset、Limit、TotalCount 翻页。1000 条限制只适用于导出接口。</p>
     */
    public Boolean getTruncated() {
        return this.Truncated;
    }

    /**
     * Set <p>兼容字段，当前分页查询返回 false；用 Offset、Limit、TotalCount 翻页。1000 条限制只适用于导出接口。</p>
     * @param Truncated <p>兼容字段，当前分页查询返回 false；用 Offset、Limit、TotalCount 翻页。1000 条限制只适用于导出接口。</p>
     */
    public void setTruncated(Boolean Truncated) {
        this.Truncated = Truncated;
    }

    public DescribeAIGWCustomGuardrailHitsResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAIGWCustomGuardrailHitsResult(DescribeAIGWCustomGuardrailHitsResult source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.Hits != null) {
            this.Hits = new CustomGuardrailHit[source.Hits.length];
            for (int i = 0; i < source.Hits.length; i++) {
                this.Hits[i] = new CustomGuardrailHit(source.Hits[i]);
            }
        }
        if (source.Truncated != null) {
            this.Truncated = new Boolean(source.Truncated);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "Hits.", this.Hits);
        this.setParamSimple(map, prefix + "Truncated", this.Truncated);

    }
}

