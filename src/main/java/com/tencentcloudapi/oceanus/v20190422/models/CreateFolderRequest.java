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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFolderRequest extends AbstractModel{

    /**
    * 新建文件夹名
    */
    @SerializedName("FolderName")
    @Expose
    private String FolderName;

    /**
    * 新建文件夹的父目录ID
    */
    @SerializedName("ParentId")
    @Expose
    private String ParentId;

    /**
    * 文件夹类型，0是任务文件夹，1是依赖文件夹
    */
    @SerializedName("FolderType")
    @Expose
    private Long FolderType;

    /**
    * 工作空间 SerialId
    */
    @SerializedName("WorkSpaceId")
    @Expose
    private String WorkSpaceId;

    /**
     * Get 新建文件夹名 
     * @return FolderName 新建文件夹名
     */
    public String getFolderName() {
        return this.FolderName;
    }

    /**
     * Set 新建文件夹名
     * @param FolderName 新建文件夹名
     */
    public void setFolderName(String FolderName) {
        this.FolderName = FolderName;
    }

    /**
     * Get 新建文件夹的父目录ID 
     * @return ParentId 新建文件夹的父目录ID
     */
    public String getParentId() {
        return this.ParentId;
    }

    /**
     * Set 新建文件夹的父目录ID
     * @param ParentId 新建文件夹的父目录ID
     */
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

    /**
     * Get 文件夹类型，0是任务文件夹，1是依赖文件夹 
     * @return FolderType 文件夹类型，0是任务文件夹，1是依赖文件夹
     */
    public Long getFolderType() {
        return this.FolderType;
    }

    /**
     * Set 文件夹类型，0是任务文件夹，1是依赖文件夹
     * @param FolderType 文件夹类型，0是任务文件夹，1是依赖文件夹
     */
    public void setFolderType(Long FolderType) {
        this.FolderType = FolderType;
    }

    /**
     * Get 工作空间 SerialId 
     * @return WorkSpaceId 工作空间 SerialId
     */
    public String getWorkSpaceId() {
        return this.WorkSpaceId;
    }

    /**
     * Set 工作空间 SerialId
     * @param WorkSpaceId 工作空间 SerialId
     */
    public void setWorkSpaceId(String WorkSpaceId) {
        this.WorkSpaceId = WorkSpaceId;
    }

    public CreateFolderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFolderRequest(CreateFolderRequest source) {
        if (source.FolderName != null) {
            this.FolderName = new String(source.FolderName);
        }
        if (source.ParentId != null) {
            this.ParentId = new String(source.ParentId);
        }
        if (source.FolderType != null) {
            this.FolderType = new Long(source.FolderType);
        }
        if (source.WorkSpaceId != null) {
            this.WorkSpaceId = new String(source.WorkSpaceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FolderName", this.FolderName);
        this.setParamSimple(map, prefix + "ParentId", this.ParentId);
        this.setParamSimple(map, prefix + "FolderType", this.FolderType);
        this.setParamSimple(map, prefix + "WorkSpaceId", this.WorkSpaceId);

    }
}

