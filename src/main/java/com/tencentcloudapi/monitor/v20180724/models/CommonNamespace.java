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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonNamespace extends AbstractModel{

    /**
    * 命名空间标示
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 命名空间名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 命名空间值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 产品名称
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * 配置信息
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * 支持地域列表
    */
    @SerializedName("AvailableRegions")
    @Expose
    private String [] AvailableRegions;

    /**
    * 排序Id
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * Dashboard中的唯一表示
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
     * Get 命名空间标示 
     * @return Id 命名空间标示
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 命名空间标示
     * @param Id 命名空间标示
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 命名空间名称 
     * @return Name 命名空间名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 命名空间名称
     * @param Name 命名空间名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 命名空间值 
     * @return Value 命名空间值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 命名空间值
     * @param Value 命名空间值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 产品名称 
     * @return ProductName 产品名称
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set 产品名称
     * @param ProductName 产品名称
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get 配置信息 
     * @return Config 配置信息
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set 配置信息
     * @param Config 配置信息
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get 支持地域列表 
     * @return AvailableRegions 支持地域列表
     */
    public String [] getAvailableRegions() {
        return this.AvailableRegions;
    }

    /**
     * Set 支持地域列表
     * @param AvailableRegions 支持地域列表
     */
    public void setAvailableRegions(String [] AvailableRegions) {
        this.AvailableRegions = AvailableRegions;
    }

    /**
     * Get 排序Id 
     * @return SortId 排序Id
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set 排序Id
     * @param SortId 排序Id
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get Dashboard中的唯一表示 
     * @return DashboardId Dashboard中的唯一表示
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set Dashboard中的唯一表示
     * @param DashboardId Dashboard中的唯一表示
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "ProductName", this.ProductName);
        this.setParamSimple(map, prefix + "Config", this.Config);
        this.setParamArraySimple(map, prefix + "AvailableRegions.", this.AvailableRegions);
        this.setParamSimple(map, prefix + "SortId", this.SortId);
        this.setParamSimple(map, prefix + "DashboardId", this.DashboardId);

    }
}

