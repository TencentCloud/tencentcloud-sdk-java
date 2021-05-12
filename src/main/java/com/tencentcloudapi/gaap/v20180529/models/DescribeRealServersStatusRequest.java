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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeRealServersStatusRequest extends AbstractModel{

    /**
    * 源站ID列表
    */
    @SerializedName("RealServerIds")
    @Expose
    private String [] RealServerIds;

    /**
     * Get 源站ID列表 
     * @return RealServerIds 源站ID列表
     */
    public String [] getRealServerIds() {
        return this.RealServerIds;
    }

    /**
     * Set 源站ID列表
     * @param RealServerIds 源站ID列表
     */
    public void setRealServerIds(String [] RealServerIds) {
        this.RealServerIds = RealServerIds;
    }

    public DescribeRealServersStatusRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeRealServersStatusRequest(DescribeRealServersStatusRequest source) {
        if (source.RealServerIds != null) {
            this.RealServerIds = new String[source.RealServerIds.length];
            for (int i = 0; i < source.RealServerIds.length; i++) {
                this.RealServerIds[i] = new String(source.RealServerIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RealServerIds.", this.RealServerIds);

    }
}

