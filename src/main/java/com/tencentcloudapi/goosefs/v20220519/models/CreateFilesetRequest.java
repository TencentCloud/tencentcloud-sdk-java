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

public class CreateFilesetRequest extends AbstractModel {

    /**
    * 文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Fileset名称
    */
    @SerializedName("FsetName")
    @Expose
    private String FsetName;

    /**
    * Fileset目录
    */
    @SerializedName("FsetDir")
    @Expose
    private String FsetDir;

    /**
    * Fileset容量配额（需带单位G）
    */
    @SerializedName("QuotaSizeLimit")
    @Expose
    private String QuotaSizeLimit;

    /**
    * Fileset文件数配额
    */
    @SerializedName("QuotaFilesLimit")
    @Expose
    private String QuotaFilesLimit;

    /**
    * Fileset文件删除操作审计
    */
    @SerializedName("AuditState")
    @Expose
    private String AuditState;

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
     * Get Fileset名称 
     * @return FsetName Fileset名称
     */
    public String getFsetName() {
        return this.FsetName;
    }

    /**
     * Set Fileset名称
     * @param FsetName Fileset名称
     */
    public void setFsetName(String FsetName) {
        this.FsetName = FsetName;
    }

    /**
     * Get Fileset目录 
     * @return FsetDir Fileset目录
     */
    public String getFsetDir() {
        return this.FsetDir;
    }

    /**
     * Set Fileset目录
     * @param FsetDir Fileset目录
     */
    public void setFsetDir(String FsetDir) {
        this.FsetDir = FsetDir;
    }

    /**
     * Get Fileset容量配额（需带单位G） 
     * @return QuotaSizeLimit Fileset容量配额（需带单位G）
     */
    public String getQuotaSizeLimit() {
        return this.QuotaSizeLimit;
    }

    /**
     * Set Fileset容量配额（需带单位G）
     * @param QuotaSizeLimit Fileset容量配额（需带单位G）
     */
    public void setQuotaSizeLimit(String QuotaSizeLimit) {
        this.QuotaSizeLimit = QuotaSizeLimit;
    }

    /**
     * Get Fileset文件数配额 
     * @return QuotaFilesLimit Fileset文件数配额
     */
    public String getQuotaFilesLimit() {
        return this.QuotaFilesLimit;
    }

    /**
     * Set Fileset文件数配额
     * @param QuotaFilesLimit Fileset文件数配额
     */
    public void setQuotaFilesLimit(String QuotaFilesLimit) {
        this.QuotaFilesLimit = QuotaFilesLimit;
    }

    /**
     * Get Fileset文件删除操作审计 
     * @return AuditState Fileset文件删除操作审计
     */
    public String getAuditState() {
        return this.AuditState;
    }

    /**
     * Set Fileset文件删除操作审计
     * @param AuditState Fileset文件删除操作审计
     */
    public void setAuditState(String AuditState) {
        this.AuditState = AuditState;
    }

    public CreateFilesetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFilesetRequest(CreateFilesetRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FsetName != null) {
            this.FsetName = new String(source.FsetName);
        }
        if (source.FsetDir != null) {
            this.FsetDir = new String(source.FsetDir);
        }
        if (source.QuotaSizeLimit != null) {
            this.QuotaSizeLimit = new String(source.QuotaSizeLimit);
        }
        if (source.QuotaFilesLimit != null) {
            this.QuotaFilesLimit = new String(source.QuotaFilesLimit);
        }
        if (source.AuditState != null) {
            this.AuditState = new String(source.AuditState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileSystemId", this.FileSystemId);
        this.setParamSimple(map, prefix + "FsetName", this.FsetName);
        this.setParamSimple(map, prefix + "FsetDir", this.FsetDir);
        this.setParamSimple(map, prefix + "QuotaSizeLimit", this.QuotaSizeLimit);
        this.setParamSimple(map, prefix + "QuotaFilesLimit", this.QuotaFilesLimit);
        this.setParamSimple(map, prefix + "AuditState", this.AuditState);

    }
}

