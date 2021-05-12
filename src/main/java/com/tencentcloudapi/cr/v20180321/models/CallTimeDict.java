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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CallTimeDict extends AbstractModel{

    /**
    * 周一
    */
    @SerializedName("Monday")
    @Expose
    private CallTimeInfo Monday;

    /**
    * 周二
    */
    @SerializedName("Tuesday")
    @Expose
    private CallTimeInfo Tuesday;

    /**
    * 周三
    */
    @SerializedName("Wednesday")
    @Expose
    private CallTimeInfo Wednesday;

    /**
    * 周四
    */
    @SerializedName("Thursday")
    @Expose
    private CallTimeInfo Thursday;

    /**
    * 周五
    */
    @SerializedName("Friday")
    @Expose
    private CallTimeInfo Friday;

    /**
    * 周六
    */
    @SerializedName("Saturday")
    @Expose
    private CallTimeInfo Saturday;

    /**
    * 周日
    */
    @SerializedName("Sunday")
    @Expose
    private CallTimeInfo Sunday;

    /**
     * Get 周一 
     * @return Monday 周一
     */
    public CallTimeInfo getMonday() {
        return this.Monday;
    }

    /**
     * Set 周一
     * @param Monday 周一
     */
    public void setMonday(CallTimeInfo Monday) {
        this.Monday = Monday;
    }

    /**
     * Get 周二 
     * @return Tuesday 周二
     */
    public CallTimeInfo getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set 周二
     * @param Tuesday 周二
     */
    public void setTuesday(CallTimeInfo Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get 周三 
     * @return Wednesday 周三
     */
    public CallTimeInfo getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set 周三
     * @param Wednesday 周三
     */
    public void setWednesday(CallTimeInfo Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get 周四 
     * @return Thursday 周四
     */
    public CallTimeInfo getThursday() {
        return this.Thursday;
    }

    /**
     * Set 周四
     * @param Thursday 周四
     */
    public void setThursday(CallTimeInfo Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get 周五 
     * @return Friday 周五
     */
    public CallTimeInfo getFriday() {
        return this.Friday;
    }

    /**
     * Set 周五
     * @param Friday 周五
     */
    public void setFriday(CallTimeInfo Friday) {
        this.Friday = Friday;
    }

    /**
     * Get 周六 
     * @return Saturday 周六
     */
    public CallTimeInfo getSaturday() {
        return this.Saturday;
    }

    /**
     * Set 周六
     * @param Saturday 周六
     */
    public void setSaturday(CallTimeInfo Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get 周日 
     * @return Sunday 周日
     */
    public CallTimeInfo getSunday() {
        return this.Sunday;
    }

    /**
     * Set 周日
     * @param Sunday 周日
     */
    public void setSunday(CallTimeInfo Sunday) {
        this.Sunday = Sunday;
    }

    public CallTimeDict() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CallTimeDict(CallTimeDict source) {
        if (source.Monday != null) {
            this.Monday = new CallTimeInfo(source.Monday);
        }
        if (source.Tuesday != null) {
            this.Tuesday = new CallTimeInfo(source.Tuesday);
        }
        if (source.Wednesday != null) {
            this.Wednesday = new CallTimeInfo(source.Wednesday);
        }
        if (source.Thursday != null) {
            this.Thursday = new CallTimeInfo(source.Thursday);
        }
        if (source.Friday != null) {
            this.Friday = new CallTimeInfo(source.Friday);
        }
        if (source.Saturday != null) {
            this.Saturday = new CallTimeInfo(source.Saturday);
        }
        if (source.Sunday != null) {
            this.Sunday = new CallTimeInfo(source.Sunday);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Monday.", this.Monday);
        this.setParamObj(map, prefix + "Tuesday.", this.Tuesday);
        this.setParamObj(map, prefix + "Wednesday.", this.Wednesday);
        this.setParamObj(map, prefix + "Thursday.", this.Thursday);
        this.setParamObj(map, prefix + "Friday.", this.Friday);
        this.setParamObj(map, prefix + "Saturday.", this.Saturday);
        this.setParamObj(map, prefix + "Sunday.", this.Sunday);

    }
}

