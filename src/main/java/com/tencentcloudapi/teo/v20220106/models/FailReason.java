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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class FailReason extends AbstractModel{

    /**
    * 失败原因
    */
    @SerializedName("Reason")
    @Expose
    private String Reason;

    /**
    * 处理失败的资源列表。
该列表元素来源于输入参数中的Targets，因此格式和入参中的Targets保持一致
    */
    @SerializedName("Targets")
    @Expose
    private String [] Targets;

    /**
     * Get 失败原因 
     * @return Reason 失败原因
     */
    public String getReason() {
        return this.Reason;
    }

    /**
     * Set 失败原因
     * @param Reason 失败原因
     */
    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    /**
     * Get 处理失败的资源列表。
该列表元素来源于输入参数中的Targets，因此格式和入参中的Targets保持一致 
     * @return Targets 处理失败的资源列表。
该列表元素来源于输入参数中的Targets，因此格式和入参中的Targets保持一致
     */
    public String [] getTargets() {
        return this.Targets;
    }

    /**
     * Set 处理失败的资源列表。
该列表元素来源于输入参数中的Targets，因此格式和入参中的Targets保持一致
     * @param Targets 处理失败的资源列表。
该列表元素来源于输入参数中的Targets，因此格式和入参中的Targets保持一致
     */
    public void setTargets(String [] Targets) {
        this.Targets = Targets;
    }

    public FailReason() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public FailReason(FailReason source) {
        if (source.Reason != null) {
            this.Reason = new String(source.Reason);
        }
        if (source.Targets != null) {
            this.Targets = new String[source.Targets.length];
            for (int i = 0; i < source.Targets.length; i++) {
                this.Targets[i] = new String(source.Targets[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Reason", this.Reason);
        this.setParamArraySimple(map, prefix + "Targets.", this.Targets);

    }
}

