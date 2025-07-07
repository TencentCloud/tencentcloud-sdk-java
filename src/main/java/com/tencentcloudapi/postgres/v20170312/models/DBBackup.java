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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBBackup extends AbstractModel {

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
    * 文件大小(K)
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
    * 策略（0-实例备份；1-多库备份）
    */
    @SerializedName("Strategy")
    @Expose
    private Long Strategy;

    /**
    * 类型（0-定时）
    */
    @SerializedName("Way")
    @Expose
    private Long Way;

    /**
    * 备份方式（1-完整）
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 状态（1-创建中；2-成功；3-失败）
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * DB列表
    */
    @SerializedName("DbList")
    @Expose
    private String [] DbList;

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
    * 备份集ID
    */
    @SerializedName("SetId")
    @Expose
    private String SetId;

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
     * Get 策略（0-实例备份；1-多库备份） 
     * @return Strategy 策略（0-实例备份；1-多库备份）
     */
    public Long getStrategy() {
        return this.Strategy;
    }

    /**
     * Set 策略（0-实例备份；1-多库备份）
     * @param Strategy 策略（0-实例备份；1-多库备份）
     */
    public void setStrategy(Long Strategy) {
        this.Strategy = Strategy;
    }

    /**
     * Get 类型（0-定时） 
     * @return Way 类型（0-定时）
     */
    public Long getWay() {
        return this.Way;
    }

    /**
     * Set 类型（0-定时）
     * @param Way 类型（0-定时）
     */
    public void setWay(Long Way) {
        this.Way = Way;
    }

    /**
     * Get 备份方式（1-完整） 
     * @return Type 备份方式（1-完整）
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 备份方式（1-完整）
     * @param Type 备份方式（1-完整）
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 状态（1-创建中；2-成功；3-失败） 
     * @return Status 状态（1-创建中；2-成功；3-失败）
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态（1-创建中；2-成功；3-失败）
     * @param Status 状态（1-创建中；2-成功；3-失败）
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get DB列表 
     * @return DbList DB列表
     */
    public String [] getDbList() {
        return this.DbList;
    }

    /**
     * Set DB列表
     * @param DbList DB列表
     */
    public void setDbList(String [] DbList) {
        this.DbList = DbList;
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
     * Get 备份集ID 
     * @return SetId 备份集ID
     */
    public String getSetId() {
        return this.SetId;
    }

    /**
     * Set 备份集ID
     * @param SetId 备份集ID
     */
    public void setSetId(String SetId) {
        this.SetId = SetId;
    }

    public DBBackup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DBBackup(DBBackup source) {
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
        if (source.Strategy != null) {
            this.Strategy = new Long(source.Strategy);
        }
        if (source.Way != null) {
            this.Way = new Long(source.Way);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.DbList != null) {
            this.DbList = new String[source.DbList.length];
            for (int i = 0; i < source.DbList.length; i++) {
                this.DbList[i] = new String(source.DbList[i]);
            }
        }
        if (source.InternalAddr != null) {
            this.InternalAddr = new String(source.InternalAddr);
        }
        if (source.ExternalAddr != null) {
            this.ExternalAddr = new String(source.ExternalAddr);
        }
        if (source.SetId != null) {
            this.SetId = new String(source.SetId);
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
        this.setParamSimple(map, prefix + "Strategy", this.Strategy);
        this.setParamSimple(map, prefix + "Way", this.Way);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "DbList.", this.DbList);
        this.setParamSimple(map, prefix + "InternalAddr", this.InternalAddr);
        this.setParamSimple(map, prefix + "ExternalAddr", this.ExternalAddr);
        this.setParamSimple(map, prefix + "SetId", this.SetId);

    }
}

