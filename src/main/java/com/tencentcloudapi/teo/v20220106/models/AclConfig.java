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

public class AclConfig extends AbstractModel{

    /**
    * 开关
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * ACL用户规则
    */
    @SerializedName("UserRules")
    @Expose
    private ACLUserRule [] UserRules;

    /**
     * Get 开关 
     * @return Switch 开关
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 开关
     * @param Switch 开关
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get ACL用户规则 
     * @return UserRules ACL用户规则
     */
    public ACLUserRule [] getUserRules() {
        return this.UserRules;
    }

    /**
     * Set ACL用户规则
     * @param UserRules ACL用户规则
     */
    public void setUserRules(ACLUserRule [] UserRules) {
        this.UserRules = UserRules;
    }

    public AclConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AclConfig(AclConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.UserRules != null) {
            this.UserRules = new ACLUserRule[source.UserRules.length];
            for (int i = 0; i < source.UserRules.length; i++) {
                this.UserRules[i] = new ACLUserRule(source.UserRules[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamArrayObj(map, prefix + "UserRules.", this.UserRules);

    }
}

