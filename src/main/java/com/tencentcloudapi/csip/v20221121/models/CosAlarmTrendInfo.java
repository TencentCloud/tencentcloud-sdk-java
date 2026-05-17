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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosAlarmTrendInfo extends AbstractModel {

    /**
    * 当前日期字符串格式
    */
    @SerializedName("CurrentDateStr")
    @Expose
    private String CurrentDateStr;

    /**
    * 当前日期总数
    */
    @SerializedName("CurrentDayCount")
    @Expose
    private Long CurrentDayCount;

    /**
    * 当天告警分类详情
    */
    @SerializedName("CurrentDayOverView")
    @Expose
    private CosRiskInfo [] CurrentDayOverView;

    /**
     * Get 当前日期字符串格式 
     * @return CurrentDateStr 当前日期字符串格式
     */
    public String getCurrentDateStr() {
        return this.CurrentDateStr;
    }

    /**
     * Set 当前日期字符串格式
     * @param CurrentDateStr 当前日期字符串格式
     */
    public void setCurrentDateStr(String CurrentDateStr) {
        this.CurrentDateStr = CurrentDateStr;
    }

    /**
     * Get 当前日期总数 
     * @return CurrentDayCount 当前日期总数
     */
    public Long getCurrentDayCount() {
        return this.CurrentDayCount;
    }

    /**
     * Set 当前日期总数
     * @param CurrentDayCount 当前日期总数
     */
    public void setCurrentDayCount(Long CurrentDayCount) {
        this.CurrentDayCount = CurrentDayCount;
    }

    /**
     * Get 当天告警分类详情 
     * @return CurrentDayOverView 当天告警分类详情
     */
    public CosRiskInfo [] getCurrentDayOverView() {
        return this.CurrentDayOverView;
    }

    /**
     * Set 当天告警分类详情
     * @param CurrentDayOverView 当天告警分类详情
     */
    public void setCurrentDayOverView(CosRiskInfo [] CurrentDayOverView) {
        this.CurrentDayOverView = CurrentDayOverView;
    }

    public CosAlarmTrendInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosAlarmTrendInfo(CosAlarmTrendInfo source) {
        if (source.CurrentDateStr != null) {
            this.CurrentDateStr = new String(source.CurrentDateStr);
        }
        if (source.CurrentDayCount != null) {
            this.CurrentDayCount = new Long(source.CurrentDayCount);
        }
        if (source.CurrentDayOverView != null) {
            this.CurrentDayOverView = new CosRiskInfo[source.CurrentDayOverView.length];
            for (int i = 0; i < source.CurrentDayOverView.length; i++) {
                this.CurrentDayOverView[i] = new CosRiskInfo(source.CurrentDayOverView[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurrentDateStr", this.CurrentDateStr);
        this.setParamSimple(map, prefix + "CurrentDayCount", this.CurrentDayCount);
        this.setParamArrayObj(map, prefix + "CurrentDayOverView.", this.CurrentDayOverView);

    }
}

