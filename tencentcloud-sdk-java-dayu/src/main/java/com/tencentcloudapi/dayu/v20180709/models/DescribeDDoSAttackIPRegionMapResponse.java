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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSAttackIPRegionMapResponse extends AbstractModel{

    /**
    * 全球地域分布数据
    */
    @SerializedName("NationCount")
    @Expose
    private KeyValueRecord [] NationCount;

    /**
    * 国内省份地域分布数据
    */
    @SerializedName("ProvinceCount")
    @Expose
    private KeyValueRecord [] ProvinceCount;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 全球地域分布数据 
     * @return NationCount 全球地域分布数据
     */
    public KeyValueRecord [] getNationCount() {
        return this.NationCount;
    }

    /**
     * Set 全球地域分布数据
     * @param NationCount 全球地域分布数据
     */
    public void setNationCount(KeyValueRecord [] NationCount) {
        this.NationCount = NationCount;
    }

    /**
     * Get 国内省份地域分布数据 
     * @return ProvinceCount 国内省份地域分布数据
     */
    public KeyValueRecord [] getProvinceCount() {
        return this.ProvinceCount;
    }

    /**
     * Set 国内省份地域分布数据
     * @param ProvinceCount 国内省份地域分布数据
     */
    public void setProvinceCount(KeyValueRecord [] ProvinceCount) {
        this.ProvinceCount = ProvinceCount;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "NationCount.", this.NationCount);
        this.setParamArrayObj(map, prefix + "ProvinceCount.", this.ProvinceCount);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

