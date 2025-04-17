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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteFlowLogRequest extends AbstractModel {

    /**
    * 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建；可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取。
    */
    @SerializedName("FlowLogId")
    @Expose
    private String FlowLogId;

    /**
    * 私用网络唯一ID。删除云联网流日志时，可不填，其他流日志类型必填。可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取流日志对应的私有网络唯一ID。也可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取当前账户的私有网络唯一ID。

    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
     * Get 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建；可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取。 
     * @return FlowLogId 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建；可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取。
     */
    public String getFlowLogId() {
        return this.FlowLogId;
    }

    /**
     * Set 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建；可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取。
     * @param FlowLogId 流日志唯一ID。可通过[CreateFlowLog](https://cloud.tencent.com/document/product/215/35015)接口创建；可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取。
     */
    public void setFlowLogId(String FlowLogId) {
        this.FlowLogId = FlowLogId;
    }

    /**
     * Get 私用网络唯一ID。删除云联网流日志时，可不填，其他流日志类型必填。可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取流日志对应的私有网络唯一ID。也可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取当前账户的私有网络唯一ID。
 
     * @return VpcId 私用网络唯一ID。删除云联网流日志时，可不填，其他流日志类型必填。可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取流日志对应的私有网络唯一ID。也可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取当前账户的私有网络唯一ID。

     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 私用网络唯一ID。删除云联网流日志时，可不填，其他流日志类型必填。可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取流日志对应的私有网络唯一ID。也可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取当前账户的私有网络唯一ID。

     * @param VpcId 私用网络唯一ID。删除云联网流日志时，可不填，其他流日志类型必填。可通过[DescribeFlowLogs](https://cloud.tencent.com/document/product/215/35012)接口获取流日志对应的私有网络唯一ID。也可通过[DescribeVpcs](https://cloud.tencent.com/document/product/1108/43663)接口获取当前账户的私有网络唯一ID。

     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    public DeleteFlowLogRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteFlowLogRequest(DeleteFlowLogRequest source) {
        if (source.FlowLogId != null) {
            this.FlowLogId = new String(source.FlowLogId);
        }
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowLogId", this.FlowLogId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);

    }
}

