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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DropPageConfig extends AbstractModel{

    /**
    * 配置开关。
1. on 开启
2. off 关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Waf(托管规则)模块的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Waf")
    @Expose
    private DropPageDetail Waf;

    /**
    * 自定义页面的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Acl")
    @Expose
    private DropPageDetail Acl;

    /**
     * Get 配置开关。
1. on 开启
2. off 关闭 
     * @return Switch 配置开关。
1. on 开启
2. off 关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 配置开关。
1. on 开启
2. off 关闭
     * @param Switch 配置开关。
1. on 开启
2. off 关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Waf(托管规则)模块的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Waf Waf(托管规则)模块的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DropPageDetail getWaf() {
        return this.Waf;
    }

    /**
     * Set Waf(托管规则)模块的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Waf Waf(托管规则)模块的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWaf(DropPageDetail Waf) {
        this.Waf = Waf;
    }

    /**
     * Get 自定义页面的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Acl 自定义页面的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DropPageDetail getAcl() {
        return this.Acl;
    }

    /**
     * Set 自定义页面的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Acl 自定义页面的拦截页面配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAcl(DropPageDetail Acl) {
        this.Acl = Acl;
    }

    public DropPageConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DropPageConfig(DropPageConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.Waf != null) {
            this.Waf = new DropPageDetail(source.Waf);
        }
        if (source.Acl != null) {
            this.Acl = new DropPageDetail(source.Acl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "Waf.", this.Waf);
        this.setParamObj(map, prefix + "Acl.", this.Acl);

    }
}

