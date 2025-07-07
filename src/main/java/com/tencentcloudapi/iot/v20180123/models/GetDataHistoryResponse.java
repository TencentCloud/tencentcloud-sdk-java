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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetDataHistoryResponse extends AbstractModel {

    /**
    * 数据历史
    */
    @SerializedName("DataHistory")
    @Expose
    private DataHistoryEntry [] DataHistory;

    /**
    * 查询游标
    */
    @SerializedName("ScrollId")
    @Expose
    private String ScrollId;

    /**
    * 查询游标超时
    */
    @SerializedName("ScrollTimeout")
    @Expose
    private Long ScrollTimeout;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 数据历史 
     * @return DataHistory 数据历史
     */
    public DataHistoryEntry [] getDataHistory() {
        return this.DataHistory;
    }

    /**
     * Set 数据历史
     * @param DataHistory 数据历史
     */
    public void setDataHistory(DataHistoryEntry [] DataHistory) {
        this.DataHistory = DataHistory;
    }

    /**
     * Get 查询游标 
     * @return ScrollId 查询游标
     */
    public String getScrollId() {
        return this.ScrollId;
    }

    /**
     * Set 查询游标
     * @param ScrollId 查询游标
     */
    public void setScrollId(String ScrollId) {
        this.ScrollId = ScrollId;
    }

    /**
     * Get 查询游标超时 
     * @return ScrollTimeout 查询游标超时
     */
    public Long getScrollTimeout() {
        return this.ScrollTimeout;
    }

    /**
     * Set 查询游标超时
     * @param ScrollTimeout 查询游标超时
     */
    public void setScrollTimeout(Long ScrollTimeout) {
        this.ScrollTimeout = ScrollTimeout;
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

    public GetDataHistoryResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetDataHistoryResponse(GetDataHistoryResponse source) {
        if (source.DataHistory != null) {
            this.DataHistory = new DataHistoryEntry[source.DataHistory.length];
            for (int i = 0; i < source.DataHistory.length; i++) {
                this.DataHistory[i] = new DataHistoryEntry(source.DataHistory[i]);
            }
        }
        if (source.ScrollId != null) {
            this.ScrollId = new String(source.ScrollId);
        }
        if (source.ScrollTimeout != null) {
            this.ScrollTimeout = new Long(source.ScrollTimeout);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "DataHistory.", this.DataHistory);
        this.setParamSimple(map, prefix + "ScrollId", this.ScrollId);
        this.setParamSimple(map, prefix + "ScrollTimeout", this.ScrollTimeout);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

