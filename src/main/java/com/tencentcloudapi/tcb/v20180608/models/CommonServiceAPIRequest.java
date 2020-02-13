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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommonServiceAPIRequest extends AbstractModel{

    /**
    * Service名，需要转发访问的接口名
    */
    @SerializedName("Service")
    @Expose
    private String Service;

    /**
    * 需要转发的云API参数，要转成JSON格式
    */
    @SerializedName("JSONData")
    @Expose
    private String JSONData;

    /**
     * Get Service名，需要转发访问的接口名 
     * @return Service Service名，需要转发访问的接口名
     */
    public String getService() {
        return this.Service;
    }

    /**
     * Set Service名，需要转发访问的接口名
     * @param Service Service名，需要转发访问的接口名
     */
    public void setService(String Service) {
        this.Service = Service;
    }

    /**
     * Get 需要转发的云API参数，要转成JSON格式 
     * @return JSONData 需要转发的云API参数，要转成JSON格式
     */
    public String getJSONData() {
        return this.JSONData;
    }

    /**
     * Set 需要转发的云API参数，要转成JSON格式
     * @param JSONData 需要转发的云API参数，要转成JSON格式
     */
    public void setJSONData(String JSONData) {
        this.JSONData = JSONData;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Service", this.Service);
        this.setParamSimple(map, prefix + "JSONData", this.JSONData);

    }
}

