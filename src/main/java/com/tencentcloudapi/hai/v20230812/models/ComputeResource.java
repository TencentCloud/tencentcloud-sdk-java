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
package com.tencentcloudapi.hai.v20230812.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComputeResource extends AbstractModel {

    /**
    * 算力套餐的类型
    */
    @SerializedName("BundleType")
    @Expose
    private String BundleType;

    /**
    * 节点数量
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 算力套餐的类型 
     * @return BundleType 算力套餐的类型
     */
    public String getBundleType() {
        return this.BundleType;
    }

    /**
     * Set 算力套餐的类型
     * @param BundleType 算力套餐的类型
     */
    public void setBundleType(String BundleType) {
        this.BundleType = BundleType;
    }

    /**
     * Get 节点数量 
     * @return Count 节点数量
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 节点数量
     * @param Count 节点数量
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ComputeResource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComputeResource(ComputeResource source) {
        if (source.BundleType != null) {
            this.BundleType = new String(source.BundleType);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BundleType", this.BundleType);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

