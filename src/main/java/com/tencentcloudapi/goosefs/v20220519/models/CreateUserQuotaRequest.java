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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateUserQuotaRequest extends AbstractModel {

    /**
    * 文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * 配额类型，UID或GID
    */
    @SerializedName("QuotaType")
    @Expose
    private String QuotaType;

    /**
    * 配额对象名称，对应UID或者GID的值
    */
    @SerializedName("QuotaObjectName")
    @Expose
    private String QuotaObjectName;

    /**
    * 容量配额（需带单位G）
    */
    @SerializedName("QuotaSizeLimit")
    @Expose
    private String QuotaSizeLimit;

    /**
    * 文件数配额
    */
    @SerializedName("QuotaFilesLimit")
    @Expose
    private String QuotaFilesLimit;

    /**
     * Get 文件系统id 
     * @return FileSystemId 文件系统id
     */
    public String getFileSystemId() {
        return this.FileSystemId;
    }

    /**
     * Set 文件系统id
     * @param FileSystemId 文件系统id
     */
    public void setFileSystemId(String FileSystemId) {
        this.FileSystemId = FileSystemId;
    }

    /**
     * Get 配额类型，UID或GID 
     * @return QuotaType 配额类型，UID或GID
     */
    public String getQuotaType() {
        return this.QuotaType;
    }

    /**
     * Set 配额类型，UID或GID
     * @param QuotaType 配额类型，UID或GID
     */
    public void setQuotaType(String QuotaType) {
        this.QuotaType = QuotaType;
    }

    /**
     * Get 配额对象名称，对应UID或者GID的值 
     * @return QuotaObjectName 配额对象名称，对应UID或者GID的值
     */
    public String getQuotaObjectName() {
        return this.QuotaObjectName;
    }

    /**
     * Set 配额对象名称，对应UID或者GID的值
     * @param QuotaObjectName 配额对象名称，对应UID或者GID的值
     */
    public void setQuotaObjectName(String QuotaObjectName) {
        this.QuotaObjectName = QuotaObjectName;
    }

    /**
     * Get 容量配额（需带单位G） 
     * @return QuotaSizeLimit 容量配额（需带单位G）
     */
    public String getQuotaSizeLimit() {
        return this.QuotaSizeLimit;
    }

    /**
     * Set 容量配额（需带单位G）
     * @param QuotaSizeLimit 容量配额（需带单位G）
     */
    public void setQuotaSizeLimit(String QuotaSizeLimit) {
        this.QuotaSizeLimit = QuotaSizeLimit;
    }

    /**
     * Get 文件数配额 
     * @return QuotaFilesLimit 文件数配额
     */
    public String getQuotaFilesLimit() {
        return this.QuotaFilesLimit;
    }

    /**
     * Set 文件数配额
     * @param QuotaFilesLimit 文件数配额
     */
    public void setQuotaFilesLimit(String QuotaFilesLimit) {
        this.QuotaFilesLimit = QuotaFilesLimit;
    }

    public CreateUserQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateUserQuotaRequest(CreateUserQuotaRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.QuotaType != null) {
            this.QuotaType = new String(source.QuotaType);
        }
        if (source.QuotaObjectName != null) {
            this.QuotaObjectName = new String(source.QuotaObjectName);
        }
        if (source.QuotaSizeLimit != null) {
            this.QuotaSizeLimit = new String(source.QuotaSizeLimit);
        }
        if (source.QuotaFilesLimit != null) {
            this.QuotaFilesLimit = new String(source.QuotaFilesLimit);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "QuotaType", this.QuotaType);
        this.setParamSimple(map, prefix + "QuotaObjectName", this.QuotaObjectName);
        this.setParamSimple(map, prefix + "QuotaSizeLimit", this.QuotaSizeLimit);
        this.setParamSimple(map, prefix + "QuotaFilesLimit", this.QuotaFilesLimit);

    }
}

