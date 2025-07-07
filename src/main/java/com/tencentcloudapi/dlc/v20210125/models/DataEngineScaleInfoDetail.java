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
package com.tencentcloudapi.dlc.v20210125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataEngineScaleInfoDetail extends AbstractModel {

    /**
    * 统计开始时间，格式为：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计结束时间，格式为：yyyy-MM-dd HH:mm:ss
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 当前统计时间段，引擎规格
    */
    @SerializedName("CU")
    @Expose
    private Long CU;

    /**
     * Get 统计开始时间，格式为：yyyy-MM-dd HH:mm:ss 
     * @return StartTime 统计开始时间，格式为：yyyy-MM-dd HH:mm:ss
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 统计开始时间，格式为：yyyy-MM-dd HH:mm:ss
     * @param StartTime 统计开始时间，格式为：yyyy-MM-dd HH:mm:ss
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 统计结束时间，格式为：yyyy-MM-dd HH:mm:ss 
     * @return EndTime 统计结束时间，格式为：yyyy-MM-dd HH:mm:ss
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 统计结束时间，格式为：yyyy-MM-dd HH:mm:ss
     * @param EndTime 统计结束时间，格式为：yyyy-MM-dd HH:mm:ss
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 当前统计时间段，引擎规格 
     * @return CU 当前统计时间段，引擎规格
     */
    public Long getCU() {
        return this.CU;
    }

    /**
     * Set 当前统计时间段，引擎规格
     * @param CU 当前统计时间段，引擎规格
     */
    public void setCU(Long CU) {
        this.CU = CU;
    }

    public DataEngineScaleInfoDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataEngineScaleInfoDetail(DataEngineScaleInfoDetail source) {
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.CU != null) {
            this.CU = new Long(source.CU);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "CU", this.CU);

    }
}

