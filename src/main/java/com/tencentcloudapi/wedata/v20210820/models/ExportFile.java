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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportFile extends AbstractModel {

    /**
    * cos文件路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosPath")
    @Expose
    private String CosPath;

    /**
    * 桶名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CosBucketName")
    @Expose
    private String CosBucketName;

    /**
    * 地域
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 前端下载token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * secretId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * secretKey
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * 创建时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreateTime")
    @Expose
    private Long CreateTime;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
     * Get cos文件路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosPath cos文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosPath() {
        return this.CosPath;
    }

    /**
     * Set cos文件路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosPath cos文件路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosPath(String CosPath) {
        this.CosPath = CosPath;
    }

    /**
     * Get 桶名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CosBucketName 桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCosBucketName() {
        return this.CosBucketName;
    }

    /**
     * Set 桶名
注意：此字段可能返回 null，表示取不到有效值。
     * @param CosBucketName 桶名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCosBucketName(String CosBucketName) {
        this.CosBucketName = CosBucketName;
    }

    /**
     * Get 地域
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 地域
注意：此字段可能返回 null，表示取不到有效值。
     * @param Region 地域
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 前端下载token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token 前端下载token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 前端下载token
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token 前端下载token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get secretId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretId secretId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set secretId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretId secretId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get secretKey
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey secretKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set secretKey
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey secretKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get 创建时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreateTime 创建时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreateTime(Long CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpiredTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    public ExportFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportFile(ExportFile source) {
        if (source.CosPath != null) {
            this.CosPath = new String(source.CosPath);
        }
        if (source.CosBucketName != null) {
            this.CosBucketName = new String(source.CosBucketName);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new Long(source.CreateTime);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CosPath", this.CosPath);
        this.setParamSimple(map, prefix + "CosBucketName", this.CosBucketName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);

    }
}

