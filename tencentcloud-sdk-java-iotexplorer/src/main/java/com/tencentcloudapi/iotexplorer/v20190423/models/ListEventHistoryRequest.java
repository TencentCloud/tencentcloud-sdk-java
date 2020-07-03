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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListEventHistoryRequest extends AbstractModel{

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 搜索的事件类型：alert 表示告警，fault 表示故障，info 表示信息，为空则表示查询上述所有类型事件
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h
    */
    @SerializedName("StartTime")
    @Expose
    private Long StartTime;

    /**
    * 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间
    */
    @SerializedName("EndTime")
    @Expose
    private Long EndTime;

    /**
    * 搜索上下文, 用作查询游标
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 单次获取的历史数据项目的最大数量
    */
    @SerializedName("Size")
    @Expose
    private Long Size;

    /**
     * Get 产品ID 
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * Get 设备名称 
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * Set 设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * Get 搜索的事件类型：alert 表示告警，fault 表示故障，info 表示信息，为空则表示查询上述所有类型事件 
     * @return Type 搜索的事件类型：alert 表示告警，fault 表示故障，info 表示信息，为空则表示查询上述所有类型事件
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 搜索的事件类型：alert 表示告警，fault 表示故障，info 表示信息，为空则表示查询上述所有类型事件
     * @param Type 搜索的事件类型：alert 表示告警，fault 表示故障，info 表示信息，为空则表示查询上述所有类型事件
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h 
     * @return StartTime 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h
     */
    public Long getStartTime() {
        return this.StartTime;
    }

    /**
     * Set 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h
     * @param StartTime 起始时间（Unix 时间戳，秒级）, 为0 表示 当前时间 - 24h
     */
    public void setStartTime(Long StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * Get 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间 
     * @return EndTime 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间
     */
    public Long getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间
     * @param EndTime 结束时间（Unix 时间戳，秒级）, 为0 表示当前时间
     */
    public void setEndTime(Long EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 搜索上下文, 用作查询游标 
     * @return Context 搜索上下文, 用作查询游标
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 搜索上下文, 用作查询游标
     * @param Context 搜索上下文, 用作查询游标
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 单次获取的历史数据项目的最大数量 
     * @return Size 单次获取的历史数据项目的最大数量
     */
    public Long getSize() {
        return this.Size;
    }

    /**
     * Set 单次获取的历史数据项目的最大数量
     * @param Size 单次获取的历史数据项目的最大数量
     */
    public void setSize(Long Size) {
        this.Size = Size;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Size", this.Size);

    }
}

