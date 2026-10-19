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
package com.tencentcloudapi.rce.v20260130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchEvent extends AbstractModel {

    /**
    * <p>查询场景。例如：查询航班、查询库存等。</p>
    */
    @SerializedName("SearchScene")
    @Expose
    private String SearchScene;

    /**
    * <p>查询参数。查询时输入的参数。</p>
    */
    @SerializedName("SearchParam")
    @Expose
    private String SearchParam;

    /**
    * <p>上一个网页URL</p>
    */
    @SerializedName("ReferPageUrl")
    @Expose
    private String ReferPageUrl;

    /**
    * <p>游客账号ID</p>
    */
    @SerializedName("GuestId")
    @Expose
    private String GuestId;

    /**
    * <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
    */
    @SerializedName("Cust")
    @Expose
    private Cust [] Cust;

    /**
     * Get <p>查询场景。例如：查询航班、查询库存等。</p> 
     * @return SearchScene <p>查询场景。例如：查询航班、查询库存等。</p>
     */
    public String getSearchScene() {
        return this.SearchScene;
    }

    /**
     * Set <p>查询场景。例如：查询航班、查询库存等。</p>
     * @param SearchScene <p>查询场景。例如：查询航班、查询库存等。</p>
     */
    public void setSearchScene(String SearchScene) {
        this.SearchScene = SearchScene;
    }

    /**
     * Get <p>查询参数。查询时输入的参数。</p> 
     * @return SearchParam <p>查询参数。查询时输入的参数。</p>
     */
    public String getSearchParam() {
        return this.SearchParam;
    }

    /**
     * Set <p>查询参数。查询时输入的参数。</p>
     * @param SearchParam <p>查询参数。查询时输入的参数。</p>
     */
    public void setSearchParam(String SearchParam) {
        this.SearchParam = SearchParam;
    }

    /**
     * Get <p>上一个网页URL</p> 
     * @return ReferPageUrl <p>上一个网页URL</p>
     */
    public String getReferPageUrl() {
        return this.ReferPageUrl;
    }

    /**
     * Set <p>上一个网页URL</p>
     * @param ReferPageUrl <p>上一个网页URL</p>
     */
    public void setReferPageUrl(String ReferPageUrl) {
        this.ReferPageUrl = ReferPageUrl;
    }

    /**
     * Get <p>游客账号ID</p> 
     * @return GuestId <p>游客账号ID</p>
     */
    public String getGuestId() {
        return this.GuestId;
    }

    /**
     * Set <p>游客账号ID</p>
     * @param GuestId <p>游客账号ID</p>
     */
    public void setGuestId(String GuestId) {
        this.GuestId = GuestId;
    }

    /**
     * Get <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p> 
     * @return Cust <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public Cust [] getCust() {
        return this.Cust;
    }

    /**
     * Set <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     * @param Cust <p>与RCE-PRO约定的定制化信息。为K:V 格式的对象数组。<br>示例：[{&quot;Key&quot;: &quot;ApproverName&quot;, &quot;Value&quot;: &quot;bob&quot;},{&quot;Key&quot;:&quot;ApproverPhone&quot;,&quot;Value&quot;: &quot;+86131****5678&quot;}]</p>
     */
    public void setCust(Cust [] Cust) {
        this.Cust = Cust;
    }

    public SearchEvent() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchEvent(SearchEvent source) {
        if (source.SearchScene != null) {
            this.SearchScene = new String(source.SearchScene);
        }
        if (source.SearchParam != null) {
            this.SearchParam = new String(source.SearchParam);
        }
        if (source.ReferPageUrl != null) {
            this.ReferPageUrl = new String(source.ReferPageUrl);
        }
        if (source.GuestId != null) {
            this.GuestId = new String(source.GuestId);
        }
        if (source.Cust != null) {
            this.Cust = new Cust[source.Cust.length];
            for (int i = 0; i < source.Cust.length; i++) {
                this.Cust[i] = new Cust(source.Cust[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SearchScene", this.SearchScene);
        this.setParamSimple(map, prefix + "SearchParam", this.SearchParam);
        this.setParamSimple(map, prefix + "ReferPageUrl", this.ReferPageUrl);
        this.setParamSimple(map, prefix + "GuestId", this.GuestId);
        this.setParamArrayObj(map, prefix + "Cust.", this.Cust);

    }
}

