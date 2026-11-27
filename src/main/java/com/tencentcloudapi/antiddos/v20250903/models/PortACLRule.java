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
package com.tencentcloudapi.antiddos.v20250903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PortACLRule extends AbstractModel {

    /**
    * <p>源端口范围。</p>
    */
    @SerializedName("SourcePortRange")
    @Expose
    private PortRange SourcePortRange;

    /**
    * <p>目的端口范围。</p>
    */
    @SerializedName("DestinationPortRange")
    @Expose
    private PortRange DestinationPortRange;

    /**
    * <p>协议类型。</p><p>枚举值：</p><ul><li>all ： 所有协议。</li><li>tcp： TCP 协议。</li><li>udp： UDP 协议。</li></ul>
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * <p>处置动作。</p><p>枚举值：</p><ul><li>drop： 丢弃。</li><li>allow： 放行。</li><li>forward： 继续防护，即继续执行下一个防护子策略模块，而非端口过滤内的其他规则。</li></ul>
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * Get <p>源端口范围。</p> 
     * @return SourcePortRange <p>源端口范围。</p>
     */
    public PortRange getSourcePortRange() {
        return this.SourcePortRange;
    }

    /**
     * Set <p>源端口范围。</p>
     * @param SourcePortRange <p>源端口范围。</p>
     */
    public void setSourcePortRange(PortRange SourcePortRange) {
        this.SourcePortRange = SourcePortRange;
    }

    /**
     * Get <p>目的端口范围。</p> 
     * @return DestinationPortRange <p>目的端口范围。</p>
     */
    public PortRange getDestinationPortRange() {
        return this.DestinationPortRange;
    }

    /**
     * Set <p>目的端口范围。</p>
     * @param DestinationPortRange <p>目的端口范围。</p>
     */
    public void setDestinationPortRange(PortRange DestinationPortRange) {
        this.DestinationPortRange = DestinationPortRange;
    }

    /**
     * Get <p>协议类型。</p><p>枚举值：</p><ul><li>all ： 所有协议。</li><li>tcp： TCP 协议。</li><li>udp： UDP 协议。</li></ul> 
     * @return Protocol <p>协议类型。</p><p>枚举值：</p><ul><li>all ： 所有协议。</li><li>tcp： TCP 协议。</li><li>udp： UDP 协议。</li></ul>
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set <p>协议类型。</p><p>枚举值：</p><ul><li>all ： 所有协议。</li><li>tcp： TCP 协议。</li><li>udp： UDP 协议。</li></ul>
     * @param Protocol <p>协议类型。</p><p>枚举值：</p><ul><li>all ： 所有协议。</li><li>tcp： TCP 协议。</li><li>udp： UDP 协议。</li></ul>
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get <p>处置动作。</p><p>枚举值：</p><ul><li>drop： 丢弃。</li><li>allow： 放行。</li><li>forward： 继续防护，即继续执行下一个防护子策略模块，而非端口过滤内的其他规则。</li></ul> 
     * @return Action <p>处置动作。</p><p>枚举值：</p><ul><li>drop： 丢弃。</li><li>allow： 放行。</li><li>forward： 继续防护，即继续执行下一个防护子策略模块，而非端口过滤内的其他规则。</li></ul>
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set <p>处置动作。</p><p>枚举值：</p><ul><li>drop： 丢弃。</li><li>allow： 放行。</li><li>forward： 继续防护，即继续执行下一个防护子策略模块，而非端口过滤内的其他规则。</li></ul>
     * @param Action <p>处置动作。</p><p>枚举值：</p><ul><li>drop： 丢弃。</li><li>allow： 放行。</li><li>forward： 继续防护，即继续执行下一个防护子策略模块，而非端口过滤内的其他规则。</li></ul>
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    public PortACLRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PortACLRule(PortACLRule source) {
        if (source.SourcePortRange != null) {
            this.SourcePortRange = new PortRange(source.SourcePortRange);
        }
        if (source.DestinationPortRange != null) {
            this.DestinationPortRange = new PortRange(source.DestinationPortRange);
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
        this.setParamObj(map, prefix + "SourcePortRange.", this.SourcePortRange);
        this.setParamObj(map, prefix + "DestinationPortRange.", this.DestinationPortRange);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

