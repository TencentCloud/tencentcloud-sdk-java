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

public class SPEKEDrm extends AbstractModel {

    /**
    * <p>资源标记，该字段内容为用户自定义； 支持1-128个字符的数字、字母、下划线(_)、中划线(-)。 该字段对应Speke请求中的cid字段。 注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带_），具体规则请与DRM厂商进行确认。</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <p>DRM厂商访问地址，该字段内容从DRM厂商获取。注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密</p>
    */
    @SerializedName("KeyServerUrl")
    @Expose
    private String KeyServerUrl;

    /**
    * <p>加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。</p>
    */
    @SerializedName("Vector")
    @Expose
    private String Vector;

    /**
    * <p>加密方式，可选值：<br>cbcs：PlayReady，Widevine，FairPlay，Widevine+FairPlay，Widevine+PlayReady，PlayReady+FairPlay，Widevine+PlayReady+FairPlay支持；<br>cenc：PlayReady，Widevine，Widevine+PlayReady支持；<br>若不填FairPlay 默认cbcs；<br>PlayReady，Widevine 默认cenc；<br>Widevine+FairPlay，PlayReady+FairPlay，Widevine+PlayReady+FairPlay默认cbcs；<br>Widevine+PlayReady默认cenc；</p>
    */
    @SerializedName("EncryptionMethod")
    @Expose
    private String EncryptionMethod;

    /**
    * <p>子流加密规则，默认 preset0<br>preset0：全部子流使用同一个key加密；<br>preset1：每个子流使用不同的key加密；</p>
    */
    @SerializedName("EncryptionPreset")
    @Expose
    private String EncryptionPreset;

    /**
    * <p>DRM厂商请求方式。</p><p>枚举值：</p><ul><li>POST： 大多数DRM厂商使用POST方式请求。</li><li>GET： 部分DRM厂商支持GET方式请求。使用该种方式请求时，需要在KeyServerUrl字段带上各项请求信息。</li></ul><p>默认值：POST</p>
    */
    @SerializedName("KeyAcquireMode")
    @Expose
    private String KeyAcquireMode;

    /**
     * Get <p>资源标记，该字段内容为用户自定义； 支持1-128个字符的数字、字母、下划线(_)、中划线(-)。 该字段对应Speke请求中的cid字段。 注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带_），具体规则请与DRM厂商进行确认。</p> 
     * @return ResourceId <p>资源标记，该字段内容为用户自定义； 支持1-128个字符的数字、字母、下划线(_)、中划线(-)。 该字段对应Speke请求中的cid字段。 注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带_），具体规则请与DRM厂商进行确认。</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源标记，该字段内容为用户自定义； 支持1-128个字符的数字、字母、下划线(_)、中划线(-)。 该字段对应Speke请求中的cid字段。 注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带_），具体规则请与DRM厂商进行确认。</p>
     * @param ResourceId <p>资源标记，该字段内容为用户自定义； 支持1-128个字符的数字、字母、下划线(_)、中划线(-)。 该字段对应Speke请求中的cid字段。 注：不同DRM厂商对该字段的限制有所区别（如：华曦达不支持该字段带_），具体规则请与DRM厂商进行确认。</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <p>DRM厂商访问地址，该字段内容从DRM厂商获取。注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密</p> 
     * @return KeyServerUrl <p>DRM厂商访问地址，该字段内容从DRM厂商获取。注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密</p>
     */
    public String getKeyServerUrl() {
        return this.KeyServerUrl;
    }

    /**
     * Set <p>DRM厂商访问地址，该字段内容从DRM厂商获取。注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密</p>
     * @param KeyServerUrl <p>DRM厂商访问地址，该字段内容从DRM厂商获取。注: 不同DRM厂商对子流的数量限制不一样，如 PallyCon 限制不能超过5条子流，DRMtoday厂商最多仅支持9条子流加密</p>
     */
    public void setKeyServerUrl(String KeyServerUrl) {
        this.KeyServerUrl = KeyServerUrl;
    }

    /**
     * Get <p>加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。</p> 
     * @return Vector <p>加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。</p>
     */
    public String getVector() {
        return this.Vector;
    }

    /**
     * Set <p>加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。</p>
     * @param Vector <p>加密初始化向量(十六进制32字节字符串)，该字段内容为用户自定义。</p>
     */
    public void setVector(String Vector) {
        this.Vector = Vector;
    }

