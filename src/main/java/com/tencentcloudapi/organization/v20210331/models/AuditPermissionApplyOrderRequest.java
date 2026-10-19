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
package com.tencentcloudapi.organization.v20210331.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditPermissionApplyOrderRequest extends AbstractModel {

    /**
    * <p>空间 ID</p>
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * <p>申请单 ID</p>
    */
    @SerializedName("ApplyId")
    @Expose
    private String ApplyId;

    /**
    * <p>审批结果</p><p>枚举值：</p><ul><li>Approve： 通过</li><li>Reject： 拒绝</li></ul>
    */
    @SerializedName("AuditResult")
    @Expose
    private String AuditResult;

    /**
    * <p>审批意见</p>
    */
    @SerializedName("AuditOpinion")
    @Expose
    private String AuditOpinion;

    /**
     * Get <p>空间 ID</p> 
     * @return ZoneId <p>空间 ID</p>
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set <p>空间 ID</p>
     * @param ZoneId <p>空间 ID</p>
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get <p>申请单 ID</p> 
     * @return ApplyId <p>申请单 ID</p>
     */
    public String getApplyId() {
        return this.ApplyId;
    }

    /**
     * Set <p>申请单 ID</p>
     * @param ApplyId <p>申请单 ID</p>
     */
    public void setApplyId(String ApplyId) {
        this.ApplyId = ApplyId;
    }

    /**
     * Get <p>审批结果</p><p>枚举值：</p><ul><li>Approve： 通过</li><li>Reject： 拒绝</li></ul> 
     * @return AuditResult <p>审批结果</p><p>枚举值：</p><ul><li>Approve： 通过</li><li>Reject： 拒绝</li></ul>
     */
    public String getAuditResult() {
        return this.AuditResult;
    }

    /**
     * Set <p>审批结果</p><p>枚举值：</p><ul><li>Approve： 通过</li><li>Reject： 拒绝</li></ul>
     * @param AuditResult <p>审批结果</p><p>枚举值：</p><ul><li>Approve： 通过</li><li>Reject： 拒绝</li></ul>
     */
    public void setAuditResult(String AuditResult) {
        this.AuditResult = AuditResult;
    }

    /**
     * Get <p>审批意见</p> 
     * @return AuditOpinion <p>审批意见</p>
     */
    public String getAuditOpinion() {
        return this.AuditOpinion;
    }

    /**
     * Set <p>审批意见</p>
     * @param AuditOpinion <p>审批意见</p>
     */
    public void setAuditOpinion(String AuditOpinion) {
        this.AuditOpinion = AuditOpinion;
    }

    public AuditPermissionApplyOrderRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AuditPermissionApplyOrderRequest(AuditPermissionApplyOrderRequest source) {
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ApplyId != null) {
            this.ApplyId = new String(source.ApplyId);
        }
        if (source.AuditResult != null) {
            this.AuditResult = new String(source.AuditResult);
        }
        if (source.AuditOpinion != null) {
            this.AuditOpinion = new String(source.AuditOpinion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ApplyId", this.ApplyId);
        this.setParamSimple(map, prefix + "AuditResult", this.AuditResult);
        this.setParamSimple(map, prefix + "AuditOpinion", this.AuditOpinion);

    }
}

