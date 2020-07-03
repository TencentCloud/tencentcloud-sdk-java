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
package com.tencentcloudapi.iotvideo.v20191126.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogsRequest extends AbstractModel{

    /**
    * 设备TID
    */
    @SerializedName("Tid")
    @Expose
    private String Tid;

    /**
    * 当前分页的最大条数,0<取值范围<=100
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 分页偏移量,取值范围>0
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 日志类型 1.在线状态变更 2.ProConst变更 3.ProWritable变更 4.Action控制 5.ProReadonly变更 6.Event事件
    */
    @SerializedName("LogType")
    @Expose
    private Long LogType;

    /**
    * 查询的起始时间 UNIX时间戳，单位秒
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 物模型对象索引，用于模糊查询，字符长度<=255，每层节点的字符长度<=16
    */
    @SerializedName("DataObject")
    @Expose
    private String DataObject;

    /**
    * 查询的结束时间 UNIX时间戳，单位秒
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
     * Get 设备TID 
     * @return Tid 设备TID
     */
    public String getTid() {
        return this.Tid;
    }

    /**
     * Set 设备TID
     * @param Tid 设备TID
     */
    public void setTid(String Tid) {
        this.Tid = Tid;
    }

    /**
     * Get 当前分页的最大条数,0<取值范围<=100 
     * @return Limit 当前分页的最大条数,0<取值范围<=100
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 当前分页的最大条数,0<取值范围<=100
     * @param Limit 当前分页的最大条数,0<取值范围<=100
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 分页偏移量,取值范围>0 
     * @return Offset 分页偏移量,取值范围>0
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页偏移量,取值范围>0
     * @param Offset 分页偏移量,取值范围>0
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 日志类型 1.在线状态变更 2.ProConst变更 3.ProWritable变更 4.Action控制 5.ProReadonly变更 6.Event事件 
     * @return LogType 日志类型 1.在线状态变更 2.ProConst变更 3.ProWritable变更 4.Action控制 5.ProReadonly变更 6.Event事件
     */
    public Long getLogType() {
        return this.LogType;
    }

    /**
     * Set 日志类型 1.在线状态变更 2.ProConst变更 3.ProWritable变更 4.Action控制 5.ProReadonly变更 6.Event事件
     * @param LogType 日志类型 1.在线状态变更 2.ProConst变更 3.ProWritable变更 4.Action控制 5.ProReadonly变更 6.Event事件
     */
    public void setLogType(Long LogType) {
        this.LogType = LogType;
    }

    /**
     * Get 查询的起始时间 UNIX时间戳，单位秒 
     * @return StartTime 查询的起始时间 UNIX时间戳，单位秒
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 查询的起始时间 UNIX时间戳，单位秒
     * @param StartTime 查询的起始时间 UNIX时间戳，单位秒
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 物模型对象索引，用于模糊查询，字符长度<=255，每层节点的字符长度<=16 
     * @return DataObject 物模型对象索引，用于模糊查询，字符长度<=255，每层节点的字符长度<=16
     */
    public String getDataObject() {
        return this.DataObject;
    }

    /**
     * Set 物模型对象索引，用于模糊查询，字符长度<=255，每层节点的字符长度<=16
     * @param DataObject 物模型对象索引，用于模糊查询，字符长度<=255，每层节点的字符长度<=16
     */
    public void setDataObject(String DataObject) {
        this.DataObject = DataObject;
    }

    /**
     * Get 查询的结束时间 UNIX时间戳，单位秒 
     * @return EndTime 查询的结束时间 UNIX时间戳，单位秒
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 查询的结束时间 UNIX时间戳，单位秒
     * @param EndTime 查询的结束时间 UNIX时间戳，单位秒
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Tid", this.Tid);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "LogType", this.LogType);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "DataObject", this.DataObject);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);

    }
}

