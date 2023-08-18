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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class S3OutputStorage extends AbstractModel{

    /**
    * S3 bucket。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3Bucket")
    @Expose
    private String S3Bucket;

    /**
    * S3 bucket 对应的区域。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3Region")
    @Expose
    private String S3Region;

    /**
    * AWS 内网上传 媒体资源的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3SecretId")
    @Expose
    private String S3SecretId;

    /**
    * AWS 内网上传 媒体资源的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("S3SecretKey")
    @Expose
    private String S3SecretKey;

    /**
     * Get S3 bucket。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3Bucket S3 bucket。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getS3Bucket() {
        return this.S3Bucket;
    }

    /**
     * Set S3 bucket。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3Bucket S3 bucket。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3Bucket(String S3Bucket) {
        this.S3Bucket = S3Bucket;
    }

    /**
     * Get S3 bucket 对应的区域。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3Region S3 bucket 对应的区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getS3Region() {
        return this.S3Region;
    }

    /**
     * Set S3 bucket 对应的区域。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3Region S3 bucket 对应的区域。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3Region(String S3Region) {
        this.S3Region = S3Region;
    }

    /**
     * Get AWS 内网上传 媒体资源的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3SecretId AWS 内网上传 媒体资源的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getS3SecretId() {
        return this.S3SecretId;
    }

    /**
     * Set AWS 内网上传 媒体资源的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3SecretId AWS 内网上传 媒体资源的秘钥id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3SecretId(String S3SecretId) {
        this.S3SecretId = S3SecretId;
    }

    /**
     * Get AWS 内网上传 媒体资源的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return S3SecretKey AWS 内网上传 媒体资源的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getS3SecretKey() {
        return this.S3SecretKey;
    }

    /**
     * Set AWS 内网上传 媒体资源的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。
     * @param S3SecretKey AWS 内网上传 媒体资源的秘钥key。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setS3SecretKey(String S3SecretKey) {
        this.S3SecretKey = S3SecretKey;
    }

    public S3OutputStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public S3OutputStorage(S3OutputStorage source) {
        if (source.S3Bucket != null) {
            this.S3Bucket = new String(source.S3Bucket);
        }
        if (source.S3Region != null) {
            this.S3Region = new String(source.S3Region);
        }
        if (source.S3SecretId != null) {
            this.S3SecretId = new String(source.S3SecretId);
        }
        if (source.S3SecretKey != null) {
            this.S3SecretKey = new String(source.S3SecretKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "S3Bucket", this.S3Bucket);
        this.setParamSimple(map, prefix + "S3Region", this.S3Region);
        this.setParamSimple(map, prefix + "S3SecretId", this.S3SecretId);
        this.setParamSimple(map, prefix + "S3SecretKey", this.S3SecretKey);

    }
}

