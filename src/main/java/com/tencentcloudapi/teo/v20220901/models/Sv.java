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

public class Sv extends AbstractModel{

    /**
    * 询价参数键。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 询价参数值。
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 询价参数映射的配额，取值有：
<li>zone：站点数；</li>
<li>custom-rule：自定义规则数；</li>
<li>rate-limiting-rule：速率限制规则数；</li>
<li>l4-proxy-instance：四层代理实例数。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Pack")
    @Expose
    private String Pack;

    /**
    * 询价参数映射的四层代理实例Id。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 询价参数对应的防护等级。
取值有： <li> cm_30G：中国大陆加速区域保底防护30Gbps；</li><li> cm_60G：中国大陆加速区域保底防护60Gbps；</li><li> cm_100G：中国大陆加速区域保底防护100Gbps；</li><li> anycast_300G：全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> anycast_unlimited：全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_30G_anycast_300G：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_30G_anycast_unlimited：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_60G_anycast_300G：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_60G_anycast_unlimited：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_100G_anycast_300G：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_100G_anycast_unlimited：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProtectionSpecs")
    @Expose
    private String ProtectionSpecs;

    /**
     * Get 询价参数键。 
     * @return Key 询价参数键。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 询价参数键。
     * @param Key 询价参数键。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 询价参数值。 
     * @return Value 询价参数值。
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 询价参数值。
     * @param Value 询价参数值。
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 询价参数映射的配额，取值有：
<li>zone：站点数；</li>
<li>custom-rule：自定义规则数；</li>
<li>rate-limiting-rule：速率限制规则数；</li>
<li>l4-proxy-instance：四层代理实例数。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Pack 询价参数映射的配额，取值有：
<li>zone：站点数；</li>
<li>custom-rule：自定义规则数；</li>
<li>rate-limiting-rule：速率限制规则数；</li>
<li>l4-proxy-instance：四层代理实例数。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPack() {
        return this.Pack;
    }

    /**
     * Set 询价参数映射的配额，取值有：
<li>zone：站点数；</li>
<li>custom-rule：自定义规则数；</li>
<li>rate-limiting-rule：速率限制规则数；</li>
<li>l4-proxy-instance：四层代理实例数。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Pack 询价参数映射的配额，取值有：
<li>zone：站点数；</li>
<li>custom-rule：自定义规则数；</li>
<li>rate-limiting-rule：速率限制规则数；</li>
<li>l4-proxy-instance：四层代理实例数。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPack(String Pack) {
        this.Pack = Pack;
    }

    /**
     * Get 询价参数映射的四层代理实例Id。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InstanceId 询价参数映射的四层代理实例Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 询价参数映射的四层代理实例Id。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 询价参数映射的四层代理实例Id。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 询价参数对应的防护等级。
取值有： <li> cm_30G：中国大陆加速区域保底防护30Gbps；</li><li> cm_60G：中国大陆加速区域保底防护60Gbps；</li><li> cm_100G：中国大陆加速区域保底防护100Gbps；</li><li> anycast_300G：全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> anycast_unlimited：全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_30G_anycast_300G：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_30G_anycast_unlimited：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_60G_anycast_300G：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_60G_anycast_unlimited：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_100G_anycast_300G：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_100G_anycast_unlimited：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProtectionSpecs 询价参数对应的防护等级。
取值有： <li> cm_30G：中国大陆加速区域保底防护30Gbps；</li><li> cm_60G：中国大陆加速区域保底防护60Gbps；</li><li> cm_100G：中国大陆加速区域保底防护100Gbps；</li><li> anycast_300G：全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> anycast_unlimited：全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_30G_anycast_300G：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_30G_anycast_unlimited：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_60G_anycast_300G：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_60G_anycast_unlimited：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_100G_anycast_300G：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_100G_anycast_unlimited：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProtectionSpecs() {
        return this.ProtectionSpecs;
    }

    /**
     * Set 询价参数对应的防护等级。
取值有： <li> cm_30G：中国大陆加速区域保底防护30Gbps；</li><li> cm_60G：中国大陆加速区域保底防护60Gbps；</li><li> cm_100G：中国大陆加速区域保底防护100Gbps；</li><li> anycast_300G：全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> anycast_unlimited：全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_30G_anycast_300G：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_30G_anycast_unlimited：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_60G_anycast_300G：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_60G_anycast_unlimited：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_100G_anycast_300G：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_100G_anycast_unlimited：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProtectionSpecs 询价参数对应的防护等级。
取值有： <li> cm_30G：中国大陆加速区域保底防护30Gbps；</li><li> cm_60G：中国大陆加速区域保底防护60Gbps；</li><li> cm_100G：中国大陆加速区域保底防护100Gbps；</li><li> anycast_300G：全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> anycast_unlimited：全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_30G_anycast_300G：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_30G_anycast_unlimited：中国大陆加速区域保底防护30Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_60G_anycast_300G：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_60G_anycast_unlimited：中国大陆加速区域保底防护60Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护；</li><li> cm_100G_anycast_300G：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast联防300Gbps；</li><li> cm_100G_anycast_unlimited：中国大陆加速区域保底防护100Gbps，全球加速区域（除中国大陆）Anycast无上限全力防护。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProtectionSpecs(String ProtectionSpecs) {
        this.ProtectionSpecs = ProtectionSpecs;
    }

    public Sv() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Sv(Sv source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Pack != null) {
            this.Pack = new String(source.Pack);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ProtectionSpecs != null) {
            this.ProtectionSpecs = new String(source.ProtectionSpecs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Pack", this.Pack);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ProtectionSpecs", this.ProtectionSpecs);

    }
}

