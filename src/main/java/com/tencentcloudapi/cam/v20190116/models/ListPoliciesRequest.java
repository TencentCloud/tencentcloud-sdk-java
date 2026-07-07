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

public class ListPoliciesRequest extends AbstractModel {

    /**
    * <p>每页数量，默认值是 20，必须大于 0 且小于或等于 200</p>
    */
    @SerializedName("Rp")
    @Expose
    private Long Rp;

    /**
    * <p>页码，默认值是 1，从 1开始，不能大于 200</p>
    */
    @SerializedName("Page")
    @Expose
    private Long Page;

    /**
    * <p>可取值 &#39;All&#39;、&#39;QCS&#39; 和 &#39;Local&#39;，&#39;All&#39; 获取所有策略，&#39;QCS&#39; 只获取预设策略，&#39;Local&#39; 只获取自定义策略，默认取 &#39;All&#39;</p>
    */
    @SerializedName("Scope")
    @Expose
    private String Scope;

    /**
    * <p>按策略名匹配</p>
    */
    @SerializedName("Keyword")
    @Expose
    private String Keyword;

    /**
     * Get <p>每页数量，默认值是 20，必须大于 0 且小于或等于 200</p> 
     * @return Rp <p>每页数量，默认值是 20，必须大于 0 且小于或等于 200</p>
     */
    public Long getRp() {
        return this.Rp;
    }

    /**
     * Set <p>每页数量，默认值是 20，必须大于 0 且小于或等于 200</p>
     * @param Rp <p>每页数量，默认值是 20，必须大于 0 且小于或等于 200</p>
     */
    public void setRp(Long Rp) {
        this.Rp = Rp;
    }

    /**
     * Get <p>页码，默认值是 1，从 1开始，不能大于 200</p> 
     * @return Page <p>页码，默认值是 1，从 1开始，不能大于 200</p>
     */
    public Long getPage() {
        return this.Page;
    }

    /**
     * Set <p>页码，默认值是 1，从 1开始，不能大于 200</p>
     * @param Page <p>页码，默认值是 1，从 1开始，不能大于 200</p>
     */
    public void setPage(Long Page) {
        this.Page = Page;
    }

    /**
     * Get <p>可取值 &#39;All&#39;、&#39;QCS&#39; 和 &#39;Local&#39;，&#39;All&#39; 获取所有策略，&#39;QCS&#39; 只获取预设策略，&#39;Local&#39; 只获取自定义策略，默认取 &#39;All&#39;</p> 
     * @return Scope <p>可取值 &#39;All&#39;、&#39;QCS&#39; 和 &#39;Local&#39;，&#39;All&#39; 获取所有策略，&#39;QCS&#39; 只获取预设策略，&#39;Local&#39; 只获取自定义策略，默认取 &#39;All&#39;</p>
     */
    public String getScope() {
        return this.Scope;
    }

    /**
     * Set <p>可取值 &#39;All&#39;、&#39;QCS&#39; 和 &#39;Local&#39;，&#39;All&#39; 获取所有策略，&#39;QCS&#39; 只获取预设策略，&#39;Local&#39; 只获取自定义策略，默认取 &#39;All&#39;</p>
     * @param Scope <p>可取值 &#39;All&#39;、&#39;QCS&#39; 和 &#39;Local&#39;，&#39;All&#39; 获取所有策略，&#39;QCS&#39; 只获取预设策略，&#39;Local&#39; 只获取自定义策略，默认取 &#39;All&#39;</p>
     */
    public void setScope(String Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>按策略名匹配</p> 
     * @return Keyword <p>按策略名匹配</p>
     */
    public String getKeyword() {
        return this.Keyword;
    }

    /**
     * Set <p>按策略名匹配</p>
     * @param Keyword <p>按策略名匹配</p>
     */
    public void setKeyword(String Keyword) {
        this.Keyword = Keyword;
    }

    public ListPoliciesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPoliciesRequest(ListPoliciesRequest source) {
        if (source.Rp != null) {
            this.Rp = new Long(source.Rp);
        }
        if (source.Page != null) {
            this.Page = new Long(source.Page);
        }
        if (source.Scope != null) {
            this.Scope = new String(source.Scope);
        }
        if (source.Keyword != null) {
            this.Keyword = new String(source.Keyword);
        }
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

