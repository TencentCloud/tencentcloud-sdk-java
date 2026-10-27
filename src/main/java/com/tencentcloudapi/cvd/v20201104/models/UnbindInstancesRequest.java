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
package com.tencentcloudapi.cvd.v20201104.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UnbindInstancesRequest extends AbstractModel {

    /**
    * 实例所在地域
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 解除绑定关系列表
    */
    @SerializedName("BindInfos")
    @Expose
    private BindInfo [] BindInfos;

    /**
     * Get 实例所在地域 
     * @return InstanceRegion 实例所在地域
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * Set 实例所在地域
     * @param InstanceRegion 实例所在地域
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * Get 解除绑定关系列表 
     * @return BindInfos 解除绑定关系列表
     */
    public BindInfo [] getBindInfos() {
        return this.BindInfos;
    }

    /**
     * Set 解除绑定关系列表
     * @param BindInfos 解除绑定关系列表
     */
    public void setBindInfos(BindInfo [] BindInfos) {
        this.BindInfos = BindInfos;
    }

    public UnbindInstancesRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UnbindInstancesRequest(UnbindInstancesRequest source) {
        if (source.InstanceRegion != null) {
            this.InstanceRegion = new String(source.InstanceRegion);
        }
        if (source.BindInfos != null) {
            this.BindInfos = new BindInfo[source.BindInfos.length];
            for (int i = 0; i < source.BindInfos.length; i++) {
                this.BindInfos[i] = new BindInfo(source.BindInfos[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamArrayObj(map, prefix + "BindInfos.", this.BindInfos);

    }
}

