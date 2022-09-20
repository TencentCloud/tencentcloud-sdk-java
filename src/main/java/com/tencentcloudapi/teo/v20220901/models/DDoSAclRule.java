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

public class DDoSAclRule extends AbstractModel{

    /**
    * 目的端口结束，取值范围0-65535。
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * 目的端口开始，取值范围0-65535。
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * 源端口结束，取值范围0-65535。
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * 源端口开始，取值范围0-65535。
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>all ：全部协议 。</li>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 执行动作，取值为：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>forward ：继续防护 。</li>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get 目的端口结束，取值范围0-65535。 
     * @return DportEnd 目的端口结束，取值范围0-65535。
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * Set 目的端口结束，取值范围0-65535。
     * @param DportEnd 目的端口结束，取值范围0-65535。
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * Get 目的端口开始，取值范围0-65535。 
     * @return DportStart 目的端口开始，取值范围0-65535。
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * Set 目的端口开始，取值范围0-65535。
     * @param DportStart 目的端口开始，取值范围0-65535。
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
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
     * Get 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>all ：全部协议 。</li> 
     * @return Protocol 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>all ：全部协议 。</li>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>all ：全部协议 。</li>
     * @param Protocol 协议，取值有：
<li>tcp ：tcp协议 ；</li>
<li>udp ：udp协议 ；</li>
<li>all ：全部协议 。</li>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 执行动作，取值为：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>forward ：继续防护 。</li> 
     * @return Action 执行动作，取值为：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>forward ：继续防护 。</li>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 执行动作，取值为：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>forward ：继续防护 。</li>
     * @param Action 执行动作，取值为：
<li>drop ：丢弃 ；</li>
<li>transmit ：放行 ；</li>
<li>forward ：继续防护 。</li>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public DDoSAclRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DDoSAclRule(DDoSAclRule source) {
        if (source.DportEnd != null) {
            this.DportEnd = new Long(source.DportEnd);
        }
        if (source.DportStart != null) {
            this.DportStart = new Long(source.DportStart);
        }
        if (source.SportEnd != null) {
            this.SportEnd = new Long(source.SportEnd);
        }
        if (source.SportStart != null) {
            this.SportStart = new Long(source.SportStart);
        }
        if (source.Protocol != null) {
            this.Protocol = new String(source.Protocol);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

