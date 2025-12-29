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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OutputWidgetConfig extends AbstractModel {

    /**
    * widget id
    */
    @SerializedName("WidgetId")
    @Expose
    private String WidgetId;

    /**
    * widget名字
    */
    @SerializedName("WidgetName")
    @Expose
    private String WidgetName;

    /**
    * 展示结果
    */
    @SerializedName("WidgetParam")
    @Expose
    private WidgetParam [] WidgetParam;

    /**
     * Get widget id 
     * @return WidgetId widget id
     */
    public String getWidgetId() {
        return this.WidgetId;
    }

    /**
     * Set widget id
     * @param WidgetId widget id
     */
    public void setWidgetId(String WidgetId) {
        this.WidgetId = WidgetId;
    }

    /**
     * Get widget名字 
     * @return WidgetName widget名字
     */
    public String getWidgetName() {
        return this.WidgetName;
    }

    /**
     * Set widget名字
     * @param WidgetName widget名字
     */
    public void setWidgetName(String WidgetName) {
        this.WidgetName = WidgetName;
    }

    /**
     * Get 展示结果 
     * @return WidgetParam 展示结果
     */
    public WidgetParam [] getWidgetParam() {
        return this.WidgetParam;
    }

    /**
     * Set 展示结果
     * @param WidgetParam 展示结果
     */
    public void setWidgetParam(WidgetParam [] WidgetParam) {
        this.WidgetParam = WidgetParam;
    }

    public OutputWidgetConfig() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OutputWidgetConfig(OutputWidgetConfig source) {
        if (source.WidgetId != null) {
            this.WidgetId = new String(source.WidgetId);
        }
        if (source.WidgetName != null) {
            this.WidgetName = new String(source.WidgetName);
        }
        if (source.WidgetParam != null) {
            this.WidgetParam = new WidgetParam[source.WidgetParam.length];
            for (int i = 0; i < source.WidgetParam.length; i++) {
                this.WidgetParam[i] = new WidgetParam(source.WidgetParam[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "WidgetId", this.WidgetId);
        this.setParamSimple(map, prefix + "WidgetName", this.WidgetName);
        this.setParamArrayObj(map, prefix + "WidgetParam.", this.WidgetParam);

    }
}

