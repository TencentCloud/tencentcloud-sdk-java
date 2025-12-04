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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosFileInfo extends AbstractModel {

    /**
    * 文件名称，包含后缀
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型，"PDF", "DOC", "DOCX", "XLS", "XLSX", "PPT", "PPTX", "MD", "TXT", "PNG", "JPG", "JPEG", "CSV"
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 用户文件的cosurl
    */
    @SerializedName("UserCosUrl")
    @Expose
    private String UserCosUrl;

    /**
     * Get 文件名称，包含后缀 
     * @return FileName 文件名称，包含后缀
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称，包含后缀
     * @param FileName 文件名称，包含后缀
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型，"PDF", "DOC", "DOCX", "XLS", "XLSX", "PPT", "PPTX", "MD", "TXT", "PNG", "JPG", "JPEG", "CSV" 
     * @return FileType 文件类型，"PDF", "DOC", "DOCX", "XLS", "XLSX", "PPT", "PPTX", "MD", "TXT", "PNG", "JPG", "JPEG", "CSV"
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型，"PDF", "DOC", "DOCX", "XLS", "XLSX", "PPT", "PPTX", "MD", "TXT", "PNG", "JPG", "JPEG", "CSV"
     * @param FileType 文件类型，"PDF", "DOC", "DOCX", "XLS", "XLSX", "PPT", "PPTX", "MD", "TXT", "PNG", "JPG", "JPEG", "CSV"
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 用户文件的cosurl 
     * @return UserCosUrl 用户文件的cosurl
     */
    public String getUserCosUrl() {
        return this.UserCosUrl;
    }

    /**
     * Set 用户文件的cosurl
     * @param UserCosUrl 用户文件的cosurl
     */
    public void setUserCosUrl(String UserCosUrl) {
        this.UserCosUrl = UserCosUrl;
    }

    public CosFileInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosFileInfo(CosFileInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.UserCosUrl != null) {
            this.UserCosUrl = new String(source.UserCosUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "UserCosUrl", this.UserCosUrl);

    }
}

