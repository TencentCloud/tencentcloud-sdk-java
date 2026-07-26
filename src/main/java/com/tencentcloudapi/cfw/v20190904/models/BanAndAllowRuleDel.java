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
package com.tencentcloudapi.cfw.v20190904.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BanAndAllowRuleDel extends AbstractModel {

    /**
    * 规则的完整适用方向列表，多个值以逗号分隔：0 互联网出站，1 互联网入站，2 双向，3 东西向，4 情报误报反馈，5 内网访问源，6 内网访问目的。通过 DescribeBlockIgnoreList 查询时传顶层 Direction=""，并使用目标 Data[].DirectionList。
    */
    @SerializedName("DirectionList")
    @Expose
    private String DirectionList;

    /**
    * 封禁或放通对象值。通过 DescribeBlockIgnoreList 查询并使用完全匹配目标的 Data[].Ioc。
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
    * 规则类型标识。通过 DescribeBlockIgnoreList 查询并使用目标 Data[].RuleType。常用值：1 封禁 IP，2 放通 IP，3 放通域名，4 威胁情报地址，5 资产实例，6 自定义策略，7 入侵防御规则，8 扩展 IP 规则，9 扩展自定义规则。
    */
    @SerializedName("RuleType")
    @Expose
    private Long RuleType;

    /**
     * Get 规则的完整适用方向列表，多个值以逗号分隔：0 互联网出站，1 互联网入站，2 双向，3 东西向，4 情报误报反馈，5 内网访问源，6 内网访问目的。通过 DescribeBlockIgnoreList 查询时传顶层 Direction=""，并使用目标 Data[].DirectionList。 
     * @return DirectionList 规则的完整适用方向列表，多个值以逗号分隔：0 互联网出站，1 互联网入站，2 双向，3 东西向，4 情报误报反馈，5 内网访问源，6 内网访问目的。通过 DescribeBlockIgnoreList 查询时传顶层 Direction=""，并使用目标 Data[].DirectionList。
     */
    public String getDirectionList() {
        return this.DirectionList;
    }

    /**
     * Set 规则的完整适用方向列表，多个值以逗号分隔：0 互联网出站，1 互联网入站，2 双向，3 东西向，4 情报误报反馈，5 内网访问源，6 内网访问目的。通过 DescribeBlockIgnoreList 查询时传顶层 Direction=""，并使用目标 Data[].DirectionList。
     * @param DirectionList 规则的完整适用方向列表，多个值以逗号分隔：0 互联网出站，1 互联网入站，2 双向，3 东西向，4 情报误报反馈，5 内网访问源，6 内网访问目的。通过 DescribeBlockIgnoreList 查询时传顶层 Direction=""，并使用目标 Data[].DirectionList。
     */
    public void setDirectionList(String DirectionList) {
        this.DirectionList = DirectionList;
    }

    /**
     * Get 封禁或放通对象值。通过 DescribeBlockIgnoreList 查询并使用完全匹配目标的 Data[].Ioc。 
     * @return Ioc 封禁或放通对象值。通过 DescribeBlockIgnoreList 查询并使用完全匹配目标的 Data[].Ioc。
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set 封禁或放通对象值。通过 DescribeBlockIgnoreList 查询并使用完全匹配目标的 Data[].Ioc。
     * @param Ioc 封禁或放通对象值。通过 DescribeBlockIgnoreList 查询并使用完全匹配目标的 Data[].Ioc。
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    /**
     * Get 规则类型标识。通过 DescribeBlockIgnoreList 查询并使用目标 Data[].RuleType。常用值：1 封禁 IP，2 放通 IP，3 放通域名，4 威胁情报地址，5 资产实例，6 自定义策略，7 入侵防御规则，8 扩展 IP 规则，9 扩展自定义规则。 
     * @return RuleType 规则类型标识。通过 DescribeBlockIgnoreList 查询并使用目标 Data[].RuleType。常用值：1 封禁 IP，2 放通 IP，3 放通域名，4 威胁情报地址，5 资产实例，6 自定义策略，7 入侵防御规则，8 扩展 IP 规则，9 扩展自定义规则。
     */
    public Long getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 规则类型标识。通过 DescribeBlockIgnoreList 查询并使用目标 Data[].RuleType。常用值：1 封禁 IP，2 放通 IP，3 放通域名，4 威胁情报地址，5 资产实例，6 自定义策略，7 入侵防御规则，8 扩展 IP 规则，9 扩展自定义规则。
     * @param RuleType 规则类型标识。通过 DescribeBlockIgnoreList 查询并使用目标 Data[].RuleType。常用值：1 封禁 IP，2 放通 IP，3 放通域名，4 威胁情报地址，5 资产实例，6 自定义策略，7 入侵防御规则，8 扩展 IP 规则，9 扩展自定义规则。
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
        if (source.DirectionList != null) {
            this.DirectionList = new String(source.DirectionList);
        }
        if (source.Ioc != null) {
            this.Ioc = new String(source.Ioc);
        }
        if (source.RuleType != null) {
            this.RuleType = new Long(source.RuleType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DirectionList", this.DirectionList);
        this.setParamSimple(map, prefix + "Ioc", this.Ioc);
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);

    }
}

