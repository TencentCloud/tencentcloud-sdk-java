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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BanAndAllowRuleDel extends AbstractModel {

    /**
    * 封禁和放通对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
    * 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DirectionList")
    @Expose
    private String DirectionList;

    /**
    * 规则类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
     * Get 封禁和放通对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Ioc 封禁和放通对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set 封禁和放通对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param Ioc 封禁和放通对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    /**
     * Get 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DirectionList 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDirectionList() {
        return this.DirectionList;
    }

    /**
     * Set 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
注意：此字段可能返回 null，表示取不到有效值。
     * @param DirectionList 0互联网出站 1互联网入站 5内网访问源 6内网访问目的
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDirectionList(String DirectionList) {
        this.DirectionList = DirectionList;
    }

    /**
     * Get 规则类型
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleType 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleType 规则类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleType(Long RuleType) {
        this.RuleType = RuleType;
    }

    public BanAndAllowRuleDel() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BanAndAllowRuleDel(BanAndAllowRuleDel source) {
        if (source.Ioc != null) {
            this.Ioc = new String(source.Ioc);
        }
        if (source.DirectionList != null) {
            this.DirectionList = new String(source.DirectionList);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ioc", this.Ioc);
        this.setParamSimple(map, prefix + "DirectionList", this.DirectionList);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

