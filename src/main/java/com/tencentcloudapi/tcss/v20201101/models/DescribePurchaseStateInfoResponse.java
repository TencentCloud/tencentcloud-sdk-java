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

public class DescribePurchaseStateInfoResponse extends AbstractModel {

    /**
    * <p>0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期</p>
    */
    @SerializedName("State")
    @Expose
    private Long State;

    /**
    * <p>总资源核数 = 总防护核数 + 未防护核数</p>
    */
    @SerializedName("AllCoresCnt")
    @Expose
    private Long AllCoresCnt;

    /**
    * <p>总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数</p>
    */
    @SerializedName("CoresCnt")
    @Expose
    private Long CoresCnt;

    /**
    * <p>未防护核数(未开启防护资源核数)</p>
    */
    @SerializedName("UndefendCoresCnt")
    @Expose
    private Long UndefendCoresCnt;

    /**
    * <p>已购买核数</p>
    */
    @SerializedName("AuthorizedCoresCnt")
    @Expose
    private Long AuthorizedCoresCnt;

    /**
    * <p>试用赠送专业版核心数</p>
    */
    @SerializedName("GivenAuthorizedCoresCnt")
    @Expose
    private Long GivenAuthorizedCoresCnt;

    /**
    * <p>当前弹性计费核数数量</p>
    */
    @SerializedName("CurrentFlexibleCoresCnt")
    @Expose
    private Long CurrentFlexibleCoresCnt;

    /**
    * <p>镜像数</p>
    */
    @SerializedName("ImageCnt")
    @Expose
    private Long ImageCnt;

    /**
    * <p>已授权镜像数</p>
    */
    @SerializedName("AuthorizedImageCnt")
    @Expose
    private Long AuthorizedImageCnt;

    /**
    * <p>过期时间</p>
    */
    @SerializedName("ExpirationTime")
    @Expose
    private String ExpirationTime;

    /**
    * <p>已购买镜像授权数</p>
    */
    @SerializedName("PurchasedAuthorizedCnt")
    @Expose
    private Long PurchasedAuthorizedCnt;

    /**
    * <p>0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
    */
    @SerializedName("AutomaticRenewal")
    @Expose
    private Long AutomaticRenewal;

    /**
    * <p>试用期间赠送镜像授权数，可能会过期</p>
    */
    @SerializedName("GivenAuthorizedCnt")
    @Expose
    private Long GivenAuthorizedCnt;

    /**
    * <p>起始时间</p>
    */
    @SerializedName("BeginTime")
    @Expose
    private String BeginTime;

    /**
    * <p>子状态(具体意义依据State字段而定)<br>State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)</p>
    */
    @SerializedName("SubState")
    @Expose
    private String SubState;

    /**
    * <p>计费key</p>
    */
    @SerializedName("InquireKey")
    @Expose
    private String InquireKey;

    /**
    * <p>防护策略</p>
    */
    @SerializedName("DefendPolicy")
    @Expose
    private String DefendPolicy;

    /**
    * <p>弹性计费核数上限</p>
    */
    @SerializedName("FlexibleCoresLimit")
    @Expose
    private Long FlexibleCoresLimit;

    /**
    * <p>已防护集群核数</p>
    */
    @SerializedName("DefendClusterCoresCnt")
    @Expose
    private Long DefendClusterCoresCnt;

    /**
    * <p>已防护主机核数</p>
    */
    @SerializedName("DefendHostCoresCnt")
    @Expose
    private Long DefendHostCoresCnt;

    /**
    * <p>试用的专业版核数</p>
    */
    @SerializedName("TrialCoresCnt")
    @Expose
    private Long TrialCoresCnt;

    /**
    * <p>无容器核数</p>
    */
    @SerializedName("NoContainerCoresCnt")
    @Expose
    private Long NoContainerCoresCnt;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get <p>0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期</p> 
     * @return State <p>0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期</p>
     */
    public Long getState() {
        return this.State;
    }

