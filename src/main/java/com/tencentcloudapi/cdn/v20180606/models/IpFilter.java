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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpFilter extends AbstractModel{

    /**
    * IP 黑白名单配置开关
on：开启
off：关闭
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * IP 黑白名单类型
whitelist：白名单
blacklist：黑名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterType")
    @Expose
    private String FilterType;

    /**
    * IP 黑白名单列表
支持 X.X.X.X 形式 IP，或 /8、 /16、/24 形式网段
最多可填充 50 个白名单或 50 个黑名单
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Filters")
    @Expose
    private String [] Filters;

    /**
    * IP 黑白名单分路径配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FilterRules")
    @Expose
    private IpFilterPathRule [] FilterRules;

    /**
    * IP 黑白名单验证失败时返回的 HTTP Code
合法值: 400~499
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReturnCode")
    @Expose
    private Long ReturnCode;

    /**
     * Get IP 黑白名单配置开关
on：开启
off：关闭 
     * @return Switch IP 黑白名单配置开关
on：开启
off：关闭
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set IP 黑白名单配置开关
on：开启
off：关闭
     * @param Switch IP 黑白名单配置开关
on：开启
off：关闭
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get IP 黑白名单类型
whitelist：白名单
blacklist：黑名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterType IP 黑白名单类型
whitelist：白名单
blacklist：黑名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFilterType() {
        return this.FilterType;
    }

    /**
     * Set IP 黑白名单类型
whitelist：白名单
blacklist：黑名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterType IP 黑白名单类型
whitelist：白名单
blacklist：黑名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterType(String FilterType) {
        this.FilterType = FilterType;
    }

    /**
     * Get IP 黑白名单列表
支持 X.X.X.X 形式 IP，或 /8、 /16、/24 形式网段
最多可填充 50 个白名单或 50 个黑名单
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Filters IP 黑白名单列表
支持 X.X.X.X 形式 IP，或 /8、 /16、/24 形式网段
最多可填充 50 个白名单或 50 个黑名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getFilters() {
        return this.Filters;
    }

    /**
     * Set IP 黑白名单列表
支持 X.X.X.X 形式 IP，或 /8、 /16、/24 形式网段
最多可填充 50 个白名单或 50 个黑名单
注意：此字段可能返回 null，表示取不到有效值。
     * @param Filters IP 黑白名单列表
支持 X.X.X.X 形式 IP，或 /8、 /16、/24 形式网段
最多可填充 50 个白名单或 50 个黑名单
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilters(String [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get IP 黑白名单分路径配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FilterRules IP 黑白名单分路径配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IpFilterPathRule [] getFilterRules() {
        return this.FilterRules;
    }

    /**
     * Set IP 黑白名单分路径配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     * @param FilterRules IP 黑白名单分路径配置，白名单功能
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFilterRules(IpFilterPathRule [] FilterRules) {
        this.FilterRules = FilterRules;
    }

    /**
     * Get IP 黑白名单验证失败时返回的 HTTP Code
合法值: 400~499
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReturnCode IP 黑白名单验证失败时返回的 HTTP Code
合法值: 400~499
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getReturnCode() {
        return this.ReturnCode;
    }

    /**
     * Set IP 黑白名单验证失败时返回的 HTTP Code
合法值: 400~499
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReturnCode IP 黑白名单验证失败时返回的 HTTP Code
合法值: 400~499
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReturnCode(Long ReturnCode) {
        this.ReturnCode = ReturnCode;
    }

    public IpFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IpFilter(IpFilter source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.FilterType != null) {
            this.FilterType = new String(source.FilterType);
        }
        if (source.Filters != null) {
            this.Filters = new String[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new String(source.Filters[i]);
            }
        }
        if (source.FilterRules != null) {
            this.FilterRules = new IpFilterPathRule[source.FilterRules.length];
            for (int i = 0; i < source.FilterRules.length; i++) {
                this.FilterRules[i] = new IpFilterPathRule(source.FilterRules[i]);
            }
        }
        if (source.ReturnCode != null) {
            this.ReturnCode = new Long(source.ReturnCode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "FilterType", this.FilterType);
        this.setParamArraySimple(map, prefix + "Filters.", this.Filters);
        this.setParamArrayObj(map, prefix + "FilterRules.", this.FilterRules);
        this.setParamSimple(map, prefix + "ReturnCode", this.ReturnCode);

    }
}

