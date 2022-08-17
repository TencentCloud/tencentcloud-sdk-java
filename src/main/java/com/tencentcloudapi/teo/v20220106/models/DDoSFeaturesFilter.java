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
    * 执行动作，取值有：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>drop_block ：丢弃并拉黑 ；</li>
<li>forward ：继续防护 。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>icmp ：icmp协议 ；</li>
<li>all ：全部协议 。</li>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 目标端口开始，取值范围0-65535。
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * 目标端口结束，取值范围0-65535。
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * 最小包长，取值范围0-1500。
    */
    @SerializedName("PacketMin")
    @Expose
    private Long PacketMin;

    /**
    * 最大包长，取值范围0-1500。
    */
    @SerializedName("PacketMax")
    @Expose
    private Long PacketMax;

    /**
    * 源端口开始，取值范围0-65535。
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * 源端口结束，取值范围0-65535。
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * 匹配方式1，【特征1】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 取非判断，该参数对MatchType配合使用，【特征1】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li>
    */
    @SerializedName("IsNot")
    @Expose
    private Long IsNot;

    /**
    * 偏移量1，【特征1】，取值范围0-1500。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 检测包字符深度，【特征1】，取值范围1-1500。
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测 ；</li>
<li>begin_l3 ：ip首部开始检测 。</li>
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * 正则或字符串匹配的内容，【特征1】。
    */
    @SerializedName("Str")
    @Expose
    private String Str;

    /**
    * 匹配方式2，【特征2】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。
    */
    @SerializedName("MatchType2")
    @Expose
    private String MatchType2;

    /**
    * 取非判断2，该参数对MatchType2配合使用，【特征2】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li>
    */
    @SerializedName("IsNot2")
    @Expose
    private Long IsNot2;

    /**
    * 偏移量2，【特征2】，取值范围0-1500。
    */
    @SerializedName("Offset2")
    @Expose
    private Long Offset2;

    /**
    * 检测包字符深度，【特征2】，取值范围1-1500。
    */
    @SerializedName("Depth2")
    @Expose
    private Long Depth2;

    /**
    * 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测；</li>
<li>begin_l3 ：ip首部开始检测 。</li>
    */
    @SerializedName("MatchBegin2")
    @Expose
    private String MatchBegin2;

    /**
    * 正则或字符串匹配的内容，【特征2】。
    */
    @SerializedName("Str2")
    @Expose
    private String Str2;

    /**
    * 多特征关系，仅配置【特征1】时填 none，存在【特征2】配置可不填。
    */
    @SerializedName("MatchLogic")
    @Expose
    private String MatchLogic;

    /**
     * Get 执行动作，取值有：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>drop_block ：丢弃并拉黑 ；</li>
<li>forward ：继续防护 。</li> 
     * @return Action 执行动作，取值有：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>drop_block ：丢弃并拉黑 ；</li>
<li>forward ：继续防护 。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作，取值有：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>drop_block ：丢弃并拉黑 ；</li>
<li>forward ：继续防护 。</li>
     * @param Action 执行动作，取值有：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>drop_block ：丢弃并拉黑 ；</li>
<li>forward ：继续防护 。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>icmp ：icmp协议 ；</li>
<li>all ：全部协议 。</li> 
     * @return Protocol 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>icmp ：icmp协议 ；</li>
<li>all ：全部协议 。</li>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>icmp ：icmp协议 ；</li>
<li>all ：全部协议 。</li>
     * @param Protocol 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>icmp ：icmp协议 ；</li>
<li>all ：全部协议 。</li>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 目标端口开始，取值范围0-65535。 
     * @return DportStart 目标端口开始，取值范围0-65535。
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set 目标端口开始，取值范围0-65535。
     * @param DportStart 目标端口开始，取值范围0-65535。
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * Get 目标端口结束，取值范围0-65535。 
     * @return DportEnd 目标端口结束，取值范围0-65535。
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set 目标端口结束，取值范围0-65535。
     * @param DportEnd 目标端口结束，取值范围0-65535。
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get 最小包长，取值范围0-1500。 
     * @return PacketMin 最小包长，取值范围0-1500。
     */
    public Long getPacketMin() {
        return this.PacketMin;
    }

    /**
     * Set 最小包长，取值范围0-1500。
     * @param PacketMin 最小包长，取值范围0-1500。
     */
    public void setPacketMin(Long PacketMin) {
        this.PacketMin = PacketMin;
    }

    /**
     * Get 最大包长，取值范围0-1500。 
     * @return PacketMax 最大包长，取值范围0-1500。
     */
    public Long getPacketMax() {
        return this.PacketMax;
    }

    /**
     * Set 最大包长，取值范围0-1500。
     * @param PacketMax 最大包长，取值范围0-1500。
     */
    public void setPacketMax(Long PacketMax) {
        this.PacketMax = PacketMax;
    }

    /**
     * Get 源端口开始，取值范围0-65535。 
     * @return SportStart 源端口开始，取值范围0-65535。
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * Set 源端口开始，取值范围0-65535。
     * @param SportStart 源端口开始，取值范围0-65535。
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * Get 源端口结束，取值范围0-65535。 
     * @return SportEnd 源端口结束，取值范围0-65535。
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * Set 源端口结束，取值范围0-65535。
     * @param SportEnd 源端口结束，取值范围0-65535。
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * Get 匹配方式1，【特征1】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。 
     * @return MatchType 匹配方式1，【特征1】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * Set 匹配方式1，【特征1】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。
     * @param MatchType 匹配方式1，【特征1】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * Get 取非判断，该参数对MatchType配合使用，【特征1】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li> 
     * @return IsNot 取非判断，该参数对MatchType配合使用，【特征1】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li>
     */
    public Long getIsNot() {
        return this.IsNot;
    }

    /**
     * Set 取非判断，该参数对MatchType配合使用，【特征1】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li>
     * @param IsNot 取非判断，该参数对MatchType配合使用，【特征1】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li>
     */
    public void setIsNot(Long IsNot) {
        this.IsNot = IsNot;
    }

    /**
     * Get 偏移量1，【特征1】，取值范围0-1500。 
     * @return Offset 偏移量1，【特征1】，取值范围0-1500。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量1，【特征1】，取值范围0-1500。
     * @param Offset 偏移量1，【特征1】，取值范围0-1500。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 检测包字符深度，【特征1】，取值范围1-1500。 
     * @return Depth 检测包字符深度，【特征1】，取值范围1-1500。
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * Set 检测包字符深度，【特征1】，取值范围1-1500。
     * @param Depth 检测包字符深度，【特征1】，取值范围1-1500。
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * Get 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测 ；</li>
<li>begin_l3 ：ip首部开始检测 。</li> 
     * @return MatchBegin 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测 ；</li>
<li>begin_l3 ：ip首部开始检测 。</li>
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * Set 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测 ；</li>
<li>begin_l3 ：ip首部开始检测 。</li>
     * @param MatchBegin 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测 ；</li>
<li>begin_l3 ：ip首部开始检测 。</li>
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * Get 正则或字符串匹配的内容，【特征1】。 
     * @return Str 正则或字符串匹配的内容，【特征1】。
     */
    public String getStr() {
        return this.Str;
    }

    /**
     * Set 正则或字符串匹配的内容，【特征1】。
     * @param Str 正则或字符串匹配的内容，【特征1】。
     */
    public void setStr(String Str) {
        this.Str = Str;
    }

    /**
     * Get 匹配方式2，【特征2】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。 
     * @return MatchType2 匹配方式2，【特征2】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。
     */
    public String getMatchType2() {
        return this.MatchType2;
    }

    /**
     * Set 匹配方式2，【特征2】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。
     * @param MatchType2 匹配方式2，【特征2】，取值有：
<li>pcre ：正则匹配 ；</li>
<li>sunday ：字符串匹配 。</li>默认为空字符串。
     */
    public void setMatchType2(String MatchType2) {
        this.MatchType2 = MatchType2;
    }

    /**
     * Get 取非判断2，该参数对MatchType2配合使用，【特征2】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li> 
     * @return IsNot2 取非判断2，该参数对MatchType2配合使用，【特征2】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li>
     */
    public Long getIsNot2() {
        return this.IsNot2;
    }

    /**
     * Set 取非判断2，该参数对MatchType2配合使用，【特征2】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li>
     * @param IsNot2 取非判断2，该参数对MatchType2配合使用，【特征2】，取值有：
<li>0 ：匹配 ；</li>
<li>1 ：不匹配 。</li>
     */
    public void setIsNot2(Long IsNot2) {
        this.IsNot2 = IsNot2;
    }

    /**
     * Get 偏移量2，【特征2】，取值范围0-1500。 
     * @return Offset2 偏移量2，【特征2】，取值范围0-1500。
     */
    public Long getOffset2() {
        return this.Offset2;
    }

    /**
     * Set 偏移量2，【特征2】，取值范围0-1500。
     * @param Offset2 偏移量2，【特征2】，取值范围0-1500。
     */
    public void setOffset2(Long Offset2) {
        this.Offset2 = Offset2;
    }

    /**
     * Get 检测包字符深度，【特征2】，取值范围1-1500。 
     * @return Depth2 检测包字符深度，【特征2】，取值范围1-1500。
     */
    public Long getDepth2() {
        return this.Depth2;
    }

    /**
     * Set 检测包字符深度，【特征2】，取值范围1-1500。
     * @param Depth2 检测包字符深度，【特征2】，取值范围1-1500。
     */
    public void setDepth2(Long Depth2) {
        this.Depth2 = Depth2;
    }

    /**
     * Get 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测；</li>
<li>begin_l3 ：ip首部开始检测 。</li> 
     * @return MatchBegin2 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测；</li>
<li>begin_l3 ：ip首部开始检测 。</li>
     */
    public String getMatchBegin2() {
        return this.MatchBegin2;
    }

    /**
     * Set 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测；</li>
<li>begin_l3 ：ip首部开始检测 。</li>
     * @param MatchBegin2 匹配开始层级，层级参考计算机网络结构，取值有：
<li>begin_l5 ：载荷开始检测 ；</li>
<li>begin_l4 ：tcp/udp首部开始检测；</li>
<li>begin_l3 ：ip首部开始检测 。</li>
     */
    public void setMatchBegin2(String MatchBegin2) {
        this.MatchBegin2 = MatchBegin2;
    }

    /**
     * Get 正则或字符串匹配的内容，【特征2】。 
     * @return Str2 正则或字符串匹配的内容，【特征2】。
     */
    public String getStr2() {
        return this.Str2;
    }

    /**
     * Set 正则或字符串匹配的内容，【特征2】。
     * @param Str2 正则或字符串匹配的内容，【特征2】。
     */
    public void setStr2(String Str2) {
        this.Str2 = Str2;
    }

    /**
     * Get 多特征关系，仅配置【特征1】时填 none，存在【特征2】配置可不填。 
     * @return MatchLogic 多特征关系，仅配置【特征1】时填 none，存在【特征2】配置可不填。
     */
    public String getMatchLogic() {
        return this.MatchLogic;
    }

    /**
     * Set 多特征关系，仅配置【特征1】时填 none，存在【特征2】配置可不填。
     * @param MatchLogic 多特征关系，仅配置【特征1】时填 none，存在【特征2】配置可不填。
     */
    public void setMatchLogic(String MatchLogic) {
        this.MatchLogic = MatchLogic;
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
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.PacketMin != null) {
            this.PacketMin = new Long(source.PacketMin);
        }
        if (source.PacketMax != null) {
            this.PacketMax = new Long(source.PacketMax);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.MatchType != null) {
            this.MatchType = new String(source.MatchType);
        }
        if (source.IsNot != null) {
            this.IsNot = new Long(source.IsNot);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Depth != null) {
            this.Depth = new Long(source.Depth);
        }
        if (source.MatchBegin != null) {
            this.MatchBegin = new String(source.MatchBegin);
        }
        if (source.Str != null) {
            this.Str = new String(source.Str);
        }
        if (source.MatchType2 != null) {
            this.MatchType2 = new String(source.MatchType2);
        }
        if (source.IsNot2 != null) {
            this.IsNot2 = new Long(source.IsNot2);
        }
        if (source.Offset2 != null) {
            this.Offset2 = new Long(source.Offset2);
        }
        if (source.Depth2 != null) {
            this.Depth2 = new Long(source.Depth2);
        }
        if (source.MatchBegin2 != null) {
            this.MatchBegin2 = new String(source.MatchBegin2);
        }
        if (source.Str2 != null) {
            this.Str2 = new String(source.Str2);
        }
        if (source.MatchLogic != null) {
            this.MatchLogic = new String(source.MatchLogic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "PacketMin", this.PacketMin);
        this.setParamSimple(map, prefix + "PacketMax", this.PacketMax);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "IsNot", this.IsNot);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamSimple(map, prefix + "Str", this.Str);
        this.setParamSimple(map, prefix + "MatchType2", this.MatchType2);
        this.setParamSimple(map, prefix + "IsNot2", this.IsNot2);
        this.setParamSimple(map, prefix + "Offset2", this.Offset2);
        this.setParamSimple(map, prefix + "Depth2", this.Depth2);
        this.setParamSimple(map, prefix + "MatchBegin2", this.MatchBegin2);
        this.setParamSimple(map, prefix + "Str2", this.Str2);
        this.setParamSimple(map, prefix + "MatchLogic", this.MatchLogic);

    }
}

