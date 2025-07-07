/*
 * Copyright (c) 2017-2025 Tencent. All Rights Reserved.
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
package com.tencentcloudapi.waf.v20180125.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BotScoreRuleEntry extends AbstractModel {

    /**
    * 分数区间上限
    */
    @SerializedName("Upper")
    @Expose
    private String Upper;

    /**
    * 分数区间下限
    */
    @SerializedName("Lower")
    @Expose
    private String Lower;

    /**
    * 处置动作
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
    * 流量标签
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 重定向
    */
    @SerializedName("Redirect")
    @Expose
    private String Redirect;

    /**
     * Get 分数区间上限 
     * @return Upper 分数区间上限
     */
    public String getUpper() {
        return this.Upper;
    }

    /**
     * Set 分数区间上限
     * @param Upper 分数区间上限
     */
    public void setUpper(String Upper) {
        this.Upper = Upper;
    }

    /**
     * Get 分数区间下限 
     * @return Lower 分数区间下限
     */
    public String getLower() {
        return this.Lower;
    }

    /**
     * Set 分数区间下限
     * @param Lower 分数区间下限
     */
    public void setLower(String Lower) {
        this.Lower = Lower;
    }

    /**
     * Get 处置动作 
     * @return Action 处置动作
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * Set 处置动作
     * @param Action 处置动作
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * Get 流量标签 
     * @return Label 流量标签
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 流量标签
     * @param Label 流量标签
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 重定向 
     * @return Redirect 重定向
     */
    public String getRedirect() {
        return this.Redirect;
    }

    /**
     * Set 重定向
     * @param Redirect 重定向
     */
    public void setRedirect(String Redirect) {
        this.Redirect = Redirect;
    }

    public BotScoreRuleEntry() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BotScoreRuleEntry(BotScoreRuleEntry source) {
        if (source.Upper != null) {
            this.Upper = new String(source.Upper);
        }
        if (source.Lower != null) {
            this.Lower = new String(source.Lower);
        }
        if (source.Action != null) {
            this.Action = new String(source.Action);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Redirect != null) {
            this.Redirect = new String(source.Redirect);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Upper", this.Upper);
        this.setParamSimple(map, prefix + "Lower", this.Lower);
        this.setParamSimple(map, prefix + "Action", this.Action);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Redirect", this.Redirect);

    }
}

