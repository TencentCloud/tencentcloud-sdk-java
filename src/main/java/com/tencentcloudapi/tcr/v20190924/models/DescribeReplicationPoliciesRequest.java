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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeReplicationPoliciesRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("RegistryId")
    @Expose
    private String RegistryId;

    /**
    * 页数，默认为1
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页展示个数，默认为100
    */
    @SerializedName("PageSize")
    @Expose
    private Long PageSize;

    /**
     * Get 实例ID 
     * @return RegistryId 实例ID
     */
    public String getRegistryId() {
        return this.RegistryId;
    }

    /**
     * Set 实例ID
     * @param RegistryId 实例ID
     */
    public void setRegistryId(String RegistryId) {
        this.RegistryId = RegistryId;
    }

    /**
     * Get 页数，默认为1 
     * @return Page 页数，默认为1
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页数，默认为1
     * @param Page 页数，默认为1
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页展示个数，默认为100 
     * @return PageSize 每页展示个数，默认为100
     */
    public Long getPageSize() {
        return this.PageSize;
    }

    /**
     * Set 每页展示个数，默认为100
     * @param PageSize 每页展示个数，默认为100
     */
    public void setPageSize(Long PageSize) {
        this.PageSize = PageSize;
    }

    public DescribeReplicationPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeReplicationPoliciesRequest(DescribeReplicationPoliciesRequest source) {
        if (source.RegistryId != null) {
            this.RegistryId = new String(source.RegistryId);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.PageSize != null) {
            this.PageSize = new Long(source.PageSize);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RegistryId", this.RegistryId);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);

    }
}

