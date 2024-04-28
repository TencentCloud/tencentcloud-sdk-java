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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageCredentialResponse extends AbstractModel {

    /**
    * 密钥信息
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * 失效时间
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * 开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 对象存储桶
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * 对象存储可用区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 文件存储目录
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * 存储类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 主号
    */
    @SerializedName("CorpUin")
    @Expose
    private String CorpUin;

    /**
    * 图片存储目录
    */
    @SerializedName("ImagePath")
    @Expose
    private String ImagePath;

    /**
    * 上传存储目录
    */
    @SerializedName("UploadPath")
    @Expose
    private String UploadPath;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 密钥信息 
     * @return Credentials 密钥信息
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set 密钥信息
     * @param Credentials 密钥信息
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get 失效时间 
     * @return ExpiredTime 失效时间
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set 失效时间
     * @param ExpiredTime 失效时间
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get 开始时间 
     * @return StartTime 开始时间
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 开始时间
     * @param StartTime 开始时间
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 对象存储桶 
     * @return Bucket 对象存储桶
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set 对象存储桶
     * @param Bucket 对象存储桶
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get 对象存储可用区 
     * @return Region 对象存储可用区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 对象存储可用区
     * @param Region 对象存储可用区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 文件存储目录 
     * @return FilePath 文件存储目录
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set 文件存储目录
     * @param FilePath 文件存储目录
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get 存储类型 
     * @return Type 存储类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 存储类型
     * @param Type 存储类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 主号 
     * @return CorpUin 主号
     */
    public String getCorpUin() {
        return this.CorpUin;
    }

    /**
     * Set 主号
     * @param CorpUin 主号
     */
    public void setCorpUin(String CorpUin) {
        this.CorpUin = CorpUin;
    }

    /**
     * Get 图片存储目录 
     * @return ImagePath 图片存储目录
     */
    public String getImagePath() {
        return this.ImagePath;
    }

    /**
     * Set 图片存储目录
     * @param ImagePath 图片存储目录
     */
    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }

    /**
     * Get 上传存储目录 
     * @return UploadPath 上传存储目录
     */
    public String getUploadPath() {
        return this.UploadPath;
    }

    /**
     * Set 上传存储目录
     * @param UploadPath 上传存储目录
     */
    public void setUploadPath(String UploadPath) {
        this.UploadPath = UploadPath;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeStorageCredentialResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStorageCredentialResponse(DescribeStorageCredentialResponse source) {
        if (source.Credentials != null) {
            this.Credentials = new Credentials(source.Credentials);
        }
        if (source.ExpiredTime != null) {
            this.ExpiredTime = new Long(source.ExpiredTime);
        }
        if (source.StartTime != null) {
            this.StartTime = new Long(source.StartTime);
        }
        if (source.Bucket != null) {
            this.Bucket = new String(source.Bucket);
        }
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.FilePath != null) {
            this.FilePath = new String(source.FilePath);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CorpUin != null) {
            this.CorpUin = new String(source.CorpUin);
        }
        if (source.ImagePath != null) {
            this.ImagePath = new String(source.ImagePath);
        }
        if (source.UploadPath != null) {
            this.UploadPath = new String(source.UploadPath);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Credentials.", this.Credentials);
        this.setParamSimple(map, prefix + "ExpiredTime", this.ExpiredTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "Bucket", this.Bucket);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "FilePath", this.FilePath);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CorpUin", this.CorpUin);
        this.setParamSimple(map, prefix + "ImagePath", this.ImagePath);
        this.setParamSimple(map, prefix + "UploadPath", this.UploadPath);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

