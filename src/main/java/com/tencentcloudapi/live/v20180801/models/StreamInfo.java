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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StreamInfo  extends AbstractModel{

    /**
    * 直播流所属应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * 创建模式
    */
    @SerializedName("CreateMode")
    @Expose
    private String CreateMode;

    /**
    * 创建时间，如: 2018-07-13 14:48:23
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 流状态
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 流id
    */
    @SerializedName("StreamId")
    @Expose
    private String StreamId;

    /**
    * 流名称
    */
    @SerializedName("StreamName")
    @Expose
    private String StreamName;

    /**
    * 水印id
    */
    @SerializedName("WaterMarkId")
    @Expose
    private String WaterMarkId;

    /**
     * 获取直播流所属应用名称
     * @return AppName 直播流所属应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置直播流所属应用名称
     * @param AppName 直播流所属应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 获取创建模式
     * @return CreateMode 创建模式
     */
    public String getCreateMode() {
        return this.CreateMode;
    }

    /**
     * 设置创建模式
     * @param CreateMode 创建模式
     */
    public void setCreateMode(String CreateMode) {
        this.CreateMode = CreateMode;
    }

    /**
     * 获取创建时间，如: 2018-07-13 14:48:23
     * @return CreateTime 创建时间，如: 2018-07-13 14:48:23
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间，如: 2018-07-13 14:48:23
     * @param CreateTime 创建时间，如: 2018-07-13 14:48:23
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取流状态
     * @return Status 流状态
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置流状态
     * @param Status 流状态
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取流id
     * @return StreamId 流id
     */
    public String getStreamId() {
        return this.StreamId;
    }

    /**
     * 设置流id
     * @param StreamId 流id
     */
    public void setStreamId(String StreamId) {
        this.StreamId = StreamId;
    }

    /**
     * 获取流名称
     * @return StreamName 流名称
     */
    public String getStreamName() {
        return this.StreamName;
    }

    /**
     * 设置流名称
     * @param StreamName 流名称
     */
    public void setStreamName(String StreamName) {
        this.StreamName = StreamName;
    }

    /**
     * 获取水印id
     * @return WaterMarkId 水印id
     */
    public String getWaterMarkId() {
        return this.WaterMarkId;
    }

    /**
     * 设置水印id
     * @param WaterMarkId 水印id
     */
    public void setWaterMarkId(String WaterMarkId) {
        this.WaterMarkId = WaterMarkId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "CreateMode", this.CreateMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "StreamId", this.StreamId);
        this.setParamSimple(map, prefix + "StreamName", this.StreamName);
        this.setParamSimple(map, prefix + "WaterMarkId", this.WaterMarkId);

    }
}

