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

public class AutoScaleGroupAdvanceAttrs extends AbstractModel {

    /**
    * 计算资源高级设置
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ComputeResourceAdvanceParams")
    @Expose
    private ComputeResourceAdvanceParams ComputeResourceAdvanceParams;

    /**
     * Get 计算资源高级设置
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ComputeResourceAdvanceParams 计算资源高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ComputeResourceAdvanceParams getComputeResourceAdvanceParams() {
        return this.ComputeResourceAdvanceParams;
    }

    /**
     * Set 计算资源高级设置
注意：此字段可能返回 null，表示取不到有效值。
     * @param ComputeResourceAdvanceParams 计算资源高级设置
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setComputeResourceAdvanceParams(ComputeResourceAdvanceParams ComputeResourceAdvanceParams) {
        this.ComputeResourceAdvanceParams = ComputeResourceAdvanceParams;
    }

    public AutoScaleGroupAdvanceAttrs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleGroupAdvanceAttrs(AutoScaleGroupAdvanceAttrs source) {
        if (source.ComputeResourceAdvanceParams != null) {
            this.ComputeResourceAdvanceParams = new ComputeResourceAdvanceParams(source.ComputeResourceAdvanceParams);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ComputeResourceAdvanceParams.", this.ComputeResourceAdvanceParams);

    }
}

