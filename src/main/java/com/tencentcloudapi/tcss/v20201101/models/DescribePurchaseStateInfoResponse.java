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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurchaseStateInfoResponse extends AbstractModel{

    /**
    * 0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 总核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * 已购买核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizedCoresCnt")
    @Expose
    private Long AuthorizedCoresCnt;

    /**
    * 镜像数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * 已授权镜像数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizedImageCnt")
    @Expose
    private Long AuthorizedImageCnt;

    /**
    * 已购买镜像授权数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PurchasedAuthorizedCnt")
    @Expose
    private Long PurchasedAuthorizedCnt;

    /**
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * 0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AutomaticRenewal")
    @Expose
    private Long AutomaticRenewal;

    /**
    * 试用期间赠送镜像授权数，可能会过期
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GivenAuthorizedCnt")
    @Expose
    private Long GivenAuthorizedCnt;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期 
     * @return State 0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set 0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期
     * @param State 0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get 总核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoresCnt 总核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set 总核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoresCnt 总核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get 已购买核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizedCoresCnt 已购买核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthorizedCoresCnt() {
        return this.AuthorizedCoresCnt;
    }

    /**
     * Set 已购买核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizedCoresCnt 已购买核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizedCoresCnt(Long AuthorizedCoresCnt) {
        this.AuthorizedCoresCnt = AuthorizedCoresCnt;
    }

    /**
     * Get 镜像数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ImageCnt 镜像数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set 镜像数
注意：此字段可能返回 null，表示取不到有效值。
     * @param ImageCnt 镜像数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get 已授权镜像数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AuthorizedImageCnt 已授权镜像数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAuthorizedImageCnt() {
        return this.AuthorizedImageCnt;
    }

    /**
     * Set 已授权镜像数
注意：此字段可能返回 null，表示取不到有效值。
     * @param AuthorizedImageCnt 已授权镜像数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAuthorizedImageCnt(Long AuthorizedImageCnt) {
        this.AuthorizedImageCnt = AuthorizedImageCnt;
    }

    /**
     * Get 已购买镜像授权数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PurchasedAuthorizedCnt 已购买镜像授权数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPurchasedAuthorizedCnt() {
        return this.PurchasedAuthorizedCnt;
    }

    /**
     * Set 已购买镜像授权数
注意：此字段可能返回 null，表示取不到有效值。
     * @param PurchasedAuthorizedCnt 已购买镜像授权数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPurchasedAuthorizedCnt(Long PurchasedAuthorizedCnt) {
        this.PurchasedAuthorizedCnt = PurchasedAuthorizedCnt;
    }

    /**
     * Get 过期时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ExpirationTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param ExpirationTime 过期时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get 0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AutomaticRenewal 0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAutomaticRenewal() {
        return this.AutomaticRenewal;
    }

    /**
     * Set 0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     * @param AutomaticRenewal 0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAutomaticRenewal(Long AutomaticRenewal) {
        this.AutomaticRenewal = AutomaticRenewal;
    }

    /**
     * Get 试用期间赠送镜像授权数，可能会过期
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GivenAuthorizedCnt 试用期间赠送镜像授权数，可能会过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGivenAuthorizedCnt() {
        return this.GivenAuthorizedCnt;
    }

    /**
     * Set 试用期间赠送镜像授权数，可能会过期
注意：此字段可能返回 null，表示取不到有效值。
     * @param GivenAuthorizedCnt 试用期间赠送镜像授权数，可能会过期
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGivenAuthorizedCnt(Long GivenAuthorizedCnt) {
        this.GivenAuthorizedCnt = GivenAuthorizedCnt;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribePurchaseStateInfoResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePurchaseStateInfoResponse(DescribePurchaseStateInfoResponse source) {
        if (source.State != null) {
            this.State = new Long(source.State);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
        if (source.AuthorizedCoresCnt != null) {
            this.AuthorizedCoresCnt = new Long(source.AuthorizedCoresCnt);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.AuthorizedImageCnt != null) {
            this.AuthorizedImageCnt = new Long(source.AuthorizedImageCnt);
        }
        if (source.PurchasedAuthorizedCnt != null) {
            this.PurchasedAuthorizedCnt = new Long(source.PurchasedAuthorizedCnt);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.AutomaticRenewal != null) {
            this.AutomaticRenewal = new Long(source.AutomaticRenewal);
        }
        if (source.GivenAuthorizedCnt != null) {
            this.GivenAuthorizedCnt = new Long(source.GivenAuthorizedCnt);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);
        this.setParamSimple(map, prefix + "AuthorizedCoresCnt", this.AuthorizedCoresCnt);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "AuthorizedImageCnt", this.AuthorizedImageCnt);
        this.setParamSimple(map, prefix + "PurchasedAuthorizedCnt", this.PurchasedAuthorizedCnt);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "AutomaticRenewal", this.AutomaticRenewal);
        this.setParamSimple(map, prefix + "GivenAuthorizedCnt", this.GivenAuthorizedCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

