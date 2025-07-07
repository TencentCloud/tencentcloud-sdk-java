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
package com.tencentcloudapi.rce.v20201103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputDescribeNameListInfo extends AbstractModel {

    /**
    * 总数
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
    * 列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private OutputDescribeNameListFrontFix [] List;

    /**
     * Get 总数 
     * @return Count 总数
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set 总数
     * @param Count 总数
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    /**
     * Get 列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public OutputDescribeNameListFrontFix [] getList() {
        return this.List;
    }

    /**
     * Set 列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(OutputDescribeNameListFrontFix [] List) {
        this.List = List;
    }

    public OutputDescribeNameListInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputDescribeNameListInfo(OutputDescribeNameListInfo source) {
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
        if (source.List != null) {
            this.List = new OutputDescribeNameListFrontFix[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new OutputDescribeNameListFrontFix(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

