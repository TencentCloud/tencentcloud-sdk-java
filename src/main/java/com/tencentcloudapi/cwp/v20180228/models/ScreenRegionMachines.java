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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScreenRegionMachines extends AbstractModel {

    /**
    * 所有区域
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 区域中文描述
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 主机列表
    */
    @SerializedName("Machines")
    @Expose
    private ScreenMachine [] Machines;

    /**
    * 此区域的主机总数
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * 风险主机数量
    */
    @SerializedName("RiskCnt")
    @Expose
    private Long RiskCnt;

    /**
    * 潜在风险主机数
    */
    @SerializedName("AttackCnt")
    @Expose
    private Long AttackCnt;

    /**
    * 无风险主机数
    */
    @SerializedName("SafetyCnt")
    @Expose
    private Long SafetyCnt;

    /**
    * 离线/未安装主机数
    */
    @SerializedName("UnAgentOfflineCnt")
    @Expose
    private Long UnAgentOfflineCnt;

    /**
    * 省略展示多少主机，等于0时没有省略展示
    */
    @SerializedName("IgnoreCnt")
    @Expose
    private Long IgnoreCnt;

    /**
     * Get 所有区域 
     * @return Region 所有区域
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * Set 所有区域
     * @param Region 所有区域
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * Get 区域中文描述 
     * @return RegionName 区域中文描述
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * Set 区域中文描述
     * @param RegionName 区域中文描述
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * Get 主机列表 
     * @return Machines 主机列表
     */
    public ScreenMachine [] getMachines() {
        return this.Machines;
    }

    /**
     * Set 主机列表
     * @param Machines 主机列表
     */
    public void setMachines(ScreenMachine [] Machines) {
        this.Machines = Machines;
    }

    /**
     * Get 此区域的主机总数 
     * @return TotalCount 此区域的主机总数
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set 此区域的主机总数
     * @param TotalCount 此区域的主机总数
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get 风险主机数量 
     * @return RiskCnt 风险主机数量
     */
    public Long getRiskCnt() {
        return this.RiskCnt;
    }

    /**
     * Set 风险主机数量
     * @param RiskCnt 风险主机数量
     */
    public void setRiskCnt(Long RiskCnt) {
        this.RiskCnt = RiskCnt;
    }

    /**
     * Get 潜在风险主机数 
     * @return AttackCnt 潜在风险主机数
     */
    public Long getAttackCnt() {
        return this.AttackCnt;
    }

    /**
     * Set 潜在风险主机数
     * @param AttackCnt 潜在风险主机数
     */
    public void setAttackCnt(Long AttackCnt) {
        this.AttackCnt = AttackCnt;
    }

    /**
     * Get 无风险主机数 
     * @return SafetyCnt 无风险主机数
     */
    public Long getSafetyCnt() {
        return this.SafetyCnt;
    }

    /**
     * Set 无风险主机数
     * @param SafetyCnt 无风险主机数
     */
    public void setSafetyCnt(Long SafetyCnt) {
        this.SafetyCnt = SafetyCnt;
    }

    /**
     * Get 离线/未安装主机数 
     * @return UnAgentOfflineCnt 离线/未安装主机数
     */
    public Long getUnAgentOfflineCnt() {
        return this.UnAgentOfflineCnt;
    }

    /**
     * Set 离线/未安装主机数
     * @param UnAgentOfflineCnt 离线/未安装主机数
     */
    public void setUnAgentOfflineCnt(Long UnAgentOfflineCnt) {
        this.UnAgentOfflineCnt = UnAgentOfflineCnt;
    }

    /**
     * Get 省略展示多少主机，等于0时没有省略展示 
     * @return IgnoreCnt 省略展示多少主机，等于0时没有省略展示
     */
    public Long getIgnoreCnt() {
        return this.IgnoreCnt;
    }

    /**
     * Set 省略展示多少主机，等于0时没有省略展示
     * @param IgnoreCnt 省略展示多少主机，等于0时没有省略展示
     */
    public void setIgnoreCnt(Long IgnoreCnt) {
        this.IgnoreCnt = IgnoreCnt;
    }

    public ScreenRegionMachines() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScreenRegionMachines(ScreenRegionMachines source) {
        if (source.Region != null) {
            this.Region = new String(source.Region);
        }
        if (source.RegionName != null) {
            this.RegionName = new String(source.RegionName);
        }
        if (source.Machines != null) {
            this.Machines = new ScreenMachine[source.Machines.length];
            for (int i = 0; i < source.Machines.length; i++) {
                this.Machines[i] = new ScreenMachine(source.Machines[i]);
            }
        }
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.RiskCnt != null) {
            this.RiskCnt = new Long(source.RiskCnt);
        }
        if (source.AttackCnt != null) {
            this.AttackCnt = new Long(source.AttackCnt);
        }
        if (source.SafetyCnt != null) {
            this.SafetyCnt = new Long(source.SafetyCnt);
        }
        if (source.UnAgentOfflineCnt != null) {
            this.UnAgentOfflineCnt = new Long(source.UnAgentOfflineCnt);
        }
        if (source.IgnoreCnt != null) {
            this.IgnoreCnt = new Long(source.IgnoreCnt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArrayObj(map, prefix + "Machines.", this.Machines);
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamSimple(map, prefix + "RiskCnt", this.RiskCnt);
        this.setParamSimple(map, prefix + "AttackCnt", this.AttackCnt);
        this.setParamSimple(map, prefix + "SafetyCnt", this.SafetyCnt);
        this.setParamSimple(map, prefix + "UnAgentOfflineCnt", this.UnAgentOfflineCnt);
        this.setParamSimple(map, prefix + "IgnoreCnt", this.IgnoreCnt);

    }
}

