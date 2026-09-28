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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CloudAppFilter extends AbstractModel {

    /**
    * <p>云应用过滤列表</p>
    */
    @SerializedName("ServiceNameList")
    @Expose
    private String [] ServiceNameList;

    /**
     * Get <p>云应用过滤列表</p> 
     * @return ServiceNameList <p>云应用过滤列表</p>
     */
    public String [] getServiceNameList() {
        return this.ServiceNameList;
    }

    /**
     * Set <p>云应用过滤列表</p>
     * @param ServiceNameList <p>云应用过滤列表</p>
     */
    public void setServiceNameList(String [] ServiceNameList) {
        this.ServiceNameList = ServiceNameList;
    }

    public CloudAppFilter() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CloudAppFilter(CloudAppFilter source) {
        if (source.ServiceNameList != null) {
            this.ServiceNameList = new String[source.ServiceNameList.length];
            for (int i = 0; i < source.ServiceNameList.length; i++) {
                this.ServiceNameList[i] = new String(source.ServiceNameList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ServiceNameList.", this.ServiceNameList);

    }
}

