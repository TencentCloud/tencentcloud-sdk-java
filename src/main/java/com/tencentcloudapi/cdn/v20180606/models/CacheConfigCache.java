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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CacheConfigCache extends AbstractModel{

    /**
    * 缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Switch")
    @Expose
    private String Switch;

    /**
    * 缓存过期时间设置
单位为秒，最大可设置为 365 天
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CacheTime")
    @Expose
    private Long CacheTime;

    /**
    * 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CompareMaxAge")
    @Expose
    private String CompareMaxAge;

    /**
    * 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreCacheControl")
    @Expose
    private String IgnoreCacheControl;

    /**
    * 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IgnoreSetCookie")
    @Expose
    private String IgnoreSetCookie;

    /**
     * Get 缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Switch 缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSwitch() {
        return this.Switch;
    }

    /**
     * Set 缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     * @param Switch 缓存配置开关
on：开启
off：关闭
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSwitch(String Switch) {
        this.Switch = Switch;
    }

    /**
     * Get 缓存过期时间设置
单位为秒，最大可设置为 365 天
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CacheTime 缓存过期时间设置
单位为秒，最大可设置为 365 天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCacheTime() {
        return this.CacheTime;
    }

    /**
     * Set 缓存过期时间设置
单位为秒，最大可设置为 365 天
注意：此字段可能返回 null，表示取不到有效值。
     * @param CacheTime 缓存过期时间设置
单位为秒，最大可设置为 365 天
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCacheTime(Long CacheTime) {
        this.CacheTime = CacheTime;
    }

    /**
     * Get 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CompareMaxAge 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCompareMaxAge() {
        return this.CompareMaxAge;
    }

    /**
     * Set 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param CompareMaxAge 高级缓存过期配置，开启时会对比源站返回的 max-age 值与 CacheRules 中设置的缓存过期时间，取最小值在节点进行缓存
on：开启
off：关闭
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCompareMaxAge(String CompareMaxAge) {
        this.CompareMaxAge = CompareMaxAge;
    }

    /**
     * Get 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreCacheControl 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreCacheControl() {
        return this.IgnoreCacheControl;
    }

    /**
     * Set 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreCacheControl 强制缓存
on：开启
off：关闭
默认为关闭状态，开启后，源站返回的 no-store、no-cache 资源，也将按照 CacheRules 规则进行缓存
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreCacheControl(String IgnoreCacheControl) {
        this.IgnoreCacheControl = IgnoreCacheControl;
    }

    /**
     * Get 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IgnoreSetCookie 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIgnoreSetCookie() {
        return this.IgnoreSetCookie;
    }

    /**
     * Set 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param IgnoreSetCookie 当源站返回Set-Cookie头部时，节点是否缓存该头部及body
on：开启，不缓存该头部及body
off：关闭，遵循用户自定义的节点缓存规则
默认为关闭状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIgnoreSetCookie(String IgnoreSetCookie) {
        this.IgnoreSetCookie = IgnoreSetCookie;
    }

    public CacheConfigCache() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CacheConfigCache(CacheConfigCache source) {
        if (source.Switch != null) {
            this.Switch = new String(source.Switch);
        }
        if (source.CacheTime != null) {
            this.CacheTime = new Long(source.CacheTime);
        }
        if (source.CompareMaxAge != null) {
            this.CompareMaxAge = new String(source.CompareMaxAge);
        }
        if (source.IgnoreCacheControl != null) {
            this.IgnoreCacheControl = new String(source.IgnoreCacheControl);
        }
        if (source.IgnoreSetCookie != null) {
            this.IgnoreSetCookie = new String(source.IgnoreSetCookie);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Switch", this.Switch);
        this.setParamSimple(map, prefix + "CacheTime", this.CacheTime);
        this.setParamSimple(map, prefix + "CompareMaxAge", this.CompareMaxAge);
        this.setParamSimple(map, prefix + "IgnoreCacheControl", this.IgnoreCacheControl);
        this.setParamSimple(map, prefix + "IgnoreSetCookie", this.IgnoreSetCookie);

    }
}

