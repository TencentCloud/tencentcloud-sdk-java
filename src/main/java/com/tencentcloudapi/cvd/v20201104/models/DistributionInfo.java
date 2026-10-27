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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DistributionInfo extends AbstractModel {

    /**
    * <p>地域描述</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>实例个数</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>地域描述</p> 
     * @return Region <p>地域描述</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>地域描述</p>
     * @param Region <p>地域描述</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>实例个数</p> 
     * @return Count <p>实例个数</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>实例个数</p>
     * @param Count <p>实例个数</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DistributionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DistributionInfo(DistributionInfo source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

