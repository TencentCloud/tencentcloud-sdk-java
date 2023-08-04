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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SmokingAIResultInfo extends AbstractModel{

    /**
    * 时间字符串
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 截图 URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 抽烟信息
    */
    @SerializedName("SmokingInfo")
    @Expose
    private BaseAIResultInfo [] SmokingInfo;

    /**
     * Get 时间字符串 
     * @return Time 时间字符串
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * Set 时间字符串
     * @param Time 时间字符串
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * Get 截图 URL 
     * @return Url 截图 URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 截图 URL
     * @param Url 截图 URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 抽烟信息 
     * @return SmokingInfo 抽烟信息
     */
    public BaseAIResultInfo [] getSmokingInfo() {
        return this.SmokingInfo;
    }

    /**
     * Set 抽烟信息
     * @param SmokingInfo 抽烟信息
     */
    public void setSmokingInfo(BaseAIResultInfo [] SmokingInfo) {
        this.SmokingInfo = SmokingInfo;
    }

    public SmokingAIResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SmokingAIResultInfo(SmokingAIResultInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.SmokingInfo != null) {
            this.SmokingInfo = new BaseAIResultInfo[source.SmokingInfo.length];
            for (int i = 0; i < source.SmokingInfo.length; i++) {
                this.SmokingInfo[i] = new BaseAIResultInfo(source.SmokingInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "SmokingInfo.", this.SmokingInfo);

    }
}

