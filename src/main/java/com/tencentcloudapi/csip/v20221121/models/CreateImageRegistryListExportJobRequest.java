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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateImageRegistryListExportJobRequest extends AbstractModel {

    /**
    * <p>集团账号的成员id</p>
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * <p>筛选项</p>
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * <p>是否保存到导出任务中</p><p>枚举值：</p><ul><li>0： 不保存</li><li>1： 保存</li></ul>
    */
    @SerializedName("Save")
    @Expose
    private Long Save;

    /**
    * <p>导出文件名</p>
    */
    @SerializedName("ExportName")
    @Expose
    private String ExportName;

    /**
     * Get <p>集团账号的成员id</p> 
     * @return MemberId <p>集团账号的成员id</p>
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set <p>集团账号的成员id</p>
     * @param MemberId <p>集团账号的成员id</p>
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get <p>筛选项</p> 
     * @return Filter <p>筛选项</p>
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set <p>筛选项</p>
     * @param Filter <p>筛选项</p>
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get <p>是否保存到导出任务中</p><p>枚举值：</p><ul><li>0： 不保存</li><li>1： 保存</li></ul> 
     * @return Save <p>是否保存到导出任务中</p><p>枚举值：</p><ul><li>0： 不保存</li><li>1： 保存</li></ul>
     */
    public Long getSave() {
        return this.Save;
    }

    /**
     * Set <p>是否保存到导出任务中</p><p>枚举值：</p><ul><li>0： 不保存</li><li>1： 保存</li></ul>
     * @param Save <p>是否保存到导出任务中</p><p>枚举值：</p><ul><li>0： 不保存</li><li>1： 保存</li></ul>
     */
    public void setSave(Long Save) {
        this.Save = Save;
    }

    /**
     * Get <p>导出文件名</p> 
     * @return ExportName <p>导出文件名</p>
     */
    public String getExportName() {
        return this.ExportName;
    }

    /**
     * Set <p>导出文件名</p>
     * @param ExportName <p>导出文件名</p>
     */
    public void setExportName(String ExportName) {
        this.ExportName = ExportName;
    }

    public CreateImageRegistryListExportJobRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateImageRegistryListExportJobRequest(CreateImageRegistryListExportJobRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.Save != null) {
            this.Save = new Long(source.Save);
        }
        if (source.ExportName != null) {
            this.ExportName = new String(source.ExportName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "Save", this.Save);
        this.setParamSimple(map, prefix + "ExportName", this.ExportName);

    }
}

