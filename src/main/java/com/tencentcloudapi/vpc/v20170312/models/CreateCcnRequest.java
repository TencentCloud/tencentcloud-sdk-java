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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateCcnRequest  extends AbstractModel{

    /**
    * CCN名称，最大长度不能超过60个字节。
    */
    @SerializedName("CcnName")
    @Expose
    private String CcnName;

    /**
    * CCN描述信息，最大长度不能超过100个字节。
    */
    @SerializedName("CcnDescription")
    @Expose
    private String CcnDescription;

    /**
    * CCN服务质量，'PT'：白金，'AU'：金，'AG'：银，默认为‘AU’。
    */
    @SerializedName("QosLevel")
    @Expose
    private String QosLevel;

    /**
     * 获取CCN名称，最大长度不能超过60个字节。
     * @return CcnName CCN名称，最大长度不能超过60个字节。
     */
    public String getCcnName() {
        return this.CcnName;
    }

    /**
     * 设置CCN名称，最大长度不能超过60个字节。
     * @param CcnName CCN名称，最大长度不能超过60个字节。
     */
    public void setCcnName(String CcnName) {
        this.CcnName = CcnName;
    }

    /**
     * 获取CCN描述信息，最大长度不能超过100个字节。
     * @return CcnDescription CCN描述信息，最大长度不能超过100个字节。
     */
    public String getCcnDescription() {
        return this.CcnDescription;
    }

    /**
     * 设置CCN描述信息，最大长度不能超过100个字节。
     * @param CcnDescription CCN描述信息，最大长度不能超过100个字节。
     */
    public void setCcnDescription(String CcnDescription) {
        this.CcnDescription = CcnDescription;
    }

    /**
     * 获取CCN服务质量，'PT'：白金，'AU'：金，'AG'：银，默认为‘AU’。
     * @return QosLevel CCN服务质量，'PT'：白金，'AU'：金，'AG'：银，默认为‘AU’。
     */
    public String getQosLevel() {
        return this.QosLevel;
    }

    /**
     * 设置CCN服务质量，'PT'：白金，'AU'：金，'AG'：银，默认为‘AU’。
     * @param QosLevel CCN服务质量，'PT'：白金，'AU'：金，'AG'：银，默认为‘AU’。
     */
    public void setQosLevel(String QosLevel) {
        this.QosLevel = QosLevel;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CcnName", this.CcnName);
        this.setParamSimple(map, prefix + "CcnDescription", this.CcnDescription);
        this.setParamSimple(map, prefix + "QosLevel", this.QosLevel);

    }
}

