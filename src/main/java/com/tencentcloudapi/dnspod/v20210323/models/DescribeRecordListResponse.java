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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRecordListResponse extends AbstractModel{

    /**
    * 记录的数量统计信息
    */
    @SerializedName("RecordCountInfo")
    @Expose
    private RecordCountInfo RecordCountInfo;

    /**
    * 获取的记录列表
    */
    @SerializedName("RecordList")
    @Expose
    private RecordListItem [] RecordList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 记录的数量统计信息 
     * @return RecordCountInfo 记录的数量统计信息
     */
    public RecordCountInfo getRecordCountInfo() {
        return this.RecordCountInfo;
    }

    /**
     * Set 记录的数量统计信息
     * @param RecordCountInfo 记录的数量统计信息
     */
    public void setRecordCountInfo(RecordCountInfo RecordCountInfo) {
        this.RecordCountInfo = RecordCountInfo;
    }

    /**
     * Get 获取的记录列表 
     * @return RecordList 获取的记录列表
     */
    public RecordListItem [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set 获取的记录列表
     * @param RecordList 获取的记录列表
     */
    public void setRecordList(RecordListItem [] RecordList) {
        this.RecordList = RecordList;
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

    public DescribeRecordListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRecordListResponse(DescribeRecordListResponse source) {
        if (source.RecordCountInfo != null) {
            this.RecordCountInfo = new RecordCountInfo(source.RecordCountInfo);
        }
        if (source.RecordList != null) {
            this.RecordList = new RecordListItem[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new RecordListItem(source.RecordList[i]);
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
        this.setParamObj(map, prefix + "RecordCountInfo.", this.RecordCountInfo);
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

