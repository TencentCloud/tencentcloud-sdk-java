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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRegisterCodeRequest extends AbstractModel{

    /**
    * 注册码描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 注册实列名称前缀。
    */
    @SerializedName("InstanceNamePrefix")
    @Expose
    private String InstanceNamePrefix;

    /**
    * 该注册码允许注册的实列数目。默认限制为10个。
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * 该注册码的有效时间，单位为小时。默认为4小时。
    */
    @SerializedName("EffectiveTime")
    @Expose
    private Long EffectiveTime;

    /**
    * 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。默认不做限制。
    */
    @SerializedName("IpAddressRange")
    @Expose
    private String IpAddressRange;

    /**
     * Get 注册码描述。 
     * @return Description 注册码描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 注册码描述。
     * @param Description 注册码描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 注册实列名称前缀。 
     * @return InstanceNamePrefix 注册实列名称前缀。
     */
    public String getInstanceNamePrefix() {
        return this.InstanceNamePrefix;
    }

    /**
     * Set 注册实列名称前缀。
     * @param InstanceNamePrefix 注册实列名称前缀。
     */
    public void setInstanceNamePrefix(String InstanceNamePrefix) {
        this.InstanceNamePrefix = InstanceNamePrefix;
    }

    /**
     * Get 该注册码允许注册的实列数目。默认限制为10个。 
     * @return RegisterLimit 该注册码允许注册的实列数目。默认限制为10个。
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set 该注册码允许注册的实列数目。默认限制为10个。
     * @param RegisterLimit 该注册码允许注册的实列数目。默认限制为10个。
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
    }

    /**
     * Get 该注册码的有效时间，单位为小时。默认为4小时。 
     * @return EffectiveTime 该注册码的有效时间，单位为小时。默认为4小时。
     */
    public Long getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 该注册码的有效时间，单位为小时。默认为4小时。
     * @param EffectiveTime 该注册码的有效时间，单位为小时。默认为4小时。
     */
    public void setEffectiveTime(Long EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。默认不做限制。 
     * @return IpAddressRange 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。默认不做限制。
     */
    public String getIpAddressRange() {
        return this.IpAddressRange;
    }

    /**
     * Set 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。默认不做限制。
     * @param IpAddressRange 该注册码限制tat_agent只能从IpAddressRange所描述公网出口进行注册。默认不做限制。
     */
    public void setIpAddressRange(String IpAddressRange) {
        this.IpAddressRange = IpAddressRange;
    }

    public CreateRegisterCodeRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateRegisterCodeRequest(CreateRegisterCodeRequest source) {
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.InstanceNamePrefix != null) {
            this.InstanceNamePrefix = new String(source.InstanceNamePrefix);
        }
        if (source.RegisterLimit != null) {
            this.RegisterLimit = new Long(source.RegisterLimit);
        }
        if (source.EffectiveTime != null) {
            this.EffectiveTime = new Long(source.EffectiveTime);
        }
        if (source.IpAddressRange != null) {
            this.IpAddressRange = new String(source.IpAddressRange);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "InstanceNamePrefix", this.InstanceNamePrefix);
        this.setParamSimple(map, prefix + "RegisterLimit", this.RegisterLimit);
        this.setParamSimple(map, prefix + "EffectiveTime", this.EffectiveTime);
        this.setParamSimple(map, prefix + "IpAddressRange", this.IpAddressRange);

    }
}

