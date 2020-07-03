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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImportImageOsResponse extends AbstractModel{

    /**
    * 支持的导入镜像的操作系统类型。
    */
    @SerializedName("ImportImageOsListSupported")
    @Expose
    private ImageOsList ImportImageOsListSupported;

    /**
    * 支持的导入镜像的操作系统版本。
    */
    @SerializedName("ImportImageOsVersionSet")
    @Expose
    private OsVersion [] ImportImageOsVersionSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 支持的导入镜像的操作系统类型。 
     * @return ImportImageOsListSupported 支持的导入镜像的操作系统类型。
     */
    public ImageOsList getImportImageOsListSupported() {
        return this.ImportImageOsListSupported;
    }

    /**
     * Set 支持的导入镜像的操作系统类型。
     * @param ImportImageOsListSupported 支持的导入镜像的操作系统类型。
     */
    public void setImportImageOsListSupported(ImageOsList ImportImageOsListSupported) {
        this.ImportImageOsListSupported = ImportImageOsListSupported;
    }

    /**
     * Get 支持的导入镜像的操作系统版本。 
     * @return ImportImageOsVersionSet 支持的导入镜像的操作系统版本。
     */
    public OsVersion [] getImportImageOsVersionSet() {
        return this.ImportImageOsVersionSet;
    }

    /**
     * Set 支持的导入镜像的操作系统版本。
     * @param ImportImageOsVersionSet 支持的导入镜像的操作系统版本。
     */
    public void setImportImageOsVersionSet(OsVersion [] ImportImageOsVersionSet) {
        this.ImportImageOsVersionSet = ImportImageOsVersionSet;
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
        this.setParamObj(map, prefix + "ImportImageOsListSupported.", this.ImportImageOsListSupported);
        this.setParamArrayObj(map, prefix + "ImportImageOsVersionSet.", this.ImportImageOsVersionSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

