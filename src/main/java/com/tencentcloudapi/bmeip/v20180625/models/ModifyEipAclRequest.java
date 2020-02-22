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
package com.tencentcloudapi.bmeip.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyEipAclRequest extends AbstractModel{

    /**
    * ACL 实例 ID
    */
    @SerializedName("AclId")
    @Expose
    private String AclId;

    /**
    * ACL 名称
    */
    @SerializedName("AclName")
    @Expose
    private String AclName;

    /**
    * ACL 状态。0：无状态 1：有状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 规则类型（in/out）。in：入站规则 out：出站规则
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * ACL规则列表
    */
    @SerializedName("Rules")
    @Expose
    private EipAclRule [] Rules;

    /**
     * Get ACL 实例 ID 
     * @return AclId ACL 实例 ID
     */
    public String getAclId() {
        return this.AclId;
    }

    /**
     * Set ACL 实例 ID
     * @param AclId ACL 实例 ID
     */
    public void setAclId(String AclId) {
        this.AclId = AclId;
    }

    /**
     * Get ACL 名称 
     * @return AclName ACL 名称
     */
    public String getAclName() {
        return this.AclName;
    }

    /**
     * Set ACL 名称
     * @param AclName ACL 名称
     */
    public void setAclName(String AclName) {
        this.AclName = AclName;
    }

    /**
     * Get ACL 状态。0：无状态 1：有状态 
     * @return Status ACL 状态。0：无状态 1：有状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set ACL 状态。0：无状态 1：有状态
     * @param Status ACL 状态。0：无状态 1：有状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 规则类型（in/out）。in：入站规则 out：出站规则 
     * @return Type 规则类型（in/out）。in：入站规则 out：出站规则
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 规则类型（in/out）。in：入站规则 out：出站规则
     * @param Type 规则类型（in/out）。in：入站规则 out：出站规则
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get ACL规则列表 
     * @return Rules ACL规则列表
     */
    public EipAclRule [] getRules() {
        return this.Rules;
    }

    /**
     * Set ACL规则列表
     * @param Rules ACL规则列表
     */
    public void setRules(EipAclRule [] Rules) {
        this.Rules = Rules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AclId", this.AclId);
        this.setParamSimple(map, prefix + "AclName", this.AclName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArrayObj(map, prefix + "Rules.", this.Rules);

    }
}

