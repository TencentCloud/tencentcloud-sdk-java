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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TImeCycle extends AbstractModel {

    /**
    * 按周期扩容时，是否选择周一扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
    */
    @SerializedName("Monday")
    @Expose
    private Boolean Monday;

    /**
    * 按周期扩容时，是否选择周二扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
    */
    @SerializedName("Tuesday")
    @Expose
    private Boolean Tuesday;

    /**
    * 按周期扩容时，是否选择周三扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
    */
    @SerializedName("Wednesday")
    @Expose
    private Boolean Wednesday;

    /**
    * 按周期扩容时，是否选择周四扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
    */
    @SerializedName("Thursday")
    @Expose
    private Boolean Thursday;

    /**
    * 按周期扩容时，是否选择周五扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
    */
    @SerializedName("Friday")
    @Expose
    private Boolean Friday;

    /**
    * 按周期扩容时，是否选择周六扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
    */
    @SerializedName("Saturday")
    @Expose
    private Boolean Saturday;

    /**
    * 按周期扩容时，是否选择周日扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
    */
    @SerializedName("Sunday")
    @Expose
    private Boolean Sunday;

    /**
     * Get 按周期扩容时，是否选择周一扩容。
说明：取值 true，表示选择，取值 false，表示不选择。 
     * @return Monday 按周期扩容时，是否选择周一扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public Boolean getMonday() {
        return this.Monday;
    }

    /**
     * Set 按周期扩容时，是否选择周一扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     * @param Monday 按周期扩容时，是否选择周一扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public void setMonday(Boolean Monday) {
        this.Monday = Monday;
    }

    /**
     * Get 按周期扩容时，是否选择周二扩容。
说明：取值 true，表示选择，取值 false，表示不选择。 
     * @return Tuesday 按周期扩容时，是否选择周二扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public Boolean getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set 按周期扩容时，是否选择周二扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     * @param Tuesday 按周期扩容时，是否选择周二扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public void setTuesday(Boolean Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get 按周期扩容时，是否选择周三扩容。
说明：取值 true，表示选择，取值 false，表示不选择。 
     * @return Wednesday 按周期扩容时，是否选择周三扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public Boolean getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set 按周期扩容时，是否选择周三扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     * @param Wednesday 按周期扩容时，是否选择周三扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public void setWednesday(Boolean Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get 按周期扩容时，是否选择周四扩容。
说明：取值 true，表示选择，取值 false，表示不选择。 
     * @return Thursday 按周期扩容时，是否选择周四扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public Boolean getThursday() {
        return this.Thursday;
    }

    /**
     * Set 按周期扩容时，是否选择周四扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     * @param Thursday 按周期扩容时，是否选择周四扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public void setThursday(Boolean Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get 按周期扩容时，是否选择周五扩容。
说明：取值 true，表示选择，取值 false，表示不选择。 
     * @return Friday 按周期扩容时，是否选择周五扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public Boolean getFriday() {
        return this.Friday;
    }

    /**
     * Set 按周期扩容时，是否选择周五扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     * @param Friday 按周期扩容时，是否选择周五扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public void setFriday(Boolean Friday) {
        this.Friday = Friday;
    }

    /**
     * Get 按周期扩容时，是否选择周六扩容。
说明：取值 true，表示选择，取值 false，表示不选择。 
     * @return Saturday 按周期扩容时，是否选择周六扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public Boolean getSaturday() {
        return this.Saturday;
    }

    /**
     * Set 按周期扩容时，是否选择周六扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     * @param Saturday 按周期扩容时，是否选择周六扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public void setSaturday(Boolean Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get 按周期扩容时，是否选择周日扩容。
说明：取值 true，表示选择，取值 false，表示不选择。 
     * @return Sunday 按周期扩容时，是否选择周日扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public Boolean getSunday() {
        return this.Sunday;
    }

    /**
     * Set 按周期扩容时，是否选择周日扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     * @param Sunday 按周期扩容时，是否选择周日扩容。
说明：取值 true，表示选择，取值 false，表示不选择。
     */
    public void setSunday(Boolean Sunday) {
        this.Sunday = Sunday;
    }

    public TImeCycle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TImeCycle(TImeCycle source) {
        if (source.Monday != null) {
            this.Monday = new Boolean(source.Monday);
        }
        if (source.Tuesday != null) {
            this.Tuesday = new Boolean(source.Tuesday);
        }
        if (source.Wednesday != null) {
            this.Wednesday = new Boolean(source.Wednesday);
        }
        if (source.Thursday != null) {
            this.Thursday = new Boolean(source.Thursday);
        }
        if (source.Friday != null) {
            this.Friday = new Boolean(source.Friday);
        }
        if (source.Saturday != null) {
            this.Saturday = new Boolean(source.Saturday);
        }
        if (source.Sunday != null) {
            this.Sunday = new Boolean(source.Sunday);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Monday", this.Monday);
        this.setParamSimple(map, prefix + "Tuesday", this.Tuesday);
        this.setParamSimple(map, prefix + "Wednesday", this.Wednesday);
        this.setParamSimple(map, prefix + "Thursday", this.Thursday);
        this.setParamSimple(map, prefix + "Friday", this.Friday);
        this.setParamSimple(map, prefix + "Saturday", this.Saturday);
        this.setParamSimple(map, prefix + "Sunday", this.Sunday);

    }
}

