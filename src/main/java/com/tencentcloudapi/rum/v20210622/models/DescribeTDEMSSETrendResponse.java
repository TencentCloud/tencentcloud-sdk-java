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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTDEMSSETrendResponse extends AbstractModel {

    /**
    * <p>时间桶宽度，单位秒。</p>
    */
    @SerializedName("IntervalSec")
    @Expose
    private Long IntervalSec;

    /**
    * <p>Dimension 为 overall 时的时间桶。没有对话时为空数组。</p>
    */
    @SerializedName("Points")
    @Expose
    private TDEMSSETrendPoint [] Points;

    /**
    * <p>非 overall 时按指标从高到低取 TopN 后的序列。没有对话时为空数组。</p>
    */
    @SerializedName("Series")
    @Expose
    private TDEMSSETrendSeries [] Series;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>时间桶宽度，单位秒。</p> 
     * @return IntervalSec <p>时间桶宽度，单位秒。</p>
     */
    public Long getIntervalSec() {
        return this.IntervalSec;
    }

    /**
     * Set <p>时间桶宽度，单位秒。</p>
     * @param IntervalSec <p>时间桶宽度，单位秒。</p>
     */
    public void setIntervalSec(Long IntervalSec) {
        this.IntervalSec = IntervalSec;
    }

    /**
     * Get <p>Dimension 为 overall 时的时间桶。没有对话时为空数组。</p> 
     * @return Points <p>Dimension 为 overall 时的时间桶。没有对话时为空数组。</p>
     */
    public TDEMSSETrendPoint [] getPoints() {
        return this.Points;
    }

    /**
     * Set <p>Dimension 为 overall 时的时间桶。没有对话时为空数组。</p>
     * @param Points <p>Dimension 为 overall 时的时间桶。没有对话时为空数组。</p>
     */
    public void setPoints(TDEMSSETrendPoint [] Points) {
        this.Points = Points;
    }

    /**
     * Get <p>非 overall 时按指标从高到低取 TopN 后的序列。没有对话时为空数组。</p> 
     * @return Series <p>非 overall 时按指标从高到低取 TopN 后的序列。没有对话时为空数组。</p>
     */
    public TDEMSSETrendSeries [] getSeries() {
        return this.Series;
    }

    /**
     * Set <p>非 overall 时按指标从高到低取 TopN 后的序列。没有对话时为空数组。</p>
     * @param Series <p>非 overall 时按指标从高到低取 TopN 后的序列。没有对话时为空数组。</p>
     */
    public void setSeries(TDEMSSETrendSeries [] Series) {
        this.Series = Series;
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

    public DescribeTDEMSSETrendResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTDEMSSETrendResponse(DescribeTDEMSSETrendResponse source) {
        if (source.IntervalSec != null) {
            this.IntervalSec = new Long(source.IntervalSec);
        }
        if (source.Points != null) {
            this.Points = new TDEMSSETrendPoint[source.Points.length];
            for (int i = 0; i < source.Points.length; i++) {
                this.Points[i] = new TDEMSSETrendPoint(source.Points[i]);
            }
        }
        if (source.Series != null) {
            this.Series = new TDEMSSETrendSeries[source.Series.length];
            for (int i = 0; i < source.Series.length; i++) {
                this.Series[i] = new TDEMSSETrendSeries(source.Series[i]);
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
        this.setParamSimple(map, prefix + "IntervalSec", this.IntervalSec);
        this.setParamArrayObj(map, prefix + "Points.", this.Points);
        this.setParamArrayObj(map, prefix + "Series.", this.Series);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

