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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTimeShiftStreamListResponse extends AbstractModel{

    /**
    * 时间段内所有的数据量。
    */
    @SerializedName("TotalSize")
    @Expose
    private Long TotalSize;

    /**
    * 流列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StreamList")
    @Expose
    private TimeShiftStreamInfo [] StreamList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 时间段内所有的数据量。 
     * @return TotalSize 时间段内所有的数据量。
     */
    public Long getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set 时间段内所有的数据量。
     * @param TotalSize 时间段内所有的数据量。
     */
    public void setTotalSize(Long TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get 流列表。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StreamList 流列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TimeShiftStreamInfo [] getStreamList() {
        return this.StreamList;
    }

    /**
     * Set 流列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StreamList 流列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStreamList(TimeShiftStreamInfo [] StreamList) {
        this.StreamList = StreamList;
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

    public DescribeTimeShiftStreamListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTimeShiftStreamListResponse(DescribeTimeShiftStreamListResponse source) {
        if (source.TotalSize != null) {
            this.TotalSize = new Long(source.TotalSize);
        }
        if (source.StreamList != null) {
            this.StreamList = new TimeShiftStreamInfo[source.StreamList.length];
            for (int i = 0; i < source.StreamList.length; i++) {
                this.StreamList[i] = new TimeShiftStreamInfo(source.StreamList[i]);
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
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamArrayObj(map, prefix + "StreamList.", this.StreamList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

