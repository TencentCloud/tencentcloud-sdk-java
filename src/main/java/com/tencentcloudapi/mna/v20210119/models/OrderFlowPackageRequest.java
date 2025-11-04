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
    * 是否自动续费，该选项和流量截断冲突，只能开启一个
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Boolean AutoRenewFlag;

    /**
    * 区域标识，0：中国境内，1：中国境外
    */
    @SerializedName("PackageRegion")
    @Expose
    private Long PackageRegion;

    /**
    * 是否开启流量截断功能，该选项和自动续费冲突
    */
    @SerializedName("FlowTruncFlag")
    @Expose
    private Boolean FlowTruncFlag;

    /**
    * 是否自动选择代金券，默认false。
有多张券时的选择策略：按照可支付订单全部金额的券，先到期的券，可抵扣金额最大的券，余额最小的券，现金券 这个优先级进行扣券，且最多只抵扣一张券。
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Boolean AutoVoucher;

    /**
    * 指定代金券ID。自动选择代金券时此参数无效。目前只允许传入一张代金券。
注：若指定的代金券不符合订单抵扣条件，则正常支付，不扣券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

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
     * Get 是否自动续费，该选项和流量截断冲突，只能开启一个 
     * @return AutoRenewFlag 是否自动续费，该选项和流量截断冲突，只能开启一个
     */
    public Boolean getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费，该选项和流量截断冲突，只能开启一个
     * @param AutoRenewFlag 是否自动续费，该选项和流量截断冲突，只能开启一个
     */
    public void setAutoRenewFlag(Boolean AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 区域标识，0：中国境内，1：中国境外 
     * @return PackageRegion 区域标识，0：中国境内，1：中国境外
     */
    public Long getPackageRegion() {
        return this.PackageRegion;
    }

    /**
     * Set 区域标识，0：中国境内，1：中国境外
     * @param PackageRegion 区域标识，0：中国境内，1：中国境外
     */
    public void setPackageRegion(Long PackageRegion) {
        this.PackageRegion = PackageRegion;
    }

    /**
     * Get 是否开启流量截断功能，该选项和自动续费冲突 
     * @return FlowTruncFlag 是否开启流量截断功能，该选项和自动续费冲突
     */
    public Boolean getFlowTruncFlag() {
        return this.FlowTruncFlag;
    }

    /**
     * Set 是否开启流量截断功能，该选项和自动续费冲突
     * @param FlowTruncFlag 是否开启流量截断功能，该选项和自动续费冲突
     */
    public void setFlowTruncFlag(Boolean FlowTruncFlag) {
        this.FlowTruncFlag = FlowTruncFlag;
    }

    /**
     * Get 是否自动选择代金券，默认false。
有多张券时的选择策略：按照可支付订单全部金额的券，先到期的券，可抵扣金额最大的券，余额最小的券，现金券 这个优先级进行扣券，且最多只抵扣一张券。 
     * @return AutoVoucher 是否自动选择代金券，默认false。
有多张券时的选择策略：按照可支付订单全部金额的券，先到期的券，可抵扣金额最大的券，余额最小的券，现金券 这个优先级进行扣券，且最多只抵扣一张券。
     */
    public Boolean getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * Set 是否自动选择代金券，默认false。
有多张券时的选择策略：按照可支付订单全部金额的券，先到期的券，可抵扣金额最大的券，余额最小的券，现金券 这个优先级进行扣券，且最多只抵扣一张券。
     * @param AutoVoucher 是否自动选择代金券，默认false。
有多张券时的选择策略：按照可支付订单全部金额的券，先到期的券，可抵扣金额最大的券，余额最小的券，现金券 这个优先级进行扣券，且最多只抵扣一张券。
     */
    public void setAutoVoucher(Boolean AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * Get 指定代金券ID。自动选择代金券时此参数无效。目前只允许传入一张代金券。
注：若指定的代金券不符合订单抵扣条件，则正常支付，不扣券 
     * @return VoucherIds 指定代金券ID。自动选择代金券时此参数无效。目前只允许传入一张代金券。
注：若指定的代金券不符合订单抵扣条件，则正常支付，不扣券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * Set 指定代金券ID。自动选择代金券时此参数无效。目前只允许传入一张代金券。
注：若指定的代金券不符合订单抵扣条件，则正常支付，不扣券
     * @param VoucherIds 指定代金券ID。自动选择代金券时此参数无效。目前只允许传入一张代金券。
注：若指定的代金券不符合订单抵扣条件，则正常支付，不扣券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
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
        if (source.FlowTruncFlag != null) {
            this.FlowTruncFlag = new Boolean(source.FlowTruncFlag);
        }
        if (source.AutoVoucher != null) {
            this.AutoVoucher = new Boolean(source.AutoVoucher);
        }
        if (source.VoucherIds != null) {
            this.VoucherIds = new String[source.VoucherIds.length];
            for (int i = 0; i < source.VoucherIds.length; i++) {
                this.VoucherIds[i] = new String(source.VoucherIds[i]);
            }
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
        this.setParamSimple(map, prefix + "FlowTruncFlag", this.FlowTruncFlag);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

