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
package com.tencentcloudapi.lkeap.v20240522.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyQARequest extends AbstractModel {

    /**
    * 属性标签
    */
    @SerializedName("AttributeLabels")
    @Expose
    private AttributeLabelReferItem [] AttributeLabels;

    /**
     * Get 属性标签 
     * @return AttributeLabels 属性标签
     */
    public AttributeLabelReferItem [] getAttributeLabels() {
        return this.AttributeLabels;
    }

    /**
     * Set 属性标签
     * @param AttributeLabels 属性标签
     */
    public void setAttributeLabels(AttributeLabelReferItem [] AttributeLabels) {
        this.AttributeLabels = AttributeLabels;
    }

    public ModifyQARequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyQARequest(ModifyQARequest source) {
        if (source.AttributeLabels != null) {
            this.AttributeLabels = new AttributeLabelReferItem[source.AttributeLabels.length];
            for (int i = 0; i < source.AttributeLabels.length; i++) {
                this.AttributeLabels[i] = new AttributeLabelReferItem(source.AttributeLabels[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AttributeLabels.", this.AttributeLabels);

    }
}

