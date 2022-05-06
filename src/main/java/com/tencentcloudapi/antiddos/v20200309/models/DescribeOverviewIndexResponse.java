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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOverviewIndexResponse extends AbstractModel{

    /**
    * IP总数
    */
    @SerializedName("AllIpCount")
    @Expose
    private Long AllIpCount;

    /**
    * 高防IP总数（包含高防包+高防IP）
    */
    @SerializedName("AntiddosIpCount")
    @Expose
    private Long AntiddosIpCount;

    /**
    * 攻击IP总数
    */
    @SerializedName("AttackIpCount")
    @Expose
    private Long AttackIpCount;

    /**
    * 封堵IP总数
    */
    @SerializedName("BlockIpCount")
    @Expose
    private Long BlockIpCount;

    /**
    * 高防域名总数
    */
    @SerializedName("AntiddosDomainCount")
    @Expose
    private Long AntiddosDomainCount;

    /**
    * 攻击域名总数
    */
    @SerializedName("AttackDomainCount")
    @Expose
    private Long AttackDomainCount;

    /**
    * 攻击流量峰值
    */
    @SerializedName("MaxAttackFlow")
    @Expose
    private Long MaxAttackFlow;

    /**
    * 当前最近一条攻击中的起始时间
    */
    @SerializedName("NewAttackTime")
    @Expose
    private String NewAttackTime;

    /**
    * 当前最近一条攻击中的IP
    */
    @SerializedName("NewAttackIp")
    @Expose
    private String NewAttackIp;

    /**
    * 当前最近一条攻击中的攻击类型
    */
    @SerializedName("NewAttackType")
    @Expose
    private String NewAttackType;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get IP总数 
     * @return AllIpCount IP总数
     */
    public Long getAllIpCount() {
        return this.AllIpCount;
    }

    /**
     * Set IP总数
     * @param AllIpCount IP总数
     */
    public void setAllIpCount(Long AllIpCount) {
        this.AllIpCount = AllIpCount;
    }

    /**
     * Get 高防IP总数（包含高防包+高防IP） 
     * @return AntiddosIpCount 高防IP总数（包含高防包+高防IP）
     */
    public Long getAntiddosIpCount() {
        return this.AntiddosIpCount;
    }

    /**
     * Set 高防IP总数（包含高防包+高防IP）
     * @param AntiddosIpCount 高防IP总数（包含高防包+高防IP）
     */
    public void setAntiddosIpCount(Long AntiddosIpCount) {
        this.AntiddosIpCount = AntiddosIpCount;
    }

    /**
     * Get 攻击IP总数 
     * @return AttackIpCount 攻击IP总数
     */
    public Long getAttackIpCount() {
        return this.AttackIpCount;
    }

    /**
     * Set 攻击IP总数
     * @param AttackIpCount 攻击IP总数
     */
    public void setAttackIpCount(Long AttackIpCount) {
        this.AttackIpCount = AttackIpCount;
    }

    /**
     * Get 封堵IP总数 
     * @return BlockIpCount 封堵IP总数
     */
    public Long getBlockIpCount() {
        return this.BlockIpCount;
    }

    /**
     * Set 封堵IP总数
     * @param BlockIpCount 封堵IP总数
     */
    public void setBlockIpCount(Long BlockIpCount) {
        this.BlockIpCount = BlockIpCount;
    }

    /**
     * Get 高防域名总数 
     * @return AntiddosDomainCount 高防域名总数
     */
    public Long getAntiddosDomainCount() {
        return this.AntiddosDomainCount;
    }

    /**
     * Set 高防域名总数
     * @param AntiddosDomainCount 高防域名总数
     */
    public void setAntiddosDomainCount(Long AntiddosDomainCount) {
        this.AntiddosDomainCount = AntiddosDomainCount;
    }

    /**
     * Get 攻击域名总数 
     * @return AttackDomainCount 攻击域名总数
     */
    public Long getAttackDomainCount() {
        return this.AttackDomainCount;
    }

    /**
     * Set 攻击域名总数
     * @param AttackDomainCount 攻击域名总数
     */
    public void setAttackDomainCount(Long AttackDomainCount) {
        this.AttackDomainCount = AttackDomainCount;
    }

    /**
     * Get 攻击流量峰值 
     * @return MaxAttackFlow 攻击流量峰值
     */
    public Long getMaxAttackFlow() {
        return this.MaxAttackFlow;
    }

    /**
     * Set 攻击流量峰值
     * @param MaxAttackFlow 攻击流量峰值
     */
    public void setMaxAttackFlow(Long MaxAttackFlow) {
        this.MaxAttackFlow = MaxAttackFlow;
    }

    /**
     * Get 当前最近一条攻击中的起始时间 
     * @return NewAttackTime 当前最近一条攻击中的起始时间
     */
    public String getNewAttackTime() {
        return this.NewAttackTime;
    }

    /**
     * Set 当前最近一条攻击中的起始时间
     * @param NewAttackTime 当前最近一条攻击中的起始时间
     */
    public void setNewAttackTime(String NewAttackTime) {
        this.NewAttackTime = NewAttackTime;
    }

    /**
     * Get 当前最近一条攻击中的IP 
     * @return NewAttackIp 当前最近一条攻击中的IP
     */
    public String getNewAttackIp() {
        return this.NewAttackIp;
    }

    /**
     * Set 当前最近一条攻击中的IP
     * @param NewAttackIp 当前最近一条攻击中的IP
     */
    public void setNewAttackIp(String NewAttackIp) {
        this.NewAttackIp = NewAttackIp;
    }

    /**
     * Get 当前最近一条攻击中的攻击类型 
     * @return NewAttackType 当前最近一条攻击中的攻击类型
     */
    public String getNewAttackType() {
        return this.NewAttackType;
    }

    /**
     * Set 当前最近一条攻击中的攻击类型
     * @param NewAttackType 当前最近一条攻击中的攻击类型
     */
    public void setNewAttackType(String NewAttackType) {
        this.NewAttackType = NewAttackType;
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

    public DescribeOverviewIndexResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOverviewIndexResponse(DescribeOverviewIndexResponse source) {
        if (source.AllIpCount != null) {
            this.AllIpCount = new Long(source.AllIpCount);
        }
        if (source.AntiddosIpCount != null) {
            this.AntiddosIpCount = new Long(source.AntiddosIpCount);
        }
        if (source.AttackIpCount != null) {
            this.AttackIpCount = new Long(source.AttackIpCount);
        }
        if (source.BlockIpCount != null) {
            this.BlockIpCount = new Long(source.BlockIpCount);
        }
        if (source.AntiddosDomainCount != null) {
            this.AntiddosDomainCount = new Long(source.AntiddosDomainCount);
        }
        if (source.AttackDomainCount != null) {
            this.AttackDomainCount = new Long(source.AttackDomainCount);
        }
        if (source.MaxAttackFlow != null) {
            this.MaxAttackFlow = new Long(source.MaxAttackFlow);
        }
        if (source.NewAttackTime != null) {
            this.NewAttackTime = new String(source.NewAttackTime);
        }
        if (source.NewAttackIp != null) {
            this.NewAttackIp = new String(source.NewAttackIp);
        }
        if (source.NewAttackType != null) {
            this.NewAttackType = new String(source.NewAttackType);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AllIpCount", this.AllIpCount);
        this.setParamSimple(map, prefix + "AntiddosIpCount", this.AntiddosIpCount);
        this.setParamSimple(map, prefix + "AttackIpCount", this.AttackIpCount);
        this.setParamSimple(map, prefix + "BlockIpCount", this.BlockIpCount);
        this.setParamSimple(map, prefix + "AntiddosDomainCount", this.AntiddosDomainCount);
        this.setParamSimple(map, prefix + "AttackDomainCount", this.AttackDomainCount);
        this.setParamSimple(map, prefix + "MaxAttackFlow", this.MaxAttackFlow);
        this.setParamSimple(map, prefix + "NewAttackTime", this.NewAttackTime);
        this.setParamSimple(map, prefix + "NewAttackIp", this.NewAttackIp);
        this.setParamSimple(map, prefix + "NewAttackType", this.NewAttackType);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

