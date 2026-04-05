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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ComponentReference extends AbstractModel {

    /**
    * 引用的实例类型。取值有：
<li>edge-function：边缘函数。</li>
    */
    @SerializedName("ReferenceType")
    @Expose
    private String ReferenceType;

    /**
    * 引用的实例 ID。根据 ReferenceType 的取值不同，返回对应的实例 ID：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数 ID，格式形如：ef-2vc5oe9mzqhm。</li>

    */
    @SerializedName("ReferenceId")
    @Expose
    private String ReferenceId;

    /**
    * 引用的实例名称。根据 ReferenceType 的取值不同，返回对应的实例名称：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数名称。</li>

    */
    @SerializedName("ReferenceName")
    @Expose
    private String ReferenceName;

    /**
    * 站点 ID。引用该命名空间的实例所属的站点标识。
    */
    @SerializedName("ZoneId")
    @Expose
    private String ZoneId;

    /**
    * 站点名称。引用该命名空间的实例所属的站点名称。
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 引用该命名空间的实例所属站点的别名。若未设置站点别名，则返回空字符串。
    */
    @SerializedName("AliasZoneName")
    @Expose
    private String AliasZoneName;

    /**
     * Get 引用的实例类型。取值有：
<li>edge-function：边缘函数。</li> 
     * @return ReferenceType 引用的实例类型。取值有：
<li>edge-function：边缘函数。</li>
     */
    public String getReferenceType() {
        return this.ReferenceType;
    }

    /**
     * Set 引用的实例类型。取值有：
<li>edge-function：边缘函数。</li>
     * @param ReferenceType 引用的实例类型。取值有：
<li>edge-function：边缘函数。</li>
     */
    public void setReferenceType(String ReferenceType) {
        this.ReferenceType = ReferenceType;
    }

    /**
     * Get 引用的实例 ID。根据 ReferenceType 的取值不同，返回对应的实例 ID：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数 ID，格式形如：ef-2vc5oe9mzqhm。</li>
 
     * @return ReferenceId 引用的实例 ID。根据 ReferenceType 的取值不同，返回对应的实例 ID：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数 ID，格式形如：ef-2vc5oe9mzqhm。</li>

     */
    public String getReferenceId() {
        return this.ReferenceId;
    }

    /**
     * Set 引用的实例 ID。根据 ReferenceType 的取值不同，返回对应的实例 ID：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数 ID，格式形如：ef-2vc5oe9mzqhm。</li>

     * @param ReferenceId 引用的实例 ID。根据 ReferenceType 的取值不同，返回对应的实例 ID：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数 ID，格式形如：ef-2vc5oe9mzqhm。</li>

     */
    public void setReferenceId(String ReferenceId) {
        this.ReferenceId = ReferenceId;
    }

    /**
     * Get 引用的实例名称。根据 ReferenceType 的取值不同，返回对应的实例名称：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数名称。</li>
 
     * @return ReferenceName 引用的实例名称。根据 ReferenceType 的取值不同，返回对应的实例名称：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数名称。</li>

     */
    public String getReferenceName() {
        return this.ReferenceName;
    }

    /**
     * Set 引用的实例名称。根据 ReferenceType 的取值不同，返回对应的实例名称：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数名称。</li>

     * @param ReferenceName 引用的实例名称。根据 ReferenceType 的取值不同，返回对应的实例名称：
<li>当 ReferenceType 为 edge-function 时：返回边缘函数名称。</li>

     */
    public void setReferenceName(String ReferenceName) {
        this.ReferenceName = ReferenceName;
    }

    /**
     * Get 站点 ID。引用该命名空间的实例所属的站点标识。 
     * @return ZoneId 站点 ID。引用该命名空间的实例所属的站点标识。
     */
    public String getZoneId() {
        return this.ZoneId;
    }

    /**
     * Set 站点 ID。引用该命名空间的实例所属的站点标识。
     * @param ZoneId 站点 ID。引用该命名空间的实例所属的站点标识。
     */
    public void setZoneId(String ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * Get 站点名称。引用该命名空间的实例所属的站点名称。 
     * @return ZoneName 站点名称。引用该命名空间的实例所属的站点名称。
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * Set 站点名称。引用该命名空间的实例所属的站点名称。
     * @param ZoneName 站点名称。引用该命名空间的实例所属的站点名称。
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * Get 引用该命名空间的实例所属站点的别名。若未设置站点别名，则返回空字符串。 
     * @return AliasZoneName 引用该命名空间的实例所属站点的别名。若未设置站点别名，则返回空字符串。
     */
    public String getAliasZoneName() {
        return this.AliasZoneName;
    }

    /**
     * Set 引用该命名空间的实例所属站点的别名。若未设置站点别名，则返回空字符串。
     * @param AliasZoneName 引用该命名空间的实例所属站点的别名。若未设置站点别名，则返回空字符串。
     */
    public void setAliasZoneName(String AliasZoneName) {
        this.AliasZoneName = AliasZoneName;
    }

    public ComponentReference() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ComponentReference(ComponentReference source) {
        if (source.ReferenceType != null) {
            this.ReferenceType = new String(source.ReferenceType);
        }
        if (source.ReferenceId != null) {
            this.ReferenceId = new String(source.ReferenceId);
        }
        if (source.ReferenceName != null) {
            this.ReferenceName = new String(source.ReferenceName);
        }
        if (source.ZoneId != null) {
            this.ZoneId = new String(source.ZoneId);
        }
        if (source.ZoneName != null) {
            this.ZoneName = new String(source.ZoneName);
        }
        if (source.AliasZoneName != null) {
            this.AliasZoneName = new String(source.AliasZoneName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReferenceType", this.ReferenceType);
        this.setParamSimple(map, prefix + "ReferenceId", this.ReferenceId);
        this.setParamSimple(map, prefix + "ReferenceName", this.ReferenceName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "AliasZoneName", this.AliasZoneName);

    }
}

