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
package com.tencentcloudapi.apcas.v20201127.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LabelDetailData extends AbstractModel{

    /**
    * 标签数据对象
    */
    @SerializedName("Value")
    @Expose
    private LabelValue Value;

    /**
    * 标签表述，如"汽车资讯"、"游戏#手游"等
    */
    @SerializedName("Label")
    @Expose
    private String Label;

    /**
     * Get 标签数据对象 
     * @return Value 标签数据对象
     */
    public LabelValue getValue() {
        return this.Value;
    }

    /**
     * Set 标签数据对象
     * @param Value 标签数据对象
     */
    public void setValue(LabelValue Value) {
        this.Value = Value;
    }

    /**
     * Get 标签表述，如"汽车资讯"、"游戏#手游"等 
     * @return Label 标签表述，如"汽车资讯"、"游戏#手游"等
     */
    public String getLabel() {
        return this.Label;
    }

    /**
     * Set 标签表述，如"汽车资讯"、"游戏#手游"等
     * @param Label 标签表述，如"汽车资讯"、"游戏#手游"等
     */
    public void setLabel(String Label) {
        this.Label = Label;
    }

    public LabelDetailData() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LabelDetailData(LabelDetailData source) {
        if (source.Value != null) {
            this.Value = new LabelValue(source.Value);
        }
        if (source.Label != null) {
            this.Label = new String(source.Label);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Value.", this.Value);
        this.setParamSimple(map, prefix + "Label", this.Label);

    }
}

