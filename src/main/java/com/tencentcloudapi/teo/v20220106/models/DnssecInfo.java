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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DnssecInfo extends AbstractModel{

    /**
    * 标志
    */
    @SerializedName("Flags")
    @Expose
    private Long Flags;

    /**
    * 加密算法
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * 加密类型
    */
    @SerializedName("KeyType")
    @Expose
    private String KeyType;

    /**
    * 摘要类型
    */
    @SerializedName("DigestType")
    @Expose
    private String DigestType;

    /**
    * 摘要算法
    */
    @SerializedName("DigestAlgorithm")
    @Expose
    private String DigestAlgorithm;

    /**
    * 摘要信息
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * DS 记录值
    */
    @SerializedName("DS")
    @Expose
    private String DS;

    /**
    * 密钥标签
    */
    @SerializedName("KeyTag")
    @Expose
    private Long KeyTag;

    /**
    * 公钥
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
     * Get 标志 
     * @return Flags 标志
     */
    public Long getFlags() {
        return this.Flags;
    }

    /**
     * Set 标志
     * @param Flags 标志
     */
    public void setFlags(Long Flags) {
        this.Flags = Flags;
    }

    /**
     * Get 加密算法 
     * @return Algorithm 加密算法
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 加密算法
     * @param Algorithm 加密算法
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get 加密类型 
     * @return KeyType 加密类型
     */
    public String getKeyType() {
        return this.KeyType;
    }

    /**
     * Set 加密类型
     * @param KeyType 加密类型
     */
    public void setKeyType(String KeyType) {
        this.KeyType = KeyType;
    }

    /**
     * Get 摘要类型 
     * @return DigestType 摘要类型
     */
    public String getDigestType() {
        return this.DigestType;
    }

    /**
     * Set 摘要类型
     * @param DigestType 摘要类型
     */
    public void setDigestType(String DigestType) {
        this.DigestType = DigestType;
    }

    /**
     * Get 摘要算法 
     * @return DigestAlgorithm 摘要算法
     */
    public String getDigestAlgorithm() {
        return this.DigestAlgorithm;
    }

    /**
     * Set 摘要算法
     * @param DigestAlgorithm 摘要算法
     */
    public void setDigestAlgorithm(String DigestAlgorithm) {
        this.DigestAlgorithm = DigestAlgorithm;
    }

    /**
     * Get 摘要信息 
     * @return Digest 摘要信息
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set 摘要信息
     * @param Digest 摘要信息
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get DS 记录值 
     * @return DS DS 记录值
     */
    public String getDS() {
        return this.DS;
    }

    /**
     * Set DS 记录值
     * @param DS DS 记录值
     */
    public void setDS(String DS) {
        this.DS = DS;
    }

    /**
     * Get 密钥标签 
     * @return KeyTag 密钥标签
     */
    public Long getKeyTag() {
        return this.KeyTag;
    }

    /**
     * Set 密钥标签
     * @param KeyTag 密钥标签
     */
    public void setKeyTag(Long KeyTag) {
        this.KeyTag = KeyTag;
    }

    /**
     * Get 公钥 
     * @return PublicKey 公钥
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥
     * @param PublicKey 公钥
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    public DnssecInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DnssecInfo(DnssecInfo source) {
        if (source.Flags != null) {
            this.Flags = new Long(source.Flags);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.KeyType != null) {
            this.KeyType = new String(source.KeyType);
        }
        if (source.DigestType != null) {
            this.DigestType = new String(source.DigestType);
        }
        if (source.DigestAlgorithm != null) {
            this.DigestAlgorithm = new String(source.DigestAlgorithm);
        }
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.DS != null) {
            this.DS = new String(source.DS);
        }
        if (source.KeyTag != null) {
            this.KeyTag = new Long(source.KeyTag);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Flags", this.Flags);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "KeyType", this.KeyType);
        this.setParamSimple(map, prefix + "DigestType", this.DigestType);
        this.setParamSimple(map, prefix + "DigestAlgorithm", this.DigestAlgorithm);
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "DS", this.DS);
        this.setParamSimple(map, prefix + "KeyTag", this.KeyTag);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);

    }
}

