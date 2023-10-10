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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulOverviewResponse extends AbstractModel{

    /**
    * 重点关注漏洞统计
    */
    @SerializedName("FollowVul")
    @Expose
    private VulOverview FollowVul;

    /**
    * 全部漏洞统计
    */
    @SerializedName("AllVul")
    @Expose
    private VulOverview AllVul;

    /**
    * 影响主机统计
    */
    @SerializedName("EffectHost")
    @Expose
    private VulOverview EffectHost;

    /**
    * 漏洞攻击事件（近1月）统计
    */
    @SerializedName("VulAttackEvent")
    @Expose
    private VulOverview VulAttackEvent;

    /**
    * 已防御攻击（近1月）统计
    */
    @SerializedName("VulDefenceEvent")
    @Expose
    private VulOverview VulDefenceEvent;

    /**
    * 漏洞库统计
    */
    @SerializedName("VulStore")
    @Expose
    private VulOverview VulStore;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 重点关注漏洞统计 
     * @return FollowVul 重点关注漏洞统计
     */
    public VulOverview getFollowVul() {
        return this.FollowVul;
    }

    /**
     * Set 重点关注漏洞统计
     * @param FollowVul 重点关注漏洞统计
     */
    public void setFollowVul(VulOverview FollowVul) {
        this.FollowVul = FollowVul;
    }

    /**
     * Get 全部漏洞统计 
     * @return AllVul 全部漏洞统计
     */
    public VulOverview getAllVul() {
        return this.AllVul;
    }

    /**
     * Set 全部漏洞统计
     * @param AllVul 全部漏洞统计
     */
    public void setAllVul(VulOverview AllVul) {
        this.AllVul = AllVul;
    }

    /**
     * Get 影响主机统计 
     * @return EffectHost 影响主机统计
     */
    public VulOverview getEffectHost() {
        return this.EffectHost;
    }

    /**
     * Set 影响主机统计
     * @param EffectHost 影响主机统计
     */
    public void setEffectHost(VulOverview EffectHost) {
        this.EffectHost = EffectHost;
    }

    /**
     * Get 漏洞攻击事件（近1月）统计 
     * @return VulAttackEvent 漏洞攻击事件（近1月）统计
     */
    public VulOverview getVulAttackEvent() {
        return this.VulAttackEvent;
    }

    /**
     * Set 漏洞攻击事件（近1月）统计
     * @param VulAttackEvent 漏洞攻击事件（近1月）统计
     */
    public void setVulAttackEvent(VulOverview VulAttackEvent) {
        this.VulAttackEvent = VulAttackEvent;
    }

    /**
     * Get 已防御攻击（近1月）统计 
     * @return VulDefenceEvent 已防御攻击（近1月）统计
     */
    public VulOverview getVulDefenceEvent() {
        return this.VulDefenceEvent;
    }

    /**
     * Set 已防御攻击（近1月）统计
     * @param VulDefenceEvent 已防御攻击（近1月）统计
     */
    public void setVulDefenceEvent(VulOverview VulDefenceEvent) {
        this.VulDefenceEvent = VulDefenceEvent;
    }

    /**
     * Get 漏洞库统计 
     * @return VulStore 漏洞库统计
     */
    public VulOverview getVulStore() {
        return this.VulStore;
    }

    /**
     * Set 漏洞库统计
     * @param VulStore 漏洞库统计
     */
    public void setVulStore(VulOverview VulStore) {
        this.VulStore = VulStore;
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

    public DescribeVulOverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulOverviewResponse(DescribeVulOverviewResponse source) {
        if (source.FollowVul != null) {
            this.FollowVul = new VulOverview(source.FollowVul);
        }
        if (source.AllVul != null) {
            this.AllVul = new VulOverview(source.AllVul);
        }
        if (source.EffectHost != null) {
            this.EffectHost = new VulOverview(source.EffectHost);
        }
        if (source.VulAttackEvent != null) {
            this.VulAttackEvent = new VulOverview(source.VulAttackEvent);
        }
        if (source.VulDefenceEvent != null) {
            this.VulDefenceEvent = new VulOverview(source.VulDefenceEvent);
        }
        if (source.VulStore != null) {
            this.VulStore = new VulOverview(source.VulStore);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "FollowVul.", this.FollowVul);
        this.setParamObj(map, prefix + "AllVul.", this.AllVul);
        this.setParamObj(map, prefix + "EffectHost.", this.EffectHost);
        this.setParamObj(map, prefix + "VulAttackEvent.", this.VulAttackEvent);
        this.setParamObj(map, prefix + "VulDefenceEvent.", this.VulDefenceEvent);
        this.setParamObj(map, prefix + "VulStore.", this.VulStore);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

