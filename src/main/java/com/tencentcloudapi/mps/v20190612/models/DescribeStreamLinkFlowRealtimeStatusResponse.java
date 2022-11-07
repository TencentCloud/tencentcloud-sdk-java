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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStreamLinkFlowRealtimeStatusResponse extends AbstractModel{

    /**
    * 查询时间，单位s。
    */
    @SerializedName("Timestamp")
    @Expose
    private Long Timestamp;

    /**
    * 实时数据信息列表。
    */
    @SerializedName("Datas")
    @Expose
    private FlowRealtimeStatusItem [] Datas;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 查询时间，单位s。 
     * @return Timestamp 查询时间，单位s。
     */
    public Long getTimestamp() {
        return this.Timestamp;
    }

    /**
     * Set 查询时间，单位s。
     * @param Timestamp 查询时间，单位s。
     */
    public void setTimestamp(Long Timestamp) {
        this.Timestamp = Timestamp;
    }

    /**
     * Get 实时数据信息列表。 
     * @return Datas 实时数据信息列表。
     */
    public FlowRealtimeStatusItem [] getDatas() {
        return this.Datas;
    }

    /**
     * Set 实时数据信息列表。
     * @param Datas 实时数据信息列表。
     */
    public void setDatas(FlowRealtimeStatusItem [] Datas) {
        this.Datas = Datas;
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

    public DescribeStreamLinkFlowRealtimeStatusResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStreamLinkFlowRealtimeStatusResponse(DescribeStreamLinkFlowRealtimeStatusResponse source) {
        if (source.Timestamp != null) {
            this.Timestamp = new Long(source.Timestamp);
        }
        if (source.Datas != null) {
            this.Datas = new FlowRealtimeStatusItem[source.Datas.length];
            for (int i = 0; i < source.Datas.length; i++) {
                this.Datas[i] = new FlowRealtimeStatusItem(source.Datas[i]);
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
        this.setParamSimple(map, prefix + "Timestamp", this.Timestamp);
        this.setParamArrayObj(map, prefix + "Datas.", this.Datas);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

