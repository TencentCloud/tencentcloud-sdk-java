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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSqlLogsResponse extends AbstractModel{

    /**
    * 当前消息队列中的sql日志条目数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 消息队列中的sql日志起始偏移。
    */
    @SerializedName("StartOffset")
    @Expose
    private Long StartOffset;

    /**
    * 消息队列中的sql日志结束偏移。
    */
    @SerializedName("EndOffset")
    @Expose
    private Long EndOffset;

    /**
    * 返回的第一条sql日志的偏移。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 返回的sql日志数量。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * Sql日志列表。
    */
    @SerializedName("SqlItems")
    @Expose
    private SqlLogItem [] SqlItems;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 当前消息队列中的sql日志条目数。 
     * @return TotalCount 当前消息队列中的sql日志条目数。
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 当前消息队列中的sql日志条目数。
     * @param TotalCount 当前消息队列中的sql日志条目数。
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 消息队列中的sql日志起始偏移。 
     * @return StartOffset 消息队列中的sql日志起始偏移。
     */
    public Long getStartOffset() {
        return this.StartOffset;
    }

    /**
     * Set 消息队列中的sql日志起始偏移。
     * @param StartOffset 消息队列中的sql日志起始偏移。
     */
    public void setStartOffset(Long StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * Get 消息队列中的sql日志结束偏移。 
     * @return EndOffset 消息队列中的sql日志结束偏移。
     */
    public Long getEndOffset() {
        return this.EndOffset;
    }

    /**
     * Set 消息队列中的sql日志结束偏移。
     * @param EndOffset 消息队列中的sql日志结束偏移。
     */
    public void setEndOffset(Long EndOffset) {
        this.EndOffset = EndOffset;
    }

    /**
     * Get 返回的第一条sql日志的偏移。 
     * @return Offset 返回的第一条sql日志的偏移。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 返回的第一条sql日志的偏移。
     * @param Offset 返回的第一条sql日志的偏移。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 返回的sql日志数量。 
     * @return Count 返回的sql日志数量。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 返回的sql日志数量。
     * @param Count 返回的sql日志数量。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get Sql日志列表。 
     * @return SqlItems Sql日志列表。
     */
    public SqlLogItem [] getSqlItems() {
        return this.SqlItems;
    }

    /**
     * Set Sql日志列表。
     * @param SqlItems Sql日志列表。
     */
    public void setSqlItems(SqlLogItem [] SqlItems) {
        this.SqlItems = SqlItems;
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

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "StartOffset", this.StartOffset);
        this.setParamSimple(map, prefix + "EndOffset", this.EndOffset);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "SqlItems.", this.SqlItems);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

