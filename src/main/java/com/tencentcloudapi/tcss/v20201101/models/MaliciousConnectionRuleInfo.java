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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MaliciousConnectionRuleInfo extends AbstractModel {

    /**
    * 枚举：
IP: 表示ipv4或者ipv6
DOMAIN: 表示域名
    */
    @SerializedName("RuleType")
    @Expose
    private String RuleType;

    /**
    * 自定义黑白名单的域名/IP
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 创建时间
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 备注
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 规则ID
    */
    @SerializedName("RuleID")
    @Expose
    private Long RuleID;

    /**
     * Get 枚举：
IP: 表示ipv4或者ipv6
DOMAIN: 表示域名 
     * @return RuleType 枚举：
IP: 表示ipv4或者ipv6
DOMAIN: 表示域名
     */
    public String getRuleType() {
        return this.RuleType;
    }

    /**
     * Set 枚举：
IP: 表示ipv4或者ipv6
DOMAIN: 表示域名
     * @param RuleType 枚举：
IP: 表示ipv4或者ipv6
DOMAIN: 表示域名
     */
    public void setRuleType(String RuleType) {
        this.RuleType = RuleType;
    }

    /**
     * Get 自定义黑白名单的域名/IP 
     * @return Address 自定义黑白名单的域名/IP
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 自定义黑白名单的域名/IP
     * @param Address 自定义黑白名单的域名/IP
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 创建时间 
     * @return CreatedTime 创建时间
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * Set 创建时间
     * @param CreatedTime 创建时间
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * Get 更新时间 
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * Get 备注 
     * @return Remark 备注
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 备注
     * @param Remark 备注
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Get 规则ID 
     * @return RuleID 规则ID
     */
    public Long getRuleID() {
        return this.RuleID;
    }

    /**
     * Set 规则ID
     * @param RuleID 规则ID
     */
    public void setRuleID(Long RuleID) {
        this.RuleID = RuleID;
    }

    public MaliciousConnectionRuleInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MaliciousConnectionRuleInfo(MaliciousConnectionRuleInfo source) {
        if (source.RuleType != null) {
            this.RuleType = new String(source.RuleType);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.CreatedTime != null) {
            this.CreatedTime = new String(source.CreatedTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
        if (source.RuleID != null) {
            this.RuleID = new Long(source.RuleID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleType", this.RuleType);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "RuleID", this.RuleID);

    }
}

