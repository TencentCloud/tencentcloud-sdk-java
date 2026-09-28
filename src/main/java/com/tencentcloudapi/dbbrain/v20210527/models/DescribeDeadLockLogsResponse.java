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
package com.tencentcloudapi.dbbrain.v20210527.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeadLockLogsResponse extends AbstractModel {

    /**
    * <p>是否还有更多分页。true 表示 Offset+Limit &lt; TotalCount，客户端可用 Offset+Limit 与本次 ResultVersion 继续翻页。</p>
    */
    @SerializedName("HasMore")
    @Expose
    private Boolean HasMore;

    /**
    * <p>当前查询窗口内可用的死锁事件总数（去重、关联、时间窗口过滤后）。</p>
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * <p>结果集版本号（SHA-256 十六进制）。同一批数据在同一查询条件下保持不变；数据发生变化时版本变化。翻页必须透传。</p>
    */
    @SerializedName("ResultVersion")
    @Expose
    private String ResultVersion;

    /**
    * <p>死锁事件列表。按事件时间倒序排列（最近的死锁在前）。</p>
    */
    @SerializedName("Items")
    @Expose
    private DeadLockLogItem [] Items;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>是否还有更多分页。true 表示 Offset+Limit &lt; TotalCount，客户端可用 Offset+Limit 与本次 ResultVersion 继续翻页。</p> 
     * @return HasMore <p>是否还有更多分页。true 表示 Offset+Limit &lt; TotalCount，客户端可用 Offset+Limit 与本次 ResultVersion 继续翻页。</p>
     */
    public Boolean getHasMore() {
        return this.HasMore;
    }

    /**
     * Set <p>是否还有更多分页。true 表示 Offset+Limit &lt; TotalCount，客户端可用 Offset+Limit 与本次 ResultVersion 继续翻页。</p>
     * @param HasMore <p>是否还有更多分页。true 表示 Offset+Limit &lt; TotalCount，客户端可用 Offset+Limit 与本次 ResultVersion 继续翻页。</p>
     */
    public void setHasMore(Boolean HasMore) {
        this.HasMore = HasMore;
    }

    /**
     * Get <p>当前查询窗口内可用的死锁事件总数（去重、关联、时间窗口过滤后）。</p> 
     * @return TotalCount <p>当前查询窗口内可用的死锁事件总数（去重、关联、时间窗口过滤后）。</p>
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set <p>当前查询窗口内可用的死锁事件总数（去重、关联、时间窗口过滤后）。</p>
     * @param TotalCount <p>当前查询窗口内可用的死锁事件总数（去重、关联、时间窗口过滤后）。</p>
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get <p>结果集版本号（SHA-256 十六进制）。同一批数据在同一查询条件下保持不变；数据发生变化时版本变化。翻页必须透传。</p> 
     * @return ResultVersion <p>结果集版本号（SHA-256 十六进制）。同一批数据在同一查询条件下保持不变；数据发生变化时版本变化。翻页必须透传。</p>
     */
    public String getResultVersion() {
        return this.ResultVersion;
    }

    /**
     * Set <p>结果集版本号（SHA-256 十六进制）。同一批数据在同一查询条件下保持不变；数据发生变化时版本变化。翻页必须透传。</p>
     * @param ResultVersion <p>结果集版本号（SHA-256 十六进制）。同一批数据在同一查询条件下保持不变；数据发生变化时版本变化。翻页必须透传。</p>
     */
    public void setResultVersion(String ResultVersion) {
        this.ResultVersion = ResultVersion;
    }

    /**
     * Get <p>死锁事件列表。按事件时间倒序排列（最近的死锁在前）。</p> 
     * @return Items <p>死锁事件列表。按事件时间倒序排列（最近的死锁在前）。</p>
     */
    public DeadLockLogItem [] getItems() {
        return this.Items;
    }

    /**
     * Set <p>死锁事件列表。按事件时间倒序排列（最近的死锁在前）。</p>
     * @param Items <p>死锁事件列表。按事件时间倒序排列（最近的死锁在前）。</p>
     */
    public void setItems(DeadLockLogItem [] Items) {
        this.Items = Items;
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

    public DescribeDeadLockLogsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeadLockLogsResponse(DescribeDeadLockLogsResponse source) {
        if (source.HasMore != null) {
            this.HasMore = new Boolean(source.HasMore);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ResultVersion != null) {
            this.ResultVersion = new String(source.ResultVersion);
        }
        if (source.Items != null) {
            this.Items = new DeadLockLogItem[source.Items.length];
            for (int i = 0; i < source.Items.length; i++) {
                this.Items[i] = new DeadLockLogItem(source.Items[i]);
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
        this.setParamSimple(map, prefix + "HasMore", this.HasMore);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "ResultVersion", this.ResultVersion);
        this.setParamArrayObj(map, prefix + "Items.", this.Items);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

