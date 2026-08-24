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
package com.tencentcloudapi.bdrc.v20260330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBackupOverviewGeneralRequest extends AbstractModel {

    /**
    * <p>是否查询全部地域。false-仅当前地域（默认），true-全部地域汇总</p>
    */
    @SerializedName("AllRegions")
    @Expose
    private Boolean AllRegions;

    /**
     * Get <p>是否查询全部地域。false-仅当前地域（默认），true-全部地域汇总</p> 
     * @return AllRegions <p>是否查询全部地域。false-仅当前地域（默认），true-全部地域汇总</p>
     */
    public Boolean getAllRegions() {
        return this.AllRegions;
    }

    /**
     * Set <p>是否查询全部地域。false-仅当前地域（默认），true-全部地域汇总</p>
     * @param AllRegions <p>是否查询全部地域。false-仅当前地域（默认），true-全部地域汇总</p>
     */
    public void setAllRegions(Boolean AllRegions) {
        this.AllRegions = AllRegions;
    }

    public DescribeBackupOverviewGeneralRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeBackupOverviewGeneralRequest(DescribeBackupOverviewGeneralRequest source) {
        if (source.AllRegions != null) {
            this.AllRegions = new Boolean(source.AllRegions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllRegions", this.AllRegions);

    }
}

