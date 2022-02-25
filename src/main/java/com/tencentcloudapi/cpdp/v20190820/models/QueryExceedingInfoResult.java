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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class QueryExceedingInfoResult extends AbstractModel{

    /**
    * 记录总数。
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 超额信息数据。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Data")
    @Expose
    private QueryExceedingInfoData [] Data;

    /**
     * Get 记录总数。 
     * @return Count 记录总数。
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 记录总数。
     * @param Count 记录总数。
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 超额信息数据。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Data 超额信息数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public QueryExceedingInfoData [] getData() {
        return this.Data;
    }

    /**
     * Set 超额信息数据。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Data 超额信息数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setData(QueryExceedingInfoData [] Data) {
        this.Data = Data;
    }

    public QueryExceedingInfoResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public QueryExceedingInfoResult(QueryExceedingInfoResult source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.Data != null) {
            this.Data = new QueryExceedingInfoData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new QueryExceedingInfoData(source.Data[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "Data.", this.Data);

    }
}

