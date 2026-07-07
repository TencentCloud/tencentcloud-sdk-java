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
package com.tencentcloudapi.alb.v20251030.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TargetGroupTuple extends AbstractModel {

    /**
    * 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
    */
    @SerializedName("TargetGroupId")
    @Expose
    private String TargetGroupId;

    /**
    * 权重，取值范围：[0, 100]，默认为 10。
    */
    @SerializedName("Weight")
    @Expose
    private Long Weight;

    /**
     * Get 目标组 ID，格式为 lbtg- 后接 8 位字母数字。 
     * @return TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public String getTargetGroupId() {
        return this.TargetGroupId;
    }

    /**
     * Set 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     * @param TargetGroupId 目标组 ID，格式为 lbtg- 后接 8 位字母数字。
     */
    public void setTargetGroupId(String TargetGroupId) {
        this.TargetGroupId = TargetGroupId;
    }

    /**
     * Get 权重，取值范围：[0, 100]，默认为 10。 
     * @return Weight 权重，取值范围：[0, 100]，默认为 10。
     */
    public Long getWeight() {
        return this.Weight;
    }

    /**
     * Set 权重，取值范围：[0, 100]，默认为 10。
     * @param Weight 权重，取值范围：[0, 100]，默认为 10。
     */
    public void setWeight(Long Weight) {
        this.Weight = Weight;
    }

    public TargetGroupTuple() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TargetGroupTuple(TargetGroupTuple source) {
        if (source.TargetGroupId != null) {
            this.TargetGroupId = new String(source.TargetGroupId);
        }
        if (source.Weight != null) {
            this.Weight = new Long(source.Weight);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TargetGroupId", this.TargetGroupId);
        this.setParamSimple(map, prefix + "Weight", this.Weight);

    }
}

