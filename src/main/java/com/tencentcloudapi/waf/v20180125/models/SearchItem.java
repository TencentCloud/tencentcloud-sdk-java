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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SearchItem extends AbstractModel {

    /**
    * 日志开关
    */
    @SerializedName("ClsStatus")
    @Expose
    private String ClsStatus;

    /**
    * waf开关
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 流量模式
    */
    @SerializedName("FlowMode")
    @Expose
    private String FlowMode;

    /**
     * Get 日志开关 
     * @return ClsStatus 日志开关
     */
    public String getClsStatus() {
        return this.ClsStatus;
    }

    /**
     * Set 日志开关
     * @param ClsStatus 日志开关
     */
    public void setClsStatus(String ClsStatus) {
        this.ClsStatus = ClsStatus;
    }

    /**
     * Get waf开关 
     * @return Status waf开关
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set waf开关
     * @param Status waf开关
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 流量模式 
     * @return FlowMode 流量模式
     */
    public String getFlowMode() {
        return this.FlowMode;
    }

    /**
     * Set 流量模式
     * @param FlowMode 流量模式
     */
    public void setFlowMode(String FlowMode) {
        this.FlowMode = FlowMode;
    }

    public SearchItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SearchItem(SearchItem source) {
        if (source.ClsStatus != null) {
            this.ClsStatus = new String(source.ClsStatus);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.FlowMode != null) {
            this.FlowMode = new String(source.FlowMode);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClsStatus", this.ClsStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "FlowMode", this.FlowMode);

    }
}

