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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CustomMatch extends AbstractModel {

    /**
    * <p>请求头  匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HeadersMatch")
    @Expose
    private CompoundCondition HeadersMatch;

    /**
    * <p>请求参数 匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("QueryMatch")
    @Expose
    private CompoundCondition QueryMatch;

    /**
     * Get <p>请求头  匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return HeadersMatch <p>请求头  匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompoundCondition getHeadersMatch() {
        return this.HeadersMatch;
    }

    /**
     * Set <p>请求头  匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param HeadersMatch <p>请求头  匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeadersMatch(CompoundCondition HeadersMatch) {
        this.HeadersMatch = HeadersMatch;
    }

    /**
     * Get <p>请求参数 匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return QueryMatch <p>请求参数 匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public CompoundCondition getQueryMatch() {
        return this.QueryMatch;
    }

    /**
     * Set <p>请求参数 匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     * @param QueryMatch <p>请求参数 匹配条件</p>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setQueryMatch(CompoundCondition QueryMatch) {
        this.QueryMatch = QueryMatch;
    }

    public CustomMatch() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CustomMatch(CustomMatch source) {
        if (source.HeadersMatch != null) {
            this.HeadersMatch = new CompoundCondition(source.HeadersMatch);
        }
        if (source.QueryMatch != null) {
            this.QueryMatch = new CompoundCondition(source.QueryMatch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "HeadersMatch.", this.HeadersMatch);
        this.setParamObj(map, prefix + "QueryMatch.", this.QueryMatch);

    }
}

