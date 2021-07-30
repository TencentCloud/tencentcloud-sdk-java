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

public class DescribeDeviceCommLogRequest extends AbstractModel{

    /**
    * 开始时间 13位时间戳 单位毫秒
    */
    @SerializedName("MinTime")
    @Expose
    private Long MinTime;

    /**
    * 结束时间 13位时间戳 单位毫秒
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
    * 返回条数 默认为50
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
    * 类型：shadow 下行，device 上行 默认为空则全部查询
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 开始时间 13位时间戳 单位毫秒 
     * @return MinTime 开始时间 13位时间戳 单位毫秒
     */
    public Long getMinTime() {
        return this.MinTime;
    }

    /**
     * Set 开始时间 13位时间戳 单位毫秒
     * @param MinTime 开始时间 13位时间戳 单位毫秒
     */
    public void setMinTime(Long MinTime) {
        this.MinTime = MinTime;
    }

    /**
     * Get 结束时间 13位时间戳 单位毫秒 
     * @return MaxTime 结束时间 13位时间戳 单位毫秒
     */
    public Long getMaxTime() {
        return this.MaxTime;
    }

    /**
     * Set 结束时间 13位时间戳 单位毫秒
     * @param MaxTime 结束时间 13位时间戳 单位毫秒
     */
    public void setMaxTime(Long MaxTime) {
        this.MaxTime = MaxTime;
    }

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
     * Get 返回条数 默认为50 
     * @return Limit 返回条数 默认为50
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 返回条数 默认为50
     * @param Limit 返回条数 默认为50
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 检索上下文 
     * @return Context 检索上下文
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 检索上下文
     * @param Context 检索上下文
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 类型：shadow 下行，device 上行 默认为空则全部查询 
     * @return Type 类型：shadow 下行，device 上行 默认为空则全部查询
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 类型：shadow 下行，device 上行 默认为空则全部查询
     * @param Type 类型：shadow 下行，device 上行 默认为空则全部查询
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    public DescribeDeviceCommLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceCommLogRequest(DescribeDeviceCommLogRequest source) {
        if (source.MinTime != null) {
            this.MinTime = new Long(source.MinTime);
        }
        if (source.MaxTime != null) {
            this.MaxTime = new Long(source.MaxTime);
        }
        if (source.ProductId != null) {
            this.ProductId = new String(source.ProductId);
        }
        if (source.DeviceName != null) {
            this.DeviceName = new String(source.DeviceName);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MinTime", this.MinTime);
        this.setParamSimple(map, prefix + "MaxTime", this.MaxTime);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

