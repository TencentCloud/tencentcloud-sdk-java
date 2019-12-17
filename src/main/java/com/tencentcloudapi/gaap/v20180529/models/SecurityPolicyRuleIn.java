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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SecurityPolicyRuleIn extends AbstractModel{

    /**
    * 请求来源IP或IP段。
    */
    @SerializedName("SourceCidr")
    @Expose
    private String SourceCidr;

    /**
    * 策略：允许（ACCEPT）或拒绝（DROP）
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 规则别名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 协议：TCP或UDP，ALL表示所有协议
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 目标端口，填写格式举例：
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL
    */
    @SerializedName("DestPortRange")
    @Expose
    private String DestPortRange;

    /**
     * Get 请求来源IP或IP段。 
     * @return SourceCidr 请求来源IP或IP段。
     */
    public String getSourceCidr() {
        return this.SourceCidr;
    }

    /**
     * Set 请求来源IP或IP段。
     * @param SourceCidr 请求来源IP或IP段。
     */
    public void setSourceCidr(String SourceCidr) {
        this.SourceCidr = SourceCidr;
    }

    /**
     * Get 策略：允许（ACCEPT）或拒绝（DROP） 
     * @return Action 策略：允许（ACCEPT）或拒绝（DROP）
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 策略：允许（ACCEPT）或拒绝（DROP）
     * @param Action 策略：允许（ACCEPT）或拒绝（DROP）
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 规则别名 
     * @return AliasName 规则别名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * Set 规则别名
     * @param AliasName 规则别名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * Get 协议：TCP或UDP，ALL表示所有协议 
     * @return Protocol 协议：TCP或UDP，ALL表示所有协议
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * Set 协议：TCP或UDP，ALL表示所有协议
     * @param Protocol 协议：TCP或UDP，ALL表示所有协议
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * Get 目标端口，填写格式举例：
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL 
     * @return DestPortRange 目标端口，填写格式举例：
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL
     */
    public String getDestPortRange() {
        return this.DestPortRange;
    }

    /**
     * Set 目标端口，填写格式举例：
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL
     * @param DestPortRange 目标端口，填写格式举例：
单个端口: 80
多个端口: 80,443
连续端口: 3306-20000
所有端口: ALL
     */
    public void setDestPortRange(String DestPortRange) {
        this.DestPortRange = DestPortRange;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SourceCidr", this.SourceCidr);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "DestPortRange", this.DestPortRange);

    }
}

