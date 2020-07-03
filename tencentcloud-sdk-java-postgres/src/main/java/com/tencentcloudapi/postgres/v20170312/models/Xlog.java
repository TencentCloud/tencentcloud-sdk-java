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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Xlog extends AbstractModel{

    /**
    * 备份文件唯一标识
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 文件生成的开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 文件生成的结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 内网下载地址
    */
    @SerializedName("InternalAddr")
    @Expose
    private String InternalAddr;

    /**
    * 外网下载地址
    */
    @SerializedName("ExternalAddr")
    @Expose
    private String ExternalAddr;

    /**
    * 备份文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

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
     * Get 文件生成的开始时间 
     * @return StartTime 文件生成的开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 文件生成的开始时间
     * @param StartTime 文件生成的开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 文件生成的结束时间 
     * @return EndTime 文件生成的结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 文件生成的结束时间
     * @param EndTime 文件生成的结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 内网下载地址 
     * @return InternalAddr 内网下载地址
     */
    public String getInternalAddr() {
        return this.InternalAddr;
    }

    /**
     * Set 内网下载地址
     * @param InternalAddr 内网下载地址
     */
    public void setInternalAddr(String InternalAddr) {
        this.InternalAddr = InternalAddr;
    }

    /**
     * Get 外网下载地址 
     * @return ExternalAddr 外网下载地址
     */
    public String getExternalAddr() {
        return this.ExternalAddr;
    }

    /**
     * Set 外网下载地址
     * @param ExternalAddr 外网下载地址
     */
    public void setExternalAddr(String ExternalAddr) {
        this.ExternalAddr = ExternalAddr;
    }

    /**
     * Get 备份文件大小 
     * @return Size 备份文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 备份文件大小
     * @param Size 备份文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

