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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyWebPageProtectSettingRequest extends AbstractModel{

    /**
    * 需要操作的类型1 目录名称 2 防护文件类型
    */
    @SerializedName("ModifyType")
    @Expose
    private Long ModifyType;

    /**
    * 提交值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
    * 配置对应的protect_path
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
     * Get 需要操作的类型1 目录名称 2 防护文件类型 
     * @return ModifyType 需要操作的类型1 目录名称 2 防护文件类型
     */
    public Long getModifyType() {
        return this.ModifyType;
    }

    /**
     * Set 需要操作的类型1 目录名称 2 防护文件类型
     * @param ModifyType 需要操作的类型1 目录名称 2 防护文件类型
     */
    public void setModifyType(Long ModifyType) {
        this.ModifyType = ModifyType;
    }

    /**
     * Get 提交值 
     * @return Value 提交值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * Set 提交值
     * @param Value 提交值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * Get 配置对应的protect_path 
     * @return Id 配置对应的protect_path
     */
    public String getId() {
        return this.Id;
    }

    /**
     * Set 配置对应的protect_path
     * @param Id 配置对应的protect_path
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    public ModifyWebPageProtectSettingRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyWebPageProtectSettingRequest(ModifyWebPageProtectSettingRequest source) {
        if (source.ModifyType != null) {
            this.ModifyType = new Long(source.ModifyType);
        }
        if (source.Value != null) {
            this.Value = new String(source.Value);
        }
        if (source.Id != null) {
            this.Id = new String(source.Id);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ModifyType", this.ModifyType);
        this.setParamSimple(map, prefix + "Value", this.Value);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

