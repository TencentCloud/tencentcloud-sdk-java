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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateResourceFileRequest extends AbstractModel {

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 资源文件ID,可通过ListResourceFiles接口获取
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * - 上传文件及手填两种方式只能选择其一，如果两者均提供，取值顺序为文件>手填值
-  手填值必须是存在的cos路径, /datastudio/resource/ 为固定前缀, projectId 为项目ID,需传入具体值, parentFolderPath为父文件夹路径, name为文件名, 手填值取值示例:
     /datastudio/resource/projectId/parentFolderPath/name 

    */
    @SerializedName("ResourceFile")
    @Expose
    private String ResourceFile;

    /**
    * 资源名称, 尽可能和文件名保持一致
    */
    @SerializedName("ResourceName")
    @Expose
    private String ResourceName;

    /**
    * bundle客户端ID
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * bundle客户端名称
    */
    @SerializedName("BundleInfo")
    @Expose
    private String BundleInfo;

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 资源文件ID,可通过ListResourceFiles接口获取 
     * @return ResourceId 资源文件ID,可通过ListResourceFiles接口获取
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源文件ID,可通过ListResourceFiles接口获取
     * @param ResourceId 资源文件ID,可通过ListResourceFiles接口获取
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get - 上传文件及手填两种方式只能选择其一，如果两者均提供，取值顺序为文件>手填值
-  手填值必须是存在的cos路径, /datastudio/resource/ 为固定前缀, projectId 为项目ID,需传入具体值, parentFolderPath为父文件夹路径, name为文件名, 手填值取值示例:
     /datastudio/resource/projectId/parentFolderPath/name 
 
     * @return ResourceFile - 上传文件及手填两种方式只能选择其一，如果两者均提供，取值顺序为文件>手填值
-  手填值必须是存在的cos路径, /datastudio/resource/ 为固定前缀, projectId 为项目ID,需传入具体值, parentFolderPath为父文件夹路径, name为文件名, 手填值取值示例:
     /datastudio/resource/projectId/parentFolderPath/name 

     */
    public String getResourceFile() {
        return this.ResourceFile;
    }

    /**
     * Set - 上传文件及手填两种方式只能选择其一，如果两者均提供，取值顺序为文件>手填值
-  手填值必须是存在的cos路径, /datastudio/resource/ 为固定前缀, projectId 为项目ID,需传入具体值, parentFolderPath为父文件夹路径, name为文件名, 手填值取值示例:
     /datastudio/resource/projectId/parentFolderPath/name 

     * @param ResourceFile - 上传文件及手填两种方式只能选择其一，如果两者均提供，取值顺序为文件>手填值
-  手填值必须是存在的cos路径, /datastudio/resource/ 为固定前缀, projectId 为项目ID,需传入具体值, parentFolderPath为父文件夹路径, name为文件名, 手填值取值示例:
     /datastudio/resource/projectId/parentFolderPath/name 

     */
    public void setResourceFile(String ResourceFile) {
        this.ResourceFile = ResourceFile;
    }

    /**
     * Get 资源名称, 尽可能和文件名保持一致 
     * @return ResourceName 资源名称, 尽可能和文件名保持一致
     */
    public String getResourceName() {
        return this.ResourceName;
    }

    /**
     * Set 资源名称, 尽可能和文件名保持一致
     * @param ResourceName 资源名称, 尽可能和文件名保持一致
     */
    public void setResourceName(String ResourceName) {
        this.ResourceName = ResourceName;
    }

    /**
     * Get bundle客户端ID 
     * @return BundleId bundle客户端ID
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set bundle客户端ID
     * @param BundleId bundle客户端ID
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get bundle客户端名称 
     * @return BundleInfo bundle客户端名称
     */
    public String getBundleInfo() {
        return this.BundleInfo;
    }

    /**
     * Set bundle客户端名称
     * @param BundleInfo bundle客户端名称
     */
    public void setBundleInfo(String BundleInfo) {
        this.BundleInfo = BundleInfo;
    }

    public UpdateResourceFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateResourceFileRequest(UpdateResourceFileRequest source) {
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.ResourceFile != null) {
            this.ResourceFile = new String(source.ResourceFile);
        }
        if (source.ResourceName != null) {
            this.ResourceName = new String(source.ResourceName);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.BundleInfo != null) {
            this.BundleInfo = new String(source.BundleInfo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "ResourceFile", this.ResourceFile);
        this.setParamSimple(map, prefix + "ResourceName", this.ResourceName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "BundleInfo", this.BundleInfo);

    }
}

