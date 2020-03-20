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
package com.tencentcloudapi.dts.v20180330.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifySubscribeVipVportRequest extends AbstractModel{

    /**
    * 数据订阅实例的ID
    */
    @SerializedName("SubscribeId")
    @Expose
    private String SubscribeId;

    /**
    * 指定目的子网，如果传此参数，DstIp必须在目的子网内
    */
    @SerializedName("DstUniqSubnetId")
    @Expose
    private String DstUniqSubnetId;

    /**
    * 目标IP，与DstPort至少传一个
    */
    @SerializedName("DstIp")
    @Expose
    private String DstIp;

    /**
    * 目标PORT，支持范围为：[1025-65535]
    */
    @SerializedName("DstPort")
    @Expose
    private Long DstPort;

    /**
     * Get 数据订阅实例的ID 
     * @return SubscribeId 数据订阅实例的ID
     */
    public String getSubscribeId() {
        return this.SubscribeId;
    }

    /**
     * Set 数据订阅实例的ID
     * @param SubscribeId 数据订阅实例的ID
     */
    public void setSubscribeId(String SubscribeId) {
        this.SubscribeId = SubscribeId;
    }

    /**
     * Get 指定目的子网，如果传此参数，DstIp必须在目的子网内 
     * @return DstUniqSubnetId 指定目的子网，如果传此参数，DstIp必须在目的子网内
     */
    public String getDstUniqSubnetId() {
        return this.DstUniqSubnetId;
    }

    /**
     * Set 指定目的子网，如果传此参数，DstIp必须在目的子网内
     * @param DstUniqSubnetId 指定目的子网，如果传此参数，DstIp必须在目的子网内
     */
    public void setDstUniqSubnetId(String DstUniqSubnetId) {
        this.DstUniqSubnetId = DstUniqSubnetId;
    }

    /**
     * Get 目标IP，与DstPort至少传一个 
     * @return DstIp 目标IP，与DstPort至少传一个
     */
    public String getDstIp() {
        return this.DstIp;
    }

    /**
     * Set 目标IP，与DstPort至少传一个
     * @param DstIp 目标IP，与DstPort至少传一个
     */
    public void setDstIp(String DstIp) {
        this.DstIp = DstIp;
    }

    /**
     * Get 目标PORT，支持范围为：[1025-65535] 
     * @return DstPort 目标PORT，支持范围为：[1025-65535]
     */
    public Long getDstPort() {
        return this.DstPort;
    }

    /**
     * Set 目标PORT，支持范围为：[1025-65535]
     * @param DstPort 目标PORT，支持范围为：[1025-65535]
     */
    public void setDstPort(Long DstPort) {
        this.DstPort = DstPort;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubscribeId", this.SubscribeId);
        this.setParamSimple(map, prefix + "DstUniqSubnetId", this.DstUniqSubnetId);
        this.setParamSimple(map, prefix + "DstIp", this.DstIp);
        this.setParamSimple(map, prefix + "DstPort", this.DstPort);

    }
}

