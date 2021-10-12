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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScdnErrorPage extends AbstractModel{

    /**
    * 状态码
执行动作为：intercept 默认传值 403
执行动作为：redirect 默认传值 301
    */
    @SerializedName("RedirectCode")
    @Expose
    private Long RedirectCode;

    /**
    * 重定向url
    */
    @SerializedName("RedirectUrl")
    @Expose
    private String RedirectUrl;

    /**
     * Get 状态码
执行动作为：intercept 默认传值 403
执行动作为：redirect 默认传值 301 
     * @return RedirectCode 状态码
执行动作为：intercept 默认传值 403
执行动作为：redirect 默认传值 301
     */
    public Long getRedirectCode() {
        return this.RedirectCode;
    }

    /**
     * Set 状态码
执行动作为：intercept 默认传值 403
执行动作为：redirect 默认传值 301
     * @param RedirectCode 状态码
执行动作为：intercept 默认传值 403
执行动作为：redirect 默认传值 301
     */
    public void setRedirectCode(Long RedirectCode) {
        this.RedirectCode = RedirectCode;
    }

    /**
     * Get 重定向url 
     * @return RedirectUrl 重定向url
     */
    public String getRedirectUrl() {
        return this.RedirectUrl;
    }

    /**
     * Set 重定向url
     * @param RedirectUrl 重定向url
     */
    public void setRedirectUrl(String RedirectUrl) {
        this.RedirectUrl = RedirectUrl;
    }

    public ScdnErrorPage() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScdnErrorPage(ScdnErrorPage source) {
        if (source.RedirectCode != null) {
            this.RedirectCode = new Long(source.RedirectCode);
        }
        if (source.RedirectUrl != null) {
            this.RedirectUrl = new String(source.RedirectUrl);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RedirectCode", this.RedirectCode);
        this.setParamSimple(map, prefix + "RedirectUrl", this.RedirectUrl);

    }
}

