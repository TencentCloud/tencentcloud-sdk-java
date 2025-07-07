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
package com.tencentcloudapi.live.v20180801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HlsSpecialParam extends AbstractModel {

    /**
    * HLS续流超时时间。
取值范围[0，1800]。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FlowContinueDuration")
    @Expose
    private Long FlowContinueDuration;

    /**
     * Get HLS续流超时时间。
取值范围[0，1800]。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FlowContinueDuration HLS续流超时时间。
取值范围[0，1800]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFlowContinueDuration() {
        return this.FlowContinueDuration;
    }

    /**
     * Set HLS续流超时时间。
取值范围[0，1800]。
注意：此字段可能返回 null，表示取不到有效值。
     * @param FlowContinueDuration HLS续流超时时间。
取值范围[0，1800]。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFlowContinueDuration(Long FlowContinueDuration) {
        this.FlowContinueDuration = FlowContinueDuration;
    }

    public HlsSpecialParam() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HlsSpecialParam(HlsSpecialParam source) {
        if (source.FlowContinueDuration != null) {
            this.FlowContinueDuration = new Long(source.FlowContinueDuration);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowContinueDuration", this.FlowContinueDuration);

    }
}

