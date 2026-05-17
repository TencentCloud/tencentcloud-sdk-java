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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CosActionInfo extends AbstractModel {

    /**
    * 接口名
    */
    @SerializedName("ActionName")
    @Expose
    private String ActionName;

    /**
    * 接口中文名
    */
    @SerializedName("ActionNameCn")
    @Expose
    private String ActionNameCn;

    /**
    * 接口描述
    */
    @SerializedName("ActionDescription")
    @Expose
    private String ActionDescription;

    /**
     * Get 接口名 
     * @return ActionName 接口名
     */
    public String getActionName() {
        return this.ActionName;
    }

    /**
     * Set 接口名
     * @param ActionName 接口名
     */
    public void setActionName(String ActionName) {
        this.ActionName = ActionName;
    }

    /**
     * Get 接口中文名 
     * @return ActionNameCn 接口中文名
     */
    public String getActionNameCn() {
        return this.ActionNameCn;
    }

    /**
     * Set 接口中文名
     * @param ActionNameCn 接口中文名
     */
    public void setActionNameCn(String ActionNameCn) {
        this.ActionNameCn = ActionNameCn;
    }

    /**
     * Get 接口描述 
     * @return ActionDescription 接口描述
     */
    public String getActionDescription() {
        return this.ActionDescription;
    }

    /**
     * Set 接口描述
     * @param ActionDescription 接口描述
     */
    public void setActionDescription(String ActionDescription) {
        this.ActionDescription = ActionDescription;
    }

    public CosActionInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CosActionInfo(CosActionInfo source) {
        if (source.ActionName != null) {
            this.ActionName = new String(source.ActionName);
        }
        if (source.ActionNameCn != null) {
            this.ActionNameCn = new String(source.ActionNameCn);
        }
        if (source.ActionDescription != null) {
            this.ActionDescription = new String(source.ActionDescription);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ActionName", this.ActionName);
        this.setParamSimple(map, prefix + "ActionNameCn", this.ActionNameCn);
        this.setParamSimple(map, prefix + "ActionDescription", this.ActionDescription);

    }
}

