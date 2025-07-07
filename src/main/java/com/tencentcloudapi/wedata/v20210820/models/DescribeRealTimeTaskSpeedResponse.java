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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealTimeTaskSpeedResponse extends AbstractModel {

    /**
    * 同步速度条/s列表
    */
    @SerializedName("RecordsSpeedList")
    @Expose
    private RecordsSpeed [] RecordsSpeedList;

    /**
    * 同步速度字节/s列表
    */
    @SerializedName("BytesSpeedList")
    @Expose
    private BytesSpeed [] BytesSpeedList;

    /**
    * 同步速度，包括了RecordsSpeedList和BytesSpeedList
    */
    @SerializedName("Data")
    @Expose
    private RealTimeTaskSpeed Data;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 同步速度条/s列表 
     * @return RecordsSpeedList 同步速度条/s列表
     */
    public RecordsSpeed [] getRecordsSpeedList() {
        return this.RecordsSpeedList;
    }

    /**
     * Set 同步速度条/s列表
     * @param RecordsSpeedList 同步速度条/s列表
     */
    public void setRecordsSpeedList(RecordsSpeed [] RecordsSpeedList) {
        this.RecordsSpeedList = RecordsSpeedList;
    }

    /**
     * Get 同步速度字节/s列表 
     * @return BytesSpeedList 同步速度字节/s列表
     */
    public BytesSpeed [] getBytesSpeedList() {
        return this.BytesSpeedList;
    }

    /**
     * Set 同步速度字节/s列表
     * @param BytesSpeedList 同步速度字节/s列表
     */
    public void setBytesSpeedList(BytesSpeed [] BytesSpeedList) {
        this.BytesSpeedList = BytesSpeedList;
    }

    /**
     * Get 同步速度，包括了RecordsSpeedList和BytesSpeedList 
     * @return Data 同步速度，包括了RecordsSpeedList和BytesSpeedList
     */
    public RealTimeTaskSpeed getData() {
        return this.Data;
    }

    /**
     * Set 同步速度，包括了RecordsSpeedList和BytesSpeedList
     * @param Data 同步速度，包括了RecordsSpeedList和BytesSpeedList
     */
    public void setData(RealTimeTaskSpeed Data) {
        this.Data = Data;
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

    public DescribeRealTimeTaskSpeedResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealTimeTaskSpeedResponse(DescribeRealTimeTaskSpeedResponse source) {
        if (source.RecordsSpeedList != null) {
            this.RecordsSpeedList = new RecordsSpeed[source.RecordsSpeedList.length];
            for (int i = 0; i < source.RecordsSpeedList.length; i++) {
                this.RecordsSpeedList[i] = new RecordsSpeed(source.RecordsSpeedList[i]);
            }
        }
        if (source.BytesSpeedList != null) {
            this.BytesSpeedList = new BytesSpeed[source.BytesSpeedList.length];
            for (int i = 0; i < source.BytesSpeedList.length; i++) {
                this.BytesSpeedList[i] = new BytesSpeed(source.BytesSpeedList[i]);
            }
        }
        if (source.Data != null) {
            this.Data = new RealTimeTaskSpeed(source.Data);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "RecordsSpeedList.", this.RecordsSpeedList);
        this.setParamArrayObj(map, prefix + "BytesSpeedList.", this.BytesSpeedList);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

