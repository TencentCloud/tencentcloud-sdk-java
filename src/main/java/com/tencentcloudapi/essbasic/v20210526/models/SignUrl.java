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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignUrl extends AbstractModel{

    /**
    * 小程序签署链接
    */
    @SerializedName("AppSignUrl")
    @Expose
    private String AppSignUrl;

    /**
    * 签署链接有效时间
    */
    @SerializedName("EffectiveTime")
    @Expose
    private String EffectiveTime;

    /**
    * 移动端签署链接
    */
    @SerializedName("HttpSignUrl")
    @Expose
    private String HttpSignUrl;

    /**
     * Get 小程序签署链接 
     * @return AppSignUrl 小程序签署链接
     */
    public String getAppSignUrl() {
        return this.AppSignUrl;
    }

    /**
     * Set 小程序签署链接
     * @param AppSignUrl 小程序签署链接
     */
    public void setAppSignUrl(String AppSignUrl) {
        this.AppSignUrl = AppSignUrl;
    }

    /**
     * Get 签署链接有效时间 
     * @return EffectiveTime 签署链接有效时间
     */
    public String getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 签署链接有效时间
     * @param EffectiveTime 签署链接有效时间
     */
    public void setEffectiveTime(String EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 移动端签署链接 
     * @return HttpSignUrl 移动端签署链接
     */
    public String getHttpSignUrl() {
        return this.HttpSignUrl;
    }

    /**
     * Set 移动端签署链接
     * @param HttpSignUrl 移动端签署链接
     */
    public void setHttpSignUrl(String HttpSignUrl) {
        this.HttpSignUrl = HttpSignUrl;
    }

    public SignUrl() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignUrl(SignUrl source) {
        if (source.AppSignUrl != null) {
            this.AppSignUrl = new String(source.AppSignUrl);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new String(source.EffectiveTime);
        }
        if (source.HttpSignUrl != null) {
            this.HttpSignUrl = new String(source.HttpSignUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppSignUrl", this.AppSignUrl);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "HttpSignUrl", this.HttpSignUrl);

    }
}

