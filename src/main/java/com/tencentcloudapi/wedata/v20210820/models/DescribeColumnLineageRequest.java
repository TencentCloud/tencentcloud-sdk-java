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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeColumnLineageRequest extends AbstractModel{

    /**
    * 查询方向，INPUT,OUTPUT,BOTH枚举值
    */
    @SerializedName("Direction")
    @Expose
    private String Direction;

    /**
    * 字段信息
    */
    @SerializedName("Data")
    @Expose
    private ColumnLineageInfo Data;

    /**
    * 单次查询入度
    */
    @SerializedName("InputDepth")
    @Expose
    private Long InputDepth;

    /**
    * 单次查询出度
    */
    @SerializedName("OutputDepth")
    @Expose
    private Long OutputDepth;

    /**
    * 额外参数（传递调用方信息）
    */
    @SerializedName("ExtParams")
    @Expose
    private RecordField [] ExtParams;

    /**
    * 是否过滤临时表 默认值为true
    */
    @SerializedName("IgnoreTemp")
    @Expose
    private Boolean IgnoreTemp;

    /**
     * Get 查询方向，INPUT,OUTPUT,BOTH枚举值 
     * @return Direction 查询方向，INPUT,OUTPUT,BOTH枚举值
     */
    public String getDirection() {
        return this.Direction;
    }

    /**
     * Set 查询方向，INPUT,OUTPUT,BOTH枚举值
     * @param Direction 查询方向，INPUT,OUTPUT,BOTH枚举值
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 字段信息 
     * @return Data 字段信息
     */
    public ColumnLineageInfo getData() {
        return this.Data;
    }

    /**
     * Set 字段信息
     * @param Data 字段信息
     */
    public void setData(ColumnLineageInfo Data) {
        this.Data = Data;
    }

    /**
     * Get 单次查询入度 
     * @return InputDepth 单次查询入度
     */
    public Long getInputDepth() {
        return this.InputDepth;
    }

    /**
     * Set 单次查询入度
     * @param InputDepth 单次查询入度
     */
    public void setInputDepth(Long InputDepth) {
        this.InputDepth = InputDepth;
    }

    /**
     * Get 单次查询出度 
     * @return OutputDepth 单次查询出度
     */
    public Long getOutputDepth() {
        return this.OutputDepth;
    }

    /**
     * Set 单次查询出度
     * @param OutputDepth 单次查询出度
     */
    public void setOutputDepth(Long OutputDepth) {
        this.OutputDepth = OutputDepth;
    }

    /**
     * Get 额外参数（传递调用方信息） 
     * @return ExtParams 额外参数（传递调用方信息）
     */
    public RecordField [] getExtParams() {
        return this.ExtParams;
    }

    /**
     * Set 额外参数（传递调用方信息）
     * @param ExtParams 额外参数（传递调用方信息）
     */
    public void setExtParams(RecordField [] ExtParams) {
        this.ExtParams = ExtParams;
    }

    /**
     * Get 是否过滤临时表 默认值为true 
     * @return IgnoreTemp 是否过滤临时表 默认值为true
     */
    public Boolean getIgnoreTemp() {
        return this.IgnoreTemp;
    }

    /**
     * Set 是否过滤临时表 默认值为true
     * @param IgnoreTemp 是否过滤临时表 默认值为true
     */
    public void setIgnoreTemp(Boolean IgnoreTemp) {
        this.IgnoreTemp = IgnoreTemp;
    }

    public DescribeColumnLineageRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeColumnLineageRequest(DescribeColumnLineageRequest source) {
        if (source.Direction != null) {
            this.Direction = new String(source.Direction);
        }
        if (source.Data != null) {
            this.Data = new ColumnLineageInfo(source.Data);
        }
        if (source.InputDepth != null) {
            this.InputDepth = new Long(source.InputDepth);
        }
        if (source.OutputDepth != null) {
            this.OutputDepth = new Long(source.OutputDepth);
        }
        if (source.ExtParams != null) {
            this.ExtParams = new RecordField[source.ExtParams.length];
            for (int i = 0; i < source.ExtParams.length; i++) {
                this.ExtParams[i] = new RecordField(source.ExtParams[i]);
            }
        }
        if (source.IgnoreTemp != null) {
            this.IgnoreTemp = new Boolean(source.IgnoreTemp);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamObj(map, prefix + "Data.", this.Data);
        this.setParamSimple(map, prefix + "InputDepth", this.InputDepth);
        this.setParamSimple(map, prefix + "OutputDepth", this.OutputDepth);
        this.setParamArrayObj(map, prefix + "ExtParams.", this.ExtParams);
        this.setParamSimple(map, prefix + "IgnoreTemp", this.IgnoreTemp);

    }
}

