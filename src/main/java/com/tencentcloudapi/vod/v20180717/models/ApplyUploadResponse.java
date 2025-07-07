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

public class ApplyUploadResponse extends AbstractModel {

    /**
    * 存储桶，用于上传接口 URL 的 bucket_name。
    */
    @SerializedName("StorageBucket")
    @Expose
    private String StorageBucket;

    /**
    * 存储园区，用于上传接口 Host 的 Region。
    */
    @SerializedName("StorageRegion")
    @Expose
    private String StorageRegion;

    /**
    * 点播会话，用于确认上传接口的参数 VodSessionKey。
    */
    @SerializedName("VodSessionKey")
    @Expose
    private String VodSessionKey;

    /**
    * 媒体存储路径，用于上传接口存储媒体的对象键（Key）。
    */
    @SerializedName("MediaStoragePath")
    @Expose
    private String MediaStoragePath;

    /**
    * 封面存储路径，用于上传接口存储封面的对象键（Key）。
    */
    @SerializedName("CoverStoragePath")
    @Expose
    private String CoverStoragePath;

    /**
    * 临时凭证，用于上传接口的权限验证。
    */
    @SerializedName("TempCertificate")
    @Expose
    private TempCertificate TempCertificate;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 存储桶，用于上传接口 URL 的 bucket_name。 
     * @return StorageBucket 存储桶，用于上传接口 URL 的 bucket_name。
     */
    public String getStorageBucket() {
        return this.StorageBucket;
    }

    /**
     * Set 存储桶，用于上传接口 URL 的 bucket_name。
     * @param StorageBucket 存储桶，用于上传接口 URL 的 bucket_name。
     */
    public void setStorageBucket(String StorageBucket) {
        this.StorageBucket = StorageBucket;
    }

    /**
     * Get 存储园区，用于上传接口 Host 的 Region。 
     * @return StorageRegion 存储园区，用于上传接口 Host 的 Region。
     */
    public String getStorageRegion() {
        return this.StorageRegion;
    }

    /**
     * Set 存储园区，用于上传接口 Host 的 Region。
     * @param StorageRegion 存储园区，用于上传接口 Host 的 Region。
     */
    public void setStorageRegion(String StorageRegion) {
        this.StorageRegion = StorageRegion;
    }

    /**
     * Get 点播会话，用于确认上传接口的参数 VodSessionKey。 
     * @return VodSessionKey 点播会话，用于确认上传接口的参数 VodSessionKey。
     */
    public String getVodSessionKey() {
        return this.VodSessionKey;
    }

    /**
     * Set 点播会话，用于确认上传接口的参数 VodSessionKey。
     * @param VodSessionKey 点播会话，用于确认上传接口的参数 VodSessionKey。
     */
    public void setVodSessionKey(String VodSessionKey) {
        this.VodSessionKey = VodSessionKey;
    }

    /**
     * Get 媒体存储路径，用于上传接口存储媒体的对象键（Key）。 
     * @return MediaStoragePath 媒体存储路径，用于上传接口存储媒体的对象键（Key）。
     */
    public String getMediaStoragePath() {
        return this.MediaStoragePath;
    }

    /**
     * Set 媒体存储路径，用于上传接口存储媒体的对象键（Key）。
     * @param MediaStoragePath 媒体存储路径，用于上传接口存储媒体的对象键（Key）。
     */
    public void setMediaStoragePath(String MediaStoragePath) {
        this.MediaStoragePath = MediaStoragePath;
    }

    /**
     * Get 封面存储路径，用于上传接口存储封面的对象键（Key）。 
     * @return CoverStoragePath 封面存储路径，用于上传接口存储封面的对象键（Key）。
     */
    public String getCoverStoragePath() {
        return this.CoverStoragePath;
    }

    /**
     * Set 封面存储路径，用于上传接口存储封面的对象键（Key）。
     * @param CoverStoragePath 封面存储路径，用于上传接口存储封面的对象键（Key）。
     */
    public void setCoverStoragePath(String CoverStoragePath) {
        this.CoverStoragePath = CoverStoragePath;
    }

    /**
     * Get 临时凭证，用于上传接口的权限验证。 
     * @return TempCertificate 临时凭证，用于上传接口的权限验证。
     */
    public TempCertificate getTempCertificate() {
        return this.TempCertificate;
    }

    /**
     * Set 临时凭证，用于上传接口的权限验证。
     * @param TempCertificate 临时凭证，用于上传接口的权限验证。
     */
    public void setTempCertificate(TempCertificate TempCertificate) {
        this.TempCertificate = TempCertificate;
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

    public ApplyUploadResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyUploadResponse(ApplyUploadResponse source) {
        if (source.StorageBucket != null) {
            this.StorageBucket = new String(source.StorageBucket);
        }
        if (source.StorageRegion != null) {
            this.StorageRegion = new String(source.StorageRegion);
        }
        if (source.VodSessionKey != null) {
            this.VodSessionKey = new String(source.VodSessionKey);
        }
        if (source.MediaStoragePath != null) {
            this.MediaStoragePath = new String(source.MediaStoragePath);
        }
        if (source.CoverStoragePath != null) {
            this.CoverStoragePath = new String(source.CoverStoragePath);
        }
        if (source.TempCertificate != null) {
            this.TempCertificate = new TempCertificate(source.TempCertificate);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageBucket", this.StorageBucket);
        this.setParamSimple(map, prefix + "StorageRegion", this.StorageRegion);
        this.setParamSimple(map, prefix + "VodSessionKey", this.VodSessionKey);
        this.setParamSimple(map, prefix + "MediaStoragePath", this.MediaStoragePath);
        this.setParamSimple(map, prefix + "CoverStoragePath", this.CoverStoragePath);
        this.setParamObj(map, prefix + "TempCertificate.", this.TempCertificate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

