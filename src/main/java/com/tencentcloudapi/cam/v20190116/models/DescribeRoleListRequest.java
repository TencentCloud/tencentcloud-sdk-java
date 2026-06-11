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

public class DescribeRoleListRequest extends AbstractModel {

    /**
    * <p>页码，从1开始</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>每页行数，不能大于200</p>
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * <p>标签筛选</p>
    */
    @SerializedName("Tags")
    @Expose
    private RoleTags [] Tags;

    /**
     * Get <p>页码，从1开始</p> 
     * @return Page <p>页码，从1开始</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码，从1开始</p>
     * @param Page <p>页码，从1开始</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>每页行数，不能大于200</p> 
     * @return Rp <p>每页行数，不能大于200</p>
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set <p>每页行数，不能大于200</p>
     * @param Rp <p>每页行数，不能大于200</p>
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get <p>标签筛选</p> 
     * @return Tags <p>标签筛选</p>
     */
    public RoleTags [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>标签筛选</p>
     * @param Tags <p>标签筛选</p>
     */
    public void setTags(RoleTags [] Tags) {
        this.Tags = Tags;
    }

    public DescribeRoleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRoleListRequest(DescribeRoleListRequest source) {
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Tags != null) {
            this.Tags = new RoleTags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new RoleTags(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

