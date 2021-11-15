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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadFileRequest extends AbstractModel{

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件类型
__IdCard__:身份证
__IdCardCheck__:身份证加验证(只支持人像面)
    */
    @SerializedName("FileType")
    @Expose
    private String FileType;

    /**
    * 文件链接
__FileUrl和FileContent二选一__
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件内容，Base64编码
__FileUrl和FileContent二选一__
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 文件扩展信息
    */
    @SerializedName("FileExtendInfo")
    @Expose
    private AnchorExtendInfo [] FileExtendInfo;

    /**
     * Get 文件名 
     * @return FileName 文件名
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名
     * @param FileName 文件名
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件类型
__IdCard__:身份证
__IdCardCheck__:身份证加验证(只支持人像面) 
     * @return FileType 文件类型
__IdCard__:身份证
__IdCardCheck__:身份证加验证(只支持人像面)
     */
    public String getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型
__IdCard__:身份证
__IdCardCheck__:身份证加验证(只支持人像面)
     * @param FileType 文件类型
__IdCard__:身份证
__IdCardCheck__:身份证加验证(只支持人像面)
     */
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    /**
     * Get 文件链接
__FileUrl和FileContent二选一__ 
     * @return FileUrl 文件链接
__FileUrl和FileContent二选一__
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件链接
__FileUrl和FileContent二选一__
     * @param FileUrl 文件链接
__FileUrl和FileContent二选一__
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件内容，Base64编码
__FileUrl和FileContent二选一__ 
     * @return FileContent 文件内容，Base64编码
__FileUrl和FileContent二选一__
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 文件内容，Base64编码
__FileUrl和FileContent二选一__
     * @param FileContent 文件内容，Base64编码
__FileUrl和FileContent二选一__
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 文件扩展信息 
     * @return FileExtendInfo 文件扩展信息
     */
    public AnchorExtendInfo [] getFileExtendInfo() {
        return this.FileExtendInfo;
    }

    /**
     * Set 文件扩展信息
     * @param FileExtendInfo 文件扩展信息
     */
    public void setFileExtendInfo(AnchorExtendInfo [] FileExtendInfo) {
        this.FileExtendInfo = FileExtendInfo;
    }

    public UploadFileRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadFileRequest(UploadFileRequest source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileType != null) {
            this.FileType = new String(source.FileType);
        }
        if (source.FileUrl != null) {
            this.FileUrl = new String(source.FileUrl);
        }
        if (source.FileContent != null) {
            this.FileContent = new String(source.FileContent);
        }
        if (source.FileExtendInfo != null) {
            this.FileExtendInfo = new AnchorExtendInfo[source.FileExtendInfo.length];
            for (int i = 0; i < source.FileExtendInfo.length; i++) {
                this.FileExtendInfo[i] = new AnchorExtendInfo(source.FileExtendInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileType", this.FileType);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamArrayObj(map, prefix + "FileExtendInfo.", this.FileExtendInfo);

    }
}

