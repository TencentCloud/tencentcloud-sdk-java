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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TemplateListItem extends AbstractModel{

    /**
    * 经验库ID
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * 经验库标题
    */
    @SerializedName("TemplateTitle")
    @Expose
    private String TemplateTitle;

    /**
    * 经验库描述
    */
    @SerializedName("TemplateDescription")
    @Expose
    private String TemplateDescription;

    /**
    * 经验库标签
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TemplateTag")
    @Expose
    private String TemplateTag;

    /**
    * 经验库状态。1 -- 使用中，2 -- 停用
    */
    @SerializedName("TemplateIsUsed")
    @Expose
    private Long TemplateIsUsed;

    /**
    * 经验库创建时间
    */
    @SerializedName("TemplateCreateTime")
    @Expose
    private String TemplateCreateTime;

    /**
    * 经验库更新时间
    */
    @SerializedName("TemplateUpdateTime")
    @Expose
    private String TemplateUpdateTime;

    /**
    * 经验库关联的任务数量
    */
    @SerializedName("TemplateUsedNum")
    @Expose
    private Long TemplateUsedNum;

    /**
     * Get 经验库ID 
     * @return TemplateId 经验库ID
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set 经验库ID
     * @param TemplateId 经验库ID
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get 经验库标题 
     * @return TemplateTitle 经验库标题
     */
    public String getTemplateTitle() {
        return this.TemplateTitle;
    }

    /**
     * Set 经验库标题
     * @param TemplateTitle 经验库标题
     */
    public void setTemplateTitle(String TemplateTitle) {
        this.TemplateTitle = TemplateTitle;
    }

    /**
     * Get 经验库描述 
     * @return TemplateDescription 经验库描述
     */
    public String getTemplateDescription() {
        return this.TemplateDescription;
    }

    /**
     * Set 经验库描述
     * @param TemplateDescription 经验库描述
     */
    public void setTemplateDescription(String TemplateDescription) {
        this.TemplateDescription = TemplateDescription;
    }

    /**
     * Get 经验库标签
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TemplateTag 经验库标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTemplateTag() {
        return this.TemplateTag;
    }

    /**
     * Set 经验库标签
注意：此字段可能返回 null，表示取不到有效值。
     * @param TemplateTag 经验库标签
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTemplateTag(String TemplateTag) {
        this.TemplateTag = TemplateTag;
    }

    /**
     * Get 经验库状态。1 -- 使用中，2 -- 停用 
     * @return TemplateIsUsed 经验库状态。1 -- 使用中，2 -- 停用
     */
    public Long getTemplateIsUsed() {
        return this.TemplateIsUsed;
    }

    /**
     * Set 经验库状态。1 -- 使用中，2 -- 停用
     * @param TemplateIsUsed 经验库状态。1 -- 使用中，2 -- 停用
     */
    public void setTemplateIsUsed(Long TemplateIsUsed) {
        this.TemplateIsUsed = TemplateIsUsed;
    }

    /**
     * Get 经验库创建时间 
     * @return TemplateCreateTime 经验库创建时间
     */
    public String getTemplateCreateTime() {
        return this.TemplateCreateTime;
    }

    /**
     * Set 经验库创建时间
     * @param TemplateCreateTime 经验库创建时间
     */
    public void setTemplateCreateTime(String TemplateCreateTime) {
        this.TemplateCreateTime = TemplateCreateTime;
    }

    /**
     * Get 经验库更新时间 
     * @return TemplateUpdateTime 经验库更新时间
     */
    public String getTemplateUpdateTime() {
        return this.TemplateUpdateTime;
    }

    /**
     * Set 经验库更新时间
     * @param TemplateUpdateTime 经验库更新时间
     */
    public void setTemplateUpdateTime(String TemplateUpdateTime) {
        this.TemplateUpdateTime = TemplateUpdateTime;
    }

    /**
     * Get 经验库关联的任务数量 
     * @return TemplateUsedNum 经验库关联的任务数量
     */
    public Long getTemplateUsedNum() {
        return this.TemplateUsedNum;
    }

    /**
     * Set 经验库关联的任务数量
     * @param TemplateUsedNum 经验库关联的任务数量
     */
    public void setTemplateUsedNum(Long TemplateUsedNum) {
        this.TemplateUsedNum = TemplateUsedNum;
    }

    public TemplateListItem() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public TemplateListItem(TemplateListItem source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TemplateTitle != null) {
            this.TemplateTitle = new String(source.TemplateTitle);
        }
        if (source.TemplateDescription != null) {
            this.TemplateDescription = new String(source.TemplateDescription);
        }
        if (source.TemplateTag != null) {
            this.TemplateTag = new String(source.TemplateTag);
        }
        if (source.TemplateIsUsed != null) {
            this.TemplateIsUsed = new Long(source.TemplateIsUsed);
        }
        if (source.TemplateCreateTime != null) {
            this.TemplateCreateTime = new String(source.TemplateCreateTime);
        }
        if (source.TemplateUpdateTime != null) {
            this.TemplateUpdateTime = new String(source.TemplateUpdateTime);
        }
        if (source.TemplateUsedNum != null) {
            this.TemplateUsedNum = new Long(source.TemplateUsedNum);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamSimple(map, prefix + "TemplateTitle", this.TemplateTitle);
        this.setParamSimple(map, prefix + "TemplateDescription", this.TemplateDescription);
        this.setParamSimple(map, prefix + "TemplateTag", this.TemplateTag);
        this.setParamSimple(map, prefix + "TemplateIsUsed", this.TemplateIsUsed);
        this.setParamSimple(map, prefix + "TemplateCreateTime", this.TemplateCreateTime);
        this.setParamSimple(map, prefix + "TemplateUpdateTime", this.TemplateUpdateTime);
        this.setParamSimple(map, prefix + "TemplateUsedNum", this.TemplateUsedNum);

    }
}

