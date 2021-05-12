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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EditInfo extends AbstractModel{

    /**
    * 剪辑开始时间，单位：ms。
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 剪辑结束时间，单位：ms
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 剪辑开始时间，单位：ms。 
     * @return StartTime 剪辑开始时间，单位：ms。
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 剪辑开始时间，单位：ms。
     * @param StartTime 剪辑开始时间，单位：ms。
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 剪辑结束时间，单位：ms 
     * @return EndTime 剪辑结束时间，单位：ms
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 剪辑结束时间，单位：ms
     * @param EndTime 剪辑结束时间，单位：ms
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    public EditInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EditInfo(EditInfo source) {
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new Long(source.EndTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

