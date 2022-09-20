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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistrictStatistics extends AbstractModel{

    /**
    * ISO 3166-2 国家/地区简写，详情请参考[ISO 3166-2](https://zh.m.wikipedia.org/zh-hans/ISO_3166-2)。
    */
    @SerializedName("Alpha2")
    @Expose
    private String Alpha2;

    /**
    * 整体拨测用时，单位ms。
    */
    @SerializedName("LoadTime")
    @Expose
    private Long LoadTime;

    /**
     * Get ISO 3166-2 国家/地区简写，详情请参考[ISO 3166-2](https://zh.m.wikipedia.org/zh-hans/ISO_3166-2)。 
     * @return Alpha2 ISO 3166-2 国家/地区简写，详情请参考[ISO 3166-2](https://zh.m.wikipedia.org/zh-hans/ISO_3166-2)。
     */
    public String getAlpha2() {
        return this.Alpha2;
    }

    /**
     * Set ISO 3166-2 国家/地区简写，详情请参考[ISO 3166-2](https://zh.m.wikipedia.org/zh-hans/ISO_3166-2)。
     * @param Alpha2 ISO 3166-2 国家/地区简写，详情请参考[ISO 3166-2](https://zh.m.wikipedia.org/zh-hans/ISO_3166-2)。
     */
    public void setAlpha2(String Alpha2) {
        this.Alpha2 = Alpha2;
    }

    /**
     * Get 整体拨测用时，单位ms。 
     * @return LoadTime 整体拨测用时，单位ms。
     */
    public Long getLoadTime() {
        return this.LoadTime;
    }

    /**
     * Set 整体拨测用时，单位ms。
     * @param LoadTime 整体拨测用时，单位ms。
     */
    public void setLoadTime(Long LoadTime) {
        this.LoadTime = LoadTime;
    }

    public DistrictStatistics() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistrictStatistics(DistrictStatistics source) {
        if (source.Alpha2 != null) {
            this.Alpha2 = new String(source.Alpha2);
        }
        if (source.LoadTime != null) {
            this.LoadTime = new Long(source.LoadTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Alpha2", this.Alpha2);
        this.setParamSimple(map, prefix + "LoadTime", this.LoadTime);

    }
}

