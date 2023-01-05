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
package com.tencentcloudapi.hasim.v20210716.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TacticInfos extends AbstractModel{

    /**
    * 总量
    */
    @SerializedName("Total")
    @Expose
    private Long Total;

    /**
    * 策略列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("List")
    @Expose
    private Tactic [] List;

    /**
     * Get 总量 
     * @return Total 总量
     */
    public Long getTotal() {
        return this.Total;
    }

    /**
     * Set 总量
     * @param Total 总量
     */
    public void setTotal(Long Total) {
        this.Total = Total;
    }

    /**
     * Get 策略列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return List 策略列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tactic [] getList() {
        return this.List;
    }

    /**
     * Set 策略列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param List 策略列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setList(Tactic [] List) {
        this.List = List;
    }

    public TacticInfos() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TacticInfos(TacticInfos source) {
        if (source.Total != null) {
            this.Total = new Long(source.Total);
        }
        if (source.List != null) {
            this.List = new Tactic[source.List.length];
            for (int i = 0; i < source.List.length; i++) {
                this.List[i] = new Tactic(source.List[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamArrayObj(map, prefix + "List.", this.List);

    }
}

