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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyStrategyRequest extends AbstractModel {

    /**
    * 策略Id
    */
    @SerializedName("StrategyId")
    @Expose
    private String StrategyId;

    /**
    * 下发规则接收账号
    */
    @SerializedName("ReceiveAccount")
    @Expose
    private String [] ReceiveAccount;

    /**
    * 优先级
    */
    @SerializedName("Sequence")
    @Expose
    private Long Sequence;

    /**
    * 规则组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 下发规则接收账号组
    */
    @SerializedName("ReceiveGroup")
    @Expose
    private String [] ReceiveGroup;

    /**
     * Get 策略Id 
     * @return StrategyId 策略Id
     */
    public String getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 策略Id
     * @param StrategyId 策略Id
     */
    public void setStrategyId(String StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 下发规则接收账号 
     * @return ReceiveAccount 下发规则接收账号
     */
    public String [] getReceiveAccount() {
        return this.ReceiveAccount;
    }

    /**
     * Set 下发规则接收账号
     * @param ReceiveAccount 下发规则接收账号
     */
    public void setReceiveAccount(String [] ReceiveAccount) {
        this.ReceiveAccount = ReceiveAccount;
    }

    /**
     * Get 优先级 
     * @return Sequence 优先级
     */
    public Long getSequence() {
        return this.Sequence;
    }

    /**
     * Set 优先级
     * @param Sequence 优先级
     */
    public void setSequence(Long Sequence) {
        this.Sequence = Sequence;
    }

    /**
     * Get 规则组Id 
     * @return GroupId 规则组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 规则组Id
     * @param GroupId 规则组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 下发规则接收账号组 
     * @return ReceiveGroup 下发规则接收账号组
     */
    public String [] getReceiveGroup() {
        return this.ReceiveGroup;
    }

    /**
     * Set 下发规则接收账号组
     * @param ReceiveGroup 下发规则接收账号组
     */
    public void setReceiveGroup(String [] ReceiveGroup) {
        this.ReceiveGroup = ReceiveGroup;
    }

    public ModifyStrategyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyStrategyRequest(ModifyStrategyRequest source) {
        if (source.StrategyId != null) {
            this.StrategyId = new String(source.StrategyId);
        }
        if (source.ReceiveAccount != null) {
            this.ReceiveAccount = new String[source.ReceiveAccount.length];
            for (int i = 0; i < source.ReceiveAccount.length; i++) {
                this.ReceiveAccount[i] = new String(source.ReceiveAccount[i]);
            }
        }
        if (source.Sequence != null) {
            this.Sequence = new Long(source.Sequence);
        }
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.ReceiveGroup != null) {
            this.ReceiveGroup = new String[source.ReceiveGroup.length];
            for (int i = 0; i < source.ReceiveGroup.length; i++) {
                this.ReceiveGroup[i] = new String(source.ReceiveGroup[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamArraySimple(map, prefix + "ReceiveAccount.", this.ReceiveAccount);
        this.setParamSimple(map, prefix + "Sequence", this.Sequence);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamArraySimple(map, prefix + "ReceiveGroup.", this.ReceiveGroup);

    }
}

