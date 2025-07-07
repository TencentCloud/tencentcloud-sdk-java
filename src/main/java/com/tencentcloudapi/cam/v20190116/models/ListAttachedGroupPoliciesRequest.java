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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAttachedGroupPoliciesRequest extends AbstractModel {

    /**
    * 用户组ID
    */
    @SerializedName("TargetGroupId")
    @Expose
    private Long TargetGroupId;

    /**
    * 页码，默认值是 1，从 1 开始
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页大小，默认值是 20
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * 搜索关键字
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 用户组ID 
     * @return TargetGroupId 用户组ID
     */
    public Long getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 用户组ID
     * @param TargetGroupId 用户组ID
     */
    public void setTargetGroupId(Long TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 页码，默认值是 1，从 1 开始 
     * @return Page 页码，默认值是 1，从 1 开始
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码，默认值是 1，从 1 开始
     * @param Page 页码，默认值是 1，从 1 开始
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页大小，默认值是 20 
     * @return Rp 每页大小，默认值是 20
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set 每页大小，默认值是 20
     * @param Rp 每页大小，默认值是 20
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get 搜索关键字 
     * @return Keyword 搜索关键字
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 搜索关键字
     * @param Keyword 搜索关键字
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListAttachedGroupPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListAttachedGroupPoliciesRequest(ListAttachedGroupPoliciesRequest source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new Long(source.TargetGroupId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

