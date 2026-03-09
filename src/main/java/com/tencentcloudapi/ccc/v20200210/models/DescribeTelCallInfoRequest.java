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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTelCallInfoRequest extends AbstractModel {

    /**
    * <p>起始时间戳，Unix 时间戳(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p>
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * <p>结束时间戳，Unix 时间戳，查询时间范围最大为90天(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p>
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Long EndTimeStamp;

    /**
    * <p>应用ID列表，多个ID时，返回值为多个ID使用总和</p>
    */
    @SerializedName("SdkAppIdList")
    @Expose
    private Long [] SdkAppIdList;

    /**
     * Get <p>起始时间戳，Unix 时间戳(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p> 
     * @return StartTimeStamp <p>起始时间戳，Unix 时间戳(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p>
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set <p>起始时间戳，Unix 时间戳(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p>
     * @param StartTimeStamp <p>起始时间戳，Unix 时间戳(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p>
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get <p>结束时间戳，Unix 时间戳，查询时间范围最大为90天(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p> 
     * @return EndTimeStamp <p>结束时间戳，Unix 时间戳，查询时间范围最大为90天(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p>
     */
    public Long getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set <p>结束时间戳，Unix 时间戳，查询时间范围最大为90天(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p>
     * @param EndTimeStamp <p>结束时间戳，Unix 时间戳，查询时间范围最大为90天(查询维度仅支持天，例如查询5月1日应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-01 23:59:59&quot;的时间戳,查5月1日和5月2日的应该传startTime:&quot;2023-05-01 00:00:00&quot;,&quot;endTime&quot;:&quot;2023-05-02 23:59:59&quot;的时间戳)</p>
     */
    public void setEndTimeStamp(Long EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get <p>应用ID列表，多个ID时，返回值为多个ID使用总和</p> 
     * @return SdkAppIdList <p>应用ID列表，多个ID时，返回值为多个ID使用总和</p>
     */
    public Long [] getSdkAppIdList() {
        return this.SdkAppIdList;
    }

    /**
     * Set <p>应用ID列表，多个ID时，返回值为多个ID使用总和</p>
     * @param SdkAppIdList <p>应用ID列表，多个ID时，返回值为多个ID使用总和</p>
     */
    public void setSdkAppIdList(Long [] SdkAppIdList) {
        this.SdkAppIdList = SdkAppIdList;
    }

    public DescribeTelCallInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTelCallInfoRequest(DescribeTelCallInfoRequest source) {
        if (source.StartTimeStamp != null) {
            this.StartTimeStamp = new Long(source.StartTimeStamp);
        }
        if (source.EndTimeStamp != null) {
            this.EndTimeStamp = new Long(source.EndTimeStamp);
        }
        if (source.SdkAppIdList != null) {
            this.SdkAppIdList = new Long[source.SdkAppIdList.length];
            for (int i = 0; i < source.SdkAppIdList.length; i++) {
                this.SdkAppIdList[i] = new Long(source.SdkAppIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeStamp", this.StartTimeStamp);
        this.setParamSimple(map, prefix + "EndTimeStamp", this.EndTimeStamp);
        this.setParamArraySimple(map, prefix + "SdkAppIdList.", this.SdkAppIdList);

    }
}

