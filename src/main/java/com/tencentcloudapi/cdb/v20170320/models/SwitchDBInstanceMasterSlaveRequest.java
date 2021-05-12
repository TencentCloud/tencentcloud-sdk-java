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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SwitchDBInstanceMasterSlaveRequest extends AbstractModel{

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 目标从实例。可选值："first" - 第一备机；"second" - 第二备机。默认值为 "first"，仅多可用区实例支持设置为 "second"。
    */
    @SerializedName("DstSlave")
    @Expose
    private String DstSlave;

    /**
    * 是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。
    */
    @SerializedName("ForceSwitch")
    @Expose
    private Boolean ForceSwitch;

    /**
    * 是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。
    */
    @SerializedName("WaitSwitch")
    @Expose
    private Boolean WaitSwitch;

    /**
     * Get 实例 ID。 
     * @return InstanceId 实例 ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID。
     * @param InstanceId 实例 ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 目标从实例。可选值："first" - 第一备机；"second" - 第二备机。默认值为 "first"，仅多可用区实例支持设置为 "second"。 
     * @return DstSlave 目标从实例。可选值："first" - 第一备机；"second" - 第二备机。默认值为 "first"，仅多可用区实例支持设置为 "second"。
     */
    public String getDstSlave() {
        return this.DstSlave;
    }

    /**
     * Set 目标从实例。可选值："first" - 第一备机；"second" - 第二备机。默认值为 "first"，仅多可用区实例支持设置为 "second"。
     * @param DstSlave 目标从实例。可选值："first" - 第一备机；"second" - 第二备机。默认值为 "first"，仅多可用区实例支持设置为 "second"。
     */
    public void setDstSlave(String DstSlave) {
        this.DstSlave = DstSlave;
    }

    /**
     * Get 是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。 
     * @return ForceSwitch 是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。
     */
    public Boolean getForceSwitch() {
        return this.ForceSwitch;
    }

    /**
     * Set 是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。
     * @param ForceSwitch 是否强制切换。默认为 False。注意，若设置强制切换为 True，实例存在丢失数据的风险，请谨慎使用。
     */
    public void setForceSwitch(Boolean ForceSwitch) {
        this.ForceSwitch = ForceSwitch;
    }

    /**
     * Get 是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。 
     * @return WaitSwitch 是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。
     */
    public Boolean getWaitSwitch() {
        return this.WaitSwitch;
    }

    /**
     * Set 是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。
     * @param WaitSwitch 是否时间窗内切换。默认为 False，即不在时间窗内切换。注意，如果设置了 ForceSwitch 参数为 True，则该参数不生效。
     */
    public void setWaitSwitch(Boolean WaitSwitch) {
        this.WaitSwitch = WaitSwitch;
    }

    public SwitchDBInstanceMasterSlaveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SwitchDBInstanceMasterSlaveRequest(SwitchDBInstanceMasterSlaveRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.DstSlave != null) {
            this.DstSlave = new String(source.DstSlave);
        }
        if (source.ForceSwitch != null) {
            this.ForceSwitch = new Boolean(source.ForceSwitch);
        }
        if (source.WaitSwitch != null) {
            this.WaitSwitch = new Boolean(source.WaitSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DstSlave", this.DstSlave);
        this.setParamSimple(map, prefix + "ForceSwitch", this.ForceSwitch);
        this.setParamSimple(map, prefix + "WaitSwitch", this.WaitSwitch);

    }
}

