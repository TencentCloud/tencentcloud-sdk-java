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

public class ImportAndroidInstanceImageRequest extends AbstractModel {

    /**
    * 镜像名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 镜像文件下载地址，要求是 tgz 压缩文件
    */
    @SerializedName("URL")
    @Expose
    private String URL;

    /**
    * 镜像文件 MD5 值
    */
    @SerializedName("MD5")
    @Expose
    private String MD5;

    /**
    * 安卓版本。
ANDROID10：默认值，安卓10
ANDROID12：安卓12
ANDROID14：安卓14
    */
    @SerializedName("AndroidVersion")
    @Expose
    private String AndroidVersion;

    /**
    * 镜像可用区
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * Get 镜像名称 
     * @return Name 镜像名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 镜像名称
     * @param Name 镜像名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 镜像文件下载地址，要求是 tgz 压缩文件 
     * @return URL 镜像文件下载地址，要求是 tgz 压缩文件
     */
    public String getURL() {
        return this.URL;
    }

    /**
     * Set 镜像文件下载地址，要求是 tgz 压缩文件
     * @param URL 镜像文件下载地址，要求是 tgz 压缩文件
     */
    public void setURL(String URL) {
        this.URL = URL;
    }

    /**
     * Get 镜像文件 MD5 值 
     * @return MD5 镜像文件 MD5 值
     */
    public String getMD5() {
        return this.MD5;
    }

    /**
     * Set 镜像文件 MD5 值
     * @param MD5 镜像文件 MD5 值
     */
    public void setMD5(String MD5) {
        this.MD5 = MD5;
    }

    /**
     * Get 安卓版本。
ANDROID10：默认值，安卓10
ANDROID12：安卓12
ANDROID14：安卓14 
     * @return AndroidVersion 安卓版本。
ANDROID10：默认值，安卓10
ANDROID12：安卓12
ANDROID14：安卓14
     */
    public String getAndroidVersion() {
        return this.AndroidVersion;
    }

    /**
     * Set 安卓版本。
ANDROID10：默认值，安卓10
ANDROID12：安卓12
ANDROID14：安卓14
     * @param AndroidVersion 安卓版本。
ANDROID10：默认值，安卓10
ANDROID12：安卓12
ANDROID14：安卓14
     */
    public void setAndroidVersion(String AndroidVersion) {
        this.AndroidVersion = AndroidVersion;
    }

    /**
     * Get 镜像可用区 
     * @return Zone 镜像可用区
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * Set 镜像可用区
     * @param Zone 镜像可用区
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public ImportAndroidInstanceImageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImportAndroidInstanceImageRequest(ImportAndroidInstanceImageRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.URL != null) {
            this.URL = new String(source.URL);
        }
        if (source.MD5 != null) {
            this.MD5 = new String(source.MD5);
        }
        if (source.AndroidVersion != null) {
            this.AndroidVersion = new String(source.AndroidVersion);
        }
        if (source.Zone != null) {
            this.Zone = new String(source.Zone);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "URL", this.URL);
        this.setParamSimple(map, prefix + "MD5", this.MD5);
        this.setParamSimple(map, prefix + "AndroidVersion", this.AndroidVersion);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

