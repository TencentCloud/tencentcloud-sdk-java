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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TableColumn extends AbstractModel{

    /**
    * 列名称
    */
    @SerializedName("Col")
    @Expose
    private String Col;

    /**
    * 列类型
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * Get 列名称 
     * @return Col 列名称
     */
    public String getCol() {
        return this.Col;
    }

    /**
     * Set 列名称
     * @param Col 列名称
     */
    public void setCol(String Col) {
        this.Col = Col;
    }

    /**
     * Get 列类型 
     * @return Type 列类型
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 列类型
     * @param Type 列类型
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Col", this.Col);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

