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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RenewInstanceRequest extends AbstractModel{

    /**
    * 购买时长，单位：月。
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 实例 ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 标识是否修改计费模式。<ul><li>当前实例计费模式为按量计费方式，预转换为包年包月而续费，请指定该参数为 <b>prepaid</b>。</li><li>当前实例计费模式为包年包月方式，可不设置该参数。</li></ul>
    */
    @SerializedName("ModifyPayMode")
    @Expose
    private String ModifyPayMode;

    /**
     * Get 购买时长，单位：月。 
     * @return Period 购买时长，单位：月。
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 购买时长，单位：月。
     * @param Period 购买时长，单位：月。
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

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
     * Get 标识是否修改计费模式。<ul><li>当前实例计费模式为按量计费方式，预转换为包年包月而续费，请指定该参数为 <b>prepaid</b>。</li><li>当前实例计费模式为包年包月方式，可不设置该参数。</li></ul> 
     * @return ModifyPayMode 标识是否修改计费模式。<ul><li>当前实例计费模式为按量计费方式，预转换为包年包月而续费，请指定该参数为 <b>prepaid</b>。</li><li>当前实例计费模式为包年包月方式，可不设置该参数。</li></ul>
     */
    public String getModifyPayMode() {
        return this.ModifyPayMode;
    }

    /**
     * Set 标识是否修改计费模式。<ul><li>当前实例计费模式为按量计费方式，预转换为包年包月而续费，请指定该参数为 <b>prepaid</b>。</li><li>当前实例计费模式为包年包月方式，可不设置该参数。</li></ul>
     * @param ModifyPayMode 标识是否修改计费模式。<ul><li>当前实例计费模式为按量计费方式，预转换为包年包月而续费，请指定该参数为 <b>prepaid</b>。</li><li>当前实例计费模式为包年包月方式，可不设置该参数。</li></ul>
     */
    public void setModifyPayMode(String ModifyPayMode) {
        this.ModifyPayMode = ModifyPayMode;
    }

    public RenewInstanceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RenewInstanceRequest(RenewInstanceRequest source) {
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ModifyPayMode != null) {
            this.ModifyPayMode = new String(source.ModifyPayMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "ModifyPayMode", this.ModifyPayMode);

    }
}

