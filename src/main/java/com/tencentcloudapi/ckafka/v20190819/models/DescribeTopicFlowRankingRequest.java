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
package com.tencentcloudapi.ckafka.v20190819.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTopicFlowRankingRequest extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 排行类别(PRO-Topic生产流量/CON-Topic消费流量)
    */
    @SerializedName("RankingType")
    @Expose
    private String RankingType;

    /**
    * 排行起始日期
    */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;

    /**
    * 排行结束日期
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * Broker IP 地址
    */
    @SerializedName("BrokerIp")
    @Expose
    private String BrokerIp;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 排行类别(PRO-Topic生产流量/CON-Topic消费流量) 
     * @return RankingType 排行类别(PRO-Topic生产流量/CON-Topic消费流量)
     */
    public String getRankingType() {
        return this.RankingType;
    }

    /**
     * Set 排行类别(PRO-Topic生产流量/CON-Topic消费流量)
     * @param RankingType 排行类别(PRO-Topic生产流量/CON-Topic消费流量)
     */
    public void setRankingType(String RankingType) {
        this.RankingType = RankingType;
    }

    /**
     * Get 排行起始日期 
     * @return BeginDate 排行起始日期
     */
    public String getBeginDate() {
        return this.BeginDate;
    }

    /**
     * Set 排行起始日期
     * @param BeginDate 排行起始日期
     */
    public void setBeginDate(String BeginDate) {
        this.BeginDate = BeginDate;
    }

    /**
     * Get 排行结束日期 
     * @return EndDate 排行结束日期
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * Set 排行结束日期
     * @param EndDate 排行结束日期
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * Get Broker IP 地址 
     * @return BrokerIp Broker IP 地址
     */
    public String getBrokerIp() {
        return this.BrokerIp;
    }

    /**
     * Set Broker IP 地址
     * @param BrokerIp Broker IP 地址
     */
    public void setBrokerIp(String BrokerIp) {
        this.BrokerIp = BrokerIp;
    }

    public DescribeTopicFlowRankingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeTopicFlowRankingRequest(DescribeTopicFlowRankingRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.RankingType != null) {
            this.RankingType = new String(source.RankingType);
        }
        if (source.BeginDate != null) {
            this.BeginDate = new String(source.BeginDate);
        }
        if (source.EndDate != null) {
            this.EndDate = new String(source.EndDate);
        }
        if (source.BrokerIp != null) {
            this.BrokerIp = new String(source.BrokerIp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "RankingType", this.RankingType);
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "BrokerIp", this.BrokerIp);

    }
}

