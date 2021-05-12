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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotFlow extends AbstractModel{

    /**
    * 对话流ID
    */
    @SerializedName("BotFlowId")
    @Expose
    private String BotFlowId;

    /**
    * 对话流名称
    */
    @SerializedName("BotFlowName")
    @Expose
    private String BotFlowName;

    /**
    * 号码组信息列表
    */
    @SerializedName("PhonePoolList")
    @Expose
    private PhonePool [] PhonePoolList;

    /**
     * Get 对话流ID 
     * @return BotFlowId 对话流ID
     */
    public String getBotFlowId() {
        return this.BotFlowId;
    }

    /**
     * Set 对话流ID
     * @param BotFlowId 对话流ID
     */
    public void setBotFlowId(String BotFlowId) {
        this.BotFlowId = BotFlowId;
    }

    /**
     * Get 对话流名称 
     * @return BotFlowName 对话流名称
     */
    public String getBotFlowName() {
        return this.BotFlowName;
    }

    /**
     * Set 对话流名称
     * @param BotFlowName 对话流名称
     */
    public void setBotFlowName(String BotFlowName) {
        this.BotFlowName = BotFlowName;
    }

    /**
     * Get 号码组信息列表 
     * @return PhonePoolList 号码组信息列表
     */
    public PhonePool [] getPhonePoolList() {
        return this.PhonePoolList;
    }

    /**
     * Set 号码组信息列表
     * @param PhonePoolList 号码组信息列表
     */
    public void setPhonePoolList(PhonePool [] PhonePoolList) {
        this.PhonePoolList = PhonePoolList;
    }

    public BotFlow() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotFlow(BotFlow source) {
        if (source.BotFlowId != null) {
            this.BotFlowId = new String(source.BotFlowId);
        }
        if (source.BotFlowName != null) {
            this.BotFlowName = new String(source.BotFlowName);
        }
        if (source.PhonePoolList != null) {
            this.PhonePoolList = new PhonePool[source.PhonePoolList.length];
            for (int i = 0; i < source.PhonePoolList.length; i++) {
                this.PhonePoolList[i] = new PhonePool(source.PhonePoolList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BotFlowId", this.BotFlowId);
        this.setParamSimple(map, prefix + "BotFlowName", this.BotFlowName);
        this.setParamArrayObj(map, prefix + "PhonePoolList.", this.PhonePoolList);

    }
}

