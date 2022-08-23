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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Resource extends AbstractModel{

    /**
    * 资源 ID。
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 付费模式，取值有：
<li>0：后付费。</li>
    */
    @SerializedName("PayMode")
    @Expose
    private Long PayMode;

    /**
    * 创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 生效时间。
    */
    @SerializedName("EnableTime")
    @Expose
    private String EnableTime;

    /**
    * 失效时间。
    */
    @SerializedName("ExpireTime")
    @Expose
    private String ExpireTime;

    /**
    * 套餐状态，取值有：
<li>normal：正常；</li>
<li>isolated：隔离；</li>
<li>destroyed：销毁。</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 询价参数。
    */
    @SerializedName("Sv")
    @Expose
    private Sv [] Sv;

    /**
    * 是否自动续费，取值有：
<li>0：默认状态；</li>
<li>1：自动续费；</li>
<li>2：不自动续费。</li>
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Long AutoRenewFlag;

    /**
    * 套餐关联资源 ID。
    */
    @SerializedName("PlanId")
    @Expose
    private String PlanId;

    /**
    * 地域，取值有：
<li>mainland：国内；</li>
<li>overseas：海外。</li>
    */
    @SerializedName("Area")
    @Expose
    private String Area;

    /**
     * Get 资源 ID。 
     * @return Id 资源 ID。
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 资源 ID。
     * @param Id 资源 ID。
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * Get 付费模式，取值有：
<li>0：后付费。</li> 
     * @return PayMode 付费模式，取值有：
<li>0：后付费。</li>
     */
    public Long getPayMode() {
        return this.PayMode;
    }

    /**
     * Set 付费模式，取值有：
<li>0：后付费。</li>
     * @param PayMode 付费模式，取值有：
<li>0：后付费。</li>
     */
    public void setPayMode(Long PayMode) {
        this.PayMode = PayMode;
    }

    /**
     * Get 创建时间。 
     * @return CreateTime 创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 创建时间。
     * @param CreateTime 创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 生效时间。 
     * @return EnableTime 生效时间。
     */
    public String getEnableTime() {
        return this.EnableTime;
    }

    /**
     * Set 生效时间。
     * @param EnableTime 生效时间。
     */
    public void setEnableTime(String EnableTime) {
        this.EnableTime = EnableTime;
    }

    /**
     * Get 失效时间。 
     * @return ExpireTime 失效时间。
     */
    public String getExpireTime() {
        return this.ExpireTime;
    }

    /**
     * Set 失效时间。
     * @param ExpireTime 失效时间。
     */
    public void setExpireTime(String ExpireTime) {
        this.ExpireTime = ExpireTime;
    }

    /**
     * Get 套餐状态，取值有：
<li>normal：正常；</li>
<li>isolated：隔离；</li>
<li>destroyed：销毁。</li> 
     * @return Status 套餐状态，取值有：
<li>normal：正常；</li>
<li>isolated：隔离；</li>
<li>destroyed：销毁。</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 套餐状态，取值有：
<li>normal：正常；</li>
<li>isolated：隔离；</li>
<li>destroyed：销毁。</li>
     * @param Status 套餐状态，取值有：
<li>normal：正常；</li>
<li>isolated：隔离；</li>
<li>destroyed：销毁。</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 询价参数。 
     * @return Sv 询价参数。
     */
    public Sv [] getSv() {
        return this.Sv;
    }

    /**
     * Set 询价参数。
     * @param Sv 询价参数。
     */
    public void setSv(Sv [] Sv) {
        this.Sv = Sv;
    }

    /**
     * Get 是否自动续费，取值有：
<li>0：默认状态；</li>
<li>1：自动续费；</li>
<li>2：不自动续费。</li> 
     * @return AutoRenewFlag 是否自动续费，取值有：
<li>0：默认状态；</li>
<li>1：自动续费；</li>
<li>2：不自动续费。</li>
     */
    public Long getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * Set 是否自动续费，取值有：
<li>0：默认状态；</li>
<li>1：自动续费；</li>
<li>2：不自动续费。</li>
     * @param AutoRenewFlag 是否自动续费，取值有：
<li>0：默认状态；</li>
<li>1：自动续费；</li>
<li>2：不自动续费。</li>
     */
    public void setAutoRenewFlag(Long AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * Get 套餐关联资源 ID。 
     * @return PlanId 套餐关联资源 ID。
     */
    public String getPlanId() {
        return this.PlanId;
    }

    /**
     * Set 套餐关联资源 ID。
     * @param PlanId 套餐关联资源 ID。
     */
    public void setPlanId(String PlanId) {
        this.PlanId = PlanId;
    }

    /**
     * Get 地域，取值有：
<li>mainland：国内；</li>
<li>overseas：海外。</li> 
     * @return Area 地域，取值有：
<li>mainland：国内；</li>
<li>overseas：海外。</li>
     */
    public String getArea() {
        return this.Area;
    }

    /**
     * Set 地域，取值有：
<li>mainland：国内；</li>
<li>overseas：海外。</li>
     * @param Area 地域，取值有：
<li>mainland：国内；</li>
<li>overseas：海外。</li>
     */
    public void setArea(String Area) {
        this.Area = Area;
    }

    public Resource() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Resource(Resource source) {
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
        if (source.PayMode != null) {
            this.PayMode = new Long(source.PayMode);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.EnableTime != null) {
            this.EnableTime = new String(source.EnableTime);
        }
        if (source.ExpireTime != null) {
            this.ExpireTime = new String(source.ExpireTime);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Sv != null) {
            this.Sv = new Sv[source.Sv.length];
            for (int i = 0; i < source.Sv.length; i++) {
                this.Sv[i] = new Sv(source.Sv[i]);
            }
        }
        if (source.AutoRenewFlag != null) {
            this.AutoRenewFlag = new Long(source.AutoRenewFlag);
        }
        if (source.PlanId != null) {
            this.PlanId = new String(source.PlanId);
        }
        if (source.Area != null) {
            this.Area = new String(source.Area);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "PayMode", this.PayMode);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "EnableTime", this.EnableTime);
        this.setParamSimple(map, prefix + "ExpireTime", this.ExpireTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Sv.", this.Sv);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "PlanId", this.PlanId);
        this.setParamSimple(map, prefix + "Area", this.Area);

    }
}

