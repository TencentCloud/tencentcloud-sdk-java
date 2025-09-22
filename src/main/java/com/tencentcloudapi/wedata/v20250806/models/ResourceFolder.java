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

public class ResourceFolder extends AbstractModel {

    /**
    * 资源文件夹ID
    */
    @SerializedName("FolderId")
    @Expose
    private String FolderId;

    /**
    * 创建人ID
    */
    @SerializedName("CreateUserUin")
    @Expose
    private String CreateUserUin;

    /**
    * 创建人名称
    */
    @SerializedName("CreateUserName")
    @Expose
    private String CreateUserName;

    /**
    * 文件夹路径
    */
    @SerializedName("FolderPath")
    @Expose
    private String FolderPath;

    /**
    * 文件夹名称
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
     * Get 资源文件夹ID 
     * @return FolderId 资源文件夹ID
     */
    public String getFolderId() {
        return this.FolderId;
    }

    /**
     * Set 资源文件夹ID
     * @param FolderId 资源文件夹ID
     */
    public void setFolderId(String FolderId) {
        this.FolderId = FolderId;
    }

    /**
     * Get 创建人ID 
     * @return CreateUserUin 创建人ID
     */
    public String getCreateUserUin() {
        return this.CreateUserUin;
    }

    /**
     * Set 创建人ID
     * @param CreateUserUin 创建人ID
     */
    public void setCreateUserUin(String CreateUserUin) {
        this.CreateUserUin = CreateUserUin;
    }

    /**
     * Get 创建人名称 
     * @return CreateUserName 创建人名称
     */
    public String getCreateUserName() {
        return this.CreateUserName;
    }

    /**
     * Set 创建人名称
     * @param CreateUserName 创建人名称
     */
    public void setCreateUserName(String CreateUserName) {
        this.CreateUserName = CreateUserName;
    }

    /**
     * Get 文件夹路径 
     * @return FolderPath 文件夹路径
     */
    public String getFolderPath() {
        return this.FolderPath;
    }

    /**
     * Set 文件夹路径
     * @param FolderPath 文件夹路径
     */
    public void setFolderPath(String FolderPath) {
        this.FolderPath = FolderPath;
    }

    /**
     * Get 文件夹名称 
     * @return FolderName 文件夹名称
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 文件夹名称
     * @param FolderName 文件夹名称
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    public ResourceFolder() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResourceFolder(ResourceFolder source) {
        if (source.FolderId != null) {
            this.FolderId = new String(source.FolderId);
        }
        if (source.CreateUserUin != null) {
            this.CreateUserUin = new String(source.CreateUserUin);
        }
        if (source.CreateUserName != null) {
            this.CreateUserName = new String(source.CreateUserName);
        }
        if (source.FolderPath != null) {
            this.FolderPath = new String(source.FolderPath);
        }
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderId", this.FolderId);
        this.setParamSimple(map, prefix + "CreateUserUin", this.CreateUserUin);
        this.setParamSimple(map, prefix + "CreateUserName", this.CreateUserName);
        this.setParamSimple(map, prefix + "FolderPath", this.FolderPath);
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);

    }
}

