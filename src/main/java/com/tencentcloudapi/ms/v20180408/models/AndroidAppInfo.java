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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AndroidAppInfo extends AbstractModel{

    /**
    * app文件的md5算法值，需要正确传递，在线加固必输。
例如linux环境下执行算法命令md5sum ：
#md5sum test.apk 
d40cc11e4bddd643ecdf29cde729a12b
    */
    @SerializedName("AppMd5")
    @Expose
    private String AppMd5;

    /**
    * app的大小，非必输。
    */
    @SerializedName("AppSize")
    @Expose
    private Long AppSize;

    /**
    * app下载链接，在线加固必输。
    */
    @SerializedName("AppUrl")
    @Expose
    private String AppUrl;

    /**
    * app名称，非必输
    */
    @SerializedName("AppName")
    @Expose
    private String AppName;

    /**
    * app的包名，本次操作的包名。
当Android是按年收费、免费试用加固时，在线加固和输出工具要求该字段必输，且与AndroidPlan.AppPkgName值相等。
    */
    @SerializedName("AppPkgName")
    @Expose
    private String AppPkgName;

    /**
    * app的文件名，非必输。
    */
    @SerializedName("AppFileName")
    @Expose
    private String AppFileName;

    /**
    * app版本号，非必输。
    */
    @SerializedName("AppVersion")
    @Expose
    private String AppVersion;

    /**
    * Android app的文件类型，本次加固操作的应用类型 。
Android在线加固和输出工具加固必输，其值需等于“apk”或“aab”，且与AndroidAppInfo.AppType值相等。
    */
    @SerializedName("AppType")
    @Expose
    private String AppType;

    /**
     * Get app文件的md5算法值，需要正确传递，在线加固必输。
例如linux环境下执行算法命令md5sum ：
#md5sum test.apk 
d40cc11e4bddd643ecdf29cde729a12b 
     * @return AppMd5 app文件的md5算法值，需要正确传递，在线加固必输。
例如linux环境下执行算法命令md5sum ：
#md5sum test.apk 
d40cc11e4bddd643ecdf29cde729a12b
     */
    public String getAppMd5() {
        return this.AppMd5;
    }

    /**
     * Set app文件的md5算法值，需要正确传递，在线加固必输。
例如linux环境下执行算法命令md5sum ：
#md5sum test.apk 
d40cc11e4bddd643ecdf29cde729a12b
     * @param AppMd5 app文件的md5算法值，需要正确传递，在线加固必输。
例如linux环境下执行算法命令md5sum ：
#md5sum test.apk 
d40cc11e4bddd643ecdf29cde729a12b
     */
    public void setAppMd5(String AppMd5) {
        this.AppMd5 = AppMd5;
    }

    /**
     * Get app的大小，非必输。 
     * @return AppSize app的大小，非必输。
     */
    public Long getAppSize() {
        return this.AppSize;
    }

    /**
     * Set app的大小，非必输。
     * @param AppSize app的大小，非必输。
     */
    public void setAppSize(Long AppSize) {
        this.AppSize = AppSize;
    }

    /**
     * Get app下载链接，在线加固必输。 
     * @return AppUrl app下载链接，在线加固必输。
     */
    public String getAppUrl() {
        return this.AppUrl;
    }

    /**
     * Set app下载链接，在线加固必输。
     * @param AppUrl app下载链接，在线加固必输。
     */
    public void setAppUrl(String AppUrl) {
        this.AppUrl = AppUrl;
    }

    /**
     * Get app名称，非必输 
     * @return AppName app名称，非必输
     */
    public String getAppName() {
        return this.AppName;
    }

    /**
     * Set app名称，非必输
     * @param AppName app名称，非必输
     */
    public void setAppName(String AppName) {
        this.AppName = AppName;
    }

    /**
     * Get app的包名，本次操作的包名。
当Android是按年收费、免费试用加固时，在线加固和输出工具要求该字段必输，且与AndroidPlan.AppPkgName值相等。 
     * @return AppPkgName app的包名，本次操作的包名。
当Android是按年收费、免费试用加固时，在线加固和输出工具要求该字段必输，且与AndroidPlan.AppPkgName值相等。
     */
    public String getAppPkgName() {
        return this.AppPkgName;
    }

    /**
     * Set app的包名，本次操作的包名。
当Android是按年收费、免费试用加固时，在线加固和输出工具要求该字段必输，且与AndroidPlan.AppPkgName值相等。
     * @param AppPkgName app的包名，本次操作的包名。
当Android是按年收费、免费试用加固时，在线加固和输出工具要求该字段必输，且与AndroidPlan.AppPkgName值相等。
     */
    public void setAppPkgName(String AppPkgName) {
        this.AppPkgName = AppPkgName;
    }

    /**
     * Get app的文件名，非必输。 
     * @return AppFileName app的文件名，非必输。
     */
    public String getAppFileName() {
        return this.AppFileName;
    }

    /**
     * Set app的文件名，非必输。
     * @param AppFileName app的文件名，非必输。
     */
    public void setAppFileName(String AppFileName) {
        this.AppFileName = AppFileName;
    }

    /**
     * Get app版本号，非必输。 
     * @return AppVersion app版本号，非必输。
     */
    public String getAppVersion() {
        return this.AppVersion;
    }

    /**
     * Set app版本号，非必输。
     * @param AppVersion app版本号，非必输。
     */
    public void setAppVersion(String AppVersion) {
        this.AppVersion = AppVersion;
    }

    /**
     * Get Android app的文件类型，本次加固操作的应用类型 。
Android在线加固和输出工具加固必输，其值需等于“apk”或“aab”，且与AndroidAppInfo.AppType值相等。 
     * @return AppType Android app的文件类型，本次加固操作的应用类型 。
Android在线加固和输出工具加固必输，其值需等于“apk”或“aab”，且与AndroidAppInfo.AppType值相等。
     */
    public String getAppType() {
        return this.AppType;
    }

    /**
     * Set Android app的文件类型，本次加固操作的应用类型 。
Android在线加固和输出工具加固必输，其值需等于“apk”或“aab”，且与AndroidAppInfo.AppType值相等。
     * @param AppType Android app的文件类型，本次加固操作的应用类型 。
Android在线加固和输出工具加固必输，其值需等于“apk”或“aab”，且与AndroidAppInfo.AppType值相等。
     */
    public void setAppType(String AppType) {
        this.AppType = AppType;
    }

    public AndroidAppInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AndroidAppInfo(AndroidAppInfo source) {
        if (source.AppMd5 != null) {
            this.AppMd5 = new String(source.AppMd5);
        }
        if (source.AppSize != null) {
            this.AppSize = new Long(source.AppSize);
        }
        if (source.AppUrl != null) {
            this.AppUrl = new String(source.AppUrl);
        }
        if (source.AppName != null) {
            this.AppName = new String(source.AppName);
        }
        if (source.AppPkgName != null) {
            this.AppPkgName = new String(source.AppPkgName);
        }
        if (source.AppFileName != null) {
            this.AppFileName = new String(source.AppFileName);
        }
        if (source.AppVersion != null) {
            this.AppVersion = new String(source.AppVersion);
        }
        if (source.AppType != null) {
            this.AppType = new String(source.AppType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppMd5", this.AppMd5);
        this.setParamSimple(map, prefix + "AppSize", this.AppSize);
        this.setParamSimple(map, prefix + "AppUrl", this.AppUrl);
        this.setParamSimple(map, prefix + "AppName", this.AppName);
        this.setParamSimple(map, prefix + "AppPkgName", this.AppPkgName);
        this.setParamSimple(map, prefix + "AppFileName", this.AppFileName);
        this.setParamSimple(map, prefix + "AppVersion", this.AppVersion);
        this.setParamSimple(map, prefix + "AppType", this.AppType);

    }
}

