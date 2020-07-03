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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteFlowLogRequest extends AbstractModel{

    /**
    * 私用网络ID或者统一ID，建议使用统一ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 流日志唯一ID
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
     * Get 私用网络ID或者统一ID，建议使用统一ID 
     * @return VpcId 私用网络ID或者统一ID，建议使用统一ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私用网络ID或者统一ID，建议使用统一ID
     * @param VpcId 私用网络ID或者统一ID，建议使用统一ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 流日志唯一ID 
     * @return FlowLogId 流日志唯一ID
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set 流日志唯一ID
     * @param FlowLogId 流日志唯一ID
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);

    }
}

