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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmSmsQuotaQuota extends AbstractModel {

    /**
    * 配额类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 配额名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 免费配额剩余量
    */
    @SerializedName("FreeLeft")
    @Expose
    private Long FreeLeft;

    /**
    * 付费配额剩余量
    */
    @SerializedName("PurchaseLeft")
    @Expose
    private Long PurchaseLeft;

    /**
    * 已使用量
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get 配额类型 
     * @return Type 配额类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 配额类型
     * @param Type 配额类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 配额名称 
     * @return Name 配额名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 配额名称
     * @param Name 配额名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 免费配额剩余量 
     * @return FreeLeft 免费配额剩余量
     */
    public Long getFreeLeft() {
        return this.FreeLeft;
    }

    /**
     * Set 免费配额剩余量
     * @param FreeLeft 免费配额剩余量
     */
    public void setFreeLeft(Long FreeLeft) {
        this.FreeLeft = FreeLeft;
    }

    /**
     * Get 付费配额剩余量 
     * @return PurchaseLeft 付费配额剩余量
     */
    public Long getPurchaseLeft() {
        return this.PurchaseLeft;
    }

    /**
     * Set 付费配额剩余量
     * @param PurchaseLeft 付费配额剩余量
     */
    public void setPurchaseLeft(Long PurchaseLeft) {
        this.PurchaseLeft = PurchaseLeft;
    }

    /**
     * Get 已使用量 
     * @return Used 已使用量
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set 已使用量
     * @param Used 已使用量
     */
    public void setUsed(Long Used) {
        this.Used = Used;
    }

    public DescribeAlarmSmsQuotaQuota() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAlarmSmsQuotaQuota(DescribeAlarmSmsQuotaQuota source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.FreeLeft != null) {
            this.FreeLeft = new Long(source.FreeLeft);
        }
        if (source.PurchaseLeft != null) {
            this.PurchaseLeft = new Long(source.PurchaseLeft);
        }
        if (source.Used != null) {
            this.Used = new Long(source.Used);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "FreeLeft", this.FreeLeft);
        this.setParamSimple(map, prefix + "PurchaseLeft", this.PurchaseLeft);
        this.setParamSimple(map, prefix + "Used", this.Used);

    }
}

