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
package com.tencentcloudapi.ivld.v20210903.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SortBy extends AbstractModel{

    /**
    * 排序字段，默认为CreateTime
    */
    @SerializedName("By")
    @Expose
    private String By;

    /**
    * true表示降序，false表示升序
    */
    @SerializedName("Descend")
    @Expose
    private Boolean Descend;

    /**
     * Get 排序字段，默认为CreateTime 
     * @return By 排序字段，默认为CreateTime
     */
    public String getBy() {
        return this.By;
    }

    /**
     * Set 排序字段，默认为CreateTime
     * @param By 排序字段，默认为CreateTime
     */
    public void setBy(String By) {
        this.By = By;
    }

    /**
     * Get true表示降序，false表示升序 
     * @return Descend true表示降序，false表示升序
     */
    public Boolean getDescend() {
        return this.Descend;
    }

    /**
     * Set true表示降序，false表示升序
     * @param Descend true表示降序，false表示升序
     */
    public void setDescend(Boolean Descend) {
        this.Descend = Descend;
    }

    public SortBy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public SortBy(SortBy source) {
        if (source.By != null) {
            this.By = new String(source.By);
        }
        if (source.Descend != null) {
            this.Descend = new Boolean(source.Descend);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "By", this.By);
        this.setParamSimple(map, prefix + "Descend", this.Descend);

    }
}

