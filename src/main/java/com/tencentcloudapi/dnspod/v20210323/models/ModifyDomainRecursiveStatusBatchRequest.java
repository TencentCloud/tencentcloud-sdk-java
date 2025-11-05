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
package com.tencentcloudapi.dnspod.v20210323.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyDomainRecursiveStatusBatchRequest extends AbstractModel {

    /**
    * 域名列表
    */
    @SerializedName("DomainList")
    @Expose
    private String [] DomainList;

    /**
    * ENABLE-开启；DISABLE-关闭。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * Get 域名列表 
     * @return DomainList 域名列表
     */
    public String [] getDomainList() {
        return this.DomainList;
    }

    /**
     * Set 域名列表
     * @param DomainList 域名列表
     */
    public void setDomainList(String [] DomainList) {
        this.DomainList = DomainList;
    }

    /**
     * Get ENABLE-开启；DISABLE-关闭。 
     * @return Status ENABLE-开启；DISABLE-关闭。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set ENABLE-开启；DISABLE-关闭。
     * @param Status ENABLE-开启；DISABLE-关闭。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    public ModifyDomainRecursiveStatusBatchRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDomainRecursiveStatusBatchRequest(ModifyDomainRecursiveStatusBatchRequest source) {
        if (source.DomainList != null) {
            this.DomainList = new String[source.DomainList.length];
            for (int i = 0; i < source.DomainList.length; i++) {
                this.DomainList[i] = new String(source.DomainList[i]);
            }
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DomainList.", this.DomainList);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

