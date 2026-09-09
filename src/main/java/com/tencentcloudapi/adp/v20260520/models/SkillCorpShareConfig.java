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

public class SkillCorpShareConfig extends AbstractModel {

    /**
    * <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARE_SCOPE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ALL</td><td>1</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ACCOUNT</td><td>2</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_SPACE</td><td>3</td><td></td></tr></tbody></table><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 全企业共享</li><li>3： 按空间共享</li></ul>
    */
    @SerializedName("ShareScope")
    @Expose
    private Long ShareScope;

    /**
    * <p>共享范围信息，仅支持空间；StrId 为空间ID，Name 为空间名称</p>
    */
    @SerializedName("ShareScopeList")
    @Expose
    private Identity [] ShareScopeList;

    /**
     * Get <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARE_SCOPE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ALL</td><td>1</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ACCOUNT</td><td>2</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_SPACE</td><td>3</td><td></td></tr></tbody></table><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 全企业共享</li><li>3： 按空间共享</li></ul> 
     * @return ShareScope <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARE_SCOPE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ALL</td><td>1</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ACCOUNT</td><td>2</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_SPACE</td><td>3</td><td></td></tr></tbody></table><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 全企业共享</li><li>3： 按空间共享</li></ul>
     */
    public Long getShareScope() {
        return this.ShareScope;
    }

    /**
     * Set <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARE_SCOPE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ALL</td><td>1</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ACCOUNT</td><td>2</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_SPACE</td><td>3</td><td></td></tr></tbody></table><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 全企业共享</li><li>3： 按空间共享</li></ul>
     * @param ShareScope <table><tbody><tr><td>枚举项</td><td>枚举值</td><td>描述</td></tr><tr><td>SHARE_SCOPE_TYPE_UNSPECIFIED</td><td>0</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ALL</td><td>1</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_ACCOUNT</td><td>2</td><td></td></tr><tr><td>SHARE_SCOPE_TYPE_SPACE</td><td>3</td><td></td></tr></tbody></table><p>枚举值：</p><ul><li>0： 未指定</li><li>1： 全企业共享</li><li>3： 按空间共享</li></ul>
     */
    public void setShareScope(Long ShareScope) {
        this.ShareScope = ShareScope;
    }

    /**
     * Get <p>共享范围信息，仅支持空间；StrId 为空间ID，Name 为空间名称</p> 
     * @return ShareScopeList <p>共享范围信息，仅支持空间；StrId 为空间ID，Name 为空间名称</p>
     */
    public Identity [] getShareScopeList() {
        return this.ShareScopeList;
    }

    /**
     * Set <p>共享范围信息，仅支持空间；StrId 为空间ID，Name 为空间名称</p>
     * @param ShareScopeList <p>共享范围信息，仅支持空间；StrId 为空间ID，Name 为空间名称</p>
     */
    public void setShareScopeList(Identity [] ShareScopeList) {
        this.ShareScopeList = ShareScopeList;
    }

    public SkillCorpShareConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SkillCorpShareConfig(SkillCorpShareConfig source) {
        if (source.ShareScope != null) {
            this.ShareScope = new Long(source.ShareScope);
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
        this.setParamSimple(map, prefix + "ShareScope", this.ShareScope);
        this.setParamArrayObj(map, prefix + "ShareScopeList.", this.ShareScopeList);

    }
}

