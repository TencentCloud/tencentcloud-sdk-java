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
package com.tencentcloudapi.cynosdb.v20190107.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BinlogItem extends AbstractModel{

    /**
    * Binlog文件名称
    */
    @SerializedName("FileName")
    @Expose
    private String FileName;

    /**
    * 文件大小，单位：字节
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * 事务最早时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 事务最晚时间
    */
    @SerializedName("FinishTime")
    @Expose
    private String FinishTime;

    /**
    * Binlog文件ID
    */
    @SerializedName("BinlogId")
    @Expose
    private Long BinlogId;

    /**
     * Get Binlog文件名称 
     * @return FileName Binlog文件名称
     */
    public String getFileName() {
        return this.FileName;
    }

    /**
     * Set Binlog文件名称
     * @param FileName Binlog文件名称
     */
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }

    /**
     * Get 文件大小，单位：字节 
     * @return FileSize 文件大小，单位：字节
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set 文件大小，单位：字节
     * @param FileSize 文件大小，单位：字节
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
    }

    /**
     * Get 事务最早时间 
     * @return StartTime 事务最早时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 事务最早时间
     * @param StartTime 事务最早时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 事务最晚时间 
     * @return FinishTime 事务最晚时间
     */
    public String getFinishTime() {
        return this.FinishTime;
    }

    /**
     * Set 事务最晚时间
     * @param FinishTime 事务最晚时间
     */
    public void setFinishTime(String FinishTime) {
        this.FinishTime = FinishTime;
    }

    /**
     * Get Binlog文件ID 
     * @return BinlogId Binlog文件ID
     */
    public Long getBinlogId() {
        return this.BinlogId;
    }

    /**
     * Set Binlog文件ID
     * @param BinlogId Binlog文件ID
     */
    public void setBinlogId(Long BinlogId) {
        this.BinlogId = BinlogId;
    }

    public BinlogItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BinlogItem(BinlogItem source) {
        if (source.FileName != null) {
            this.FileName = new String(source.FileName);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.StartTime != null) {
            this.StartTime = new String(source.StartTime);
        }
        if (source.FinishTime != null) {
            this.FinishTime = new String(source.FinishTime);
        }
        if (source.BinlogId != null) {
            this.BinlogId = new Long(source.BinlogId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FileName", this.FileName);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "FinishTime", this.FinishTime);
        this.setParamSimple(map, prefix + "BinlogId", this.BinlogId);

    }
}

