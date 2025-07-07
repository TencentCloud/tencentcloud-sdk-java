/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TerminateInstancesRequest extends AbstractModel {

    /**
    * 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 释放弹性IP。EIP2.0下，仅提供主网卡下首个EIP，EIP类型限定在HighQualityEIP、AntiDDoSEIP、EIPv6、HighQualityEIPv6这几种类型。默认行为不释放。

示例值：true
默认值：false
    */
    @SerializedName("ReleaseAddress")
    @Expose
    private Boolean ReleaseAddress;

    /**
    * 释放实例挂载的包年包月数据盘。true表示销毁实例同时释放包年包月数据盘，false表示只销毁实例。
默认值：false
    */
    @SerializedName("ReleasePrepaidDataDisks")
    @Expose
    private Boolean ReleasePrepaidDataDisks;

    /**
     * Get 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。 
     * @return InstanceIds 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     * @param InstanceIds 一个或多个待操作的实例ID。可通过 [DescribeInstances](https://cloud.tencent.com/document/api/213/15728) 接口返回值中的`InstanceId`获取。每次请求批量实例的上限为100。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 释放弹性IP。EIP2.0下，仅提供主网卡下首个EIP，EIP类型限定在HighQualityEIP、AntiDDoSEIP、EIPv6、HighQualityEIPv6这几种类型。默认行为不释放。

示例值：true
默认值：false 
     * @return ReleaseAddress 释放弹性IP。EIP2.0下，仅提供主网卡下首个EIP，EIP类型限定在HighQualityEIP、AntiDDoSEIP、EIPv6、HighQualityEIPv6这几种类型。默认行为不释放。

示例值：true
默认值：false
     */
    public Boolean getReleaseAddress() {
        return this.ReleaseAddress;
    }

    /**
     * Set 释放弹性IP。EIP2.0下，仅提供主网卡下首个EIP，EIP类型限定在HighQualityEIP、AntiDDoSEIP、EIPv6、HighQualityEIPv6这几种类型。默认行为不释放。

示例值：true
默认值：false
     * @param ReleaseAddress 释放弹性IP。EIP2.0下，仅提供主网卡下首个EIP，EIP类型限定在HighQualityEIP、AntiDDoSEIP、EIPv6、HighQualityEIPv6这几种类型。默认行为不释放。

示例值：true
默认值：false
     */
    public void setReleaseAddress(Boolean ReleaseAddress) {
        this.ReleaseAddress = ReleaseAddress;
    }

    /**
     * Get 释放实例挂载的包年包月数据盘。true表示销毁实例同时释放包年包月数据盘，false表示只销毁实例。
默认值：false 
     * @return ReleasePrepaidDataDisks 释放实例挂载的包年包月数据盘。true表示销毁实例同时释放包年包月数据盘，false表示只销毁实例。
默认值：false
     */
    public Boolean getReleasePrepaidDataDisks() {
        return this.ReleasePrepaidDataDisks;
    }

    /**
     * Set 释放实例挂载的包年包月数据盘。true表示销毁实例同时释放包年包月数据盘，false表示只销毁实例。
默认值：false
     * @param ReleasePrepaidDataDisks 释放实例挂载的包年包月数据盘。true表示销毁实例同时释放包年包月数据盘，false表示只销毁实例。
默认值：false
     */
    public void setReleasePrepaidDataDisks(Boolean ReleasePrepaidDataDisks) {
        this.ReleasePrepaidDataDisks = ReleasePrepaidDataDisks;
    }

    public TerminateInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TerminateInstancesRequest(TerminateInstancesRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.ReleaseAddress != null) {
            this.ReleaseAddress = new Boolean(source.ReleaseAddress);
        }
        if (source.ReleasePrepaidDataDisks != null) {
            this.ReleasePrepaidDataDisks = new Boolean(source.ReleasePrepaidDataDisks);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "ReleaseAddress", this.ReleaseAddress);
        this.setParamSimple(map, prefix + "ReleasePrepaidDataDisks", this.ReleasePrepaidDataDisks);

    }
}

