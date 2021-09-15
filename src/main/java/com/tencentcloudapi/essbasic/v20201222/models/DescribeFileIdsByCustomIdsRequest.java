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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeFileIdsByCustomIdsRequest extends AbstractModel{

    /**
    * 调用方信息, OrganizationId必填
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 用户自定义ID
    */
    @SerializedName("CustomIds")
    @Expose
    private String [] CustomIds;

    /**
     * Get 调用方信息, OrganizationId必填 
     * @return Caller 调用方信息, OrganizationId必填
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息, OrganizationId必填
     * @param Caller 调用方信息, OrganizationId必填
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 用户自定义ID 
     * @return CustomIds 用户自定义ID
     */
    public String [] getCustomIds() {
        return this.CustomIds;
    }

    /**
     * Set 用户自定义ID
     * @param CustomIds 用户自定义ID
     */
    public void setCustomIds(String [] CustomIds) {
        this.CustomIds = CustomIds;
    }

    public DescribeFileIdsByCustomIdsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeFileIdsByCustomIdsRequest(DescribeFileIdsByCustomIdsRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.CustomIds != null) {
            this.CustomIds = new String[source.CustomIds.length];
            for (int i = 0; i < source.CustomIds.length; i++) {
                this.CustomIds[i] = new String(source.CustomIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamArraySimple(map, prefix + "CustomIds.", this.CustomIds);

    }
}

