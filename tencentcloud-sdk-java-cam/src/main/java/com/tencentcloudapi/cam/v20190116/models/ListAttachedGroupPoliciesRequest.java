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
package com.tencentcloudapi.cam.v20190116.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListAttachedGroupPoliciesRequest extends AbstractModel{

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
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);

    }
}

