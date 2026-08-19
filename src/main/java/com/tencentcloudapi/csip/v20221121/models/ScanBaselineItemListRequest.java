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

public class ScanBaselineItemListRequest extends AbstractModel {

    /**
    * <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
    */
    @SerializedName("PolicyType")
    @Expose
    private String PolicyType;

    /**
    * <p>目标基线策略 ID，必须大于 0。</p>
    */
    @SerializedName("PolicyID")
    @Expose
    private Long PolicyID;

    /**
    * <p>基线系统父分类 ID。</p>
    */
    @SerializedName("ParentCategoryID")
    @Expose
    private Long ParentCategoryID;

    /**
    * <p>要重新扫描的检测项 ID 列表，不可为空且元素不可为 0。</p>
    */
    @SerializedName("ItemIDList")
    @Expose
    private Long [] ItemIDList;

    /**
    * <p>基线子分类 ID。</p>
    */
    @SerializedName("CategoryID")
    @Expose
    private Long CategoryID;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
     * Get <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul> 
     * @return PolicyType <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     */
    public String getPolicyType() {
        return this.PolicyType;
    }

    /**
     * Set <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     * @param PolicyType <p>基线策略类型。取值：</p><ul><li>SYSTEM：系统策略（CSIP 内置）</li><li>SELF：用户自定义策略</li></ul>
     */
    public void setPolicyType(String PolicyType) {
        this.PolicyType = PolicyType;
    }

    /**
     * Get <p>目标基线策略 ID，必须大于 0。</p> 
     * @return PolicyID <p>目标基线策略 ID，必须大于 0。</p>
     */
    public Long getPolicyID() {
        return this.PolicyID;
    }

    /**
     * Set <p>目标基线策略 ID，必须大于 0。</p>
     * @param PolicyID <p>目标基线策略 ID，必须大于 0。</p>
     */
    public void setPolicyID(Long PolicyID) {
        this.PolicyID = PolicyID;
    }

    /**
     * Get <p>基线系统父分类 ID。</p> 
     * @return ParentCategoryID <p>基线系统父分类 ID。</p>
     */
    public Long getParentCategoryID() {
        return this.ParentCategoryID;
    }

    /**
     * Set <p>基线系统父分类 ID。</p>
     * @param ParentCategoryID <p>基线系统父分类 ID。</p>
     */
    public void setParentCategoryID(Long ParentCategoryID) {
        this.ParentCategoryID = ParentCategoryID;
    }

    /**
     * Get <p>要重新扫描的检测项 ID 列表，不可为空且元素不可为 0。</p> 
     * @return ItemIDList <p>要重新扫描的检测项 ID 列表，不可为空且元素不可为 0。</p>
     */
    public Long [] getItemIDList() {
        return this.ItemIDList;
    }

    /**
     * Set <p>要重新扫描的检测项 ID 列表，不可为空且元素不可为 0。</p>
     * @param ItemIDList <p>要重新扫描的检测项 ID 列表，不可为空且元素不可为 0。</p>
     */
    public void setItemIDList(Long [] ItemIDList) {
        this.ItemIDList = ItemIDList;
    }

    /**
     * Get <p>基线子分类 ID。</p> 
     * @return CategoryID <p>基线子分类 ID。</p>
     */
    public Long getCategoryID() {
        return this.CategoryID;
    }

    /**
     * Set <p>基线子分类 ID。</p>
     * @param CategoryID <p>基线子分类 ID。</p>
     */
    public void setCategoryID(Long CategoryID) {
        this.CategoryID = CategoryID;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    public ScanBaselineItemListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanBaselineItemListRequest(ScanBaselineItemListRequest source) {
        if (source.PolicyType != null) {
            this.PolicyType = new String(source.PolicyType);
        }
        if (source.PolicyID != null) {
            this.PolicyID = new Long(source.PolicyID);
        }
        if (source.ParentCategoryID != null) {
            this.ParentCategoryID = new Long(source.ParentCategoryID);
        }
        if (source.ItemIDList != null) {
            this.ItemIDList = new Long[source.ItemIDList.length];
            for (int i = 0; i < source.ItemIDList.length; i++) {
                this.ItemIDList[i] = new Long(source.ItemIDList[i]);
            }
        }
        if (source.CategoryID != null) {
            this.CategoryID = new Long(source.CategoryID);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PolicyType", this.PolicyType);
        this.setParamSimple(map, prefix + "PolicyID", this.PolicyID);
        this.setParamSimple(map, prefix + "ParentCategoryID", this.ParentCategoryID);
        this.setParamArraySimple(map, prefix + "ItemIDList.", this.ItemIDList);
        this.setParamSimple(map, prefix + "CategoryID", this.CategoryID);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);

    }
}

