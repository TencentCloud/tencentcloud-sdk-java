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
    * 周一的扩容时间段
    */
    @SerializedName("Monday")
    @Expose
    private Boolean Monday;

    /**
    * 周二的扩容时间段
    */
    @SerializedName("Tuesday")
    @Expose
    private Boolean Tuesday;

    /**
    * 周三的扩容时间段
    */
    @SerializedName("Wednesday")
    @Expose
    private Boolean Wednesday;

    /**
    * 周四的扩容时间段
    */
    @SerializedName("Thursday")
    @Expose
    private Boolean Thursday;

    /**
    * 周五的扩容时间段
    */
    @SerializedName("Friday")
    @Expose
    private Boolean Friday;

    /**
    * 周六的扩容时间段
    */
    @SerializedName("Saturday")
    @Expose
    private Boolean Saturday;

    /**
    * 周日的扩容时间段
    */
    @SerializedName("Sunday")
    @Expose
    private Boolean Sunday;

    /**
     * Get 周一的扩容时间段 
     * @return Monday 周一的扩容时间段
     */
    public Boolean getMonday() {
        return this.Monday;
    }

    /**
     * Set 周一的扩容时间段
     * @param Monday 周一的扩容时间段
     */
    public void setMonday(Boolean Monday) {
        this.Monday = Monday;
    }

    /**
     * Get 周二的扩容时间段 
     * @return Tuesday 周二的扩容时间段
     */
    public Boolean getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set 周二的扩容时间段
     * @param Tuesday 周二的扩容时间段
     */
    public void setTuesday(Boolean Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get 周三的扩容时间段 
     * @return Wednesday 周三的扩容时间段
     */
    public Boolean getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set 周三的扩容时间段
     * @param Wednesday 周三的扩容时间段
     */
    public void setWednesday(Boolean Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get 周四的扩容时间段 
     * @return Thursday 周四的扩容时间段
     */
    public Boolean getThursday() {
        return this.Thursday;
    }

    /**
     * Set 周四的扩容时间段
     * @param Thursday 周四的扩容时间段
     */
    public void setThursday(Boolean Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get 周五的扩容时间段 
     * @return Friday 周五的扩容时间段
     */
    public Boolean getFriday() {
        return this.Friday;
    }

    /**
     * Set 周五的扩容时间段
     * @param Friday 周五的扩容时间段
     */
    public void setFriday(Boolean Friday) {
        this.Friday = Friday;
    }

    /**
     * Get 周六的扩容时间段 
     * @return Saturday 周六的扩容时间段
     */
    public Boolean getSaturday() {
        return this.Saturday;
    }

    /**
     * Set 周六的扩容时间段
     * @param Saturday 周六的扩容时间段
     */
    public void setSaturday(Boolean Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get 周日的扩容时间段 
     * @return Sunday 周日的扩容时间段
     */
    public Boolean getSunday() {
        return this.Sunday;
    }

    /**
     * Set 周日的扩容时间段
     * @param Sunday 周日的扩容时间段
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

