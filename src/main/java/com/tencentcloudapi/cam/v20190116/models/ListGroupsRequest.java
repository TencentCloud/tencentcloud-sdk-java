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

public class ListGroupsRequest extends AbstractModel {

    /**
    * 页码。默认为1。
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 每页数量。默认为20。
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * 按用户组名称匹配。
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 页码。默认为1。 
     * @return Page 页码。默认为1。
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码。默认为1。
     * @param Page 页码。默认为1。
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 每页数量。默认为20。 
     * @return Rp 每页数量。默认为20。
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set 每页数量。默认为20。
     * @param Rp 每页数量。默认为20。
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get 按用户组名称匹配。 
     * @return Keyword 按用户组名称匹配。
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 按用户组名称匹配。
     * @param Keyword 按用户组名称匹配。
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListGroupsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListGroupsRequest(ListGroupsRequest source) {
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
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

