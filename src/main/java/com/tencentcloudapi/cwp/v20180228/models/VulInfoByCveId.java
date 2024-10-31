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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VulInfoByCveId extends AbstractModel {

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private Long VulId;

    /**
    * 修复支持情况：0-Windows/Linux均不支持修复 ;1-Windows/Linux 均支持修复 ;2-仅Linux支持修复;3-仅Windows支持修复
    */
    @SerializedName("FixSwitch")
    @Expose
    private Long FixSwitch;

    /**
     * Get 漏洞id 
     * @return VulId 漏洞id
     */
    public Long getVulId() {
        return this.VulId;
    }

    /**
     * Set 漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(Long VulId) {
        this.VulId = VulId;
    }

    /**
     * Get 修复支持情况：0-Windows/Linux均不支持修复 ;1-Windows/Linux 均支持修复 ;2-仅Linux支持修复;3-仅Windows支持修复 
     * @return FixSwitch 修复支持情况：0-Windows/Linux均不支持修复 ;1-Windows/Linux 均支持修复 ;2-仅Linux支持修复;3-仅Windows支持修复
     */
    public Long getFixSwitch() {
        return this.FixSwitch;
    }

    /**
     * Set 修复支持情况：0-Windows/Linux均不支持修复 ;1-Windows/Linux 均支持修复 ;2-仅Linux支持修复;3-仅Windows支持修复
     * @param FixSwitch 修复支持情况：0-Windows/Linux均不支持修复 ;1-Windows/Linux 均支持修复 ;2-仅Linux支持修复;3-仅Windows支持修复
     */
    public void setFixSwitch(Long FixSwitch) {
        this.FixSwitch = FixSwitch;
    }

    public VulInfoByCveId() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VulInfoByCveId(VulInfoByCveId source) {
        if (source.VulId != null) {
            this.VulId = new Long(source.VulId);
        }
        if (source.FixSwitch != null) {
            this.FixSwitch = new Long(source.FixSwitch);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "FixSwitch", this.FixSwitch);

    }
}

