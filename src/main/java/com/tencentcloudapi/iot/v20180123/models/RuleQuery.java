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

public class RuleQuery  extends AbstractModel{

    /**
    * 字段
    */
    @SerializedName("Field")
    @Expose
    private String Field;

    /**
    * 过滤规则
    */
    @SerializedName("Condition")
    @Expose
    private String Condition;

    /**
    * Topic
    */
    @SerializedName("Topic")
    @Expose
    private String Topic;

    /**
    * 产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
     * 获取字段
     * @return Field 字段
     */
    public String getField() {
        return this.Field;
    }

    /**
     * 设置字段
     * @param Field 字段
     */
    public void setField(String Field) {
        this.Field = Field;
    }

    /**
     * 获取过滤规则
     * @return Condition 过滤规则
     */
    public String getCondition() {
        return this.Condition;
    }

    /**
     * 设置过滤规则
     * @param Condition 过滤规则
     */
    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    /**
     * 获取Topic
     * @return Topic Topic
     */
    public String getTopic() {
        return this.Topic;
    }

    /**
     * 设置Topic
     * @param Topic Topic
     */
    public void setTopic(String Topic) {
        this.Topic = Topic;
    }

    /**
     * 获取产品Id
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品Id
     * @param ProductId 产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Field", this.Field);
        this.setParamSimple(map, prefix + "Condition", this.Condition);
        this.setParamSimple(map, prefix + "Topic", this.Topic);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);

    }
}

