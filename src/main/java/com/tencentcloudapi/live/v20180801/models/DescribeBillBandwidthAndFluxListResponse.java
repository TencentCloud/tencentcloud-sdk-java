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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillBandwidthAndFluxListResponse extends AbstractModel {

    /**
    * 峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
    */
    @SerializedName("PeakBandwidthTime")
    @Expose
    private String PeakBandwidthTime;

    /**
    * 峰值带宽，单位是Mbps。
    */
    @SerializedName("PeakBandwidth")
    @Expose
    private Float PeakBandwidth;

    /**
    * 95峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
    */
    @SerializedName("P95PeakBandwidthTime")
    @Expose
    private String P95PeakBandwidthTime;

    /**
    * 95峰值带宽，单位是Mbps。
    */
    @SerializedName("P95PeakBandwidth")
    @Expose
    private Float P95PeakBandwidth;

    /**
    * 总流量，单位是MB。
    */
    @SerializedName("SumFlux")
    @Expose
    private Float SumFlux;

    /**
    * 明细数据信息。
    */
    @SerializedName("DataInfoList")
    @Expose
    private BillDataInfo [] DataInfoList;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。 
     * @return PeakBandwidthTime 峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
     */
    public String getPeakBandwidthTime() {
        return this.PeakBandwidthTime;
    }

    /**
     * Set 峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
     * @param PeakBandwidthTime 峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
     */
    public void setPeakBandwidthTime(String PeakBandwidthTime) {
        this.PeakBandwidthTime = PeakBandwidthTime;
    }

    /**
     * Get 峰值带宽，单位是Mbps。 
     * @return PeakBandwidth 峰值带宽，单位是Mbps。
     */
    public Float getPeakBandwidth() {
        return this.PeakBandwidth;
    }

    /**
     * Set 峰值带宽，单位是Mbps。
     * @param PeakBandwidth 峰值带宽，单位是Mbps。
     */
    public void setPeakBandwidth(Float PeakBandwidth) {
        this.PeakBandwidth = PeakBandwidth;
    }

    /**
     * Get 95峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。 
     * @return P95PeakBandwidthTime 95峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
     */
    public String getP95PeakBandwidthTime() {
        return this.P95PeakBandwidthTime;
    }

    /**
     * Set 95峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
     * @param P95PeakBandwidthTime 95峰值带宽所在时间点，接口返回支持两种时间格式(与接口请求传递的时间格式一致)：
1）YYYY-MM-DDThh:mm:ssZ：UTC时间格式，详见IOS日期格式说明文档: https://cloud.tencent.com/document/product/266/11732#I
2）YYYY-MM-DD hh:mm:ss：使用此格式时，默认代表北京时间。
     */
    public void setP95PeakBandwidthTime(String P95PeakBandwidthTime) {
        this.P95PeakBandwidthTime = P95PeakBandwidthTime;
    }

    /**
     * Get 95峰值带宽，单位是Mbps。 
     * @return P95PeakBandwidth 95峰值带宽，单位是Mbps。
     */
    public Float getP95PeakBandwidth() {
        return this.P95PeakBandwidth;
    }

    /**
     * Set 95峰值带宽，单位是Mbps。
     * @param P95PeakBandwidth 95峰值带宽，单位是Mbps。
     */
    public void setP95PeakBandwidth(Float P95PeakBandwidth) {
        this.P95PeakBandwidth = P95PeakBandwidth;
    }

    /**
     * Get 总流量，单位是MB。 
     * @return SumFlux 总流量，单位是MB。
     */
    public Float getSumFlux() {
        return this.SumFlux;
    }

    /**
     * Set 总流量，单位是MB。
     * @param SumFlux 总流量，单位是MB。
     */
    public void setSumFlux(Float SumFlux) {
        this.SumFlux = SumFlux;
    }

    /**
     * Get 明细数据信息。 
     * @return DataInfoList 明细数据信息。
     */
    public BillDataInfo [] getDataInfoList() {
        return this.DataInfoList;
    }

    /**
     * Set 明细数据信息。
     * @param DataInfoList 明细数据信息。
     */
    public void setDataInfoList(BillDataInfo [] DataInfoList) {
        this.DataInfoList = DataInfoList;
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

    public DescribeBillBandwidthAndFluxListResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBillBandwidthAndFluxListResponse(DescribeBillBandwidthAndFluxListResponse source) {
        if (source.PeakBandwidthTime != null) {
            this.PeakBandwidthTime = new String(source.PeakBandwidthTime);
        }
        if (source.PeakBandwidth != null) {
            this.PeakBandwidth = new Float(source.PeakBandwidth);
        }
        if (source.P95PeakBandwidthTime != null) {
            this.P95PeakBandwidthTime = new String(source.P95PeakBandwidthTime);
        }
        if (source.P95PeakBandwidth != null) {
            this.P95PeakBandwidth = new Float(source.P95PeakBandwidth);
        }
        if (source.SumFlux != null) {
            this.SumFlux = new Float(source.SumFlux);
        }
        if (source.DataInfoList != null) {
            this.DataInfoList = new BillDataInfo[source.DataInfoList.length];
            for (int i = 0; i < source.DataInfoList.length; i++) {
                this.DataInfoList[i] = new BillDataInfo(source.DataInfoList[i]);
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
        this.setParamSimple(map, prefix + "PeakBandwidthTime", this.PeakBandwidthTime);
        this.setParamSimple(map, prefix + "PeakBandwidth", this.PeakBandwidth);
        this.setParamSimple(map, prefix + "P95PeakBandwidthTime", this.P95PeakBandwidthTime);
        this.setParamSimple(map, prefix + "P95PeakBandwidth", this.P95PeakBandwidth);
        this.setParamSimple(map, prefix + "SumFlux", this.SumFlux);
        this.setParamArrayObj(map, prefix + "DataInfoList.", this.DataInfoList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

