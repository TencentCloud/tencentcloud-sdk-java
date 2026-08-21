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
package com.tencentcloudapi.gs.v20191118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidApp extends AbstractModel {

    /**
    * <p>安卓应用 Id</p>
    */
    @SerializedName("AndroidAppId")
    @Expose
    private String AndroidAppId;

    /**
    * <p>安卓应用名称</p>
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * <p>安卓应用状态（上架、下架）</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>安卓应用版本列表</p>
    */
    @SerializedName("AndroidAppVersionInfo")
    @Expose
    private AndroidAppVersionInfo [] AndroidAppVersionInfo;

    /**
    * <p>安卓应用创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>用户 Id</p>
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * <p>应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）</p>
    */
    @SerializedName("AppMode")
    @Expose
    private String AppMode;

    /**
    * <p>应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态</p>
    */
    @SerializedName("UpdateState")
    @Expose
    private String UpdateState;

    /**
    * <p>安卓应用包名</p>
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get <p>安卓应用 Id</p> 
     * @return AndroidAppId <p>安卓应用 Id</p>
     */
    public String getAndroidAppId() {
        return this.AndroidAppId;
    }

    /**
     * Set <p>安卓应用 Id</p>
     * @param AndroidAppId <p>安卓应用 Id</p>
     */
    public void setAndroidAppId(String AndroidAppId) {
        this.AndroidAppId = AndroidAppId;
    }

    /**
     * Get <p>安卓应用名称</p> 
     * @return Name <p>安卓应用名称</p>
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set <p>安卓应用名称</p>
     * @param Name <p>安卓应用名称</p>
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get <p>安卓应用状态（上架、下架）</p> 
     * @return State <p>安卓应用状态（上架、下架）</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>安卓应用状态（上架、下架）</p>
     * @param State <p>安卓应用状态（上架、下架）</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>安卓应用版本列表</p> 
     * @return AndroidAppVersionInfo <p>安卓应用版本列表</p>
     */
    public AndroidAppVersionInfo [] getAndroidAppVersionInfo() {
        return this.AndroidAppVersionInfo;
    }

    /**
     * Set <p>安卓应用版本列表</p>
     * @param AndroidAppVersionInfo <p>安卓应用版本列表</p>
     */
    public void setAndroidAppVersionInfo(AndroidAppVersionInfo [] AndroidAppVersionInfo) {
        this.AndroidAppVersionInfo = AndroidAppVersionInfo;
    }

    /**
     * Get <p>安卓应用创建时间</p> 
     * @return CreateTime <p>安卓应用创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>安卓应用创建时间</p>
     * @param CreateTime <p>安卓应用创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>用户 Id</p> 
     * @return UserId <p>用户 Id</p>
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set <p>用户 Id</p>
     * @param UserId <p>用户 Id</p>
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get <p>应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）</p> 
     * @return AppMode <p>应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）</p>
     */
    public String getAppMode() {
        return this.AppMode;
    }

    /**
     * Set <p>应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）</p>
     * @param AppMode <p>应用模式（NORMAL : 普通模式；ADVANCED : 高级模式）</p>
     */
    public void setAppMode(String AppMode) {
        this.AppMode = AppMode;
    }

    /**
     * Get <p>应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态</p> 
     * @return UpdateState <p>应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态</p>
     */
    public String getUpdateState() {
        return this.UpdateState;
    }

    /**
     * Set <p>应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态</p>
     * @param UpdateState <p>应用更新状态，取值：UPLOADING 上传中、CREATING 创建中、CREATE_FAIL 创建失败、CREATE_SUCCESS 创建成功、PACKAGE_NAME_MISMATCH 包名不匹配、VERSION_ALREADY_EXISTS 版本已存在、APP_PARSE_FAIL app 解析失败、APP_EXISTS_SECURITY_RISK app 存在安全风险、NORMAL 默认状态</p>
     */
    public void setUpdateState(String UpdateState) {
        this.UpdateState = UpdateState;
    }

    /**
     * Get <p>安卓应用包名</p> 
     * @return PackageName <p>安卓应用包名</p>
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * Set <p>安卓应用包名</p>
     * @param PackageName <p>安卓应用包名</p>
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    public AndroidApp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidApp(AndroidApp source) {
        if (source.AndroidAppId != null) {
            this.AndroidAppId = new String(source.AndroidAppId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.AndroidAppVersionInfo != null) {
            this.AndroidAppVersionInfo = new AndroidAppVersionInfo[source.AndroidAppVersionInfo.length];
            for (int i = 0; i < source.AndroidAppVersionInfo.length; i++) {
                this.AndroidAppVersionInfo[i] = new AndroidAppVersionInfo(source.AndroidAppVersionInfo[i]);
            }
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.AppMode != null) {
            this.AppMode = new String(source.AppMode);
        }
        if (source.UpdateState != null) {
            this.UpdateState = new String(source.UpdateState);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidAppId", this.AndroidAppId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamArrayObj(map, prefix + "AndroidAppVersionInfo.", this.AndroidAppVersionInfo);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "AppMode", this.AppMode);
        this.setParamSimple(map, prefix + "UpdateState", this.UpdateState);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

