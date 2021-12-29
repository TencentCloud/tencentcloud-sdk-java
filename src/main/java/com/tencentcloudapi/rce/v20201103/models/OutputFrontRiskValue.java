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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputFrontRiskValue extends AbstractModel{

    /**
    * 请求次数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Requests")
    @Expose
    private Long Requests;

    /**
    * 日期标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private String Index;

    /**
     * Get 请求次数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Requests 请求次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRequests() {
        return this.Requests;
    }

    /**
     * Set 请求次数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Requests 请求次数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRequests(Long Requests) {
        this.Requests = Requests;
    }

    /**
     * Get 日期标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 日期标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIndex() {
        return this.Index;
    }

    /**
     * Set 日期标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 日期标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(String Index) {
        this.Index = Index;
    }

    public OutputFrontRiskValue() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputFrontRiskValue(OutputFrontRiskValue source) {
        if (source.Requests != null) {
            this.Requests = new Long(source.Requests);
        }
        if (source.Index != null) {
            this.Index = new String(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Requests", this.Requests);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

