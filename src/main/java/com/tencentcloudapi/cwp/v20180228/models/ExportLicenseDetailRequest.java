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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExportLicenseDetailRequest extends AbstractModel{

    /**
    * 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>ResourceId 资源ID</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filters [] Filters;

    /**
    * 是否导出全部授权详情
    */
    @SerializedName("IsHistory")
    @Expose
    private Boolean IsHistory;

    /**
    * 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象
    */
    @SerializedName("Tags")
    @Expose
    private Tags [] Tags;

    /**
    * 导出月份, 该参数仅在IsHistory 时可选.
    */
    @SerializedName("ExportMonth")
    @Expose
    private String ExportMonth;

    /**
     * Get 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>ResourceId 资源ID</li> 
     * @return Filters 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>ResourceId 资源ID</li>
     */
    public Filters [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>ResourceId 资源ID</li>
     * @param Filters 多个条件筛选时 LicenseStatus,DeadlineStatus,ResourceId,Keywords 取交集
<li> LicenseType  授权类型, 0 专业版-按量计费, 1专业版-包年包月 , 2 旗舰版-包年包月</li>
<li>ResourceId 资源ID</li>
     */
    public void setFilters(Filters [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 是否导出全部授权详情 
     * @return IsHistory 是否导出全部授权详情
     */
    public Boolean getIsHistory() {
        return this.IsHistory;
    }

    /**
     * Set 是否导出全部授权详情
     * @param IsHistory 是否导出全部授权详情
     */
    public void setIsHistory(Boolean IsHistory) {
        this.IsHistory = IsHistory;
    }

    /**
     * Get 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象 
     * @return Tags 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象
     */
    public Tags [] getTags() {
        return this.Tags;
    }

    /**
     * Set 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象
     * @param Tags 标签筛选,平台标签能力,这里传入 标签键,标签值作为一个对象
     */
    public void setTags(Tags [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 导出月份, 该参数仅在IsHistory 时可选. 
     * @return ExportMonth 导出月份, 该参数仅在IsHistory 时可选.
     */
    public String getExportMonth() {
        return this.ExportMonth;
    }

    /**
     * Set 导出月份, 该参数仅在IsHistory 时可选.
     * @param ExportMonth 导出月份, 该参数仅在IsHistory 时可选.
     */
    public void setExportMonth(String ExportMonth) {
        this.ExportMonth = ExportMonth;
    }

    public ExportLicenseDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExportLicenseDetailRequest(ExportLicenseDetailRequest source) {
        if (source.Filters != null) {
            this.Filters = new Filters[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filters(source.Filters[i]);
            }
        }
        if (source.IsHistory != null) {
            this.IsHistory = new Boolean(source.IsHistory);
        }
        if (source.Tags != null) {
            this.Tags = new Tags[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tags(source.Tags[i]);
            }
        }
        if (source.ExportMonth != null) {
            this.ExportMonth = new String(source.ExportMonth);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "IsHistory", this.IsHistory);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ExportMonth", this.ExportMonth);

    }
}