    /**
     * Get <p>加密方式，可选值：<br>cbcs：PlayReady，Widevine，FairPlay，Widevine+FairPlay，Widevine+PlayReady，PlayReady+FairPlay，Widevine+PlayReady+FairPlay支持；<br>cenc：PlayReady，Widevine，Widevine+PlayReady支持；<br>若不填FairPlay 默认cbcs；<br>PlayReady，Widevine 默认cenc；<br>Widevine+FairPlay，PlayReady+FairPlay，Widevine+PlayReady+FairPlay默认cbcs；<br>Widevine+PlayReady默认cenc；</p> 
     * @return EncryptionMethod <p>加密方式，可选值：<br>cbcs：PlayReady，Widevine，FairPlay，Widevine+FairPlay，Widevine+PlayReady，PlayReady+FairPlay，Widevine+PlayReady+FairPlay支持；<br>cenc：PlayReady，Widevine，Widevine+PlayReady支持；<br>若不填FairPlay 默认cbcs；<br>PlayReady，Widevine 默认cenc；<br>Widevine+FairPlay，PlayReady+FairPlay，Widevine+PlayReady+FairPlay默认cbcs；<br>Widevine+PlayReady默认cenc；</p>
     */
    public String getEncryptionMethod() {
        return this.EncryptionMethod;
    }

    /**
     * Set <p>加密方式，可选值：<br>cbcs：PlayReady，Widevine，FairPlay，Widevine+FairPlay，Widevine+PlayReady，PlayReady+FairPlay，Widevine+PlayReady+FairPlay支持；<br>cenc：PlayReady，Widevine，Widevine+PlayReady支持；<br>若不填FairPlay 默认cbcs；<br>PlayReady，Widevine 默认cenc；<br>Widevine+FairPlay，PlayReady+FairPlay，Widevine+PlayReady+FairPlay默认cbcs；<br>Widevine+PlayReady默认cenc；</p>
     * @param EncryptionMethod <p>加密方式，可选值：<br>cbcs：PlayReady，Widevine，FairPlay，Widevine+FairPlay，Widevine+PlayReady，PlayReady+FairPlay，Widevine+PlayReady+FairPlay支持；<br>cenc：PlayReady，Widevine，Widevine+PlayReady支持；<br>若不填FairPlay 默认cbcs；<br>PlayReady，Widevine 默认cenc；<br>Widevine+FairPlay，PlayReady+FairPlay，Widevine+PlayReady+FairPlay默认cbcs；<br>Widevine+PlayReady默认cenc；</p>
     */
    public void setEncryptionMethod(String EncryptionMethod) {
        this.EncryptionMethod = EncryptionMethod;
    }

    /**
     * Get <p>子流加密规则，默认 preset0<br>preset0：全部子流使用同一个key加密；<br>preset1：每个子流使用不同的key加密；</p> 
     * @return EncryptionPreset <p>子流加密规则，默认 preset0<br>preset0：全部子流使用同一个key加密；<br>preset1：每个子流使用不同的key加密；</p>
     */
    public String getEncryptionPreset() {
        return this.EncryptionPreset;
    }

    /**
     * Set <p>子流加密规则，默认 preset0<br>preset0：全部子流使用同一个key加密；<br>preset1：每个子流使用不同的key加密；</p>
     * @param EncryptionPreset <p>子流加密规则，默认 preset0<br>preset0：全部子流使用同一个key加密；<br>preset1：每个子流使用不同的key加密；</p>
     */
    public void setEncryptionPreset(String EncryptionPreset) {
        this.EncryptionPreset = EncryptionPreset;
    }

    /**
     * Get <p>DRM厂商请求方式。</p><p>枚举值：</p><ul><li>POST： 大多数DRM厂商使用POST方式请求。</li><li>GET： 部分DRM厂商支持GET方式请求。使用该种方式请求时，需要在KeyServerUrl字段带上各项请求信息。</li></ul><p>默认值：POST</p> 
     * @return KeyAcquireMode <p>DRM厂商请求方式。</p><p>枚举值：</p><ul><li>POST： 大多数DRM厂商使用POST方式请求。</li><li>GET： 部分DRM厂商支持GET方式请求。使用该种方式请求时，需要在KeyServerUrl字段带上各项请求信息。</li></ul><p>默认值：POST</p>
     */
    public String getKeyAcquireMode() {
        return this.KeyAcquireMode;
    }

    /**
     * Set <p>DRM厂商请求方式。</p><p>枚举值：</p><ul><li>POST： 大多数DRM厂商使用POST方式请求。</li><li>GET： 部分DRM厂商支持GET方式请求。使用该种方式请求时，需要在KeyServerUrl字段带上各项请求信息。</li></ul><p>默认值：POST</p>
     * @param KeyAcquireMode <p>DRM厂商请求方式。</p><p>枚举值：</p><ul><li>POST： 大多数DRM厂商使用POST方式请求。</li><li>GET： 部分DRM厂商支持GET方式请求。使用该种方式请求时，需要在KeyServerUrl字段带上各项请求信息。</li></ul><p>默认值：POST</p>
     */
    public void setKeyAcquireMode(String KeyAcquireMode) {
        this.KeyAcquireMode = KeyAcquireMode;
    }

    public SPEKEDrm() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SPEKEDrm(SPEKEDrm source) {
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
        if (source.KeyAcquireMode != null) {
            this.KeyAcquireMode = new String(source.KeyAcquireMode);
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
        this.setParamSimple(map, prefix + "KeyAcquireMode", this.KeyAcquireMode);

    }
}

