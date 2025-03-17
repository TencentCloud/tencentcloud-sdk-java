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
package com.tencentcloudapi.ssl.v20191205.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TCBAccessInstance extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * 统一域名状态

    */
    @SerializedName("UnionStatus")
    @Expose
    private Long UnionStatus;

    /**
    * 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。

    */
    @SerializedName("IsPreempted")
    @Expose
    private Boolean IsPreempted;

    /**
    * icp黑名单封禁状态，0-未封禁，1-封禁

    */
    @SerializedName("ICPStatus")
    @Expose
    private Long ICPStatus;

    /**
    * 已绑定证书ID
    */
    @SerializedName("OldCertificateId")
    @Expose
    private String OldCertificateId;

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
     * Get 状态 
     * @return Status 状态
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get 统一域名状态
 
     * @return UnionStatus 统一域名状态

     */
    public Long getUnionStatus() {
        return this.UnionStatus;
    }

    /**
     * Set 统一域名状态

     * @param UnionStatus 统一域名状态

     */
    public void setUnionStatus(Long UnionStatus) {
        this.UnionStatus = UnionStatus;
    }

    /**
     * Get 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。
 
     * @return IsPreempted 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。

     */
    public Boolean getIsPreempted() {
        return this.IsPreempted;
    }

    /**
     * Set 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。

     * @param IsPreempted 是否被抢占, 被抢占表示域名被其他环境绑定了，需要解绑或者重新绑定。

     */
    public void setIsPreempted(Boolean IsPreempted) {
        this.IsPreempted = IsPreempted;
    }

    /**
     * Get icp黑名单封禁状态，0-未封禁，1-封禁
 
     * @return ICPStatus icp黑名单封禁状态，0-未封禁，1-封禁

     */
    public Long getICPStatus() {
        return this.ICPStatus;
    }

    /**
     * Set icp黑名单封禁状态，0-未封禁，1-封禁

     * @param ICPStatus icp黑名单封禁状态，0-未封禁，1-封禁

     */
    public void setICPStatus(Long ICPStatus) {
        this.ICPStatus = ICPStatus;
    }

    /**
     * Get 已绑定证书ID 
     * @return OldCertificateId 已绑定证书ID
     */
    public String getOldCertificateId() {
        return this.OldCertificateId;
    }

    /**
     * Set 已绑定证书ID
     * @param OldCertificateId 已绑定证书ID
     */
    public void setOldCertificateId(String OldCertificateId) {
        this.OldCertificateId = OldCertificateId;
    }

    public TCBAccessInstance() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TCBAccessInstance(TCBAccessInstance source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.UnionStatus != null) {
            this.UnionStatus = new Long(source.UnionStatus);
        }
        if (source.IsPreempted != null) {
            this.IsPreempted = new Boolean(source.IsPreempted);
        }
        if (source.ICPStatus != null) {
            this.ICPStatus = new Long(source.ICPStatus);
        }
        if (source.OldCertificateId != null) {
            this.OldCertificateId = new String(source.OldCertificateId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "UnionStatus", this.UnionStatus);
        this.setParamSimple(map, prefix + "IsPreempted", this.IsPreempted);
        this.setParamSimple(map, prefix + "ICPStatus", this.ICPStatus);
        this.setParamSimple(map, prefix + "OldCertificateId", this.OldCertificateId);

    }
}

