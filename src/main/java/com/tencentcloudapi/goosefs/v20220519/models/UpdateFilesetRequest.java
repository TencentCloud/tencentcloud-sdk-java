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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateFilesetRequest extends AbstractModel {

    /**
    * 文件系统id
    */
    @SerializedName("FileSystemId")
    @Expose
    private String FileSystemId;

    /**
    * Fileset id
    */
    @SerializedName("FsetId")
    @Expose
    private String FsetId;

    /**
    * 容量配额限定值
    */
    @SerializedName("QuotaSizeLimit")
    @Expose
    private String QuotaSizeLimit;

    /**
    * 文件数配额限定值
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
     * Get Fileset id 
     * @return FsetId Fileset id
     */
    public String getFsetId() {
        return this.FsetId;
    }

    /**
     * Set Fileset id
     * @param FsetId Fileset id
     */
    public void setFsetId(String FsetId) {
        this.FsetId = FsetId;
    }

    /**
     * Get 容量配额限定值 
     * @return QuotaSizeLimit 容量配额限定值
     */
    public String getQuotaSizeLimit() {
        return this.QuotaSizeLimit;
    }

    /**
     * Set 容量配额限定值
     * @param QuotaSizeLimit 容量配额限定值
     */
    public void setQuotaSizeLimit(String QuotaSizeLimit) {
        this.QuotaSizeLimit = QuotaSizeLimit;
    }

    /**
     * Get 文件数配额限定值 
     * @return QuotaFilesLimit 文件数配额限定值
     */
    public String getQuotaFilesLimit() {
        return this.QuotaFilesLimit;
    }

    /**
     * Set 文件数配额限定值
     * @param QuotaFilesLimit 文件数配额限定值
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

    public UpdateFilesetRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateFilesetRequest(UpdateFilesetRequest source) {
        if (source.FileSystemId != null) {
            this.FileSystemId = new String(source.FileSystemId);
        }
        if (source.FsetId != null) {
            this.FsetId = new String(source.FsetId);
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
        this.setParamSimple(map, prefix + "FsetId", this.FsetId);
        this.setParamSimple(map, prefix + "QuotaSizeLimit", this.QuotaSizeLimit);
        this.setParamSimple(map, prefix + "QuotaFilesLimit", this.QuotaFilesLimit);
        this.setParamSimple(map, prefix + "AuditState", this.AuditState);

    }
}

