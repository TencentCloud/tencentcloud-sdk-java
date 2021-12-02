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
package com.tencentcloudapi.cme.v20191029.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RtmpPushInputInfo extends AbstractModel{

    /**
    * 直播推流地址有效期，单位：秒 。
    */
    @SerializedName("ExpiredSecond")
    @Expose
    private Long ExpiredSecond;

    /**
    * 直播推流地址，入参不填默认由多媒体创作引擎生成。
    */
    @SerializedName("PushUrl")
    @Expose
    private String PushUrl;

    /**
     * Get 直播推流地址有效期，单位：秒 。 
     * @return ExpiredSecond 直播推流地址有效期，单位：秒 。
     */
    public Long getExpiredSecond() {
        return this.ExpiredSecond;
    }

    /**
     * Set 直播推流地址有效期，单位：秒 。
     * @param ExpiredSecond 直播推流地址有效期，单位：秒 。
     */
    public void setExpiredSecond(Long ExpiredSecond) {
        this.ExpiredSecond = ExpiredSecond;
    }

    /**
     * Get 直播推流地址，入参不填默认由多媒体创作引擎生成。 
     * @return PushUrl 直播推流地址，入参不填默认由多媒体创作引擎生成。
     */
    public String getPushUrl() {
        return this.PushUrl;
    }

    /**
     * Set 直播推流地址，入参不填默认由多媒体创作引擎生成。
     * @param PushUrl 直播推流地址，入参不填默认由多媒体创作引擎生成。
     */
    public void setPushUrl(String PushUrl) {
        this.PushUrl = PushUrl;
    }

    public RtmpPushInputInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RtmpPushInputInfo(RtmpPushInputInfo source) {
        if (source.ExpiredSecond != null) {
            this.ExpiredSecond = new Long(source.ExpiredSecond);
        }
        if (source.PushUrl != null) {
            this.PushUrl = new String(source.PushUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExpiredSecond", this.ExpiredSecond);
        this.setParamSimple(map, prefix + "PushUrl", this.PushUrl);

    }
}

