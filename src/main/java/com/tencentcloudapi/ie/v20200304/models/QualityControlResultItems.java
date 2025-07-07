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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QualityControlResultItems extends AbstractModel {

    /**
    * 异常类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 质检结果项
    */
    @SerializedName("QualityControlItems")
    @Expose
    private QualityControlItem [] QualityControlItems;

    /**
     * Get 异常类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 异常类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 异常类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 异常类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 质检结果项 
     * @return QualityControlItems 质检结果项
     */
    public QualityControlItem [] getQualityControlItems() {
        return this.QualityControlItems;
    }

    /**
     * Set 质检结果项
     * @param QualityControlItems 质检结果项
     */
    public void setQualityControlItems(QualityControlItem [] QualityControlItems) {
        this.QualityControlItems = QualityControlItems;
    }

    public QualityControlResultItems() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QualityControlResultItems(QualityControlResultItems source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.QualityControlItems != null) {
            this.QualityControlItems = new QualityControlItem[source.QualityControlItems.length];
            for (int i = 0; i < source.QualityControlItems.length; i++) {
                this.QualityControlItems[i] = new QualityControlItem(source.QualityControlItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArrayObj(map, prefix + "QualityControlItems.", this.QualityControlItems);

    }
}

