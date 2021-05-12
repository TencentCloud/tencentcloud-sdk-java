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
package com.tencentcloudapi.iotvideoindustry.v20201201.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVideoListResponse extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 已废弃
    */
    @SerializedName("VideoList")
    @Expose
    private RecordTaskItem VideoList;

    /**
    * 录像详情列表
    */
    @SerializedName("RecordList")
    @Expose
    private RecordTaskItem [] RecordList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 总数 
     * @return TotalCount 总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 总数
     * @param TotalCount 总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 已废弃 
     * @return VideoList 已废弃
     */
    public RecordTaskItem getVideoList() {
        return this.VideoList;
    }

    /**
     * Set 已废弃
     * @param VideoList 已废弃
     */
    public void setVideoList(RecordTaskItem VideoList) {
        this.VideoList = VideoList;
    }

    /**
     * Get 录像详情列表 
     * @return RecordList 录像详情列表
     */
    public RecordTaskItem [] getRecordList() {
        return this.RecordList;
    }

    /**
     * Set 录像详情列表
     * @param RecordList 录像详情列表
     */
    public void setRecordList(RecordTaskItem [] RecordList) {
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

    public DescribeVideoListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVideoListResponse(DescribeVideoListResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.VideoList != null) {
            this.VideoList = new RecordTaskItem(source.VideoList);
        }
        if (source.RecordList != null) {
            this.RecordList = new RecordTaskItem[source.RecordList.length];
            for (int i = 0; i < source.RecordList.length; i++) {
                this.RecordList[i] = new RecordTaskItem(source.RecordList[i]);
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
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamObj(map, prefix + "VideoList.", this.VideoList);
        this.setParamArrayObj(map, prefix + "RecordList.", this.RecordList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

