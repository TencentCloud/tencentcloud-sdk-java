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

public class PetAIResultInfo extends AbstractModel{

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
    * 宠物信息
    */
    @SerializedName("PetInfo")
    @Expose
    private BaseAIResultInfo [] PetInfo;

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
     * Get 宠物信息 
     * @return PetInfo 宠物信息
     */
    public BaseAIResultInfo [] getPetInfo() {
        return this.PetInfo;
    }

    /**
     * Set 宠物信息
     * @param PetInfo 宠物信息
     */
    public void setPetInfo(BaseAIResultInfo [] PetInfo) {
        this.PetInfo = PetInfo;
    }

    public PetAIResultInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PetAIResultInfo(PetAIResultInfo source) {
        if (source.Time != null) {
            this.Time = new String(source.Time);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.PetInfo != null) {
            this.PetInfo = new BaseAIResultInfo[source.PetInfo.length];
            for (int i = 0; i < source.PetInfo.length; i++) {
                this.PetInfo[i] = new BaseAIResultInfo(source.PetInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamArrayObj(map, prefix + "PetInfo.", this.PetInfo);

    }
}

