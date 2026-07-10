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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAlarmSmsQuotaQuota extends AbstractModel {

    /**
    * <p>配额类型</p>
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * <p>配额名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>免费配额剩余量</p>
    */
    @SerializedName("FreeLeft")
    @Expose
    private Long FreeLeft;

    /**
    * <p>付费配额剩余量</p>
    */
    @SerializedName("PurchaseLeft")
    @Expose
    private Long PurchaseLeft;

    /**
    * <p>已使用量</p>
    */
    @SerializedName("Used")
    @Expose
    private Long Used;

    /**
     * Get <p>配额类型</p> 
     * @return Type <p>配额类型</p>
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set <p>配额类型</p>
     * @param Type <p>配额类型</p>
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get <p>配额名称</p> 
     * @return Name <p>配额名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>配额名称</p>
     * @param Name <p>配额名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>免费配额剩余量</p> 
     * @return FreeLeft <p>免费配额剩余量</p>
     */
    public Long getFreeLeft() {
        return this.FreeLeft;
    }

    /**
     * Set <p>免费配额剩余量</p>
     * @param FreeLeft <p>免费配额剩余量</p>
     */
    public void setFreeLeft(Long FreeLeft) {
        this.FreeLeft = FreeLeft;
    }

    /**
     * Get <p>付费配额剩余量</p> 
     * @return PurchaseLeft <p>付费配额剩余量</p>
     */
    public Long getPurchaseLeft() {
        return this.PurchaseLeft;
    }

    /**
     * Set <p>付费配额剩余量</p>
     * @param PurchaseLeft <p>付费配额剩余量</p>
     */
    public void setPurchaseLeft(Long PurchaseLeft) {
        this.PurchaseLeft = PurchaseLeft;
    }

    /**
     * Get <p>已使用量</p> 
     * @return Used <p>已使用量</p>
     */
    public Long getUsed() {
        return this.Used;
    }

    /**
     * Set <p>已使用量</p>
     * @param Used <p>已使用量</p>
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

