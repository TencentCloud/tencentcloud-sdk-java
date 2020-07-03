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

public class ListPoliciesRequest extends AbstractModel{

    /**
    * 每页数量，默认值是 20，必须大于 0 且小于或等于 200
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * 页码，默认值是 1，从 1开始，不能大于 200
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * 可取值 'All'、'QCS' 和 'Local'，'All' 获取所有策略，'QCS' 只获取预设策略，'Local' 只获取自定义策略，默认取 'All'
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * 按策略名匹配
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get 每页数量，默认值是 20，必须大于 0 且小于或等于 200 
     * @return Rp 每页数量，默认值是 20，必须大于 0 且小于或等于 200
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set 每页数量，默认值是 20，必须大于 0 且小于或等于 200
     * @param Rp 每页数量，默认值是 20，必须大于 0 且小于或等于 200
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get 页码，默认值是 1，从 1开始，不能大于 200 
     * @return Page 页码，默认值是 1，从 1开始，不能大于 200
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set 页码，默认值是 1，从 1开始，不能大于 200
     * @param Page 页码，默认值是 1，从 1开始，不能大于 200
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get 可取值 'All'、'QCS' 和 'Local'，'All' 获取所有策略，'QCS' 只获取预设策略，'Local' 只获取自定义策略，默认取 'All' 
     * @return Scope 可取值 'All'、'QCS' 和 'Local'，'All' 获取所有策略，'QCS' 只获取预设策略，'Local' 只获取自定义策略，默认取 'All'
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set 可取值 'All'、'QCS' 和 'Local'，'All' 获取所有策略，'QCS' 只获取预设策略，'Local' 只获取自定义策略，默认取 'All'
     * @param Scope 可取值 'All'、'QCS' 和 'Local'，'All' 获取所有策略，'QCS' 只获取预设策略，'Local' 只获取自定义策略，默认取 'All'
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get 按策略名匹配 
     * @return Keyword 按策略名匹配
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set 按策略名匹配
     * @param Keyword 按策略名匹配
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rp", this.Rp);
        this.setParamSimple(map, prefix + "Page", this.Page);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Keyword", this.Keyword);

    }
}

