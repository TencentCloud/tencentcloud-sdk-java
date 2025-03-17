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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SignComponentConfig extends AbstractModel {

    /**
    * 签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。

- false 展示签署日期（默认）
- true 不展示签署日期 
![image](https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png)。
    */
    @SerializedName("HideDate")
    @Expose
    private Boolean HideDate;

    /**
     * Get 签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。

- false 展示签署日期（默认）
- true 不展示签署日期 
![image](https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png)。 
     * @return HideDate 签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。

- false 展示签署日期（默认）
- true 不展示签署日期 
![image](https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png)。
     */
    public Boolean getHideDate() {
        return this.HideDate;
    }

    /**
     * Set 签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。

- false 展示签署日期（默认）
- true 不展示签署日期 
![image](https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png)。
     * @param HideDate 签署控件默认属性配置，是否默认展示签署日期， 在页面中可以进行修改。

- false 展示签署日期（默认）
- true 不展示签署日期 
![image](https://qcloudimg.tencent-cloud.cn/raw/448514412e2f69f6129425beda4ff568.png)。
     */
    public void setHideDate(Boolean HideDate) {
        this.HideDate = HideDate;
    }

    public SignComponentConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SignComponentConfig(SignComponentConfig source) {
        if (source.HideDate != null) {
            this.HideDate = new Boolean(source.HideDate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "HideDate", this.HideDate);

    }
}

