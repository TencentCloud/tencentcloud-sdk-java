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
package com.tencentcloudapi.fwm.v20250611.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AccountGroupQuotaDetail extends AbstractModel {

    /**
    * 账号组Id
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 账号组名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 账号组成员数
    */
    @SerializedName("MemberCount")
    @Expose
    private Long MemberCount;

    /**
    * 取组内 RemainQuota 最小成员的值
    */
    @SerializedName("RemainQuota")
    @Expose
    private Long RemainQuota;

    /**
    * 同上成员的 TotalQuota
    */
    @SerializedName("TotalQuota")
    @Expose
    private Long TotalQuota;

    /**
    * 同上成员的 DispatchRuleNum
    */
    @SerializedName("DispatchRuleNum")
    @Expose
    private Long DispatchRuleNum;

    /**
    * 同上成员的 OriginRuleNum
    */
    @SerializedName("OriginRuleNum")
    @Expose
    private Long OriginRuleNum;

    /**
    * 配额最少的成员 Uin
    */
    @SerializedName("BottleneckUin")
    @Expose
    private String BottleneckUin;

    /**
    * 成员列表
    */
    @SerializedName("Members")
    @Expose
    private Account [] Members;

    /**
     * Get 账号组Id 
     * @return GroupId 账号组Id
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * Set 账号组Id
     * @param GroupId 账号组Id
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * Get 账号组名称 
     * @return GroupName 账号组名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * Set 账号组名称
     * @param GroupName 账号组名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * Get 账号组成员数 
     * @return MemberCount 账号组成员数
     */
    public Long getMemberCount() {
        return this.MemberCount;
    }

    /**
     * Set 账号组成员数
     * @param MemberCount 账号组成员数
     */
    public void setMemberCount(Long MemberCount) {
        this.MemberCount = MemberCount;
    }

    /**
     * Get 取组内 RemainQuota 最小成员的值 
     * @return RemainQuota 取组内 RemainQuota 最小成员的值
     */
    public Long getRemainQuota() {
        return this.RemainQuota;
    }

    /**
     * Set 取组内 RemainQuota 最小成员的值
     * @param RemainQuota 取组内 RemainQuota 最小成员的值
     */
    public void setRemainQuota(Long RemainQuota) {
        this.RemainQuota = RemainQuota;
    }

    /**
     * Get 同上成员的 TotalQuota 
     * @return TotalQuota 同上成员的 TotalQuota
     */
    public Long getTotalQuota() {
        return this.TotalQuota;
    }

    /**
     * Set 同上成员的 TotalQuota
     * @param TotalQuota 同上成员的 TotalQuota
     */
    public void setTotalQuota(Long TotalQuota) {
        this.TotalQuota = TotalQuota;
    }

    /**
     * Get 同上成员的 DispatchRuleNum 
     * @return DispatchRuleNum 同上成员的 DispatchRuleNum
     */
    public Long getDispatchRuleNum() {
        return this.DispatchRuleNum;
    }

    /**
     * Set 同上成员的 DispatchRuleNum
     * @param DispatchRuleNum 同上成员的 DispatchRuleNum
     */
    public void setDispatchRuleNum(Long DispatchRuleNum) {
        this.DispatchRuleNum = DispatchRuleNum;
    }

    /**
     * Get 同上成员的 OriginRuleNum 
     * @return OriginRuleNum 同上成员的 OriginRuleNum
     */
    public Long getOriginRuleNum() {
        return this.OriginRuleNum;
    }

    /**
     * Set 同上成员的 OriginRuleNum
     * @param OriginRuleNum 同上成员的 OriginRuleNum
     */
    public void setOriginRuleNum(Long OriginRuleNum) {
        this.OriginRuleNum = OriginRuleNum;
    }

    /**
     * Get 配额最少的成员 Uin 
     * @return BottleneckUin 配额最少的成员 Uin
     */
    public String getBottleneckUin() {
        return this.BottleneckUin;
    }

    /**
     * Set 配额最少的成员 Uin
     * @param BottleneckUin 配额最少的成员 Uin
     */
    public void setBottleneckUin(String BottleneckUin) {
        this.BottleneckUin = BottleneckUin;
    }

    /**
     * Get 成员列表 
     * @return Members 成员列表
     */
    public Account [] getMembers() {
        return this.Members;
    }

    /**
     * Set 成员列表
     * @param Members 成员列表
     */
    public void setMembers(Account [] Members) {
        this.Members = Members;
    }

    public AccountGroupQuotaDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AccountGroupQuotaDetail(AccountGroupQuotaDetail source) {
        if (source.GroupId != null) {
            this.GroupId = new String(source.GroupId);
        }
        if (source.GroupName != null) {
            this.GroupName = new String(source.GroupName);
        }
        if (source.MemberCount != null) {
            this.MemberCount = new Long(source.MemberCount);
        }
        if (source.RemainQuota != null) {
            this.RemainQuota = new Long(source.RemainQuota);
        }
        if (source.TotalQuota != null) {
            this.TotalQuota = new Long(source.TotalQuota);
        }
        if (source.DispatchRuleNum != null) {
            this.DispatchRuleNum = new Long(source.DispatchRuleNum);
        }
        if (source.OriginRuleNum != null) {
            this.OriginRuleNum = new Long(source.OriginRuleNum);
        }
        if (source.BottleneckUin != null) {
            this.BottleneckUin = new String(source.BottleneckUin);
        }
        if (source.Members != null) {
            this.Members = new Account[source.Members.length];
            for (int i = 0; i < source.Members.length; i++) {
                this.Members[i] = new Account(source.Members[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "MemberCount", this.MemberCount);
        this.setParamSimple(map, prefix + "RemainQuota", this.RemainQuota);
        this.setParamSimple(map, prefix + "TotalQuota", this.TotalQuota);
        this.setParamSimple(map, prefix + "DispatchRuleNum", this.DispatchRuleNum);
        this.setParamSimple(map, prefix + "OriginRuleNum", this.OriginRuleNum);
        this.setParamSimple(map, prefix + "BottleneckUin", this.BottleneckUin);
        this.setParamArrayObj(map, prefix + "Members.", this.Members);

    }
}

