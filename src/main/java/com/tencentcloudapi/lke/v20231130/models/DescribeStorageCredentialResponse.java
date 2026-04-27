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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStorageCredentialResponse extends AbstractModel {

    /**
    * <p>密钥信息</p>
    */
    @SerializedName("Credentials")
    @Expose
    private Credentials Credentials;

    /**
    * <p>失效时间，为 Unix 时间戳</p><p>单位：秒</p>
    */
    @SerializedName("ExpiredTime")
    @Expose
    private Long ExpiredTime;

    /**
    * <p>开始时间，为 Unix 时间戳</p><p>单位：秒</p>
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * <p>对象存储桶</p>
    */
    @SerializedName("Bucket")
    @Expose
    private String Bucket;

    /**
    * <p>对象存储可用区</p>
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * <p>文件存储目录</p>
    */
    @SerializedName("FilePath")
    @Expose
    private String FilePath;

    /**
    * <p>存储类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>企业主账号</p>
    */
    @SerializedName("CorpUin")
    @Expose
    private String CorpUin;

    /**
    * <p>图片存储目录</p>
    */
    @SerializedName("ImagePath")
    @Expose
    private String ImagePath;

    /**
    * <p>上传存储路径，到具体文件</p>
    */
    @SerializedName("UploadPath")
    @Expose
    private String UploadPath;

    /**
    * <p>文件上传地址，使用put请求上传文件到该地址</p>
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * <p>文件的预签名地址，支持下载</p>
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>密钥信息</p> 
     * @return Credentials <p>密钥信息</p>
     */
    public Credentials getCredentials() {
        return this.Credentials;
    }

    /**
     * Set <p>密钥信息</p>
     * @param Credentials <p>密钥信息</p>
     */
    public void setCredentials(Credentials Credentials) {
        this.Credentials = Credentials;
    }

    /**
     * Get <p>失效时间，为 Unix 时间戳</p><p>单位：秒</p> 
     * @return ExpiredTime <p>失效时间，为 Unix 时间戳</p><p>单位：秒</p>
     */
    public Long getExpiredTime() {
        return this.ExpiredTime;
    }

    /**
     * Set <p>失效时间，为 Unix 时间戳</p><p>单位：秒</p>
     * @param ExpiredTime <p>失效时间，为 Unix 时间戳</p><p>单位：秒</p>
     */
    public void setExpiredTime(Long ExpiredTime) {
        this.ExpiredTime = ExpiredTime;
    }

    /**
     * Get <p>开始时间，为 Unix 时间戳</p><p>单位：秒</p> 
     * @return StartTime <p>开始时间，为 Unix 时间戳</p><p>单位：秒</p>
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set <p>开始时间，为 Unix 时间戳</p><p>单位：秒</p>
     * @param StartTime <p>开始时间，为 Unix 时间戳</p><p>单位：秒</p>
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get <p>对象存储桶</p> 
     * @return Bucket <p>对象存储桶</p>
     */
    public String getBucket() {
        return this.Bucket;
    }

    /**
     * Set <p>对象存储桶</p>
     * @param Bucket <p>对象存储桶</p>
     */
    public void setBucket(String Bucket) {
        this.Bucket = Bucket;
    }

    /**
     * Get <p>对象存储可用区</p> 
     * @return Region <p>对象存储可用区</p>
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set <p>对象存储可用区</p>
     * @param Region <p>对象存储可用区</p>
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get <p>文件存储目录</p> 
     * @return FilePath <p>文件存储目录</p>
     */
    public String getFilePath() {
        return this.FilePath;
    }

    /**
     * Set <p>文件存储目录</p>
     * @param FilePath <p>文件存储目录</p>
     */
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }

    /**
     * Get <p>存储类型</p> 
     * @return Type <p>存储类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>存储类型</p>
     * @param Type <p>存储类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>企业主账号</p> 
     * @return CorpUin <p>企业主账号</p>
     */
    public String getCorpUin() {
        return this.CorpUin;
    }

    /**
     * Set <p>企业主账号</p>
     * @param CorpUin <p>企业主账号</p>
     */
    public void setCorpUin(String CorpUin) {
        this.CorpUin = CorpUin;
    }

    /**
     * Get <p>图片存储目录</p> 
     * @return ImagePath <p>图片存储目录</p>
     */
    public String getImagePath() {
        return this.ImagePath;
    }

    /**
     * Set <p>图片存储目录</p>
     * @param ImagePath <p>图片存储目录</p>
     */
    public void setImagePath(String ImagePath) {
        this.ImagePath = ImagePath;
    }

    /**
     * Get <p>上传存储路径，到具体文件</p> 
     * @return UploadPath <p>上传存储路径，到具体文件</p>
     */
    public String getUploadPath() {
        return this.UploadPath;
    }

    /**
     * Set <p>上传存储路径，到具体文件</p>
     * @param UploadPath <p>上传存储路径，到具体文件</p>
     */
    public void setUploadPath(String UploadPath) {
        this.UploadPath = UploadPath;
    }

    /**
     * Get <p>文件上传地址，使用put请求上传文件到该地址</p> 
     * @return UploadUrl <p>文件上传地址，使用put请求上传文件到该地址</p>
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set <p>文件上传地址，使用put请求上传文件到该地址</p>
     * @param UploadUrl <p>文件上传地址，使用put请求上传文件到该地址</p>
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
    }

    /**
     * Get <p>文件的预签名地址，支持下载</p> 
     * @return FileUrl <p>文件的预签名地址，支持下载</p>
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set <p>文件的预签名地址，支持下载</p>
     * @param FileUrl <p>文件的预签名地址，支持下载</p>
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
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
        if (source.UploadUrl != null) {
            this.UploadUrl = new String(source.UploadUrl);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
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
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

