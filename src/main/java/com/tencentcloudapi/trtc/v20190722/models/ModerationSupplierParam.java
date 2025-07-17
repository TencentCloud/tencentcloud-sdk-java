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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModerationSupplierParam extends AbstractModel {

    /**
    * 供应审核商账号id，数美天御不为空，易盾为空
    */
    @SerializedName("AppID")
    @Expose
    private String AppID;

    /**
    * 供应审核商秘钥id
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 供应审核商秘钥key
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 音频场景，策略id或者businessId
    */
    @SerializedName("AudioBizType")
    @Expose
    private String AudioBizType;

    /**
    * 图片场景，策略id或者businessId
    */
    @SerializedName("ImageBizType")
    @Expose
    private String ImageBizType;

    /**
     * Get 供应审核商账号id，数美天御不为空，易盾为空 
     * @return AppID 供应审核商账号id，数美天御不为空，易盾为空
     */
    public String getAppID() {
        return this.AppID;
    }

    /**
     * Set 供应审核商账号id，数美天御不为空，易盾为空
     * @param AppID 供应审核商账号id，数美天御不为空，易盾为空
     */
    public void setAppID(String AppID) {
        this.AppID = AppID;
    }

    /**
     * Get 供应审核商秘钥id 
     * @return SecretId 供应审核商秘钥id
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 供应审核商秘钥id
     * @param SecretId 供应审核商秘钥id
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 供应审核商秘钥key 
     * @return SecretKey 供应审核商秘钥key
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 供应审核商秘钥key
     * @param SecretKey 供应审核商秘钥key
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 音频场景，策略id或者businessId 
     * @return AudioBizType 音频场景，策略id或者businessId
     */
    public String getAudioBizType() {
        return this.AudioBizType;
    }

    /**
     * Set 音频场景，策略id或者businessId
     * @param AudioBizType 音频场景，策略id或者businessId
     */
    public void setAudioBizType(String AudioBizType) {
        this.AudioBizType = AudioBizType;
    }

    /**
     * Get 图片场景，策略id或者businessId 
     * @return ImageBizType 图片场景，策略id或者businessId
     */
    public String getImageBizType() {
        return this.ImageBizType;
    }

    /**
     * Set 图片场景，策略id或者businessId
     * @param ImageBizType 图片场景，策略id或者businessId
     */
    public void setImageBizType(String ImageBizType) {
        this.ImageBizType = ImageBizType;
    }

    public ModerationSupplierParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModerationSupplierParam(ModerationSupplierParam source) {
        if (source.AppID != null) {
            this.AppID = new String(source.AppID);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.AudioBizType != null) {
            this.AudioBizType = new String(source.AudioBizType);
        }
        if (source.ImageBizType != null) {
            this.ImageBizType = new String(source.ImageBizType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppID", this.AppID);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "AudioBizType", this.AudioBizType);
        this.setParamSimple(map, prefix + "ImageBizType", this.ImageBizType);

    }
}

