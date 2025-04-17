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

public class CreateAndroidAppRequest extends AbstractModel {

    /**
    * 安卓应用名字
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 用户 Id
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 应用模式（NORMAL : 普通模式、只支持 apk 文件上传，为默认值；ADVANCED : 高级模式、只支持上传 tgz 文件 和 自定义 shell 命令执行）
    */
    @SerializedName("AppMode")
    @Expose
    private String AppMode;

    /**
     * Get 安卓应用名字 
     * @return Name 安卓应用名字
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 安卓应用名字
     * @param Name 安卓应用名字
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 用户 Id 
     * @return UserId 用户 Id
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 Id
     * @param UserId 用户 Id
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 应用模式（NORMAL : 普通模式、只支持 apk 文件上传，为默认值；ADVANCED : 高级模式、只支持上传 tgz 文件 和 自定义 shell 命令执行） 
     * @return AppMode 应用模式（NORMAL : 普通模式、只支持 apk 文件上传，为默认值；ADVANCED : 高级模式、只支持上传 tgz 文件 和 自定义 shell 命令执行）
     */
    public String getAppMode() {
        return this.AppMode;
    }

    /**
     * Set 应用模式（NORMAL : 普通模式、只支持 apk 文件上传，为默认值；ADVANCED : 高级模式、只支持上传 tgz 文件 和 自定义 shell 命令执行）
     * @param AppMode 应用模式（NORMAL : 普通模式、只支持 apk 文件上传，为默认值；ADVANCED : 高级模式、只支持上传 tgz 文件 和 自定义 shell 命令执行）
     */
    public void setAppMode(String AppMode) {
        this.AppMode = AppMode;
    }

    public CreateAndroidAppRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateAndroidAppRequest(CreateAndroidAppRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.AppMode != null) {
            this.AppMode = new String(source.AppMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);

    }
}

