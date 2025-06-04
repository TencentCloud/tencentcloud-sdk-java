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

public class AndroidAppVersionInfo extends AbstractModel {

    /**
    * 安卓应用版本
    */
    @SerializedName("AndroidAppVersion")
    @Expose
    private String AndroidAppVersion;

    /**
    * 安卓应用版本创建状态（NORMAL：无、UPLOADING：上传中、
CREATING： 创建中、
CREATE_FAIL：创建失败、CREATE_SUCCESS：创建成功）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 安卓应用版本创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * shell 安装命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * shell 卸载命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
    */
    @SerializedName("UninstallCommand")
    @Expose
    private String UninstallCommand;

    /**
    * 应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。
    */
    @SerializedName("CleanupMode")
    @Expose
    private String CleanupMode;

    /**
     * Get 安卓应用版本 
     * @return AndroidAppVersion 安卓应用版本
     */
    public String getAndroidAppVersion() {
        return this.AndroidAppVersion;
    }

    /**
     * Set 安卓应用版本
     * @param AndroidAppVersion 安卓应用版本
     */
    public void setAndroidAppVersion(String AndroidAppVersion) {
        this.AndroidAppVersion = AndroidAppVersion;
    }

    /**
     * Get 安卓应用版本创建状态（NORMAL：无、UPLOADING：上传中、
CREATING： 创建中、
CREATE_FAIL：创建失败、CREATE_SUCCESS：创建成功） 
     * @return State 安卓应用版本创建状态（NORMAL：无、UPLOADING：上传中、
CREATING： 创建中、
CREATE_FAIL：创建失败、CREATE_SUCCESS：创建成功）
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set 安卓应用版本创建状态（NORMAL：无、UPLOADING：上传中、
CREATING： 创建中、
CREATE_FAIL：创建失败、CREATE_SUCCESS：创建成功）
     * @param State 安卓应用版本创建状态（NORMAL：无、UPLOADING：上传中、
CREATING： 创建中、
CREATE_FAIL：创建失败、CREATE_SUCCESS：创建成功）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 安卓应用版本创建时间 
     * @return CreateTime 安卓应用版本创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 安卓应用版本创建时间
     * @param CreateTime 安卓应用版本创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get shell 安装命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效） 
     * @return Command shell 安装命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set shell 安装命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     * @param Command shell 安装命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get shell 卸载命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效） 
     * @return UninstallCommand shell 卸载命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     */
    public String getUninstallCommand() {
        return this.UninstallCommand;
    }

    /**
     * Set shell 卸载命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     * @param UninstallCommand shell 卸载命令（支持多条命令执行，通过 && 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）
     */
    public void setUninstallCommand(String UninstallCommand) {
        this.UninstallCommand = UninstallCommand;
    }

    /**
     * Get 应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。 
     * @return CleanupMode 应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。
     */
    public String getCleanupMode() {
        return this.CleanupMode;
    }

    /**
     * Set 应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。
     * @param CleanupMode 应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。
     */
    public void setCleanupMode(String CleanupMode) {
        this.CleanupMode = CleanupMode;
    }

    public AndroidAppVersionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidAppVersionInfo(AndroidAppVersionInfo source) {
        if (source.AndroidAppVersion != null) {
            this.AndroidAppVersion = new String(source.AndroidAppVersion);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.Command != null) {
            this.Command = new String(source.Command);
        }
        if (source.UninstallCommand != null) {
            this.UninstallCommand = new String(source.UninstallCommand);
        }
        if (source.CleanupMode != null) {
            this.CleanupMode = new String(source.CleanupMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AndroidAppVersion", this.AndroidAppVersion);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "UninstallCommand", this.UninstallCommand);
        this.setParamSimple(map, prefix + "CleanupMode", this.CleanupMode);

    }
}

