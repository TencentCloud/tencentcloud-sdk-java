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

public class EipAcl extends AbstractModel{

    /**
    * ACL 实例 ID。
    */
    @SerializedName("AclId")
    @Expose
    private String AclId;

    /**
    * ACL 实例名称
    */
    @SerializedName("AclName")
    @Expose
    private String AclName;

    /**
    * ACL 状态。0：无状态，1：有状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * EIPACL 创建时间
    */
    @SerializedName("CreatedAt")
    @Expose
    private String CreatedAt;

    /**
    * EIPACL 已关联的 eip 数目
    */
    @SerializedName("EipNum")
    @Expose
    private Long EipNum;

    /**
    * 出站规则
    */
    @SerializedName("OutRules")
    @Expose
    private EipAclRule [] OutRules;

    /**
    * 入站规则
    */
    @SerializedName("InRules")
    @Expose
    private EipAclRule [] InRules;

    /**
     * Get ACL 实例 ID。 
     * @return AclId ACL 实例 ID。
     */
    public String getAclId() {
        return this.AclId;
    }

    /**
     * Set ACL 实例 ID。
     * @param AclId ACL 实例 ID。
     */
    public void setAclId(String AclId) {
        this.AclId = AclId;
    }

    /**
     * Get ACL 实例名称 
     * @return AclName ACL 实例名称
     */
    public String getAclName() {
        return this.AclName;
    }

    /**
     * Set ACL 实例名称
     * @param AclName ACL 实例名称
     */
    public void setAclName(String AclName) {
        this.AclName = AclName;
    }

    /**
     * Get ACL 状态。0：无状态，1：有状态 
     * @return Status ACL 状态。0：无状态，1：有状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ACL 状态。0：无状态，1：有状态
     * @param Status ACL 状态。0：无状态，1：有状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get EIPACL 创建时间 
     * @return CreatedAt EIPACL 创建时间
     */
    public String getCreatedAt() {
        return this.CreatedAt;
    }

    /**
     * Set EIPACL 创建时间
     * @param CreatedAt EIPACL 创建时间
     */
    public void setCreatedAt(String CreatedAt) {
        this.CreatedAt = CreatedAt;
    }

    /**
     * Get EIPACL 已关联的 eip 数目 
     * @return EipNum EIPACL 已关联的 eip 数目
     */
    public Long getEipNum() {
        return this.EipNum;
    }

    /**
     * Set EIPACL 已关联的 eip 数目
     * @param EipNum EIPACL 已关联的 eip 数目
     */
    public void setEipNum(Long EipNum) {
        this.EipNum = EipNum;
    }

    /**
     * Get 出站规则 
     * @return OutRules 出站规则
     */
    public EipAclRule [] getOutRules() {
        return this.OutRules;
    }

    /**
     * Set 出站规则
     * @param OutRules 出站规则
     */
    public void setOutRules(EipAclRule [] OutRules) {
        this.OutRules = OutRules;
    }

    /**
     * Get 入站规则 
     * @return InRules 入站规则
     */
    public EipAclRule [] getInRules() {
        return this.InRules;
    }

    /**
     * Set 入站规则
     * @param InRules 入站规则
     */
    public void setInRules(EipAclRule [] InRules) {
        this.InRules = InRules;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AclId", this.AclId);
        this.setParamSimple(map, prefix + "AclName", this.AclName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CreatedAt", this.CreatedAt);
        this.setParamSimple(map, prefix + "EipNum", this.EipNum);
        this.setParamArrayObj(map, prefix + "OutRules.", this.OutRules);
        this.setParamArrayObj(map, prefix + "InRules.", this.InRules);

    }
}

