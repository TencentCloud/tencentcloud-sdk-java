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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DynamicImageInfo extends AbstractModel {

    /**
    * 画面质量，范围：1~100。
<li>对于webp格式，默认：75</li>
<li>对于gif格式，小于10为低质量，大于50为高质量，其它为普通。默认：低质量。</li>
    */
    @SerializedName("Quality")
    @Expose
    private Long Quality;

    /**
     * Get 画面质量，范围：1~100。
<li>对于webp格式，默认：75</li>
<li>对于gif格式，小于10为低质量，大于50为高质量，其它为普通。默认：低质量。</li> 
     * @return Quality 画面质量，范围：1~100。
<li>对于webp格式，默认：75</li>
<li>对于gif格式，小于10为低质量，大于50为高质量，其它为普通。默认：低质量。</li>
     */
    public Long getQuality() {
        return this.Quality;
    }

    /**
     * Set 画面质量，范围：1~100。
<li>对于webp格式，默认：75</li>
<li>对于gif格式，小于10为低质量，大于50为高质量，其它为普通。默认：低质量。</li>
     * @param Quality 画面质量，范围：1~100。
<li>对于webp格式，默认：75</li>
<li>对于gif格式，小于10为低质量，大于50为高质量，其它为普通。默认：低质量。</li>
     */
    public void setQuality(Long Quality) {
        this.Quality = Quality;
    }

    public DynamicImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DynamicImageInfo(DynamicImageInfo source) {
        if (source.Quality != null) {
            this.Quality = new Long(source.Quality);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Quality", this.Quality);

    }
}

