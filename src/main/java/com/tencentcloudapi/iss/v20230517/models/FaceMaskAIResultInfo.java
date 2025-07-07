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
package com.tencentcloudapi.iss.v20230517.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FaceMaskAIResultInfo extends AbstractModel {

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
    * 口罩信息
    */
    @SerializedName("FaceMaskInfo")
    @Expose
    private BaseAIResultInfo [] FaceMaskInfo;

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
     * Get 口罩信息 
     * @return FaceMaskInfo 口罩信息
     */
    public BaseAIResultInfo [] getFaceMaskInfo() {
        return this.FaceMaskInfo;
    }

    /**
     * Set 口罩信息
     * @param FaceMaskInfo 口罩信息
     */
    public void setFaceMaskInfo(BaseAIResultInfo [] FaceMaskInfo) {
        this.FaceMaskInfo = FaceMaskInfo;
    }

    public FaceMaskAIResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FaceMaskAIResultInfo(FaceMaskAIResultInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FaceMaskInfo != null) {
            this.FaceMaskInfo = new BaseAIResultInfo[source.FaceMaskInfo.length];
            for (int i = 0; i < source.FaceMaskInfo.length; i++) {
                this.FaceMaskInfo[i] = new BaseAIResultInfo(source.FaceMaskInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "FaceMaskInfo.", this.FaceMaskInfo);

    }
}

