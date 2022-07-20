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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownloadAttackRecordInfo extends AbstractModel{

    /**
    * 记录ID
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 下载任务名
    */
    @SerializedName("TaskName")
    @Expose
    private String TaskName;

    /**
    * 任务ID
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 域名
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 当前下载任务的日志条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 下载任务运行状态：-1-下载超时，0-下载等待，1-下载完成，2-下载失败，4-正在下载
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 下载文件URL
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后更新修改时间
    */
    @SerializedName("ModifyTime")
    @Expose
    private String ModifyTime;

    /**
    * 过期时间
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 下载任务需下载的日志总条数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
     * Get 记录ID 
     * @return Id 记录ID
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 记录ID
     * @param Id 记录ID
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 下载任务名 
     * @return TaskName 下载任务名
     */
    public String getTaskName() {
        return this.TaskName;
    }

    /**
     * Set 下载任务名
     * @param TaskName 下载任务名
     */
    public void setTaskName(String TaskName) {
        this.TaskName = TaskName;
    }

    /**
     * Get 任务ID 
     * @return TaskId 任务ID
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID
     * @param TaskId 任务ID
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 域名 
     * @return Host 域名
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 域名
     * @param Host 域名
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 当前下载任务的日志条数 
     * @return Count 当前下载任务的日志条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 当前下载任务的日志条数
     * @param Count 当前下载任务的日志条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 下载任务运行状态：-1-下载超时，0-下载等待，1-下载完成，2-下载失败，4-正在下载 
     * @return Status 下载任务运行状态：-1-下载超时，0-下载等待，1-下载完成，2-下载失败，4-正在下载
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 下载任务运行状态：-1-下载超时，0-下载等待，1-下载完成，2-下载失败，4-正在下载
     * @param Status 下载任务运行状态：-1-下载超时，0-下载等待，1-下载完成，2-下载失败，4-正在下载
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 下载文件URL 
     * @return Url 下载文件URL
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 下载文件URL
     * @param Url 下载文件URL
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 最后更新修改时间 
     * @return ModifyTime 最后更新修改时间
     */
    public String getModifyTime() {
        return this.ModifyTime;
    }

    /**
     * Set 最后更新修改时间
     * @param ModifyTime 最后更新修改时间
     */
    public void setModifyTime(String ModifyTime) {
        this.ModifyTime = ModifyTime;
    }

    /**
     * Get 过期时间 
     * @return ExpireTime 过期时间
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 过期时间
     * @param ExpireTime 过期时间
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 下载任务需下载的日志总条数 
     * @return TotalCount 下载任务需下载的日志总条数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 下载任务需下载的日志总条数
     * @param TotalCount 下载任务需下载的日志总条数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    public DownloadAttackRecordInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DownloadAttackRecordInfo(DownloadAttackRecordInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskName != null) {
            this.TaskName = new String(source.TaskName);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.ModifyTime != null) {
            this.ModifyTime = new String(source.ModifyTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskName", this.TaskName);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "ModifyTime", this.ModifyTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);

    }
}

