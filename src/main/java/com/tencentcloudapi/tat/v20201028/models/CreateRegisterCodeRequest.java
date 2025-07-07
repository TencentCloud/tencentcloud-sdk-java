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
package com.tencentcloudapi.tat.v20201028.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateRegisterCodeRequest extends AbstractModel {

    /**
    * 注册码描述。最大长度为 128 字符。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 注册实例名称前缀。最大长度为 32 字符。
    */
    @SerializedName("InstanceNamePrefix")
    @Expose
    private String InstanceNamePrefix;

    /**
    * 该注册码允许注册的实例数目。默认值为 10，最小值为 1，最大值为 10000。
    */
    @SerializedName("RegisterLimit")
    @Expose
    private Long RegisterLimit;

    /**
    * 该注册码的有效时间，单位为小时。默认值为 4。

- 若传入值小于等于 99999，则以小时为单位设置有效时间。
- 若传入值大于 99999，则设置为长期有效。
    */
    @SerializedName("EffectiveTime")
    @Expose
    private Long EffectiveTime;

    /**
    * 限制注册码只能从 IpAddressRange 所描述公网出口进行注册。

默认为空，即无任何限制。

取值应为标准 IPv4 或 CIDRv4 格式。例如 192.168.1.1 或 192.168.0.0/16。
    */
    @SerializedName("IpAddressRange")
    @Expose
    private String IpAddressRange;

    /**
     * Get 注册码描述。最大长度为 128 字符。 
     * @return Description 注册码描述。最大长度为 128 字符。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 注册码描述。最大长度为 128 字符。
     * @param Description 注册码描述。最大长度为 128 字符。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 注册实例名称前缀。最大长度为 32 字符。 
     * @return InstanceNamePrefix 注册实例名称前缀。最大长度为 32 字符。
     */
    public String getInstanceNamePrefix() {
        return this.InstanceNamePrefix;
    }

    /**
     * Set 注册实例名称前缀。最大长度为 32 字符。
     * @param InstanceNamePrefix 注册实例名称前缀。最大长度为 32 字符。
     */
    public void setInstanceNamePrefix(String InstanceNamePrefix) {
        this.InstanceNamePrefix = InstanceNamePrefix;
    }

    /**
     * Get 该注册码允许注册的实例数目。默认值为 10，最小值为 1，最大值为 10000。 
     * @return RegisterLimit 该注册码允许注册的实例数目。默认值为 10，最小值为 1，最大值为 10000。
     */
    public Long getRegisterLimit() {
        return this.RegisterLimit;
    }

    /**
     * Set 该注册码允许注册的实例数目。默认值为 10，最小值为 1，最大值为 10000。
     * @param RegisterLimit 该注册码允许注册的实例数目。默认值为 10，最小值为 1，最大值为 10000。
     */
    public void setRegisterLimit(Long RegisterLimit) {
        this.RegisterLimit = RegisterLimit;
    }

    /**
     * Get 该注册码的有效时间，单位为小时。默认值为 4。

- 若传入值小于等于 99999，则以小时为单位设置有效时间。
- 若传入值大于 99999，则设置为长期有效。 
     * @return EffectiveTime 该注册码的有效时间，单位为小时。默认值为 4。

- 若传入值小于等于 99999，则以小时为单位设置有效时间。
- 若传入值大于 99999，则设置为长期有效。
     */
    public Long getEffectiveTime() {
        return this.EffectiveTime;
    }

    /**
     * Set 该注册码的有效时间，单位为小时。默认值为 4。

- 若传入值小于等于 99999，则以小时为单位设置有效时间。
- 若传入值大于 99999，则设置为长期有效。
     * @param EffectiveTime 该注册码的有效时间，单位为小时。默认值为 4。

- 若传入值小于等于 99999，则以小时为单位设置有效时间。
- 若传入值大于 99999，则设置为长期有效。
     */
    public void setEffectiveTime(Long EffectiveTime) {
        this.EffectiveTime = EffectiveTime;
    }

    /**
     * Get 限制注册码只能从 IpAddressRange 所描述公网出口进行注册。

默认为空，即无任何限制。

取值应为标准 IPv4 或 CIDRv4 格式。例如 192.168.1.1 或 192.168.0.0/16。 
     * @return IpAddressRange 限制注册码只能从 IpAddressRange 所描述公网出口进行注册。

默认为空，即无任何限制。

取值应为标准 IPv4 或 CIDRv4 格式。例如 192.168.1.1 或 192.168.0.0/16。
     */
    public String getIpAddressRange() {
        return this.IpAddressRange;
    }

    /**
     * Set 限制注册码只能从 IpAddressRange 所描述公网出口进行注册。

默认为空，即无任何限制。

取值应为标准 IPv4 或 CIDRv4 格式。例如 192.168.1.1 或 192.168.0.0/16。
     * @param IpAddressRange 限制注册码只能从 IpAddressRange 所描述公网出口进行注册。

默认为空，即无任何限制。

取值应为标准 IPv4 或 CIDRv4 格式。例如 192.168.1.1 或 192.168.0.0/16。
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

