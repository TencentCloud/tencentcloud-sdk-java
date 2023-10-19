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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IOSInfo extends AbstractModel {

    /**
    * info.plist的url，必须保证不用权限校验就可以下载
    */
    @SerializedName("InfoPListUrl")
    @Expose
    private String InfoPListUrl;

    /**
    * info.plist文件的大小
    */
    @SerializedName("InfoPListSize")
    @Expose
    private Long InfoPListSize;

    /**
    * info.plist文件的md5
    */
    @SerializedName("InfoPListMd5")
    @Expose
    private String InfoPListMd5;

    /**
    * release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器
    */
    @SerializedName("BuildType")
    @Expose
    private String BuildType;

    /**
     * Get info.plist的url，必须保证不用权限校验就可以下载 
     * @return InfoPListUrl info.plist的url，必须保证不用权限校验就可以下载
     */
    public String getInfoPListUrl() {
        return this.InfoPListUrl;
    }

    /**
     * Set info.plist的url，必须保证不用权限校验就可以下载
     * @param InfoPListUrl info.plist的url，必须保证不用权限校验就可以下载
     */
    public void setInfoPListUrl(String InfoPListUrl) {
        this.InfoPListUrl = InfoPListUrl;
    }

    /**
     * Get info.plist文件的大小 
     * @return InfoPListSize info.plist文件的大小
     */
    public Long getInfoPListSize() {
        return this.InfoPListSize;
    }

    /**
     * Set info.plist文件的大小
     * @param InfoPListSize info.plist文件的大小
     */
    public void setInfoPListSize(Long InfoPListSize) {
        this.InfoPListSize = InfoPListSize;
    }

    /**
     * Get info.plist文件的md5 
     * @return InfoPListMd5 info.plist文件的md5
     */
    public String getInfoPListMd5() {
        return this.InfoPListMd5;
    }

    /**
     * Set info.plist文件的md5
     * @param InfoPListMd5 info.plist文件的md5
     */
    public void setInfoPListMd5(String InfoPListMd5) {
        this.InfoPListMd5 = InfoPListMd5;
    }

    /**
     * Get release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器 
     * @return BuildType release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器
     */
    public String getBuildType() {
        return this.BuildType;
    }

    /**
     * Set release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器
     * @param BuildType release: 需要INFO-PLIST文件，会生成工具部署安装包，并带有license文件，绑定机器；nobind不需要INFO-PLIST文件，不绑定机器
     */
    public void setBuildType(String BuildType) {
        this.BuildType = BuildType;
    }

    public IOSInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IOSInfo(IOSInfo source) {
        if (source.InfoPListUrl != null) {
            this.InfoPListUrl = new String(source.InfoPListUrl);
        }
        if (source.InfoPListSize != null) {
            this.InfoPListSize = new Long(source.InfoPListSize);
        }
        if (source.InfoPListMd5 != null) {
            this.InfoPListMd5 = new String(source.InfoPListMd5);
        }
        if (source.BuildType != null) {
            this.BuildType = new String(source.BuildType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InfoPListUrl", this.InfoPListUrl);
        this.setParamSimple(map, prefix + "InfoPListSize", this.InfoPListSize);
        this.setParamSimple(map, prefix + "InfoPListMd5", this.InfoPListMd5);
        this.setParamSimple(map, prefix + "BuildType", this.BuildType);

    }
}

