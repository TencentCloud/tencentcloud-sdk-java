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

public class CustomGroupItem extends AbstractModel {

    /**
    * <p>条目内容。</p>
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * <p>条目类型。</p><p>枚举值：</p><ul><li>JA3： JA3 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>JA4： JA4 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>UA： UA 值，仅当所属组 GroupType 为 UA 时可用</li><li>Referer： Referer 值，仅当所属组 GroupType 为 Referer 时可用</li></ul>
    */
    @SerializedName("ItemType")
    @Expose
    private String ItemType;

    /**
     * Get <p>条目内容。</p> 
     * @return Content <p>条目内容。</p>
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set <p>条目内容。</p>
     * @param Content <p>条目内容。</p>
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get <p>条目类型。</p><p>枚举值：</p><ul><li>JA3： JA3 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>JA4： JA4 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>UA： UA 值，仅当所属组 GroupType 为 UA 时可用</li><li>Referer： Referer 值，仅当所属组 GroupType 为 Referer 时可用</li></ul> 
     * @return ItemType <p>条目类型。</p><p>枚举值：</p><ul><li>JA3： JA3 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>JA4： JA4 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>UA： UA 值，仅当所属组 GroupType 为 UA 时可用</li><li>Referer： Referer 值，仅当所属组 GroupType 为 Referer 时可用</li></ul>
     */
    public String getItemType() {
        return this.ItemType;
    }

    /**
     * Set <p>条目类型。</p><p>枚举值：</p><ul><li>JA3： JA3 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>JA4： JA4 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>UA： UA 值，仅当所属组 GroupType 为 UA 时可用</li><li>Referer： Referer 值，仅当所属组 GroupType 为 Referer 时可用</li></ul>
     * @param ItemType <p>条目类型。</p><p>枚举值：</p><ul><li>JA3： JA3 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>JA4： JA4 指纹，仅当所属组 GroupType 为 TLSFingerprint 时可用</li><li>UA： UA 值，仅当所属组 GroupType 为 UA 时可用</li><li>Referer： Referer 值，仅当所属组 GroupType 为 Referer 时可用</li></ul>
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }

    public CustomGroupItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomGroupItem(CustomGroupItem source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.ItemType != null) {
            this.ItemType = new String(source.ItemType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "ItemType", this.ItemType);

    }
}

