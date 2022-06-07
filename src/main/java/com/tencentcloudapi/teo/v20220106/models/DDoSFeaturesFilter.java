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

public class DDoSFeaturesFilter extends AbstractModel{

    /**
    * 动作 drop-丢弃；transmit-放行；drop_block-丢弃并拉黑；forward-继续防护
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 深度值1
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * 深度值2
    */
    @SerializedName("Depth2")
    @Expose
    private Long Depth2;

    /**
    * 目标端口结束
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * 目标端口开始
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * 取非判断1
    */
    @SerializedName("IsNot")
    @Expose
    private Long IsNot;

    /**
    * 取非判断2
    */
    @SerializedName("IsNot2")
    @Expose
    private Long IsNot2;

    /**
    * 多特征关系（单特征时(none)，第二特征相关配置可不填） none；and；or
    */
    @SerializedName("MatchLogic")
    @Expose
    private String MatchLogic;

    /**
    * 匹配方式1 pcre-正则匹配, sunday-字符串匹配
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 匹配方式2 pcre-正则匹配, sunday-字符串匹配
    */
    @SerializedName("MatchType2")
    @Expose
    private String MatchType2;

    /**
    * 偏移量1
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 偏移量2
    */
    @SerializedName("Offset2")
    @Expose
    private Long Offset2;

    /**
    * 最大包长
    */
    @SerializedName("PacketMax")
    @Expose
    private Long PacketMax;

    /**
    * 最小包长
    */
    @SerializedName("PacketMin")
    @Expose
    private Long PacketMin;

    /**
    * 协议 tcp；udp；icmp；all
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 源端口结束
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * 源端口开始
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * 匹配字符串1
    */
    @SerializedName("Str")
    @Expose
    private String Str;

    /**
    * 匹配字符串2
    */
    @SerializedName("Str2")
    @Expose
    private String Str2;

    /**
    * 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4
    */
    @SerializedName("MatchBegin2")
    @Expose
    private String MatchBegin2;

    /**
     * Get 动作 drop-丢弃；transmit-放行；drop_block-丢弃并拉黑；forward-继续防护 
     * @return Action 动作 drop-丢弃；transmit-放行；drop_block-丢弃并拉黑；forward-继续防护
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作 drop-丢弃；transmit-放行；drop_block-丢弃并拉黑；forward-继续防护
     * @param Action 动作 drop-丢弃；transmit-放行；drop_block-丢弃并拉黑；forward-继续防护
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 深度值1 
     * @return Depth 深度值1
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set 深度值1
     * @param Depth 深度值1
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get 深度值2 
     * @return Depth2 深度值2
     */
    public Long getDepth2() {
        return this.Depth2;
    }

    /**
     * Set 深度值2
     * @param Depth2 深度值2
     */
    public void setDepth2(Long Depth2) {
        this.Depth2 = Depth2;
    }

    /**
     * Get 目标端口结束 
     * @return DportEnd 目标端口结束
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set 目标端口结束
     * @param DportEnd 目标端口结束
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get 目标端口开始 
     * @return DportStart 目标端口开始
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set 目标端口开始
     * @param DportStart 目标端口开始
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get 取非判断1 
     * @return IsNot 取非判断1
     */
    public Long getIsNot() {
        return this.IsNot;
    }

    /**
     * Set 取非判断1
     * @param IsNot 取非判断1
     */
    public void setIsNot(Long IsNot) {
        this.IsNot = IsNot;
    }

    /**
     * Get 取非判断2 
     * @return IsNot2 取非判断2
     */
    public Long getIsNot2() {
        return this.IsNot2;
    }

    /**
     * Set 取非判断2
     * @param IsNot2 取非判断2
     */
    public void setIsNot2(Long IsNot2) {
        this.IsNot2 = IsNot2;
    }

    /**
     * Get 多特征关系（单特征时(none)，第二特征相关配置可不填） none；and；or 
     * @return MatchLogic 多特征关系（单特征时(none)，第二特征相关配置可不填） none；and；or
     */
    public String getMatchLogic() {
        return this.MatchLogic;
    }

    /**
     * Set 多特征关系（单特征时(none)，第二特征相关配置可不填） none；and；or
     * @param MatchLogic 多特征关系（单特征时(none)，第二特征相关配置可不填） none；and；or
     */
    public void setMatchLogic(String MatchLogic) {
        this.MatchLogic = MatchLogic;
    }

    /**
     * Get 匹配方式1 pcre-正则匹配, sunday-字符串匹配 
     * @return MatchType 匹配方式1 pcre-正则匹配, sunday-字符串匹配
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 匹配方式1 pcre-正则匹配, sunday-字符串匹配
     * @param MatchType 匹配方式1 pcre-正则匹配, sunday-字符串匹配
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get 匹配方式2 pcre-正则匹配, sunday-字符串匹配 
     * @return MatchType2 匹配方式2 pcre-正则匹配, sunday-字符串匹配
     */
    public String getMatchType2() {
        return this.MatchType2;
    }

