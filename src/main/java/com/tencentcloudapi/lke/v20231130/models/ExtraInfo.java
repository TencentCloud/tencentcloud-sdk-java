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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExtraInfo extends AbstractModel {

    /**
    * ECharts信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EChartsInfo")
    @Expose
    private String [] EChartsInfo;

    /**
     * Get ECharts信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EChartsInfo ECharts信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getEChartsInfo() {
        return this.EChartsInfo;
    }

    /**
     * Set ECharts信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param EChartsInfo ECharts信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEChartsInfo(String [] EChartsInfo) {
        this.EChartsInfo = EChartsInfo;
    }

    public ExtraInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExtraInfo(ExtraInfo source) {
        if (source.EChartsInfo != null) {
            this.EChartsInfo = new String[source.EChartsInfo.length];
            for (int i = 0; i < source.EChartsInfo.length; i++) {
                this.EChartsInfo[i] = new String(source.EChartsInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "EChartsInfo.", this.EChartsInfo);

    }
}

