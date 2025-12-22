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
package com.tencentcloudapi.tcbr.v20220217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LogResObject extends AbstractModel {

    /**
    * 获取更多检索结果的游标
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Context")
    @Expose
    private String Context;

    /**
    * 搜索结果是否已经全部返回
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ListOver")
    @Expose
    private Boolean ListOver;

    /**
    * 日志内容信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Results")
    @Expose
    private LogObject [] Results;

    /**
     * Get 获取更多检索结果的游标
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Context 获取更多检索结果的游标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContext() {
        return this.Context;
    }

    /**
     * Set 获取更多检索结果的游标
注意：此字段可能返回 null，表示取不到有效值。
     * @param Context 获取更多检索结果的游标
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContext(String Context) {
        this.Context = Context;
    }

    /**
     * Get 搜索结果是否已经全部返回
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ListOver 搜索结果是否已经全部返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getListOver() {
        return this.ListOver;
    }

    /**
     * Set 搜索结果是否已经全部返回
注意：此字段可能返回 null，表示取不到有效值。
     * @param ListOver 搜索结果是否已经全部返回
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setListOver(Boolean ListOver) {
        this.ListOver = ListOver;
    }

    /**
     * Get 日志内容信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Results 日志内容信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LogObject [] getResults() {
        return this.Results;
    }

    /**
     * Set 日志内容信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Results 日志内容信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResults(LogObject [] Results) {
        this.Results = Results;
    }

    public LogResObject() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LogResObject(LogResObject source) {
        if (source.Context != null) {
            this.Context = new String(source.Context);
        }
        if (source.ListOver != null) {
            this.ListOver = new Boolean(source.ListOver);
        }
        if (source.Results != null) {
            this.Results = new LogObject[source.Results.length];
            for (int i = 0; i < source.Results.length; i++) {
                this.Results[i] = new LogObject(source.Results[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Context", this.Context);
        this.setParamSimple(map, prefix + "ListOver", this.ListOver);
        this.setParamArrayObj(map, prefix + "Results.", this.Results);

    }
}

