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
package com.tencentcloudapi.scf.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Filter  extends AbstractModel{

    /**
    * filter.RetCode=not0 表示只返回错误日志，filter.RetCode=is0 表示只返回正确日志，无输入则返回所有日志。
    */
    @SerializedName("RetCode")
    @Expose
    private String RetCode;

    /**
     * 获取filter.RetCode=not0 表示只返回错误日志，filter.RetCode=is0 表示只返回正确日志，无输入则返回所有日志。
     * @return RetCode filter.RetCode=not0 表示只返回错误日志，filter.RetCode=is0 表示只返回正确日志，无输入则返回所有日志。
     */
    public String getRetCode() {
        return this.RetCode;
    }

    /**
     * 设置filter.RetCode=not0 表示只返回错误日志，filter.RetCode=is0 表示只返回正确日志，无输入则返回所有日志。
     * @param RetCode filter.RetCode=not0 表示只返回错误日志，filter.RetCode=is0 表示只返回正确日志，无输入则返回所有日志。
     */
    public void setRetCode(String RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);

    }
}

