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

public class AndroidAppVersionInfo extends AbstractModel {

    /**
    * <p>安卓应用版本</p>
    */
    @SerializedName("AndroidAppVersion")
    @Expose
    private String AndroidAppVersion;

    /**
    * <p>安卓应用版本创建状态，取值：NORMAL：无（默认）、UPLOADING：上传中、CREATING： 创建中、CREATE_FAIL：创建失败、PACKAGE_NAME_MISMATCH：包名不匹配、VERSION_ALREADY_EXISTS：版本已存在、APP_PARSE_FAIL： app 解析失败、APP_EXISTS_SECURITY_RISK：app 存在安全风险、CREATE_SUCCESS：创建成功</p>
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * <p>安卓应用版本创建时间</p>
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * <p>shell 安装命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p>
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * <p>shell 卸载命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p>
    */
    @SerializedName("UninstallCommand")
    @Expose
    private String UninstallCommand;

    /**
    * <p>应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。</p>
    */
    @SerializedName("CleanupMode")
    @Expose
    private String CleanupMode;

    /**
    * <p>安卓应用版本名称（版本描述、备注）</p>
    */
    @SerializedName("AndroidAppVersionName")
    @Expose
    private String AndroidAppVersionName;

    /**
    * <p>安卓应用启动页</p>
    */
    @SerializedName("Activity")
    @Expose
    private String Activity;

    /**
    * <p>应用版本号（Version Name）</p>
    */
    @SerializedName("VersionName")
    @Expose
    private String VersionName;

    /**
    * <p>应用包 MD5</p>
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * <p>应用包文件大小（字节）</p>
    */
    @SerializedName("FileSize")
    @Expose
    private Long FileSize;

    /**
    * <p>安卓应用包名</p>
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * Get <p>安卓应用版本</p> 
     * @return AndroidAppVersion <p>安卓应用版本</p>
     */
    public String getAndroidAppVersion() {
        return this.AndroidAppVersion;
    }

    /**
     * Set <p>安卓应用版本</p>
     * @param AndroidAppVersion <p>安卓应用版本</p>
     */
    public void setAndroidAppVersion(String AndroidAppVersion) {
        this.AndroidAppVersion = AndroidAppVersion;
    }

    /**
     * Get <p>安卓应用版本创建状态，取值：NORMAL：无（默认）、UPLOADING：上传中、CREATING： 创建中、CREATE_FAIL：创建失败、PACKAGE_NAME_MISMATCH：包名不匹配、VERSION_ALREADY_EXISTS：版本已存在、APP_PARSE_FAIL： app 解析失败、APP_EXISTS_SECURITY_RISK：app 存在安全风险、CREATE_SUCCESS：创建成功</p> 
     * @return State <p>安卓应用版本创建状态，取值：NORMAL：无（默认）、UPLOADING：上传中、CREATING： 创建中、CREATE_FAIL：创建失败、PACKAGE_NAME_MISMATCH：包名不匹配、VERSION_ALREADY_EXISTS：版本已存在、APP_PARSE_FAIL： app 解析失败、APP_EXISTS_SECURITY_RISK：app 存在安全风险、CREATE_SUCCESS：创建成功</p>
     */
    public String getState() {
        return this.State;
    }

    /**
     * Set <p>安卓应用版本创建状态，取值：NORMAL：无（默认）、UPLOADING：上传中、CREATING： 创建中、CREATE_FAIL：创建失败、PACKAGE_NAME_MISMATCH：包名不匹配、VERSION_ALREADY_EXISTS：版本已存在、APP_PARSE_FAIL： app 解析失败、APP_EXISTS_SECURITY_RISK：app 存在安全风险、CREATE_SUCCESS：创建成功</p>
     * @param State <p>安卓应用版本创建状态，取值：NORMAL：无（默认）、UPLOADING：上传中、CREATING： 创建中、CREATE_FAIL：创建失败、PACKAGE_NAME_MISMATCH：包名不匹配、VERSION_ALREADY_EXISTS：版本已存在、APP_PARSE_FAIL： app 解析失败、APP_EXISTS_SECURITY_RISK：app 存在安全风险、CREATE_SUCCESS：创建成功</p>
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get <p>安卓应用版本创建时间</p> 
     * @return CreateTime <p>安卓应用版本创建时间</p>
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set <p>安卓应用版本创建时间</p>
     * @param CreateTime <p>安卓应用版本创建时间</p>
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get <p>shell 安装命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p> 
     * @return Command <p>shell 安装命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p>
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * Set <p>shell 安装命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p>
     * @param Command <p>shell 安装命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p>
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * Get <p>shell 卸载命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p> 
     * @return UninstallCommand <p>shell 卸载命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p>
     */
    public String getUninstallCommand() {
        return this.UninstallCommand;
    }

