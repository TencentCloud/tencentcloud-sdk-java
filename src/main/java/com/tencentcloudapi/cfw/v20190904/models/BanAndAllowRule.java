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
    * 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的；每项都必须属于 0 至 6。该字段不可为空；RuleType=6 时通过初始校验后，处理器会根据 CustomRule 的源、目的地址重新计算方向。
    */
    @SerializedName("DirectionList")
    @Expose
    private String DirectionList;

    /**
    * 规则截止时间，必须使用 YYYY-MM-DD HH:MM:SS 格式且不得早于服务器处理时刻；3000-01-01 00:00:00 作为长期有效时间。
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 自定义放通规则的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR，组合值按位相加。处理器接受 0 至 31。RuleType=6 时，非零值会按源、目的地址组合与适用引擎位求交，并保留 NDR 位 16；归一化结果大于 0 时使用该结果，结果为 0 时与省略或传 0 相同：任一地址为 IPv6 或私网 IPv4 则实际使用 6，否则实际使用 15。其它 RuleType 仅校验该字段而不使用其值。
    */
    @SerializedName("FwType")
    @Expose
    private Long FwType;

    /**
    * 规则对象。RuleType=1 或 2 时必须是 IP 地址，RuleType=3 时必须是合法域名，RuleType=4 时不能为空，RuleType=5 时必须是资产表中存在的实例 ID；RuleType=6 时表示自定义规则 ID：新增时可省略并由处理器生成；修改时作为既有规则的查询和更新键，省略时不会命中既有规则。其它受理的 RuleType 不校验对象格式。
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
     * Get 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的；每项都必须属于 0 至 6。该字段不可为空；RuleType=6 时通过初始校验后，处理器会根据 CustomRule 的源、目的地址重新计算方向。 
     * @return DirectionList 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的；每项都必须属于 0 至 6。该字段不可为空；RuleType=6 时通过初始校验后，处理器会根据 CustomRule 的源、目的地址重新计算方向。
     */
    public String getDirectionList() {
        return this.DirectionList;
    }

    /**
     * Set 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的；每项都必须属于 0 至 6。该字段不可为空；RuleType=6 时通过初始校验后，处理器会根据 CustomRule 的源、目的地址重新计算方向。
     * @param DirectionList 生效方向，使用逗号分隔的整数：0 互联网出站、1 互联网入站、2 双向、3 东西向、4 情报误报反馈、5 内网访问源、6 内网访问目的；每项都必须属于 0 至 6。该字段不可为空；RuleType=6 时通过初始校验后，处理器会根据 CustomRule 的源、目的地址重新计算方向。
     */
    public void setDirectionList(String DirectionList) {
        this.DirectionList = DirectionList;
    }

    /**
     * Get 规则截止时间，必须使用 YYYY-MM-DD HH:MM:SS 格式且不得早于服务器处理时刻；3000-01-01 00:00:00 作为长期有效时间。 
     * @return EndTime 规则截止时间，必须使用 YYYY-MM-DD HH:MM:SS 格式且不得早于服务器处理时刻；3000-01-01 00:00:00 作为长期有效时间。
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * Set 规则截止时间，必须使用 YYYY-MM-DD HH:MM:SS 格式且不得早于服务器处理时刻；3000-01-01 00:00:00 作为长期有效时间。
     * @param EndTime 规则截止时间，必须使用 YYYY-MM-DD HH:MM:SS 格式且不得早于服务器处理时刻；3000-01-01 00:00:00 作为长期有效时间。
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * Get 自定义放通规则的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR，组合值按位相加。处理器接受 0 至 31。RuleType=6 时，非零值会按源、目的地址组合与适用引擎位求交，并保留 NDR 位 16；归一化结果大于 0 时使用该结果，结果为 0 时与省略或传 0 相同：任一地址为 IPv6 或私网 IPv4 则实际使用 6，否则实际使用 15。其它 RuleType 仅校验该字段而不使用其值。 
     * @return FwType 自定义放通规则的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR，组合值按位相加。处理器接受 0 至 31。RuleType=6 时，非零值会按源、目的地址组合与适用引擎位求交，并保留 NDR 位 16；归一化结果大于 0 时使用该结果，结果为 0 时与省略或传 0 相同：任一地址为 IPv6 或私网 IPv4 则实际使用 6，否则实际使用 15。其它 RuleType 仅校验该字段而不使用其值。
     */
    public Long getFwType() {
        return this.FwType;
    }

    /**
     * Set 自定义放通规则的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR，组合值按位相加。处理器接受 0 至 31。RuleType=6 时，非零值会按源、目的地址组合与适用引擎位求交，并保留 NDR 位 16；归一化结果大于 0 时使用该结果，结果为 0 时与省略或传 0 相同：任一地址为 IPv6 或私网 IPv4 则实际使用 6，否则实际使用 15。其它 RuleType 仅校验该字段而不使用其值。
     * @param FwType 自定义放通规则的生效引擎位图：1 互联网边界旁路、2 NAT 防火墙、4 VPC 防火墙、8 互联网边界串行、16 NDR，组合值按位相加。处理器接受 0 至 31。RuleType=6 时，非零值会按源、目的地址组合与适用引擎位求交，并保留 NDR 位 16；归一化结果大于 0 时使用该结果，结果为 0 时与省略或传 0 相同：任一地址为 IPv6 或私网 IPv4 则实际使用 6，否则实际使用 15。其它 RuleType 仅校验该字段而不使用其值。
     */
    public void setFwType(Long FwType) {
        this.FwType = FwType;
    }

    /**
     * Get 规则对象。RuleType=1 或 2 时必须是 IP 地址，RuleType=3 时必须是合法域名，RuleType=4 时不能为空，RuleType=5 时必须是资产表中存在的实例 ID；RuleType=6 时表示自定义规则 ID：新增时可省略并由处理器生成；修改时作为既有规则的查询和更新键，省略时不会命中既有规则。其它受理的 RuleType 不校验对象格式。 
     * @return Ioc 规则对象。RuleType=1 或 2 时必须是 IP 地址，RuleType=3 时必须是合法域名，RuleType=4 时不能为空，RuleType=5 时必须是资产表中存在的实例 ID；RuleType=6 时表示自定义规则 ID：新增时可省略并由处理器生成；修改时作为既有规则的查询和更新键，省略时不会命中既有规则。其它受理的 RuleType 不校验对象格式。
     */
    public String getIoc() {
        return this.Ioc;
    }

    /**
     * Set 规则对象。RuleType=1 或 2 时必须是 IP 地址，RuleType=3 时必须是合法域名，RuleType=4 时不能为空，RuleType=5 时必须是资产表中存在的实例 ID；RuleType=6 时表示自定义规则 ID：新增时可省略并由处理器生成；修改时作为既有规则的查询和更新键，省略时不会命中既有规则。其它受理的 RuleType 不校验对象格式。
     * @param Ioc 规则对象。RuleType=1 或 2 时必须是 IP 地址，RuleType=3 时必须是合法域名，RuleType=4 时不能为空，RuleType=5 时必须是资产表中存在的实例 ID；RuleType=6 时表示自定义规则 ID：新增时可省略并由处理器生成；修改时作为既有规则的查询和更新键，省略时不会命中既有规则。其它受理的 RuleType 不校验对象格式。
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

