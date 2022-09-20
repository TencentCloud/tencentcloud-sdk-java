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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class WafGroup extends AbstractModel{

    /**
    * 执行动作，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TypeId")
    @Expose
    private Long TypeId;

    /**
     * Get 执行动作，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Action 执行动作，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 执行动作，取值有：
<li> block：阻断；</li>
<li> observe：观察。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Level 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * Set 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Level 防护级别，取值有：
<li> loose：宽松；</li>
<li> normal：正常；</li>
<li> strict：严格；</li>
<li> stricter：超严格；</li>
<li> custom：自定义。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * Get 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TypeId 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTypeId() {
        return this.TypeId;
    }

    /**
     * Set 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TypeId 规则类型id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTypeId(Long TypeId) {
        this.TypeId = TypeId;
    }

    public WafGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public WafGroup(WafGroup source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Level != null) {
            this.Level = new String(source.Level);
        }
        if (source.TypeId != null) {
            this.TypeId = new Long(source.TypeId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "TypeId", this.TypeId);

    }
}

