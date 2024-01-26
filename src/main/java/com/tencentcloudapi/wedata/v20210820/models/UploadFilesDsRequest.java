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

public class UploadFilesDsRequest extends AbstractModel {

    /**
    * 返回值
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 临时文件名列表，如果有重复会自动去重
    */
    @SerializedName("FileNames")
    @Expose
    private String [] FileNames;

    /**
    * 跨域访问域名，文件最终上传到共享存储，上传时可能会出现跨域问题，如果是跨域请求，请填写该值，请注意，该值只在公有云(即访问COS)生效
    */
    @SerializedName("OriginDomain")
    @Expose
    private String OriginDomain;

    /**
     * Get 返回值 
     * @return ProjectId 返回值
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 返回值
     * @param ProjectId 返回值
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 临时文件名列表，如果有重复会自动去重 
     * @return FileNames 临时文件名列表，如果有重复会自动去重
     */
    public String [] getFileNames() {
        return this.FileNames;
    }

    /**
     * Set 临时文件名列表，如果有重复会自动去重
     * @param FileNames 临时文件名列表，如果有重复会自动去重
     */
    public void setFileNames(String [] FileNames) {
        this.FileNames = FileNames;
    }

    /**
     * Get 跨域访问域名，文件最终上传到共享存储，上传时可能会出现跨域问题，如果是跨域请求，请填写该值，请注意，该值只在公有云(即访问COS)生效 
     * @return OriginDomain 跨域访问域名，文件最终上传到共享存储，上传时可能会出现跨域问题，如果是跨域请求，请填写该值，请注意，该值只在公有云(即访问COS)生效
     */
    public String getOriginDomain() {
        return this.OriginDomain;
    }

    /**
     * Set 跨域访问域名，文件最终上传到共享存储，上传时可能会出现跨域问题，如果是跨域请求，请填写该值，请注意，该值只在公有云(即访问COS)生效
     * @param OriginDomain 跨域访问域名，文件最终上传到共享存储，上传时可能会出现跨域问题，如果是跨域请求，请填写该值，请注意，该值只在公有云(即访问COS)生效
     */
    public void setOriginDomain(String OriginDomain) {
        this.OriginDomain = OriginDomain;
    }

    public UploadFilesDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFilesDsRequest(UploadFilesDsRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.FileNames != null) {
            this.FileNames = new String[source.FileNames.length];
            for (int i = 0; i < source.FileNames.length; i++) {
                this.FileNames[i] = new String(source.FileNames[i]);
            }
        }
        if (source.OriginDomain != null) {
            this.OriginDomain = new String(source.OriginDomain);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamArraySimple(map, prefix + "FileNames.", this.FileNames);
        this.setParamSimple(map, prefix + "OriginDomain", this.OriginDomain);

    }
}

