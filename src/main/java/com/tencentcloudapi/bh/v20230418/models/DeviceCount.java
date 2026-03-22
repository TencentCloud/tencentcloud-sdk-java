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
package com.tencentcloudapi.bh.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceCount extends AbstractModel {

    /**
    * 资产类型
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
    * 资产数目
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 资产类型 
     * @return Kind 资产类型
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * Set 资产类型
     * @param Kind 资产类型
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * Get 资产数目 
     * @return Count 资产数目
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 资产数目
     * @param Count 资产数目
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public DeviceCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeviceCount(DeviceCount source) {
        if (source.Kind != null) {
            this.Kind = new Long(source.Kind);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

