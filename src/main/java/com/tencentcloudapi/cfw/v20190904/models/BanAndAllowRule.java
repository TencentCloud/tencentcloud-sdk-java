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

public class BanAndAllowRule extends AbstractModel {

    /**
    * 规则备注，最多 200 个字符。
    */
    @SerializedName("Comment")
    @Expose
    private String Comment;

    /**
    * 自定义放通规则详情。RuleType=6 时使用；其它规则类型不读取此字段。
    */
    @SerializedName("CustomRule")
    @Expose
    private CustomWhiteRule CustomRule;

    /**
    * 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的。所有 RuleType 均须显式传入非空值。RuleType=6 会先校验本字段，再根据 CustomRule 重新计算最终方向；例如私网源到私网目的可传 5,6，创建后应查询确认最终方向。
    */
    @SerializedName("DirectionList")
    @Expose
    private String DirectionList;

    /**
    * 规则截止时间，使用北京时间（UTC+8）的 YYYY-MM-DD HH:MM:SS 格式，且不得早于服务器处理时刻；3000-01-01 00:00:00 表示长期有效。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * RuleType=6 的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR；组合值按位相加，取值范围为 0 至 31。非零值会与源、目的地址适用的引擎取交集，并保留 NDR 位；结果为 0 时，IPv6 或私网 IPv4 地址使用 6，其它地址使用 15。其它 RuleType 不使用该字段。
    */
    @SerializedName("FwType")
    @Expose
    private Long FwType;

    /**
    * 规则对象。RuleType=1 或 2 时传 IP 地址，RuleType=3 时传域名，RuleType=4 时传情报标识，RuleType=5 时使用 DescribeCfwAssets 返回的 assets[].instance_id。RuleType=6 新建时必须显式传空字符串，由服务生成规则 ID，不可省略。更新既有自定义规则时传入该规则的现有 ID。
    */
    @SerializedName("Ioc")
    @Expose
    private String Ioc;

    /**
     * Get 规则备注，最多 200 个字符。 
     * @return Comment 规则备注，最多 200 个字符。
     */
    public String getComment() {
        return this.Comment;
    }

    /**
     * Set 规则备注，最多 200 个字符。
     * @param Comment 规则备注，最多 200 个字符。
     */
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    /**
     * Get 自定义放通规则详情。RuleType=6 时使用；其它规则类型不读取此字段。 
     * @return CustomRule 自定义放通规则详情。RuleType=6 时使用；其它规则类型不读取此字段。
     */
    public CustomWhiteRule getCustomRule() {
        return this.CustomRule;
    }

    /**
     * Set 自定义放通规则详情。RuleType=6 时使用；其它规则类型不读取此字段。
     * @param CustomRule 自定义放通规则详情。RuleType=6 时使用；其它规则类型不读取此字段。
     */
    public void setCustomRule(CustomWhiteRule CustomRule) {
        this.CustomRule = CustomRule;
    }

    /**
     * Get 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的。所有 RuleType 均须显式传入非空值。RuleType=6 会先校验本字段，再根据 CustomRule 重新计算最终方向；例如私网源到私网目的可传 5,6，创建后应查询确认最终方向。 
     * @return DirectionList 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的。所有 RuleType 均须显式传入非空值。RuleType=6 会先校验本字段，再根据 CustomRule 重新计算最终方向；例如私网源到私网目的可传 5,6，创建后应查询确认最终方向。
     */
    public String getDirectionList() {
        return this.DirectionList;
    }

    /**
     * Set 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的。所有 RuleType 均须显式传入非空值。RuleType=6 会先校验本字段，再根据 CustomRule 重新计算最终方向；例如私网源到私网目的可传 5,6，创建后应查询确认最终方向。
     * @param DirectionList 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的。所有 RuleType 均须显式传入非空值。RuleType=6 会先校验本字段，再根据 CustomRule 重新计算最终方向；例如私网源到私网目的可传 5,6，创建后应查询确认最终方向。
     */
    public void setDirectionList(String DirectionList) {
        this.DirectionList = DirectionList;
    }

