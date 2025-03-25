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
package com.tencentcloudapi.cdwpg.v20201230.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConfigParams extends AbstractModel {

    /**
    * 名字
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterName")
    @Expose
    private String ParameterName;

    /**
    * 值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterValue")
    @Expose
    private String ParameterValue;

    /**
    * 修改前的值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ParameterOldValue")
    @Expose
    private String ParameterOldValue;

    /**
     * Get 名字
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterName 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterName() {
        return this.ParameterName;
    }

    /**
     * Set 名字
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterName 名字
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterName(String ParameterName) {
        this.ParameterName = ParameterName;
    }

    /**
     * Get 值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterValue 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterValue() {
        return this.ParameterValue;
    }

    /**
     * Set 值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterValue 值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterValue(String ParameterValue) {
        this.ParameterValue = ParameterValue;
    }

    /**
     * Get 修改前的值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ParameterOldValue 修改前的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getParameterOldValue() {
        return this.ParameterOldValue;
    }

    /**
     * Set 修改前的值
注意：此字段可能返回 null，表示取不到有效值。
     * @param ParameterOldValue 修改前的值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setParameterOldValue(String ParameterOldValue) {
        this.ParameterOldValue = ParameterOldValue;
    }

    public ConfigParams() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConfigParams(ConfigParams source) {
        if (source.ParameterName != null) {
            this.ParameterName = new String(source.ParameterName);
        }
        if (source.ParameterValue != null) {
            this.ParameterValue = new String(source.ParameterValue);
        }
        if (source.ParameterOldValue != null) {
            this.ParameterOldValue = new String(source.ParameterOldValue);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ParameterName", this.ParameterName);
        this.setParamSimple(map, prefix + "ParameterValue", this.ParameterValue);
        this.setParamSimple(map, prefix + "ParameterOldValue", this.ParameterOldValue);

    }
}

