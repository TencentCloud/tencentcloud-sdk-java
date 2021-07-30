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
package com.tencentcloudapi.iotvideo.v20201215.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceActionHistoryRequest extends AbstractModel{

    /**
    * 产品Id
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
    * 开始范围的 unix 毫秒时间戳
    */
    @SerializedName("MinTime")
    @Expose
    private Long MinTime;

    /**
    * 结束范围的 unix 毫秒时间戳
    */
    @SerializedName("MaxTime")
    @Expose
    private Long MaxTime;

    /**
    * 动作Id
    */
    @SerializedName("ActionId")
    @Expose
    private String ActionId;

    /**
    * 查询条数 默认为0 最大不超过500
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 游标，标识查询位置。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
     * Get 产品Id 
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * Set 产品Id
     * @param ProductId 产品Id
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
     * Get 开始范围的 unix 毫秒时间戳 
     * @return MinTime 开始范围的 unix 毫秒时间戳
     */
    public Long getMinTime() {
        return this.MinTime;
    }

    /**
     * Set 开始范围的 unix 毫秒时间戳
     * @param MinTime 开始范围的 unix 毫秒时间戳
     */
    public void setMinTime(Long MinTime) {
        this.MinTime = MinTime;
    }

    /**
     * Get 结束范围的 unix 毫秒时间戳 
     * @return MaxTime 结束范围的 unix 毫秒时间戳
     */
    public Long getMaxTime() {
        return this.MaxTime;
    }

    /**
     * Set 结束范围的 unix 毫秒时间戳
     * @param MaxTime 结束范围的 unix 毫秒时间戳
     */
    public void setMaxTime(Long MaxTime) {
        this.MaxTime = MaxTime;
    }

    /**
     * Get 动作Id 
     * @return ActionId 动作Id
     */
    public String getActionId() {
        return this.ActionId;
    }

    /**
     * Set 动作Id
     * @param ActionId 动作Id
     */
    public void setActionId(String ActionId) {
        this.ActionId = ActionId;
    }

    /**
     * Get 查询条数 默认为0 最大不超过500 
     * @return Limit 查询条数 默认为0 最大不超过500
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询条数 默认为0 最大不超过500
     * @param Limit 查询条数 默认为0 最大不超过500
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 游标，标识查询位置。 
     * @return Context 游标，标识查询位置。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 游标，标识查询位置。
     * @param Context 游标，标识查询位置。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    public DescribeDeviceActionHistoryRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceActionHistoryRequest(DescribeDeviceActionHistoryRequest source) {
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.MinTime != null) {
            this.MinTime = new Long(source.MinTime);
        }
        if (source.MaxTime != null) {
            this.MaxTime = new Long(source.MaxTime);
        }
        if (source.ActionId != null) {
            this.ActionId = new String(source.ActionId);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "MinTime", this.MinTime);
        this.setParamSimple(map, prefix + "MaxTime", this.MaxTime);
        this.setParamSimple(map, prefix + "ActionId", this.ActionId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);

    }
}

