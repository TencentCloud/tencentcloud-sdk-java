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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogDetail extends AbstractModel {

    /**
    * 花费总时间
    */
    @SerializedName("TotalTime")
    @Expose
    private Float TotalTime;

    /**
    * 调用总次数
    */
    @SerializedName("TotalCallTimes")
    @Expose
    private Long TotalCallTimes;

    /**
    * 慢SQL
    */
    @SerializedName("NormalQuerys")
    @Expose
    private NormQueryItem [] NormalQuerys;

    /**
     * Get 花费总时间 
     * @return TotalTime 花费总时间
     */
    public Float getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set 花费总时间
     * @param TotalTime 花费总时间
     */
    public void setTotalTime(Float TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get 调用总次数 
     * @return TotalCallTimes 调用总次数
     */
    public Long getTotalCallTimes() {
        return this.TotalCallTimes;
    }

    /**
     * Set 调用总次数
     * @param TotalCallTimes 调用总次数
     */
    public void setTotalCallTimes(Long TotalCallTimes) {
        this.TotalCallTimes = TotalCallTimes;
    }

    /**
     * Get 慢SQL 
     * @return NormalQuerys 慢SQL
     */
    public NormQueryItem [] getNormalQuerys() {
        return this.NormalQuerys;
    }

    /**
     * Set 慢SQL
     * @param NormalQuerys 慢SQL
     */
    public void setNormalQuerys(NormQueryItem [] NormalQuerys) {
        this.NormalQuerys = NormalQuerys;
    }

    public SlowLogDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLogDetail(SlowLogDetail source) {
        if (source.TotalTime != null) {
            this.TotalTime = new Float(source.TotalTime);
        }
        if (source.TotalCallTimes != null) {
            this.TotalCallTimes = new Long(source.TotalCallTimes);
        }
        if (source.NormalQuerys != null) {
            this.NormalQuerys = new NormQueryItem[source.NormalQuerys.length];
            for (int i = 0; i < source.NormalQuerys.length; i++) {
                this.NormalQuerys[i] = new NormQueryItem(source.NormalQuerys[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "TotalCallTimes", this.TotalCallTimes);
        this.setParamArrayObj(map, prefix + "NormalQuerys.", this.NormalQuerys);

    }
}

