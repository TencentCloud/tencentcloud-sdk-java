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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoginStatistic extends AbstractModel {

    /**
    * 统计类型 新增NEWUSER 和登录 LOGIN
    */
    @SerializedName("StatisticalType")
    @Expose
    private String StatisticalType;

    /**
    * 统计周期：日DAY，周WEEK，月MONTH
    */
    @SerializedName("StatisticalCycle")
    @Expose
    private String StatisticalCycle;

    /**
    * 统计总量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 统计类型 新增NEWUSER 和登录 LOGIN 
     * @return StatisticalType 统计类型 新增NEWUSER 和登录 LOGIN
     */
    public String getStatisticalType() {
        return this.StatisticalType;
    }

    /**
     * Set 统计类型 新增NEWUSER 和登录 LOGIN
     * @param StatisticalType 统计类型 新增NEWUSER 和登录 LOGIN
     */
    public void setStatisticalType(String StatisticalType) {
        this.StatisticalType = StatisticalType;
    }

    /**
     * Get 统计周期：日DAY，周WEEK，月MONTH 
     * @return StatisticalCycle 统计周期：日DAY，周WEEK，月MONTH
     */
    public String getStatisticalCycle() {
        return this.StatisticalCycle;
    }

    /**
     * Set 统计周期：日DAY，周WEEK，月MONTH
     * @param StatisticalCycle 统计周期：日DAY，周WEEK，月MONTH
     */
    public void setStatisticalCycle(String StatisticalCycle) {
        this.StatisticalCycle = StatisticalCycle;
    }

    /**
     * Get 统计总量 
     * @return Count 统计总量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 统计总量
     * @param Count 统计总量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public LoginStatistic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoginStatistic(LoginStatistic source) {
        if (source.StatisticalType != null) {
            this.StatisticalType = new String(source.StatisticalType);
        }
        if (source.StatisticalCycle != null) {
            this.StatisticalCycle = new String(source.StatisticalCycle);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StatisticalType", this.StatisticalType);
        this.setParamSimple(map, prefix + "StatisticalCycle", this.StatisticalCycle);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

