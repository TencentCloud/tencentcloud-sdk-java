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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeScaleInfoResponse extends AbstractModel {

    /**
    * 返回的数据条数
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 返回的数据
    */
    @SerializedName("ScaleList")
    @Expose
    private ScaleInfomation [] ScaleList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 返回的数据条数 
     * @return Total 返回的数据条数
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 返回的数据条数
     * @param Total 返回的数据条数
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 返回的数据 
     * @return ScaleList 返回的数据
     */
    public ScaleInfomation [] getScaleList() {
        return this.ScaleList;
    }

    /**
     * Set 返回的数据
     * @param ScaleList 返回的数据
     */
    public void setScaleList(ScaleInfomation [] ScaleList) {
        this.ScaleList = ScaleList;
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

    public DescribeScaleInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeScaleInfoResponse(DescribeScaleInfoResponse source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.ScaleList != null) {
            this.ScaleList = new ScaleInfomation[source.ScaleList.length];
            for (int i = 0; i < source.ScaleList.length; i++) {
                this.ScaleList[i] = new ScaleInfomation(source.ScaleList[i]);
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
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "ScaleList.", this.ScaleList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

