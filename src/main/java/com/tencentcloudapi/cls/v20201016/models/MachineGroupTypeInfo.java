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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MachineGroupTypeInfo extends AbstractModel{

    /**
    * 机器组类型，ip表示该机器组Values中存的是采集机器的IP地址，label表示该机器组Values中存储的是机器的标签
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 机器描述列表
    */
    @SerializedName("Values")
    @Expose
    private String [] Values;

    /**
     * Get 机器组类型，ip表示该机器组Values中存的是采集机器的IP地址，label表示该机器组Values中存储的是机器的标签 
     * @return Type 机器组类型，ip表示该机器组Values中存的是采集机器的IP地址，label表示该机器组Values中存储的是机器的标签
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 机器组类型，ip表示该机器组Values中存的是采集机器的IP地址，label表示该机器组Values中存储的是机器的标签
     * @param Type 机器组类型，ip表示该机器组Values中存的是采集机器的IP地址，label表示该机器组Values中存储的是机器的标签
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 机器描述列表 
     * @return Values 机器描述列表
     */
    public String [] getValues() {
        return this.Values;
    }

    /**
     * Set 机器描述列表
     * @param Values 机器描述列表
     */
    public void setValues(String [] Values) {
        this.Values = Values;
    }

    public MachineGroupTypeInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MachineGroupTypeInfo(MachineGroupTypeInfo source) {
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.Values != null) {
            this.Values = new String[source.Values.length];
            for (int i = 0; i < source.Values.length; i++) {
                this.Values[i] = new String(source.Values[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamArraySimple(map, prefix + "Values.", this.Values);

    }
}

