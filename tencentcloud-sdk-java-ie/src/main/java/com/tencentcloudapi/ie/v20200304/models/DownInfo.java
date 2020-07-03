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
package com.tencentcloudapi.ie.v20200304.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DownInfo extends AbstractModel{

    /**
    * 下载类型，可选值： 
0：UrlInfo； 
1：CosInfo。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * Url形式下载信息，当Type等于0时必选。
    */
    @SerializedName("UrlInfo")
    @Expose
    private UrlInfo UrlInfo;

    /**
    * Cos形式下载信息，当Type等于1时必选。
    */
    @SerializedName("CosInfo")
    @Expose
    private CosInfo CosInfo;

    /**
     * Get 下载类型，可选值： 
0：UrlInfo； 
1：CosInfo。 
     * @return Type 下载类型，可选值： 
0：UrlInfo； 
1：CosInfo。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 下载类型，可选值： 
0：UrlInfo； 
1：CosInfo。
     * @param Type 下载类型，可选值： 
0：UrlInfo； 
1：CosInfo。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get Url形式下载信息，当Type等于0时必选。 
     * @return UrlInfo Url形式下载信息，当Type等于0时必选。
     */
    public UrlInfo getUrlInfo() {
        return this.UrlInfo;
    }

    /**
     * Set Url形式下载信息，当Type等于0时必选。
     * @param UrlInfo Url形式下载信息，当Type等于0时必选。
     */
    public void setUrlInfo(UrlInfo UrlInfo) {
        this.UrlInfo = UrlInfo;
    }

    /**
     * Get Cos形式下载信息，当Type等于1时必选。 
     * @return CosInfo Cos形式下载信息，当Type等于1时必选。
     */
    public CosInfo getCosInfo() {
        return this.CosInfo;
    }

    /**
     * Set Cos形式下载信息，当Type等于1时必选。
     * @param CosInfo Cos形式下载信息，当Type等于1时必选。
     */
    public void setCosInfo(CosInfo CosInfo) {
        this.CosInfo = CosInfo;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamObj(map, prefix + "UrlInfo.", this.UrlInfo);
        this.setParamObj(map, prefix + "CosInfo.", this.CosInfo);

    }
}

