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
package com.tencentcloudapi.dataagent.v20250513.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ExampleQA extends AbstractModel {

    /**
    * 示例记录的唯一业务 ID
    */
    @SerializedName("ExampleId")
    @Expose
    private String ExampleId;

    /**
    * 问题列表
    */
    @SerializedName("Questions")
    @Expose
    private String [] Questions;

    /**
    * 对应的标准答案或回复
    */
    @SerializedName("Answer")
    @Expose
    private String Answer;

    /**
    * 内容类型，类型包含 'text', 'sql', 'code' 
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 记录的创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 记录的最后更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
     * Get 示例记录的唯一业务 ID 
     * @return ExampleId 示例记录的唯一业务 ID
     */
    public String getExampleId() {
        return this.ExampleId;
    }

    /**
     * Set 示例记录的唯一业务 ID
     * @param ExampleId 示例记录的唯一业务 ID
     */
    public void setExampleId(String ExampleId) {
        this.ExampleId = ExampleId;
    }

    /**
     * Get 问题列表 
     * @return Questions 问题列表
     */
    public String [] getQuestions() {
        return this.Questions;
    }

    /**
     * Set 问题列表
     * @param Questions 问题列表
     */
    public void setQuestions(String [] Questions) {
        this.Questions = Questions;
    }

    /**
     * Get 对应的标准答案或回复 
     * @return Answer 对应的标准答案或回复
     */
    public String getAnswer() {
        return this.Answer;
    }

    /**
     * Set 对应的标准答案或回复
     * @param Answer 对应的标准答案或回复
     */
    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    /**
     * Get 内容类型，类型包含 'text', 'sql', 'code'  
     * @return Type 内容类型，类型包含 'text', 'sql', 'code' 
     */
    public String getType() {
        return this.Type;
    }

    /**
     * Set 内容类型，类型包含 'text', 'sql', 'code' 
     * @param Type 内容类型，类型包含 'text', 'sql', 'code' 
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * Get 记录的创建时间 
     * @return CreateTime 记录的创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * Set 记录的创建时间
     * @param CreateTime 记录的创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * Get 记录的最后更新时间 
     * @return UpdateTime 记录的最后更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * Set 记录的最后更新时间
     * @param UpdateTime 记录的最后更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    public ExampleQA() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ExampleQA(ExampleQA source) {
        if (source.ExampleId != null) {
            this.ExampleId = new String(source.ExampleId);
        }
        if (source.Questions != null) {
            this.Questions = new String[source.Questions.length];
            for (int i = 0; i < source.Questions.length; i++) {
                this.Questions[i] = new String(source.Questions[i]);
            }
        }
        if (source.Answer != null) {
            this.Answer = new String(source.Answer);
        }
        if (source.Type != null) {
            this.Type = new String(source.Type);
        }
        if (source.CreateTime != null) {
            this.CreateTime = new String(source.CreateTime);
        }
        if (source.UpdateTime != null) {
            this.UpdateTime = new String(source.UpdateTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ExampleId", this.ExampleId);
        this.setParamArraySimple(map, prefix + "Questions.", this.Questions);
        this.setParamSimple(map, prefix + "Answer", this.Answer);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);

    }
}

