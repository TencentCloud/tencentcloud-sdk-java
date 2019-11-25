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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DDoSPolicyPortLimit  extends AbstractModel{

    /**
    * 协议，取值范围[tcp,udp,icmp,all]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 开始目的端口，取值范围[0,65535]
    */
    @SerializedName("DPortStart")
    @Expose
    private Long DPortStart;

    /**
    * 结束目的端口，取值范围[0,65535]，要求大于等于开始目的端口
    */
    @SerializedName("DPortEnd")
    @Expose
    private Long DPortEnd;

    /**
    * 开始源端口，取值范围[0,65535]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPortStart")
    @Expose
    private Long SPortStart;

    /**
    * 结束源端口，取值范围[0,65535]，要求大于等于开始源端口
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SPortEnd")
    @Expose
    private Long SPortEnd;

    /**
    * 执行动作，取值[drop(丢弃) ，transmit(转发)]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 禁用端口类型，取值[0（目的端口范围禁用）， 1（源端口范围禁用）， 2（目的和源端口范围同时禁用）]
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Kind")
    @Expose
    private Long Kind;

    /**
     * 获取协议，取值范围[tcp,udp,icmp,all]
     * @return Protocol 协议，取值范围[tcp,udp,icmp,all]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置协议，取值范围[tcp,udp,icmp,all]
     * @param Protocol 协议，取值范围[tcp,udp,icmp,all]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取开始目的端口，取值范围[0,65535]
     * @return DPortStart 开始目的端口，取值范围[0,65535]
     */
    public Long getDPortStart() {
        return this.DPortStart;
    }

    /**
     * 设置开始目的端口，取值范围[0,65535]
     * @param DPortStart 开始目的端口，取值范围[0,65535]
     */
    public void setDPortStart(Long DPortStart) {
        this.DPortStart = DPortStart;
    }

    /**
     * 获取结束目的端口，取值范围[0,65535]，要求大于等于开始目的端口
     * @return DPortEnd 结束目的端口，取值范围[0,65535]，要求大于等于开始目的端口
     */
    public Long getDPortEnd() {
        return this.DPortEnd;
    }

    /**
     * 设置结束目的端口，取值范围[0,65535]，要求大于等于开始目的端口
     * @param DPortEnd 结束目的端口，取值范围[0,65535]，要求大于等于开始目的端口
     */
    public void setDPortEnd(Long DPortEnd) {
        this.DPortEnd = DPortEnd;
    }

    /**
     * 获取开始源端口，取值范围[0,65535]
注意：此字段可能返回 null，表示取不到有效值。
     * @return SPortStart 开始源端口，取值范围[0,65535]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSPortStart() {
        return this.SPortStart;
    }

    /**
     * 设置开始源端口，取值范围[0,65535]
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPortStart 开始源端口，取值范围[0,65535]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSPortStart(Long SPortStart) {
        this.SPortStart = SPortStart;
    }

    /**
     * 获取结束源端口，取值范围[0,65535]，要求大于等于开始源端口
注意：此字段可能返回 null，表示取不到有效值。
     * @return SPortEnd 结束源端口，取值范围[0,65535]，要求大于等于开始源端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSPortEnd() {
        return this.SPortEnd;
    }

    /**
     * 设置结束源端口，取值范围[0,65535]，要求大于等于开始源端口
注意：此字段可能返回 null，表示取不到有效值。
     * @param SPortEnd 结束源端口，取值范围[0,65535]，要求大于等于开始源端口
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSPortEnd(Long SPortEnd) {
        this.SPortEnd = SPortEnd;
    }

    /**
     * 获取执行动作，取值[drop(丢弃) ，transmit(转发)]
注意：此字段可能返回 null，表示取不到有效值。
     * @return Action 执行动作，取值[drop(丢弃) ，transmit(转发)]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * 设置执行动作，取值[drop(丢弃) ，transmit(转发)]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Action 执行动作，取值[drop(丢弃) ，transmit(转发)]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * 获取禁用端口类型，取值[0（目的端口范围禁用）， 1（源端口范围禁用）， 2（目的和源端口范围同时禁用）]
注意：此字段可能返回 null，表示取不到有效值。
     * @return Kind 禁用端口类型，取值[0（目的端口范围禁用）， 1（源端口范围禁用）， 2（目的和源端口范围同时禁用）]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getKind() {
        return this.Kind;
    }

    /**
     * 设置禁用端口类型，取值[0（目的端口范围禁用）， 1（源端口范围禁用）， 2（目的和源端口范围同时禁用）]
注意：此字段可能返回 null，表示取不到有效值。
     * @param Kind 禁用端口类型，取值[0（目的端口范围禁用）， 1（源端口范围禁用）， 2（目的和源端口范围同时禁用）]
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKind(Long Kind) {
        this.Kind = Kind;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DPortStart", this.DPortStart);
        this.setParamSimple(map, prefix + "DPortEnd", this.DPortEnd);
        this.setParamSimple(map, prefix + "SPortStart", this.SPortStart);
        this.setParamSimple(map, prefix + "SPortEnd", this.SPortEnd);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Kind", this.Kind);

    }
}

