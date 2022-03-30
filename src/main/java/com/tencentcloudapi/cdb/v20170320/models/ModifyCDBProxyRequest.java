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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyCDBProxyRequest extends AbstractModel{

    /**
    * 数据库代理组唯一ID
    */
    @SerializedName("ProxyGroupId")
    @Expose
    private String ProxyGroupId;

    /**
    * 是否开始延迟剔除，默认false，取值："true" | "false"
    */
    @SerializedName("IsKickout")
    @Expose
    private Boolean IsKickout;

    /**
    * 最少保留数，最小为0，最大为实例数量
    */
    @SerializedName("MinCount")
    @Expose
    private Long MinCount;

    /**
    * 延迟剔除的阈值；如果IsKickOut="true", 该字段必填
    */
    @SerializedName("MaxDelay")
    @Expose
    private Long MaxDelay;

    /**
    * 读写权重分配模式；系统自动分配："system"， 自定义："custom"
    */
    @SerializedName("WeightMode")
    @Expose
    private String WeightMode;

    /**
    * 实例只读权重
    */
    @SerializedName("RoWeightValues")
    @Expose
    private RoWeight RoWeightValues;

    /**
    * 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，默认false，取值："true" | "false"
    */
    @SerializedName("FailOver")
    @Expose
    private Boolean FailOver;

    /**
    * 是否自动添加只读实例，默认false，取值："true" | "false"
    */
    @SerializedName("AutoAddRo")
    @Expose
    private Boolean AutoAddRo;

    /**
     * Get 数据库代理组唯一ID 
     * @return ProxyGroupId 数据库代理组唯一ID
     */
    public String getProxyGroupId() {
        return this.ProxyGroupId;
    }

    /**
     * Set 数据库代理组唯一ID
     * @param ProxyGroupId 数据库代理组唯一ID
     */
    public void setProxyGroupId(String ProxyGroupId) {
        this.ProxyGroupId = ProxyGroupId;
    }

    /**
     * Get 是否开始延迟剔除，默认false，取值："true" | "false" 
     * @return IsKickout 是否开始延迟剔除，默认false，取值："true" | "false"
     */
    public Boolean getIsKickout() {
        return this.IsKickout;
    }

    /**
     * Set 是否开始延迟剔除，默认false，取值："true" | "false"
     * @param IsKickout 是否开始延迟剔除，默认false，取值："true" | "false"
     */
    public void setIsKickout(Boolean IsKickout) {
        this.IsKickout = IsKickout;
    }

    /**
     * Get 最少保留数，最小为0，最大为实例数量 
     * @return MinCount 最少保留数，最小为0，最大为实例数量
     */
    public Long getMinCount() {
        return this.MinCount;
    }

    /**
     * Set 最少保留数，最小为0，最大为实例数量
     * @param MinCount 最少保留数，最小为0，最大为实例数量
     */
    public void setMinCount(Long MinCount) {
        this.MinCount = MinCount;
    }

    /**
     * Get 延迟剔除的阈值；如果IsKickOut="true", 该字段必填 
     * @return MaxDelay 延迟剔除的阈值；如果IsKickOut="true", 该字段必填
     */
    public Long getMaxDelay() {
        return this.MaxDelay;
    }

    /**
     * Set 延迟剔除的阈值；如果IsKickOut="true", 该字段必填
     * @param MaxDelay 延迟剔除的阈值；如果IsKickOut="true", 该字段必填
     */
    public void setMaxDelay(Long MaxDelay) {
        this.MaxDelay = MaxDelay;
    }

    /**
     * Get 读写权重分配模式；系统自动分配："system"， 自定义："custom" 
     * @return WeightMode 读写权重分配模式；系统自动分配："system"， 自定义："custom"
     */
    public String getWeightMode() {
        return this.WeightMode;
    }

    /**
     * Set 读写权重分配模式；系统自动分配："system"， 自定义："custom"
     * @param WeightMode 读写权重分配模式；系统自动分配："system"， 自定义："custom"
     */
    public void setWeightMode(String WeightMode) {
        this.WeightMode = WeightMode;
    }

    /**
     * Get 实例只读权重 
     * @return RoWeightValues 实例只读权重
     */
    public RoWeight getRoWeightValues() {
        return this.RoWeightValues;
    }

    /**
     * Set 实例只读权重
     * @param RoWeightValues 实例只读权重
     */
    public void setRoWeightValues(RoWeight RoWeightValues) {
        this.RoWeightValues = RoWeightValues;
    }

    /**
     * Get 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，默认false，取值："true" | "false" 
     * @return FailOver 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，默认false，取值："true" | "false"
     */
    public Boolean getFailOver() {
        return this.FailOver;
    }

    /**
     * Set 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，默认false，取值："true" | "false"
     * @param FailOver 是否开启故障转移，代理出现故障后，连接地址将路由到主实例，默认false，取值："true" | "false"
     */
    public void setFailOver(Boolean FailOver) {
        this.FailOver = FailOver;
    }

    /**
     * Get 是否自动添加只读实例，默认false，取值："true" | "false" 
     * @return AutoAddRo 是否自动添加只读实例，默认false，取值："true" | "false"
     */
    public Boolean getAutoAddRo() {
        return this.AutoAddRo;
    }

    /**
     * Set 是否自动添加只读实例，默认false，取值："true" | "false"
     * @param AutoAddRo 是否自动添加只读实例，默认false，取值："true" | "false"
     */
    public void setAutoAddRo(Boolean AutoAddRo) {
        this.AutoAddRo = AutoAddRo;
    }

    public ModifyCDBProxyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyCDBProxyRequest(ModifyCDBProxyRequest source) {
        if (source.ProxyGroupId != null) {
            this.ProxyGroupId = new String(source.ProxyGroupId);
        }
        if (source.IsKickout != null) {
            this.IsKickout = new Boolean(source.IsKickout);
        }
        if (source.MinCount != null) {
            this.MinCount = new Long(source.MinCount);
        }
        if (source.MaxDelay != null) {
            this.MaxDelay = new Long(source.MaxDelay);
        }
        if (source.WeightMode != null) {
            this.WeightMode = new String(source.WeightMode);
        }
        if (source.RoWeightValues != null) {
            this.RoWeightValues = new RoWeight(source.RoWeightValues);
        }
        if (source.FailOver != null) {
            this.FailOver = new Boolean(source.FailOver);
        }
        if (source.AutoAddRo != null) {
            this.AutoAddRo = new Boolean(source.AutoAddRo);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProxyGroupId", this.ProxyGroupId);
        this.setParamSimple(map, prefix + "IsKickout", this.IsKickout);
        this.setParamSimple(map, prefix + "MinCount", this.MinCount);
        this.setParamSimple(map, prefix + "MaxDelay", this.MaxDelay);
        this.setParamSimple(map, prefix + "WeightMode", this.WeightMode);
        this.setParamObj(map, prefix + "RoWeightValues.", this.RoWeightValues);
        this.setParamSimple(map, prefix + "FailOver", this.FailOver);
        this.setParamSimple(map, prefix + "AutoAddRo", this.AutoAddRo);

    }
}

