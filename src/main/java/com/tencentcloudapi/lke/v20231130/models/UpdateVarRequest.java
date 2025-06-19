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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpdateVarRequest extends AbstractModel {

    /**
    * 应用ID
    */
    @SerializedName("AppBizId")
    @Expose
    private String AppBizId;

    /**
    * 变量ID
    */
    @SerializedName("VarId")
    @Expose
    private String VarId;

    /**
    * 变量名称，最大支持50个字符
    */
    @SerializedName("VarName")
    @Expose
    private String VarName;

    /**
    * 参数描述
    */
    @SerializedName("VarDesc")
    @Expose
    private String VarDesc;

    /**
    * 参数类型
    */
    @SerializedName("VarType")
    @Expose
    private String VarType;

    /**
    * 自定义变量默认值
    */
    @SerializedName("VarDefaultValue")
    @Expose
    private String VarDefaultValue;

    /**
    * 自定义变量文件默认名称
    */
    @SerializedName("VarDefaultFileName")
    @Expose
    private String VarDefaultFileName;

    /**
     * Get 应用ID 
     * @return AppBizId 应用ID
     */
    public String getAppBizId() {
        return this.AppBizId;
    }

    /**
     * Set 应用ID
     * @param AppBizId 应用ID
     */
    public void setAppBizId(String AppBizId) {
        this.AppBizId = AppBizId;
    }

    /**
     * Get 变量ID 
     * @return VarId 变量ID
     */
    public String getVarId() {
        return this.VarId;
    }

    /**
     * Set 变量ID
     * @param VarId 变量ID
     */
    public void setVarId(String VarId) {
        this.VarId = VarId;
    }

    /**
     * Get 变量名称，最大支持50个字符 
     * @return VarName 变量名称，最大支持50个字符
     */
    public String getVarName() {
        return this.VarName;
    }

    /**
     * Set 变量名称，最大支持50个字符
     * @param VarName 变量名称，最大支持50个字符
     */
    public void setVarName(String VarName) {
        this.VarName = VarName;
    }

    /**
     * Get 参数描述 
     * @return VarDesc 参数描述
     */
    public String getVarDesc() {
        return this.VarDesc;
    }

    /**
     * Set 参数描述
     * @param VarDesc 参数描述
     */
    public void setVarDesc(String VarDesc) {
        this.VarDesc = VarDesc;
    }

    /**
     * Get 参数类型 
     * @return VarType 参数类型
     */
    public String getVarType() {
        return this.VarType;
    }

    /**
     * Set 参数类型
     * @param VarType 参数类型
     */
    public void setVarType(String VarType) {
        this.VarType = VarType;
    }

    /**
     * Get 自定义变量默认值 
     * @return VarDefaultValue 自定义变量默认值
     */
    public String getVarDefaultValue() {
        return this.VarDefaultValue;
    }

    /**
     * Set 自定义变量默认值
     * @param VarDefaultValue 自定义变量默认值
     */
    public void setVarDefaultValue(String VarDefaultValue) {
        this.VarDefaultValue = VarDefaultValue;
    }

    /**
     * Get 自定义变量文件默认名称 
     * @return VarDefaultFileName 自定义变量文件默认名称
     */
    public String getVarDefaultFileName() {
        return this.VarDefaultFileName;
    }

    /**
     * Set 自定义变量文件默认名称
     * @param VarDefaultFileName 自定义变量文件默认名称
     */
    public void setVarDefaultFileName(String VarDefaultFileName) {
        this.VarDefaultFileName = VarDefaultFileName;
    }

    public UpdateVarRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UpdateVarRequest(UpdateVarRequest source) {
        if (source.AppBizId != null) {
            this.AppBizId = new String(source.AppBizId);
        }
        if (source.VarId != null) {
            this.VarId = new String(source.VarId);
        }
        if (source.VarName != null) {
            this.VarName = new String(source.VarName);
        }
        if (source.VarDesc != null) {
            this.VarDesc = new String(source.VarDesc);
        }
        if (source.VarType != null) {
            this.VarType = new String(source.VarType);
        }
        if (source.VarDefaultValue != null) {
            this.VarDefaultValue = new String(source.VarDefaultValue);
        }
        if (source.VarDefaultFileName != null) {
            this.VarDefaultFileName = new String(source.VarDefaultFileName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppBizId", this.AppBizId);
        this.setParamSimple(map, prefix + "VarId", this.VarId);
        this.setParamSimple(map, prefix + "VarName", this.VarName);
        this.setParamSimple(map, prefix + "VarDesc", this.VarDesc);
        this.setParamSimple(map, prefix + "VarType", this.VarType);
        this.setParamSimple(map, prefix + "VarDefaultValue", this.VarDefaultValue);
        this.setParamSimple(map, prefix + "VarDefaultFileName", this.VarDefaultFileName);

    }
}

