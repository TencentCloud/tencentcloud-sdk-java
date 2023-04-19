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

public class Events extends AbstractModel{

    /**
    * ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 扩展事件文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 扩展事件文件大小
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件
    */
    @SerializedName("EventType")
    @Expose
    private String EventType;

    /**
    * 事件记录状态，1-成功，2-失败
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 扩展文件生成开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 扩展文件生成开始时间
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
     * Get ID 
     * @return Id ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set ID
     * @param Id ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 扩展事件文件名称 
     * @return FileName 扩展事件文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set 扩展事件文件名称
     * @param FileName 扩展事件文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 扩展事件文件大小 
     * @return Size 扩展事件文件大小
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 扩展事件文件大小
     * @param Size 扩展事件文件大小
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件 
     * @return EventType 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件
     */
    public String getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件
     * @param EventType 事件类型，slow-慢SQL事件，blocked-阻塞事件，deadlock-死锁事件
     */
    public void setEventType(String EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件记录状态，1-成功，2-失败 
     * @return Status 事件记录状态，1-成功，2-失败
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 事件记录状态，1-成功，2-失败
     * @param Status 事件记录状态，1-成功，2-失败
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 扩展文件生成开始时间 
     * @return StartTime 扩展文件生成开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 扩展文件生成开始时间
     * @param StartTime 扩展文件生成开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 扩展文件生成开始时间 
     * @return EndTime 扩展文件生成开始时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 扩展文件生成开始时间
     * @param EndTime 扩展文件生成开始时间
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

    public Events() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Events(Events source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.EventType != null) {
            this.EventType = new String(source.EventType);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);

    }
}

