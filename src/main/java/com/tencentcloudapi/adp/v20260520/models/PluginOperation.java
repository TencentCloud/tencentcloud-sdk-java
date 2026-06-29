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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PluginOperation extends AbstractModel {

    /**
    * 是否允许外部调用
    */
    @SerializedName("AllowExternalAccess")
    @Expose
    private Boolean AllowExternalAccess;

    /**
    * <p>计费类型。</p><p>枚举值：</p><ul><li>0：免费</li><li>1：公测</li><li>2：官方收费</li></ul>
    */
    @SerializedName("BillingType")
    @Expose
    private Long BillingType;

    /**
    * 插件分类标识
    */
    @SerializedName("CategoryKey")
    @Expose
    private String CategoryKey;

    /**
    * 插件概述
    */
    @SerializedName("Introduction")
    @Expose
    private String Introduction;

    /**
    * 是否精选
    */
    @SerializedName("IsRecommended")
    @Expose
    private Boolean IsRecommended;

    /**
     * Get 是否允许外部调用 
     * @return AllowExternalAccess 是否允许外部调用
     */
    public Boolean getAllowExternalAccess() {
        return this.AllowExternalAccess;
    }

    /**
     * Set 是否允许外部调用
     * @param AllowExternalAccess 是否允许外部调用
     */
    public void setAllowExternalAccess(Boolean AllowExternalAccess) {
        this.AllowExternalAccess = AllowExternalAccess;
    }

    /**
     * Get <p>计费类型。</p><p>枚举值：</p><ul><li>0：免费</li><li>1：公测</li><li>2：官方收费</li></ul> 
     * @return BillingType <p>计费类型。</p><p>枚举值：</p><ul><li>0：免费</li><li>1：公测</li><li>2：官方收费</li></ul>
     */
    public Long getBillingType() {
        return this.BillingType;
    }

    /**
     * Set <p>计费类型。</p><p>枚举值：</p><ul><li>0：免费</li><li>1：公测</li><li>2：官方收费</li></ul>
     * @param BillingType <p>计费类型。</p><p>枚举值：</p><ul><li>0：免费</li><li>1：公测</li><li>2：官方收费</li></ul>
     */
    public void setBillingType(Long BillingType) {
        this.BillingType = BillingType;
    }

    /**
     * Get 插件分类标识 
     * @return CategoryKey 插件分类标识
     */
    public String getCategoryKey() {
        return this.CategoryKey;
    }

    /**
     * Set 插件分类标识
     * @param CategoryKey 插件分类标识
     */
    public void setCategoryKey(String CategoryKey) {
        this.CategoryKey = CategoryKey;
    }

    /**
     * Get 插件概述 
     * @return Introduction 插件概述
     */
    public String getIntroduction() {
        return this.Introduction;
    }

    /**
     * Set 插件概述
     * @param Introduction 插件概述
     */
    public void setIntroduction(String Introduction) {
        this.Introduction = Introduction;
    }

    /**
     * Get 是否精选 
     * @return IsRecommended 是否精选
     */
    public Boolean getIsRecommended() {
        return this.IsRecommended;
    }

    /**
     * Set 是否精选
     * @param IsRecommended 是否精选
     */
    public void setIsRecommended(Boolean IsRecommended) {
        this.IsRecommended = IsRecommended;
    }

    public PluginOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginOperation(PluginOperation source) {
        if (source.AllowExternalAccess != null) {
            this.AllowExternalAccess = new Boolean(source.AllowExternalAccess);
        }
        if (source.BillingType != null) {
            this.BillingType = new Long(source.BillingType);
        }
        if (source.CategoryKey != null) {
            this.CategoryKey = new String(source.CategoryKey);
        }
        if (source.Introduction != null) {
            this.Introduction = new String(source.Introduction);
        }
        if (source.IsRecommended != null) {
            this.IsRecommended = new Boolean(source.IsRecommended);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllowExternalAccess", this.AllowExternalAccess);
        this.setParamSimple(map, prefix + "BillingType", this.BillingType);
        this.setParamSimple(map, prefix + "CategoryKey", this.CategoryKey);
        this.setParamSimple(map, prefix + "Introduction", this.Introduction);
        this.setParamSimple(map, prefix + "IsRecommended", this.IsRecommended);

    }
}

