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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAndroidInstancesByAppsRequest extends AbstractModel {

    /**
    * 偏移量，默认为 0	
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
    * 应用 ID 列表。通过应用 ID 做集合查询
    */
    @SerializedName("AndroidAppIds")
    @Expose
    private String [] AndroidAppIds;

    /**
     * Get 偏移量，默认为 0	 
     * @return Offset 偏移量，默认为 0	
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量，默认为 0	
     * @param Offset 偏移量，默认为 0	
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

    /**
     * Get 应用 ID 列表。通过应用 ID 做集合查询 
     * @return AndroidAppIds 应用 ID 列表。通过应用 ID 做集合查询
     */
    public String [] getAndroidAppIds() {
        return this.AndroidAppIds;
    }

    /**
     * Set 应用 ID 列表。通过应用 ID 做集合查询
     * @param AndroidAppIds 应用 ID 列表。通过应用 ID 做集合查询
     */
    public void setAndroidAppIds(String [] AndroidAppIds) {
        this.AndroidAppIds = AndroidAppIds;
    }

    public DescribeAndroidInstancesByAppsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAndroidInstancesByAppsRequest(DescribeAndroidInstancesByAppsRequest source) {
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.AndroidAppIds != null) {
            this.AndroidAppIds = new String[source.AndroidAppIds.length];
            for (int i = 0; i < source.AndroidAppIds.length; i++) {
                this.AndroidAppIds[i] = new String(source.AndroidAppIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "AndroidAppIds.", this.AndroidAppIds);

    }
}

