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
package com.tencentcloudapi.goosefs.v20220519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChargeAttribute extends AbstractModel {

    /**
    * 到期时间
    */
    @SerializedName("CurDeadline")
    @Expose
    private String CurDeadline;

    /**
    * 付费方式
    */
    @SerializedName("PayMode")
    @Expose
    private String PayMode;

    /**
    * 自动付费标识：0:默认未设置 1:自动续费 2 不自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 资源ID
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
     * Get 到期时间 
     * @return CurDeadline 到期时间
     */
    public String getCurDeadline() {
        return this.CurDeadline;
    }

    /**
     * Set 到期时间
     * @param CurDeadline 到期时间
     */
    public void setCurDeadline(String CurDeadline) {
        this.CurDeadline = CurDeadline;
    }

    /**
     * Get 付费方式 
     * @return PayMode 付费方式
     */
    public String getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费方式
     * @param PayMode 付费方式
     */
    public void setPayMode(String PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 自动付费标识：0:默认未设置 1:自动续费 2 不自动续费 
     * @return AutoRenewFlag 自动付费标识：0:默认未设置 1:自动续费 2 不自动续费
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 自动付费标识：0:默认未设置 1:自动续费 2 不自动续费
     * @param AutoRenewFlag 自动付费标识：0:默认未设置 1:自动续费 2 不自动续费
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 资源ID 
     * @return ResourceId 资源ID
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set 资源ID
     * @param ResourceId 资源ID
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    public ChargeAttribute() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChargeAttribute(ChargeAttribute source) {
        if (source.CurDeadline != null) {
            this.CurDeadline = new String(source.CurDeadline);
        }
        if (source.PayMode != null) {
            this.PayMode = new String(source.PayMode);
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CurDeadline", this.CurDeadline);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);

    }
}

