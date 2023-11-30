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
package com.tencentcloudapi.mna.v20210119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OrderFlowPackageRequest extends AbstractModel {

    /**
    * 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
    */
    @SerializedName("PackageType")
    @Expose
    private String PackageType;

    /**
    * 流量包绑定的设备ID列表。捆绑设备个数上限取决于包的规格档位：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
    */
    @SerializedName("DeviceList")
    @Expose
    private String [] DeviceList;

    /**
    * 是否自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
    * 区域标识，0：国内，1：国外
    */
    @SerializedName("PackageRegion")
    @Expose
    private Long PackageRegion;

    /**
     * Get 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备 
     * @return PackageType 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     */
    public String getPackageType() {
        return this.PackageType;
    }

    /**
     * Set 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     * @param PackageType 流量包规格类型。可取值如下：
DEVICE_1_FLOW_20G、DEVICE_2_FLOW_50G、
DEVICE_3_FLOW_100G、
DEVICE_5_FLOW_500G，分别代表20G、50G、100G、500G档位的流量包。
档位也影响流量包可绑定的设备数量上限：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     */
    public void setPackageType(String PackageType) {
        this.PackageType = PackageType;
    }

    /**
     * Get 流量包绑定的设备ID列表。捆绑设备个数上限取决于包的规格档位：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备 
     * @return DeviceList 流量包绑定的设备ID列表。捆绑设备个数上限取决于包的规格档位：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     */
    public String [] getDeviceList() {
        return this.DeviceList;
    }

    /**
     * Set 流量包绑定的设备ID列表。捆绑设备个数上限取决于包的规格档位：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     * @param DeviceList 流量包绑定的设备ID列表。捆绑设备个数上限取决于包的规格档位：
20G：最多绑定1个设备
50G：最多绑定2个设备
100G：最多绑定3个设备
500G：最多绑定5个设备
     */
    public void setDeviceList(String [] DeviceList) {
        this.DeviceList = DeviceList;
    }

    /**
     * Get 是否自动续费 
     * @return AutoRenewFlag 是否自动续费
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费
     * @param AutoRenewFlag 是否自动续费
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 区域标识，0：国内，1：国外 
     * @return PackageRegion 区域标识，0：国内，1：国外
     */
    public Long getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set 区域标识，0：国内，1：国外
     * @param PackageRegion 区域标识，0：国内，1：国外
     */
    public void setPackageRegion(Long PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    public OrderFlowPackageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderFlowPackageRequest(OrderFlowPackageRequest source) {
        if (source.PackageType != null) {
            this.PackageType = new String(source.PackageType);
        }
        if (source.DeviceList != null) {
            this.DeviceList = new String[source.DeviceList.length];
            for (int i = 0; i < source.DeviceList.length; i++) {
                this.DeviceList[i] = new String(source.DeviceList[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Boolean(source.AutoRenewFlag);
        }
        if (source.PackageRegion != null) {
            this.PackageRegion = new Long(source.PackageRegion);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PackageType", this.PackageType);
        this.setParamArraySimple(map, prefix + "DeviceList.", this.DeviceList);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PackageRegion", this.PackageRegion);

    }
}

