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
package com.tencentcloudapi.habo.v20181203.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class StartAnalyseRequest extends AbstractModel{

    /**
    * 购买服务后获得的授权帐号，用于保证请求有效性
    */
    @SerializedName("Pk")
    @Expose
    private String Pk;

    /**
    * 样本md5，用于对下载获得的样本完整性进行校验
    */
    @SerializedName("Md5")
    @Expose
    private String Md5;

    /**
    * 待分析样本下载地址
    */
    @SerializedName("DlUrl")
    @Expose
    private String DlUrl;

    /**
     * Get 购买服务后获得的授权帐号，用于保证请求有效性 
     * @return Pk 购买服务后获得的授权帐号，用于保证请求有效性
     */
    public String getPk() {
        return this.Pk;
    }

    /**
     * Set 购买服务后获得的授权帐号，用于保证请求有效性
     * @param Pk 购买服务后获得的授权帐号，用于保证请求有效性
     */
    public void setPk(String Pk) {
        this.Pk = Pk;
    }

    /**
     * Get 样本md5，用于对下载获得的样本完整性进行校验 
     * @return Md5 样本md5，用于对下载获得的样本完整性进行校验
     */
    public String getMd5() {
        return this.Md5;
    }

    /**
     * Set 样本md5，用于对下载获得的样本完整性进行校验
     * @param Md5 样本md5，用于对下载获得的样本完整性进行校验
     */
    public void setMd5(String Md5) {
        this.Md5 = Md5;
    }

    /**
     * Get 待分析样本下载地址 
     * @return DlUrl 待分析样本下载地址
     */
    public String getDlUrl() {
        return this.DlUrl;
    }

    /**
     * Set 待分析样本下载地址
     * @param DlUrl 待分析样本下载地址
     */
    public void setDlUrl(String DlUrl) {
        this.DlUrl = DlUrl;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Pk", this.Pk);
        this.setParamSimple(map, prefix + "Md5", this.Md5);
        this.setParamSimple(map, prefix + "DlUrl", this.DlUrl);

    }
}

