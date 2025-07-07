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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class L4DelRule extends AbstractModel {

    /**
    * 资源Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 规则Id
    */
    @SerializedName("RuleIdList")
    @Expose
    private String [] RuleIdList;

    /**
     * Get 资源Id 
     * @return Id 资源Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源Id
     * @param Id 资源Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 资源IP 
     * @return Ip 资源IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * Set 资源IP
     * @param Ip 资源IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * Get 规则Id 
     * @return RuleIdList 规则Id
     */
    public String [] getRuleIdList() {
        return this.RuleIdList;
    }

    /**
     * Set 规则Id
     * @param RuleIdList 规则Id
     */
    public void setRuleIdList(String [] RuleIdList) {
        this.RuleIdList = RuleIdList;
    }

    public L4DelRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public L4DelRule(L4DelRule source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.Ip != null) {
            this.Ip = new String(source.Ip);
        }
        if (source.RuleIdList != null) {
            this.RuleIdList = new String[source.RuleIdList.length];
            for (int i = 0; i < source.RuleIdList.length; i++) {
                this.RuleIdList[i] = new String(source.RuleIdList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamArraySimple(map, prefix + "RuleIdList.", this.RuleIdList);

    }
}

