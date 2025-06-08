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

public class ModifyAndroidInstancesAppBlacklistRequest extends AbstractModel {

    /**
    * 实例ID列表，数量上限100
    */
    @SerializedName("AndroidInstanceIds")
    @Expose
    private String [] AndroidInstanceIds;

    /**
    * 应用列表
    */
    @SerializedName("AppList")
    @Expose
    private String [] AppList;

    /**
    * ADD、REMOVE、CLEAR
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
     * Get 实例ID列表，数量上限100 
     * @return AndroidInstanceIds 实例ID列表，数量上限100
     */
    public String [] getAndroidInstanceIds() {
        return this.AndroidInstanceIds;
    }

    /**
     * Set 实例ID列表，数量上限100
     * @param AndroidInstanceIds 实例ID列表，数量上限100
     */
    public void setAndroidInstanceIds(String [] AndroidInstanceIds) {
        this.AndroidInstanceIds = AndroidInstanceIds;
    }

    /**
     * Get 应用列表 
     * @return AppList 应用列表
     */
    public String [] getAppList() {
        return this.AppList;
    }

    /**
     * Set 应用列表
     * @param AppList 应用列表
     */
    public void setAppList(String [] AppList) {
        this.AppList = AppList;
    }

    /**
     * Get ADD、REMOVE、CLEAR 
     * @return Operation ADD、REMOVE、CLEAR
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set ADD、REMOVE、CLEAR
     * @param Operation ADD、REMOVE、CLEAR
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    public ModifyAndroidInstancesAppBlacklistRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyAndroidInstancesAppBlacklistRequest(ModifyAndroidInstancesAppBlacklistRequest source) {
        if (source.AndroidInstanceIds != null) {
            this.AndroidInstanceIds = new String[source.AndroidInstanceIds.length];
            for (int i = 0; i < source.AndroidInstanceIds.length; i++) {
                this.AndroidInstanceIds[i] = new String(source.AndroidInstanceIds[i]);
            }
        }
        if (source.AppList != null) {
            this.AppList = new String[source.AppList.length];
            for (int i = 0; i < source.AppList.length; i++) {
                this.AppList[i] = new String(source.AppList[i]);
            }
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AndroidInstanceIds.", this.AndroidInstanceIds);
        this.setParamArraySimple(map, prefix + "AppList.", this.AppList);
        this.setParamSimple(map, prefix + "Operation", this.Operation);

    }
}

