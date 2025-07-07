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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FlowExtraDetail extends AbstractModel {

    /**
    * 额外信息Title
    */
    @SerializedName("Title")
    @Expose
    private String Title;

    /**
    * 额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Detail")
    @Expose
    private FlowParamsDesc [] Detail;

    /**
     * Get 额外信息Title 
     * @return Title 额外信息Title
     */
    public String getTitle() {
        return this.Title;
    }

    /**
     * Set 额外信息Title
     * @param Title 额外信息Title
     */
    public void setTitle(String Title) {
        this.Title = Title;
    }

    /**
     * Get 额外信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Detail 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public FlowParamsDesc [] getDetail() {
        return this.Detail;
    }

    /**
     * Set 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Detail 额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetail(FlowParamsDesc [] Detail) {
        this.Detail = Detail;
    }

    public FlowExtraDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FlowExtraDetail(FlowExtraDetail source) {
        if (source.Title != null) {
            this.Title = new String(source.Title);
        }
        if (source.Detail != null) {
            this.Detail = new FlowParamsDesc[source.Detail.length];
            for (int i = 0; i < source.Detail.length; i++) {
                this.Detail[i] = new FlowParamsDesc(source.Detail[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Title", this.Title);
        this.setParamArrayObj(map, prefix + "Detail.", this.Detail);

    }
}

