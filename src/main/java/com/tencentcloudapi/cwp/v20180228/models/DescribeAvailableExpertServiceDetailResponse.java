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

public class DescribeAvailableExpertServiceDetailResponse extends AbstractModel{

    /**
    * 安全管家订单
    */
    @SerializedName("ExpertService")
    @Expose
    private ExpertServiceOrderInfo [] ExpertService;

    /**
    * 应急响应可用次数
    */
    @SerializedName("EmergencyResponse")
    @Expose
    private Long EmergencyResponse;

    /**
    * 旗舰护网可用次数
    */
    @SerializedName("ProtectNet")
    @Expose
    private Long ProtectNet;

    /**
    * 是否购买过安全管家
    */
    @SerializedName("ExpertServiceBuy")
    @Expose
    private Boolean ExpertServiceBuy;

    /**
    * 是否购买过应急响应
    */
    @SerializedName("EmergencyResponseBuy")
    @Expose
    private Boolean EmergencyResponseBuy;

    /**
    * 是否购买过旗舰护网
    */
    @SerializedName("ProtectNetBuy")
    @Expose
    private Boolean ProtectNetBuy;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 安全管家订单 
     * @return ExpertService 安全管家订单
     */
    public ExpertServiceOrderInfo [] getExpertService() {
        return this.ExpertService;
    }

    /**
     * Set 安全管家订单
     * @param ExpertService 安全管家订单
     */
    public void setExpertService(ExpertServiceOrderInfo [] ExpertService) {
        this.ExpertService = ExpertService;
    }

    /**
     * Get 应急响应可用次数 
     * @return EmergencyResponse 应急响应可用次数
     */
    public Long getEmergencyResponse() {
        return this.EmergencyResponse;
    }

    /**
     * Set 应急响应可用次数
     * @param EmergencyResponse 应急响应可用次数
     */
    public void setEmergencyResponse(Long EmergencyResponse) {
        this.EmergencyResponse = EmergencyResponse;
    }

    /**
     * Get 旗舰护网可用次数 
     * @return ProtectNet 旗舰护网可用次数
     */
    public Long getProtectNet() {
        return this.ProtectNet;
    }

    /**
     * Set 旗舰护网可用次数
     * @param ProtectNet 旗舰护网可用次数
     */
    public void setProtectNet(Long ProtectNet) {
        this.ProtectNet = ProtectNet;
    }

    /**
     * Get 是否购买过安全管家 
     * @return ExpertServiceBuy 是否购买过安全管家
     */
    public Boolean getExpertServiceBuy() {
        return this.ExpertServiceBuy;
    }

    /**
     * Set 是否购买过安全管家
     * @param ExpertServiceBuy 是否购买过安全管家
     */
    public void setExpertServiceBuy(Boolean ExpertServiceBuy) {
        this.ExpertServiceBuy = ExpertServiceBuy;
    }

    /**
     * Get 是否购买过应急响应 
     * @return EmergencyResponseBuy 是否购买过应急响应
     */
    public Boolean getEmergencyResponseBuy() {
        return this.EmergencyResponseBuy;
    }

    /**
     * Set 是否购买过应急响应
     * @param EmergencyResponseBuy 是否购买过应急响应
     */
    public void setEmergencyResponseBuy(Boolean EmergencyResponseBuy) {
        this.EmergencyResponseBuy = EmergencyResponseBuy;
    }

    /**
     * Get 是否购买过旗舰护网 
     * @return ProtectNetBuy 是否购买过旗舰护网
     */
    public Boolean getProtectNetBuy() {
        return this.ProtectNetBuy;
    }

    /**
     * Set 是否购买过旗舰护网
     * @param ProtectNetBuy 是否购买过旗舰护网
     */
    public void setProtectNetBuy(Boolean ProtectNetBuy) {
        this.ProtectNetBuy = ProtectNetBuy;
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

    public DescribeAvailableExpertServiceDetailResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAvailableExpertServiceDetailResponse(DescribeAvailableExpertServiceDetailResponse source) {
        if (source.ExpertService != null) {
            this.ExpertService = new ExpertServiceOrderInfo[source.ExpertService.length];
            for (int i = 0; i < source.ExpertService.length; i++) {
                this.ExpertService[i] = new ExpertServiceOrderInfo(source.ExpertService[i]);
            }
        }
        if (source.EmergencyResponse != null) {
            this.EmergencyResponse = new Long(source.EmergencyResponse);
        }
        if (source.ProtectNet != null) {
            this.ProtectNet = new Long(source.ProtectNet);
        }
        if (source.ExpertServiceBuy != null) {
            this.ExpertServiceBuy = new Boolean(source.ExpertServiceBuy);
        }
        if (source.EmergencyResponseBuy != null) {
            this.EmergencyResponseBuy = new Boolean(source.EmergencyResponseBuy);
        }
        if (source.ProtectNetBuy != null) {
            this.ProtectNetBuy = new Boolean(source.ProtectNetBuy);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ExpertService.", this.ExpertService);
        this.setParamSimple(map, prefix + "EmergencyResponse", this.EmergencyResponse);
        this.setParamSimple(map, prefix + "ProtectNet", this.ProtectNet);
        this.setParamSimple(map, prefix + "ExpertServiceBuy", this.ExpertServiceBuy);
        this.setParamSimple(map, prefix + "EmergencyResponseBuy", this.EmergencyResponseBuy);
        this.setParamSimple(map, prefix + "ProtectNetBuy", this.ProtectNetBuy);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

