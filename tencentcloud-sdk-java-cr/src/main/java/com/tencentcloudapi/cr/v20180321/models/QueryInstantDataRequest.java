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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryInstantDataRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：Data
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：Query
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 产品ID
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 实例ID，不传默认为系统分配的初始实例
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询类型：callRecord 通话记录
    */
    @SerializedName("QueryModel")
    @Expose
    private String QueryModel;

    /**
    * 查询参数
    */
    @SerializedName("Data")
    @Expose
    private String Data;

    /**
     * Get 模块名，本接口取值：Data 
     * @return Module 模块名，本接口取值：Data
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：Data
     * @param Module 模块名，本接口取值：Data
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：Query 
     * @return Operation 操作名，本接口取值：Query
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：Query
     * @param Operation 操作名，本接口取值：Query
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
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
     * Get 实例ID，不传默认为系统分配的初始实例 
     * @return InstanceId 实例ID，不传默认为系统分配的初始实例
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID，不传默认为系统分配的初始实例
     * @param InstanceId 实例ID，不传默认为系统分配的初始实例
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询类型：callRecord 通话记录 
     * @return QueryModel 查询类型：callRecord 通话记录
     */
    public String getQueryModel() {
        return this.QueryModel;
    }

    /**
     * Set 查询类型：callRecord 通话记录
     * @param QueryModel 查询类型：callRecord 通话记录
     */
    public void setQueryModel(String QueryModel) {
        this.QueryModel = QueryModel;
    }

    /**
     * Get 查询参数 
     * @return Data 查询参数
     */
    public String getData() {
        return this.Data;
    }

    /**
     * Set 查询参数
     * @param Data 查询参数
     */
    public void setData(String Data) {
        this.Data = Data;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "QueryModel", this.QueryModel);
        this.setParamSimple(map, prefix + "Data", this.Data);

    }
}

