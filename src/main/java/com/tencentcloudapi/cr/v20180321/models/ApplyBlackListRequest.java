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

public class ApplyBlackListRequest  extends AbstractModel{

    /**
    * 模块
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作
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
     * 获取模块
     * @return Module 模块
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块
     * @param Module 模块
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作
     * @return Operation 操作
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作
     * @param Operation 操作
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取黑名单列表
     * @return BlackList 黑名单列表
     */
    public SingleBlackApply [] getBlackList() {
        return this.BlackList;
    }

    /**
     * 设置黑名单列表
     * @param BlackList 黑名单列表
     */
    public void setBlackList(SingleBlackApply [] BlackList) {
        this.BlackList = BlackList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "BlackList.", this.BlackList);

    }
}

