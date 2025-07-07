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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileUploadURLRequest extends AbstractModel {

    /**
    * 工作空间Id
    */
    @SerializedName("WorkspaceId")
    @Expose
    private Long WorkspaceId;

    /**
    * 文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 应用token
    */
    @SerializedName("ApplicationToken")
    @Expose
    private String ApplicationToken;

    /**
    * 文件MD5
    */
    @SerializedName("FileMD5")
    @Expose
    private String FileMD5;

    /**
    * 存储类型
    */
    @SerializedName("SaveType")
    @Expose
    private String SaveType;

    /**
    * 过期时间，过期时间戳，精确到秒的时间戳，noExpireFlag为false时必填

    */
    @SerializedName("FileExpireTime")
    @Expose
    private Long FileExpireTime;

    /**
    * 永不过期标记
    */
    @SerializedName("NoExpireFlag")
    @Expose
    private Boolean NoExpireFlag;

    /**
     * Get 工作空间Id 
     * @return WorkspaceId 工作空间Id
     */
    public Long getWorkspaceId() {
        return this.WorkspaceId;
    }

    /**
     * Set 工作空间Id
     * @param WorkspaceId 工作空间Id
     */
    public void setWorkspaceId(Long WorkspaceId) {
        this.WorkspaceId = WorkspaceId;
    }

    /**
     * Get 文件名称 
     * @return FileName 文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 文件名称
     * @param FileName 文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小 
     * @return FileSize 文件大小
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小
     * @param FileSize 文件大小
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 应用token 
     * @return ApplicationToken 应用token
     */
    public String getApplicationToken() {
        return this.ApplicationToken;
    }

    /**
     * Set 应用token
     * @param ApplicationToken 应用token
     */
    public void setApplicationToken(String ApplicationToken) {
        this.ApplicationToken = ApplicationToken;
    }

    /**
     * Get 文件MD5 
     * @return FileMD5 文件MD5
     */
    public String getFileMD5() {
        return this.FileMD5;
    }

    /**
     * Set 文件MD5
     * @param FileMD5 文件MD5
     */
    public void setFileMD5(String FileMD5) {
        this.FileMD5 = FileMD5;
    }

    /**
     * Get 存储类型 
     * @return SaveType 存储类型
     */
    public String getSaveType() {
        return this.SaveType;
    }

    /**
     * Set 存储类型
     * @param SaveType 存储类型
     */
    public void setSaveType(String SaveType) {
        this.SaveType = SaveType;
    }

    /**
     * Get 过期时间，过期时间戳，精确到秒的时间戳，noExpireFlag为false时必填
 
     * @return FileExpireTime 过期时间，过期时间戳，精确到秒的时间戳，noExpireFlag为false时必填

     */
    public Long getFileExpireTime() {
        return this.FileExpireTime;
    }

    /**
     * Set 过期时间，过期时间戳，精确到秒的时间戳，noExpireFlag为false时必填

     * @param FileExpireTime 过期时间，过期时间戳，精确到秒的时间戳，noExpireFlag为false时必填

     */
    public void setFileExpireTime(Long FileExpireTime) {
        this.FileExpireTime = FileExpireTime;
    }

    /**
     * Get 永不过期标记 
     * @return NoExpireFlag 永不过期标记
     */
    public Boolean getNoExpireFlag() {
        return this.NoExpireFlag;
    }

    /**
     * Set 永不过期标记
     * @param NoExpireFlag 永不过期标记
     */
    public void setNoExpireFlag(Boolean NoExpireFlag) {
        this.NoExpireFlag = NoExpireFlag;
    }

    public DescribeFileUploadURLRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileUploadURLRequest(DescribeFileUploadURLRequest source) {
        if (source.WorkspaceId != null) {
            this.WorkspaceId = new Long(source.WorkspaceId);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.ApplicationToken != null) {
            this.ApplicationToken = new String(source.ApplicationToken);
        }
        if (source.FileMD5 != null) {
            this.FileMD5 = new String(source.FileMD5);
        }
        if (source.SaveType != null) {
            this.SaveType = new String(source.SaveType);
        }
        if (source.FileExpireTime != null) {
            this.FileExpireTime = new Long(source.FileExpireTime);
        }
        if (source.NoExpireFlag != null) {
            this.NoExpireFlag = new Boolean(source.NoExpireFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WorkspaceId", this.WorkspaceId);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "ApplicationToken", this.ApplicationToken);
        this.setParamSimple(map, prefix + "FileMD5", this.FileMD5);
        this.setParamSimple(map, prefix + "SaveType", this.SaveType);
        this.setParamSimple(map, prefix + "FileExpireTime", this.FileExpireTime);
        this.setParamSimple(map, prefix + "NoExpireFlag", this.NoExpireFlag);

    }
}