    /**
     * Set <p>0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期</p>
     * @param State <p>0：可申请试用可购买；1：只可购买(含试用审核不通过和试用过期)；2：试用生效中；3：专业版生效中；4：专业版过期</p>
     */
    public void setState(Long State) {
        this.State = State;
    }

    /**
     * Get <p>总资源核数 = 总防护核数 + 未防护核数</p> 
     * @return AllCoresCnt <p>总资源核数 = 总防护核数 + 未防护核数</p>
     */
    public Long getAllCoresCnt() {
        return this.AllCoresCnt;
    }

    /**
     * Set <p>总资源核数 = 总防护核数 + 未防护核数</p>
     * @param AllCoresCnt <p>总资源核数 = 总防护核数 + 未防护核数</p>
     */
    public void setAllCoresCnt(Long AllCoresCnt) {
        this.AllCoresCnt = AllCoresCnt;
    }

    /**
     * Get <p>总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数</p> 
     * @return CoresCnt <p>总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数</p>
     */
    public Long getCoresCnt() {
        return this.CoresCnt;
    }

    /**
     * Set <p>总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数</p>
     * @param CoresCnt <p>总防护核数 =已购核数+ 试用赠送核数 +弹性计费核数</p>
     */
    public void setCoresCnt(Long CoresCnt) {
        this.CoresCnt = CoresCnt;
    }

    /**
     * Get <p>未防护核数(未开启防护资源核数)</p> 
     * @return UndefendCoresCnt <p>未防护核数(未开启防护资源核数)</p>
     */
    public Long getUndefendCoresCnt() {
        return this.UndefendCoresCnt;
    }

    /**
     * Set <p>未防护核数(未开启防护资源核数)</p>
     * @param UndefendCoresCnt <p>未防护核数(未开启防护资源核数)</p>
     */
    public void setUndefendCoresCnt(Long UndefendCoresCnt) {
        this.UndefendCoresCnt = UndefendCoresCnt;
    }

    /**
     * Get <p>已购买核数</p> 
     * @return AuthorizedCoresCnt <p>已购买核数</p>
     */
    public Long getAuthorizedCoresCnt() {
        return this.AuthorizedCoresCnt;
    }

    /**
     * Set <p>已购买核数</p>
     * @param AuthorizedCoresCnt <p>已购买核数</p>
     */
    public void setAuthorizedCoresCnt(Long AuthorizedCoresCnt) {
        this.AuthorizedCoresCnt = AuthorizedCoresCnt;
    }

    /**
     * Get <p>试用赠送专业版核心数</p> 
     * @return GivenAuthorizedCoresCnt <p>试用赠送专业版核心数</p>
     */
    public Long getGivenAuthorizedCoresCnt() {
        return this.GivenAuthorizedCoresCnt;
    }

    /**
     * Set <p>试用赠送专业版核心数</p>
     * @param GivenAuthorizedCoresCnt <p>试用赠送专业版核心数</p>
     */
    public void setGivenAuthorizedCoresCnt(Long GivenAuthorizedCoresCnt) {
        this.GivenAuthorizedCoresCnt = GivenAuthorizedCoresCnt;
    }

    /**
     * Get <p>当前弹性计费核数数量</p> 
     * @return CurrentFlexibleCoresCnt <p>当前弹性计费核数数量</p>
     */
    public Long getCurrentFlexibleCoresCnt() {
        return this.CurrentFlexibleCoresCnt;
    }

    /**
     * Set <p>当前弹性计费核数数量</p>
     * @param CurrentFlexibleCoresCnt <p>当前弹性计费核数数量</p>
     */
    public void setCurrentFlexibleCoresCnt(Long CurrentFlexibleCoresCnt) {
        this.CurrentFlexibleCoresCnt = CurrentFlexibleCoresCnt;
    }

    /**
     * Get <p>镜像数</p> 
     * @return ImageCnt <p>镜像数</p>
     */
    public Long getImageCnt() {
        return this.ImageCnt;
    }

