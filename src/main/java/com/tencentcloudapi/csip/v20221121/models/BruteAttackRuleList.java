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

public class BruteAttackRuleList extends AbstractModel {

    /**
    * <p>爆破事件发生的时间范围，单位：秒</p>
    */
    @SerializedName("TimeRange")
    @Expose
    private Long TimeRange;

    /**
    * <p>爆破事件失败次数</p>
    */
    @SerializedName("LoginFailTimes")
    @Expose
    private Long LoginFailTimes;

    /**
    * <p>规则是否为空，为空则填充默认规则</p>
    */
    @SerializedName("Enable")
    @Expose
    private Boolean Enable;

    /**
    * <p>爆破事件发生的时间范围，单位：秒（默认规则）</p>
    */
    @SerializedName("TimeRangeDefault")
    @Expose
    private Long TimeRangeDefault;

    /**
    * <p>爆破事件失败次数（默认规则）</p>
    */
    @SerializedName("LoginFailTimesDefault")
    @Expose
    private Long LoginFailTimesDefault;

    /**
     * Get <p>爆破事件发生的时间范围，单位：秒</p> 
     * @return TimeRange <p>爆破事件发生的时间范围，单位：秒</p>
     */
    public Long getTimeRange() {
        return this.TimeRange;
    }

    /**
     * Set <p>爆破事件发生的时间范围，单位：秒</p>
     * @param TimeRange <p>爆破事件发生的时间范围，单位：秒</p>
     */
    public void setTimeRange(Long TimeRange) {
        this.TimeRange = TimeRange;
    }

    /**
     * Get <p>爆破事件失败次数</p> 
     * @return LoginFailTimes <p>爆破事件失败次数</p>
     */
    public Long getLoginFailTimes() {
        return this.LoginFailTimes;
    }

    /**
     * Set <p>爆破事件失败次数</p>
     * @param LoginFailTimes <p>爆破事件失败次数</p>
     */
    public void setLoginFailTimes(Long LoginFailTimes) {
        this.LoginFailTimes = LoginFailTimes;
    }

    /**
     * Get <p>规则是否为空，为空则填充默认规则</p> 
     * @return Enable <p>规则是否为空，为空则填充默认规则</p>
     */
    public Boolean getEnable() {
        return this.Enable;
    }

    /**
     * Set <p>规则是否为空，为空则填充默认规则</p>
     * @param Enable <p>规则是否为空，为空则填充默认规则</p>
     */
    public void setEnable(Boolean Enable) {
        this.Enable = Enable;
    }

    /**
     * Get <p>爆破事件发生的时间范围，单位：秒（默认规则）</p> 
     * @return TimeRangeDefault <p>爆破事件发生的时间范围，单位：秒（默认规则）</p>
     */
    public Long getTimeRangeDefault() {
        return this.TimeRangeDefault;
    }

    /**
     * Set <p>爆破事件发生的时间范围，单位：秒（默认规则）</p>
     * @param TimeRangeDefault <p>爆破事件发生的时间范围，单位：秒（默认规则）</p>
     */
    public void setTimeRangeDefault(Long TimeRangeDefault) {
        this.TimeRangeDefault = TimeRangeDefault;
    }

    /**
     * Get <p>爆破事件失败次数（默认规则）</p> 
     * @return LoginFailTimesDefault <p>爆破事件失败次数（默认规则）</p>
     */
    public Long getLoginFailTimesDefault() {
        return this.LoginFailTimesDefault;
    }

    /**
     * Set <p>爆破事件失败次数（默认规则）</p>
     * @param LoginFailTimesDefault <p>爆破事件失败次数（默认规则）</p>
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

