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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectionInfo extends AbstractModel {

    /**
    * <p>防护实例 ID。</p>
    */
    @SerializedName("ProtectionId")
    @Expose
    private String ProtectionId;

    /**
    * <p>防护实例名称。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>防护实例的防护级别。</p><p>枚举值：</p><ul><li>advanced： 增强防护；</li><li>ultimate： 卓越防护。</li></ul>
    */
    @SerializedName("ProtectionLevel")
    @Expose
    private String ProtectionLevel;

    /**
    * <p>防护实例状态。</p><p>枚举值：</p><ul><li>protecting： 防护中；</li><li>processing： 变更中；</li><li>disabling： 停用中；</li><li>disabled： 已停用。</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * <p>资源标签列表。</p>
    */
    @SerializedName("Tags")
    @Expose
    private TagInfo [] Tags;

    /**
    * <p>防护实例中的防护资源数量。</p>
    */
    @SerializedName("ResourceCount")
    @Expose
    private Long ResourceCount;

    /**
     * Get <p>防护实例 ID。</p> 
     * @return ProtectionId <p>防护实例 ID。</p>
     */
    public String getProtectionId() {
        return this.ProtectionId;
    }

    /**
     * Set <p>防护实例 ID。</p>
     * @param ProtectionId <p>防护实例 ID。</p>
     */
    public void setProtectionId(String ProtectionId) {
        this.ProtectionId = ProtectionId;
    }

    /**
     * Get <p>防护实例名称。</p> 
     * @return Name <p>防护实例名称。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>防护实例名称。</p>
     * @param Name <p>防护实例名称。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>防护实例的防护级别。</p><p>枚举值：</p><ul><li>advanced： 增强防护；</li><li>ultimate： 卓越防护。</li></ul> 
     * @return ProtectionLevel <p>防护实例的防护级别。</p><p>枚举值：</p><ul><li>advanced： 增强防护；</li><li>ultimate： 卓越防护。</li></ul>
     */
    public String getProtectionLevel() {
        return this.ProtectionLevel;
    }

    /**
     * Set <p>防护实例的防护级别。</p><p>枚举值：</p><ul><li>advanced： 增强防护；</li><li>ultimate： 卓越防护。</li></ul>
     * @param ProtectionLevel <p>防护实例的防护级别。</p><p>枚举值：</p><ul><li>advanced： 增强防护；</li><li>ultimate： 卓越防护。</li></ul>
     */
    public void setProtectionLevel(String ProtectionLevel) {
        this.ProtectionLevel = ProtectionLevel;
    }

    /**
     * Get <p>防护实例状态。</p><p>枚举值：</p><ul><li>protecting： 防护中；</li><li>processing： 变更中；</li><li>disabling： 停用中；</li><li>disabled： 已停用。</li></ul> 
     * @return Status <p>防护实例状态。</p><p>枚举值：</p><ul><li>protecting： 防护中；</li><li>processing： 变更中；</li><li>disabling： 停用中；</li><li>disabled： 已停用。</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set <p>防护实例状态。</p><p>枚举值：</p><ul><li>protecting： 防护中；</li><li>processing： 变更中；</li><li>disabling： 停用中；</li><li>disabled： 已停用。</li></ul>
     * @param Status <p>防护实例状态。</p><p>枚举值：</p><ul><li>protecting： 防护中；</li><li>processing： 变更中；</li><li>disabling： 停用中；</li><li>disabled： 已停用。</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get <p>资源标签列表。</p> 
     * @return Tags <p>资源标签列表。</p>
     */
    public TagInfo [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>资源标签列表。</p>
     * @param Tags <p>资源标签列表。</p>
     */
    public void setTags(TagInfo [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get <p>防护实例中的防护资源数量。</p> 
     * @return ResourceCount <p>防护实例中的防护资源数量。</p>
     */
    public Long getResourceCount() {
        return this.ResourceCount;
    }

    /**
     * Set <p>防护实例中的防护资源数量。</p>
     * @param ResourceCount <p>防护实例中的防护资源数量。</p>
     */
    public void setResourceCount(Long ResourceCount) {
        this.ResourceCount = ResourceCount;
    }

    public ProtectionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectionInfo(ProtectionInfo source) {
        if (source.ProtectionId != null) {
            this.ProtectionId = new String(source.ProtectionId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.ProtectionLevel != null) {
            this.ProtectionLevel = new String(source.ProtectionLevel);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Tags != null) {
            this.Tags = new TagInfo[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new TagInfo(source.Tags[i]);
            }
        }
        if (source.ResourceCount != null) {
            this.ResourceCount = new Long(source.ResourceCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProtectionId", this.ProtectionId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "ProtectionLevel", this.ProtectionLevel);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ResourceCount", this.ResourceCount);

    }
}

