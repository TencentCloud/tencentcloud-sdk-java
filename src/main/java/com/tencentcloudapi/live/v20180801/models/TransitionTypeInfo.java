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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TransitionTypeInfo extends AbstractModel {

    /**
    * 转场名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TransitionType")
    @Expose
    private String TransitionType;

    /**
    * 素材url
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SourceUrl")
    @Expose
    private String SourceUrl;

    /**
    * 转场的下标，可用来排序，从1开始递增
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Index")
    @Expose
    private Long Index;

    /**
     * Get 转场名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TransitionType 转场名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTransitionType() {
        return this.TransitionType;
    }

    /**
     * Set 转场名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param TransitionType 转场名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTransitionType(String TransitionType) {
        this.TransitionType = TransitionType;
    }

    /**
     * Get 素材url
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SourceUrl 素材url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSourceUrl() {
        return this.SourceUrl;
    }

    /**
     * Set 素材url
注意：此字段可能返回 null，表示取不到有效值。
     * @param SourceUrl 素材url
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSourceUrl(String SourceUrl) {
        this.SourceUrl = SourceUrl;
    }

    /**
     * Get 转场的下标，可用来排序，从1开始递增
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Index 转场的下标，可用来排序，从1开始递增
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getIndex() {
        return this.Index;
    }

    /**
     * Set 转场的下标，可用来排序，从1开始递增
注意：此字段可能返回 null，表示取不到有效值。
     * @param Index 转场的下标，可用来排序，从1开始递增
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIndex(Long Index) {
        this.Index = Index;
    }

    public TransitionTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TransitionTypeInfo(TransitionTypeInfo source) {
        if (source.TransitionType != null) {
            this.TransitionType = new String(source.TransitionType);
        }
        if (source.SourceUrl != null) {
            this.SourceUrl = new String(source.SourceUrl);
        }
        if (source.Index != null) {
            this.Index = new Long(source.Index);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TransitionType", this.TransitionType);
        this.setParamSimple(map, prefix + "SourceUrl", this.SourceUrl);
        this.setParamSimple(map, prefix + "Index", this.Index);

    }
}

