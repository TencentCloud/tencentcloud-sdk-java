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
package com.tencentcloudapi.adp.v20260520.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppAuxiliaryInfo extends AbstractModel {

    /**
    * 申诉信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Appeal")
    @Expose
    private AppAppeal Appeal;

    /**
    * 搜索资源状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SearchResourceStatus")
    @Expose
    private SearchResourceStatusInfo SearchResourceStatus;

    /**
    * 特殊状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SpecialStatusInfo")
    @Expose
    private SpecialStatusInfo SpecialStatusInfo;

    /**
    * 子状态信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SubStatus")
    @Expose
    private AppSubStatusInfo SubStatus;

    /**
     * Get 申诉信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Appeal 申诉信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppAppeal getAppeal() {
        return this.Appeal;
    }

    /**
     * Set 申诉信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Appeal 申诉信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppeal(AppAppeal Appeal) {
        this.Appeal = Appeal;
    }

    /**
     * Get 搜索资源状态
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SearchResourceStatus 搜索资源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SearchResourceStatusInfo getSearchResourceStatus() {
        return this.SearchResourceStatus;
    }

    /**
     * Set 搜索资源状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param SearchResourceStatus 搜索资源状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSearchResourceStatus(SearchResourceStatusInfo SearchResourceStatus) {
        this.SearchResourceStatus = SearchResourceStatus;
    }

    /**
     * Get 特殊状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SpecialStatusInfo 特殊状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public SpecialStatusInfo getSpecialStatusInfo() {
        return this.SpecialStatusInfo;
    }

    /**
     * Set 特殊状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SpecialStatusInfo 特殊状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSpecialStatusInfo(SpecialStatusInfo SpecialStatusInfo) {
        this.SpecialStatusInfo = SpecialStatusInfo;
    }

    /**
     * Get 子状态信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SubStatus 子状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AppSubStatusInfo getSubStatus() {
        return this.SubStatus;
    }

    /**
     * Set 子状态信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param SubStatus 子状态信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSubStatus(AppSubStatusInfo SubStatus) {
        this.SubStatus = SubStatus;
    }

    public AppAuxiliaryInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppAuxiliaryInfo(AppAuxiliaryInfo source) {
        if (source.Appeal != null) {
            this.Appeal = new AppAppeal(source.Appeal);
        }
        if (source.SearchResourceStatus != null) {
            this.SearchResourceStatus = new SearchResourceStatusInfo(source.SearchResourceStatus);
        }
        if (source.SpecialStatusInfo != null) {
            this.SpecialStatusInfo = new SpecialStatusInfo(source.SpecialStatusInfo);
        }
        if (source.SubStatus != null) {
            this.SubStatus = new AppSubStatusInfo(source.SubStatus);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Appeal.", this.Appeal);
        this.setParamObj(map, prefix + "SearchResourceStatus.", this.SearchResourceStatus);
        this.setParamObj(map, prefix + "SpecialStatusInfo.", this.SpecialStatusInfo);
        this.setParamObj(map, prefix + "SubStatus.", this.SubStatus);

    }
}

