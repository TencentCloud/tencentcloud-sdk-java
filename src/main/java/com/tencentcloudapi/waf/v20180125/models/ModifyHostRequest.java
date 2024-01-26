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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyHostRequest extends AbstractModel {

    /**
    * 编辑的域名配置信息
    */
    @SerializedName("Host")
    @Expose
    private HostRecord Host;

    /**
    * 实例唯一ID
    */
    @SerializedName("InstanceID")
    @Expose
    private String InstanceID;

    /**
     * Get 编辑的域名配置信息 
     * @return Host 编辑的域名配置信息
     */
    public HostRecord getHost() {
        return this.Host;
    }

    /**
     * Set 编辑的域名配置信息
     * @param Host 编辑的域名配置信息
     */
    public void setHost(HostRecord Host) {
        this.Host = Host;
    }

    /**
     * Get 实例唯一ID 
     * @return InstanceID 实例唯一ID
     */
    public String getInstanceID() {
        return this.InstanceID;
    }

    /**
     * Set 实例唯一ID
     * @param InstanceID 实例唯一ID
     */
    public void setInstanceID(String InstanceID) {
        this.InstanceID = InstanceID;
    }

    public ModifyHostRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyHostRequest(ModifyHostRequest source) {
        if (source.Host != null) {
            this.Host = new HostRecord(source.Host);
        }
        if (source.InstanceID != null) {
            this.InstanceID = new String(source.InstanceID);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Host.", this.Host);
        this.setParamSimple(map, prefix + "InstanceID", this.InstanceID);

    }
}

