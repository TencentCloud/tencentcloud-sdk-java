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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EstimateRebuildIndexTaskResponse extends AbstractModel {

    /**
    * 预估索引重建需要时间，单位秒
    */
    @SerializedName("RemainTime")
    @Expose
    private Long RemainTime;

    /**
    * 预估写流量大小，单位MB
    */
    @SerializedName("WriteTraffic")
    @Expose
    private Long WriteTraffic;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 预估索引重建需要时间，单位秒 
     * @return RemainTime 预估索引重建需要时间，单位秒
     */
    public Long getRemainTime() {
        return this.RemainTime;
    }

    /**
     * Set 预估索引重建需要时间，单位秒
     * @param RemainTime 预估索引重建需要时间，单位秒
     */
    public void setRemainTime(Long RemainTime) {
        this.RemainTime = RemainTime;
    }

    /**
     * Get 预估写流量大小，单位MB 
     * @return WriteTraffic 预估写流量大小，单位MB
     */
    public Long getWriteTraffic() {
        return this.WriteTraffic;
    }

    /**
     * Set 预估写流量大小，单位MB
     * @param WriteTraffic 预估写流量大小，单位MB
     */
    public void setWriteTraffic(Long WriteTraffic) {
        this.WriteTraffic = WriteTraffic;
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

    public EstimateRebuildIndexTaskResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EstimateRebuildIndexTaskResponse(EstimateRebuildIndexTaskResponse source) {
        if (source.RemainTime != null) {
            this.RemainTime = new Long(source.RemainTime);
        }
        if (source.WriteTraffic != null) {
            this.WriteTraffic = new Long(source.WriteTraffic);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RemainTime", this.RemainTime);
        this.setParamSimple(map, prefix + "WriteTraffic", this.WriteTraffic);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

