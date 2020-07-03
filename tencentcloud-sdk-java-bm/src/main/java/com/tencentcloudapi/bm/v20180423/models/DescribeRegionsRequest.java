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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionsRequest extends AbstractModel{

    /**
    * 地域整型ID，目前黑石可用地域包括：8-北京，4-上海，1-广州， 19-重庆
    */
    @SerializedName("RegionId")
    @Expose
    private Long RegionId;

    /**
     * Get 地域整型ID，目前黑石可用地域包括：8-北京，4-上海，1-广州， 19-重庆 
     * @return RegionId 地域整型ID，目前黑石可用地域包括：8-北京，4-上海，1-广州， 19-重庆
     */
    public Long getRegionId() {
        return this.RegionId;
    }

    /**
     * Set 地域整型ID，目前黑石可用地域包括：8-北京，4-上海，1-广州， 19-重庆
     * @param RegionId 地域整型ID，目前黑石可用地域包括：8-北京，4-上海，1-广州， 19-重庆
     */
    public void setRegionId(Long RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);

    }
}

