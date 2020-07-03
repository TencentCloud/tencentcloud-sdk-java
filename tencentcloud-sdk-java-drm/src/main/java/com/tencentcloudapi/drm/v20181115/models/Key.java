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

public class Key extends AbstractModel{

    /**
    * 加密track类型。Widevine支持SD、HD、UHD1、UHD2、AUDIO。Fairplay只支持HD。
    */
    @SerializedName("Track")
    @Expose
    private String Track;

    /**
    * 密钥ID。
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
    * 原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
    */
    @SerializedName("Iv")
    @Expose
    private String Iv;

    /**
    * 该key生成时的时间戳
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InsertTimestamp")
    @Expose
    private Long InsertTimestamp;

    /**
     * Get 加密track类型。Widevine支持SD、HD、UHD1、UHD2、AUDIO。Fairplay只支持HD。 
     * @return Track 加密track类型。Widevine支持SD、HD、UHD1、UHD2、AUDIO。Fairplay只支持HD。
     */
    public String getTrack() {
        return this.Track;
    }

    /**
     * Set 加密track类型。Widevine支持SD、HD、UHD1、UHD2、AUDIO。Fairplay只支持HD。
     * @param Track 加密track类型。Widevine支持SD、HD、UHD1、UHD2、AUDIO。Fairplay只支持HD。
     */
    public void setTrack(String Track) {
        this.Track = Track;
    }

    /**
     * Get 密钥ID。 
     * @return KeyId 密钥ID。
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * Set 密钥ID。
     * @param KeyId 密钥ID。
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * Get 原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。 
     * @return Key 原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     * @param Key 原始Key使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。 
     * @return Iv 原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     */
    public String getIv() {
        return this.Iv;
    }

    /**
     * Set 原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     * @param Iv 原始IV使用AES-128 ECB模式和SessionKey加密的后的二进制数据，Base64编码的字符串。
     */
    public void setIv(String Iv) {
        this.Iv = Iv;
    }

    /**
     * Get 该key生成时的时间戳
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InsertTimestamp 该key生成时的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getInsertTimestamp() {
        return this.InsertTimestamp;
    }

    /**
     * Set 该key生成时的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     * @param InsertTimestamp 该key生成时的时间戳
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInsertTimestamp(Long InsertTimestamp) {
        this.InsertTimestamp = InsertTimestamp;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Track", this.Track);
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Iv", this.Iv);
        this.setParamSimple(map, prefix + "InsertTimestamp", this.InsertTimestamp);

    }
}

