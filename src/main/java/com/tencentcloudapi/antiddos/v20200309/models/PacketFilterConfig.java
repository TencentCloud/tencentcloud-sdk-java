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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PacketFilterConfig extends AbstractModel{

    /**
    * 协议，取值[tcp udp icmp all]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 起始源端口，取值0~65535
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * 结束源端口，取值1~65535，必须大于等于起始源端口
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * 起始目的端口，取值0~65535
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * 结束目的端口，取值1~65535，必须大于等于起始目的端口
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * 最小报文长度，取值1-1500
    */
    @SerializedName("PktlenMin")
    @Expose
    private Long PktlenMin;

    /**
    * 最大报文长度，取值1-1500，必须大于等于最小报文长度
    */
    @SerializedName("PktlenMax")
    @Expose
    private Long PktlenMax;

    /**
    * 动作，取值[
drop(丢弃)
transmit(放行)
drop_black(丢弃并拉黑)
drop_rst(拦截)
drop_black_rst(拦截并拉黑)
forward(继续防护)
]
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 检测位置，取值[
begin_l3(IP头)
begin_l4(TCP/UDP头)
begin_l5(T载荷)
no_match(不匹配)
]
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * 检测类型，取值[
sunday(关键字)
pcre(正则表达式)
]
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
]
    */
    @SerializedName("Str")
    @Expose
    private String Str;

    /**
    * 从检测位置开始的检测深度，取值[0,1500]
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * 从检测位置开始的偏移量，取值范围[0,Depth]
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 是否包含检测值，取值[
0(包含)
1(不包含)
]
    */
    @SerializedName("IsNot")
    @Expose
    private Long IsNot;

    /**
    * 当有第二个检测条件时，与第一检测条件的且或关系，取值[
and(且的关系)
none(当没有第二个检测条件时填写此值)
]
    */
    @SerializedName("MatchLogic")
    @Expose
    private String MatchLogic;

    /**
    * 第二个检测位置，取值[
begin_l5(载荷)
no_match(不匹配)
]
    */
    @SerializedName("MatchBegin2")
    @Expose
    private String MatchBegin2;

    /**
    * 第二个检测类型，取值[
sunday(关键字)
pcre(正则表达式)
]
    */
    @SerializedName("MatchType2")
    @Expose
    private String MatchType2;

    /**
    * 第二个检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
]
    */
    @SerializedName("Str2")
    @Expose
    private String Str2;

    /**
    * 从第二个检测位置开始的第二个检测深度，取值[0,1500]
    */
    @SerializedName("Depth2")
    @Expose
    private Long Depth2;

    /**
    * 从第二个检测位置开始的偏移量，取值范围[0,Depth2]
    */
    @SerializedName("Offset2")
    @Expose
    private Long Offset2;

    /**
    * 第二个检测是否包含检测值，取值[
0(包含)
1(不包含)
]
    */
    @SerializedName("IsNot2")
    @Expose
    private Long IsNot2;

    /**
    * 特征过滤配置添加成功后自动生成的规则ID，当添加新特征过滤配置时，此字段不用填写；
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 协议，取值[tcp udp icmp all] 
     * @return Protocol 协议，取值[tcp udp icmp all]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，取值[tcp udp icmp all]
     * @param Protocol 协议，取值[tcp udp icmp all]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 起始源端口，取值0~65535 
     * @return SportStart 起始源端口，取值0~65535
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set 起始源端口，取值0~65535
     * @param SportStart 起始源端口，取值0~65535
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get 结束源端口，取值1~65535，必须大于等于起始源端口 
     * @return SportEnd 结束源端口，取值1~65535，必须大于等于起始源端口
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set 结束源端口，取值1~65535，必须大于等于起始源端口
     * @param SportEnd 结束源端口，取值1~65535，必须大于等于起始源端口
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get 起始目的端口，取值0~65535 
     * @return DportStart 起始目的端口，取值0~65535
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set 起始目的端口，取值0~65535
     * @param DportStart 起始目的端口，取值0~65535
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get 结束目的端口，取值1~65535，必须大于等于起始目的端口 
     * @return DportEnd 结束目的端口，取值1~65535，必须大于等于起始目的端口
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set 结束目的端口，取值1~65535，必须大于等于起始目的端口
     * @param DportEnd 结束目的端口，取值1~65535，必须大于等于起始目的端口
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get 最小报文长度，取值1-1500 
     * @return PktlenMin 最小报文长度，取值1-1500
     */
    public Long getPktlenMin() {
        return this.PktlenMin;
    }

    /**
     * Set 最小报文长度，取值1-1500
     * @param PktlenMin 最小报文长度，取值1-1500
     */
    public void setPktlenMin(Long PktlenMin) {
        this.PktlenMin = PktlenMin;
    }

    /**
     * Get 最大报文长度，取值1-1500，必须大于等于最小报文长度 
     * @return PktlenMax 最大报文长度，取值1-1500，必须大于等于最小报文长度
     */
    public Long getPktlenMax() {
        return this.PktlenMax;
    }

    /**
     * Set 最大报文长度，取值1-1500，必须大于等于最小报文长度
     * @param PktlenMax 最大报文长度，取值1-1500，必须大于等于最小报文长度
     */
    public void setPktlenMax(Long PktlenMax) {
        this.PktlenMax = PktlenMax;
    }

    /**
     * Get 动作，取值[
drop(丢弃)
transmit(放行)
drop_black(丢弃并拉黑)
drop_rst(拦截)
drop_black_rst(拦截并拉黑)
forward(继续防护)
] 
     * @return Action 动作，取值[
drop(丢弃)
transmit(放行)
drop_black(丢弃并拉黑)
drop_rst(拦截)
drop_black_rst(拦截并拉黑)
forward(继续防护)
]
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作，取值[
drop(丢弃)
transmit(放行)
drop_black(丢弃并拉黑)
drop_rst(拦截)
drop_black_rst(拦截并拉黑)
forward(继续防护)
]
     * @param Action 动作，取值[
drop(丢弃)
transmit(放行)
drop_black(丢弃并拉黑)
drop_rst(拦截)
drop_black_rst(拦截并拉黑)
forward(继续防护)
]
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 检测位置，取值[
begin_l3(IP头)
begin_l4(TCP/UDP头)
begin_l5(T载荷)
no_match(不匹配)
] 
     * @return MatchBegin 检测位置，取值[
begin_l3(IP头)
begin_l4(TCP/UDP头)
begin_l5(T载荷)
no_match(不匹配)
]
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * Set 检测位置，取值[
begin_l3(IP头)
begin_l4(TCP/UDP头)
begin_l5(T载荷)
no_match(不匹配)
]
     * @param MatchBegin 检测位置，取值[
begin_l3(IP头)
begin_l4(TCP/UDP头)
begin_l5(T载荷)
no_match(不匹配)
]
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * Get 检测类型，取值[
sunday(关键字)
pcre(正则表达式)
] 
     * @return MatchType 检测类型，取值[
sunday(关键字)
pcre(正则表达式)
]
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 检测类型，取值[
sunday(关键字)
pcre(正则表达式)
]
     * @param MatchType 检测类型，取值[
sunday(关键字)
pcre(正则表达式)
]
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get 检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
] 
     * @return Str 检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
]
     */
    public String getStr() {
        return this.Str;
    }

    /**
     * Set 检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
]
     * @param Str 检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
]
     */
    public void setStr(String Str) {
        this.Str = Str;
    }

    /**
     * Get 从检测位置开始的检测深度，取值[0,1500] 
     * @return Depth 从检测位置开始的检测深度，取值[0,1500]
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set 从检测位置开始的检测深度，取值[0,1500]
     * @param Depth 从检测位置开始的检测深度，取值[0,1500]
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get 从检测位置开始的偏移量，取值范围[0,Depth] 
     * @return Offset 从检测位置开始的偏移量，取值范围[0,Depth]
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 从检测位置开始的偏移量，取值范围[0,Depth]
     * @param Offset 从检测位置开始的偏移量，取值范围[0,Depth]
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 是否包含检测值，取值[
0(包含)
1(不包含)
] 
     * @return IsNot 是否包含检测值，取值[
0(包含)
1(不包含)
]
     */
    public Long getIsNot() {
        return this.IsNot;
    }

    /**
     * Set 是否包含检测值，取值[
0(包含)
1(不包含)
]
     * @param IsNot 是否包含检测值，取值[
0(包含)
1(不包含)
]
     */
    public void setIsNot(Long IsNot) {
        this.IsNot = IsNot;
    }

    /**
     * Get 当有第二个检测条件时，与第一检测条件的且或关系，取值[
and(且的关系)
none(当没有第二个检测条件时填写此值)
] 
     * @return MatchLogic 当有第二个检测条件时，与第一检测条件的且或关系，取值[
and(且的关系)
none(当没有第二个检测条件时填写此值)
]
     */
    public String getMatchLogic() {
        return this.MatchLogic;
    }

    /**
     * Set 当有第二个检测条件时，与第一检测条件的且或关系，取值[
and(且的关系)
none(当没有第二个检测条件时填写此值)
]
     * @param MatchLogic 当有第二个检测条件时，与第一检测条件的且或关系，取值[
and(且的关系)
none(当没有第二个检测条件时填写此值)
]
     */
    public void setMatchLogic(String MatchLogic) {
        this.MatchLogic = MatchLogic;
    }

    /**
     * Get 第二个检测位置，取值[
begin_l5(载荷)
no_match(不匹配)
] 
     * @return MatchBegin2 第二个检测位置，取值[
begin_l5(载荷)
no_match(不匹配)
]
     */
    public String getMatchBegin2() {
        return this.MatchBegin2;
    }

    /**
     * Set 第二个检测位置，取值[
begin_l5(载荷)
no_match(不匹配)
]
     * @param MatchBegin2 第二个检测位置，取值[
begin_l5(载荷)
no_match(不匹配)
]
     */
    public void setMatchBegin2(String MatchBegin2) {
        this.MatchBegin2 = MatchBegin2;
    }

    /**
     * Get 第二个检测类型，取值[
sunday(关键字)
pcre(正则表达式)
] 
     * @return MatchType2 第二个检测类型，取值[
sunday(关键字)
pcre(正则表达式)
]
     */
    public String getMatchType2() {
        return this.MatchType2;
    }

    /**
     * Set 第二个检测类型，取值[
sunday(关键字)
pcre(正则表达式)
]
     * @param MatchType2 第二个检测类型，取值[
sunday(关键字)
pcre(正则表达式)
]
     */
    public void setMatchType2(String MatchType2) {
        this.MatchType2 = MatchType2;
    }

    /**
     * Get 第二个检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
] 
     * @return Str2 第二个检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
]
     */
    public String getStr2() {
        return this.Str2;
    }

    /**
     * Set 第二个检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
]
     * @param Str2 第二个检测值，关键字符串或正则表达式,取值[
当检测类型为sunday时，请填写字符串或者16进制字节码，例如\x313233对应的是字符串"123"的16进制字节码;
当检测类型为pcre时, 请填写正则表达式字符串;
]
     */
    public void setStr2(String Str2) {
        this.Str2 = Str2;
    }

    /**
     * Get 从第二个检测位置开始的第二个检测深度，取值[0,1500] 
     * @return Depth2 从第二个检测位置开始的第二个检测深度，取值[0,1500]
     */
    public Long getDepth2() {
        return this.Depth2;
    }

    /**
     * Set 从第二个检测位置开始的第二个检测深度，取值[0,1500]
     * @param Depth2 从第二个检测位置开始的第二个检测深度，取值[0,1500]
     */
    public void setDepth2(Long Depth2) {
        this.Depth2 = Depth2;
    }

    /**
     * Get 从第二个检测位置开始的偏移量，取值范围[0,Depth2] 
     * @return Offset2 从第二个检测位置开始的偏移量，取值范围[0,Depth2]
     */
    public Long getOffset2() {
        return this.Offset2;
    }

    /**
     * Set 从第二个检测位置开始的偏移量，取值范围[0,Depth2]
     * @param Offset2 从第二个检测位置开始的偏移量，取值范围[0,Depth2]
     */
    public void setOffset2(Long Offset2) {
        this.Offset2 = Offset2;
    }

    /**
     * Get 第二个检测是否包含检测值，取值[
0(包含)
1(不包含)
] 
     * @return IsNot2 第二个检测是否包含检测值，取值[
0(包含)
1(不包含)
]
     */
    public Long getIsNot2() {
        return this.IsNot2;
    }

    /**
     * Set 第二个检测是否包含检测值，取值[
0(包含)
1(不包含)
]
     * @param IsNot2 第二个检测是否包含检测值，取值[
0(包含)
1(不包含)
]
     */
    public void setIsNot2(Long IsNot2) {
        this.IsNot2 = IsNot2;
    }

    /**
     * Get 特征过滤配置添加成功后自动生成的规则ID，当添加新特征过滤配置时，此字段不用填写； 
     * @return Id 特征过滤配置添加成功后自动生成的规则ID，当添加新特征过滤配置时，此字段不用填写；
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 特征过滤配置添加成功后自动生成的规则ID，当添加新特征过滤配置时，此字段不用填写；
     * @param Id 特征过滤配置添加成功后自动生成的规则ID，当添加新特征过滤配置时，此字段不用填写；
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public PacketFilterConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PacketFilterConfig(PacketFilterConfig source) {
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.PktlenMin != null) {
            this.PktlenMin = new Long(source.PktlenMin);
        }
        if (source.PktlenMax != null) {
            this.PktlenMax = new Long(source.PktlenMax);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.MatchBegin != null) {
            this.MatchBegin = new String(source.MatchBegin);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.Str != null) {
            this.Str = new String(source.Str);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.IsNot != null) {
            this.IsNot = new Long(source.IsNot);
        }
        if (source.MatchLogic != null) {
            this.MatchLogic = new String(source.MatchLogic);
        }
        if (source.MatchBegin2 != null) {
            this.MatchBegin2 = new String(source.MatchBegin2);
        }
        if (source.MatchType2 != null) {
            this.MatchType2 = new String(source.MatchType2);
        }
        if (source.Str2 != null) {
            this.Str2 = new String(source.Str2);
        }
        if (source.Depth2 != null) {
            this.Depth2 = new Long(source.Depth2);
        }
        if (source.Offset2 != null) {
            this.Offset2 = new Long(source.Offset2);
        }
        if (source.IsNot2 != null) {
            this.IsNot2 = new Long(source.IsNot2);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "PktlenMin", this.PktlenMin);
        this.setParamSimple(map, prefix + "PktlenMax", this.PktlenMax);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "Str", this.Str);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "IsNot", this.IsNot);
        this.setParamSimple(map, prefix + "MatchLogic", this.MatchLogic);
        this.setParamSimple(map, prefix + "MatchBegin2", this.MatchBegin2);
        this.setParamSimple(map, prefix + "MatchType2", this.MatchType2);
        this.setParamSimple(map, prefix + "Str2", this.Str2);
        this.setParamSimple(map, prefix + "Depth2", this.Depth2);
        this.setParamSimple(map, prefix + "Offset2", this.Offset2);
        this.setParamSimple(map, prefix + "IsNot2", this.IsNot2);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

