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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLicenseBindListRequest extends AbstractModel {

    /**
    * <p>授权ID取DescribeLicenseList接口List对象下的LicenseId参数值</p>
    */
    @SerializedName("LicenseId")
    @Expose
    private Long LicenseId;

    /**
    * <p>授权类型</p><p>枚举值：</p><ul><li>0： 专业版-按量计费</li><li>1： 专业版-包年包月(主机安全)</li><li>2： 旗舰版-包年包月(主机安全)</li><li>3： 轻量版-LH-包年包月</li><li>6： 专业版-包年包月（云安全中心）</li><li>7： 旗舰版-包年包月（云安全中心）</li></ul>
    */
    @SerializedName("LicenseType")
    @Expose
    private Long LicenseType;

    /**
    * <p>资源ID,取DescribeLicenseList接口List对象下的ResourceId参数值</p>
    */
    @SerializedName("ResourceId")
    @Expose
    private String ResourceId;

    /**
    * <li>InstanceID、IP、<p>MachineName 模糊查询</li></p>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * <p>限制条数,默认10.</p>
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * <p>偏移量,默认0.</p>
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get <p>授权ID取DescribeLicenseList接口List对象下的LicenseId参数值</p> 
     * @return LicenseId <p>授权ID取DescribeLicenseList接口List对象下的LicenseId参数值</p>
     */
    public Long getLicenseId() {
        return this.LicenseId;
    }

    /**
     * Set <p>授权ID取DescribeLicenseList接口List对象下的LicenseId参数值</p>
     * @param LicenseId <p>授权ID取DescribeLicenseList接口List对象下的LicenseId参数值</p>
     */
    public void setLicenseId(Long LicenseId) {
        this.LicenseId = LicenseId;
    }

    /**
     * Get <p>授权类型</p><p>枚举值：</p><ul><li>0： 专业版-按量计费</li><li>1： 专业版-包年包月(主机安全)</li><li>2： 旗舰版-包年包月(主机安全)</li><li>3： 轻量版-LH-包年包月</li><li>6： 专业版-包年包月（云安全中心）</li><li>7： 旗舰版-包年包月（云安全中心）</li></ul> 
     * @return LicenseType <p>授权类型</p><p>枚举值：</p><ul><li>0： 专业版-按量计费</li><li>1： 专业版-包年包月(主机安全)</li><li>2： 旗舰版-包年包月(主机安全)</li><li>3： 轻量版-LH-包年包月</li><li>6： 专业版-包年包月（云安全中心）</li><li>7： 旗舰版-包年包月（云安全中心）</li></ul>
     */
    public Long getLicenseType() {
        return this.LicenseType;
    }

    /**
     * Set <p>授权类型</p><p>枚举值：</p><ul><li>0： 专业版-按量计费</li><li>1： 专业版-包年包月(主机安全)</li><li>2： 旗舰版-包年包月(主机安全)</li><li>3： 轻量版-LH-包年包月</li><li>6： 专业版-包年包月（云安全中心）</li><li>7： 旗舰版-包年包月（云安全中心）</li></ul>
     * @param LicenseType <p>授权类型</p><p>枚举值：</p><ul><li>0： 专业版-按量计费</li><li>1： 专业版-包年包月(主机安全)</li><li>2： 旗舰版-包年包月(主机安全)</li><li>3： 轻量版-LH-包年包月</li><li>6： 专业版-包年包月（云安全中心）</li><li>7： 旗舰版-包年包月（云安全中心）</li></ul>
     */
    public void setLicenseType(Long LicenseType) {
        this.LicenseType = LicenseType;
    }

    /**
     * Get <p>资源ID,取DescribeLicenseList接口List对象下的ResourceId参数值</p> 
     * @return ResourceId <p>资源ID,取DescribeLicenseList接口List对象下的ResourceId参数值</p>
     */
    public String getResourceId() {
        return this.ResourceId;
    }

    /**
     * Set <p>资源ID,取DescribeLicenseList接口List对象下的ResourceId参数值</p>
     * @param ResourceId <p>资源ID,取DescribeLicenseList接口List对象下的ResourceId参数值</p>
     */
    public void setResourceId(String ResourceId) {
        this.ResourceId = ResourceId;
    }

    /**
     * Get <li>InstanceID、IP、<p>MachineName 模糊查询</li></p> 
     * @return Filters <li>InstanceID、IP、<p>MachineName 模糊查询</li></p>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set <li>InstanceID、IP、<p>MachineName 模糊查询</li></p>
     * @param Filters <li>InstanceID、IP、<p>MachineName 模糊查询</li></p>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get <p>限制条数,默认10.</p> 
     * @return Limit <p>限制条数,默认10.</p>
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set <p>限制条数,默认10.</p>
     * @param Limit <p>限制条数,默认10.</p>
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get <p>偏移量,默认0.</p> 
     * @return Offset <p>偏移量,默认0.</p>
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set <p>偏移量,默认0.</p>
     * @param Offset <p>偏移量,默认0.</p>
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public DescribeLicenseBindListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLicenseBindListRequest(DescribeLicenseBindListRequest source) {
        if (source.LicenseId != null) {
            this.LicenseId = new Long(source.LicenseId);
        }
        if (source.LicenseType != null) {
            this.LicenseType = new Long(source.LicenseType);
        }
        if (source.ResourceId != null) {
            this.ResourceId = new String(source.ResourceId);
        }
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LicenseId", this.LicenseId);
        this.setParamSimple(map, prefix + "LicenseType", this.LicenseType);
        this.setParamSimple(map, prefix + "ResourceId", this.ResourceId);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

