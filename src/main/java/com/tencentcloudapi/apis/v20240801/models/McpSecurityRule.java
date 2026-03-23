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
package com.tencentcloudapi.apis.v20240801.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class McpSecurityRule extends AbstractModel {

    /**
    * 规则ID
    */
    @SerializedName("ID")
    @Expose
    private String ID;

    /**
    * 状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 处置动作
    */
    @SerializedName("Act")
    @Expose
    private String Act;

    /**
     * Get 规则ID 
     * @return ID 规则ID
     */
    public String getID() {
        return this.ID;
    }

    /**
     * Set 规则ID
     * @param ID 规则ID
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Get 状态 
     * @return Status 状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 状态
     * @param Status 状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 处置动作 
     * @return Act 处置动作
     */
    public String getAct() {
        return this.Act;
    }

    /**
     * Set 处置动作
     * @param Act 处置动作
     */
    public void setAct(String Act) {
        this.Act = Act;
    }

    public McpSecurityRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public McpSecurityRule(McpSecurityRule source) {
        if (source.ID != null) {
            this.ID = new String(source.ID);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.Act != null) {
            this.Act = new String(source.Act);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ID", this.ID);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Act", this.Act);

    }
}

