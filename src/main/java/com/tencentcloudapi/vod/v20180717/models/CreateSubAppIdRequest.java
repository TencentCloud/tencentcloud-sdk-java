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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateSubAppIdRequest extends AbstractModel {

    /**
    * <p>应用名称，长度限制：40个字符。</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>应用简介，长度限制： 300个字符。不填则应用简介默认为空。</p>
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * <p>应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>此应用的模式，可选值为：</p><ul><li>fileid：仅FileID模式</li><li>fileid+path：FileID &amp; Path模式<br>留空时默认选择仅FileID模式</li></ul>
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * <p>Mode是仅fileid时，用于设置默认存储地域，可选。<br>Mode是fileid+path时，用于指定存储地域，必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/266/9760">已支持地域列表</a></p>
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * <p>此应用需要绑定的tag</p>
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
     * Get <p>应用名称，长度限制：40个字符。</p> 
     * @return Name <p>应用名称，长度限制：40个字符。</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>应用名称，长度限制：40个字符。</p>
     * @param Name <p>应用名称，长度限制：40个字符。</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>应用简介，长度限制： 300个字符。不填则应用简介默认为空。</p> 
     * @return Description <p>应用简介，长度限制： 300个字符。不填则应用简介默认为空。</p>
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set <p>应用简介，长度限制： 300个字符。不填则应用简介默认为空。</p>
     * @param Description <p>应用简介，长度限制： 300个字符。不填则应用简介默认为空。</p>
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get <p>应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。</p> 
     * @return Type <p>应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。</p>
     * @param Type <p>应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>此应用的模式，可选值为：</p><ul><li>fileid：仅FileID模式</li><li>fileid+path：FileID &amp; Path模式<br>留空时默认选择仅FileID模式</li></ul> 
     * @return Mode <p>此应用的模式，可选值为：</p><ul><li>fileid：仅FileID模式</li><li>fileid+path：FileID &amp; Path模式<br>留空时默认选择仅FileID模式</li></ul>
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set <p>此应用的模式，可选值为：</p><ul><li>fileid：仅FileID模式</li><li>fileid+path：FileID &amp; Path模式<br>留空时默认选择仅FileID模式</li></ul>
     * @param Mode <p>此应用的模式，可选值为：</p><ul><li>fileid：仅FileID模式</li><li>fileid+path：FileID &amp; Path模式<br>留空时默认选择仅FileID模式</li></ul>
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get <p>Mode是仅fileid时，用于设置默认存储地域，可选。<br>Mode是fileid+path时，用于指定存储地域，必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/266/9760">已支持地域列表</a></p> 
     * @return StorageRegion <p>Mode是仅fileid时，用于设置默认存储地域，可选。<br>Mode是fileid+path时，用于指定存储地域，必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/266/9760">已支持地域列表</a></p>
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set <p>Mode是仅fileid时，用于设置默认存储地域，可选。<br>Mode是fileid+path时，用于指定存储地域，必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/266/9760">已支持地域列表</a></p>
     * @param StorageRegion <p>Mode是仅fileid时，用于设置默认存储地域，可选。<br>Mode是fileid+path时，用于指定存储地域，必填。</p><p>取值参考：<a href="https://cloud.tencent.com/document/product/266/9760">已支持地域列表</a></p>
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get <p>此应用需要绑定的tag</p> 
     * @return Tags <p>此应用需要绑定的tag</p>
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set <p>此应用需要绑定的tag</p>
     * @param Tags <p>此应用需要绑定的tag</p>
     */
    public void setTags(ResourceTag [] Tags) {
        this.Tags = Tags;
    }

    public CreateSubAppIdRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateSubAppIdRequest(CreateSubAppIdRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Mode != null) {
            this.Mode = new String(source.Mode);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.Tags != null) {
            this.Tags = new ResourceTag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new ResourceTag(source.Tags[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);

    }
}

