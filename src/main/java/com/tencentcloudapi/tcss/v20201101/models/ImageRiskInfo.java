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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImageRiskInfo extends AbstractModel{

    /**
    * 行为
    */
    @SerializedName("Behavior")
    @Expose
    private Long Behavior;

    /**
    * 类型
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * 级别
    */
    @SerializedName("Level")
    @Expose
    private Long Level;

    /**
    * 详情
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 解决方案
    */
    @SerializedName("InstructionContent")
    @Expose
    private String InstructionContent;

    /**
     * Get 行为 
     * @return Behavior 行为
     */
    public Long getBehavior() {
        return this.Behavior;
    }

    /**
     * Set 行为
     * @param Behavior 行为
     */
    public void setBehavior(Long Behavior) {
        this.Behavior = Behavior;
    }

    /**
     * Get 类型 
     * @return Type 类型
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 类型
     * @param Type 类型
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get 级别 
     * @return Level 级别
     */
    public Long getLevel() {
        return this.Level;
    }

    /**
     * Set 级别
     * @param Level 级别
     */
    public void setLevel(Long Level) {
        this.Level = Level;
    }

    /**
     * Get 详情 
     * @return Desc 详情
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * Set 详情
     * @param Desc 详情
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * Get 解决方案 
     * @return InstructionContent 解决方案
     */
    public String getInstructionContent() {
        return this.InstructionContent;
    }

    /**
     * Set 解决方案
     * @param InstructionContent 解决方案
     */
    public void setInstructionContent(String InstructionContent) {
        this.InstructionContent = InstructionContent;
    }

    public ImageRiskInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ImageRiskInfo(ImageRiskInfo source) {
        if (source.Behavior != null) {
            this.Behavior = new Long(source.Behavior);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.Level != null) {
            this.Level = new Long(source.Level);
        }
        if (source.Desc != null) {
            this.Desc = new String(source.Desc);
        }
        if (source.InstructionContent != null) {
            this.InstructionContent = new String(source.InstructionContent);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Behavior", this.Behavior);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "InstructionContent", this.InstructionContent);

    }
}

