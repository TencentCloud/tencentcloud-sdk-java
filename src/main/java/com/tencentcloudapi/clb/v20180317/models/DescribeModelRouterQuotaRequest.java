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
package com.tencentcloudapi.clb.v20180317.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeModelRouterQuotaRequest extends AbstractModel {

    /**
    * <p>配额类型</p>
    */
    @SerializedName("QuotaTypes")
    @Expose
    private String [] QuotaTypes;

    /**
    * <p>要查询的资源ID</p>
    */
    @SerializedName("ResourceIds")
    @Expose
    private String [] ResourceIds;

    /**
    * <p>需要展示的字段</p><p>枚举值：</p><ul><li>Used： 已使用的配额数量</li><li>Available： 剩余的配额数量</li></ul>
    */
    @SerializedName("DisplayFields")
    @Expose
    private String [] DisplayFields;

    /**
     * Get <p>配额类型</p> 
     * @return QuotaTypes <p>配额类型</p>
     */
    public String [] getQuotaTypes() {
        return this.QuotaTypes;
    }

    /**
     * Set <p>配额类型</p>
     * @param QuotaTypes <p>配额类型</p>
     */
    public void setQuotaTypes(String [] QuotaTypes) {
        this.QuotaTypes = QuotaTypes;
    }

    /**
     * Get <p>要查询的资源ID</p> 
     * @return ResourceIds <p>要查询的资源ID</p>
     */
    public String [] getResourceIds() {
        return this.ResourceIds;
    }

    /**
     * Set <p>要查询的资源ID</p>
     * @param ResourceIds <p>要查询的资源ID</p>
     */
    public void setResourceIds(String [] ResourceIds) {
        this.ResourceIds = ResourceIds;
    }

    /**
     * Get <p>需要展示的字段</p><p>枚举值：</p><ul><li>Used： 已使用的配额数量</li><li>Available： 剩余的配额数量</li></ul> 
     * @return DisplayFields <p>需要展示的字段</p><p>枚举值：</p><ul><li>Used： 已使用的配额数量</li><li>Available： 剩余的配额数量</li></ul>
     */
    public String [] getDisplayFields() {
        return this.DisplayFields;
    }

    /**
     * Set <p>需要展示的字段</p><p>枚举值：</p><ul><li>Used： 已使用的配额数量</li><li>Available： 剩余的配额数量</li></ul>
     * @param DisplayFields <p>需要展示的字段</p><p>枚举值：</p><ul><li>Used： 已使用的配额数量</li><li>Available： 剩余的配额数量</li></ul>
     */
    public void setDisplayFields(String [] DisplayFields) {
        this.DisplayFields = DisplayFields;
    }

    public DescribeModelRouterQuotaRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeModelRouterQuotaRequest(DescribeModelRouterQuotaRequest source) {
        if (source.QuotaTypes != null) {
            this.QuotaTypes = new String[source.QuotaTypes.length];
            for (int i = 0; i < source.QuotaTypes.length; i++) {
                this.QuotaTypes[i] = new String(source.QuotaTypes[i]);
            }
        }
        if (source.ResourceIds != null) {
            this.ResourceIds = new String[source.ResourceIds.length];
            for (int i = 0; i < source.ResourceIds.length; i++) {
                this.ResourceIds[i] = new String(source.ResourceIds[i]);
            }
        }
        if (source.DisplayFields != null) {
            this.DisplayFields = new String[source.DisplayFields.length];
            for (int i = 0; i < source.DisplayFields.length; i++) {
                this.DisplayFields[i] = new String(source.DisplayFields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "QuotaTypes.", this.QuotaTypes);
        this.setParamArraySimple(map, prefix + "ResourceIds.", this.ResourceIds);
        this.setParamArraySimple(map, prefix + "DisplayFields.", this.DisplayFields);

    }
}

