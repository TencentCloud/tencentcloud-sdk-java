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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyImageVulWhitelistRequest extends AbstractModel {

    /**
    * <p>漏洞白名单id</p>
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>漏洞id</p>
    */
    @SerializedName("PocId")
    @Expose
    private String PocId;

    /**
    * <p>镜像id</p>
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
    * <p>生效范围</p>
    */
    @SerializedName("Scope")
    @Expose
    private Long Scope;

    /**
    * <p>白名单状态</p>
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * <p>备注</p>
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get <p>漏洞白名单id</p> 
     * @return RuleId <p>漏洞白名单id</p>
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set <p>漏洞白名单id</p>
     * @param RuleId <p>漏洞白名单id</p>
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>漏洞id</p> 
     * @return PocId <p>漏洞id</p>
     */
    public String getPocId() {
        return this.PocId;
    }

    /**
     * Set <p>漏洞id</p>
     * @param PocId <p>漏洞id</p>
     */
    public void setPocId(String PocId) {
        this.PocId = PocId;
    }

    /**
     * Get <p>镜像id</p> 
     * @return ImageIds <p>镜像id</p>
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * Set <p>镜像id</p>
     * @param ImageIds <p>镜像id</p>
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * Get <p>生效范围</p> 
     * @return Scope <p>生效范围</p>
     */
    public Long getScope() {
        return this.Scope;
    }

    /**
     * Set <p>生效范围</p>
     * @param Scope <p>生效范围</p>
     */
    public void setScope(Long Scope) {
        this.Scope = Scope;
    }

    /**
     * Get <p>白名单状态</p> 
     * @return Status <p>白名单状态</p>
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * Set <p>白名单状态</p>
     * @param Status <p>白名单状态</p>
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * Get <p>备注</p> 
     * @return Remark <p>备注</p>
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set <p>备注</p>
     * @param Remark <p>备注</p>
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyImageVulWhitelistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyImageVulWhitelistRequest(ModifyImageVulWhitelistRequest source) {
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.PocId != null) {
            this.PocId = new String(source.PocId);
        }
        if (source.ImageIds != null) {
            this.ImageIds = new String[source.ImageIds.length];
            for (int i = 0; i < source.ImageIds.length; i++) {
                this.ImageIds[i] = new String(source.ImageIds[i]);
            }
        }
        if (source.Scope != null) {
            this.Scope = new Long(source.Scope);
        }
        if (source.Status != null) {
            this.Status = new Long(source.Status);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamSimple(map, prefix + "PocId", this.PocId);
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);
        this.setParamSimple(map, prefix + "Scope", this.Scope);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

