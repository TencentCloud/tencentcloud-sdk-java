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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDeviceInfoRspData extends AbstractModel {

    /**
    * 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessList")
    @Expose
    private DeviceProcessInfo [] ProcessList;

    /**
    * 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NetworkList")
    @Expose
    private DeviceNetworkInfo [] NetworkList;

    /**
    * 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceList")
    @Expose
    private DeviceServiceInfo [] ServiceList;

    /**
     * Get 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessList 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceProcessInfo [] getProcessList() {
        return this.ProcessList;
    }

    /**
     * Set 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessList 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessList(DeviceProcessInfo [] ProcessList) {
        this.ProcessList = ProcessList;
    }

    /**
     * Get 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NetworkList 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceNetworkInfo [] getNetworkList() {
        return this.NetworkList;
    }

    /**
     * Set 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param NetworkList 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNetworkList(DeviceNetworkInfo [] NetworkList) {
        this.NetworkList = NetworkList;
    }

    /**
     * Get 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceList 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DeviceServiceInfo [] getServiceList() {
        return this.ServiceList;
    }

    /**
     * Set 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceList 分页的具体数据对象
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceList(DeviceServiceInfo [] ServiceList) {
        this.ServiceList = ServiceList;
    }

    public DescribeDeviceInfoRspData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDeviceInfoRspData(DescribeDeviceInfoRspData source) {
        if (source.ProcessList != null) {
            this.ProcessList = new DeviceProcessInfo[source.ProcessList.length];
            for (int i = 0; i < source.ProcessList.length; i++) {
                this.ProcessList[i] = new DeviceProcessInfo(source.ProcessList[i]);
            }
        }
        if (source.NetworkList != null) {
            this.NetworkList = new DeviceNetworkInfo[source.NetworkList.length];
            for (int i = 0; i < source.NetworkList.length; i++) {
                this.NetworkList[i] = new DeviceNetworkInfo(source.NetworkList[i]);
            }
        }
        if (source.ServiceList != null) {
            this.ServiceList = new DeviceServiceInfo[source.ServiceList.length];
            for (int i = 0; i < source.ServiceList.length; i++) {
                this.ServiceList[i] = new DeviceServiceInfo(source.ServiceList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "ProcessList.", this.ProcessList);
        this.setParamArrayObj(map, prefix + "NetworkList.", this.NetworkList);
        this.setParamArrayObj(map, prefix + "ServiceList.", this.ServiceList);

    }
}

