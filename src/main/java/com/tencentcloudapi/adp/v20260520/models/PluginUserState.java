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

public class PluginUserState extends AbstractModel {

    /**
    * 是否已收藏该插件
    */
    @SerializedName("IsFavorite")
    @Expose
    private Boolean IsFavorite;

    /**
    * 是否在插件白名单内
    */
    @SerializedName("IsInWhiteList")
    @Expose
    private Boolean IsInWhiteList;

    /**
    * <p>白名单类型，用于表示当前用户是否可直接使用该插件。</p><p>枚举值：</p><ul><li>0：非白名单插件，全量开放</li><li>1：当前用户在白名单内</li><li>2：当前用户不在白名单内，需提交申请</li></ul>
    */
    @SerializedName("WhiteListType")
    @Expose
    private Long WhiteListType;

    /**
     * Get 是否已收藏该插件 
     * @return IsFavorite 是否已收藏该插件
     */
    public Boolean getIsFavorite() {
        return this.IsFavorite;
    }

    /**
     * Set 是否已收藏该插件
     * @param IsFavorite 是否已收藏该插件
     */
    public void setIsFavorite(Boolean IsFavorite) {
        this.IsFavorite = IsFavorite;
    }

    /**
     * Get 是否在插件白名单内 
     * @return IsInWhiteList 是否在插件白名单内
     */
    public Boolean getIsInWhiteList() {
        return this.IsInWhiteList;
    }

    /**
     * Set 是否在插件白名单内
     * @param IsInWhiteList 是否在插件白名单内
     */
    public void setIsInWhiteList(Boolean IsInWhiteList) {
        this.IsInWhiteList = IsInWhiteList;
    }

    /**
     * Get <p>白名单类型，用于表示当前用户是否可直接使用该插件。</p><p>枚举值：</p><ul><li>0：非白名单插件，全量开放</li><li>1：当前用户在白名单内</li><li>2：当前用户不在白名单内，需提交申请</li></ul> 
     * @return WhiteListType <p>白名单类型，用于表示当前用户是否可直接使用该插件。</p><p>枚举值：</p><ul><li>0：非白名单插件，全量开放</li><li>1：当前用户在白名单内</li><li>2：当前用户不在白名单内，需提交申请</li></ul>
     */
    public Long getWhiteListType() {
        return this.WhiteListType;
    }

    /**
     * Set <p>白名单类型，用于表示当前用户是否可直接使用该插件。</p><p>枚举值：</p><ul><li>0：非白名单插件，全量开放</li><li>1：当前用户在白名单内</li><li>2：当前用户不在白名单内，需提交申请</li></ul>
     * @param WhiteListType <p>白名单类型，用于表示当前用户是否可直接使用该插件。</p><p>枚举值：</p><ul><li>0：非白名单插件，全量开放</li><li>1：当前用户在白名单内</li><li>2：当前用户不在白名单内，需提交申请</li></ul>
     */
    public void setWhiteListType(Long WhiteListType) {
        this.WhiteListType = WhiteListType;
    }

    public PluginUserState() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PluginUserState(PluginUserState source) {
        if (source.IsFavorite != null) {
            this.IsFavorite = new Boolean(source.IsFavorite);
        }
        if (source.IsInWhiteList != null) {
            this.IsInWhiteList = new Boolean(source.IsInWhiteList);
        }
        if (source.WhiteListType != null) {
            this.WhiteListType = new Long(source.WhiteListType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IsFavorite", this.IsFavorite);
        this.setParamSimple(map, prefix + "IsInWhiteList", this.IsInWhiteList);
        this.setParamSimple(map, prefix + "WhiteListType", this.WhiteListType);

    }
}

