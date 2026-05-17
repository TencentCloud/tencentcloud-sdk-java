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

public class DescribeCosRoleAccessPermissionsRequest extends AbstractModel {

    /**
    * 存储桶所属appid
    */
    @SerializedName("RelAppId")
    @Expose
    private Long RelAppId;

    /**
    * 存储桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 过滤条件
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get 存储桶所属appid 
     * @return RelAppId 存储桶所属appid
     */
    public Long getRelAppId() {
        return this.RelAppId;
    }

    /**
     * Set 存储桶所属appid
     * @param RelAppId 存储桶所属appid
     */
    public void setRelAppId(Long RelAppId) {
        this.RelAppId = RelAppId;
    }

    /**
     * Get 存储桶名 
     * @return BucketName 存储桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 存储桶名
     * @param BucketName 存储桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 过滤条件 
     * @return Filter 过滤条件
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤条件
     * @param Filter 过滤条件
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeCosRoleAccessPermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosRoleAccessPermissionsRequest(DescribeCosRoleAccessPermissionsRequest source) {
        if (source.RelAppId != null) {
            this.RelAppId = new Long(source.RelAppId);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RelAppId", this.RelAppId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

