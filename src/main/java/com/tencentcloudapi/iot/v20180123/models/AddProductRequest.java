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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddProductRequest  extends AbstractModel{

    /**
    * 产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 产品描述
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 鉴权模式（1：动态令牌，推荐使用动态令牌）
    */
    @SerializedName("AuthType")
    @Expose
    private Integer AuthType;

    /**
    * 数据模版（json数组）
    */
    @SerializedName("DataTemplate")
    @Expose
    private String [] DataTemplate;

    /**
    * 数据协议（native表示自定义，template表示数据模板，默认值为template）
    */
    @SerializedName("DataProtocol")
    @Expose
    private String DataProtocol;

    /**
     * 获取产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
     * @return Name 产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
     * @param Name 产品名称，同一区域产品名称需唯一，支持中文、英文字母、中划线和下划线，长度不超过31个字符，中文占两个字符
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取产品描述
     * @return Description 产品描述
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置产品描述
     * @param Description 产品描述
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取鉴权模式（1：动态令牌，推荐使用动态令牌）
     * @return AuthType 鉴权模式（1：动态令牌，推荐使用动态令牌）
     */
    public Integer getAuthType() {
        return this.AuthType;
    }

    /**
     * 设置鉴权模式（1：动态令牌，推荐使用动态令牌）
     * @param AuthType 鉴权模式（1：动态令牌，推荐使用动态令牌）
     */
    public void setAuthType(Integer AuthType) {
        this.AuthType = AuthType;
    }

    /**
     * 获取数据模版（json数组）
     * @return DataTemplate 数据模版（json数组）
     */
    public String [] getDataTemplate() {
        return this.DataTemplate;
    }

    /**
     * 设置数据模版（json数组）
     * @param DataTemplate 数据模版（json数组）
     */
    public void setDataTemplate(String [] DataTemplate) {
        this.DataTemplate = DataTemplate;
    }

    /**
     * 获取数据协议（native表示自定义，template表示数据模板，默认值为template）
     * @return DataProtocol 数据协议（native表示自定义，template表示数据模板，默认值为template）
     */
    public String getDataProtocol() {
        return this.DataProtocol;
    }

    /**
     * 设置数据协议（native表示自定义，template表示数据模板，默认值为template）
     * @param DataProtocol 数据协议（native表示自定义，template表示数据模板，默认值为template）
     */
    public void setDataProtocol(String DataProtocol) {
        this.DataProtocol = DataProtocol;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "AuthType", this.AuthType);
        this.setParamArraySimple(map, prefix + "DataTemplate.", this.DataTemplate);
        this.setParamSimple(map, prefix + "DataProtocol", this.DataProtocol);

    }
}

