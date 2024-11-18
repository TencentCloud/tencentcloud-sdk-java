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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationalFunctionsRequest extends AbstractModel {

    /**
    * 场景类型：开发、使用
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 项目 ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 函数名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 标准模式开发环境：DEV
标准模式生产环境：PROD
简单模式：ALL

    */
    @SerializedName("EnvType")
    @Expose
    private String EnvType;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 排序条件
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
     * Get 场景类型：开发、使用 
     * @return Type 场景类型：开发、使用
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 场景类型：开发、使用
     * @param Type 场景类型：开发、使用
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 项目 ID 
     * @return ProjectId 项目 ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目 ID
     * @param ProjectId 项目 ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 函数名称 
     * @return Name 函数名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 函数名称
     * @param Name 函数名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 展示名称 
     * @return DisplayName 展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 展示名称
     * @param DisplayName 展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 标准模式开发环境：DEV
标准模式生产环境：PROD
简单模式：ALL
 
     * @return EnvType 标准模式开发环境：DEV
标准模式生产环境：PROD
简单模式：ALL

     */
    public String getEnvType() {
        return this.EnvType;
    }

    /**
     * Set 标准模式开发环境：DEV
标准模式生产环境：PROD
简单模式：ALL

     * @param EnvType 标准模式开发环境：DEV
标准模式生产环境：PROD
简单模式：ALL

     */
    public void setEnvType(String EnvType) {
        this.EnvType = EnvType;
    }

    /**
     * Get 过滤条件 
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序条件 
     * @return OrderFields 排序条件
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序条件
     * @param OrderFields 排序条件
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    public DescribeOrganizationalFunctionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationalFunctionsRequest(DescribeOrganizationalFunctionsRequest source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.EnvType != null) {
            this.EnvType = new String(source.EnvType);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "EnvType", this.EnvType);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);

    }
}

