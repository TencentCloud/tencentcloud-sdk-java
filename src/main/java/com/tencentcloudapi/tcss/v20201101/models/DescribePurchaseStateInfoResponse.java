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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePurchaseStateInfoResponse extends AbstractModel {

    /**
    * 0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * 总资源核数 = 总防护核数 + 未防护核数
    */
    @SerializedName("AllCoresCnt")
    @Expose
    private Long AllCoresCnt;

    /**
    * 总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * 未防护核数(未开启防护资源核数)
    */
    @SerializedName("UndefendCoresCnt")
    @Expose
    private Long UndefendCoresCnt;

    /**
    * 已购买核数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AuthorizedCoresCnt")
    @Expose
    private Long AuthorizedCoresCnt;

    /**
    * 试用赠送专业版核心数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GivenAuthorizedCoresCnt")
    @Expose
    private Long GivenAuthorizedCoresCnt;

    /**
    * 当前弹性计费核数数量
    */
    @SerializedName("CurrentFlexibleCoresCnt")
    @Expose
    private Long CurrentFlexibleCoresCnt;

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
    * 过期时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * 已购买镜像授权数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PurchasedAuthorizedCnt")
    @Expose
    private Long PurchasedAuthorizedCnt;

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
    * 起始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * 子状态(具体意义依据State字段而定)
State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubState")
    @Expose
    private String SubState;

    /**
    * 计费key
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * 防护策略
    */
    @SerializedName("DefendPolicy")
    @Expose
    private String DefendPolicy;

    /**
    * 弹性计费核数上限
    */
    @SerializedName("FlexibleCoresLimit")
    @Expose
    private Long FlexibleCoresLimit;

    /**
    * 已防护集群核数
    */
    @SerializedName("DefendClusterCoresCnt")
    @Expose
    private Long DefendClusterCoresCnt;

    /**
    * 已防护主机核数
    */
    @SerializedName("DefendHostCoresCnt")
    @Expose
    private Long DefendHostCoresCnt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
     * Get 总资源核数 = 总防护核数 + 未防护核数 
     * @return AllCoresCnt 总资源核数 = 总防护核数 + 未防护核数
     */
    public Long getAllCoresCnt() {
        return this.AllCoresCnt;
    }

    /**
     * Set 总资源核数 = 总防护核数 + 未防护核数
     * @param AllCoresCnt 总资源核数 = 总防护核数 + 未防护核数
     */
    public void setAllCoresCnt(Long AllCoresCnt) {
        this.AllCoresCnt = AllCoresCnt;
    }

    /**
     * Get 总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CoresCnt 总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set 总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数
注意：此字段可能返回 null，表示取不到有效值。
     * @param CoresCnt 总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get 未防护核数(未开启防护资源核数) 
     * @return UndefendCoresCnt 未防护核数(未开启防护资源核数)
     */
    public Long getUndefendCoresCnt() {
        return this.UndefendCoresCnt;
    }

    /**
     * Set 未防护核数(未开启防护资源核数)
     * @param UndefendCoresCnt 未防护核数(未开启防护资源核数)
     */
    public void setUndefendCoresCnt(Long UndefendCoresCnt) {
        this.UndefendCoresCnt = UndefendCoresCnt;
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
     * Get 试用赠送专业版核心数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GivenAuthorizedCoresCnt 试用赠送专业版核心数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGivenAuthorizedCoresCnt() {
        return this.GivenAuthorizedCoresCnt;
    }

    /**
     * Set 试用赠送专业版核心数
注意：此字段可能返回 null，表示取不到有效值。
     * @param GivenAuthorizedCoresCnt 试用赠送专业版核心数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGivenAuthorizedCoresCnt(Long GivenAuthorizedCoresCnt) {
        this.GivenAuthorizedCoresCnt = GivenAuthorizedCoresCnt;
    }

    /**
     * Get 当前弹性计费核数数量 
     * @return CurrentFlexibleCoresCnt 当前弹性计费核数数量
     */
    public Long getCurrentFlexibleCoresCnt() {
        return this.CurrentFlexibleCoresCnt;
    }

    /**
     * Set 当前弹性计费核数数量
     * @param CurrentFlexibleCoresCnt 当前弹性计费核数数量
     */
    public void setCurrentFlexibleCoresCnt(Long CurrentFlexibleCoresCnt) {
        this.CurrentFlexibleCoresCnt = CurrentFlexibleCoresCnt;
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
     * Get 起始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BeginTime 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param BeginTime 起始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get 子状态(具体意义依据State字段而定)
State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubState 子状态(具体意义依据State字段而定)
State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSubState() {
        return this.SubState;
    }

    /**
     * Set 子状态(具体意义依据State字段而定)
State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubState 子状态(具体意义依据State字段而定)
State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubState(String SubState) {
        this.SubState = SubState;
    }

    /**
     * Get 计费key
注意：此字段可能返回 null，表示取不到有效值。 
     * @return InquireKey 计费key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set 计费key
注意：此字段可能返回 null，表示取不到有效值。
     * @param InquireKey 计费key
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get 防护策略 
     * @return DefendPolicy 防护策略
     */
    public String getDefendPolicy() {
        return this.DefendPolicy;
    }

    /**
     * Set 防护策略
     * @param DefendPolicy 防护策略
     */
    public void setDefendPolicy(String DefendPolicy) {
        this.DefendPolicy = DefendPolicy;
    }

    /**
     * Get 弹性计费核数上限 
     * @return FlexibleCoresLimit 弹性计费核数上限
     */
    public Long getFlexibleCoresLimit() {
        return this.FlexibleCoresLimit;
    }

    /**
     * Set 弹性计费核数上限
     * @param FlexibleCoresLimit 弹性计费核数上限
     */
    public void setFlexibleCoresLimit(Long FlexibleCoresLimit) {
        this.FlexibleCoresLimit = FlexibleCoresLimit;
    }

    /**
     * Get 已防护集群核数 
     * @return DefendClusterCoresCnt 已防护集群核数
     */
    public Long getDefendClusterCoresCnt() {
        return this.DefendClusterCoresCnt;
    }

    /**
     * Set 已防护集群核数
     * @param DefendClusterCoresCnt 已防护集群核数
     */
    public void setDefendClusterCoresCnt(Long DefendClusterCoresCnt) {
        this.DefendClusterCoresCnt = DefendClusterCoresCnt;
    }

    /**
     * Get 已防护主机核数 
     * @return DefendHostCoresCnt 已防护主机核数
     */
    public Long getDefendHostCoresCnt() {
        return this.DefendHostCoresCnt;
    }

    /**
     * Set 已防护主机核数
     * @param DefendHostCoresCnt 已防护主机核数
     */
    public void setDefendHostCoresCnt(Long DefendHostCoresCnt) {
        this.DefendHostCoresCnt = DefendHostCoresCnt;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
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
        if (source.AllCoresCnt != null) {
            this.AllCoresCnt = new Long(source.AllCoresCnt);
        }
        if (source.CoresCnt != null) {
            this.CoresCnt = new Long(source.CoresCnt);
        }
        if (source.UndefendCoresCnt != null) {
            this.UndefendCoresCnt = new Long(source.UndefendCoresCnt);
        }
        if (source.AuthorizedCoresCnt != null) {
            this.AuthorizedCoresCnt = new Long(source.AuthorizedCoresCnt);
        }
        if (source.GivenAuthorizedCoresCnt != null) {
            this.GivenAuthorizedCoresCnt = new Long(source.GivenAuthorizedCoresCnt);
        }
        if (source.CurrentFlexibleCoresCnt != null) {
            this.CurrentFlexibleCoresCnt = new Long(source.CurrentFlexibleCoresCnt);
        }
        if (source.ImageCnt != null) {
            this.ImageCnt = new Long(source.ImageCnt);
        }
        if (source.AuthorizedImageCnt != null) {
            this.AuthorizedImageCnt = new Long(source.AuthorizedImageCnt);
        }
        if (source.ExpirationTime != null) {
            this.ExpirationTime = new String(source.ExpirationTime);
        }
        if (source.PurchasedAuthorizedCnt != null) {
            this.PurchasedAuthorizedCnt = new Long(source.PurchasedAuthorizedCnt);
        }
        if (source.AutomaticRenewal != null) {
            this.AutomaticRenewal = new Long(source.AutomaticRenewal);
        }
        if (source.GivenAuthorizedCnt != null) {
            this.GivenAuthorizedCnt = new Long(source.GivenAuthorizedCnt);
        }
        if (source.BeginTime != null) {
            this.BeginTime = new String(source.BeginTime);
        }
        if (source.SubState != null) {
            this.SubState = new String(source.SubState);
        }
        if (source.InquireKey != null) {
            this.InquireKey = new String(source.InquireKey);
        }
        if (source.DefendPolicy != null) {
            this.DefendPolicy = new String(source.DefendPolicy);
        }
        if (source.FlexibleCoresLimit != null) {
            this.FlexibleCoresLimit = new Long(source.FlexibleCoresLimit);
        }
        if (source.DefendClusterCoresCnt != null) {
            this.DefendClusterCoresCnt = new Long(source.DefendClusterCoresCnt);
        }
        if (source.DefendHostCoresCnt != null) {
            this.DefendHostCoresCnt = new Long(source.DefendHostCoresCnt);
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
        this.setParamSimple(map, prefix + "AllCoresCnt", this.AllCoresCnt);
        this.setParamSimple(map, prefix + "CoresCnt", this.CoresCnt);
        this.setParamSimple(map, prefix + "UndefendCoresCnt", this.UndefendCoresCnt);
        this.setParamSimple(map, prefix + "AuthorizedCoresCnt", this.AuthorizedCoresCnt);
        this.setParamSimple(map, prefix + "GivenAuthorizedCoresCnt", this.GivenAuthorizedCoresCnt);
        this.setParamSimple(map, prefix + "CurrentFlexibleCoresCnt", this.CurrentFlexibleCoresCnt);
        this.setParamSimple(map, prefix + "ImageCnt", this.ImageCnt);
        this.setParamSimple(map, prefix + "AuthorizedImageCnt", this.AuthorizedImageCnt);
        this.setParamSimple(map, prefix + "ExpirationTime", this.ExpirationTime);
        this.setParamSimple(map, prefix + "PurchasedAuthorizedCnt", this.PurchasedAuthorizedCnt);
        this.setParamSimple(map, prefix + "AutomaticRenewal", this.AutomaticRenewal);
        this.setParamSimple(map, prefix + "GivenAuthorizedCnt", this.GivenAuthorizedCnt);
        this.setParamSimple(map, prefix + "BeginTime", this.BeginTime);
        this.setParamSimple(map, prefix + "SubState", this.SubState);
        this.setParamSimple(map, prefix + "InquireKey", this.InquireKey);
        this.setParamSimple(map, prefix + "DefendPolicy", this.DefendPolicy);
        this.setParamSimple(map, prefix + "FlexibleCoresLimit", this.FlexibleCoresLimit);
        this.setParamSimple(map, prefix + "DefendClusterCoresCnt", this.DefendClusterCoresCnt);
        this.setParamSimple(map, prefix + "DefendHostCoresCnt", this.DefendHostCoresCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

