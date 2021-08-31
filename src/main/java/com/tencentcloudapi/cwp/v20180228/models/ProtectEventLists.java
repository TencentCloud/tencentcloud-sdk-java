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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ProtectEventLists extends AbstractModel{

    /**
    * 服务器名称
    */
    @SerializedName("HostName")
    @Expose
    private String HostName;

    /**
    * 服务器ip
    */
    @SerializedName("HostIp")
    @Expose
    private String HostIp;

    /**
    * 事件地址
    */
    @SerializedName("EventDir")
    @Expose
    private String EventDir;

    /**
    * 事件类型 0-内容被修改恢复；1-权限被修改恢复；2-归属被修改恢复；3-被删除恢复；4-新增删除
    */
    @SerializedName("EventType")
    @Expose
    private Long EventType;

    /**
    * 事件状态 1 已恢复 0 未恢复
    */
    @SerializedName("EventStatus")
    @Expose
    private Long EventStatus;

    /**
    * 发现时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 恢复时间
    */
    @SerializedName("RestoreTime")
    @Expose
    private String RestoreTime;

    /**
    * 唯一ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 文件类型 0-常规文件；1-目录；2-软链
    */
    @SerializedName("FileType")
    @Expose
    private Long FileType;

    /**
     * Get 服务器名称 
     * @return HostName 服务器名称
     */
    public String getHostName() {
        return this.HostName;
    }

    /**
     * Set 服务器名称
     * @param HostName 服务器名称
     */
    public void setHostName(String HostName) {
        this.HostName = HostName;
    }

    /**
     * Get 服务器ip 
     * @return HostIp 服务器ip
     */
    public String getHostIp() {
        return this.HostIp;
    }

    /**
     * Set 服务器ip
     * @param HostIp 服务器ip
     */
    public void setHostIp(String HostIp) {
        this.HostIp = HostIp;
    }

    /**
     * Get 事件地址 
     * @return EventDir 事件地址
     */
    public String getEventDir() {
        return this.EventDir;
    }

    /**
     * Set 事件地址
     * @param EventDir 事件地址
     */
    public void setEventDir(String EventDir) {
        this.EventDir = EventDir;
    }

    /**
     * Get 事件类型 0-内容被修改恢复；1-权限被修改恢复；2-归属被修改恢复；3-被删除恢复；4-新增删除 
     * @return EventType 事件类型 0-内容被修改恢复；1-权限被修改恢复；2-归属被修改恢复；3-被删除恢复；4-新增删除
     */
    public Long getEventType() {
        return this.EventType;
    }

    /**
     * Set 事件类型 0-内容被修改恢复；1-权限被修改恢复；2-归属被修改恢复；3-被删除恢复；4-新增删除
     * @param EventType 事件类型 0-内容被修改恢复；1-权限被修改恢复；2-归属被修改恢复；3-被删除恢复；4-新增删除
     */
    public void setEventType(Long EventType) {
        this.EventType = EventType;
    }

    /**
     * Get 事件状态 1 已恢复 0 未恢复 
     * @return EventStatus 事件状态 1 已恢复 0 未恢复
     */
    public Long getEventStatus() {
        return this.EventStatus;
    }

    /**
     * Set 事件状态 1 已恢复 0 未恢复
     * @param EventStatus 事件状态 1 已恢复 0 未恢复
     */
    public void setEventStatus(Long EventStatus) {
        this.EventStatus = EventStatus;
    }

    /**
     * Get 发现时间 
     * @return CreateTime 发现时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 发现时间
     * @param CreateTime 发现时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 恢复时间 
     * @return RestoreTime 恢复时间
     */
    public String getRestoreTime() {
        return this.RestoreTime;
    }

    /**
     * Set 恢复时间
     * @param RestoreTime 恢复时间
     */
    public void setRestoreTime(String RestoreTime) {
        this.RestoreTime = RestoreTime;
    }

    /**
     * Get 唯一ID 
     * @return Id 唯一ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 唯一ID
     * @param Id 唯一ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 文件类型 0-常规文件；1-目录；2-软链 
     * @return FileType 文件类型 0-常规文件；1-目录；2-软链
     */
    public Long getFileType() {
        return this.FileType;
    }

    /**
     * Set 文件类型 0-常规文件；1-目录；2-软链
     * @param FileType 文件类型 0-常规文件；1-目录；2-软链
     */
    public void setFileType(Long FileType) {
        this.FileType = FileType;
    }

    public ProtectEventLists() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ProtectEventLists(ProtectEventLists source) {
        if (source.HostName != null) {
            this.HostName = new String(source.HostName);
        }
        if (source.HostIp != null) {
            this.HostIp = new String(source.HostIp);
        }
        if (source.EventDir != null) {
            this.EventDir = new String(source.EventDir);
        }
        if (source.EventType != null) {
            this.EventType = new Long(source.EventType);
        }
        if (source.EventStatus != null) {
            this.EventStatus = new Long(source.EventStatus);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.RestoreTime != null) {
            this.RestoreTime = new String(source.RestoreTime);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.FileType != null) {
            this.FileType = new Long(source.FileType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HostName", this.HostName);
        this.setParamSimple(map, prefix + "HostIp", this.HostIp);
        this.setParamSimple(map, prefix + "EventDir", this.EventDir);
        this.setParamSimple(map, prefix + "EventType", this.EventType);
        this.setParamSimple(map, prefix + "EventStatus", this.EventStatus);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RestoreTime", this.RestoreTime);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "FileType", this.FileType);

    }
}

