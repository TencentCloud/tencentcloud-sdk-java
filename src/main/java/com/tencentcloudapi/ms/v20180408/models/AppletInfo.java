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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppletInfo extends AbstractModel{

    /**
    * 客户JS包
    */
    @SerializedName("AppletJsUrl")
    @Expose
    private String AppletJsUrl;

    /**
    * 小程序加固等级配置
1 - 开启代码混淆、代码压缩、代码反调试保护。 2 - 开启字符串编码和代码变换，代码膨胀，随机插入冗余代码，开启代码控制流平坦化，保证业务逻辑正常前提下，扁平化代码逻辑分支，破坏代码简单的线性结构。 3 - 开启代码加密，对字符串、函数、变量、属性、类、数组等结构进行加密保护，更多得代码控制流平坦化，扁平化逻辑分支。
    */
    @SerializedName("AppletLevel")
    @Expose
    private Long AppletLevel;

    /**
    * 本次加固输出产物名称，如”test.zip“,非空必须是 ”.zip“结尾
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
     * Get 客户JS包 
     * @return AppletJsUrl 客户JS包
     */
    public String getAppletJsUrl() {
        return this.AppletJsUrl;
    }

    /**
     * Set 客户JS包
     * @param AppletJsUrl 客户JS包
     */
    public void setAppletJsUrl(String AppletJsUrl) {
        this.AppletJsUrl = AppletJsUrl;
    }

    /**
     * Get 小程序加固等级配置
1 - 开启代码混淆、代码压缩、代码反调试保护。 2 - 开启字符串编码和代码变换，代码膨胀，随机插入冗余代码，开启代码控制流平坦化，保证业务逻辑正常前提下，扁平化代码逻辑分支，破坏代码简单的线性结构。 3 - 开启代码加密，对字符串、函数、变量、属性、类、数组等结构进行加密保护，更多得代码控制流平坦化，扁平化逻辑分支。 
     * @return AppletLevel 小程序加固等级配置
1 - 开启代码混淆、代码压缩、代码反调试保护。 2 - 开启字符串编码和代码变换，代码膨胀，随机插入冗余代码，开启代码控制流平坦化，保证业务逻辑正常前提下，扁平化代码逻辑分支，破坏代码简单的线性结构。 3 - 开启代码加密，对字符串、函数、变量、属性、类、数组等结构进行加密保护，更多得代码控制流平坦化，扁平化逻辑分支。
     */
    public Long getAppletLevel() {
        return this.AppletLevel;
    }

    /**
     * Set 小程序加固等级配置
1 - 开启代码混淆、代码压缩、代码反调试保护。 2 - 开启字符串编码和代码变换，代码膨胀，随机插入冗余代码，开启代码控制流平坦化，保证业务逻辑正常前提下，扁平化代码逻辑分支，破坏代码简单的线性结构。 3 - 开启代码加密，对字符串、函数、变量、属性、类、数组等结构进行加密保护，更多得代码控制流平坦化，扁平化逻辑分支。
     * @param AppletLevel 小程序加固等级配置
1 - 开启代码混淆、代码压缩、代码反调试保护。 2 - 开启字符串编码和代码变换，代码膨胀，随机插入冗余代码，开启代码控制流平坦化，保证业务逻辑正常前提下，扁平化代码逻辑分支，破坏代码简单的线性结构。 3 - 开启代码加密，对字符串、函数、变量、属性、类、数组等结构进行加密保护，更多得代码控制流平坦化，扁平化逻辑分支。
     */
    public void setAppletLevel(Long AppletLevel) {
        this.AppletLevel = AppletLevel;
    }

    /**
     * Get 本次加固输出产物名称，如”test.zip“,非空必须是 ”.zip“结尾 
     * @return Name 本次加固输出产物名称，如”test.zip“,非空必须是 ”.zip“结尾
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 本次加固输出产物名称，如”test.zip“,非空必须是 ”.zip“结尾
     * @param Name 本次加固输出产物名称，如”test.zip“,非空必须是 ”.zip“结尾
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    public AppletInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AppletInfo(AppletInfo source) {
        if (source.AppletJsUrl != null) {
            this.AppletJsUrl = new String(source.AppletJsUrl);
        }
        if (source.AppletLevel != null) {
            this.AppletLevel = new Long(source.AppletLevel);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppletJsUrl", this.AppletJsUrl);
        this.setParamSimple(map, prefix + "AppletLevel", this.AppletLevel);
        this.setParamSimple(map, prefix + "Name", this.Name);

    }
}

