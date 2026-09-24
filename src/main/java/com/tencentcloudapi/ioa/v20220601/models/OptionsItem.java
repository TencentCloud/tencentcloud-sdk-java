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
package com.tencentcloudapi.ioa.v20220601.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OptionsItem extends AbstractModel {

    /**
    * <p>中文值</p>
    */
    @SerializedName("ValueCh")
    @Expose
    private String ValueCh;

    /**
    * <p>英文值</p>
    */
    @SerializedName("ValueEn")
    @Expose
    private String ValueEn;

    /**
    * <p>每一项的Key值</p>
    */
    @SerializedName("OptionKey")
    @Expose
    private Long OptionKey;

    /**
     * Get <p>中文值</p> 
     * @return ValueCh <p>中文值</p>
     */
    public String getValueCh() {
        return this.ValueCh;
    }

    /**
     * Set <p>中文值</p>
     * @param ValueCh <p>中文值</p>
     */
    public void setValueCh(String ValueCh) {
        this.ValueCh = ValueCh;
    }

    /**
     * Get <p>英文值</p> 
     * @return ValueEn <p>英文值</p>
     */
    public String getValueEn() {
        return this.ValueEn;
    }

    /**
     * Set <p>英文值</p>
     * @param ValueEn <p>英文值</p>
     */
    public void setValueEn(String ValueEn) {
        this.ValueEn = ValueEn;
    }

    /**
     * Get <p>每一项的Key值</p> 
     * @return OptionKey <p>每一项的Key值</p>
     */
    public Long getOptionKey() {
        return this.OptionKey;
    }

    /**
     * Set <p>每一项的Key值</p>
     * @param OptionKey <p>每一项的Key值</p>
     */
    public void setOptionKey(Long OptionKey) {
        this.OptionKey = OptionKey;
    }

    public OptionsItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OptionsItem(OptionsItem source) {
        if (source.ValueCh != null) {
            this.ValueCh = new String(source.ValueCh);
        }
        if (source.ValueEn != null) {
            this.ValueEn = new String(source.ValueEn);
        }
        if (source.OptionKey != null) {
            this.OptionKey = new Long(source.OptionKey);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ValueCh", this.ValueCh);
        this.setParamSimple(map, prefix + "ValueEn", this.ValueEn);
        this.setParamSimple(map, prefix + "OptionKey", this.OptionKey);

    }
}

