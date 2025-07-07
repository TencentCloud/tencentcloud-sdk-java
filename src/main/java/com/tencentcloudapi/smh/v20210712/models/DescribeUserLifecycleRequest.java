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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserLifecycleRequest extends AbstractModel {

    /**
    * 媒体库 ID。
    */
    @SerializedName("LibraryId")
    @Expose
    private String LibraryId;

    /**
    * 用于唯一查找用户的过滤器。
    */
    @SerializedName("Filter")
    @Expose
    private UserFilter Filter;

    /**
     * Get 媒体库 ID。 
     * @return LibraryId 媒体库 ID。
     */
    public String getLibraryId() {
        return this.LibraryId;
    }

    /**
     * Set 媒体库 ID。
     * @param LibraryId 媒体库 ID。
     */
    public void setLibraryId(String LibraryId) {
        this.LibraryId = LibraryId;
    }

    /**
     * Get 用于唯一查找用户的过滤器。 
     * @return Filter 用于唯一查找用户的过滤器。
     */
    public UserFilter getFilter() {
        return this.Filter;
    }

    /**
     * Set 用于唯一查找用户的过滤器。
     * @param Filter 用于唯一查找用户的过滤器。
     */
    public void setFilter(UserFilter Filter) {
        this.Filter = Filter;
    }

    public DescribeUserLifecycleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserLifecycleRequest(DescribeUserLifecycleRequest source) {
        if (source.LibraryId != null) {
            this.LibraryId = new String(source.LibraryId);
        }
        if (source.Filter != null) {
            this.Filter = new UserFilter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LibraryId", this.LibraryId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

