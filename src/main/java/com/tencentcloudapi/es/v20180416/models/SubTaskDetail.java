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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SubTaskDetail  extends AbstractModel{

    /**
    * 子任务名
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 子任务结果
    */
    @SerializedName("Result")
    @Expose
    private Boolean Result;

    /**
    * 子任务错误信息
    */
    @SerializedName("ErrMsg")
    @Expose
    private String ErrMsg;

    /**
     * 获取子任务名
     * @return Name 子任务名
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置子任务名
     * @param Name 子任务名
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取子任务结果
     * @return Result 子任务结果
     */
    public Boolean getResult() {
        return this.Result;
    }

    /**
     * 设置子任务结果
     * @param Result 子任务结果
     */
    public void setResult(Boolean Result) {
        this.Result = Result;
    }

    /**
     * 获取子任务错误信息
     * @return ErrMsg 子任务错误信息
     */
    public String getErrMsg() {
        return this.ErrMsg;
    }

    /**
     * 设置子任务错误信息
     * @param ErrMsg 子任务错误信息
     */
    public void setErrMsg(String ErrMsg) {
        this.ErrMsg = ErrMsg;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "ErrMsg", this.ErrMsg);

    }
}

