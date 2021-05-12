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

public class ApplyBlackListDataRequest extends AbstractModel{

    /**
    * 模块名，AiApi
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，ApplyBlackListData
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 黑名单列表
    */
    @SerializedName("BlackList")
    @Expose
    private BlackListData [] BlackList;

    /**
     * Get 模块名，AiApi 
     * @return Module 模块名，AiApi
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * Set 模块名，AiApi
     * @param Module 模块名，AiApi
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * Get 操作名，ApplyBlackListData 
     * @return Operation 操作名，ApplyBlackListData
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * Set 操作名，ApplyBlackListData
     * @param Operation 操作名，ApplyBlackListData
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * Get 黑名单列表 
     * @return BlackList 黑名单列表
     */
    public BlackListData [] getBlackList() {
        return this.BlackList;
    }

    /**
     * Set 黑名单列表
     * @param BlackList 黑名单列表
     */
    public void setBlackList(BlackListData [] BlackList) {
        this.BlackList = BlackList;
    }

    public ApplyBlackListDataRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplyBlackListDataRequest(ApplyBlackListDataRequest source) {
        if (source.Module != null) {
            this.Module = new String(source.Module);
        }
        if (source.Operation != null) {
            this.Operation = new String(source.Operation);
        }
        if (source.BlackList != null) {
            this.BlackList = new BlackListData[source.BlackList.length];
            for (int i = 0; i < source.BlackList.length; i++) {
                this.BlackList[i] = new BlackListData(source.BlackList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamArrayObj(map, prefix + "BlackList.", this.BlackList);

    }
}

