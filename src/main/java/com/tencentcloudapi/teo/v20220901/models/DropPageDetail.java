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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropPageDetail extends AbstractModel {

    /**
    * 拦截页面的唯一 Id。系统默认包含一个自带拦截页面，Id 值为0。
该 Id 可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面。该参数已废弃。
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * 拦截页面的 HTTP 状态码。状态码取值：100～600，不支持 3xx 状态码。托管规则拦截页面默认：566，安全防护（除托管规则外）拦截页面默认：567.
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 页面文件名或 url。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 页面的类型，取值有：
<li>page：指定页面。</li>

    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Type 类型是 page 时必填，且不能为空。
    */
    @SerializedName("CustomResponseId")
    @Expose
    private String CustomResponseId;

    /**
     * Get 拦截页面的唯一 Id。系统默认包含一个自带拦截页面，Id 值为0。
该 Id 可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面。该参数已废弃。 
     * @return PageId 拦截页面的唯一 Id。系统默认包含一个自带拦截页面，Id 值为0。
该 Id 可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面。该参数已废弃。
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set 拦截页面的唯一 Id。系统默认包含一个自带拦截页面，Id 值为0。
该 Id 可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面。该参数已废弃。
     * @param PageId 拦截页面的唯一 Id。系统默认包含一个自带拦截页面，Id 值为0。
该 Id 可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面。该参数已废弃。
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 拦截页面的 HTTP 状态码。状态码取值：100～600，不支持 3xx 状态码。托管规则拦截页面默认：566，安全防护（除托管规则外）拦截页面默认：567. 
     * @return StatusCode 拦截页面的 HTTP 状态码。状态码取值：100～600，不支持 3xx 状态码。托管规则拦截页面默认：566，安全防护（除托管规则外）拦截页面默认：567.
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 拦截页面的 HTTP 状态码。状态码取值：100～600，不支持 3xx 状态码。托管规则拦截页面默认：566，安全防护（除托管规则外）拦截页面默认：567.
     * @param StatusCode 拦截页面的 HTTP 状态码。状态码取值：100～600，不支持 3xx 状态码。托管规则拦截页面默认：566，安全防护（除托管规则外）拦截页面默认：567.
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 页面文件名或 url。 
     * @return Name 页面文件名或 url。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 页面文件名或 url。
     * @param Name 页面文件名或 url。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 页面的类型，取值有：
<li>page：指定页面。</li>
 
     * @return Type 页面的类型，取值有：
<li>page：指定页面。</li>

     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 页面的类型，取值有：
<li>page：指定页面。</li>

     * @param Type 页面的类型，取值有：
<li>page：指定页面。</li>

     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Type 类型是 page 时必填，且不能为空。 
     * @return CustomResponseId 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Type 类型是 page 时必填，且不能为空。
     */
    public String getCustomResponseId() {
        return this.CustomResponseId;
    }

    /**
     * Set 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Type 类型是 page 时必填，且不能为空。
     * @param CustomResponseId 自定义响应 Id。该 Id 可通过查询自定义错误页列表接口获取。默认值为default，使用系统默认页面。Type 类型是 page 时必填，且不能为空。
     */
    public void setCustomResponseId(String CustomResponseId) {
        this.CustomResponseId = CustomResponseId;
    }

    public DropPageDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropPageDetail(DropPageDetail source) {
        if (source.PageId != null) {
            this.PageId = new Long(source.PageId);
        }
        if (source.StatusCode != null) {
            this.StatusCode = new Long(source.StatusCode);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CustomResponseId != null) {
            this.CustomResponseId = new String(source.CustomResponseId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CustomResponseId", this.CustomResponseId);

    }
}

