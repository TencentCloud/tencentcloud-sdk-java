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
package com.tencentcloudapi.vcube.v20220410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OverviewAppInfo extends AbstractModel {

    /**
    * 应用Id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 应用名称
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * Ios 包名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BundleId")
    @Expose
    private String BundleId;

    /**
    * Andorid 包名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
    * Mac 进程名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MacBundleId")
    @Expose
    private String MacBundleId;

    /**
    * windows 进程名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WinProcessName")
    @Expose
    private String WinProcessName;

    /**
    * 域名列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
     * Get 应用Id 
     * @return Id 应用Id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 应用Id
     * @param Id 应用Id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 应用名称 
     * @return AppName 应用名称
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set 应用名称
     * @param AppName 应用名称
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get Ios 包名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return BundleId Ios 包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBundleId() {
        return this.BundleId;
    }

    /**
     * Set Ios 包名
注意：此字段可能返回 null，表示取不到有效值。
     * @param BundleId Ios 包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBundleId(String BundleId) {
        this.BundleId = BundleId;
    }

    /**
     * Get Andorid 包名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PackageName Andorid 包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set Andorid 包名
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName Andorid 包名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * Get Mac 进程名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MacBundleId Mac 进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMacBundleId() {
        return this.MacBundleId;
    }

    /**
     * Set Mac 进程名
注意：此字段可能返回 null，表示取不到有效值。
     * @param MacBundleId Mac 进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMacBundleId(String MacBundleId) {
        this.MacBundleId = MacBundleId;
    }

    /**
     * Get windows 进程名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WinProcessName windows 进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWinProcessName() {
        return this.WinProcessName;
    }

    /**
     * Set windows 进程名
注意：此字段可能返回 null，表示取不到有效值。
     * @param WinProcessName windows 进程名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWinProcessName(String WinProcessName) {
        this.WinProcessName = WinProcessName;
    }

    /**
     * Get 域名列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DomainList 域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 域名列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param DomainList 域名列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    public OverviewAppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OverviewAppInfo(OverviewAppInfo source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.BundleId != null) {
            this.BundleId = new String(source.BundleId);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
        if (source.MacBundleId != null) {
            this.MacBundleId = new String(source.MacBundleId);
        }
        if (source.WinProcessName != null) {
            this.WinProcessName = new String(source.WinProcessName);
        }
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "BundleId", this.BundleId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);
        this.setParamSimple(map, prefix + "MacBundleId", this.MacBundleId);
        this.setParamSimple(map, prefix + "WinProcessName", this.WinProcessName);
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);

    }
}

