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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOnCallFormsRequest extends AbstractModel {

    /**
    * 固定值，为"monitor"
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 分页查询起始位
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 分页查询页数
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 支持userId进行检索
    */
    @SerializedName("OnCallFormStaffIDs")
    @Expose
    private String [] OnCallFormStaffIDs;

    /**
    * 值班类型
    */
    @SerializedName("RotationType")
    @Expose
    private String RotationType;

    /**
    * 排序方式
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 支持id、name进行检索
    */
    @SerializedName("OnCallFormName")
    @Expose
    private String OnCallFormName;

    /**
     * Get 固定值，为"monitor" 
     * @return Module 固定值，为"monitor"
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 固定值，为"monitor"
     * @param Module 固定值，为"monitor"
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 分页查询起始位 
     * @return Offset 分页查询起始位
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 分页查询起始位
     * @param Offset 分页查询起始位
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 分页查询页数 
     * @return Limit 分页查询页数
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 分页查询页数
     * @param Limit 分页查询页数
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 支持userId进行检索 
     * @return OnCallFormStaffIDs 支持userId进行检索
     */
    public String [] getOnCallFormStaffIDs() {
        return this.OnCallFormStaffIDs;
    }

    /**
     * Set 支持userId进行检索
     * @param OnCallFormStaffIDs 支持userId进行检索
     */
    public void setOnCallFormStaffIDs(String [] OnCallFormStaffIDs) {
        this.OnCallFormStaffIDs = OnCallFormStaffIDs;
    }

    /**
     * Get 值班类型 
     * @return RotationType 值班类型
     */
    public String getRotationType() {
        return this.RotationType;
    }

    /**
     * Set 值班类型
     * @param RotationType 值班类型
     */
    public void setRotationType(String RotationType) {
        this.RotationType = RotationType;
    }

    /**
     * Get 排序方式 
     * @return Order 排序方式
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式
     * @param Order 排序方式
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 支持id、name进行检索 
     * @return OnCallFormName 支持id、name进行检索
     */
    public String getOnCallFormName() {
        return this.OnCallFormName;
    }

    /**
     * Set 支持id、name进行检索
     * @param OnCallFormName 支持id、name进行检索
     */
    public void setOnCallFormName(String OnCallFormName) {
        this.OnCallFormName = OnCallFormName;
    }

    public DescribeOnCallFormsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOnCallFormsRequest(DescribeOnCallFormsRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.OnCallFormStaffIDs != null) {
            this.OnCallFormStaffIDs = new String[source.OnCallFormStaffIDs.length];
            for (int i = 0; i < source.OnCallFormStaffIDs.length; i++) {
                this.OnCallFormStaffIDs[i] = new String(source.OnCallFormStaffIDs[i]);
            }
        }
        if (source.RotationType != null) {
            this.RotationType = new String(source.RotationType);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.OnCallFormName != null) {
            this.OnCallFormName = new String(source.OnCallFormName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArraySimple(map, prefix + "OnCallFormStaffIDs.", this.OnCallFormStaffIDs);
        this.setParamSimple(map, prefix + "RotationType", this.RotationType);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "OnCallFormName", this.OnCallFormName);

    }
}

