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
package com.tencentcloudapi.cms.v20190321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RiskDetails extends AbstractModel {

    /**
    * 预留字段，暂时不使用
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
    * 预留字段，暂时不用
    */
    @SerializedName("Lable")
    @Expose
    private String Lable;

    /**
    * 风险类别，RiskAccount，RiskIP, RiskIMEI
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
    * 风险等级，1:疑似，2：恶意
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
     * Get 预留字段，暂时不使用 
     * @return Keywords 预留字段，暂时不使用
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * Set 预留字段，暂时不使用
     * @param Keywords 预留字段，暂时不使用
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * Get 预留字段，暂时不用 
     * @return Lable 预留字段，暂时不用
     */
    public String getLable() {
        return this.Lable;
    }

    /**
     * Set 预留字段，暂时不用
     * @param Lable 预留字段，暂时不用
     */
    public void setLable(String Lable) {
        this.Lable = Lable;
    }

    /**
     * Get 风险类别，RiskAccount，RiskIP, RiskIMEI 
     * @return Label 风险类别，RiskAccount，RiskIP, RiskIMEI
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 风险类别，RiskAccount，RiskIP, RiskIMEI
     * @param Label 风险类别，RiskAccount，RiskIP, RiskIMEI
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    /**
     * Get 风险等级，1:疑似，2：恶意 
     * @return Level 风险等级，1:疑似，2：恶意
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 风险等级，1:疑似，2：恶意
     * @param Level 风险等级，1:疑似，2：恶意
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    public RiskDetails() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RiskDetails(RiskDetails source) {
        if (source.Keywords != null) {
            this.Keywords = new String[source.Keywords.length];
            for (int i = 0; i < source.Keywords.length; i++) {
                this.Keywords[i] = new String(source.Keywords[i]);
            }
        }
        if (source.Lable != null) {
            this.Lable = new String(source.Lable);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);
        this.setParamSimple(map, prefix + "Lable", this.Lable);
        this.setParamSimple(map, prefix + "Label", this.Label);
        this.setParamSimple(map, prefix + "Level", this.Level);

    }
}

