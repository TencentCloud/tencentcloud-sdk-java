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

public class DescribeAlertListRequest extends AbstractModel {

    /**
    * 标签搜索筛选
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 被调用的集团账号的成员id
    */
    @SerializedName("OperatedMemberId")
    @Expose
    private String [] OperatedMemberId;

    /**
    * 0:默认全部 1:资产ID 2:域名
    */
    @SerializedName("AssetType")
    @Expose
    private Long AssetType;

    /**
     * Get 标签搜索筛选 
     * @return Filter 标签搜索筛选
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 标签搜索筛选
     * @param Filter 标签搜索筛选
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 被调用的集团账号的成员id 
     * @return OperatedMemberId 被调用的集团账号的成员id
     */
    public String [] getOperatedMemberId() {
        return this.OperatedMemberId;
    }

    /**
     * Set 被调用的集团账号的成员id
     * @param OperatedMemberId 被调用的集团账号的成员id
     */
    public void setOperatedMemberId(String [] OperatedMemberId) {
        this.OperatedMemberId = OperatedMemberId;
    }

    /**
     * Get 0:默认全部 1:资产ID 2:域名 
     * @return AssetType 0:默认全部 1:资产ID 2:域名
     */
    public Long getAssetType() {
        return this.AssetType;
    }

    /**
     * Set 0:默认全部 1:资产ID 2:域名
     * @param AssetType 0:默认全部 1:资产ID 2:域名
     */
    public void setAssetType(Long AssetType) {
        this.AssetType = AssetType;
    }

    public DescribeAlertListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlertListRequest(DescribeAlertListRequest source) {
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.OperatedMemberId != null) {
            this.OperatedMemberId = new String[source.OperatedMemberId.length];
            for (int i = 0; i < source.OperatedMemberId.length; i++) {
                this.OperatedMemberId[i] = new String(source.OperatedMemberId[i]);
            }
        }
        if (source.AssetType != null) {
            this.AssetType = new Long(source.AssetType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamArraySimple(map, prefix + "OperatedMemberId.", this.OperatedMemberId);
        this.setParamSimple(map, prefix + "AssetType", this.AssetType);

    }
}

