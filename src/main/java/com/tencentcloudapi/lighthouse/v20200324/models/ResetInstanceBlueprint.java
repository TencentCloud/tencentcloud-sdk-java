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
package com.tencentcloudapi.lighthouse.v20200324.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ResetInstanceBlueprint extends AbstractModel{

    /**
    * 镜像详细信息
    */
    @SerializedName("BlueprintInfo")
    @Expose
    private Blueprint BlueprintInfo;

    /**
    * 实例镜像是否可重置为目标镜像
    */
    @SerializedName("IsResettable")
    @Expose
    private Boolean IsResettable;

    /**
    * 不可重置信息.当镜像可重置时为""
    */
    @SerializedName("NonResettableMessage")
    @Expose
    private String NonResettableMessage;

    /**
     * Get 镜像详细信息 
     * @return BlueprintInfo 镜像详细信息
     */
    public Blueprint getBlueprintInfo() {
        return this.BlueprintInfo;
    }

    /**
     * Set 镜像详细信息
     * @param BlueprintInfo 镜像详细信息
     */
    public void setBlueprintInfo(Blueprint BlueprintInfo) {
        this.BlueprintInfo = BlueprintInfo;
    }

    /**
     * Get 实例镜像是否可重置为目标镜像 
     * @return IsResettable 实例镜像是否可重置为目标镜像
     */
    public Boolean getIsResettable() {
        return this.IsResettable;
    }

    /**
     * Set 实例镜像是否可重置为目标镜像
     * @param IsResettable 实例镜像是否可重置为目标镜像
     */
    public void setIsResettable(Boolean IsResettable) {
        this.IsResettable = IsResettable;
    }

    /**
     * Get 不可重置信息.当镜像可重置时为"" 
     * @return NonResettableMessage 不可重置信息.当镜像可重置时为""
     */
    public String getNonResettableMessage() {
        return this.NonResettableMessage;
    }

    /**
     * Set 不可重置信息.当镜像可重置时为""
     * @param NonResettableMessage 不可重置信息.当镜像可重置时为""
     */
    public void setNonResettableMessage(String NonResettableMessage) {
        this.NonResettableMessage = NonResettableMessage;
    }

    public ResetInstanceBlueprint() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ResetInstanceBlueprint(ResetInstanceBlueprint source) {
        if (source.BlueprintInfo != null) {
            this.BlueprintInfo = new Blueprint(source.BlueprintInfo);
        }
        if (source.IsResettable != null) {
            this.IsResettable = new Boolean(source.IsResettable);
        }
        if (source.NonResettableMessage != null) {
            this.NonResettableMessage = new String(source.NonResettableMessage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "BlueprintInfo.", this.BlueprintInfo);
        this.setParamSimple(map, prefix + "IsResettable", this.IsResettable);
        this.setParamSimple(map, prefix + "NonResettableMessage", this.NonResettableMessage);

    }
}

