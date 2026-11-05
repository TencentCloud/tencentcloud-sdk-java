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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostAutoScaleConfig extends AbstractModel {

    /**
    * <p>主机自动扩容开关<br>枚举值：<br>ON：开启<br>OFF：关闭<br>补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch</p>
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * <p>扩容版本<br>枚举值：<br>PRO：专业版<br>ULTIMATE：旗舰版<br>补充说明：不传则不修改</p>
    */
    @SerializedName("ProtectType")
    @Expose
    private String ProtectType;

    /**
    * <p>扩容资产范围</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>BY_TAG： 按标签扩容</li></ul>
    */
    @SerializedName("AssetRange")
    @Expose
    private String AssetRange;

    /**
    * <p>标签ID列表</p>
    */
    @SerializedName("TagIds")
    @Expose
    private Long [] TagIds;

    /**
     * Get <p>主机自动扩容开关<br>枚举值：<br>ON：开启<br>OFF：关闭<br>补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch</p> 
     * @return Switch <p>主机自动扩容开关<br>枚举值：<br>ON：开启<br>OFF：关闭<br>补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch</p>
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set <p>主机自动扩容开关<br>枚举值：<br>ON：开启<br>OFF：关闭<br>补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch</p>
     * @param Switch <p>主机自动扩容开关<br>枚举值：<br>ON：开启<br>OFF：关闭<br>补充说明：不传则不修改；映射底层自动加购开关 auto_repurchase_switch</p>
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get <p>扩容版本<br>枚举值：<br>PRO：专业版<br>ULTIMATE：旗舰版<br>补充说明：不传则不修改</p> 
     * @return ProtectType <p>扩容版本<br>枚举值：<br>PRO：专业版<br>ULTIMATE：旗舰版<br>补充说明：不传则不修改</p>
     */
    public String getProtectType() {
        return this.ProtectType;
    }

    /**
     * Set <p>扩容版本<br>枚举值：<br>PRO：专业版<br>ULTIMATE：旗舰版<br>补充说明：不传则不修改</p>
     * @param ProtectType <p>扩容版本<br>枚举值：<br>PRO：专业版<br>ULTIMATE：旗舰版<br>补充说明：不传则不修改</p>
     */
    public void setProtectType(String ProtectType) {
        this.ProtectType = ProtectType;
    }

    /**
     * Get <p>扩容资产范围</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>BY_TAG： 按标签扩容</li></ul> 
     * @return AssetRange <p>扩容资产范围</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>BY_TAG： 按标签扩容</li></ul>
     */
    public String getAssetRange() {
        return this.AssetRange;
    }

    /**
     * Set <p>扩容资产范围</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>BY_TAG： 按标签扩容</li></ul>
     * @param AssetRange <p>扩容资产范围</p><p>枚举值：</p><ul><li>ALL： 全部资产</li><li>BY_TAG： 按标签扩容</li></ul>
     */
    public void setAssetRange(String AssetRange) {
        this.AssetRange = AssetRange;
    }

    /**
     * Get <p>标签ID列表</p> 
     * @return TagIds <p>标签ID列表</p>
     */
    public Long [] getTagIds() {
        return this.TagIds;
    }

    /**
     * Set <p>标签ID列表</p>
     * @param TagIds <p>标签ID列表</p>
     */
    public void setTagIds(Long [] TagIds) {
        this.TagIds = TagIds;
    }

    public HostAutoScaleConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public HostAutoScaleConfig(HostAutoScaleConfig source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.ProtectType != null) {
            this.ProtectType = new String(source.ProtectType);
        }
        if (source.AssetRange != null) {
            this.AssetRange = new String(source.AssetRange);
        }
        if (source.TagIds != null) {
            this.TagIds = new Long[source.TagIds.length];
            for (int i = 0; i < source.TagIds.length; i++) {
                this.TagIds[i] = new Long(source.TagIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "ProtectType", this.ProtectType);
        this.setParamSimple(map, prefix + "AssetRange", this.AssetRange);
        this.setParamArraySimple(map, prefix + "TagIds.", this.TagIds);

    }
}

