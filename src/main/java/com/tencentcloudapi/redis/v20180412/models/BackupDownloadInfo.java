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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupDownloadInfo extends AbstractModel{

    /**
    * 备份文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 备份文件大小，单位B，如果为0，表示无效
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 备份文件外网下载地址（6小时）
    */
    @SerializedName("DownloadUrl")
    @Expose
    private String DownloadUrl;

    /**
    * 备份文件内网下载地址（6小时）
    */
    @SerializedName("InnerDownloadUrl")
    @Expose
    private String InnerDownloadUrl;

    /**
     * Get 备份文件名称 
     * @return FileName 备份文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 备份文件名称
     * @param FileName 备份文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 备份文件大小，单位B，如果为0，表示无效 
     * @return FileSize 备份文件大小，单位B，如果为0，表示无效
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 备份文件大小，单位B，如果为0，表示无效
     * @param FileSize 备份文件大小，单位B，如果为0，表示无效
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 备份文件外网下载地址（6小时） 
     * @return DownloadUrl 备份文件外网下载地址（6小时）
     */
    public String getDownloadUrl() {
        return this.DownloadUrl;
    }

    /**
     * Set 备份文件外网下载地址（6小时）
     * @param DownloadUrl 备份文件外网下载地址（6小时）
     */
    public void setDownloadUrl(String DownloadUrl) {
        this.DownloadUrl = DownloadUrl;
    }

    /**
     * Get 备份文件内网下载地址（6小时） 
     * @return InnerDownloadUrl 备份文件内网下载地址（6小时）
     */
    public String getInnerDownloadUrl() {
        return this.InnerDownloadUrl;
    }

    /**
     * Set 备份文件内网下载地址（6小时）
     * @param InnerDownloadUrl 备份文件内网下载地址（6小时）
     */
    public void setInnerDownloadUrl(String InnerDownloadUrl) {
        this.InnerDownloadUrl = InnerDownloadUrl;
    }

    public BackupDownloadInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupDownloadInfo(BackupDownloadInfo source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.DownloadUrl != null) {
            this.DownloadUrl = new String(source.DownloadUrl);
        }
        if (source.InnerDownloadUrl != null) {
            this.InnerDownloadUrl = new String(source.InnerDownloadUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "DownloadUrl", this.DownloadUrl);
        this.setParamSimple(map, prefix + "InnerDownloadUrl", this.InnerDownloadUrl);

    }
}

