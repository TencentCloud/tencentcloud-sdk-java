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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceFilterRequest extends AbstractModel{

    /**
    * 应用ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 文件ID，表示文件唯一ID
    */
    @SerializedName("FileId")
    @Expose
    private String FileId;

    /**
    * 文件名
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件url，urlencode编码，FileUrl和FileContent二选一
    */
    @SerializedName("FileUrl")
    @Expose
    private String FileUrl;

    /**
    * 文件内容，base64编码，FileUrl和FileContent二选一
    */
    @SerializedName("FileContent")
    @Expose
    private String FileContent;

    /**
    * 用户ID
    */
    @SerializedName("OpenId")
    @Expose
    private String OpenId;

    /**
     * Get 应用ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID 
     * @return BizId 应用ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * Set 应用ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     * @param BizId 应用ID，登录[控制台](https://console.cloud.tencent.com/gamegme)创建应用得到的AppID
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * Get 文件ID，表示文件唯一ID 
     * @return FileId 文件ID，表示文件唯一ID
     */
    public String getFileId() {
        return this.FileId;
    }

    /**
     * Set 文件ID，表示文件唯一ID
     * @param FileId 文件ID，表示文件唯一ID
     */
    public void setFileId(String FileId) {
        this.FileId = FileId;
    }

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
     * Get 文件url，urlencode编码，FileUrl和FileContent二选一 
     * @return FileUrl 文件url，urlencode编码，FileUrl和FileContent二选一
     */
    public String getFileUrl() {
        return this.FileUrl;
    }

    /**
     * Set 文件url，urlencode编码，FileUrl和FileContent二选一
     * @param FileUrl 文件url，urlencode编码，FileUrl和FileContent二选一
     */
    public void setFileUrl(String FileUrl) {
        this.FileUrl = FileUrl;
    }

    /**
     * Get 文件内容，base64编码，FileUrl和FileContent二选一 
     * @return FileContent 文件内容，base64编码，FileUrl和FileContent二选一
     */
    public String getFileContent() {
        return this.FileContent;
    }

    /**
     * Set 文件内容，base64编码，FileUrl和FileContent二选一
     * @param FileContent 文件内容，base64编码，FileUrl和FileContent二选一
     */
    public void setFileContent(String FileContent) {
        this.FileContent = FileContent;
    }

    /**
     * Get 用户ID 
     * @return OpenId 用户ID
     */
    public String getOpenId() {
        return this.OpenId;
    }

    /**
     * Set 用户ID
     * @param OpenId 用户ID
     */
    public void setOpenId(String OpenId) {
        this.OpenId = OpenId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "FileId", this.FileId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileUrl", this.FileUrl);
        this.setParamSimple(map, prefix + "FileContent", this.FileContent);
        this.setParamSimple(map, prefix + "OpenId", this.OpenId);

    }
}

