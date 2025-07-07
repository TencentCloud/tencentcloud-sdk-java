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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRegionsRequest extends AbstractModel {

    /**
    * 通过该参数指定不同压测网络环境，在不同网络环境下，PTS可用的地域不一样
    */
    @SerializedName("LoadType")
    @Expose
    private Long LoadType;

    /**
     * Get 通过该参数指定不同压测网络环境，在不同网络环境下，PTS可用的地域不一样 
     * @return LoadType 通过该参数指定不同压测网络环境，在不同网络环境下，PTS可用的地域不一样
     */
    public Long getLoadType() {
        return this.LoadType;
    }

    /**
     * Set 通过该参数指定不同压测网络环境，在不同网络环境下，PTS可用的地域不一样
     * @param LoadType 通过该参数指定不同压测网络环境，在不同网络环境下，PTS可用的地域不一样
     */
    public void setLoadType(Long LoadType) {
        this.LoadType = LoadType;
    }

    public DescribeRegionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRegionsRequest(DescribeRegionsRequest source) {
        if (source.LoadType != null) {
            this.LoadType = new Long(source.LoadType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LoadType", this.LoadType);

    }
}

