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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SlowLog extends AbstractModel {

    /**
    * 慢查询日志文件唯一标识
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
    * 文件大小（KB）
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 文件中log条数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

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
    * 状态（1成功 2失败）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
     * Get 慢查询日志文件唯一标识 
     * @return Id 慢查询日志文件唯一标识
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 慢查询日志文件唯一标识
     * @param Id 慢查询日志文件唯一标识
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
     * Get 文件大小（KB） 
     * @return Size 文件大小（KB）
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 文件大小（KB）
     * @param Size 文件大小（KB）
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Get 文件中log条数 
     * @return Count 文件中log条数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 文件中log条数
     * @param Count 文件中log条数
     */
    public void setCount(Long Count) {
        this.Count = Count;
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
     * Get 状态（1成功 2失败） 
     * @return Status 状态（1成功 2失败）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态（1成功 2失败）
     * @param Status 状态（1成功 2失败）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    public SlowLog() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SlowLog(SlowLog source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.Size != null) {
            this.Size = new Long(source.Size);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Size", this.Size);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

