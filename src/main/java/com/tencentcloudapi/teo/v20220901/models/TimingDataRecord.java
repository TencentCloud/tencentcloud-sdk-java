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
package com.tencentcloudapi.teo.v20220901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TimingDataRecord extends AbstractModel{

    /**
    * 查询维度值。
    */
    @SerializedName("TypeKey")
    @Expose
    private String TypeKey;

    /**
    * 详细时序数据。
    */
    @SerializedName("TypeValue")
    @Expose
    private TimingTypeValue [] TypeValue;

    /**
     * Get 查询维度值。 
     * @return TypeKey 查询维度值。
     */
    public String getTypeKey() {
        return this.TypeKey;
    }

    /**
     * Set 查询维度值。
     * @param TypeKey 查询维度值。
     */
    public void setTypeKey(String TypeKey) {
        this.TypeKey = TypeKey;
    }

    /**
     * Get 详细时序数据。 
     * @return TypeValue 详细时序数据。
     */
    public TimingTypeValue [] getTypeValue() {
        return this.TypeValue;
    }

    /**
     * Set 详细时序数据。
     * @param TypeValue 详细时序数据。
     */
    public void setTypeValue(TimingTypeValue [] TypeValue) {
        this.TypeValue = TypeValue;
    }

    public TimingDataRecord() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TimingDataRecord(TimingDataRecord source) {
        if (source.TypeKey != null) {
            this.TypeKey = new String(source.TypeKey);
        }
        if (source.TypeValue != null) {
            this.TypeValue = new TimingTypeValue[source.TypeValue.length];
            for (int i = 0; i < source.TypeValue.length; i++) {
                this.TypeValue[i] = new TimingTypeValue(source.TypeValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TypeKey", this.TypeKey);
        this.setParamArrayObj(map, prefix + "TypeValue.", this.TypeValue);

    }
}

