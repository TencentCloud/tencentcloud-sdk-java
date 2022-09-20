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

public class DropPageConfig extends AbstractModel{

    /**
    * 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * Waf(托管规则)模块的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WafDropPageDetail")
    @Expose
    private DropPageDetail WafDropPageDetail;

    /**
    * 自定义页面的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AclDropPageDetail")
    @Expose
    private DropPageDetail AclDropPageDetail;

    /**
     * Get 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li> 
     * @return Switch 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     * @param Switch 配置开关，取值有：
<li>on：开启；</li>
<li>off：关闭。</li>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get Waf(托管规则)模块的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WafDropPageDetail Waf(托管规则)模块的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DropPageDetail getWafDropPageDetail() {
        return this.WafDropPageDetail;
    }

    /**
     * Set Waf(托管规则)模块的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param WafDropPageDetail Waf(托管规则)模块的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWafDropPageDetail(DropPageDetail WafDropPageDetail) {
        this.WafDropPageDetail = WafDropPageDetail;
    }

    /**
     * Get 自定义页面的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AclDropPageDetail 自定义页面的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DropPageDetail getAclDropPageDetail() {
        return this.AclDropPageDetail;
    }

    /**
     * Set 自定义页面的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     * @param AclDropPageDetail 自定义页面的拦截页面配置。如果为null，默认使用历史配置。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAclDropPageDetail(DropPageDetail AclDropPageDetail) {
        this.AclDropPageDetail = AclDropPageDetail;
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
        if (source.WafDropPageDetail != null) {
            this.WafDropPageDetail = new DropPageDetail(source.WafDropPageDetail);
        }
        if (source.AclDropPageDetail != null) {
            this.AclDropPageDetail = new DropPageDetail(source.AclDropPageDetail);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamObj(map, prefix + "WafDropPageDetail.", this.WafDropPageDetail);
        this.setParamObj(map, prefix + "AclDropPageDetail.", this.AclDropPageDetail);

    }
}