    /**
     * Set <p>shell 卸载命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p>
     * @param UninstallCommand <p>shell 卸载命令（支持多条命令执行，通过 &amp;&amp; 组合；只在应用 AppMode 为 ADVANCED 高级模式下 才会生效）</p>
     */
    public void setUninstallCommand(String UninstallCommand) {
        this.UninstallCommand = UninstallCommand;
    }

    /**
     * Get <p>应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。</p> 
     * @return CleanupMode <p>应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。</p>
     */
    public String getCleanupMode() {
        return this.CleanupMode;
    }

    /**
     * Set <p>应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。</p>
     * @param CleanupMode <p>应用资源清理模式（实例安装应用所用资源），取值：CLEANUP_ON_UNINSTALL（默认值），卸载 App 时清理；CLEANUP_AFTER_INSTALL，安装 App 后立即清理。普通应用只有 CLEANUP_AFTER_INSTALL 模式。</p>
     */
    public void setCleanupMode(String CleanupMode) {
        this.CleanupMode = CleanupMode;
    }

    /**
     * Get <p>安卓应用版本名称（版本描述、备注）</p> 
     * @return AndroidAppVersionName <p>安卓应用版本名称（版本描述、备注）</p>
     */
    public String getAndroidAppVersionName() {
        return this.AndroidAppVersionName;
    }

    /**
     * Set <p>安卓应用版本名称（版本描述、备注）</p>
     * @param AndroidAppVersionName <p>安卓应用版本名称（版本描述、备注）</p>
     */
    public void setAndroidAppVersionName(String AndroidAppVersionName) {
        this.AndroidAppVersionName = AndroidAppVersionName;
    }

    /**
     * Get <p>安卓应用启动页</p> 
     * @return Activity <p>安卓应用启动页</p>
     */
    public String getActivity() {
        return this.Activity;
    }

    /**
     * Set <p>安卓应用启动页</p>
     * @param Activity <p>安卓应用启动页</p>
     */
    public void setActivity(String Activity) {
        this.Activity = Activity;
    }

    /**
     * Get <p>应用版本号（Version Name）</p> 
     * @return VersionName <p>应用版本号（Version Name）</p>
     */
    public String getVersionName() {
        return this.VersionName;
    }

    /**
     * Set <p>应用版本号（Version Name）</p>
     * @param VersionName <p>应用版本号（Version Name）</p>
     */
    public void setVersionName(String VersionName) {
        this.VersionName = VersionName;
    }

    /**
     * Get <p>应用包 MD5</p> 
     * @return MD5 <p>应用包 MD5</p>
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set <p>应用包 MD5</p>
     * @param MD5 <p>应用包 MD5</p>
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get <p>应用包文件大小（字节）</p> 
     * @return FileSize <p>应用包文件大小（字节）</p>
     */
    public Long getFileSize() {
        return this.FileSize;
    }

    /**
     * Set <p>应用包文件大小（字节）</p>
     * @param FileSize <p>应用包文件大小（字节）</p>
     */
    public void setFileSize(Long FileSize) {
        this.FileSize = FileSize;
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
        if (source.AndroidAppVersionName != null) {
            this.AndroidAppVersionName = new String(source.AndroidAppVersionName);
        }
        if (source.Activity != null) {
            this.Activity = new String(source.Activity);
        }
        if (source.VersionName != null) {
            this.VersionName = new String(source.VersionName);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.FileSize != null) {
            this.FileSize = new Long(source.FileSize);
        }
        if (source.PackageName != null) {
            this.PackageName = new String(source.PackageName);
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
        this.setParamSimple(map, prefix + "AndroidAppVersionName", this.AndroidAppVersionName);
        this.setParamSimple(map, prefix + "Activity", this.Activity);
        this.setParamSimple(map, prefix + "VersionName", this.VersionName);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "FileSize", this.FileSize);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

