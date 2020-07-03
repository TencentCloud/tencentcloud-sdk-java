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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowlogDetail extends AbstractModel{

    /**
    * 花费总时间
    */
    @SerializedName("TotalTime")
    @Expose
    private Float TotalTime;

    /**
    * 调用总次数
    */
    @SerializedName("TotalCalls")
    @Expose
    private Long TotalCalls;

    /**
    * 脱敏后的慢SQL列表
    */
    @SerializedName("NormalQueries")
    @Expose
    private NormalQueryItem [] NormalQueries;

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
     * @return TotalCalls 调用总次数
     */
    public Long getTotalCalls() {
        return this.TotalCalls;
    }

    /**
     * Set 调用总次数
     * @param TotalCalls 调用总次数
     */
    public void setTotalCalls(Long TotalCalls) {
        this.TotalCalls = TotalCalls;
    }

    /**
     * Get 脱敏后的慢SQL列表 
     * @return NormalQueries 脱敏后的慢SQL列表
     */
    public NormalQueryItem [] getNormalQueries() {
        return this.NormalQueries;
    }

    /**
     * Set 脱敏后的慢SQL列表
     * @param NormalQueries 脱敏后的慢SQL列表
     */
    public void setNormalQueries(NormalQueryItem [] NormalQueries) {
        this.NormalQueries = NormalQueries;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "TotalCalls", this.TotalCalls);
        this.setParamArrayObj(map, prefix + "NormalQueries.", this.NormalQueries);

    }
}

