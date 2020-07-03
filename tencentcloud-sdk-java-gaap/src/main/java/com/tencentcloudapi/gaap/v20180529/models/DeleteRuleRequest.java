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

public class DeleteRuleRequest extends AbstractModel{

    /**
    * 7层监听器ID
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 转发规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 是否可以强制删除已绑定源站的转发规则，0非强制，1强制
    */
    @SerializedName("Force")
    @Expose
    private Long Force;

    /**
     * Get 7层监听器ID 
     * @return ListenerId 7层监听器ID
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * Set 7层监听器ID
     * @param ListenerId 7层监听器ID
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * Get 转发规则ID 
     * @return RuleId 转发规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 转发规则ID
     * @param RuleId 转发规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 是否可以强制删除已绑定源站的转发规则，0非强制，1强制 
     * @return Force 是否可以强制删除已绑定源站的转发规则，0非强制，1强制
     */
    public Long getForce() {
        return this.Force;
    }

    /**
     * Set 是否可以强制删除已绑定源站的转发规则，0非强制，1强制
     * @param Force 是否可以强制删除已绑定源站的转发规则，0非强制，1强制
     */
    public void setForce(Long Force) {
        this.Force = Force;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Force", this.Force);

    }
}

