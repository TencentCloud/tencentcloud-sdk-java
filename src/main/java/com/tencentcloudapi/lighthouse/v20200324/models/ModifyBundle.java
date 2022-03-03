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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyBundle extends AbstractModel{

    /**
    * 更改实例套餐后需要补的差价。
    */
    @SerializedName("ModifyPrice")
    @Expose
    private Price ModifyPrice;

    /**
    * 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li>
    */
    @SerializedName("ModifyBundleState")
    @Expose
    private String ModifyBundleState;

    /**
    * 套餐信息。
    */
    @SerializedName("Bundle")
    @Expose
    private Bundle Bundle;

    /**
    * 不支持套餐变更原因信息。变更套餐状态为"AVAILABLE"时, 该信息为空
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotSupportModifyMessage")
    @Expose
    private String NotSupportModifyMessage;

    /**
     * Get 更改实例套餐后需要补的差价。 
     * @return ModifyPrice 更改实例套餐后需要补的差价。
     */
    public Price getModifyPrice() {
        return this.ModifyPrice;
    }

    /**
     * Set 更改实例套餐后需要补的差价。
     * @param ModifyPrice 更改实例套餐后需要补的差价。
     */
    public void setModifyPrice(Price ModifyPrice) {
        this.ModifyPrice = ModifyPrice;
    }

    /**
     * Get 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li> 
     * @return ModifyBundleState 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li>
     */
    public String getModifyBundleState() {
        return this.ModifyBundleState;
    }

    /**
     * Set 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li>
     * @param ModifyBundleState 变更套餐状态。取值：
<li>SOLD_OUT：套餐售罄</li>
<li>AVAILABLE：支持套餐变更</li>
<li>UNAVAILABLE：暂不支持套餐变更</li>
     */
    public void setModifyBundleState(String ModifyBundleState) {
        this.ModifyBundleState = ModifyBundleState;
    }

    /**
     * Get 套餐信息。 
     * @return Bundle 套餐信息。
     */
    public Bundle getBundle() {
        return this.Bundle;
    }

    /**
     * Set 套餐信息。
     * @param Bundle 套餐信息。
     */
    public void setBundle(Bundle Bundle) {
        this.Bundle = Bundle;
    }

    /**
     * Get 不支持套餐变更原因信息。变更套餐状态为"AVAILABLE"时, 该信息为空
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NotSupportModifyMessage 不支持套餐变更原因信息。变更套餐状态为"AVAILABLE"时, 该信息为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNotSupportModifyMessage() {
        return this.NotSupportModifyMessage;
    }

    /**
     * Set 不支持套餐变更原因信息。变更套餐状态为"AVAILABLE"时, 该信息为空
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotSupportModifyMessage 不支持套餐变更原因信息。变更套餐状态为"AVAILABLE"时, 该信息为空
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotSupportModifyMessage(String NotSupportModifyMessage) {
        this.NotSupportModifyMessage = NotSupportModifyMessage;
    }

    public ModifyBundle() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyBundle(ModifyBundle source) {
        if (source.ModifyPrice != null) {
            this.ModifyPrice = new Price(source.ModifyPrice);
        }
        if (source.ModifyBundleState != null) {
            this.ModifyBundleState = new String(source.ModifyBundleState);
        }
        if (source.Bundle != null) {
            this.Bundle = new Bundle(source.Bundle);
        }
        if (source.NotSupportModifyMessage != null) {
            this.NotSupportModifyMessage = new String(source.NotSupportModifyMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ModifyPrice.", this.ModifyPrice);
        this.setParamSimple(map, prefix + "ModifyBundleState", this.ModifyBundleState);
        this.setParamObj(map, prefix + "Bundle.", this.Bundle);
        this.setParamSimple(map, prefix + "NotSupportModifyMessage", this.NotSupportModifyMessage);

    }
}

