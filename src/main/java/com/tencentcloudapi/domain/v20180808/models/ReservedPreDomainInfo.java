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
package com.tencentcloudapi.domain.v20180808.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedPreDomainInfo extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 1. 预定成功 2. 预定失败（预定失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成
    */
    @SerializedName("ReservedStatus")
    @Expose
    private Long ReservedStatus;

    /**
    * 域名预定失败原因
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FailReason")
    @Expose
    private String FailReason;

    /**
    * 预计变更所有权时间（仅用于参考，实际时间会存在误差）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ChangeOwnerTime")
    @Expose
    private String ChangeOwnerTime;

    /**
    * 注册时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RegTime")
    @Expose
    private String RegTime;

    /**
    * 到期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 资源ID，用于删除资源信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * 业务ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
     * Get 域名 
     * @return Domain 域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 域名
     * @param Domain 域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 1. 预定成功 2. 预定失败（预定失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成 
     * @return ReservedStatus 1. 预定成功 2. 预定失败（预定失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成
     */
    public Long getReservedStatus() {
        return this.ReservedStatus;
    }

    /**
     * Set 1. 预定成功 2. 预定失败（预定失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成
     * @param ReservedStatus 1. 预定成功 2. 预定失败（预定失败Reason字段将会被赋值）3. 域名交割中 4. 域名交割完成
     */
    public void setReservedStatus(Long ReservedStatus) {
        this.ReservedStatus = ReservedStatus;
    }

    /**
     * Get 域名预定失败原因
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FailReason 域名预定失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFailReason() {
        return this.FailReason;
    }

    /**
     * Set 域名预定失败原因
注意：此字段可能返回 null，表示取不到有效值。
     * @param FailReason 域名预定失败原因
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFailReason(String FailReason) {
        this.FailReason = FailReason;
    }

    /**
     * Get 预计变更所有权时间（仅用于参考，实际时间会存在误差）
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ChangeOwnerTime 预计变更所有权时间（仅用于参考，实际时间会存在误差）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getChangeOwnerTime() {
        return this.ChangeOwnerTime;
    }

    /**
     * Set 预计变更所有权时间（仅用于参考，实际时间会存在误差）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ChangeOwnerTime 预计变更所有权时间（仅用于参考，实际时间会存在误差）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setChangeOwnerTime(String ChangeOwnerTime) {
        this.ChangeOwnerTime = ChangeOwnerTime;
    }

    /**
     * Get 注册时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RegTime 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRegTime() {
        return this.RegTime;
    }

    /**
     * Set 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param RegTime 注册时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRegTime(String RegTime) {
        this.RegTime = RegTime;
    }

    /**
     * Get 到期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpireTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpireTime 到期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 资源ID，用于删除资源信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResourceId 资源ID，用于删除资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID，用于删除资源信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResourceId 资源ID，用于删除资源信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get 业务ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BusinessId 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param BusinessId 业务ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    public ReservedPreDomainInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ReservedPreDomainInfo(ReservedPreDomainInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ReservedStatus != null) {
            this.ReservedStatus = new Long(source.ReservedStatus);
        }
        if (source.FailReason != null) {
            this.FailReason = new String(source.FailReason);
        }
        if (source.ChangeOwnerTime != null) {
            this.ChangeOwnerTime = new String(source.ChangeOwnerTime);
        }
        if (source.RegTime != null) {
            this.RegTime = new String(source.RegTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ReservedStatus", this.ReservedStatus);
        this.setParamSimple(map, prefix + "FailReason", this.FailReason);
        this.setParamSimple(map, prefix + "ChangeOwnerTime", this.ChangeOwnerTime);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);

    }
}

