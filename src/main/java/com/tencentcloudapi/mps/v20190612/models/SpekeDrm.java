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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SpekeDrm extends AbstractModel {

    /**
    * 资源标记，该字段内容为用户自定义；
支持1-128个字符的数字、字母、下划线(`_`)、中划线(-)。
该字段对应Speke请求中的cid字段。
注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带`_`），具体规则请与DRM厂商进行确认。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * DRM厂商访问地址，该字段内容从DRM厂商获取。

注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密
    */
    @SerializedName("KeyServerUrl")
    @Expose
    private String KeyServerUrl;

    /**
    * 加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
    * 加密方式，FairPlay 默认cbcs
加密方式，PlayReady，Widevine 默认cenc
加密方式，WideVine+FairPlay，Playready+Fairplay，Widevine+Playready+Fairplay默认cbcs
加密方式，Widevine+Playready默认cenc

cbcs：PlayReady，Widevine，FairPlay，WideVine+FairPlay，Widevine+Playready，Playready+Fairplay，Widevine+Playready+Fairplay支持；
cenc：PlayReady，Widevine，Widevine+Playready支持；
    */
    @SerializedName("EncryptionMethod")
    @Expose
    private String EncryptionMethod;

    /**
    * 子流加密规则，默认 preset0
preset0：全部子流使用同一个key加密；
preset1：每个子流使用不同的key加密；

    */
    @SerializedName("EncryptionPreset")
    @Expose
    private String EncryptionPreset;

    /**
     * Get 资源标记，该字段内容为用户自定义；
支持1-128个字符的数字、字母、下划线(`_`)、中划线(-)。
该字段对应Speke请求中的cid字段。
注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带`_`），具体规则请与DRM厂商进行确认。 
     * @return ResourceId 资源标记，该字段内容为用户自定义；
支持1-128个字符的数字、字母、下划线(`_`)、中划线(-)。
该字段对应Speke请求中的cid字段。
注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带`_`），具体规则请与DRM厂商进行确认。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源标记，该字段内容为用户自定义；
支持1-128个字符的数字、字母、下划线(`_`)、中划线(-)。
该字段对应Speke请求中的cid字段。
注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带`_`），具体规则请与DRM厂商进行确认。
     * @param ResourceId 资源标记，该字段内容为用户自定义；
支持1-128个字符的数字、字母、下划线(`_`)、中划线(-)。
该字段对应Speke请求中的cid字段。
注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带`_`），具体规则请与DRM厂商进行确认。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get DRM厂商访问地址，该字段内容从DRM厂商获取。

注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密 
     * @return KeyServerUrl DRM厂商访问地址，该字段内容从DRM厂商获取。

注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密
     */
    public String getKeyServerUrl() {
        return this.KeyServerUrl;
    }

    /**
     * Set DRM厂商访问地址，该字段内容从DRM厂商获取。

注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密
     * @param KeyServerUrl DRM厂商访问地址，该字段内容从DRM厂商获取。

注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密
     */
    public void setKeyServerUrl(String KeyServerUrl) {
        this.KeyServerUrl = KeyServerUrl;
    }

    /**
     * Get 加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。 
     * @return Vector 加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set 加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。
     * @param Vector 加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    /**
     * Get 加密方式，FairPlay 默认cbcs
加密方式，PlayReady，Widevine 默认cenc
加密方式，WideVine+FairPlay，Playready+Fairplay，Widevine+Playready+Fairplay默认cbcs
加密方式，Widevine+Playready默认cenc

cbcs：PlayReady，Widevine，FairPlay，WideVine+FairPlay，Widevine+Playready，Playready+Fairplay，Widevine+Playready+Fairplay支持；
cenc：PlayReady，Widevine，Widevine+Playready支持； 
     * @return EncryptionMethod 加密方式，FairPlay 默认cbcs
加密方式，PlayReady，Widevine 默认cenc
加密方式，WideVine+FairPlay，Playready+Fairplay，Widevine+Playready+Fairplay默认cbcs
加密方式，Widevine+Playready默认cenc

cbcs：PlayReady，Widevine，FairPlay，WideVine+FairPlay，Widevine+Playready，Playready+Fairplay，Widevine+Playready+Fairplay支持；
cenc：PlayReady，Widevine，Widevine+Playready支持；
     */
    public String getEncryptionMethod() {
        return this.EncryptionMethod;
    }

    /**
     * Set 加密方式，FairPlay 默认cbcs
加密方式，PlayReady，Widevine 默认cenc
加密方式，WideVine+FairPlay，Playready+Fairplay，Widevine+Playready+Fairplay默认cbcs
加密方式，Widevine+Playready默认cenc

cbcs：PlayReady，Widevine，FairPlay，WideVine+FairPlay，Widevine+Playready，Playready+Fairplay，Widevine+Playready+Fairplay支持；
cenc：PlayReady，Widevine，Widevine+Playready支持；
     * @param EncryptionMethod 加密方式，FairPlay 默认cbcs
加密方式，PlayReady，Widevine 默认cenc
加密方式，WideVine+FairPlay，Playready+Fairplay，Widevine+Playready+Fairplay默认cbcs
加密方式，Widevine+Playready默认cenc

cbcs：PlayReady，Widevine，FairPlay，WideVine+FairPlay，Widevine+Playready，Playready+Fairplay，Widevine+Playready+Fairplay支持；
cenc：PlayReady，Widevine，Widevine+Playready支持；
     */
    public void setEncryptionMethod(String EncryptionMethod) {
        this.EncryptionMethod = EncryptionMethod;
    }

    /**
     * Get 子流加密规则，默认 preset0
preset0：全部子流使用同一个key加密；
preset1：每个子流使用不同的key加密；
 
     * @return EncryptionPreset 子流加密规则，默认 preset0
preset0：全部子流使用同一个key加密；
preset1：每个子流使用不同的key加密；

     */
    public String getEncryptionPreset() {
        return this.EncryptionPreset;
    }

    /**
     * Set 子流加密规则，默认 preset0
preset0：全部子流使用同一个key加密；
preset1：每个子流使用不同的key加密；

     * @param EncryptionPreset 子流加密规则，默认 preset0
preset0：全部子流使用同一个key加密；
preset1：每个子流使用不同的key加密；

     */
    public void setEncryptionPreset(String EncryptionPreset) {
        this.EncryptionPreset = EncryptionPreset;
    }

    public SpekeDrm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SpekeDrm(SpekeDrm source) {
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.KeyServerUrl != null) {
            this.KeyServerUrl = new String(source.KeyServerUrl);
        }
        if (source.Vector != null) {
            this.Vector = new String(source.Vector);
        }
        if (source.EncryptionMethod != null) {
            this.EncryptionMethod = new String(source.EncryptionMethod);
        }
        if (source.EncryptionPreset != null) {
            this.EncryptionPreset = new String(source.EncryptionPreset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "KeyServerUrl", this.KeyServerUrl);
        this.setParamSimple(map, prefix + "Vector", this.Vector);
        this.setParamSimple(map, prefix + "EncryptionMethod", this.EncryptionMethod);
        this.setParamSimple(map, prefix + "EncryptionPreset", this.EncryptionPreset);

    }
}

