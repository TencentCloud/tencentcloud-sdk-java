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
package com.tencentcloudapi.ags.v20250920.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRegistryRequest extends AbstractModel {

    /**
    * <p>同一 AppId + Region 唯一、长度 1–255</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>描述文本；最长 4096。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>审批模式；创建时确定，创建后不可修改；省略时默认为 AUTO，枚举值区分大小写。</p>
    */
    @SerializedName("ApprovalMode")
    @Expose
    private String ApprovalMode;

    /**
    * <p>创建时绑定的腾讯云自定义标签；Key 不可重复；最多 10 个。</p>
    */
    @SerializedName("Tags")
    @Expose
    private CloudTag [] Tags;

    /**
     * Get <p>同一 AppId + Region 唯一、长度 1–255</p> 
     * @return Name <p>同一 AppId + Region 唯一、长度 1–255</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>同一 AppId + Region 唯一、长度 1–255</p>
     * @param Name <p>同一 AppId + Region 唯一、长度 1–255</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>描述文本；最长 4096。</p> 
     * @return Description <p>描述文本；最长 4096。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>描述文本；最长 4096。</p>
     * @param Description <p>描述文本；最长 4096。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>审批模式；创建时确定，创建后不可修改；省略时默认为 AUTO，枚举值区分大小写。</p> 
     * @return ApprovalMode <p>审批模式；创建时确定，创建后不可修改；省略时默认为 AUTO，枚举值区分大小写。</p>
     */
    public String getApprovalMode() {
        return this.ApprovalMode;
    }

    /**
     * Set <p>审批模式；创建时确定，创建后不可修改；省略时默认为 AUTO，枚举值区分大小写。</p>
     * @param ApprovalMode <p>审批模式；创建时确定，创建后不可修改；省略时默认为 AUTO，枚举值区分大小写。</p>
     */
    public void setApprovalMode(String ApprovalMode) {
        this.ApprovalMode = ApprovalMode;
    }

    /**
     * Get <p>创建时绑定的腾讯云自定义标签；Key 不可重复；最多 10 个。</p> 
     * @return Tags <p>创建时绑定的腾讯云自定义标签；Key 不可重复；最多 10 个。</p>
     */
    public CloudTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>创建时绑定的腾讯云自定义标签；Key 不可重复；最多 10 个。</p>
     * @param Tags <p>创建时绑定的腾讯云自定义标签；Key 不可重复；最多 10 个。</p>
     */
    public void setTags(CloudTag [] Tags) {
        this.Tags = Tags;
    }

    public CreateRegistryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRegistryRequest(CreateRegistryRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.ApprovalMode != null) {
            this.ApprovalMode = new String(source.ApprovalMode);
        }
        if (source.Tags != null) {
            this.Tags = new CloudTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new CloudTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "ApprovalMode", this.ApprovalMode);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

