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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCloudBaseBuildServiceResponse extends AbstractModel{

    /**
    * 上传url
    */
    @SerializedName("UploadUrl")
    @Expose
    private String UploadUrl;

    /**
    * heder
    */
    @SerializedName("UploadHeaders")
    @Expose
    private KVPair [] UploadHeaders;

    /**
    * 包名
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * 包版本
    */
    @SerializedName("PackageVersion")
    @Expose
    private String PackageVersion;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 上传url 
     * @return UploadUrl 上传url
     */
    public String getUploadUrl() {
        return this.UploadUrl;
    }

    /**
     * Set 上传url
     * @param UploadUrl 上传url
     */
    public void setUploadUrl(String UploadUrl) {
        this.UploadUrl = UploadUrl;
    }

    /**
     * Get heder 
     * @return UploadHeaders heder
     */
    public KVPair [] getUploadHeaders() {
        return this.UploadHeaders;
    }

    /**
     * Set heder
     * @param UploadHeaders heder
     */
    public void setUploadHeaders(KVPair [] UploadHeaders) {
        this.UploadHeaders = UploadHeaders;
    }

    /**
     * Get 包名 
     * @return PackageName 包名
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set 包名
     * @param PackageName 包名
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get 包版本 
     * @return PackageVersion 包版本
     */
    public String getPackageVersion() {
        return this.PackageVersion;
    }

    /**
     * Set 包版本
     * @param PackageVersion 包版本
     */
    public void setPackageVersion(String PackageVersion) {
        this.PackageVersion = PackageVersion;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadUrl", this.UploadUrl);
        this.setParamArrayObj(map, prefix + "UploadHeaders.", this.UploadHeaders);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "PackageVersion", this.PackageVersion);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

