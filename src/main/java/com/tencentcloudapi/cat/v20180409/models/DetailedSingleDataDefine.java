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
package com.tencentcloudapi.cat.v20180409.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DetailedSingleDataDefine extends AbstractModel{

    /**
    * 拨测时间戳
    */
    @SerializedName("ProbeTime")
    @Expose
    private Long ProbeTime;

    /**
    * 储存所有string类型字段
    */
    @SerializedName("Labels")
    @Expose
    private Label [] Labels;

    /**
    * 储存所有float类型字段
    */
    @SerializedName("Fields")
    @Expose
    private Field [] Fields;

    /**
     * Get 拨测时间戳 
     * @return ProbeTime 拨测时间戳
     */
    public Long getProbeTime() {
        return this.ProbeTime;
    }

    /**
     * Set 拨测时间戳
     * @param ProbeTime 拨测时间戳
     */
    public void setProbeTime(Long ProbeTime) {
        this.ProbeTime = ProbeTime;
    }

    /**
     * Get 储存所有string类型字段 
     * @return Labels 储存所有string类型字段
     */
    public Label [] getLabels() {
        return this.Labels;
    }

    /**
     * Set 储存所有string类型字段
     * @param Labels 储存所有string类型字段
     */
    public void setLabels(Label [] Labels) {
        this.Labels = Labels;
    }

    /**
     * Get 储存所有float类型字段 
     * @return Fields 储存所有float类型字段
     */
    public Field [] getFields() {
        return this.Fields;
    }

    /**
     * Set 储存所有float类型字段
     * @param Fields 储存所有float类型字段
     */
    public void setFields(Field [] Fields) {
        this.Fields = Fields;
    }

    public DetailedSingleDataDefine() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DetailedSingleDataDefine(DetailedSingleDataDefine source) {
        if (source.ProbeTime != null) {
            this.ProbeTime = new Long(source.ProbeTime);
        }
        if (source.Labels != null) {
            this.Labels = new Label[source.Labels.length];
            for (int i = 0; i < source.Labels.length; i++) {
                this.Labels[i] = new Label(source.Labels[i]);
            }
        }
        if (source.Fields != null) {
            this.Fields = new Field[source.Fields.length];
            for (int i = 0; i < source.Fields.length; i++) {
                this.Fields[i] = new Field(source.Fields[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProbeTime", this.ProbeTime);
        this.setParamArrayObj(map, prefix + "Labels.", this.Labels);
        this.setParamArrayObj(map, prefix + "Fields.", this.Fields);

    }
}

