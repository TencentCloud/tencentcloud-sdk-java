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

public class CorpShareConfig extends AbstractModel {

    /**
    * <p>企业共享开关</p>
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * <p>共享范围类型，1：企业全员，2：指定账户，3：指定空间</p>
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
    * <p>企业共享应用标签</p>
    */
    @SerializedName("TagIdList")
    @Expose
    private String [] TagIdList;

    /**
    * <p>共享范围信息(用户时StrId为uin,Name为用户名称;空间时StrId为空间ID,Name为空间名称)</p>
    */
    @SerializedName("ShareScopeList")
    @Expose
    private Identity [] ShareScopeList;

    /**
     * Get <p>企业共享开关</p> 
     * @return Enabled <p>企业共享开关</p>
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * Set <p>企业共享开关</p>
     * @param Enabled <p>企业共享开关</p>
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * Get <p>共享范围类型，1：企业全员，2：指定账户，3：指定空间</p> 
     * @return ShareScope <p>共享范围类型，1：企业全员，2：指定账户，3：指定空间</p>
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set <p>共享范围类型，1：企业全员，2：指定账户，3：指定空间</p>
     * @param ShareScope <p>共享范围类型，1：企业全员，2：指定账户，3：指定空间</p>
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
    }

    /**
     * Get <p>企业共享应用标签</p> 
     * @return TagIdList <p>企业共享应用标签</p>
     */
    public String [] getTagIdList() {
        return this.TagIdList;
    }

    /**
     * Set <p>企业共享应用标签</p>
     * @param TagIdList <p>企业共享应用标签</p>
     */
    public void setTagIdList(String [] TagIdList) {
        this.TagIdList = TagIdList;
    }

    /**
     * Get <p>共享范围信息(用户时StrId为uin,Name为用户名称;空间时StrId为空间ID,Name为空间名称)</p> 
     * @return ShareScopeList <p>共享范围信息(用户时StrId为uin,Name为用户名称;空间时StrId为空间ID,Name为空间名称)</p>
     */
    public Identity [] getShareScopeList() {
        return this.ShareScopeList;
    }

    /**
     * Set <p>共享范围信息(用户时StrId为uin,Name为用户名称;空间时StrId为空间ID,Name为空间名称)</p>
     * @param ShareScopeList <p>共享范围信息(用户时StrId为uin,Name为用户名称;空间时StrId为空间ID,Name为空间名称)</p>
     */
    public void setShareScopeList(Identity [] ShareScopeList) {
        this.ShareScopeList = ShareScopeList;
    }

    public CorpShareConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CorpShareConfig(CorpShareConfig source) {
        if (source.Enabled != null) {
            this.Enabled = new Boolean(source.Enabled);
        }
        if (source.ShareScope != null) {
            this.ShareScope = new Long(source.ShareScope);
        }
        if (source.TagIdList != null) {
            this.TagIdList = new String[source.TagIdList.length];
            for (int i = 0; i < source.TagIdList.length; i++) {
                this.TagIdList[i] = new String(source.TagIdList[i]);
            }
        }
        if (source.ShareScopeList != null) {
            this.ShareScopeList = new Identity[source.ShareScopeList.length];
            for (int i = 0; i < source.ShareScopeList.length; i++) {
                this.ShareScopeList[i] = new Identity(source.ShareScopeList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "ShareScope", this.ShareScope);
        this.setParamArraySimple(map, prefix + "TagIdList.", this.TagIdList);
        this.setParamArrayObj(map, prefix + "ShareScopeList.", this.ShareScopeList);

    }
}

