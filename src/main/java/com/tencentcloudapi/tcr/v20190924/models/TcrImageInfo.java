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
package com.tencentcloudapi.tcr.v20190924.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TcrImageInfo extends AbstractModel{

    /**
    * 哈希值
    */
    @SerializedName("Digest")
    @Expose
    private String Digest;

    /**
    * 镜像体积（单位：字节）
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * Tag名称
    */
    @SerializedName("ImageVersion")
    @Expose
    private String ImageVersion;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 制品类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private String Kind;

    /**
    * KMS 签名信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("KmsSignature")
    @Expose
    private String KmsSignature;

    /**
     * Get 哈希值 
     * @return Digest 哈希值
     */
    public String getDigest() {
        return this.Digest;
    }

    /**
     * Set 哈希值
     * @param Digest 哈希值
     */
    public void setDigest(String Digest) {
        this.Digest = Digest;
    }

    /**
     * Get 镜像体积（单位：字节） 
     * @return Size 镜像体积（单位：字节）
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 镜像体积（单位：字节）
     * @param Size 镜像体积（单位：字节）
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get Tag名称 
     * @return ImageVersion Tag名称
     */
    public String getImageVersion() {
        return this.ImageVersion;
    }

    /**
     * Set Tag名称
     * @param ImageVersion Tag名称
     */
    public void setImageVersion(String ImageVersion) {
        this.ImageVersion = ImageVersion;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 制品类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Kind 制品类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKind() {
        return this.Kind;
    }

    /**
     * Set 制品类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kind 制品类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    /**
     * Get KMS 签名信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return KmsSignature KMS 签名信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKmsSignature() {
        return this.KmsSignature;
    }

    /**
     * Set KMS 签名信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param KmsSignature KMS 签名信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKmsSignature(String KmsSignature) {
        this.KmsSignature = KmsSignature;
    }

    public TcrImageInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TcrImageInfo(TcrImageInfo source) {
        if (source.Digest != null) {
            this.Digest = new String(source.Digest);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.ImageVersion != null) {
            this.ImageVersion = new String(source.ImageVersion);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Kind != null) {
            this.Kind = new String(source.Kind);
        }
        if (source.KmsSignature != null) {
            this.KmsSignature = new String(source.KmsSignature);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Digest", this.Digest);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "ImageVersion", this.ImageVersion);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Kind", this.Kind);
        this.setParamSimple(map, prefix + "KmsSignature", this.KmsSignature);

    }
}

