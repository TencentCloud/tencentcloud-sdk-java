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
    * <p>固定值，为&quot;monitor&quot;</p>
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * <p>分页查询起始位</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * <p>分页查询页数</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>支持userId进行检索</p>
    */
    @SerializedName("OnCallFormStaffIDs")
    @Expose
    private String [] OnCallFormStaffIDs;

    /**
    * <p>值班类型</p>
    */
    @SerializedName("RotationType")
    @Expose
    private String RotationType;

    /**
    * <p>排序方式</p>
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * <p>支持id、name进行检索</p>
    */
    @SerializedName("OnCallFormName")
    @Expose
    private String OnCallFormName;

    /**
     * Get <p>固定值，为&quot;monitor&quot;</p> 
     * @return Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set <p>固定值，为&quot;monitor&quot;</p>
     * @param Module <p>固定值，为&quot;monitor&quot;</p>
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get <p>分页查询起始位</p> 
     * @return Offset <p>分页查询起始位</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>分页查询起始位</p>
     * @param Offset <p>分页查询起始位</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get <p>分页查询页数</p> 
     * @return Limit <p>分页查询页数</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>分页查询页数</p>
     * @param Limit <p>分页查询页数</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>支持userId进行检索</p> 
     * @return OnCallFormStaffIDs <p>支持userId进行检索</p>
     */
    public String [] getOnCallFormStaffIDs() {
        return this.OnCallFormStaffIDs;
    }

    /**
     * Set <p>支持userId进行检索</p>
     * @param OnCallFormStaffIDs <p>支持userId进行检索</p>
     */
    public void setOnCallFormStaffIDs(String [] OnCallFormStaffIDs) {
        this.OnCallFormStaffIDs = OnCallFormStaffIDs;
    }

    /**
     * Get <p>值班类型</p> 
     * @return RotationType <p>值班类型</p>
     */
    public String getRotationType() {
        return this.RotationType;
    }

    /**
     * Set <p>值班类型</p>
     * @param RotationType <p>值班类型</p>
     */
    public void setRotationType(String RotationType) {
        this.RotationType = RotationType;
    }

    /**
     * Get <p>排序方式</p> 
     * @return Order <p>排序方式</p>
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序方式</p>
     * @param Order <p>排序方式</p>
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get <p>支持id、name进行检索</p> 
     * @return OnCallFormName <p>支持id、name进行检索</p>
     */
    public String getOnCallFormName() {
        return this.OnCallFormName;
    }

    /**
     * Set <p>支持id、name进行检索</p>
     * @param OnCallFormName <p>支持id、name进行检索</p>
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

