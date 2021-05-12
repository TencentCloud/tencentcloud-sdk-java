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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTelCallInfoRequest extends AbstractModel{

    /**
    * 起始时间戳，Unix 时间戳
    */
    @SerializedName("StartTimeStamp")
    @Expose
    private Long StartTimeStamp;

    /**
    * 结束时间戳，Unix 时间戳，查询时间范围最大为90天
    */
    @SerializedName("EndTimeStamp")
    @Expose
    private Long EndTimeStamp;

    /**
    * 应用ID列表，多个ID时，返回值为多个ID使用总和
    */
    @SerializedName("SdkAppIdList")
    @Expose
    private Long [] SdkAppIdList;

    /**
     * Get 起始时间戳，Unix 时间戳 
     * @return StartTimeStamp 起始时间戳，Unix 时间戳
     */
    public Long getStartTimeStamp() {
        return this.StartTimeStamp;
    }

    /**
     * Set 起始时间戳，Unix 时间戳
     * @param StartTimeStamp 起始时间戳，Unix 时间戳
     */
    public void setStartTimeStamp(Long StartTimeStamp) {
        this.StartTimeStamp = StartTimeStamp;
    }

    /**
     * Get 结束时间戳，Unix 时间戳，查询时间范围最大为90天 
     * @return EndTimeStamp 结束时间戳，Unix 时间戳，查询时间范围最大为90天
     */
    public Long getEndTimeStamp() {
        return this.EndTimeStamp;
    }

    /**
     * Set 结束时间戳，Unix 时间戳，查询时间范围最大为90天
     * @param EndTimeStamp 结束时间戳，Unix 时间戳，查询时间范围最大为90天
     */
    public void setEndTimeStamp(Long EndTimeStamp) {
        this.EndTimeStamp = EndTimeStamp;
    }

    /**
     * Get 应用ID列表，多个ID时，返回值为多个ID使用总和 
     * @return SdkAppIdList 应用ID列表，多个ID时，返回值为多个ID使用总和
     */
    public Long [] getSdkAppIdList() {
        return this.SdkAppIdList;
    }

    /**
     * Set 应用ID列表，多个ID时，返回值为多个ID使用总和
     * @param SdkAppIdList 应用ID列表，多个ID时，返回值为多个ID使用总和
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

