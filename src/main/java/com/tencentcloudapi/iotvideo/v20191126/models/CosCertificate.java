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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosCertificate extends AbstractModel {

    /**
    * cos存储桶
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageBucket")
    @Expose
    private String StorageBucket;

    /**
    * cos存储园区
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 存储路径，录制场景下该值为存储目录
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * 证书信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TempCertificate")
    @Expose
    private CertificateInfo TempCertificate;

    /**
    * SessionKey
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SessionKey")
    @Expose
    private String SessionKey;

    /**
     * Get cos存储桶
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageBucket cos存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageBucket() {
        return this.StorageBucket;
    }

    /**
     * Set cos存储桶
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageBucket cos存储桶
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageBucket(String StorageBucket) {
        this.StorageBucket = StorageBucket;
    }

    /**
     * Get cos存储园区
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StorageRegion cos存储园区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set cos存储园区
注意：此字段可能返回 null，表示取不到有效值。
     * @param StorageRegion cos存储园区
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 存储路径，录制场景下该值为存储目录
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StoragePath 存储路径，录制场景下该值为存储目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set 存储路径，录制场景下该值为存储目录
注意：此字段可能返回 null，表示取不到有效值。
     * @param StoragePath 存储路径，录制场景下该值为存储目录
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get 证书信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TempCertificate 证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CertificateInfo getTempCertificate() {
        return this.TempCertificate;
    }

    /**
     * Set 证书信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param TempCertificate 证书信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTempCertificate(CertificateInfo TempCertificate) {
        this.TempCertificate = TempCertificate;
    }

    /**
     * Get SessionKey
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SessionKey SessionKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSessionKey() {
        return this.SessionKey;
    }

    /**
     * Set SessionKey
注意：此字段可能返回 null，表示取不到有效值。
     * @param SessionKey SessionKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSessionKey(String SessionKey) {
        this.SessionKey = SessionKey;
    }

    public CosCertificate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosCertificate(CosCertificate source) {
        if (source.StorageBucket != null) {
            this.StorageBucket = new String(source.StorageBucket);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
        if (source.TempCertificate != null) {
            this.TempCertificate = new CertificateInfo(source.TempCertificate);
        }
        if (source.SessionKey != null) {
            this.SessionKey = new String(source.SessionKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageBucket", this.StorageBucket);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);
        this.setParamObj(map, prefix + "TempCertificate.", this.TempCertificate);
        this.setParamSimple(map, prefix + "SessionKey", this.SessionKey);

    }
}

