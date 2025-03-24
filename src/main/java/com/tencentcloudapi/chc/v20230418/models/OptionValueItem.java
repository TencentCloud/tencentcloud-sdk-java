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
package com.tencentcloudapi.chc.v20230418.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptionValueItem extends AbstractModel {

    /**
    * 选项的值
    */
    @SerializedName("OptionValue")
    @Expose
    private String OptionValue;

    /**
    * 是否默认选中
    */
    @SerializedName("Selected")
    @Expose
    private Boolean Selected;

    /**
     * Get 选项的值 
     * @return OptionValue 选项的值
     */
    public String getOptionValue() {
        return this.OptionValue;
    }

    /**
     * Set 选项的值
     * @param OptionValue 选项的值
     */
    public void setOptionValue(String OptionValue) {
        this.OptionValue = OptionValue;
    }

    /**
     * Get 是否默认选中 
     * @return Selected 是否默认选中
     */
    public Boolean getSelected() {
        return this.Selected;
    }

    /**
     * Set 是否默认选中
     * @param Selected 是否默认选中
     */
    public void setSelected(Boolean Selected) {
        this.Selected = Selected;
    }

    public OptionValueItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptionValueItem(OptionValueItem source) {
        if (source.OptionValue != null) {
            this.OptionValue = new String(source.OptionValue);
        }
        if (source.Selected != null) {
            this.Selected = new Boolean(source.Selected);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "OptionValue", this.OptionValue);
        this.setParamSimple(map, prefix + "Selected", this.Selected);

    }
}

