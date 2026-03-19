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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveAvatarTimbreListRequest extends AbstractModel {

    /**
    * 过滤音色性别。默认不过滤。
male - 男性，
female -女性。
    */
    @SerializedName("TimbreGender")
    @Expose
    private String TimbreGender;

    /**
     * Get 过滤音色性别。默认不过滤。
male - 男性，
female -女性。 
     * @return TimbreGender 过滤音色性别。默认不过滤。
male - 男性，
female -女性。
     */
    public String getTimbreGender() {
        return this.TimbreGender;
    }

    /**
     * Set 过滤音色性别。默认不过滤。
male - 男性，
female -女性。
     * @param TimbreGender 过滤音色性别。默认不过滤。
male - 男性，
female -女性。
     */
    public void setTimbreGender(String TimbreGender) {
        this.TimbreGender = TimbreGender;
    }

    public DescribeLiveAvatarTimbreListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLiveAvatarTimbreListRequest(DescribeLiveAvatarTimbreListRequest source) {
        if (source.TimbreGender != null) {
            this.TimbreGender = new String(source.TimbreGender);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TimbreGender", this.TimbreGender);

    }
}

