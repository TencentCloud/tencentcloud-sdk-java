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
package com.tencentcloudapi.iai.v20200303.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Mouth extends AbstractModel{

    /**
    * 是否张嘴信息。
AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
    */
    @SerializedName("MouthOpen")
    @Expose
    private AttributeItem MouthOpen;

    /**
     * Get 是否张嘴信息。
AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。 
     * @return MouthOpen 是否张嘴信息。
AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
     */
    public AttributeItem getMouthOpen() {
        return this.MouthOpen;
    }

    /**
     * Set 是否张嘴信息。
AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
     * @param MouthOpen 是否张嘴信息。
AttributeItem对应的Type为 —— 0：不张嘴，1：张嘴。
     */
    public void setMouthOpen(AttributeItem MouthOpen) {
        this.MouthOpen = MouthOpen;
    }

    public Mouth() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Mouth(Mouth source) {
        if (source.MouthOpen != null) {
            this.MouthOpen = new AttributeItem(source.MouthOpen);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "MouthOpen.", this.MouthOpen);

    }
}

