/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
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
package com.tencentcloudapi.drm.v20181115.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateEncryptKeysRequest extends AbstractModel{

    /**
    * 使用的DRM方案类型，接口取值WIDEVINE、FAIRPLAY、NORMALAES。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 设置的加密密钥列表。
    */
    @SerializedName("Keys")
    @Expose
    private KeyParam [] Keys;

    /**
    * 一个加密内容的唯一标识。
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

    /**
    * 内容类型。接口取值VodVideo,LiveVideo。
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
     * Get 使用的DRM方案类型，接口取值WIDEVINE、FAIRPLAY、NORMALAES。 
     * @return DrmType 使用的DRM方案类型，接口取值WIDEVINE、FAIRPLAY、NORMALAES。
     */
    public String getDrmType() {
        return this.DrmType;
    }

    /**
     * Set 使用的DRM方案类型，接口取值WIDEVINE、FAIRPLAY、NORMALAES。
     * @param DrmType 使用的DRM方案类型，接口取值WIDEVINE、FAIRPLAY、NORMALAES。
     */
    public void setDrmType(String DrmType) {
        this.DrmType = DrmType;
    }

    /**
     * Get 设置的加密密钥列表。 
     * @return Keys 设置的加密密钥列表。
     */
    public KeyParam [] getKeys() {
        return this.Keys;
    }

    /**
     * Set 设置的加密密钥列表。
     * @param Keys 设置的加密密钥列表。
     */
    public void setKeys(KeyParam [] Keys) {
        this.Keys = Keys;
    }

    /**
     * Get 一个加密内容的唯一标识。 
     * @return ContentId 一个加密内容的唯一标识。
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 一个加密内容的唯一标识。
     * @param ContentId 一个加密内容的唯一标识。
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Get 内容类型。接口取值VodVideo,LiveVideo。 
     * @return ContentType 内容类型。接口取值VodVideo,LiveVideo。
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 内容类型。接口取值VodVideo,LiveVideo。
     * @param ContentType 内容类型。接口取值VodVideo,LiveVideo。
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamArrayObj(map, prefix + "Keys.", this.Keys);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);

    }
}