    /**
     * Get 规则截止时间，使用北京时间（UTC+8）的 YYYY-MM-DD HH:MM:SS 格式，且不得早于服务器处理时刻；3000-01-01 00:00:00 表示长期有效。 
     * @return EndTime 规则截止时间，使用北京时间（UTC+8）的 YYYY-MM-DD HH:MM:SS 格式，且不得早于服务器处理时刻；3000-01-01 00:00:00 表示长期有效。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 规则截止时间，使用北京时间（UTC+8）的 YYYY-MM-DD HH:MM:SS 格式，且不得早于服务器处理时刻；3000-01-01 00:00:00 表示长期有效。
     * @param EndTime 规则截止时间，使用北京时间（UTC+8）的 YYYY-MM-DD HH:MM:SS 格式，且不得早于服务器处理时刻；3000-01-01 00:00:00 表示长期有效。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get RuleType=6 的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR；组合值按位相加，取值范围为 0 至 31。非零值会与源、目的地址适用的引擎取交集，并保留 NDR 位；结果为 0 时，IPv6 或私网 IPv4 地址使用 6，其它地址使用 15。其它 RuleType 不使用该字段。 
     * @return FwType RuleType=6 的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR；组合值按位相加，取值范围为 0 至 31。非零值会与源、目的地址适用的引擎取交集，并保留 NDR 位；结果为 0 时，IPv6 或私网 IPv4 地址使用 6，其它地址使用 15。其它 RuleType 不使用该字段。
     */
    public Long getFwType() {
        return this.FwType;
    }

    /**
     * Set RuleType=6 的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR；组合值按位相加，取值范围为 0 至 31。非零值会与源、目的地址适用的引擎取交集，并保留 NDR 位；结果为 0 时，IPv6 或私网 IPv4 地址使用 6，其它地址使用 15。其它 RuleType 不使用该字段。
     * @param FwType RuleType=6 的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR；组合值按位相加，取值范围为 0 至 31。非零值会与源、目的地址适用的引擎取交集，并保留 NDR 位；结果为 0 时，IPv6 或私网 IPv4 地址使用 6，其它地址使用 15。其它 RuleType 不使用该字段。
     */
    public void setFwType(Long FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 规则对象。RuleType=1 或 2 时传 IP 地址，RuleType=3 时传域名，RuleType=4 时传情报标识，RuleType=5 时使用 DescribeCfwAssets 返回的 assets[].instance_id。RuleType=6 新建时必须显式传空字符串，由服务生成规则 ID，不可省略。更新既有自定义规则时传入该规则的现有 ID。 
     * @return Ioc 规则对象。RuleType=1 或 2 时传 IP 地址，RuleType=3 时传域名，RuleType=4 时传情报标识，RuleType=5 时使用 DescribeCfwAssets 返回的 assets[].instance_id。RuleType=6 新建时必须显式传空字符串，由服务生成规则 ID，不可省略。更新既有自定义规则时传入该规则的现有 ID。
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set 规则对象。RuleType=1 或 2 时传 IP 地址，RuleType=3 时传域名，RuleType=4 时传情报标识，RuleType=5 时使用 DescribeCfwAssets 返回的 assets[].instance_id。RuleType=6 新建时必须显式传空字符串，由服务生成规则 ID，不可省略。更新既有自定义规则时传入该规则的现有 ID。
     * @param Ioc 规则对象。RuleType=1 或 2 时传 IP 地址，RuleType=3 时传域名，RuleType=4 时传情报标识，RuleType=5 时使用 DescribeCfwAssets 返回的 assets[].instance_id。RuleType=6 新建时必须显式传空字符串，由服务生成规则 ID，不可省略。更新既有自定义规则时传入该规则的现有 ID。
     */
    public void setIoc(String Ioc) {
        this.Ioc = Ioc;
    }

    public BanAndAllowRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BanAndAllowRule(BanAndAllowRule source) {
        if (source.Comment != null) {
            this.Comment = new String(source.Comment);
        }
        if (source.CustomRule != null) {
            this.CustomRule = new CustomWhiteRule(source.CustomRule);
        }
        if (source.DirectionList != null) {
            this.DirectionList = new String(source.DirectionList);
        }
        if (source.EndTime != null) {
            this.EndTime = new String(source.EndTime);
        }
        if (source.FwType != null) {
            this.FwType = new Long(source.FwType);
        }
        if (source.Ioc != null) {
            this.Ioc = new String(source.Ioc);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Comment", this.Comment);
        this.setParamObj(map, prefix + "CustomRule.", this.CustomRule);
        this.setParamSimple(map, prefix + "DirectionList", this.DirectionList);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "FwType", this.FwType);
        this.setParamSimple(map, prefix + "Ioc", this.Ioc);

    }
}

