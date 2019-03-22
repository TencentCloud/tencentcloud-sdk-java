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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCardRequest  extends AbstractModel{

    /**
    * 应用id
    */
    @SerializedName("Sdkappid")
    @Expose
    private Integer Sdkappid;

    /**
    * 卡片id
    */
    @SerializedName("Iccid")
    @Expose
    private String Iccid;

    /**
     * 获取应用id
     * @return Sdkappid 应用id
     */
    public Integer getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * 设置应用id
     * @param Sdkappid 应用id
     */
    public void setSdkappid(Integer Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * 获取卡片id
     * @return Iccid 卡片id
     */
    public String getIccid() {
        return this.Iccid;
    }

    /**
     * 设置卡片id
     * @param Iccid 卡片id
     */
    public void setIccid(String Iccid) {
        this.Iccid = Iccid;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamSimple(map, prefix + "Iccid", this.Iccid);

    }
}

