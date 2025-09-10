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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InvokeLLM extends AbstractModel {

    /**
    * 请求LLM的内容
    */
    @SerializedName("Content")
    @Expose
    private String Content;

    /**
    * 是否允许该文本打断机器人说话
    */
    @SerializedName("Interrupt")
    @Expose
    private Boolean Interrupt;

    /**
     * Get 请求LLM的内容 
     * @return Content 请求LLM的内容
     */
    public String getContent() {
        return this.Content;
    }

    /**
     * Set 请求LLM的内容
     * @param Content 请求LLM的内容
     */
    public void setContent(String Content) {
        this.Content = Content;
    }

    /**
     * Get 是否允许该文本打断机器人说话 
     * @return Interrupt 是否允许该文本打断机器人说话
     */
    public Boolean getInterrupt() {
        return this.Interrupt;
    }

    /**
     * Set 是否允许该文本打断机器人说话
     * @param Interrupt 是否允许该文本打断机器人说话
     */
    public void setInterrupt(Boolean Interrupt) {
        this.Interrupt = Interrupt;
    }

    public InvokeLLM() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public InvokeLLM(InvokeLLM source) {
        if (source.Content != null) {
            this.Content = new String(source.Content);
        }
        if (source.Interrupt != null) {
            this.Interrupt = new Boolean(source.Interrupt);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Content", this.Content);
        this.setParamSimple(map, prefix + "Interrupt", this.Interrupt);

    }
}

