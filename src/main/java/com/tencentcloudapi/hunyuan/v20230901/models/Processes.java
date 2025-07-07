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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Processes extends AbstractModel {

    /**
    * 输出信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * plan:开始获取资料…
recall:找到 n 篇相关资料
quote:引用 n 篇资料作为参考

    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 当状态是recall和quote，会给出来相关数量
    */
    @SerializedName("Num")
    @Expose
    private Long Num;

    /**
     * Get 输出信息 
     * @return Message 输出信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * Set 输出信息
     * @param Message 输出信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * Get plan:开始获取资料…
recall:找到 n 篇相关资料
quote:引用 n 篇资料作为参考
 
     * @return State plan:开始获取资料…
recall:找到 n 篇相关资料
quote:引用 n 篇资料作为参考

     */
    public String getState() {
        return this.State;
    }

    /**
     * Set plan:开始获取资料…
recall:找到 n 篇相关资料
quote:引用 n 篇资料作为参考

     * @param State plan:开始获取资料…
recall:找到 n 篇相关资料
quote:引用 n 篇资料作为参考

     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * Get 当状态是recall和quote，会给出来相关数量 
     * @return Num 当状态是recall和quote，会给出来相关数量
     */
    public Long getNum() {
        return this.Num;
    }

    /**
     * Set 当状态是recall和quote，会给出来相关数量
     * @param Num 当状态是recall和quote，会给出来相关数量
     */
    public void setNum(Long Num) {
        this.Num = Num;
    }

    public Processes() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Processes(Processes source) {
        if (source.Message != null) {
            this.Message = new String(source.Message);
        }
        if (source.State != null) {
            this.State = new String(source.State);
        }
        if (source.Num != null) {
            this.Num = new Long(source.Num);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Num", this.Num);

    }
}

