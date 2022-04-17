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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafThreatenIntelligenceDetails extends AbstractModel{

    /**
    * 封禁模组启用状态
    */
    @SerializedName("DefenseStatus")
    @Expose
    private Long DefenseStatus;

    /**
    * 封禁属性标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private String [] Tags;

    /**
    * 最后更新时间
    */
    @SerializedName("LastUpdateTime")
    @Expose
    private String LastUpdateTime;

    /**
     * Get 封禁模组启用状态 
     * @return DefenseStatus 封禁模组启用状态
     */
    public Long getDefenseStatus() {
        return this.DefenseStatus;
    }

    /**
     * Set 封禁模组启用状态
     * @param DefenseStatus 封禁模组启用状态
     */
    public void setDefenseStatus(Long DefenseStatus) {
        this.DefenseStatus = DefenseStatus;
    }

    /**
     * Get 封禁属性标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 封禁属性标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getTags() {
        return this.Tags;
    }

    /**
     * Set 封禁属性标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 封禁属性标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(String [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 最后更新时间 
     * @return LastUpdateTime 最后更新时间
     */
    public String getLastUpdateTime() {
        return this.LastUpdateTime;
    }

    /**
     * Set 最后更新时间
     * @param LastUpdateTime 最后更新时间
     */
    public void setLastUpdateTime(String LastUpdateTime) {
        this.LastUpdateTime = LastUpdateTime;
    }

    public WafThreatenIntelligenceDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafThreatenIntelligenceDetails(WafThreatenIntelligenceDetails source) {
        if (source.DefenseStatus != null) {
            this.DefenseStatus = new Long(source.DefenseStatus);
        }
        if (source.Tags != null) {
            this.Tags = new String[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new String(source.Tags[i]);
            }
        }
        if (source.LastUpdateTime != null) {
            this.LastUpdateTime = new String(source.LastUpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DefenseStatus", this.DefenseStatus);
        this.setParamArraySimple(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "LastUpdateTime", this.LastUpdateTime);

    }
}

