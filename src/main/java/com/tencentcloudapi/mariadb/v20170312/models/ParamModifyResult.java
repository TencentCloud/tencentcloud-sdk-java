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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParamModifyResult extends AbstractModel{

    /**
    * 修改参数名字
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
    */
    @SerializedName("Code")
    @Expose
    private Long Code;

    /**
     * Get 修改参数名字 
     * @return Param 修改参数名字
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * Set 修改参数名字
     * @param Param 修改参数名字
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * Get 参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法 
     * @return Code 参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
     */
    public Long getCode() {
        return this.Code;
    }

    /**
     * Set 参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
     * @param Code 参数修改结果。0表示修改成功；-1表示修改失败；-2表示该参数值非法
     */
    public void setCode(Long Code) {
        this.Code = Code;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Code", this.Code);

    }
}

