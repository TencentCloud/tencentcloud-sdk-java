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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetAndroidInstancesBGAppKeepAliveRequest extends AbstractModel {

    /**
    * 安卓实例 ID 列表（最大100条数据）
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 操作类型，取值：ADD 添加应用到后台保活列表、REMOVE 从后台保活列表中移除应用、SET 全量设置后台保活列表，替换当前列表。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 应用包名列表
    */
    @SerializedName("PackageNames")
    @Expose
    private String [] PackageNames;

    /**
     * Get 安卓实例 ID 列表（最大100条数据） 
     * @return AndroidInstanceIds 安卓实例 ID 列表（最大100条数据）
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 安卓实例 ID 列表（最大100条数据）
     * @param AndroidInstanceIds 安卓实例 ID 列表（最大100条数据）
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get 操作类型，取值：ADD 添加应用到后台保活列表、REMOVE 从后台保活列表中移除应用、SET 全量设置后台保活列表，替换当前列表。 
     * @return Operation 操作类型，取值：ADD 添加应用到后台保活列表、REMOVE 从后台保活列表中移除应用、SET 全量设置后台保活列表，替换当前列表。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作类型，取值：ADD 添加应用到后台保活列表、REMOVE 从后台保活列表中移除应用、SET 全量设置后台保活列表，替换当前列表。
     * @param Operation 操作类型，取值：ADD 添加应用到后台保活列表、REMOVE 从后台保活列表中移除应用、SET 全量设置后台保活列表，替换当前列表。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 应用包名列表 
     * @return PackageNames 应用包名列表
     */
    public String [] getPackageNames() {
        return this.PackageNames;
    }

    /**
     * Set 应用包名列表
     * @param PackageNames 应用包名列表
     */
    public void setPackageNames(String [] PackageNames) {
        this.PackageNames = PackageNames;
    }

    public SetAndroidInstancesBGAppKeepAliveRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SetAndroidInstancesBGAppKeepAliveRequest(SetAndroidInstancesBGAppKeepAliveRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.PackageNames != null) {
            this.PackageNames = new String[source.PackageNames.length];
            for (int i = 0; i < source.PackageNames.length; i++) {
                this.PackageNames[i] = new String(source.PackageNames[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArraySimple(map, prefix + "PackageNames.", this.PackageNames);

    }
}

