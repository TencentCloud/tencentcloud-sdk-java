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

public class DescribeCosRoleAccessPermissionRequest extends AbstractModel {

    /**
    * 关联的appid
    */
    @SerializedName("RelAppId")
    @Expose
    private Long RelAppId;

    /**
    * 需要查看的角色id
    */
    @SerializedName("RelRoleId")
    @Expose
    private String RelRoleId;

    /**
    * 桶名
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 过滤器
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
     * Get 关联的appid 
     * @return RelAppId 关联的appid
     */
    public Long getRelAppId() {
        return this.RelAppId;
    }

    /**
     * Set 关联的appid
     * @param RelAppId 关联的appid
     */
    public void setRelAppId(Long RelAppId) {
        this.RelAppId = RelAppId;
    }

    /**
     * Get 需要查看的角色id 
     * @return RelRoleId 需要查看的角色id
     */
    public String getRelRoleId() {
        return this.RelRoleId;
    }

    /**
     * Set 需要查看的角色id
     * @param RelRoleId 需要查看的角色id
     */
    public void setRelRoleId(String RelRoleId) {
        this.RelRoleId = RelRoleId;
    }

    /**
     * Get 桶名 
     * @return BucketName 桶名
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 桶名
     * @param BucketName 桶名
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 过滤器 
     * @return Filter 过滤器
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤器
     * @param Filter 过滤器
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    public DescribeCosRoleAccessPermissionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeCosRoleAccessPermissionRequest(DescribeCosRoleAccessPermissionRequest source) {
        if (source.RelAppId != null) {
            this.RelAppId = new Long(source.RelAppId);
        }
        if (source.RelRoleId != null) {
            this.RelRoleId = new String(source.RelRoleId);
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
        this.setParamSimple(map, prefix + "RelRoleId", this.RelRoleId);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamObj(map, prefix + "Filter.", this.Filter);

    }
}

