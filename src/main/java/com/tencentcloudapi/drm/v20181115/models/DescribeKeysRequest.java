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

public class DescribeKeysRequest extends AbstractModel{

    /**
    * 使用的DRM方案类型，接口取值WIDEVINE、FAIRPLAY、NORMALAES。
    */
    @SerializedName("DrmType")
    @Expose
    private String DrmType;

    /**
    * 加密的track列表，接口取值VIDEO、AUDIO。
    */
    @SerializedName("Tracks")
    @Expose
    private String [] Tracks;

    /**
    * 内容类型。接口取值VodVideo,LiveVideo
    */
    @SerializedName("ContentType")
    @Expose
    private String ContentType;

    /**
    * Base64编码的Rsa公钥，用来加密出参中的SessionKey。
如果该参数为空，则出参中SessionKey为明文。
    */
    @SerializedName("RsaPublicKey")
    @Expose
    private String RsaPublicKey;

    /**
    * 一个加密内容的唯一标识。
如果该参数为空，则后台自动生成
    */
    @SerializedName("ContentId")
    @Expose
    private String ContentId;

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
     * Get 加密的track列表，接口取值VIDEO、AUDIO。 
     * @return Tracks 加密的track列表，接口取值VIDEO、AUDIO。
     */
    public String [] getTracks() {
        return this.Tracks;
    }

    /**
     * Set 加密的track列表，接口取值VIDEO、AUDIO。
     * @param Tracks 加密的track列表，接口取值VIDEO、AUDIO。
     */
    public void setTracks(String [] Tracks) {
        this.Tracks = Tracks;
    }

    /**
     * Get 内容类型。接口取值VodVideo,LiveVideo 
     * @return ContentType 内容类型。接口取值VodVideo,LiveVideo
     */
    public String getContentType() {
        return this.ContentType;
    }

    /**
     * Set 内容类型。接口取值VodVideo,LiveVideo
     * @param ContentType 内容类型。接口取值VodVideo,LiveVideo
     */
    public void setContentType(String ContentType) {
        this.ContentType = ContentType;
    }

    /**
     * Get Base64编码的Rsa公钥，用来加密出参中的SessionKey。
如果该参数为空，则出参中SessionKey为明文。 
     * @return RsaPublicKey Base64编码的Rsa公钥，用来加密出参中的SessionKey。
如果该参数为空，则出参中SessionKey为明文。
     */
    public String getRsaPublicKey() {
        return this.RsaPublicKey;
    }

    /**
     * Set Base64编码的Rsa公钥，用来加密出参中的SessionKey。
如果该参数为空，则出参中SessionKey为明文。
     * @param RsaPublicKey Base64编码的Rsa公钥，用来加密出参中的SessionKey。
如果该参数为空，则出参中SessionKey为明文。
     */
    public void setRsaPublicKey(String RsaPublicKey) {
        this.RsaPublicKey = RsaPublicKey;
    }

    /**
     * Get 一个加密内容的唯一标识。
如果该参数为空，则后台自动生成 
     * @return ContentId 一个加密内容的唯一标识。
如果该参数为空，则后台自动生成
     */
    public String getContentId() {
        return this.ContentId;
    }

    /**
     * Set 一个加密内容的唯一标识。
如果该参数为空，则后台自动生成
     * @param ContentId 一个加密内容的唯一标识。
如果该参数为空，则后台自动生成
     */
    public void setContentId(String ContentId) {
        this.ContentId = ContentId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DrmType", this.DrmType);
        this.setParamArraySimple(map, prefix + "Tracks.", this.Tracks);
        this.setParamSimple(map, prefix + "ContentType", this.ContentType);
        this.setParamSimple(map, prefix + "RsaPublicKey", this.RsaPublicKey);
        this.setParamSimple(map, prefix + "ContentId", this.ContentId);

    }
}

