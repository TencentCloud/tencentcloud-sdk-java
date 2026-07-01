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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AttackStageCount extends AbstractModel {

    /**
    * <p>攻击阶段</p>
    */
    @SerializedName("AttackStage")
    @Expose
    private String AttackStage;

    /**
    * <p>策略数量</p>
    */
    @SerializedName("Count")
    @Expose
    private Long Count;

    /**
     * Get <p>攻击阶段</p> 
     * @return AttackStage <p>攻击阶段</p>
     */
    public String getAttackStage() {
        return this.AttackStage;
    }

    /**
     * Set <p>攻击阶段</p>
     * @param AttackStage <p>攻击阶段</p>
     */
    public void setAttackStage(String AttackStage) {
        this.AttackStage = AttackStage;
    }

    /**
     * Get <p>策略数量</p> 
     * @return Count <p>策略数量</p>
     */
    public Long getCount() {
        return this.Count;
    }

    /**
     * Set <p>策略数量</p>
     * @param Count <p>策略数量</p>
     */
    public void setCount(Long Count) {
        this.Count = Count;
    }

    public AttackStageCount() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AttackStageCount(AttackStageCount source) {
        if (source.AttackStage != null) {
            this.AttackStage = new String(source.AttackStage);
        }
        if (source.Count != null) {
            this.Count = new Long(source.Count);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AttackStage", this.AttackStage);
        this.setParamSimple(map, prefix + "Count", this.Count);

    }
}

