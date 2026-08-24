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
package com.tencentcloudapi.tse.v20201207.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AIGWModelScope extends AbstractModel {

    /**
    * <p>范围类型</p><p>枚举值：</p><ul><li>ALL： 允许全部访问</li><li>ALLOWLIST： 允许访问的模型列表</li><li>MAG： 模型访问组</li></ul>
    */
    @SerializedName("ScopeType")
    @Expose
    private String ScopeType;

    /**
    * <p>允许访问的模型列表，ScopeType=ALLOWLIST时设置</p>
    */
    @SerializedName("AllowList")
    @Expose
    private String [] AllowList;

    /**
    * <p>模型访问组，ScopeType=MAG时设置</p>
    */
    @SerializedName("MagRefs")
    @Expose
    private String [] MagRefs;

    /**
     * Get <p>范围类型</p><p>枚举值：</p><ul><li>ALL： 允许全部访问</li><li>ALLOWLIST： 允许访问的模型列表</li><li>MAG： 模型访问组</li></ul> 
     * @return ScopeType <p>范围类型</p><p>枚举值：</p><ul><li>ALL： 允许全部访问</li><li>ALLOWLIST： 允许访问的模型列表</li><li>MAG： 模型访问组</li></ul>
     */
    public String getScopeType() {
        return this.ScopeType;
    }

    /**
     * Set <p>范围类型</p><p>枚举值：</p><ul><li>ALL： 允许全部访问</li><li>ALLOWLIST： 允许访问的模型列表</li><li>MAG： 模型访问组</li></ul>
     * @param ScopeType <p>范围类型</p><p>枚举值：</p><ul><li>ALL： 允许全部访问</li><li>ALLOWLIST： 允许访问的模型列表</li><li>MAG： 模型访问组</li></ul>
     */
    public void setScopeType(String ScopeType) {
        this.ScopeType = ScopeType;
    }

    /**
     * Get <p>允许访问的模型列表，ScopeType=ALLOWLIST时设置</p> 
     * @return AllowList <p>允许访问的模型列表，ScopeType=ALLOWLIST时设置</p>
     */
    public String [] getAllowList() {
        return this.AllowList;
    }

    /**
     * Set <p>允许访问的模型列表，ScopeType=ALLOWLIST时设置</p>
     * @param AllowList <p>允许访问的模型列表，ScopeType=ALLOWLIST时设置</p>
     */
    public void setAllowList(String [] AllowList) {
        this.AllowList = AllowList;
    }

    /**
     * Get <p>模型访问组，ScopeType=MAG时设置</p> 
     * @return MagRefs <p>模型访问组，ScopeType=MAG时设置</p>
     */
    public String [] getMagRefs() {
        return this.MagRefs;
    }

    /**
     * Set <p>模型访问组，ScopeType=MAG时设置</p>
     * @param MagRefs <p>模型访问组，ScopeType=MAG时设置</p>
     */
    public void setMagRefs(String [] MagRefs) {
        this.MagRefs = MagRefs;
    }

    public AIGWModelScope() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AIGWModelScope(AIGWModelScope source) {
        if (source.ScopeType != null) {
            this.ScopeType = new String(source.ScopeType);
        }
        if (source.AllowList != null) {
            this.AllowList = new String[source.AllowList.length];
            for (int i = 0; i < source.AllowList.length; i++) {
                this.AllowList[i] = new String(source.AllowList[i]);
            }
        }
        if (source.MagRefs != null) {
            this.MagRefs = new String[source.MagRefs.length];
            for (int i = 0; i < source.MagRefs.length; i++) {
                this.MagRefs[i] = new String(source.MagRefs[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ScopeType", this.ScopeType);
        this.setParamArraySimple(map, prefix + "AllowList.", this.AllowList);
        this.setParamArraySimple(map, prefix + "MagRefs.", this.MagRefs);

    }
}

