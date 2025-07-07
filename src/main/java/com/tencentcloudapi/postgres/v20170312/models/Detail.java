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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Detail extends AbstractModel {

    /**
    * 输入时间范围内所有慢sql执行的总时间，单位毫秒（ms）
    */
    @SerializedName("TotalTime")
    @Expose
    private Float TotalTime;

    /**
    * 输入时间范围内所有慢sql总条数
    */
    @SerializedName("TotalCallNum")
    @Expose
    private Long TotalCallNum;

    /**
    * 慢SQL统计分析列表
    */
    @SerializedName("AnalysisItems")
    @Expose
    private AnalysisItems [] AnalysisItems;

    /**
     * Get 输入时间范围内所有慢sql执行的总时间，单位毫秒（ms） 
     * @return TotalTime 输入时间范围内所有慢sql执行的总时间，单位毫秒（ms）
     */
    public Float getTotalTime() {
        return this.TotalTime;
    }

    /**
     * Set 输入时间范围内所有慢sql执行的总时间，单位毫秒（ms）
     * @param TotalTime 输入时间范围内所有慢sql执行的总时间，单位毫秒（ms）
     */
    public void setTotalTime(Float TotalTime) {
        this.TotalTime = TotalTime;
    }

    /**
     * Get 输入时间范围内所有慢sql总条数 
     * @return TotalCallNum 输入时间范围内所有慢sql总条数
     */
    public Long getTotalCallNum() {
        return this.TotalCallNum;
    }

    /**
     * Set 输入时间范围内所有慢sql总条数
     * @param TotalCallNum 输入时间范围内所有慢sql总条数
     */
    public void setTotalCallNum(Long TotalCallNum) {
        this.TotalCallNum = TotalCallNum;
    }

    /**
     * Get 慢SQL统计分析列表 
     * @return AnalysisItems 慢SQL统计分析列表
     */
    public AnalysisItems [] getAnalysisItems() {
        return this.AnalysisItems;
    }

    /**
     * Set 慢SQL统计分析列表
     * @param AnalysisItems 慢SQL统计分析列表
     */
    public void setAnalysisItems(AnalysisItems [] AnalysisItems) {
        this.AnalysisItems = AnalysisItems;
    }

    public Detail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Detail(Detail source) {
        if (source.TotalTime != null) {
            this.TotalTime = new Float(source.TotalTime);
        }
        if (source.TotalCallNum != null) {
            this.TotalCallNum = new Long(source.TotalCallNum);
        }
        if (source.AnalysisItems != null) {
            this.AnalysisItems = new AnalysisItems[source.AnalysisItems.length];
            for (int i = 0; i < source.AnalysisItems.length; i++) {
                this.AnalysisItems[i] = new AnalysisItems(source.AnalysisItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalTime", this.TotalTime);
        this.setParamSimple(map, prefix + "TotalCallNum", this.TotalCallNum);
        this.setParamArrayObj(map, prefix + "AnalysisItems.", this.AnalysisItems);

    }
}

