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
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonTimeWindow extends AbstractModel{

    /**
    * 周一的时间窗，格式如： 02:00-06:00
    */
    @SerializedName("Monday")
    @Expose
    private String Monday;

    /**
    * 周二的时间窗，格式如： 02:00-06:00
    */
    @SerializedName("Tuesday")
    @Expose
    private String Tuesday;

    /**
    * 周三的时间窗，格式如： 02:00-06:00
    */
    @SerializedName("Wednesday")
    @Expose
    private String Wednesday;

    /**
    * 周四的时间窗，格式如： 02:00-06:00
    */
    @SerializedName("Thursday")
    @Expose
    private String Thursday;

    /**
    * 周五的时间窗，格式如： 02:00-06:00
    */
    @SerializedName("Friday")
    @Expose
    private String Friday;

    /**
    * 周六的时间窗，格式如： 02:00-06:00
    */
    @SerializedName("Saturday")
    @Expose
    private String Saturday;

    /**
    * 周日的时间窗，格式如： 02:00-06:00
    */
    @SerializedName("Sunday")
    @Expose
    private String Sunday;

    /**
     * Get 周一的时间窗，格式如： 02:00-06:00 
     * @return Monday 周一的时间窗，格式如： 02:00-06:00
     */
    public String getMonday() {
        return this.Monday;
    }

    /**
     * Set 周一的时间窗，格式如： 02:00-06:00
     * @param Monday 周一的时间窗，格式如： 02:00-06:00
     */
    public void setMonday(String Monday) {
        this.Monday = Monday;
    }

    /**
     * Get 周二的时间窗，格式如： 02:00-06:00 
     * @return Tuesday 周二的时间窗，格式如： 02:00-06:00
     */
    public String getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set 周二的时间窗，格式如： 02:00-06:00
     * @param Tuesday 周二的时间窗，格式如： 02:00-06:00
     */
    public void setTuesday(String Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get 周三的时间窗，格式如： 02:00-06:00 
     * @return Wednesday 周三的时间窗，格式如： 02:00-06:00
     */
    public String getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set 周三的时间窗，格式如： 02:00-06:00
     * @param Wednesday 周三的时间窗，格式如： 02:00-06:00
     */
    public void setWednesday(String Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get 周四的时间窗，格式如： 02:00-06:00 
     * @return Thursday 周四的时间窗，格式如： 02:00-06:00
     */
    public String getThursday() {
        return this.Thursday;
    }

    /**
     * Set 周四的时间窗，格式如： 02:00-06:00
     * @param Thursday 周四的时间窗，格式如： 02:00-06:00
     */
    public void setThursday(String Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get 周五的时间窗，格式如： 02:00-06:00 
     * @return Friday 周五的时间窗，格式如： 02:00-06:00
     */
    public String getFriday() {
        return this.Friday;
    }

    /**
     * Set 周五的时间窗，格式如： 02:00-06:00
     * @param Friday 周五的时间窗，格式如： 02:00-06:00
     */
    public void setFriday(String Friday) {
        this.Friday = Friday;
    }

    /**
     * Get 周六的时间窗，格式如： 02:00-06:00 
     * @return Saturday 周六的时间窗，格式如： 02:00-06:00
     */
    public String getSaturday() {
        return this.Saturday;
    }

    /**
     * Set 周六的时间窗，格式如： 02:00-06:00
     * @param Saturday 周六的时间窗，格式如： 02:00-06:00
     */
    public void setSaturday(String Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get 周日的时间窗，格式如： 02:00-06:00 
     * @return Sunday 周日的时间窗，格式如： 02:00-06:00
     */
    public String getSunday() {
        return this.Sunday;
    }

    /**
     * Set 周日的时间窗，格式如： 02:00-06:00
     * @param Sunday 周日的时间窗，格式如： 02:00-06:00
     */
    public void setSunday(String Sunday) {
        this.Sunday = Sunday;
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

