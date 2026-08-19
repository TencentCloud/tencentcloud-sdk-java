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

public class BruteAttackRule extends AbstractModel {

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

    public BruteAttackRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BruteAttackRule(BruteAttackRule source) {
        if (source.TimeRange != null) {
            this.TimeRange = new Long(source.TimeRange);
        }
        if (source.LoginFailTimes != null) {
            this.LoginFailTimes = new Long(source.LoginFailTimes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimeRange", this.TimeRange);
        this.setParamSimple(map, prefix + "LoginFailTimes", this.LoginFailTimes);

    }
}

