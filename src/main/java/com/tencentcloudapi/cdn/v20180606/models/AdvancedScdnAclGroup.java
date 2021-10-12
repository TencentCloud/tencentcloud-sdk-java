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

public class AdvancedScdnAclGroup extends AbstractModel{

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 具体配置
    */
    @SerializedName("Configure")
    @Expose
    private AdvancedScdnAclRule [] Configure;

    /**
    * 执行动作，intercept|redirect
    */
    @SerializedName("Result")
    @Expose
    private String Result;

    /**
    * 规则是否生效，active|inactive
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 错误页面配置
    */
    @SerializedName("ErrorPage")
    @Expose
    private ScdnErrorPage ErrorPage;

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 具体配置 
     * @return Configure 具体配置
     */
    public AdvancedScdnAclRule [] getConfigure() {
        return this.Configure;
    }

    /**
     * Set 具体配置
     * @param Configure 具体配置
     */
    public void setConfigure(AdvancedScdnAclRule [] Configure) {
        this.Configure = Configure;
    }

    /**
     * Get 执行动作，intercept|redirect 
     * @return Result 执行动作，intercept|redirect
     */
    public String getResult() {
        return this.Result;
    }

    /**
     * Set 执行动作，intercept|redirect
     * @param Result 执行动作，intercept|redirect
     */
    public void setResult(String Result) {
        this.Result = Result;
    }

    /**
     * Get 规则是否生效，active|inactive 
     * @return Status 规则是否生效，active|inactive
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 规则是否生效，active|inactive
     * @param Status 规则是否生效，active|inactive
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 错误页面配置 
     * @return ErrorPage 错误页面配置
     */
    public ScdnErrorPage getErrorPage() {
        return this.ErrorPage;
    }

    /**
     * Set 错误页面配置
     * @param ErrorPage 错误页面配置
     */
    public void setErrorPage(ScdnErrorPage ErrorPage) {
        this.ErrorPage = ErrorPage;
    }

    public AdvancedScdnAclGroup() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AdvancedScdnAclGroup(AdvancedScdnAclGroup source) {
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.Configure != null) {
            this.Configure = new AdvancedScdnAclRule[source.Configure.length];
            for (int i = 0; i < source.Configure.length; i++) {
                this.Configure[i] = new AdvancedScdnAclRule(source.Configure[i]);
            }
        }
        if (source.Result != null) {
            this.Result = new String(source.Result);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ErrorPage != null) {
            this.ErrorPage = new ScdnErrorPage(source.ErrorPage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamArrayObj(map, prefix + "Configure.", this.Configure);
        this.setParamSimple(map, prefix + "Result", this.Result);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamObj(map, prefix + "ErrorPage.", this.ErrorPage);

    }
}

