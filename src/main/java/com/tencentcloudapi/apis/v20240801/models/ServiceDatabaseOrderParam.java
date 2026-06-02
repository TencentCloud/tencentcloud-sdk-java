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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceDatabaseOrderParam extends AbstractModel {

    /**
    * <p>字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * <p>排序 asc desc</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Order")
    @Expose
    private String Order;

    /**
     * Get <p>字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldName <p>字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set <p>字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldName <p>字段名称</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get <p>排序 asc desc</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Order <p>排序 asc desc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOrder() {
        return this.Order;
    }

    /**
     * Set <p>排序 asc desc</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Order <p>排序 asc desc</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOrder(String Order) {
        this.Order = Order;
    }

    public ServiceDatabaseOrderParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceDatabaseOrderParam(ServiceDatabaseOrderParam source) {
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.Order != null) {
            this.Order = new String(source.Order);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

