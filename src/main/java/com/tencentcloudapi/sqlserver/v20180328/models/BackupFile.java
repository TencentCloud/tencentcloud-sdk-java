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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BackupFile extends AbstractModel{

    /**
    * 备份文件唯一标识
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 备份文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小(K)
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 备份文件的库的名称
    */
    @SerializedName("DBs")
    @Expose
    private String [] DBs;

    /**
    * 下载地址
    */
    @SerializedName("DownloadLink")
    @Expose
    private String DownloadLink;

    /**
     * Get 备份文件唯一标识 
     * @return Id 备份文件唯一标识
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 备份文件唯一标识
     * @param Id 备份文件唯一标识
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

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
     * Get 文件大小(K) 
     * @return Size 文件大小(K)
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小(K)
     * @param Size 文件大小(K)
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 备份文件的库的名称 
     * @return DBs 备份文件的库的名称
     */
    public String [] getDBs() {
        return this.DBs;
    }

    /**
     * Set 备份文件的库的名称
     * @param DBs 备份文件的库的名称
     */
    public void setDBs(String [] DBs) {
        this.DBs = DBs;
    }

    /**
     * Get 下载地址 
     * @return DownloadLink 下载地址
     */
    public String getDownloadLink() {
        return this.DownloadLink;
    }

    /**
     * Set 下载地址
     * @param DownloadLink 下载地址
     */
    public void setDownloadLink(String DownloadLink) {
        this.DownloadLink = DownloadLink;
    }

    public BackupFile() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BackupFile(BackupFile source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.DBs != null) {
            this.DBs = new String[source.DBs.length];
            for (int i = 0; i < source.DBs.length; i++) {
                this.DBs[i] = new String(source.DBs[i]);
            }
        }
        if (source.DownloadLink != null) {
            this.DownloadLink = new String(source.DownloadLink);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamArraySimple(map, prefix + "DBs.", this.DBs);
        this.setParamSimple(map, prefix + "DownloadLink", this.DownloadLink);

    }
}

