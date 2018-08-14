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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetRulesRequest  extends AbstractModel{

    /**
    * 偏移
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 长度
    */
    @SerializedName("Length")
    @Expose
    private Integer Length;

    /**
     * 获取偏移
     * @return Offset 偏移
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移
     * @param Offset 偏移
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取长度
     * @return Length 长度
     */
    public Integer getLength() {
        return this.Length;
    }

    /**
     * 设置长度
     * @param Length 长度
     */
    public void setLength(Integer Length) {
        this.Length = Length;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Length", this.Length);

    }
}

