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

public class SearchRange extends AbstractModel {

    /**
    * 检索条件and/or
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * 自定义变量和标签关系数据	
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApiVarAttrInfos")
    @Expose
    private ApiVarAttrInfo [] ApiVarAttrInfos;

    /**
     * Get 检索条件and/or
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Condition 检索条件and/or
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * Set 检索条件and/or
注意：此字段可能返回 null，表示取不到有效值。
     * @param Condition 检索条件and/or
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * Get 自定义变量和标签关系数据	
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApiVarAttrInfos 自定义变量和标签关系数据	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApiVarAttrInfo [] getApiVarAttrInfos() {
        return this.ApiVarAttrInfos;
    }

    /**
     * Set 自定义变量和标签关系数据	
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApiVarAttrInfos 自定义变量和标签关系数据	
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApiVarAttrInfos(ApiVarAttrInfo [] ApiVarAttrInfos) {
        this.ApiVarAttrInfos = ApiVarAttrInfos;
    }

    public SearchRange() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchRange(SearchRange source) {
        if (source.Condition != null) {
            this.Condition = new String(source.Condition);
        }
        if (source.ApiVarAttrInfos != null) {
            this.ApiVarAttrInfos = new ApiVarAttrInfo[source.ApiVarAttrInfos.length];
            for (int i = 0; i < source.ApiVarAttrInfos.length; i++) {
                this.ApiVarAttrInfos[i] = new ApiVarAttrInfo(source.ApiVarAttrInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamArrayObj(map, prefix + "ApiVarAttrInfos.", this.ApiVarAttrInfos);

    }
}