    /**
     * Set 匹配方式2 pcre-正则匹配, sunday-字符串匹配
     * @param MatchType2 匹配方式2 pcre-正则匹配, sunday-字符串匹配
     */
    public void setMatchType2(String MatchType2) {
        this.MatchType2 = MatchType2;
    }

    /**
     * Get 偏移量1 
     * @return Offset 偏移量1
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量1
     * @param Offset 偏移量1
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 偏移量2 
     * @return Offset2 偏移量2
     */
    public Long getOffset2() {
        return this.Offset2;
    }

    /**
     * Set 偏移量2
     * @param Offset2 偏移量2
     */
    public void setOffset2(Long Offset2) {
        this.Offset2 = Offset2;
    }

    /**
     * Get 最大包长 
     * @return PacketMax 最大包长
     */
    public Long getPacketMax() {
        return this.PacketMax;
    }

    /**
     * Set 最大包长
     * @param PacketMax 最大包长
     */
    public void setPacketMax(Long PacketMax) {
        this.PacketMax = PacketMax;
    }

    /**
     * Get 最小包长 
     * @return PacketMin 最小包长
     */
    public Long getPacketMin() {
        return this.PacketMin;
    }

    /**
     * Set 最小包长
     * @param PacketMin 最小包长
     */
    public void setPacketMin(Long PacketMin) {
        this.PacketMin = PacketMin;
    }

    /**
     * Get 协议 tcp；udp；icmp；all 
     * @return Protocol 协议 tcp；udp；icmp；all
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议 tcp；udp；icmp；all
     * @param Protocol 协议 tcp；udp；icmp；all
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 源端口结束 
     * @return SportEnd 源端口结束
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set 源端口结束
     * @param SportEnd 源端口结束
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get 源端口开始 
     * @return SportStart 源端口开始
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set 源端口开始
     * @param SportStart 源端口开始
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get 匹配字符串1 
     * @return Str 匹配字符串1
     */
    public String getStr() {
        return this.Str;
    }

    /**
     * Set 匹配字符串1
     * @param Str 匹配字符串1
     */
    public void setStr(String Str) {
        this.Str = Str;
    }

    /**
     * Get 匹配字符串2 
     * @return Str2 匹配字符串2
     */
    public String getStr2() {
        return this.Str2;
    }

    /**
     * Set 匹配字符串2
     * @param Str2 匹配字符串2
     */
    public void setStr2(String Str2) {
        this.Str2 = Str2;
    }

    /**
     * Get 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4 
     * @return MatchBegin 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * Set 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4
     * @param MatchBegin 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * Get 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4 
     * @return MatchBegin2 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4
     */
    public String getMatchBegin2() {
        return this.MatchBegin2;
    }

    /**
     * Set 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4
     * @param MatchBegin2 匹配开始层级，层级参考计算机网络结构 begin_l5, no_match, begin_l3, begin_l4
     */
    public void setMatchBegin2(String MatchBegin2) {
        this.MatchBegin2 = MatchBegin2;
    }

    public DDoSFeaturesFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSFeaturesFilter(DDoSFeaturesFilter source) {
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
        if (source.Depth2 != null) {
            this.Depth2 = new Long(source.Depth2);
        }
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.IsNot != null) {
            this.IsNot = new Long(source.IsNot);
        }
        if (source.IsNot2 != null) {
            this.IsNot2 = new Long(source.IsNot2);
        }
        if (source.MatchLogic != null) {
            this.MatchLogic = new String(source.MatchLogic);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.MatchType2 != null) {
            this.MatchType2 = new String(source.MatchType2);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Offset2 != null) {
            this.Offset2 = new Long(source.Offset2);
        }
        if (source.PacketMax != null) {
            this.PacketMax = new Long(source.PacketMax);
        }
        if (source.PacketMin != null) {
            this.PacketMin = new Long(source.PacketMin);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.Str != null) {
            this.Str = new String(source.Str);
        }
        if (source.Str2 != null) {
            this.Str2 = new String(source.Str2);
        }
        if (source.MatchBegin != null) {
            this.MatchBegin = new String(source.MatchBegin);
        }
        if (source.MatchBegin2 != null) {
            this.MatchBegin2 = new String(source.MatchBegin2);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "Depth2", this.Depth2);
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "IsNot", this.IsNot);
        this.setParamSimple(map, prefix + "IsNot2", this.IsNot2);
        this.setParamSimple(map, prefix + "MatchLogic", this.MatchLogic);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "MatchType2", this.MatchType2);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Offset2", this.Offset2);
        this.setParamSimple(map, prefix + "PacketMax", this.PacketMax);
        this.setParamSimple(map, prefix + "PacketMin", this.PacketMin);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "Str", this.Str);
        this.setParamSimple(map, prefix + "Str2", this.Str2);
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamSimple(map, prefix + "MatchBegin2", this.MatchBegin2);

    }
}

