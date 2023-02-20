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
package com.tencentcloudapi.captcha.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTotalRequestStatisticsRequest extends AbstractModel{

    /**
    * 开始时间字符串
    */
    @SerializedName("StartTimeStr")
    @Expose
    private String StartTimeStr;

    /**
    * 结束时间字符串
    */
    @SerializedName("EndTimeStr")
    @Expose
    private String EndTimeStr;

    /**
    * 查询粒度
    */
    @SerializedName("Dimension")
    @Expose
    private String Dimension;

    /**
     * Get 开始时间字符串 
     * @return StartTimeStr 开始时间字符串
     */
    public String getStartTimeStr() {
        return this.StartTimeStr;
    }

    /**
     * Set 开始时间字符串
     * @param StartTimeStr 开始时间字符串
     */
    public void setStartTimeStr(String StartTimeStr) {
        this.StartTimeStr = StartTimeStr;
    }

    /**
     * Get 结束时间字符串 
     * @return EndTimeStr 结束时间字符串
     */
    public String getEndTimeStr() {
        return this.EndTimeStr;
    }

    /**
     * Set 结束时间字符串
     * @param EndTimeStr 结束时间字符串
     */
    public void setEndTimeStr(String EndTimeStr) {
        this.EndTimeStr = EndTimeStr;
    }

    /**
     * Get 查询粒度 
     * @return Dimension 查询粒度
     */
    public String getDimension() {
        return this.Dimension;
    }

    /**
     * Set 查询粒度
     * @param Dimension 查询粒度
     */
    public void setDimension(String Dimension) {
        this.Dimension = Dimension;
    }

    public GetTotalRequestStatisticsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetTotalRequestStatisticsRequest(GetTotalRequestStatisticsRequest source) {
        if (source.StartTimeStr != null) {
            this.StartTimeStr = new String(source.StartTimeStr);
        }
        if (source.EndTimeStr != null) {
            this.EndTimeStr = new String(source.EndTimeStr);
        }
        if (source.Dimension != null) {
            this.Dimension = new String(source.Dimension);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTimeStr", this.StartTimeStr);
        this.setParamSimple(map, prefix + "EndTimeStr", this.EndTimeStr);
        this.setParamSimple(map, prefix + "Dimension", this.Dimension);

    }
}

