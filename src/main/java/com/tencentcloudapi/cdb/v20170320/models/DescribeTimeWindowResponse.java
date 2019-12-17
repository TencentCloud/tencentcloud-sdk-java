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

public class DescribeTimeWindowResponse extends AbstractModel{

    /**
    * 星期一的可维护时间列表。
    */
    @SerializedName("Monday")
    @Expose
    private String [] Monday;

    /**
    * 星期二的可维护时间列表。
    */
    @SerializedName("Tuesday")
    @Expose
    private String [] Tuesday;

    /**
    * 星期三的可维护时间列表。
    */
    @SerializedName("Wednesday")
    @Expose
    private String [] Wednesday;

    /**
    * 星期四的可维护时间列表。
    */
    @SerializedName("Thursday")
    @Expose
    private String [] Thursday;

    /**
    * 星期五的可维护时间列表。
    */
    @SerializedName("Friday")
    @Expose
    private String [] Friday;

    /**
    * 星期六的可维护时间列表。
    */
    @SerializedName("Saturday")
    @Expose
    private String [] Saturday;

    /**
    * 星期日的可维护时间列表。
    */
    @SerializedName("Sunday")
    @Expose
    private String [] Sunday;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 星期一的可维护时间列表。 
     * @return Monday 星期一的可维护时间列表。
     */
    public String [] getMonday() {
        return this.Monday;
    }

    /**
     * Set 星期一的可维护时间列表。
     * @param Monday 星期一的可维护时间列表。
     */
    public void setMonday(String [] Monday) {
        this.Monday = Monday;
    }

    /**
     * Get 星期二的可维护时间列表。 
     * @return Tuesday 星期二的可维护时间列表。
     */
    public String [] getTuesday() {
        return this.Tuesday;
    }

    /**
     * Set 星期二的可维护时间列表。
     * @param Tuesday 星期二的可维护时间列表。
     */
    public void setTuesday(String [] Tuesday) {
        this.Tuesday = Tuesday;
    }

    /**
     * Get 星期三的可维护时间列表。 
     * @return Wednesday 星期三的可维护时间列表。
     */
    public String [] getWednesday() {
        return this.Wednesday;
    }

    /**
     * Set 星期三的可维护时间列表。
     * @param Wednesday 星期三的可维护时间列表。
     */
    public void setWednesday(String [] Wednesday) {
        this.Wednesday = Wednesday;
    }

    /**
     * Get 星期四的可维护时间列表。 
     * @return Thursday 星期四的可维护时间列表。
     */
    public String [] getThursday() {
        return this.Thursday;
    }

    /**
     * Set 星期四的可维护时间列表。
     * @param Thursday 星期四的可维护时间列表。
     */
    public void setThursday(String [] Thursday) {
        this.Thursday = Thursday;
    }

    /**
     * Get 星期五的可维护时间列表。 
     * @return Friday 星期五的可维护时间列表。
     */
    public String [] getFriday() {
        return this.Friday;
    }

    /**
     * Set 星期五的可维护时间列表。
     * @param Friday 星期五的可维护时间列表。
     */
    public void setFriday(String [] Friday) {
        this.Friday = Friday;
    }

    /**
     * Get 星期六的可维护时间列表。 
     * @return Saturday 星期六的可维护时间列表。
     */
    public String [] getSaturday() {
        return this.Saturday;
    }

    /**
     * Set 星期六的可维护时间列表。
     * @param Saturday 星期六的可维护时间列表。
     */
    public void setSaturday(String [] Saturday) {
        this.Saturday = Saturday;
    }

    /**
     * Get 星期日的可维护时间列表。 
     * @return Sunday 星期日的可维护时间列表。
     */
    public String [] getSunday() {
        return this.Sunday;
    }

    /**
     * Set 星期日的可维护时间列表。
     * @param Sunday 星期日的可维护时间列表。
     */
    public void setSunday(String [] Sunday) {
        this.Sunday = Sunday;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Monday.", this.Monday);
        this.setParamArraySimple(map, prefix + "Tuesday.", this.Tuesday);
        this.setParamArraySimple(map, prefix + "Wednesday.", this.Wednesday);
        this.setParamArraySimple(map, prefix + "Thursday.", this.Thursday);
        this.setParamArraySimple(map, prefix + "Friday.", this.Friday);
        this.setParamArraySimple(map, prefix + "Saturday.", this.Saturday);
        this.setParamArraySimple(map, prefix + "Sunday.", this.Sunday);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

