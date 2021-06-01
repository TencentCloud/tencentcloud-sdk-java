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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportAssetCoreModuleListRequest extends AbstractModel{

    /**
    * 过滤条件。
<li>Name- string - 是否必填：否 - 包名</li>
<li>User- string - 是否必填：否 - 用户</li>
    */
    @SerializedName("Filters")
    @Expose
    private AssetFilters [] Filters;

    /**
    * 排序方式，asc升序 或 desc降序
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
    * 排序依据:Size,ProcessCount,ModuleCount
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * 服务器Uuid
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 服务器Quuid
    */
    @SerializedName("Quuid")
    @Expose
    private String Quuid;

    /**
     * Get 过滤条件。
<li>Name- string - 是否必填：否 - 包名</li>
<li>User- string - 是否必填：否 - 用户</li> 
     * @return Filters 过滤条件。
<li>Name- string - 是否必填：否 - 包名</li>
<li>User- string - 是否必填：否 - 用户</li>
     */
    public AssetFilters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 过滤条件。
<li>Name- string - 是否必填：否 - 包名</li>
<li>User- string - 是否必填：否 - 用户</li>
     * @param Filters 过滤条件。
<li>Name- string - 是否必填：否 - 包名</li>
<li>User- string - 是否必填：否 - 用户</li>
     */
    public void setFilters(AssetFilters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 排序方式，asc升序 或 desc降序 
     * @return Order 排序方式，asc升序 或 desc降序
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set 排序方式，asc升序 或 desc降序
     * @param Order 排序方式，asc升序 或 desc降序
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    /**
     * Get 排序依据:Size,ProcessCount,ModuleCount 
     * @return By 排序依据:Size,ProcessCount,ModuleCount
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序依据:Size,ProcessCount,ModuleCount
     * @param By 排序依据:Size,ProcessCount,ModuleCount
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get 服务器Uuid 
     * @return Uuid 服务器Uuid
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * Set 服务器Uuid
     * @param Uuid 服务器Uuid
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * Get 服务器Quuid 
     * @return Quuid 服务器Quuid
     */
    public String getQuuid() {
        return this.Quuid;
    }

    /**
     * Set 服务器Quuid
     * @param Quuid 服务器Quuid
     */
    public void setQuuid(String Quuid) {
        this.Quuid = Quuid;
    }

    public ExportAssetCoreModuleListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportAssetCoreModuleListRequest(ExportAssetCoreModuleListRequest source) {
        if (source.Filters != null) {
            this.Filters = new AssetFilters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new AssetFilters(source.Filters[i]);
            }
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Uuid != null) {
            this.Uuid = new String(source.Uuid);
        }
        if (source.Quuid != null) {
            this.Quuid = new String(source.Quuid);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Quuid", this.Quuid);

    }
}

