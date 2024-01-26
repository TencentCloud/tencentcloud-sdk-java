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

public class ShareStorageFileDTO extends AbstractModel {

    /**
    * 共享存储访问 Token，公有云里面为 Cos 访问 Token
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Token")
    @Expose
    private String Token;

    /**
    * 共享存储访问 SecretId，公有云里面为 Cos 访问 SecretId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretId")
    @Expose
    private String SecretId;

    /**
    * 共享存储访问 SecretKey，公有云里面为 Cos 访问 SecretKey
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SecretKey")
    @Expose
    private String SecretKey;

    /**
    * Token 过期时间，时间戳类型，精确到秒，如果是 -1 则表示没有过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenExpiredTime")
    @Expose
    private Long TokenExpiredTime;

    /**
    * Token 创建时间，时间戳类型，精确到秒
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TokenCreateTime")
    @Expose
    private Long TokenCreateTime;

    /**
    * 共享存储类型，公有云为 COS，私有化为 CSP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareStorageType")
    @Expose
    private String ShareStorageType;

    /**
    * 共享存储 EndPoint，公有云可以不使用该值，私有化需要使用该值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ShareStorageEndPoint")
    @Expose
    private String ShareStorageEndPoint;

    /**
    * 存储桶 Region
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketRegion")
    @Expose
    private String BucketRegion;

    /**
    * 存储桶名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BucketName")
    @Expose
    private String BucketName;

    /**
    * 文件映射，导入文件时，可能会存在文件名冲突，WeData 后端会自动校验，如果出现冲突，会基于传入的名称生成新的名称，文件上传到共享存储时请使用新生成的文件名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileMappings")
    @Expose
    private ShareStorageFileMappingDTO [] FileMappings;

    /**
    * 文件过期时间，公有云中，默认的过期时间为 15 天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FileExpireTime")
    @Expose
    private Long FileExpireTime;

    /**
     * Get 共享存储访问 Token，公有云里面为 Cos 访问 Token
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Token 共享存储访问 Token，公有云里面为 Cos 访问 Token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getToken() {
        return this.Token;
    }

    /**
     * Set 共享存储访问 Token，公有云里面为 Cos 访问 Token
注意：此字段可能返回 null，表示取不到有效值。
     * @param Token 共享存储访问 Token，公有云里面为 Cos 访问 Token
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setToken(String Token) {
        this.Token = Token;
    }

    /**
     * Get 共享存储访问 SecretId，公有云里面为 Cos 访问 SecretId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretId 共享存储访问 SecretId，公有云里面为 Cos 访问 SecretId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretId() {
        return this.SecretId;
    }

    /**
     * Set 共享存储访问 SecretId，公有云里面为 Cos 访问 SecretId
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretId 共享存储访问 SecretId，公有云里面为 Cos 访问 SecretId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretId(String SecretId) {
        this.SecretId = SecretId;
    }

    /**
     * Get 共享存储访问 SecretKey，公有云里面为 Cos 访问 SecretKey
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SecretKey 共享存储访问 SecretKey，公有云里面为 Cos 访问 SecretKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSecretKey() {
        return this.SecretKey;
    }

    /**
     * Set 共享存储访问 SecretKey，公有云里面为 Cos 访问 SecretKey
注意：此字段可能返回 null，表示取不到有效值。
     * @param SecretKey 共享存储访问 SecretKey，公有云里面为 Cos 访问 SecretKey
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSecretKey(String SecretKey) {
        this.SecretKey = SecretKey;
    }

    /**
     * Get Token 过期时间，时间戳类型，精确到秒，如果是 -1 则表示没有过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenExpiredTime Token 过期时间，时间戳类型，精确到秒，如果是 -1 则表示没有过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTokenExpiredTime() {
        return this.TokenExpiredTime;
    }

    /**
     * Set Token 过期时间，时间戳类型，精确到秒，如果是 -1 则表示没有过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenExpiredTime Token 过期时间，时间戳类型，精确到秒，如果是 -1 则表示没有过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenExpiredTime(Long TokenExpiredTime) {
        this.TokenExpiredTime = TokenExpiredTime;
    }

    /**
     * Get Token 创建时间，时间戳类型，精确到秒
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TokenCreateTime Token 创建时间，时间戳类型，精确到秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTokenCreateTime() {
        return this.TokenCreateTime;
    }

    /**
     * Set Token 创建时间，时间戳类型，精确到秒
注意：此字段可能返回 null，表示取不到有效值。
     * @param TokenCreateTime Token 创建时间，时间戳类型，精确到秒
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTokenCreateTime(Long TokenCreateTime) {
        this.TokenCreateTime = TokenCreateTime;
    }

    /**
     * Get 共享存储类型，公有云为 COS，私有化为 CSP
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareStorageType 共享存储类型，公有云为 COS，私有化为 CSP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShareStorageType() {
        return this.ShareStorageType;
    }

    /**
     * Set 共享存储类型，公有云为 COS，私有化为 CSP
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareStorageType 共享存储类型，公有云为 COS，私有化为 CSP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareStorageType(String ShareStorageType) {
        this.ShareStorageType = ShareStorageType;
    }

    /**
     * Get 共享存储 EndPoint，公有云可以不使用该值，私有化需要使用该值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ShareStorageEndPoint 共享存储 EndPoint，公有云可以不使用该值，私有化需要使用该值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getShareStorageEndPoint() {
        return this.ShareStorageEndPoint;
    }

    /**
     * Set 共享存储 EndPoint，公有云可以不使用该值，私有化需要使用该值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ShareStorageEndPoint 共享存储 EndPoint，公有云可以不使用该值，私有化需要使用该值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setShareStorageEndPoint(String ShareStorageEndPoint) {
        this.ShareStorageEndPoint = ShareStorageEndPoint;
    }

    /**
     * Get 存储桶 Region
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketRegion 存储桶 Region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketRegion() {
        return this.BucketRegion;
    }

    /**
     * Set 存储桶 Region
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketRegion 存储桶 Region
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketRegion(String BucketRegion) {
        this.BucketRegion = BucketRegion;
    }

    /**
     * Get 存储桶名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BucketName 存储桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBucketName() {
        return this.BucketName;
    }

    /**
     * Set 存储桶名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param BucketName 存储桶名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBucketName(String BucketName) {
        this.BucketName = BucketName;
    }

    /**
     * Get 文件映射，导入文件时，可能会存在文件名冲突，WeData 后端会自动校验，如果出现冲突，会基于传入的名称生成新的名称，文件上传到共享存储时请使用新生成的文件名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileMappings 文件映射，导入文件时，可能会存在文件名冲突，WeData 后端会自动校验，如果出现冲突，会基于传入的名称生成新的名称，文件上传到共享存储时请使用新生成的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ShareStorageFileMappingDTO [] getFileMappings() {
        return this.FileMappings;
    }

    /**
     * Set 文件映射，导入文件时，可能会存在文件名冲突，WeData 后端会自动校验，如果出现冲突，会基于传入的名称生成新的名称，文件上传到共享存储时请使用新生成的文件名
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileMappings 文件映射，导入文件时，可能会存在文件名冲突，WeData 后端会自动校验，如果出现冲突，会基于传入的名称生成新的名称，文件上传到共享存储时请使用新生成的文件名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileMappings(ShareStorageFileMappingDTO [] FileMappings) {
        this.FileMappings = FileMappings;
    }

    /**
     * Get 文件过期时间，公有云中，默认的过期时间为 15 天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FileExpireTime 文件过期时间，公有云中，默认的过期时间为 15 天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFileExpireTime() {
        return this.FileExpireTime;
    }

    /**
     * Set 文件过期时间，公有云中，默认的过期时间为 15 天
注意：此字段可能返回 null，表示取不到有效值。
     * @param FileExpireTime 文件过期时间，公有云中，默认的过期时间为 15 天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFileExpireTime(Long FileExpireTime) {
        this.FileExpireTime = FileExpireTime;
    }

    public ShareStorageFileDTO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ShareStorageFileDTO(ShareStorageFileDTO source) {
        if (source.Token != null) {
            this.Token = new String(source.Token);
        }
        if (source.SecretId != null) {
            this.SecretId = new String(source.SecretId);
        }
        if (source.SecretKey != null) {
            this.SecretKey = new String(source.SecretKey);
        }
        if (source.TokenExpiredTime != null) {
            this.TokenExpiredTime = new Long(source.TokenExpiredTime);
        }
        if (source.TokenCreateTime != null) {
            this.TokenCreateTime = new Long(source.TokenCreateTime);
        }
        if (source.ShareStorageType != null) {
            this.ShareStorageType = new String(source.ShareStorageType);
        }
        if (source.ShareStorageEndPoint != null) {
            this.ShareStorageEndPoint = new String(source.ShareStorageEndPoint);
        }
        if (source.BucketRegion != null) {
            this.BucketRegion = new String(source.BucketRegion);
        }
        if (source.BucketName != null) {
            this.BucketName = new String(source.BucketName);
        }
        if (source.FileMappings != null) {
            this.FileMappings = new ShareStorageFileMappingDTO[source.FileMappings.length];
            for (int i = 0; i < source.FileMappings.length; i++) {
                this.FileMappings[i] = new ShareStorageFileMappingDTO(source.FileMappings[i]);
            }
        }
        if (source.FileExpireTime != null) {
            this.FileExpireTime = new Long(source.FileExpireTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Token", this.Token);
        this.setParamSimple(map, prefix + "SecretId", this.SecretId);
        this.setParamSimple(map, prefix + "SecretKey", this.SecretKey);
        this.setParamSimple(map, prefix + "TokenExpiredTime", this.TokenExpiredTime);
        this.setParamSimple(map, prefix + "TokenCreateTime", this.TokenCreateTime);
        this.setParamSimple(map, prefix + "ShareStorageType", this.ShareStorageType);
        this.setParamSimple(map, prefix + "ShareStorageEndPoint", this.ShareStorageEndPoint);
        this.setParamSimple(map, prefix + "BucketRegion", this.BucketRegion);
        this.setParamSimple(map, prefix + "BucketName", this.BucketName);
        this.setParamArrayObj(map, prefix + "FileMappings.", this.FileMappings);
        this.setParamSimple(map, prefix + "FileExpireTime", this.FileExpireTime);

    }
}

