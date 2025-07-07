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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateDLPFileDetectionTaskRequest extends AbstractModel {

    /**
    * 文件下载链接，要求公网可访问，GET方式访问后为文件
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 文件名，带后缀
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    *  文件md5，传入相同md5会直接使用之前缓存的结果。

> 请注意：不同文件使用相同md5送检，会命中缓存得到旧的检测结果
    */
    @SerializedName("FileMd5")
    @Expose
    private String FileMd5;

    /**
    * 管理域实例ID，用于CAM管理域权限分配
    */
    @SerializedName("DomainInstanceId")
    @Expose
    private String DomainInstanceId;

    /**
    * 回调地址，暂时未使用
    */
    @SerializedName("CallBackUrl")
    @Expose
    private String CallBackUrl;

    /**
     * Get 文件下载链接，要求公网可访问，GET方式访问后为文件 
     * @return Url 文件下载链接，要求公网可访问，GET方式访问后为文件
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文件下载链接，要求公网可访问，GET方式访问后为文件
     * @param Url 文件下载链接，要求公网可访问，GET方式访问后为文件
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 文件名，带后缀 
     * @return FileName 文件名，带后缀
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名，带后缀
     * @param FileName 文件名，带后缀
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get  文件md5，传入相同md5会直接使用之前缓存的结果。

> 请注意：不同文件使用相同md5送检，会命中缓存得到旧的检测结果 
     * @return FileMd5  文件md5，传入相同md5会直接使用之前缓存的结果。

> 请注意：不同文件使用相同md5送检，会命中缓存得到旧的检测结果
     */
    public String getFileMd5() {
        return this.FileMd5;
    }

    /**
     * Set  文件md5，传入相同md5会直接使用之前缓存的结果。

> 请注意：不同文件使用相同md5送检，会命中缓存得到旧的检测结果
     * @param FileMd5  文件md5，传入相同md5会直接使用之前缓存的结果。

> 请注意：不同文件使用相同md5送检，会命中缓存得到旧的检测结果
     */
    public void setFileMd5(String FileMd5) {
        this.FileMd5 = FileMd5;
    }

    /**
     * Get 管理域实例ID，用于CAM管理域权限分配 
     * @return DomainInstanceId 管理域实例ID，用于CAM管理域权限分配
     */
    public String getDomainInstanceId() {
        return this.DomainInstanceId;
    }

    /**
     * Set 管理域实例ID，用于CAM管理域权限分配
     * @param DomainInstanceId 管理域实例ID，用于CAM管理域权限分配
     */
    public void setDomainInstanceId(String DomainInstanceId) {
        this.DomainInstanceId = DomainInstanceId;
    }

    /**
     * Get 回调地址，暂时未使用 
     * @return CallBackUrl 回调地址，暂时未使用
     */
    public String getCallBackUrl() {
        return this.CallBackUrl;
    }

    /**
     * Set 回调地址，暂时未使用
     * @param CallBackUrl 回调地址，暂时未使用
     */
    public void setCallBackUrl(String CallBackUrl) {
        this.CallBackUrl = CallBackUrl;
    }

    public CreateDLPFileDetectionTaskRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateDLPFileDetectionTaskRequest(CreateDLPFileDetectionTaskRequest source) {
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileMd5 != null) {
            this.FileMd5 = new String(source.FileMd5);
        }
        if (source.DomainInstanceId != null) {
            this.DomainInstanceId = new String(source.DomainInstanceId);
        }
        if (source.CallBackUrl != null) {
            this.CallBackUrl = new String(source.CallBackUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileMd5", this.FileMd5);
        this.setParamSimple(map, prefix + "DomainInstanceId", this.DomainInstanceId);
        this.setParamSimple(map, prefix + "CallBackUrl", this.CallBackUrl);

    }
}

