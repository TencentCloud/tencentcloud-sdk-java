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

public class PreReleaseInfo extends AbstractModel {

    /**
    * 域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 预订倒计时
    */
    @SerializedName("ReservationTime")
    @Expose
    private String ReservationTime;

    /**
    * 域名注册时间
    */
    @SerializedName("RegTime")
    @Expose
    private String RegTime;

    /**
    * 域名删除时间
    */
    @SerializedName("DelTime")
    @Expose
    private String DelTime;

    /**
    * 当前人数
    */
    @SerializedName("CurrentPeople")
    @Expose
    private Long CurrentPeople;

    /**
    * 当前价格
    */
    @SerializedName("Price")
    @Expose
    private Float Price;

    /**
    * 是否收藏
    */
    @SerializedName("IsFollow")
    @Expose
    private Boolean IsFollow;

    /**
    * 是否已经预约
    */
    @SerializedName("IsAppoint")
    @Expose
    private Boolean IsAppoint;

    /**
    * 业务ID
    */
    @SerializedName("BusinessId")
    @Expose
    private String BusinessId;

    /**
    * 是否为原持有者
    */
    @SerializedName("IsDomainUser")
    @Expose
    private Boolean IsDomainUser;

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
     * Get 预订倒计时 
     * @return ReservationTime 预订倒计时
     */
    public String getReservationTime() {
        return this.ReservationTime;
    }

    /**
     * Set 预订倒计时
     * @param ReservationTime 预订倒计时
     */
    public void setReservationTime(String ReservationTime) {
        this.ReservationTime = ReservationTime;
    }

    /**
     * Get 域名注册时间 
     * @return RegTime 域名注册时间
     */
    public String getRegTime() {
        return this.RegTime;
    }

    /**
     * Set 域名注册时间
     * @param RegTime 域名注册时间
     */
    public void setRegTime(String RegTime) {
        this.RegTime = RegTime;
    }

    /**
     * Get 域名删除时间 
     * @return DelTime 域名删除时间
     */
    public String getDelTime() {
        return this.DelTime;
    }

    /**
     * Set 域名删除时间
     * @param DelTime 域名删除时间
     */
    public void setDelTime(String DelTime) {
        this.DelTime = DelTime;
    }

    /**
     * Get 当前人数 
     * @return CurrentPeople 当前人数
     */
    public Long getCurrentPeople() {
        return this.CurrentPeople;
    }

    /**
     * Set 当前人数
     * @param CurrentPeople 当前人数
     */
    public void setCurrentPeople(Long CurrentPeople) {
        this.CurrentPeople = CurrentPeople;
    }

    /**
     * Get 当前价格 
     * @return Price 当前价格
     */
    public Float getPrice() {
        return this.Price;
    }

    /**
     * Set 当前价格
     * @param Price 当前价格
     */
    public void setPrice(Float Price) {
        this.Price = Price;
    }

    /**
     * Get 是否收藏 
     * @return IsFollow 是否收藏
     */
    public Boolean getIsFollow() {
        return this.IsFollow;
    }

    /**
     * Set 是否收藏
     * @param IsFollow 是否收藏
     */
    public void setIsFollow(Boolean IsFollow) {
        this.IsFollow = IsFollow;
    }

    /**
     * Get 是否已经预约 
     * @return IsAppoint 是否已经预约
     */
    public Boolean getIsAppoint() {
        return this.IsAppoint;
    }

    /**
     * Set 是否已经预约
     * @param IsAppoint 是否已经预约
     */
    public void setIsAppoint(Boolean IsAppoint) {
        this.IsAppoint = IsAppoint;
    }

    /**
     * Get 业务ID 
     * @return BusinessId 业务ID
     */
    public String getBusinessId() {
        return this.BusinessId;
    }

    /**
     * Set 业务ID
     * @param BusinessId 业务ID
     */
    public void setBusinessId(String BusinessId) {
        this.BusinessId = BusinessId;
    }

    /**
     * Get 是否为原持有者 
     * @return IsDomainUser 是否为原持有者
     */
    public Boolean getIsDomainUser() {
        return this.IsDomainUser;
    }

    /**
     * Set 是否为原持有者
     * @param IsDomainUser 是否为原持有者
     */
    public void setIsDomainUser(Boolean IsDomainUser) {
        this.IsDomainUser = IsDomainUser;
    }

    public PreReleaseInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PreReleaseInfo(PreReleaseInfo source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.ReservationTime != null) {
            this.ReservationTime = new String(source.ReservationTime);
        }
        if (source.RegTime != null) {
            this.RegTime = new String(source.RegTime);
        }
        if (source.DelTime != null) {
            this.DelTime = new String(source.DelTime);
        }
        if (source.CurrentPeople != null) {
            this.CurrentPeople = new Long(source.CurrentPeople);
        }
        if (source.Price != null) {
            this.Price = new Float(source.Price);
        }
        if (source.IsFollow != null) {
            this.IsFollow = new Boolean(source.IsFollow);
        }
        if (source.IsAppoint != null) {
            this.IsAppoint = new Boolean(source.IsAppoint);
        }
        if (source.BusinessId != null) {
            this.BusinessId = new String(source.BusinessId);
        }
        if (source.IsDomainUser != null) {
            this.IsDomainUser = new Boolean(source.IsDomainUser);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "ReservationTime", this.ReservationTime);
        this.setParamSimple(map, prefix + "RegTime", this.RegTime);
        this.setParamSimple(map, prefix + "DelTime", this.DelTime);
        this.setParamSimple(map, prefix + "CurrentPeople", this.CurrentPeople);
        this.setParamSimple(map, prefix + "Price", this.Price);
        this.setParamSimple(map, prefix + "IsFollow", this.IsFollow);
        this.setParamSimple(map, prefix + "IsAppoint", this.IsAppoint);
        this.setParamSimple(map, prefix + "BusinessId", this.BusinessId);
        this.setParamSimple(map, prefix + "IsDomainUser", this.IsDomainUser);

    }
}

