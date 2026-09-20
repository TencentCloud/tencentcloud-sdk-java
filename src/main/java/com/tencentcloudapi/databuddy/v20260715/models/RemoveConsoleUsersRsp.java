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
package com.tencentcloudapi.databuddy.v20260715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RemoveConsoleUsersRsp extends AbstractModel {

    /**
    * <p>请求已完成处理；即使部分失败也为 true，逐个结果以 SuccessUins/FailItems 为准</p>
    */
    @SerializedName("Status")
    @Expose
    private Boolean Status;

    /**
    * <p>删除成功的用户 UIN 列表</p>
    */
    @SerializedName("SuccessUins")
    @Expose
    private String [] SuccessUins;

    /**
    * <p>失败项列表（Item 为用户 UIN，FailReason 为失败原因）</p>
    */
    @SerializedName("FailItems")
    @Expose
    private CommonFailItem [] FailItems;

    /**
     * Get <p>请求已完成处理；即使部分失败也为 true，逐个结果以 SuccessUins/FailItems 为准</p> 
     * @return Status <p>请求已完成处理；即使部分失败也为 true，逐个结果以 SuccessUins/FailItems 为准</p>
     */
    public Boolean getStatus() {
        return this.Status;
    }

    /**
     * Set <p>请求已完成处理；即使部分失败也为 true，逐个结果以 SuccessUins/FailItems 为准</p>
     * @param Status <p>请求已完成处理；即使部分失败也为 true，逐个结果以 SuccessUins/FailItems 为准</p>
     */
    public void setStatus(Boolean Status) {
        this.Status = Status;
    }

    /**
     * Get <p>删除成功的用户 UIN 列表</p> 
     * @return SuccessUins <p>删除成功的用户 UIN 列表</p>
     */
    public String [] getSuccessUins() {
        return this.SuccessUins;
    }

    /**
     * Set <p>删除成功的用户 UIN 列表</p>
     * @param SuccessUins <p>删除成功的用户 UIN 列表</p>
     */
    public void setSuccessUins(String [] SuccessUins) {
        this.SuccessUins = SuccessUins;
    }

    /**
     * Get <p>失败项列表（Item 为用户 UIN，FailReason 为失败原因）</p> 
     * @return FailItems <p>失败项列表（Item 为用户 UIN，FailReason 为失败原因）</p>
     */
    public CommonFailItem [] getFailItems() {
        return this.FailItems;
    }

    /**
     * Set <p>失败项列表（Item 为用户 UIN，FailReason 为失败原因）</p>
     * @param FailItems <p>失败项列表（Item 为用户 UIN，FailReason 为失败原因）</p>
     */
    public void setFailItems(CommonFailItem [] FailItems) {
        this.FailItems = FailItems;
    }

    public RemoveConsoleUsersRsp() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RemoveConsoleUsersRsp(RemoveConsoleUsersRsp source) {
        if (source.Status != null) {
            this.Status = new Boolean(source.Status);
        }
        if (source.SuccessUins != null) {
            this.SuccessUins = new String[source.SuccessUins.length];
            for (int i = 0; i < source.SuccessUins.length; i++) {
                this.SuccessUins[i] = new String(source.SuccessUins[i]);
            }
        }
        if (source.FailItems != null) {
            this.FailItems = new CommonFailItem[source.FailItems.length];
            for (int i = 0; i < source.FailItems.length; i++) {
                this.FailItems[i] = new CommonFailItem(source.FailItems[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "SuccessUins.", this.SuccessUins);
        this.setParamArrayObj(map, prefix + "FailItems.", this.FailItems);

    }
}

