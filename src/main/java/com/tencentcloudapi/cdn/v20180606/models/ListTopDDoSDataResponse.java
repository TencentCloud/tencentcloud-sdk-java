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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ListTopDDoSDataResponse extends AbstractModel{

    /**
    * DDoS 攻击类型的top数据，当Metric=AttackType的时候返回攻击类型的统计数据，IPData为空
    */
    @SerializedName("Data")
    @Expose
    private DDoSTopData [] Data;

    /**
    * ddos攻击ip的top数据，Metric=AttackIP的时候返回IPData，Data为空
    */
    @SerializedName("IPData")
    @Expose
    private DDoSAttackIPTopData [] IPData;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get DDoS 攻击类型的top数据，当Metric=AttackType的时候返回攻击类型的统计数据，IPData为空 
     * @return Data DDoS 攻击类型的top数据，当Metric=AttackType的时候返回攻击类型的统计数据，IPData为空
     */
    public DDoSTopData [] getData() {
        return this.Data;
    }

    /**
     * Set DDoS 攻击类型的top数据，当Metric=AttackType的时候返回攻击类型的统计数据，IPData为空
     * @param Data DDoS 攻击类型的top数据，当Metric=AttackType的时候返回攻击类型的统计数据，IPData为空
     */
    public void setData(DDoSTopData [] Data) {
        this.Data = Data;
    }

    /**
     * Get ddos攻击ip的top数据，Metric=AttackIP的时候返回IPData，Data为空 
     * @return IPData ddos攻击ip的top数据，Metric=AttackIP的时候返回IPData，Data为空
     */
    public DDoSAttackIPTopData [] getIPData() {
        return this.IPData;
    }

    /**
     * Set ddos攻击ip的top数据，Metric=AttackIP的时候返回IPData，Data为空
     * @param IPData ddos攻击ip的top数据，Metric=AttackIP的时候返回IPData，Data为空
     */
    public void setIPData(DDoSAttackIPTopData [] IPData) {
        this.IPData = IPData;
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

    public ListTopDDoSDataResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ListTopDDoSDataResponse(ListTopDDoSDataResponse source) {
        if (source.Data != null) {
            this.Data = new DDoSTopData[source.Data.length];
            for (int i = 0; i < source.Data.length; i++) {
                this.Data[i] = new DDoSTopData(source.Data[i]);
            }
        }
        if (source.IPData != null) {
            this.IPData = new DDoSAttackIPTopData[source.IPData.length];
            for (int i = 0; i < source.IPData.length; i++) {
                this.IPData[i] = new DDoSAttackIPTopData(source.IPData[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Data.", this.Data);
        this.setParamArrayObj(map, prefix + "IPData.", this.IPData);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

