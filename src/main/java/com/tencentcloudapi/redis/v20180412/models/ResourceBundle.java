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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResourceBundle extends AbstractModel {

    /**
    * 资源包名称
    */
    @SerializedName("ResourceBundleName")
    @Expose
    private String ResourceBundleName;

    /**
    * 可售卖内存，单位：GB
    */
    @SerializedName("AvailableMemory")
    @Expose
    private Long AvailableMemory;

    /**
    * 资源包个数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get 资源包名称 
     * @return ResourceBundleName 资源包名称
     */
    public String getResourceBundleName() {
        return this.ResourceBundleName;
    }

    /**
     * Set 资源包名称
     * @param ResourceBundleName 资源包名称
     */
    public void setResourceBundleName(String ResourceBundleName) {
        this.ResourceBundleName = ResourceBundleName;
    }

    /**
     * Get 可售卖内存，单位：GB 
     * @return AvailableMemory 可售卖内存，单位：GB
     */
    public Long getAvailableMemory() {
        return this.AvailableMemory;
    }

    /**
     * Set 可售卖内存，单位：GB
     * @param AvailableMemory 可售卖内存，单位：GB
     */
    public void setAvailableMemory(Long AvailableMemory) {
        this.AvailableMemory = AvailableMemory;
    }

    /**
     * Get 资源包个数 
     * @return Count 资源包个数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 资源包个数
     * @param Count 资源包个数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public ResourceBundle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceBundle(ResourceBundle source) {
        if (source.ResourceBundleName != null) {
            this.ResourceBundleName = new String(source.ResourceBundleName);
        }
        if (source.AvailableMemory != null) {
            this.AvailableMemory = new Long(source.AvailableMemory);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceBundleName", this.ResourceBundleName);
        this.setParamSimple(map, prefix + "AvailableMemory", this.AvailableMemory);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

