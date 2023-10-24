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
package com.tencentcloudapi.oceanus.v20190422.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TraceModeConfiguration extends AbstractModel {

    /**
    * 如1%转换为0.01
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Rate")
    @Expose
    private String Rate;

    /**
    * 按照算子ID顺序配置，可以对每个算子配置IN、OUT、IN_AND_OUT三个值，分别表示采集输入数据、采集输出数据、同时采集输入和输出数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
     * Get 如1%转换为0.01
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Rate 如1%转换为0.01
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRate() {
        return this.Rate;
    }

    /**
     * Set 如1%转换为0.01
注意：此字段可能返回 null，表示取不到有效值。
     * @param Rate 如1%转换为0.01
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRate(String Rate) {
        this.Rate = Rate;
    }

    /**
     * Get 按照算子ID顺序配置，可以对每个算子配置IN、OUT、IN_AND_OUT三个值，分别表示采集输入数据、采集输出数据、同时采集输入和输出数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 按照算子ID顺序配置，可以对每个算子配置IN、OUT、IN_AND_OUT三个值，分别表示采集输入数据、采集输出数据、同时采集输入和输出数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 按照算子ID顺序配置，可以对每个算子配置IN、OUT、IN_AND_OUT三个值，分别表示采集输入数据、采集输出数据、同时采集输入和输出数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 按照算子ID顺序配置，可以对每个算子配置IN、OUT、IN_AND_OUT三个值，分别表示采集输入数据、采集输出数据、同时采集输入和输出数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    public TraceModeConfiguration() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TraceModeConfiguration(TraceModeConfiguration source) {
        if (source.Rate != null) {
            this.Rate = new String(source.Rate);
        }
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Rate", this.Rate);
        this.setParamSimple(map, prefix + "Operator", this.Operator);

    }
}

