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
package com.tencentcloudapi.essbasic.v20201222.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeSubOrganizationsRequest extends AbstractModel {

    /**
    * 调用方信息
    */
    @SerializedName("Caller")
    @Expose
    private Caller Caller;

    /**
    * 子机构ID数组
    */
    @SerializedName("SubOrganizationIds")
    @Expose
    private String [] SubOrganizationIds;

    /**
     * Get 调用方信息 
     * @return Caller 调用方信息
     */
    public Caller getCaller() {
        return this.Caller;
    }

    /**
     * Set 调用方信息
     * @param Caller 调用方信息
     */
    public void setCaller(Caller Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 子机构ID数组 
     * @return SubOrganizationIds 子机构ID数组
     */
    public String [] getSubOrganizationIds() {
        return this.SubOrganizationIds;
    }

    /**
     * Set 子机构ID数组
     * @param SubOrganizationIds 子机构ID数组
     */
    public void setSubOrganizationIds(String [] SubOrganizationIds) {
        this.SubOrganizationIds = SubOrganizationIds;
    }

    public DescribeSubOrganizationsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeSubOrganizationsRequest(DescribeSubOrganizationsRequest source) {
        if (source.Caller != null) {
            this.Caller = new Caller(source.Caller);
        }
        if (source.SubOrganizationIds != null) {
            this.SubOrganizationIds = new String[source.SubOrganizationIds.length];
            for (int i = 0; i < source.SubOrganizationIds.length; i++) {
                this.SubOrganizationIds[i] = new String(source.SubOrganizationIds[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Caller.", this.Caller);
        this.setParamArraySimple(map, prefix + "SubOrganizationIds.", this.SubOrganizationIds);

    }
}

