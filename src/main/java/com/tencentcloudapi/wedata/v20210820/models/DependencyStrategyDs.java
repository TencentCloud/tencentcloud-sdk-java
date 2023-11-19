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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DependencyStrategyDs extends AbstractModel {

    /**
    * 等待（默认策略）或 执行
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PollingNullStrategy")
    @Expose
    private String PollingNullStrategy;

    /**
     * Get 等待（默认策略）或 执行
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PollingNullStrategy 等待（默认策略）或 执行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPollingNullStrategy() {
        return this.PollingNullStrategy;
    }

    /**
     * Set 等待（默认策略）或 执行
注意：此字段可能返回 null，表示取不到有效值。
     * @param PollingNullStrategy 等待（默认策略）或 执行
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPollingNullStrategy(String PollingNullStrategy) {
        this.PollingNullStrategy = PollingNullStrategy;
    }

    public DependencyStrategyDs() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DependencyStrategyDs(DependencyStrategyDs source) {
        if (source.PollingNullStrategy != null) {
            this.PollingNullStrategy = new String(source.PollingNullStrategy);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PollingNullStrategy", this.PollingNullStrategy);

    }
}

