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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetectTypeCount extends AbstractModel {

    /**
    * <p>检测方式，0：主机检测，1：网络检测</p>
    */
    @SerializedName("DetectType")
    @Expose
    private Long DetectType;

    /**
    * <p>策略数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>检测方式，0：主机检测，1：网络检测</p> 
     * @return DetectType <p>检测方式，0：主机检测，1：网络检测</p>
     */
    public Long getDetectType() {
        return this.DetectType;
    }

    /**
     * Set <p>检测方式，0：主机检测，1：网络检测</p>
     * @param DetectType <p>检测方式，0：主机检测，1：网络检测</p>
     */
    public void setDetectType(Long DetectType) {
        this.DetectType = DetectType;
    }

    /**
     * Get <p>策略数量</p> 
     * @return Count <p>策略数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>策略数量</p>
     * @param Count <p>策略数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DetectTypeCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetectTypeCount(DetectTypeCount source) {
        if (source.DetectType != null) {
            this.DetectType = new Long(source.DetectType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DetectType", this.DetectType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

