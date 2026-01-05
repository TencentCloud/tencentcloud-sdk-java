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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAutoOpenProVersionConfigRequest extends AbstractModel {

    /**
    * 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 加固防护模式
PROVERSION_POSTPAY 专业版-按量计费
PROVERSION_PREPAY 专业版-包年包月
FLAGSHIP_PREPAY 旗舰版-包年包月
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * 自动加购/扩容授权开关,默认 1, 0关闭, 1开启
    */
    @SerializedName("AutoRepurchaseSwitch")
    @Expose
    private Long AutoRepurchaseSwitch;

    /**
    * 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启
    */
    @SerializedName("AutoRepurchaseRenewSwitch")
    @Expose
    private Long AutoRepurchaseRenewSwitch;

    /**
    * 手动购买的订单是否自动续费,默认0, 0关闭 ,1 开启
    */
    @SerializedName("RepurchaseRenewSwitch")
    @Expose
    private Long RepurchaseRenewSwitch;

    /**
    * 新增机器自动绑定rasp,0 关闭 1开启
    */
    @SerializedName("AutoBindRaspSwitch")
    @Expose
    private Long AutoBindRaspSwitch;

    /**
    * 新增机器自动开启rasp防护,默认关闭,0 关闭 1开启
    */
    @SerializedName("AutoOpenRaspSwitch")
    @Expose
    private Long AutoOpenRaspSwitch;

    /**
    * 自动缩容开关,0 关闭 1开启
    */
    @SerializedName("AutoDowngradeSwitch")
    @Expose
    private Long AutoDowngradeSwitch;

    /**
     * Get 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li> 
     * @return Status 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     * @param Status 设置自动开通状态。
<li>CLOSE：关闭</li>
<li>OPEN：打开</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 加固防护模式
PROVERSION_POSTPAY 专业版-按量计费
PROVERSION_PREPAY 专业版-包年包月
FLAGSHIP_PREPAY 旗舰版-包年包月 
     * @return ProtectType 加固防护模式
PROVERSION_POSTPAY 专业版-按量计费
PROVERSION_PREPAY 专业版-包年包月
FLAGSHIP_PREPAY 旗舰版-包年包月
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set 加固防护模式
PROVERSION_POSTPAY 专业版-按量计费
PROVERSION_PREPAY 专业版-包年包月
FLAGSHIP_PREPAY 旗舰版-包年包月
     * @param ProtectType 加固防护模式
PROVERSION_POSTPAY 专业版-按量计费
PROVERSION_PREPAY 专业版-包年包月
FLAGSHIP_PREPAY 旗舰版-包年包月
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get 自动加购/扩容授权开关,默认 1, 0关闭, 1开启 
     * @return AutoRepurchaseSwitch 自动加购/扩容授权开关,默认 1, 0关闭, 1开启
     */
    public Long getAutoRepurchaseSwitch() {
        return this.AutoRepurchaseSwitch;
    }

    /**
     * Set 自动加购/扩容授权开关,默认 1, 0关闭, 1开启
     * @param AutoRepurchaseSwitch 自动加购/扩容授权开关,默认 1, 0关闭, 1开启
     */
    public void setAutoRepurchaseSwitch(Long AutoRepurchaseSwitch) {
        this.AutoRepurchaseSwitch = AutoRepurchaseSwitch;
    }

    /**
     * Get 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启 
     * @return AutoRepurchaseRenewSwitch 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启
     */
    public Long getAutoRepurchaseRenewSwitch() {
        return this.AutoRepurchaseRenewSwitch;
    }

    /**
     * Set 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启
     * @param AutoRepurchaseRenewSwitch 自动加购的订单是否自动续费,默认0 ,0关闭, 1开启
     */
    public void setAutoRepurchaseRenewSwitch(Long AutoRepurchaseRenewSwitch) {
        this.AutoRepurchaseRenewSwitch = AutoRepurchaseRenewSwitch;
    }

    /**
     * Get 手动购买的订单是否自动续费,默认0, 0关闭 ,1 开启 
     * @return RepurchaseRenewSwitch 手动购买的订单是否自动续费,默认0, 0关闭 ,1 开启
     */
    public Long getRepurchaseRenewSwitch() {
        return this.RepurchaseRenewSwitch;
    }

    /**
     * Set 手动购买的订单是否自动续费,默认0, 0关闭 ,1 开启
     * @param RepurchaseRenewSwitch 手动购买的订单是否自动续费,默认0, 0关闭 ,1 开启
     */
    public void setRepurchaseRenewSwitch(Long RepurchaseRenewSwitch) {
        this.RepurchaseRenewSwitch = RepurchaseRenewSwitch;
    }

    /**
     * Get 新增机器自动绑定rasp,0 关闭 1开启 
     * @return AutoBindRaspSwitch 新增机器自动绑定rasp,0 关闭 1开启
     */
    public Long getAutoBindRaspSwitch() {
        return this.AutoBindRaspSwitch;
    }

    /**
     * Set 新增机器自动绑定rasp,0 关闭 1开启
     * @param AutoBindRaspSwitch 新增机器自动绑定rasp,0 关闭 1开启
     */
    public void setAutoBindRaspSwitch(Long AutoBindRaspSwitch) {
        this.AutoBindRaspSwitch = AutoBindRaspSwitch;
    }

    /**
     * Get 新增机器自动开启rasp防护,默认关闭,0 关闭 1开启 
     * @return AutoOpenRaspSwitch 新增机器自动开启rasp防护,默认关闭,0 关闭 1开启
     */
    public Long getAutoOpenRaspSwitch() {
        return this.AutoOpenRaspSwitch;
    }

    /**
     * Set 新增机器自动开启rasp防护,默认关闭,0 关闭 1开启
     * @param AutoOpenRaspSwitch 新增机器自动开启rasp防护,默认关闭,0 关闭 1开启
     */
    public void setAutoOpenRaspSwitch(Long AutoOpenRaspSwitch) {
        this.AutoOpenRaspSwitch = AutoOpenRaspSwitch;
    }

    /**
     * Get 自动缩容开关,0 关闭 1开启 
     * @return AutoDowngradeSwitch 自动缩容开关,0 关闭 1开启
     */
    public Long getAutoDowngradeSwitch() {
        return this.AutoDowngradeSwitch;
    }

    /**
     * Set 自动缩容开关,0 关闭 1开启
     * @param AutoDowngradeSwitch 自动缩容开关,0 关闭 1开启
     */
    public void setAutoDowngradeSwitch(Long AutoDowngradeSwitch) {
        this.AutoDowngradeSwitch = AutoDowngradeSwitch;
    }

    public ModifyAutoOpenProVersionConfigRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAutoOpenProVersionConfigRequest(ModifyAutoOpenProVersionConfigRequest source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.AutoRepurchaseSwitch != null) {
            this.AutoRepurchaseSwitch = new Long(source.AutoRepurchaseSwitch);
        }
        if (source.AutoRepurchaseRenewSwitch != null) {
            this.AutoRepurchaseRenewSwitch = new Long(source.AutoRepurchaseRenewSwitch);
        }
        if (source.RepurchaseRenewSwitch != null) {
            this.RepurchaseRenewSwitch = new Long(source.RepurchaseRenewSwitch);
        }
        if (source.AutoBindRaspSwitch != null) {
            this.AutoBindRaspSwitch = new Long(source.AutoBindRaspSwitch);
        }
        if (source.AutoOpenRaspSwitch != null) {
            this.AutoOpenRaspSwitch = new Long(source.AutoOpenRaspSwitch);
        }
        if (source.AutoDowngradeSwitch != null) {
            this.AutoDowngradeSwitch = new Long(source.AutoDowngradeSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "AutoRepurchaseSwitch", this.AutoRepurchaseSwitch);
        this.setParamSimple(map, prefix + "AutoRepurchaseRenewSwitch", this.AutoRepurchaseRenewSwitch);
        this.setParamSimple(map, prefix + "RepurchaseRenewSwitch", this.RepurchaseRenewSwitch);
        this.setParamSimple(map, prefix + "AutoBindRaspSwitch", this.AutoBindRaspSwitch);
        this.setParamSimple(map, prefix + "AutoOpenRaspSwitch", this.AutoOpenRaspSwitch);
        this.setParamSimple(map, prefix + "AutoDowngradeSwitch", this.AutoDowngradeSwitch);

    }
}

