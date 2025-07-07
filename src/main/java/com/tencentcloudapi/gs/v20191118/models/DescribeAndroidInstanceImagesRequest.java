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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAndroidInstanceImagesRequest extends AbstractModel {

    /**
    * 镜像 ID 列表
    */
    @SerializedName("AndroidInstanceImageIds")
    @Expose
    private String [] AndroidInstanceImageIds;

    /**
    * 镜像可用区列表
    */
    @SerializedName("AndroidInstanceImageZones")
    @Expose
    private String [] AndroidInstanceImageZones;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 限制量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
     * Get 镜像 ID 列表 
     * @return AndroidInstanceImageIds 镜像 ID 列表
     */
    public String [] getAndroidInstanceImageIds() {
        return this.AndroidInstanceImageIds;
    }

    /**
     * Set 镜像 ID 列表
     * @param AndroidInstanceImageIds 镜像 ID 列表
     */
    public void setAndroidInstanceImageIds(String [] AndroidInstanceImageIds) {
        this.AndroidInstanceImageIds = AndroidInstanceImageIds;
    }

    /**
     * Get 镜像可用区列表 
     * @return AndroidInstanceImageZones 镜像可用区列表
     */
    public String [] getAndroidInstanceImageZones() {
        return this.AndroidInstanceImageZones;
    }

    /**
     * Set 镜像可用区列表
     * @param AndroidInstanceImageZones 镜像可用区列表
     */
    public void setAndroidInstanceImageZones(String [] AndroidInstanceImageZones) {
        this.AndroidInstanceImageZones = AndroidInstanceImageZones;
    }

    /**
     * Get 偏移量，默认为0 
     * @return Offset 偏移量，默认为0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 限制量，默认为20，最大值为100 
     * @return Limit 限制量，默认为20，最大值为100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限制量，默认为20，最大值为100
     * @param Limit 限制量，默认为20，最大值为100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    public DescribeAndroidInstanceImagesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAndroidInstanceImagesRequest(DescribeAndroidInstanceImagesRequest source) {
        if (source.AndroidInstanceImageIds != null) {
            this.AndroidInstanceImageIds = new String[source.AndroidInstanceImageIds.length];
            for (int i = 0; i < source.AndroidInstanceImageIds.length; i++) {
                this.AndroidInstanceImageIds[i] = new String(source.AndroidInstanceImageIds[i]);
            }
        }
        if (source.AndroidInstanceImageZones != null) {
            this.AndroidInstanceImageZones = new String[source.AndroidInstanceImageZones.length];
            for (int i = 0; i < source.AndroidInstanceImageZones.length; i++) {
                this.AndroidInstanceImageZones[i] = new String(source.AndroidInstanceImageZones[i]);
            }
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceImageIds.", this.AndroidInstanceImageIds);
        this.setParamArraySimple(map, prefix + "AndroidInstanceImageZones.", this.AndroidInstanceImageZones);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

