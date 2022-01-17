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

public class AclConfig extends AbstractModel{

    /**
    * 协议类型, 可取值tcp, udp, all
    */
    @SerializedName("ForwardProtocol")
    @Expose
    private String ForwardProtocol;

    /**
    * 目的端口起始，可取值范围0~65535
    */
    @SerializedName("DPortStart")
    @Expose
    private Long DPortStart;

    /**
    * 目的端口结束，可取值范围0~65535
    */
    @SerializedName("DPortEnd")
    @Expose
    private Long DPortEnd;

    /**
    * 来源端口起始，可取值范围0~65535
    */
    @SerializedName("SPortStart")
    @Expose
    private Long SPortStart;

    /**
    * 来源端口结束，可取值范围0~65535
    */
    @SerializedName("SPortEnd")
    @Expose
    private Long SPortEnd;

    /**
    * 动作，可取值：drop， transmit， forward
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 策略优先级，数字越小，级别越高，该规则越靠前匹配，取值1-1000
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * Get 协议类型, 可取值tcp, udp, all 
     * @return ForwardProtocol 协议类型, 可取值tcp, udp, all
     */
    public String getForwardProtocol() {
        return this.ForwardProtocol;
    }

    /**
     * Set 协议类型, 可取值tcp, udp, all
     * @param ForwardProtocol 协议类型, 可取值tcp, udp, all
     */
    public void setForwardProtocol(String ForwardProtocol) {
        this.ForwardProtocol = ForwardProtocol;
    }

    /**
     * Get 目的端口起始，可取值范围0~65535 
     * @return DPortStart 目的端口起始，可取值范围0~65535
     */
    public Long getDPortStart() {
        return this.DPortStart;
    }

    /**
     * Set 目的端口起始，可取值范围0~65535
     * @param DPortStart 目的端口起始，可取值范围0~65535
     */
    public void setDPortStart(Long DPortStart) {
        this.DPortStart = DPortStart;
    }

    /**
     * Get 目的端口结束，可取值范围0~65535 
     * @return DPortEnd 目的端口结束，可取值范围0~65535
     */
    public Long getDPortEnd() {
        return this.DPortEnd;
    }

    /**
     * Set 目的端口结束，可取值范围0~65535
     * @param DPortEnd 目的端口结束，可取值范围0~65535
     */
    public void setDPortEnd(Long DPortEnd) {
        this.DPortEnd = DPortEnd;
    }

    /**
     * Get 来源端口起始，可取值范围0~65535 
     * @return SPortStart 来源端口起始，可取值范围0~65535
     */
    public Long getSPortStart() {
        return this.SPortStart;
    }

    /**
     * Set 来源端口起始，可取值范围0~65535
     * @param SPortStart 来源端口起始，可取值范围0~65535
     */
    public void setSPortStart(Long SPortStart) {
        this.SPortStart = SPortStart;
    }

    /**
     * Get 来源端口结束，可取值范围0~65535 
     * @return SPortEnd 来源端口结束，可取值范围0~65535
     */
    public Long getSPortEnd() {
        return this.SPortEnd;
    }

    /**
     * Set 来源端口结束，可取值范围0~65535
     * @param SPortEnd 来源端口结束，可取值范围0~65535
     */
    public void setSPortEnd(Long SPortEnd) {
        this.SPortEnd = SPortEnd;
    }

    /**
     * Get 动作，可取值：drop， transmit， forward 
     * @return Action 动作，可取值：drop， transmit， forward
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 动作，可取值：drop， transmit， forward
     * @param Action 动作，可取值：drop， transmit， forward
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 策略优先级，数字越小，级别越高，该规则越靠前匹配，取值1-1000
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 策略优先级，数字越小，级别越高，该规则越靠前匹配，取值1-1000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 策略优先级，数字越小，级别越高，该规则越靠前匹配，取值1-1000
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 策略优先级，数字越小，级别越高，该规则越靠前匹配，取值1-1000
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    public AclConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclConfig(AclConfig source) {
        if (source.ForwardProtocol != null) {
            this.ForwardProtocol = new String(source.ForwardProtocol);
        }
        if (source.DPortStart != null) {
            this.DPortStart = new Long(source.DPortStart);
        }
        if (source.DPortEnd != null) {
            this.DPortEnd = new Long(source.DPortEnd);
        }
        if (source.SPortStart != null) {
            this.SPortStart = new Long(source.SPortStart);
        }
        if (source.SPortEnd != null) {
            this.SPortEnd = new Long(source.SPortEnd);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ForwardProtocol", this.ForwardProtocol);
        this.setParamSimple(map, prefix + "DPortStart", this.DPortStart);
        this.setParamSimple(map, prefix + "DPortEnd", this.DPortEnd);
        this.setParamSimple(map, prefix + "SPortStart", this.SPortStart);
        this.setParamSimple(map, prefix + "SPortEnd", this.SPortEnd);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

