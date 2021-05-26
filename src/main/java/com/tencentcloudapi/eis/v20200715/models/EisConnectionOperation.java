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
package com.tencentcloudapi.eis.v20200715.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EisConnectionOperation extends AbstractModel{

    /**
    * 连接器操作名称
    */
    @SerializedName("OperationName")
    @Expose
    private String OperationName;

    /**
    * 连接器展示名称
    */
    @SerializedName("DisplayName")
    @Expose
    private String DisplayName;

    /**
    * 操作是否为触发器
    */
    @SerializedName("IsTrigger")
    @Expose
    private Boolean IsTrigger;

    /**
     * Get 连接器操作名称 
     * @return OperationName 连接器操作名称
     */
    public String getOperationName() {
        return this.OperationName;
    }

    /**
     * Set 连接器操作名称
     * @param OperationName 连接器操作名称
     */
    public void setOperationName(String OperationName) {
        this.OperationName = OperationName;
    }

    /**
     * Get 连接器展示名称 
     * @return DisplayName 连接器展示名称
     */
    public String getDisplayName() {
        return this.DisplayName;
    }

    /**
     * Set 连接器展示名称
     * @param DisplayName 连接器展示名称
     */
    public void setDisplayName(String DisplayName) {
        this.DisplayName = DisplayName;
    }

    /**
     * Get 操作是否为触发器 
     * @return IsTrigger 操作是否为触发器
     */
    public Boolean getIsTrigger() {
        return this.IsTrigger;
    }

    /**
     * Set 操作是否为触发器
     * @param IsTrigger 操作是否为触发器
     */
    public void setIsTrigger(Boolean IsTrigger) {
        this.IsTrigger = IsTrigger;
    }

    public EisConnectionOperation() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EisConnectionOperation(EisConnectionOperation source) {
        if (source.OperationName != null) {
            this.OperationName = new String(source.OperationName);
        }
        if (source.DisplayName != null) {
            this.DisplayName = new String(source.DisplayName);
        }
        if (source.IsTrigger != null) {
            this.IsTrigger = new Boolean(source.IsTrigger);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OperationName", this.OperationName);
        this.setParamSimple(map, prefix + "DisplayName", this.DisplayName);
        this.setParamSimple(map, prefix + "IsTrigger", this.IsTrigger);

    }
}

