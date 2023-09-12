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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VerifyDomainOwnershipForConsoleRequest extends AbstractModel{

    /**
    * 需要接入点播的域名。
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 需要开启加速的区域： <li>Mainland: 中国大陆地区</li> <li>Internation: 海外地区及港澳台</li> <li>Global: 全球</li> 不填会根据用户注册腾讯云时的地域信息自动判断 Mainland 或 Internation	
    */
    @SerializedName("AccelerateArea")
    @Expose
    private String AccelerateArea;

    /**
     * Get 需要接入点播的域名。 
     * @return Domain 需要接入点播的域名。
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * Set 需要接入点播的域名。
     * @param Domain 需要接入点播的域名。
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * Get 需要开启加速的区域： <li>Mainland: 中国大陆地区</li> <li>Internation: 海外地区及港澳台</li> <li>Global: 全球</li> 不填会根据用户注册腾讯云时的地域信息自动判断 Mainland 或 Internation	 
     * @return AccelerateArea 需要开启加速的区域： <li>Mainland: 中国大陆地区</li> <li>Internation: 海外地区及港澳台</li> <li>Global: 全球</li> 不填会根据用户注册腾讯云时的地域信息自动判断 Mainland 或 Internation	
     */
    public String getAccelerateArea() {
        return this.AccelerateArea;
    }

    /**
     * Set 需要开启加速的区域： <li>Mainland: 中国大陆地区</li> <li>Internation: 海外地区及港澳台</li> <li>Global: 全球</li> 不填会根据用户注册腾讯云时的地域信息自动判断 Mainland 或 Internation	
     * @param AccelerateArea 需要开启加速的区域： <li>Mainland: 中国大陆地区</li> <li>Internation: 海外地区及港澳台</li> <li>Global: 全球</li> 不填会根据用户注册腾讯云时的地域信息自动判断 Mainland 或 Internation	
     */
    public void setAccelerateArea(String AccelerateArea) {
        this.AccelerateArea = AccelerateArea;
    }

    public VerifyDomainOwnershipForConsoleRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VerifyDomainOwnershipForConsoleRequest(VerifyDomainOwnershipForConsoleRequest source) {
        if (source.Domain != null) {
            this.Domain = new String(source.Domain);
        }
        if (source.AccelerateArea != null) {
            this.AccelerateArea = new String(source.AccelerateArea);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "AccelerateArea", this.AccelerateArea);

    }
}

