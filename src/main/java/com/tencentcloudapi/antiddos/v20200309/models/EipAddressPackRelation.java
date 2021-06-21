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
package com.tencentcloudapi.antiddos.v20200309.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EipAddressPackRelation extends AbstractModel{

    /**
    * 套餐IP数量
    */
    @SerializedName("IpCount")
    @Expose
    private Long IpCount;

    /**
    * 自动续费标记
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 当前到期时间
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
     * Get 套餐IP数量 
     * @return IpCount 套餐IP数量
     */
    public Long getIpCount() {
        return this.IpCount;
    }

    /**
     * Set 套餐IP数量
     * @param IpCount 套餐IP数量
     */
    public void setIpCount(Long IpCount) {
        this.IpCount = IpCount;
    }

    /**
     * Get 自动续费标记 
     * @return AutoRenewFlag 自动续费标记
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动续费标记
     * @param AutoRenewFlag 自动续费标记
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 当前到期时间 
     * @return CurDeadline 当前到期时间
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set 当前到期时间
     * @param CurDeadline 当前到期时间
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    public EipAddressPackRelation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EipAddressPackRelation(EipAddressPackRelation source) {
        if (source.IpCount != null) {
            this.IpCount = new Long(source.IpCount);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "IpCount", this.IpCount);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);

    }
}

