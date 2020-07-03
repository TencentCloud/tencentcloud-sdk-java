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
package com.tencentcloudapi.tics.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntelligenceType extends AbstractModel{

    /**
    * 来源
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 标记
    */
    @SerializedName("Stamp")
    @Expose
    private String Stamp;

    /**
    * 时间
    */
    @SerializedName("Time")
    @Expose
    private Long Time;

    /**
     * Get 来源 
     * @return Source 来源
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * Set 来源
     * @param Source 来源
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * Get 标记 
     * @return Stamp 标记
     */
    public String getStamp() {
        return this.Stamp;
    }

    /**
     * Set 标记
     * @param Stamp 标记
     */
    public void setStamp(String Stamp) {
        this.Stamp = Stamp;
    }

    /**
     * Get 时间 
     * @return Time 时间
     */
    public Long getTime() {
        return this.Time;
    }

    /**
     * Set 时间
     * @param Time 时间
     */
    public void setTime(Long Time) {
        this.Time = Time;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Stamp", this.Stamp);
        this.setParamSimple(map, prefix + "Time", this.Time);

    }
}

