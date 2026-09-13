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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FileStorage extends AbstractModel {

    /**
    * 存储类型
    */
    @SerializedName("StorageType")
    @Expose
    private Long StorageType;

    /**
    * 存储路径
    */
    @SerializedName("StoragePath")
    @Expose
    private String StoragePath;

    /**
    * 文件内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
     * Get 存储类型 
     * @return StorageType 存储类型
     */
    public Long getStorageType() {
        return this.StorageType;
    }

    /**
     * Set 存储类型
     * @param StorageType 存储类型
     */
    public void setStorageType(Long StorageType) {
        this.StorageType = StorageType;
    }

    /**
     * Get 存储路径 
     * @return StoragePath 存储路径
     */
    public String getStoragePath() {
        return this.StoragePath;
    }

    /**
     * Set 存储路径
     * @param StoragePath 存储路径
     */
    public void setStoragePath(String StoragePath) {
        this.StoragePath = StoragePath;
    }

    /**
     * Get 文件内容 
     * @return Content 文件内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 文件内容
     * @param Content 文件内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    public FileStorage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FileStorage(FileStorage source) {
        if (source.StorageType != null) {
            this.StorageType = new Long(source.StorageType);
        }
        if (source.StoragePath != null) {
            this.StoragePath = new String(source.StoragePath);
        }
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StorageType", this.StorageType);
        this.setParamSimple(map, prefix + "StoragePath", this.StoragePath);
        this.setParamSimple(map, prefix + "Content", this.Content);

    }
}

