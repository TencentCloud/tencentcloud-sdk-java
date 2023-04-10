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
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LineInfo extends AbstractModel{

    /**
    * 每行的一个元素
    */
    @SerializedName("Lines")
    @Expose
    private ItemInfo [] Lines;

    /**
     * Get 每行的一个元素 
     * @return Lines 每行的一个元素
     */
    public ItemInfo [] getLines() {
        return this.Lines;
    }

    /**
     * Set 每行的一个元素
     * @param Lines 每行的一个元素
     */
    public void setLines(ItemInfo [] Lines) {
        this.Lines = Lines;
    }

    public LineInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LineInfo(LineInfo source) {
        if (source.Lines != null) {
            this.Lines = new ItemInfo[source.Lines.length];
            for (int i = 0; i < source.Lines.length; i++) {
                this.Lines[i] = new ItemInfo(source.Lines[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Lines.", this.Lines);

    }
}

