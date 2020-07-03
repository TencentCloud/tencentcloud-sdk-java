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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetBandwidthConfig extends AbstractModel{

    /**
    * 开始时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 实例带宽信息。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
     * Get 开始时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return StartTime 开始时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param StartTime 开始时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。 
     * @return EndTime 结束时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     * @param EndTime 结束时间。按照`ISO8601`标准表示，并且使用`UTC`时间。格式为：`YYYY-MM-DDThh:mm:ssZ`。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 实例带宽信息。 
     * @return InternetAccessible 实例带宽信息。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * Set 实例带宽信息。
     * @param InternetAccessible 实例带宽信息。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);

    }
}

