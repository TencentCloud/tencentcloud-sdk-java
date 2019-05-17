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

public class DescribeDeviceDataHistoryRequest  extends AbstractModel{

    /**
    * 区间开始时间
    */
    @SerializedName("MinTime")
    @Expose
    private Long MinTime;

    /**
    * 区间结束时间
    */
    @SerializedName("MaxTime")
    @Expose
    private Long MaxTime;

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
    * 属性字段名称
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 返回条数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 检索上下文
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * 获取区间开始时间
     * @return MinTime 区间开始时间
     */
    public Long getMinTime() {
        return this.MinTime;
    }

    /**
     * 设置区间开始时间
     * @param MinTime 区间开始时间
     */
    public void setMinTime(Long MinTime) {
        this.MinTime = MinTime;
    }

    /**
     * 获取区间结束时间
     * @return MaxTime 区间结束时间
     */
    public Long getMaxTime() {
        return this.MaxTime;
    }

    /**
     * 设置区间结束时间
     * @param MaxTime 区间结束时间
     */
    public void setMaxTime(Long MaxTime) {
        this.MaxTime = MaxTime;
    }

    /**
     * 获取产品ID
     * @return ProductId 产品ID
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品ID
     * @param ProductId 产品ID
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取设备名称
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 获取属性字段名称
     * @return FieldName 属性字段名称
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * 设置属性字段名称
     * @param FieldName 属性字段名称
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * 获取返回条数
     * @return Limit 返回条数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回条数
     * @param Limit 返回条数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取检索上下文
     * @return Context 检索上下文
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * 设置检索上下文
     * @param Context 检索上下文
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinTime", this.MinTime);
        this.setParamSimple(map, prefix + "MaxTime", this.MaxTime);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

