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

public class OrderPerLicenseRequest extends AbstractModel {

    /**
    * 购买永久授权License的设备ID，如果是厂商未激活设备采用HardwareId
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 设备类型，0: SDK，1: CPE，作为用户创建或激活设备时传0，作为厂商创建待激活设备时传1
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 购买失败后是否回滚（删除）设备，默认false，如果设备绑定了生效中的流量包则不能回滚。
    */
    @SerializedName("RollBack")
    @Expose
    private Boolean RollBack;

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
     * Get 购买永久授权License的设备ID，如果是厂商未激活设备采用HardwareId 
     * @return DeviceId 购买永久授权License的设备ID，如果是厂商未激活设备采用HardwareId
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * Set 购买永久授权License的设备ID，如果是厂商未激活设备采用HardwareId
     * @param DeviceId 购买永久授权License的设备ID，如果是厂商未激活设备采用HardwareId
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * Get 设备类型，0: SDK，1: CPE，作为用户创建或激活设备时传0，作为厂商创建待激活设备时传1 
     * @return Type 设备类型，0: SDK，1: CPE，作为用户创建或激活设备时传0，作为厂商创建待激活设备时传1
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 设备类型，0: SDK，1: CPE，作为用户创建或激活设备时传0，作为厂商创建待激活设备时传1
     * @param Type 设备类型，0: SDK，1: CPE，作为用户创建或激活设备时传0，作为厂商创建待激活设备时传1
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 购买失败后是否回滚（删除）设备，默认false，如果设备绑定了生效中的流量包则不能回滚。 
     * @return RollBack 购买失败后是否回滚（删除）设备，默认false，如果设备绑定了生效中的流量包则不能回滚。
     */
    public Boolean getRollBack() {
        return this.RollBack;
    }

    /**
     * Set 购买失败后是否回滚（删除）设备，默认false，如果设备绑定了生效中的流量包则不能回滚。
     * @param RollBack 购买失败后是否回滚（删除）设备，默认false，如果设备绑定了生效中的流量包则不能回滚。
     */
    public void setRollBack(Boolean RollBack) {
        this.RollBack = RollBack;
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

    public OrderPerLicenseRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OrderPerLicenseRequest(OrderPerLicenseRequest source) {
        if (source.DeviceId != null) {
            this.DeviceId = new String(source.DeviceId);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.RollBack != null) {
            this.RollBack = new Boolean(source.RollBack);
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
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "RollBack", this.RollBack);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

