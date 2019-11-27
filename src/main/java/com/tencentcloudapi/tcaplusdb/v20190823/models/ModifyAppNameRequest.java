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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAppNameRequest  extends AbstractModel{

    /**
    * 需要修改名称的应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 需要修改的应用名称，需要URLEncode
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
     * 获取需要修改名称的应用实例ID
     * @return ApplicationId 需要修改名称的应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置需要修改名称的应用实例ID
     * @param ApplicationId 需要修改名称的应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取需要修改的应用名称，需要URLEncode
     * @return AppName 需要修改的应用名称，需要URLEncode
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * 设置需要修改的应用名称，需要URLEncode
     * @param AppName 需要修改的应用名称，需要URLEncode
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "AppName", this.AppName);

    }
}

