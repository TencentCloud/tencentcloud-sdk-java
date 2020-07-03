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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLogInfo extends AbstractModel{

    /**
    * 备份文件名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 备份文件大小，单位：Byte
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 备份快照时间，时间格式：2016-03-17 02:10:37
    */
    @SerializedName("Date")
    @Expose
    private String Date;

    /**
    * 内网下载地址
    */
    @SerializedName("IntranetUrl")
    @Expose
    private String IntranetUrl;

    /**
    * 外网下载地址
    */
    @SerializedName("InternetUrl")
    @Expose
    private String InternetUrl;

    /**
    * 日志具体类型，可能的值：slowlog - 慢日志
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 备份文件名 
     * @return Name 备份文件名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 备份文件名
     * @param Name 备份文件名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 备份文件大小，单位：Byte 
     * @return Size 备份文件大小，单位：Byte
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 备份文件大小，单位：Byte
     * @param Size 备份文件大小，单位：Byte
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 备份快照时间，时间格式：2016-03-17 02:10:37 
     * @return Date 备份快照时间，时间格式：2016-03-17 02:10:37
     */
    public String getDate() {
        return this.Date;
    }

    /**
     * Set 备份快照时间，时间格式：2016-03-17 02:10:37
     * @param Date 备份快照时间，时间格式：2016-03-17 02:10:37
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * Get 内网下载地址 
     * @return IntranetUrl 内网下载地址
     */
    public String getIntranetUrl() {
        return this.IntranetUrl;
    }

    /**
     * Set 内网下载地址
     * @param IntranetUrl 内网下载地址
     */
    public void setIntranetUrl(String IntranetUrl) {
        this.IntranetUrl = IntranetUrl;
    }

    /**
     * Get 外网下载地址 
     * @return InternetUrl 外网下载地址
     */
    public String getInternetUrl() {
        return this.InternetUrl;
    }

    /**
     * Set 外网下载地址
     * @param InternetUrl 外网下载地址
     */
    public void setInternetUrl(String InternetUrl) {
        this.InternetUrl = InternetUrl;
    }

    /**
     * Get 日志具体类型，可能的值：slowlog - 慢日志 
     * @return Type 日志具体类型，可能的值：slowlog - 慢日志
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 日志具体类型，可能的值：slowlog - 慢日志
     * @param Type 日志具体类型，可能的值：slowlog - 慢日志
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Date", this.Date);
        this.setParamSimple(map, prefix + "IntranetUrl", this.IntranetUrl);
        this.setParamSimple(map, prefix + "InternetUrl", this.InternetUrl);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

