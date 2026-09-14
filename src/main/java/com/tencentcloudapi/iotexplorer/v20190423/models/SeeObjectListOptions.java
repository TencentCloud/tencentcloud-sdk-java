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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SeeObjectListOptions extends AbstractModel {

    /**
    * 目录分隔符
    */
    @SerializedName("Delimiter")
    @Expose
    private String Delimiter;

    /**
    * 分页标记
    */
    @SerializedName("Marker")
    @Expose
    private String Marker;

    /**
    * 单页返回的最大对象数量
    */
    @SerializedName("MaxKeys")
    @Expose
    private Long MaxKeys;

    /**
     * Get 目录分隔符 
     * @return Delimiter 目录分隔符
     */
    public String getDelimiter() {
        return this.Delimiter;
    }

    /**
     * Set 目录分隔符
     * @param Delimiter 目录分隔符
     */
    public void setDelimiter(String Delimiter) {
        this.Delimiter = Delimiter;
    }

    /**
     * Get 分页标记 
     * @return Marker 分页标记
     */
    public String getMarker() {
        return this.Marker;
    }

    /**
     * Set 分页标记
     * @param Marker 分页标记
     */
    public void setMarker(String Marker) {
        this.Marker = Marker;
    }

    /**
     * Get 单页返回的最大对象数量 
     * @return MaxKeys 单页返回的最大对象数量
     */
    public Long getMaxKeys() {
        return this.MaxKeys;
    }

    /**
     * Set 单页返回的最大对象数量
     * @param MaxKeys 单页返回的最大对象数量
     */
    public void setMaxKeys(Long MaxKeys) {
        this.MaxKeys = MaxKeys;
    }

    public SeeObjectListOptions() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SeeObjectListOptions(SeeObjectListOptions source) {
        if (source.Delimiter != null) {
            this.Delimiter = new String(source.Delimiter);
        }
        if (source.Marker != null) {
            this.Marker = new String(source.Marker);
        }
        if (source.MaxKeys != null) {
            this.MaxKeys = new Long(source.MaxKeys);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Delimiter", this.Delimiter);
        this.setParamSimple(map, prefix + "Marker", this.Marker);
        this.setParamSimple(map, prefix + "MaxKeys", this.MaxKeys);

    }
}

