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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLiveRecordTemplatesRequest extends AbstractModel{

    /**
    * 是否属于慢直播模板，默认：0。
0： 标准直播。
1：慢直播。
    */
    @SerializedName("IsDelayLive")
    @Expose
    private Long IsDelayLive;

    /**
     * Get 是否属于慢直播模板，默认：0。
0： 标准直播。
1：慢直播。 
     * @return IsDelayLive 是否属于慢直播模板，默认：0。
0： 标准直播。
1：慢直播。
     */
    public Long getIsDelayLive() {
        return this.IsDelayLive;
    }

    /**
     * Set 是否属于慢直播模板，默认：0。
0： 标准直播。
1：慢直播。
     * @param IsDelayLive 是否属于慢直播模板，默认：0。
0： 标准直播。
1：慢直播。
     */
    public void setIsDelayLive(Long IsDelayLive) {
        this.IsDelayLive = IsDelayLive;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsDelayLive", this.IsDelayLive);

    }
}

