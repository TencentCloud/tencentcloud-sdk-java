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
package com.tencentcloudapi.chdfs.v20190718.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccessRule extends AbstractModel{

    /**
    * 权限规则ID
    */
    @SerializedName("AccessRuleId")
    @Expose
    private Long AccessRuleId;

    /**
    * 权限规则地址（网段或IP）
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 权限规则访问模式（1：只读；2：读写）
    */
    @SerializedName("AccessMode")
    @Expose
    private Long AccessMode;

    /**
    * 优先级（取值范围1~100，值越小优先级越高）
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
     * Get 权限规则ID 
     * @return AccessRuleId 权限规则ID
     */
    public Long getAccessRuleId() {
        return this.AccessRuleId;
    }

    /**
     * Set 权限规则ID
     * @param AccessRuleId 权限规则ID
     */
    public void setAccessRuleId(Long AccessRuleId) {
        this.AccessRuleId = AccessRuleId;
    }

    /**
     * Get 权限规则地址（网段或IP） 
     * @return Address 权限规则地址（网段或IP）
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 权限规则地址（网段或IP）
     * @param Address 权限规则地址（网段或IP）
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 权限规则访问模式（1：只读；2：读写） 
     * @return AccessMode 权限规则访问模式（1：只读；2：读写）
     */
    public Long getAccessMode() {
        return this.AccessMode;
    }

    /**
     * Set 权限规则访问模式（1：只读；2：读写）
     * @param AccessMode 权限规则访问模式（1：只读；2：读写）
     */
    public void setAccessMode(Long AccessMode) {
        this.AccessMode = AccessMode;
    }

    /**
     * Get 优先级（取值范围1~100，值越小优先级越高） 
     * @return Priority 优先级（取值范围1~100，值越小优先级越高）
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 优先级（取值范围1~100，值越小优先级越高）
     * @param Priority 优先级（取值范围1~100，值越小优先级越高）
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 创建时间 
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AccessRuleId", this.AccessRuleId);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "AccessMode", this.AccessMode);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);

    }
}

