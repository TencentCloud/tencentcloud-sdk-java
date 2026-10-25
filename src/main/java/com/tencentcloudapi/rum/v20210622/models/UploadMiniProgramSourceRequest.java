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
package com.tencentcloudapi.rum.v20210622.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadMiniProgramSourceRequest extends AbstractModel {

    /**
    * <p>应用id</p>
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * <p>源码zip的Base64，请求包上限10240KB</p>
    */
    @SerializedName("FileBase64")
    @Expose
    private String FileBase64;

    /**
    * <p>应用版本（可选）</p>
    */
    @SerializedName("Release")
    @Expose
    private String Release;

    /**
    * <p>原始文件名（可选）</p>
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
     * Get <p>应用id</p> 
     * @return AppId <p>应用id</p>
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * Set <p>应用id</p>
     * @param AppId <p>应用id</p>
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * Get <p>源码zip的Base64，请求包上限10240KB</p> 
     * @return FileBase64 <p>源码zip的Base64，请求包上限10240KB</p>
     */
    public String getFileBase64() {
        return this.FileBase64;
    }

    /**
     * Set <p>源码zip的Base64，请求包上限10240KB</p>
     * @param FileBase64 <p>源码zip的Base64，请求包上限10240KB</p>
     */
    public void setFileBase64(String FileBase64) {
        this.FileBase64 = FileBase64;
    }

    /**
     * Get <p>应用版本（可选）</p> 
     * @return Release <p>应用版本（可选）</p>
     */
    public String getRelease() {
        return this.Release;
    }

    /**
     * Set <p>应用版本（可选）</p>
     * @param Release <p>应用版本（可选）</p>
     */
    public void setRelease(String Release) {
        this.Release = Release;
    }

    /**
     * Get <p>原始文件名（可选）</p> 
     * @return FileName <p>原始文件名（可选）</p>
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set <p>原始文件名（可选）</p>
     * @param FileName <p>原始文件名（可选）</p>
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    public UploadMiniProgramSourceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadMiniProgramSourceRequest(UploadMiniProgramSourceRequest source) {
        if (source.AppId != null) {
            this.AppId = new String(source.AppId);
        }
        if (source.FileBase64 != null) {
            this.FileBase64 = new String(source.FileBase64);
        }
        if (source.Release != null) {
            this.Release = new String(source.Release);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "FileBase64", this.FileBase64);
        this.setParamSimple(map, prefix + "Release", this.Release);
        this.setParamSimple(map, prefix + "FileName", this.FileName);

    }
}

