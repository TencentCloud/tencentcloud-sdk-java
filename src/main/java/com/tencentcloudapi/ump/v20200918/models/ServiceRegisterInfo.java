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
package com.tencentcloudapi.ump.v20200918.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceRegisterInfo extends AbstractModel{

    /**
    * 当前服务的回调地址
    */
    @SerializedName("CgiUrl")
    @Expose
    private String CgiUrl;

    /**
    * 当前服务类型:
1: 多经服务
2: 相机误报警确认
3: 底图更新
    */
    @SerializedName("ServiceType")
    @Expose
    private Long ServiceType;

    /**
     * Get 当前服务的回调地址 
     * @return CgiUrl 当前服务的回调地址
     */
    public String getCgiUrl() {
        return this.CgiUrl;
    }

    /**
     * Set 当前服务的回调地址
     * @param CgiUrl 当前服务的回调地址
     */
    public void setCgiUrl(String CgiUrl) {
        this.CgiUrl = CgiUrl;
    }

    /**
     * Get 当前服务类型:
1: 多经服务
2: 相机误报警确认
3: 底图更新 
     * @return ServiceType 当前服务类型:
1: 多经服务
2: 相机误报警确认
3: 底图更新
     */
    public Long getServiceType() {
        return this.ServiceType;
    }

    /**
     * Set 当前服务类型:
1: 多经服务
2: 相机误报警确认
3: 底图更新
     * @param ServiceType 当前服务类型:
1: 多经服务
2: 相机误报警确认
3: 底图更新
     */
    public void setServiceType(Long ServiceType) {
        this.ServiceType = ServiceType;
    }

    public ServiceRegisterInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ServiceRegisterInfo(ServiceRegisterInfo source) {
        if (source.CgiUrl != null) {
            this.CgiUrl = new String(source.CgiUrl);
        }
        if (source.ServiceType != null) {
            this.ServiceType = new Long(source.ServiceType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CgiUrl", this.CgiUrl);
        this.setParamSimple(map, prefix + "ServiceType", this.ServiceType);

    }
}