    /**
     * Set <p>镜像数</p>
     * @param ImageCnt <p>镜像数</p>
     */
    public void setImageCnt(Long ImageCnt) {
        this.ImageCnt = ImageCnt;
    }

    /**
     * Get <p>已授权镜像数</p> 
     * @return AuthorizedImageCnt <p>已授权镜像数</p>
     */
    public Long getAuthorizedImageCnt() {
        return this.AuthorizedImageCnt;
    }

    /**
     * Set <p>已授权镜像数</p>
     * @param AuthorizedImageCnt <p>已授权镜像数</p>
     */
    public void setAuthorizedImageCnt(Long AuthorizedImageCnt) {
        this.AuthorizedImageCnt = AuthorizedImageCnt;
    }

    /**
     * Get <p>过期时间</p> 
     * @return ExpirationTime <p>过期时间</p>
     */
    public String getExpirationTime() {
        return this.ExpirationTime;
    }

    /**
     * Set <p>过期时间</p>
     * @param ExpirationTime <p>过期时间</p>
     */
    public void setExpirationTime(String ExpirationTime) {
        this.ExpirationTime = ExpirationTime;
    }

    /**
     * Get <p>已购买镜像授权数</p> 
     * @return PurchasedAuthorizedCnt <p>已购买镜像授权数</p>
     */
    public Long getPurchasedAuthorizedCnt() {
        return this.PurchasedAuthorizedCnt;
    }

    /**
     * Set <p>已购买镜像授权数</p>
     * @param PurchasedAuthorizedCnt <p>已购买镜像授权数</p>
     */
    public void setPurchasedAuthorizedCnt(Long PurchasedAuthorizedCnt) {
        this.PurchasedAuthorizedCnt = PurchasedAuthorizedCnt;
    }

    /**
     * Get <p>0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p> 
     * @return AutomaticRenewal <p>0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public Long getAutomaticRenewal() {
        return this.AutomaticRenewal;
    }

    /**
     * Set <p>0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     * @param AutomaticRenewal <p>0表示默认状态(用户未设置，即初始状态)， 1表示自动续费，2表示明确不自动续费(用户设置)</p>
     */
    public void setAutomaticRenewal(Long AutomaticRenewal) {
        this.AutomaticRenewal = AutomaticRenewal;
    }

    /**
     * Get <p>试用期间赠送镜像授权数，可能会过期</p> 
     * @return GivenAuthorizedCnt <p>试用期间赠送镜像授权数，可能会过期</p>
     */
    public Long getGivenAuthorizedCnt() {
        return this.GivenAuthorizedCnt;
    }

    /**
     * Set <p>试用期间赠送镜像授权数，可能会过期</p>
     * @param GivenAuthorizedCnt <p>试用期间赠送镜像授权数，可能会过期</p>
     */
    public void setGivenAuthorizedCnt(Long GivenAuthorizedCnt) {
        this.GivenAuthorizedCnt = GivenAuthorizedCnt;
    }

    /**
     * Get <p>起始时间</p> 
     * @return BeginTime <p>起始时间</p>
     */
    public String getBeginTime() {
        return this.BeginTime;
    }

    /**
     * Set <p>起始时间</p>
     * @param BeginTime <p>起始时间</p>
     */
    public void setBeginTime(String BeginTime) {
        this.BeginTime = BeginTime;
    }

    /**
     * Get <p>子状态(具体意义依据State字段而定)<br>State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)</p> 
     * @return SubState <p>子状态(具体意义依据State字段而定)<br>State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)</p>
     */
    public String getSubState() {
        return this.SubState;
    }

    /**
     * Set <p>子状态(具体意义依据State字段而定)<br>State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)</p>
     * @param SubState <p>子状态(具体意义依据State字段而定)<br>State为4时，有效值为: ISOLATE(隔离) DESTROED(已销毁)</p>
     */
    public void setSubState(String SubState) {
        this.SubState = SubState;
    }

