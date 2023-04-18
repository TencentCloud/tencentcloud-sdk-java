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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribePeakValueResponse extends AbstractModel{

    /**
    * QPS峰值
    */
    @SerializedName("Access")
    @Expose
    private Long Access;

    /**
    * 上行带宽峰值，单位B
    */
    @SerializedName("Up")
    @Expose
    private Long Up;

    /**
    * 下行带宽峰值，单位B
    */
    @SerializedName("Down")
    @Expose
    private Long Down;

    /**
    * Web攻击总数
    */
    @SerializedName("Attack")
    @Expose
    private Long Attack;

    /**
    * CC攻击总数
    */
    @SerializedName("Cc")
    @Expose
    private Long Cc;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get QPS峰值 
     * @return Access QPS峰值
     */
    public Long getAccess() {
        return this.Access;
    }

    /**
     * Set QPS峰值
     * @param Access QPS峰值
     */
    public void setAccess(Long Access) {
        this.Access = Access;
    }

    /**
     * Get 上行带宽峰值，单位B 
     * @return Up 上行带宽峰值，单位B
     */
    public Long getUp() {
        return this.Up;
    }

    /**
     * Set 上行带宽峰值，单位B
     * @param Up 上行带宽峰值，单位B
     */
    public void setUp(Long Up) {
        this.Up = Up;
    }

    /**
     * Get 下行带宽峰值，单位B 
     * @return Down 下行带宽峰值，单位B
     */
    public Long getDown() {
        return this.Down;
    }

    /**
     * Set 下行带宽峰值，单位B
     * @param Down 下行带宽峰值，单位B
     */
    public void setDown(Long Down) {
        this.Down = Down;
    }

    /**
     * Get Web攻击总数 
     * @return Attack Web攻击总数
     */
    public Long getAttack() {
        return this.Attack;
    }

    /**
     * Set Web攻击总数
     * @param Attack Web攻击总数
     */
    public void setAttack(Long Attack) {
        this.Attack = Attack;
    }

    /**
     * Get CC攻击总数 
     * @return Cc CC攻击总数
     */
    public Long getCc() {
        return this.Cc;
    }

    /**
     * Set CC攻击总数
     * @param Cc CC攻击总数
     */
    public void setCc(Long Cc) {
        this.Cc = Cc;
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

    public DescribePeakValueResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribePeakValueResponse(DescribePeakValueResponse source) {
        if (source.Access != null) {
            this.Access = new Long(source.Access);
        }
        if (source.Up != null) {
            this.Up = new Long(source.Up);
        }
        if (source.Down != null) {
            this.Down = new Long(source.Down);
        }
        if (source.Attack != null) {
            this.Attack = new Long(source.Attack);
        }
        if (source.Cc != null) {
            this.Cc = new Long(source.Cc);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Access", this.Access);
        this.setParamSimple(map, prefix + "Up", this.Up);
        this.setParamSimple(map, prefix + "Down", this.Down);
        this.setParamSimple(map, prefix + "Attack", this.Attack);
        this.setParamSimple(map, prefix + "Cc", this.Cc);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

