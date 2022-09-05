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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropPageDetail extends AbstractModel{

    /**
    * 拦截页面的唯一Id。系统默认包含一个自带拦截页面，Id值为0。
该Id可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面
    */
    @SerializedName("PageId")
    @Expose
    private Long PageId;

    /**
    * 拦截页面的HTTP状态码。状态码范围是 100 - 600。
    */
    @SerializedName("StatusCode")
    @Expose
    private Long StatusCode;

    /**
    * 页面的元信息，文件名或url。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 页面的类型。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 拦截页面的唯一Id。系统默认包含一个自带拦截页面，Id值为0。
该Id可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面 
     * @return PageId 拦截页面的唯一Id。系统默认包含一个自带拦截页面，Id值为0。
该Id可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面
     */
    public Long getPageId() {
        return this.PageId;
    }

    /**
     * Set 拦截页面的唯一Id。系统默认包含一个自带拦截页面，Id值为0。
该Id可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面
     * @param PageId 拦截页面的唯一Id。系统默认包含一个自带拦截页面，Id值为0。
该Id可通过创建拦截页面接口进行上传获取。如传入0，代表使用系统默认拦截页面
     */
    public void setPageId(Long PageId) {
        this.PageId = PageId;
    }

    /**
     * Get 拦截页面的HTTP状态码。状态码范围是 100 - 600。 
     * @return StatusCode 拦截页面的HTTP状态码。状态码范围是 100 - 600。
     */
    public Long getStatusCode() {
        return this.StatusCode;
    }

    /**
     * Set 拦截页面的HTTP状态码。状态码范围是 100 - 600。
     * @param StatusCode 拦截页面的HTTP状态码。状态码范围是 100 - 600。
     */
    public void setStatusCode(Long StatusCode) {
        this.StatusCode = StatusCode;
    }

    /**
     * Get 页面的元信息，文件名或url。 
     * @return Name 页面的元信息，文件名或url。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 页面的元信息，文件名或url。
     * @param Name 页面的元信息，文件名或url。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 页面的类型。 
     * @return Type 页面的类型。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 页面的类型。
     * @param Type 页面的类型。
     */
    public void setType(String Type) {
        this.Type = Type;
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
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PageId", this.PageId);
        this.setParamSimple(map, prefix + "StatusCode", this.StatusCode);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

