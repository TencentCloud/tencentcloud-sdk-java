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
package com.tencentcloudapi.wedata.v20250806.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListPermissionsRequest extends AbstractModel {

    /**
    * 资源
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table，取catalogName.SchemaName.TableName
    */
    @SerializedName("Resource")
    @Expose
    private PrivilegeResource Resource;

    /**
    * 过滤条件(此参数还未支持)
    */
    @SerializedName("Filters")
    @Expose
    private SecurityFilter [] Filters;

    /**
    * 排序字段(此参数还未支持)
    */
    @SerializedName("OrderFields")
    @Expose
    private OrderField [] OrderFields;

    /**
    * 页参数(此参数还未支持)
    */
    @SerializedName("Page")
    @Expose
    private Page Page;

    /**
     * Get 资源
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table，取catalogName.SchemaName.TableName 
     * @return Resource 资源
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table，取catalogName.SchemaName.TableName
     */
    public PrivilegeResource getResource() {
        return this.Resource;
    }

    /**
     * Set 资源
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table，取catalogName.SchemaName.TableName
     * @param Resource 资源
ResourceType：来源于TCCATALOG模块的GetGrantPrivilegesSTD接口中返回的ResourceType，并改为首字母大写，例如METALAKE对应Metalake
ResourceUri，取决于 ResourceType，Metalake时固定为default，其他类别采用catalog的三段式结构，例如
- Metalake，固定为default
- Catalog，取catalogName
- Schema，取catalogName.SchemaName
- Table，取catalogName.SchemaName.TableName
     */
    public void setResource(PrivilegeResource Resource) {
        this.Resource = Resource;
    }

    /**
     * Get 过滤条件(此参数还未支持) 
     * @return Filters 过滤条件(此参数还未支持)
     */
    public SecurityFilter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件(此参数还未支持)
     * @param Filters 过滤条件(此参数还未支持)
     */
    public void setFilters(SecurityFilter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序字段(此参数还未支持) 
     * @return OrderFields 排序字段(此参数还未支持)
     */
    public OrderField [] getOrderFields() {
        return this.OrderFields;
    }

    /**
     * Set 排序字段(此参数还未支持)
     * @param OrderFields 排序字段(此参数还未支持)
     */
    public void setOrderFields(OrderField [] OrderFields) {
        this.OrderFields = OrderFields;
    }

    /**
     * Get 页参数(此参数还未支持) 
     * @return Page 页参数(此参数还未支持)
     */
    public Page getPage() {
        return this.Page;
    }

    /**
     * Set 页参数(此参数还未支持)
     * @param Page 页参数(此参数还未支持)
     */
    public void setPage(Page Page) {
        this.Page = Page;
    }

    public ListPermissionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListPermissionsRequest(ListPermissionsRequest source) {
        if (source.Resource != null) {
            this.Resource = new PrivilegeResource(source.Resource);
        }
        if (source.Filters != null) {
            this.Filters = new SecurityFilter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new SecurityFilter(source.Filters[i]);
            }
        }
        if (source.OrderFields != null) {
            this.OrderFields = new OrderField[source.OrderFields.length];
            for (int i = 0; i < source.OrderFields.length; i++) {
                this.OrderFields[i] = new OrderField(source.OrderFields[i]);
            }
        }
        if (source.Page != null) {
            this.Page = new Page(source.Page);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Resource.", this.Resource);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "OrderFields.", this.OrderFields);
        this.setParamObj(map, prefix + "Page.", this.Page);

    }
}

