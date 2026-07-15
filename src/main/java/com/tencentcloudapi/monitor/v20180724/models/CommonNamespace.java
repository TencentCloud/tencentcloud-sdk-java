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

public class CommonNamespace extends AbstractModel {

    /**
    * <p>命名空间标示</p>
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * <p>命名空间名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>命名空间值</p>
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * <p>产品名称</p>
    */
    @SerializedName("ProductName")
    @Expose
    private String ProductName;

    /**
    * <p>配置信息</p>
    */
    @SerializedName("Config")
    @Expose
    private String Config;

    /**
    * <p>支持地域列表</p>
    */
    @SerializedName("AvailableRegions")
    @Expose
    private String [] AvailableRegions;

    /**
    * <p>排序Id</p>
    */
    @SerializedName("SortId")
    @Expose
    private Long SortId;

    /**
    * <p>Dashboard中的唯一表示</p>
    */
    @SerializedName("DashboardId")
    @Expose
    private String DashboardId;

    /**
     * Get <p>命名空间标示</p> 
     * @return Id <p>命名空间标示</p>
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set <p>命名空间标示</p>
     * @param Id <p>命名空间标示</p>
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get <p>命名空间名称</p> 
     * @return Name <p>命名空间名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>命名空间名称</p>
     * @param Name <p>命名空间名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>命名空间值</p> 
     * @return Value <p>命名空间值</p>
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set <p>命名空间值</p>
     * @param Value <p>命名空间值</p>
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get <p>产品名称</p> 
     * @return ProductName <p>产品名称</p>
     */
    public String getProductName() {
        return this.ProductName;
    }

    /**
     * Set <p>产品名称</p>
     * @param ProductName <p>产品名称</p>
     */
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    /**
     * Get <p>配置信息</p> 
     * @return Config <p>配置信息</p>
     */
    public String getConfig() {
        return this.Config;
    }

    /**
     * Set <p>配置信息</p>
     * @param Config <p>配置信息</p>
     */
    public void setConfig(String Config) {
        this.Config = Config;
    }

    /**
     * Get <p>支持地域列表</p> 
     * @return AvailableRegions <p>支持地域列表</p>
     */
    public String [] getAvailableRegions() {
        return this.AvailableRegions;
    }

    /**
     * Set <p>支持地域列表</p>
     * @param AvailableRegions <p>支持地域列表</p>
     */
    public void setAvailableRegions(String [] AvailableRegions) {
        this.AvailableRegions = AvailableRegions;
    }

    /**
     * Get <p>排序Id</p> 
     * @return SortId <p>排序Id</p>
     */
    public Long getSortId() {
        return this.SortId;
    }

    /**
     * Set <p>排序Id</p>
     * @param SortId <p>排序Id</p>
     */
    public void setSortId(Long SortId) {
        this.SortId = SortId;
    }

    /**
     * Get <p>Dashboard中的唯一表示</p> 
     * @return DashboardId <p>Dashboard中的唯一表示</p>
     */
    public String getDashboardId() {
        return this.DashboardId;
    }

    /**
     * Set <p>Dashboard中的唯一表示</p>
     * @param DashboardId <p>Dashboard中的唯一表示</p>
     */
    public void setDashboardId(String DashboardId) {
        this.DashboardId = DashboardId;
    }

    public CommonNamespace() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CommonNamespace(CommonNamespace source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.ProductName != null) {
            this.ProductName = new String(source.ProductName);
        }
        if (source.Config != null) {
            this.Config = new String(source.Config);
        }
        if (source.AvailableRegions != null) {
            this.AvailableRegions = new String[source.AvailableRegions.length];
            for (int i = 0; i < source.AvailableRegions.length; i++) {
                this.AvailableRegions[i] = new String(source.AvailableRegions[i]);
            }
        }
        if (source.SortId != null) {
            this.SortId = new Long(source.SortId);
        }
        if (source.DashboardId != null) {
            this.DashboardId = new String(source.DashboardId);
        }
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