    /**
     * Get <p>计费key</p> 
     * @return InquireKey <p>计费key</p>
     */
    public String getInquireKey() {
        return this.InquireKey;
    }

    /**
     * Set <p>计费key</p>
     * @param InquireKey <p>计费key</p>
     */
    public void setInquireKey(String InquireKey) {
        this.InquireKey = InquireKey;
    }

    /**
     * Get <p>防护策略</p> 
     * @return DefendPolicy <p>防护策略</p>
     */
    public String getDefendPolicy() {
        return this.DefendPolicy;
    }

    /**
     * Set <p>防护策略</p>
     * @param DefendPolicy <p>防护策略</p>
     */
    public void setDefendPolicy(String DefendPolicy) {
        this.DefendPolicy = DefendPolicy;
    }

    /**
     * Get <p>弹性计费核数上限</p> 
     * @return FlexibleCoresLimit <p>弹性计费核数上限</p>
     */
    public Long getFlexibleCoresLimit() {
        return this.FlexibleCoresLimit;
    }

    /**
     * Set <p>弹性计费核数上限</p>
     * @param FlexibleCoresLimit <p>弹性计费核数上限</p>
     */
    public void setFlexibleCoresLimit(Long FlexibleCoresLimit) {
        this.FlexibleCoresLimit = FlexibleCoresLimit;
    }

    /**
     * Get <p>已防护集群核数</p> 
     * @return DefendClusterCoresCnt <p>已防护集群核数</p>
     */
    public Long getDefendClusterCoresCnt() {
        return this.DefendClusterCoresCnt;
    }

    /**
     * Set <p>已防护集群核数</p>
     * @param DefendClusterCoresCnt <p>已防护集群核数</p>
     */
    public void setDefendClusterCoresCnt(Long DefendClusterCoresCnt) {
        this.DefendClusterCoresCnt = DefendClusterCoresCnt;
    }

    /**
     * Get <p>已防护主机核数</p> 
     * @return DefendHostCoresCnt <p>已防护主机核数</p>
     */
    public Long getDefendHostCoresCnt() {
        return this.DefendHostCoresCnt;
    }

    /**
     * Set <p>已防护主机核数</p>
     * @param DefendHostCoresCnt <p>已防护主机核数</p>
     */
    public void setDefendHostCoresCnt(Long DefendHostCoresCnt) {
        this.DefendHostCoresCnt = DefendHostCoresCnt;
    }

    /**
     * Get <p>试用的专业版核数</p> 
     * @return TrialCoresCnt <p>试用的专业版核数</p>
     */
    public Long getTrialCoresCnt() {
        return this.TrialCoresCnt;
    }

    /**
     * Set <p>试用的专业版核数</p>
     * @param TrialCoresCnt <p>试用的专业版核数</p>
     */
    public void setTrialCoresCnt(Long TrialCoresCnt) {
        this.TrialCoresCnt = TrialCoresCnt;
    }

    /**
     * Get <p>无容器核数</p> 
     * @return NoContainerCoresCnt <p>无容器核数</p>
     */
    public Long getNoContainerCoresCnt() {
        return this.NoContainerCoresCnt;
    }

    /**
     * Set <p>无容器核数</p>
     * @param NoContainerCoresCnt <p>无容器核数</p>
     */
    public void setNoContainerCoresCnt(Long NoContainerCoresCnt) {
        this.NoContainerCoresCnt = NoContainerCoresCnt;
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
        if (source.TrialCoresCnt != null) {
            this.TrialCoresCnt = new Long(source.TrialCoresCnt);
        }
        if (source.NoContainerCoresCnt != null) {
            this.NoContainerCoresCnt = new Long(source.NoContainerCoresCnt);
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
        this.setParamSimple(map, prefix + "TrialCoresCnt", this.TrialCoresCnt);
        this.setParamSimple(map, prefix + "NoContainerCoresCnt", this.NoContainerCoresCnt);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

