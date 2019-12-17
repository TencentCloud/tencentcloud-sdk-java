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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplyBlackListRequest extends AbstractModel{

    /**
    * 模块名，本接口取值：account
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，本接口取值：ApplyBlackList
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 黑名单列表
    */
    @SerializedName("BlackList")
    @Expose
    private SingleBlackApply [] BlackList;

    /**
    * 实例ID，不传默认为系统分配的初始实例
    */
    @SerializedName("InstId")
    @Expose
    private String InstId;

    /**
     * Get 模块名，本接口取值：account 
     * @return Module 模块名，本接口取值：account
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，本接口取值：account
     * @param Module 模块名，本接口取值：account
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，本接口取值：ApplyBlackList 
     * @return Operation 操作名，本接口取值：ApplyBlackList
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，本接口取值：ApplyBlackList
     * @param Operation 操作名，本接口取值：ApplyBlackList
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 黑名单列表 
     * @return BlackList 黑名单列表
     */
    public SingleBlackApply [] getBlackList() {
        return this.BlackList;
    }

    /**
     * Set 黑名单列表
     * @param BlackList 黑名单列表
     */
    public void setBlackList(SingleBlackApply [] BlackList) {
        this.BlackList = BlackList;
    }

    /**
     * Get 实例ID，不传默认为系统分配的初始实例 
     * @return InstId 实例ID，不传默认为系统分配的初始实例
     */
    public String getInstId() {
        return this.InstId;
    }

    /**
     * Set 实例ID，不传默认为系统分配的初始实例
     * @param InstId 实例ID，不传默认为系统分配的初始实例
     */
    public void setInstId(String InstId) {
        this.InstId = InstId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "BlackList.", this.BlackList);
        this.setParamSimple(map, prefix + "InstId", this.InstId);

    }
}

