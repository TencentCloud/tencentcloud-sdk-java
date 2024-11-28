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
package com.tencentcloudapi.bi.v20220105.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WidgetVO extends AbstractModel {

    /**
    * 组件Id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * 组件name
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WidgetName")
    @Expose
    private String WidgetName;

    /**
     * Get 组件Id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WidgetId 组件Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set 组件Id
注意：此字段可能返回 null，表示取不到有效值。
     * @param WidgetId 组件Id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get 组件name
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WidgetName 组件name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWidgetName() {
        return this.WidgetName;
    }

    /**
     * Set 组件name
注意：此字段可能返回 null，表示取不到有效值。
     * @param WidgetName 组件name
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidgetName(String WidgetName) {
        this.WidgetName = WidgetName;
    }

    public WidgetVO() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WidgetVO(WidgetVO source) {
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetName != null) {
            this.WidgetName = new String(source.WidgetName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "WidgetName", this.WidgetName);

    }
}

