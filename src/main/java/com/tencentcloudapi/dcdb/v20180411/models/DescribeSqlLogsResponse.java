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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSqlLogsResponse  extends AbstractModel{

    /**
    * 当前消息队列中的sql日志条目数。
    */
    @SerializedName("TotalCount")
    @Expose
    private Integer TotalCount;

    /**
    * 消息队列中的sql日志起始偏移。
    */
    @SerializedName("StartOffset")
    @Expose
    private Integer StartOffset;

    /**
    * 消息队列中的sql日志结束偏移。
    */
    @SerializedName("EndOffset")
    @Expose
    private Integer EndOffset;

    /**
    * 返回的第一条sql日志的偏移。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回的sql日志数量。
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

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
     * 获取当前消息队列中的sql日志条目数。
     * @return TotalCount 当前消息队列中的sql日志条目数。
     */
    public Integer getTotalCount() {
        return this.TotalCount;
    }

    /**
     * 设置当前消息队列中的sql日志条目数。
     * @param TotalCount 当前消息队列中的sql日志条目数。
     */
    public void setTotalCount(Integer TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * 获取消息队列中的sql日志起始偏移。
     * @return StartOffset 消息队列中的sql日志起始偏移。
     */
    public Integer getStartOffset() {
        return this.StartOffset;
    }

    /**
     * 设置消息队列中的sql日志起始偏移。
     * @param StartOffset 消息队列中的sql日志起始偏移。
     */
    public void setStartOffset(Integer StartOffset) {
        this.StartOffset = StartOffset;
    }

    /**
     * 获取消息队列中的sql日志结束偏移。
     * @return EndOffset 消息队列中的sql日志结束偏移。
     */
    public Integer getEndOffset() {
        return this.EndOffset;
    }

    /**
     * 设置消息队列中的sql日志结束偏移。
     * @param EndOffset 消息队列中的sql日志结束偏移。
     */
    public void setEndOffset(Integer EndOffset) {
        this.EndOffset = EndOffset;
    }

    /**
     * 获取返回的第一条sql日志的偏移。
     * @return Offset 返回的第一条sql日志的偏移。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置返回的第一条sql日志的偏移。
     * @param Offset 返回的第一条sql日志的偏移。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回的sql日志数量。
     * @return Count 返回的sql日志数量。
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置返回的sql日志数量。
     * @param Count 返回的sql日志数量。
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     * 获取Sql日志列表。
     * @return SqlItems Sql日志列表。
     */
    public SqlLogItem [] getSqlItems() {
        return this.SqlItems;
    }

    /**
     * 设置Sql日志列表。
     * @param SqlItems Sql日志列表。
     */
    public void setSqlItems(SqlLogItem [] SqlItems) {
        this.SqlItems = SqlItems;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
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

