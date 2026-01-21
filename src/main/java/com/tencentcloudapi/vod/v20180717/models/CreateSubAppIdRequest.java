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
    * 应用名称，长度限制：40个字符。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用简介，长度限制： 300个字符。不填则应用简介默认为空。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 此应用的模式，可选值为：
- fileid：仅FileID模式
- fileid+path：FileID & Path模式
留空时默认选择仅FileID模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 存储地域
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 此应用需要绑定的tag
    */
    @SerializedName("Tags")
    @Expose
    private ResourceTag [] Tags;

    /**
     * Get 应用名称，长度限制：40个字符。 
     * @return Name 应用名称，长度限制：40个字符。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用名称，长度限制：40个字符。
     * @param Name 应用名称，长度限制：40个字符。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用简介，长度限制： 300个字符。不填则应用简介默认为空。 
     * @return Description 应用简介，长度限制： 300个字符。不填则应用简介默认为空。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 应用简介，长度限制： 300个字符。不填则应用简介默认为空。
     * @param Description 应用简介，长度限制： 300个字符。不填则应用简介默认为空。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。 
     * @return Type 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。
     * @param Type 应用类型， 取值有：<li>AllInOne：一体化；</li><li>Professional：专业版。</li>默认值为 AllInOne。
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 此应用的模式，可选值为：
- fileid：仅FileID模式
- fileid+path：FileID & Path模式
留空时默认选择仅FileID模式 
     * @return Mode 此应用的模式，可选值为：
- fileid：仅FileID模式
- fileid+path：FileID & Path模式
留空时默认选择仅FileID模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * Set 此应用的模式，可选值为：
- fileid：仅FileID模式
- fileid+path：FileID & Path模式
留空时默认选择仅FileID模式
     * @param Mode 此应用的模式，可选值为：
- fileid：仅FileID模式
- fileid+path：FileID & Path模式
留空时默认选择仅FileID模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * Get 存储地域 
     * @return StorageRegion 存储地域
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 存储地域
     * @param StorageRegion 存储地域
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 此应用需要绑定的tag 
     * @return Tags 此应用需要绑定的tag
     */
    public ResourceTag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 此应用需要绑定的tag
     * @param Tags 此应用需要绑定的tag
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

