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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BruteAttackRuleList extends AbstractModel{

    /**
    * 爆破事件发生的时间范围，单位：秒
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * 爆破事件失败次数
    */
    @SerializedName("LoginFailTimes")
    @Expose
    private Long LoginFailTimes;

    /**
    * 规则是否为空，为空则填充默认规则
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * 爆破事件发生的时间范围，单位：秒（默认规则）
    */
    @SerializedName("TimeRangeDefault")
    @Expose
    private Long TimeRangeDefault;

    /**
    * 爆破事件失败次数（默认规则）
    */
    @SerializedName("LoginFailTimesDefault")
    @Expose
    private Long LoginFailTimesDefault;

    /**
     * Get 爆破事件发生的时间范围，单位：秒 
     * @return TimeRange 爆破事件发生的时间范围，单位：秒
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set 爆破事件发生的时间范围，单位：秒
     * @param TimeRange 爆破事件发生的时间范围，单位：秒
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get 爆破事件失败次数 
     * @return LoginFailTimes 爆破事件失败次数
     */
    public Long getLoginFailTimes() {
        return this.LoginFailTimes;
    }

    /**
     * Set 爆破事件失败次数
     * @param LoginFailTimes 爆破事件失败次数
     */
    public void setLoginFailTimes(Long LoginFailTimes) {
        this.LoginFailTimes = LoginFailTimes;
    }

    /**
     * Get 规则是否为空，为空则填充默认规则 
     * @return Enable 规则是否为空，为空则填充默认规则
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set 规则是否为空，为空则填充默认规则
     * @param Enable 规则是否为空，为空则填充默认规则
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 爆破事件发生的时间范围，单位：秒（默认规则） 
     * @return TimeRangeDefault 爆破事件发生的时间范围，单位：秒（默认规则）
     */
    public Long getTimeRangeDefault() {
        return this.TimeRangeDefault;
    }

    /**
     * Set 爆破事件发生的时间范围，单位：秒（默认规则）
     * @param TimeRangeDefault 爆破事件发生的时间范围，单位：秒（默认规则）
     */
    public void setTimeRangeDefault(Long TimeRangeDefault) {
        this.TimeRangeDefault = TimeRangeDefault;
    }

    /**
     * Get 爆破事件失败次数（默认规则） 
     * @return LoginFailTimesDefault 爆破事件失败次数（默认规则）
     */
    public Long getLoginFailTimesDefault() {
        return this.LoginFailTimesDefault;
    }

    /**
     * Set 爆破事件失败次数（默认规则）
     * @param LoginFailTimesDefault 爆破事件失败次数（默认规则）
     */
    public void setLoginFailTimesDefault(Long LoginFailTimesDefault) {
        this.LoginFailTimesDefault = LoginFailTimesDefault;
    }

    public BruteAttackRuleList() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BruteAttackRuleList(BruteAttackRuleList source) {
        if (source.TimeRange != null) {
            this.TimeRange = new Long(source.TimeRange);
        }
        if (source.LoginFailTimes != null) {
            this.LoginFailTimes = new Long(source.LoginFailTimes);
        }
        if (source.Enable != null) {
            this.Enable = new Boolean(source.Enable);
        }
        if (source.TimeRangeDefault != null) {
            this.TimeRangeDefault = new Long(source.TimeRangeDefault);
        }
        if (source.LoginFailTimesDefault != null) {
            this.LoginFailTimesDefault = new Long(source.LoginFailTimesDefault);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "LoginFailTimes", this.LoginFailTimes);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "TimeRangeDefault", this.TimeRangeDefault);
        this.setParamSimple(map, prefix + "LoginFailTimesDefault", this.LoginFailTimesDefault);

    }
}

