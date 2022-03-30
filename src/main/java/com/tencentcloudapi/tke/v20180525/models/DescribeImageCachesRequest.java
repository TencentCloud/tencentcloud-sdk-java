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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImageCachesRequest extends AbstractModel{

    /**
    * 镜像缓存Id数组
    */
    @SerializedName("ImageCacheIds")
    @Expose
    private String [] ImageCacheIds;

    /**
    * 镜像缓存名称数组
    */
    @SerializedName("ImageCacheNames")
    @Expose
    private String [] ImageCacheNames;

    /**
    * 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过50
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 偏移量,默认0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 过滤条件，可选条件：
(1)实例名称
KeyName: image-cache-name
类型：String
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * Get 镜像缓存Id数组 
     * @return ImageCacheIds 镜像缓存Id数组
     */
    public String [] getImageCacheIds() {
        return this.ImageCacheIds;
    }

    /**
     * Set 镜像缓存Id数组
     * @param ImageCacheIds 镜像缓存Id数组
     */
    public void setImageCacheIds(String [] ImageCacheIds) {
        this.ImageCacheIds = ImageCacheIds;
    }

    /**
     * Get 镜像缓存名称数组 
     * @return ImageCacheNames 镜像缓存名称数组
     */
    public String [] getImageCacheNames() {
        return this.ImageCacheNames;
    }

    /**
     * Set 镜像缓存名称数组
     * @param ImageCacheNames 镜像缓存名称数组
     */
    public void setImageCacheNames(String [] ImageCacheNames) {
        this.ImageCacheNames = ImageCacheNames;
    }

    /**
     * Get 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过50 
     * @return Limit 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过50
     * @param Limit 限定此次返回资源的数量。如果不设定，默认返回20，最大不能超过50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 偏移量,默认0 
     * @return Offset 偏移量,默认0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量,默认0
     * @param Offset 偏移量,默认0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 过滤条件，可选条件：
(1)实例名称
KeyName: image-cache-name
类型：String 
     * @return Filters 过滤条件，可选条件：
(1)实例名称
KeyName: image-cache-name
类型：String
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件，可选条件：
(1)实例名称
KeyName: image-cache-name
类型：String
     * @param Filters 过滤条件，可选条件：
(1)实例名称
KeyName: image-cache-name
类型：String
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    public DescribeImageCachesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImageCachesRequest(DescribeImageCachesRequest source) {
        if (source.ImageCacheIds != null) {
            this.ImageCacheIds = new String[source.ImageCacheIds.length];
            for (int i = 0; i < source.ImageCacheIds.length; i++) {
                this.ImageCacheIds[i] = new String(source.ImageCacheIds[i]);
            }
        }
        if (source.ImageCacheNames != null) {
            this.ImageCacheNames = new String[source.ImageCacheNames.length];
            for (int i = 0; i < source.ImageCacheNames.length; i++) {
                this.ImageCacheNames[i] = new String(source.ImageCacheNames[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageCacheIds.", this.ImageCacheIds);
        this.setParamArraySimple(map, prefix + "ImageCacheNames.", this.ImageCacheNames);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

