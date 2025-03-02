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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RecipientComponentInfo extends AbstractModel {

    /**
    * 签署方经办人在合同流程中的参与方ID，与控件绑定，是控件的归属方
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 参与方填写状态
<ul>
<li>**空值** : 此参与方没有填写控件</li>
<li>**0**:  未填写, 表示此参与方还没有填写合同的填写控件</li>
<li>**1**:  已填写, 表示此参与方已经填写所有的填写控件</li></ul>

    */
    @SerializedName("RecipientFillStatus")
    @Expose
    private String RecipientFillStatus;

    /**
    * 是否为发起方
<ul><li>true-发起方</li>
<li>false-参与方</li></ul>
    */
    @SerializedName("IsPromoter")
    @Expose
    private Boolean IsPromoter;

    /**
    * 改参与方填写控件信息列表
    */
    @SerializedName("Components")
    @Expose
    private FilledComponent [] Components;

    /**
     * Get 签署方经办人在合同流程中的参与方ID，与控件绑定，是控件的归属方 
     * @return RecipientId 签署方经办人在合同流程中的参与方ID，与控件绑定，是控件的归属方
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 签署方经办人在合同流程中的参与方ID，与控件绑定，是控件的归属方
     * @param RecipientId 签署方经办人在合同流程中的参与方ID，与控件绑定，是控件的归属方
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 参与方填写状态
<ul>
<li>**空值** : 此参与方没有填写控件</li>
<li>**0**:  未填写, 表示此参与方还没有填写合同的填写控件</li>
<li>**1**:  已填写, 表示此参与方已经填写所有的填写控件</li></ul>
 
     * @return RecipientFillStatus 参与方填写状态
<ul>
<li>**空值** : 此参与方没有填写控件</li>
<li>**0**:  未填写, 表示此参与方还没有填写合同的填写控件</li>
<li>**1**:  已填写, 表示此参与方已经填写所有的填写控件</li></ul>

     */
    public String getRecipientFillStatus() {
        return this.RecipientFillStatus;
    }

    /**
     * Set 参与方填写状态
<ul>
<li>**空值** : 此参与方没有填写控件</li>
<li>**0**:  未填写, 表示此参与方还没有填写合同的填写控件</li>
<li>**1**:  已填写, 表示此参与方已经填写所有的填写控件</li></ul>

     * @param RecipientFillStatus 参与方填写状态
<ul>
<li>**空值** : 此参与方没有填写控件</li>
<li>**0**:  未填写, 表示此参与方还没有填写合同的填写控件</li>
<li>**1**:  已填写, 表示此参与方已经填写所有的填写控件</li></ul>

     */
    public void setRecipientFillStatus(String RecipientFillStatus) {
        this.RecipientFillStatus = RecipientFillStatus;
    }

    /**
     * Get 是否为发起方
<ul><li>true-发起方</li>
<li>false-参与方</li></ul> 
     * @return IsPromoter 是否为发起方
<ul><li>true-发起方</li>
<li>false-参与方</li></ul>
     */
    public Boolean getIsPromoter() {
        return this.IsPromoter;
    }

    /**
     * Set 是否为发起方
<ul><li>true-发起方</li>
<li>false-参与方</li></ul>
     * @param IsPromoter 是否为发起方
<ul><li>true-发起方</li>
<li>false-参与方</li></ul>
     */
    public void setIsPromoter(Boolean IsPromoter) {
        this.IsPromoter = IsPromoter;
    }

    /**
     * Get 改参与方填写控件信息列表 
     * @return Components 改参与方填写控件信息列表
     */
    public FilledComponent [] getComponents() {
        return this.Components;
    }

    /**
     * Set 改参与方填写控件信息列表
     * @param Components 改参与方填写控件信息列表
     */
    public void setComponents(FilledComponent [] Components) {
        this.Components = Components;
    }

    public RecipientComponentInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RecipientComponentInfo(RecipientComponentInfo source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.RecipientFillStatus != null) {
            this.RecipientFillStatus = new String(source.RecipientFillStatus);
        }
        if (source.IsPromoter != null) {
            this.IsPromoter = new Boolean(source.IsPromoter);
        }
        if (source.Components != null) {
            this.Components = new FilledComponent[source.Components.length];
            for (int i = 0; i < source.Components.length; i++) {
                this.Components[i] = new FilledComponent(source.Components[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "RecipientFillStatus", this.RecipientFillStatus);
        this.setParamSimple(map, prefix + "IsPromoter", this.IsPromoter);
        this.setParamArrayObj(map, prefix + "Components.", this.Components);

    }
}

